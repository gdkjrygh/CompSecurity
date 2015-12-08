// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.soundcloud.android.Consts;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.record.filter.FadeFilter;
import com.soundcloud.android.playback.AudioFocusManager;
import com.soundcloud.android.playback.IAudioManager;
import com.soundcloud.android.utils.BufferUtils;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordAppWidgetProvider, AudioConfig, ScAudioTrack, RecordStream, 
//            PlaybackStream, SoundRecorderService, RecordingStorage, RemainingTimeCalculator, 
//            TrimPreview

public class SoundRecorder
    implements com.soundcloud.android.playback.IAudioManager.MusicFocusable
{
    private class PlayerThread extends Thread
    {

        private final Queue previewQueue;
        final SoundRecorder this$0;

        private void onWriteError(int i)
        {
            String s = SoundRecorder.TAG;
            StringBuilder stringbuilder = new StringBuilder("AudioTrack#write() returned ");
            if (i == -3)
            {
                s = "ERROR_INVALID_OPERATION";
            } else
            if (i == -2)
            {
                s = "ERROR_BAD_VALUE";
            } else
            {
                s = (new StringBuilder("error ")).append(i).toString();
            }
            stringbuilder.append(s);
            state = State.ERROR;
        }

        private void playLoop(PlaybackStream playbackstream)
            throws IOException
        {
            audioTrack.setPlaybackRate(audioConfig.sampleRate);
            playbackstream.initializePlayback();
            state = State.PLAYING;
            broadcast("com.soundcloud.android.playbackstarted");
            for (; !isInterrupted() && state == State.PLAYING; playBuffer.clear())
            {
                int i = playbackstream.readForPlayback(playBuffer, playBufferReadSize);
                if (i < 0)
                {
                    break;
                }
                i = audioTrack.write(playBuffer, i);
                if (i < 0)
                {
                    onWriteError(i);
                }
            }

        }

        private void playTrimPreviews(PlaybackStream playbackstream)
            throws IOException
        {
            do
            {
                TrimPreview trimpreview = (TrimPreview)previewQueue.poll();
                if (trimpreview != null)
                {
                    FadeFilter fadefilter = trimpreview.getFadeFilter();
                    int l = (int)trimpreview.getByteRange(audioConfig);
                    playbackstream.initializePlayback(trimpreview.lowPos(audioConfig));
                    byte abyte0[] = new byte[l];
                    int i = 0;
                    do
                    {
                        if (i >= l)
                        {
                            break;
                        }
                        int i1 = playbackstream.read(playBuffer, Math.min(playBufferReadSize, l - i));
                        if (i1 <= 0)
                        {
                            break;
                        }
                        int k1 = Math.min(i1, l - i);
                        fadefilter.apply(playBuffer, i, l);
                        playBuffer.get(abyte0, i, k1);
                        playBuffer.clear();
                        i += i1;
                    } while (true);
                    audioTrack.setPlaybackRate(trimpreview.playbackRate);
                    if (trimpreview.isReverse())
                    {
                        for (int j = l / audioConfig.sampleSize - 1; j >= 0; j--)
                        {
                            l = audioTrack.write(abyte0, audioConfig.sampleSize * j, audioConfig.sampleSize);
                            if (l < 0)
                            {
                                onWriteError(l);
                            }
                        }

                    } else
                    {
                        for (int k = 0; k < l / audioConfig.sampleSize; k++)
                        {
                            int j1 = audioTrack.write(abyte0, audioConfig.sampleSize * k, audioConfig.sampleSize);
                            if (j1 < 0)
                            {
                                onWriteError(j1);
                            }
                        }

                    }
                    playBuffer.clear();
                } else
                {
                    return;
                }
            } while (true);
        }

        public void addPreview(TrimPreview trimpreview)
        {
            previewQueue.add(trimpreview);
            trimpreview = previewQueue.iterator();
            long l = 0L;
            long l1;
            do
            {
                l1 = l;
                if (!trimpreview.hasNext())
                {
                    break;
                }
                l = ((TrimPreview)trimpreview.next()).duration + l;
            } while (true);
            for (; l1 > TrimPreview.MAX_PREVIEW_DURATION && previewQueue.size() > 1; l1 -= ((TrimPreview)previewQueue.poll()).duration) { }
        }

        public void run()
        {
label0:
            {
                synchronized (audioRecord)
                {
                    if (audioFocusManager.requestMusicFocus(SoundRecorder.this, 1))
                    {
                        break label0;
                    }
                    String s = SoundRecorder.TAG;
                    broadcast("com.soundcloud.android.playbackerror");
                }
                return;
            }
            audioTrack.play();
_L5:
            _cls3..SwitchMap.com.soundcloud.android.creators.record.SoundRecorder.State[state.ordinal()];
            JVM INSTR tableswitch 1 2: default 476
        //                       1 318
        //                       2 375;
               goto _L1 _L2 _L3
_L1:
            if (playbackStream != null)
            {
                playLoop(playbackStream);
            }
_L12:
            if (!isInterrupted() && state == State.SEEKING || state == State.TRIMMING && !previewQueue.isEmpty()) goto _L5; else goto _L4
_L4:
            if (state == State.TRIMMING)
            {
                state = State.IDLE;
            }
            audioTrack.stop();
            audioFocusManager.abandonMusicFocus(false);
_L13:
            if (this != playbackThread || playbackStream == null) goto _L7; else goto _L6
_L6:
            if (state == State.IDLE) goto _L9; else goto _L8
_L8:
            if (state != State.PLAYING || !playbackStream.isFinished()) goto _L11; else goto _L10
_L10:
            playbackStream.resetPlayback();
            broadcast("com.soundcloud.android.playbackcomplete");
_L15:
            if (state != State.RECORDING)
            {
                state = State.IDLE;
            }
_L9:
            audiorecord;
            JVM INSTR monitorexit ;
            return;
            exception;
            audiorecord;
            JVM INSTR monitorexit ;
            throw exception;
_L2:
            playTrimPreviews(playbackStream);
              goto _L12
            Object obj;
            obj;
            String s1 = SoundRecorder.TAG;
            state = State.ERROR;
            audioTrack.stop();
            audioFocusManager.abandonMusicFocus(false);
              goto _L13
_L3:
            if (playbackStream == null) goto _L12; else goto _L14
_L14:
            playbackStream.setCurrentPosition(seekToPos);
            seekToPos = -1L;
              goto _L1
            s1;
            audioTrack.stop();
            audioFocusManager.abandonMusicFocus(false);
            throw s1;
_L11:
            if (state == State.STOPPING)
            {
                broadcast("com.soundcloud.android.playbackstopped");
            }
              goto _L15
_L7:
            String s2 = SoundRecorder.TAG;
              goto _L9
        }

        PlayerThread()
        {
            this$0 = SoundRecorder.this;
            super("PlayerThread");
            previewQueue = new ConcurrentLinkedQueue();
            setPriority(10);
        }

        PlayerThread(TrimPreview trimpreview)
        {
            this();
            previewQueue.add(trimpreview);
        }

        private class _cls3
        {

            static final int $SwitchMap$com$soundcloud$android$creators$record$SoundRecorder$State[];

            static 
            {
                $SwitchMap$com$soundcloud$android$creators$record$SoundRecorder$State = new int[State.values().length];
                try
                {
                    $SwitchMap$com$soundcloud$android$creators$record$SoundRecorder$State[State.TRIMMING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$soundcloud$android$creators$record$SoundRecorder$State[State.SEEKING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }

    class ReaderThread extends Thread
    {

        final SoundRecorder this$0;

        public void run()
        {
label0:
            {
                obj = null;
                synchronized (audioRecord)
                {
                    String s = SoundRecorder.TAG;
                    (new StringBuilder("starting reader thread: state=")).append(state);
                    if (audioRecord.getState() == 1)
                    {
                        break label0;
                    }
                    obj = SoundRecorder.TAG;
                    state = State.ERROR;
                    broadcast("com.soundcloud.android.recorderror");
                }
                return;
            }
            audioRecord.startRecording();
            audioRecord.setPositionNotificationPeriod(audioConfig.sampleRate);
_L1:
            int i;
            if (state != State.READING && state != State.RECORDING)
            {
                break MISSING_BLOCK_LABEL_372;
            }
            recBuffer.rewind();
            i = audioRecord.read(recBuffer, recBufferReadSize);
            if (i >= 0)
            {
                break MISSING_BLOCK_LABEL_199;
            }
            String s1 = SoundRecorder.TAG;
            state = State.ERROR;
              goto _L1
            obj;
            audiorecord;
            JVM INSTR monitorexit ;
            throw obj;
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_211;
            }
            Object obj1 = SoundRecorder.TAG;
              goto _L1
label1:
            {
                if (state != State.RECORDING || remainingTime > 0L)
                {
                    break label1;
                }
                obj1 = SoundRecorder.TAG;
                state = State.STOPPING;
            }
              goto _L1
            int j;
            recBuffer.limit(i);
            j = recordStream.write(recBuffer, i);
            if (j < 0 || j >= i)
            {
                break MISSING_BLOCK_LABEL_304;
            }
            obj1 = SoundRecorder.TAG;
            obj1 = (new Intent("com.soundcloud.android.recordsample")).putExtra("amplitude", recordStream.getLastAmplitude()).putExtra("elapsedTime", getRecordingElapsedTime());
            broadcastManager.sendBroadcast(((Intent) (obj1)));
              goto _L1
            IOException ioexception;
            ioexception;
            ioexception = SoundRecorder.TAG;
            state = State.ERROR;
            ioexception = SoundRecorder.TAG;
            (new StringBuilder("exiting reader loop, stopping recording (state=")).append(state).append(")");
            audioRecord.stop();
            if (recording == null) goto _L3; else goto _L2
_L2:
            obj = state;
            ioexception = State.ERROR;
            if (obj == ioexception) goto _L5; else goto _L4
_L4:
            recordStream.finalizeStream(recording.getAmplitudeFile());
            if (playbackStream != null) goto _L7; else goto _L6
_L6:
            playbackStream = new PlaybackStream(recordStream.getAudioReader());
_L8:
            saveState();
            obj = "com.soundcloud.android.recordfinished";
_L3:
            state = State.IDLE;
            readerThread = null;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                broadcast(((String) (obj)));
            }
            audiorecord;
            JVM INSTR monitorexit ;
            return;
_L7:
            playbackStream.reopen();
            playbackStream.resetBounds();
              goto _L8
            obj;
            state = State.ERROR;
            obj = "com.soundcloud.android.recorderror";
            ioexception = SoundRecorder.TAG;
              goto _L3
_L5:
            playbackStream = null;
            obj = "com.soundcloud.android.recorderror";
              goto _L3
        }

        ReaderThread()
        {
            this$0 = SoundRecorder.this;
            super("ReaderThread");
            setPriority(10);
        }
    }

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final EnumSet ACTIVE;
        public static final State ERROR;
        public static final State IDLE;
        public static final EnumSet PLAYBACK;
        public static final State PLAYING;
        public static final State READING;
        public static final State RECORDING;
        public static final State SEEKING;
        public static final State STOPPING;
        public static final State TRIMMING;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/soundcloud/android/creators/record/SoundRecorder$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        public final boolean isActive()
        {
            return ACTIVE.contains(this);
        }

        public final boolean isPlaying()
        {
            return PLAYBACK.contains(this);
        }

        public final boolean isRecording()
        {
            return this == RECORDING;
        }

        public final boolean isTrimming()
        {
            return this == TRIMMING;
        }

        static 
        {
            IDLE = new State("IDLE", 0);
            READING = new State("READING", 1);
            RECORDING = new State("RECORDING", 2);
            ERROR = new State("ERROR", 3);
            STOPPING = new State("STOPPING", 4);
            PLAYING = new State("PLAYING", 5);
            SEEKING = new State("SEEKING", 6);
            TRIMMING = new State("TRIMMING", 7);
            $VALUES = (new State[] {
                IDLE, READING, RECORDING, ERROR, STOPPING, PLAYING, SEEKING, TRIMMING
            });
            ACTIVE = EnumSet.of(RECORDING, PLAYING, SEEKING, TRIMMING);
            PLAYBACK = EnumSet.of(PLAYING, SEEKING);
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    static final boolean $assertionsDisabled;
    public static final String ALL_ACTIONS[] = {
        "com.soundcloud.android.notificationState", "com.soundcloud.android.recordstarted", "com.soundcloud.android.recorderror", "com.soundcloud.android.recordsample", "com.soundcloud.android.recordprogress", "com.soundcloud.android.recordfinished", "com.soundcloud.android.playbackstarted", "com.soundcloud.android.playbackstopped", "com.soundcloud.android.playbackcomplete", "com.soundcloud.android.playbackprogress", 
        "com.soundcloud.android.playbackprogress"
    };
    private static float EMPTY_TRIM_WINDOW[] = {
        0.0F, 1.0F
    };
    public static final String EXTRA_AMPLITUDE = "amplitude";
    public static final String EXTRA_DURATION = "duration";
    public static final String EXTRA_ELAPSEDTIME = "elapsedTime";
    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_RECORDING = "recording";
    public static final String EXTRA_SHOULD_NOTIFY = "shouldUseNotifications";
    public static final String EXTRA_STATE = "state";
    public static final String EXTRA_TIME_REMAINING = "time_remaining";
    public static final int MAX_PLAYBACK_RATE = AudioTrack.getNativeOutputSampleRate(1);
    public static final int MAX_PLAYBACK_READ_SIZE = 1024;
    public static final String NOTIFICATION_STATE = "com.soundcloud.android.notificationState";
    public static final int PIXELS_PER_SECOND;
    public static final String PLAYBACK_COMPLETE = "com.soundcloud.android.playbackcomplete";
    public static final String PLAYBACK_ERROR = "com.soundcloud.android.playbackerror";
    public static final String PLAYBACK_PROGRESS = "com.soundcloud.android.playbackprogress";
    public static final String PLAYBACK_STARTED = "com.soundcloud.android.playbackstarted";
    public static final String PLAYBACK_STOPPED = "com.soundcloud.android.playbackstopped";
    public static final File RECORD_DIR;
    public static final String RECORD_ERROR = "com.soundcloud.android.recorderror";
    public static final String RECORD_FINISHED = "com.soundcloud.android.recordfinished";
    public static final String RECORD_PROGRESS = "com.soundcloud.android.recordprogress";
    public static final String RECORD_SAMPLE = "com.soundcloud.android.recordsample";
    public static final String RECORD_STARTED = "com.soundcloud.android.recordstarted";
    static final String TAG = com/soundcloud/android/creators/record/SoundRecorder.getSimpleName();
    public static final File UPLOAD_DIR;
    private static SoundRecorder instance;
    private final RecordAppWidgetProvider appWidgetProvider = RecordAppWidgetProvider.getInstance();
    private final AudioConfig audioConfig;
    private final IAudioManager audioFocusManager;
    private final AudioRecord audioRecord;
    private final ScAudioTrack audioTrack;
    private final LocalBroadcastManager broadcastManager;
    private final Context context;
    private final ByteBuffer playBuffer;
    private final int playBufferReadSize;
    private PlaybackStream playbackStream;
    private PlayerThread playbackThread;
    ReaderThread readerThread;
    private final ByteBuffer recBuffer;
    private final int recBufferReadSize;
    private RecordStream recordStream;
    private Recording recording;
    private long remainingTime;
    private final RemainingTimeCalculator remainingTimeCalculator;
    private long seekToPos;
    private boolean shouldUseNotifications;
    private volatile State state;
    private final int valuesPerSecond;

    protected SoundRecorder(Context context1, AudioConfig audioconfig)
    {
        shouldUseNotifications = true;
        seekToPos = -1L;
        remainingTime = -1L;
        context = context1;
        audioConfig = audioconfig;
        state = State.IDLE;
        audioRecord = audioconfig.createAudioRecord();
        audioRecord.setRecordPositionUpdateListener(new _cls1());
        int i = audioconfig.getPlaybackMinBufferSize();
        audioTrack = audioconfig.createAudioTrack(i);
        audioTrack.setPlaybackPositionUpdateListener(new _cls2());
        audioTrack.setPositionNotificationPeriod(audioConfig.sampleRate / 60);
        broadcastManager = LocalBroadcastManager.getInstance(context1);
        remainingTimeCalculator = audioconfig.createCalculator();
        valuesPerSecond = (int)((float)PIXELS_PER_SECOND * context1.getResources().getDisplayMetrics().density);
        recBufferReadSize = (int)audioconfig.validBytePosition(audioConfig.bytesPerSecond / valuesPerSecond);
        recBuffer = BufferUtils.allocateAudioBuffer(recBufferReadSize);
        if (i >= 1024)
        {
            i = 1024;
        }
        playBufferReadSize = i;
        playBuffer = BufferUtils.allocateAudioBuffer(playBufferReadSize);
        audioFocusManager = new AudioFocusManager(context1);
        recordStream = new RecordStream(audioConfig);
        reset();
    }

    private void broadcast(String s)
    {
        s = (new Intent(s)).putExtra("shouldUseNotifications", shouldUseNotifications).putExtra("position", getCurrentPlaybackPosition()).putExtra("duration", getPlaybackDuration()).putExtra("state", state.name()).putExtra("time_remaining", remainingTime).putExtra("recording", recording);
        broadcastManager.sendBroadcast(s);
        appWidgetProvider.notifyChange(context, s);
    }

    public static SoundRecorder getInstance(Context context1)
    {
        com/soundcloud/android/creators/record/SoundRecorder;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new SoundRecorder(context1.getApplicationContext(), AudioConfig.detect());
        }
        context1 = instance;
        com/soundcloud/android/creators/record/SoundRecorder;
        JVM INSTR monitorexit ;
        return context1;
        context1;
        throw context1;
    }

    public static IntentFilter getIntentFilter()
    {
        IntentFilter intentfilter = new IntentFilter();
        String as[] = ALL_ACTIONS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            intentfilter.addAction(as[i]);
        }

        return intentfilter;
    }

    public static boolean hasFPUSupport()
    {
        return !"armeabi".equals(Build.CPU_ABI);
    }

    private void previewTrim(TrimPreview trimpreview)
    {
        boolean flag;
        if (!isPlaying() && !state.isTrimming())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            state = State.TRIMMING;
            startPlaybackThread(trimpreview);
            return;
        }
        playbackThread.addPreview(trimpreview);
        if (isPlaying())
        {
            broadcast("com.soundcloud.android.playbackstopped");
        }
        state = State.TRIMMING;
    }

    private void release()
    {
        if (audioRecord != null)
        {
            audioRecord.release();
        }
        audioTrack.release();
    }

    private void sendPlaybackProgress()
    {
        broadcastManager.sendBroadcast((new Intent("com.soundcloud.android.playbackprogress")).putExtra("position", getCurrentPlaybackPosition()).putExtra("duration", getPlaybackDuration()));
    }

    private void startPlaybackThread()
    {
        playbackThread = new PlayerThread();
        playbackThread.start();
    }

    private void startPlaybackThread(TrimPreview trimpreview)
    {
        playbackThread = new PlayerThread(trimpreview);
        playbackThread.start();
    }

    private State startReadingInternal(State state1)
    {
        (new StringBuilder("startReading(")).append(state1).append(")");
        state = state1;
        if (readerThread == null)
        {
            readerThread = new ReaderThread();
            readerThread.start();
        }
        return state;
    }

    public void focusGained()
    {
    }

    public void focusLost(boolean flag, boolean flag1)
    {
        (new StringBuilder("Focus Lost ")).append(flag).append(" and ").append(flag1);
        if (!flag1 && isActive())
        {
            gotoIdleState();
        }
    }

    public long getCurrentPlaybackPosition()
    {
        long l = -1L;
        if (seekToPos != -1L)
        {
            l = seekToPos;
        } else
        if (playbackStream != null)
        {
            return playbackStream.getPosition();
        }
        return l;
    }

    public long getPlaybackDuration()
    {
        if (playbackStream == null)
        {
            return -1L;
        } else
        {
            return playbackStream.getDuration();
        }
    }

    public RecordStream getRecordStream()
    {
        return recordStream;
    }

    public Recording getRecording()
    {
        return recording;
    }

    public long getRecordingElapsedTime()
    {
        return recordStream.getDuration();
    }

    public float[] getTrimWindow()
    {
        if (playbackStream == null)
        {
            return EMPTY_TRIM_WINDOW;
        } else
        {
            return playbackStream.getTrimWindow();
        }
    }

    public void gotoIdleState()
    {
        if (isRecording())
        {
            stopRecording();
        } else
        if (isPlaying())
        {
            stopPlayback();
            return;
        }
    }

    public boolean isActive()
    {
        return state.isActive();
    }

    public boolean isFading()
    {
        return playbackStream != null && playbackStream.isFading();
    }

    public boolean isPlaying()
    {
        return state.isPlaying();
    }

    public boolean isRecording()
    {
        return state.isRecording();
    }

    public void onDestroy()
    {
        stopPlayback();
        stopRecording();
        release();
    }

    public void onNewEndPosition(float f, long l)
    {
        if (playbackStream != null)
        {
            previewTrim(playbackStream.setEndPositionByPercent(f, l));
        }
    }

    public void onNewStartPosition(float f, long l)
    {
        if (playbackStream != null)
        {
            previewTrim(playbackStream.setStartPositionByPercent(f, l));
        }
    }

    public void play()
    {
        if (!isPlaying())
        {
            context.startService((new Intent(context, com/soundcloud/android/creators/record/SoundRecorderService)).setAction("com.soundcloud.android.playbackstarted"));
            seekToPos = -1L;
            startPlaybackThread();
        }
    }

    public void reset()
    {
        reset(false);
    }

    public void reset(boolean flag)
    {
        if (isRecording())
        {
            stopRecording();
        }
        if (isPlaying())
        {
            stopPlayback();
        }
        State state1;
        if (audioRecord.getState() != 1)
        {
            state1 = State.ERROR;
        } else
        {
            state1 = State.IDLE;
        }
        state = state1;
        recordStream.reset();
        if (playbackStream != null)
        {
            playbackStream.close();
            playbackStream = null;
        }
        if (recording != null)
        {
            if (flag)
            {
                RecordingStorage.delete(recording);
            }
            recording = null;
        }
    }

    public void revertFile()
    {
        if (playbackStream != null)
        {
            playbackStream.reset();
        }
    }

    public Recording saveState()
    {
        if (recording != null)
        {
            if (shouldEncodeWhileRecording())
            {
                long l = Recording.trimWaveFiles(RECORD_DIR, recording);
                if (l > 0L)
                {
                    (new StringBuilder("Trimmed ")).append(l).append(" bytes of wav data");
                }
            }
            recording.setPlaybackStream(playbackStream);
            return recording;
        } else
        {
            return null;
        }
    }

    public void seekTo(float f)
    {
        long l1;
label0:
        {
            if (playbackStream != null)
            {
                long l = (long)((float)getPlaybackDuration() * f);
                l1 = playbackStream.getStartPos() + l;
                if (!isPlaying() && !state.isTrimming() || l < 0L)
                {
                    break label0;
                }
                seekToPos = l1;
                state = State.SEEKING;
            }
            return;
        }
        playbackStream.setCurrentPosition(l1);
        sendPlaybackProgress();
    }

    public void setRecording(Recording recording1)
    {
        if (recording == null)
        {
            if (isActive())
            {
                reset();
            }
            recording = recording1;
            AudioConfig audioconfig = audioConfig;
            File file1 = recording1.getRawFile();
            File file;
            if (shouldEncodeWhileRecording())
            {
                file = recording1.getEncodedFile();
            } else
            {
                file = null;
            }
            recordStream = new RecordStream(audioconfig, file1, file, recording.getAmplitudeFile());
            playbackStream = recording1.getPlaybackStream();
        }
    }

    public boolean shouldEncodeWhileRecording()
    {
        return hasFPUSupport() && !"raw".equals(PreferenceManager.getDefaultSharedPreferences(context).getString("dev.defaultRecordingType", null));
    }

    public void shouldUseNotifications(boolean flag)
    {
        if (shouldUseNotifications != flag)
        {
            shouldUseNotifications = flag;
            broadcast("com.soundcloud.android.notificationState");
        }
    }

    public State startReading()
    {
        if (state == State.IDLE)
        {
            startReadingInternal(State.READING);
        }
        return state;
    }

    public Recording startRecording()
        throws IOException
    {
        if (!IOUtils.isSDCardAvailable())
        {
            throw new IOException(context.getString(0x7f0701bc));
        }
        if (!remainingTimeCalculator.isDiskSpaceAvailable())
        {
            throw new IOException(context.getString(0x7f0701bf));
        }
        remainingTimeCalculator.reset();
        if (state == State.RECORDING)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        if (recording != null) goto _L2; else goto _L1
_L1:
        recording = Recording.create();
        RecordStream recordstream = recordStream;
        File file1 = recording.getRawFile();
        File file;
        if (shouldEncodeWhileRecording())
        {
            file = recording.getEncodedFile();
        } else
        {
            file = null;
        }
        recordstream.setWriters(file1, file);
_L4:
        if (shouldEncodeWhileRecording())
        {
            remainingTimeCalculator.setEncodedFile(recording.getEncodedFile());
        }
        remainingTime = remainingTimeCalculator.timeRemaining();
        context.startService((new Intent(context, com/soundcloud/android/creators/record/SoundRecorderService)).setAction("com.soundcloud.android.recordstarted"));
        startReadingInternal(State.RECORDING);
        broadcast("com.soundcloud.android.recordstarted");
        IOException ioexception;
        if (!$assertionsDisabled && recording == null)
        {
            throw new AssertionError();
        } else
        {
            return recording;
        }
_L2:
        if (playbackStream == null) goto _L4; else goto _L3
_L3:
        if (playbackStream.getTrimRight() <= 0L) goto _L4; else goto _L5
_L5:
        recordStream.truncate(playbackStream.getEndPos(), valuesPerSecond);
        playbackStream.setTrim(playbackStream.getStartPos(), playbackStream.getTotalDuration());
        playbackStream.reopen();
          goto _L4
        ioexception;
          goto _L4
        throw new IllegalStateException((new StringBuilder("cannot record to file, in state ")).append(state).toString());
    }

    public void stopPlayback()
    {
        if (state == State.PLAYING || state == State.SEEKING)
        {
            state = State.STOPPING;
        }
    }

    public void stopReading()
    {
        if (state == State.READING)
        {
            state = State.STOPPING;
        }
    }

    public void stopRecording()
    {
        if (state == State.RECORDING || state == State.READING)
        {
            state = State.STOPPING;
        }
    }

    public boolean toggleFade()
    {
        boolean flag = false;
        boolean flag1 = false;
        if (playbackStream != null)
        {
            flag = flag1;
            if (!playbackStream.isFading())
            {
                flag = true;
            }
            playbackStream.setFading(flag);
        }
        return flag;
    }

    public void togglePlayback()
    {
        if (isPlaying())
        {
            stopPlayback();
            return;
        } else
        {
            play();
            return;
        }
    }

    static 
    {
        int i;
        boolean flag;
        if (!com/soundcloud/android/creators/record/SoundRecorder.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        if (hasFPUSupport())
        {
            i = 30;
        } else
        {
            i = 15;
        }
        PIXELS_PER_SECOND = i;
        RECORD_DIR = IOUtils.ensureUpdatedDirectory(new File(Consts.EXTERNAL_STORAGE_DIRECTORY, "recordings"), new File(Consts.EXTERNAL_STORAGE_DIRECTORY, ".rec"));
        UPLOAD_DIR = IOUtils.ensureUpdatedDirectory(new File(Consts.EXTERNAL_STORAGE_DIRECTORY, "uploads"), new File(Consts.EXTERNAL_STORAGE_DIRECTORY, ".rec"));
    }



/*
    static State access$002(SoundRecorder soundrecorder, State state1)
    {
        soundrecorder.state = state1;
        return state1;
    }

*/




/*
    static long access$1002(SoundRecorder soundrecorder, long l)
    {
        soundrecorder.seekToPos = l;
        return l;
    }

*/


/*
    static long access$102(SoundRecorder soundrecorder, long l)
    {
        soundrecorder.remainingTime = l;
        return l;
    }

*/


















/*
    static PlaybackStream access$902(SoundRecorder soundrecorder, PlaybackStream playbackstream)
    {
        soundrecorder.playbackStream = playbackstream;
        return playbackstream;
    }

*/

    private class _cls1
        implements android.media.AudioRecord.OnRecordPositionUpdateListener
    {

        final SoundRecorder this$0;

        public void onMarkerReached(AudioRecord audiorecord)
        {
        }

        public void onPeriodicNotification(AudioRecord audiorecord)
        {
            if (state == State.RECORDING)
            {
                remainingTime = remainingTimeCalculator.timeRemaining();
                broadcastManager.sendBroadcast((new Intent("com.soundcloud.android.recordprogress")).putExtra("elapsedTime", getRecordingElapsedTime()).putExtra("duration", getPlaybackDuration()).putExtra("time_remaining", remainingTime));
            }
        }

        _cls1()
        {
            this$0 = SoundRecorder.this;
            super();
        }
    }


    private class _cls2
        implements android.media.AudioTrack.OnPlaybackPositionUpdateListener
    {

        final SoundRecorder this$0;

        public void onMarkerReached(AudioTrack audiotrack)
        {
        }

        public void onPeriodicNotification(AudioTrack audiotrack)
        {
            if (state == State.PLAYING)
            {
                sendPlaybackProgress();
            }
        }

        _cls2()
        {
            this$0 = SoundRecorder.this;
            super();
        }
    }

}
