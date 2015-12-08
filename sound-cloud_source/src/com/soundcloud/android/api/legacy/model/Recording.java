// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.Time;
import com.soundcloud.android.Consts;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.creators.record.AudioReader;
import com.soundcloud.android.creators.record.PlaybackStream;
import com.soundcloud.android.creators.record.SoundRecorder;
import com.soundcloud.android.utils.FiletimeComparator;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.ScTextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recording
    implements Parcelable, Comparable
{
    public static class RecordingFilter
        implements FilenameFilter
    {

        public boolean accept(File file, String s)
        {
            return Recording.isRawFilename(s) || Recording.isEncodedFilename(s) || Recording.isAmplitudeFile(s);
        }

        public RecordingFilter()
        {
        }
    }

    public static class RecordingWavFilter
        implements FilenameFilter
    {

        private final Recording toIgnore;

        public boolean accept(File file, String s)
        {
            return Recording.isRawFilename(s) && (toIgnore == null || !toIgnore.audio_path.getName().equals(s));
        }

        public RecordingWavFilter(Recording recording)
        {
            toIgnore = recording;
        }
    }

    public static abstract class Status
    {

        public static final int ERROR = 4;
        public static final int NOT_YET_UPLOADED = 0;
        public static final int UPLOADED = 2;
        public static final int UPLOADING = 1;

        public Status()
        {
        }
    }


    private static final Pattern AMPLITUDE_PATTERN = Pattern.compile("^.*\\.(amp)$");
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final Pattern ENCODED_PATTERN = Pattern.compile("^.*\\.(0|1|mp4|ogg)$");
    public static final String EXTRA = "recording";
    public static final File IMAGE_DIR;
    public static final int MAX_WAVE_CACHE = 0x6400000;
    public static final String PROCESSED_APPEND = "_processed";
    private static final Pattern RAW_PATTERN = Pattern.compile("^.*\\.(2|pcm|wav)$");
    public static final String TAG_SOURCE_ANDROID_3RDPARTY_UPLOAD = "soundcloud:source=android-3rdparty-upload";
    public static final String TAG_SOURCE_ANDROID_RECORD = "soundcloud:source=android-record";
    public File artwork_path;
    public File audio_path;
    public String description;
    public long duration;
    public boolean external_upload;
    public String genre;
    public boolean is_private;
    public String original_filename;
    private PlaybackStream playbackStream;
    public File resized_artwork_path;
    public String tags[];
    public String title;
    public int upload_status;
    public long user_id;

    public Recording()
    {
    }

    public Recording(Parcel parcel)
    {
        parcel = parcel.readBundle(getClass().getClassLoader());
        user_id = parcel.getLong("user_id");
        title = parcel.getString("title_text");
        description = parcel.getString("description");
        genre = parcel.getString("genre");
        audio_path = new File(parcel.getString("audio_path"));
        original_filename = parcel.getString("original_filename");
        if (parcel.containsKey("artwork_path"))
        {
            artwork_path = new File(parcel.getString("artwork_path"));
        }
        if (parcel.containsKey("resized_artwork_path"))
        {
            resized_artwork_path = new File(parcel.getString("resized_artwork_path"));
        }
        duration = parcel.getLong("duration");
        is_private = parcel.getBoolean("is_private", false);
        external_upload = parcel.getBoolean("external_upload", false);
        upload_status = parcel.getInt("upload_status");
        if (!external_upload)
        {
            playbackStream = (PlaybackStream)parcel.getParcelable("playback_stream");
        }
    }

    public Recording(File file)
    {
        audio_path = file;
    }

    public static Recording create()
    {
        return new Recording(new File(SoundRecorder.RECORD_DIR, (new StringBuilder()).append(System.currentTimeMillis()).append(".wav").toString()));
    }

    public static Recording fromIntent(Intent intent)
    {
        if (intent != null && intent.hasExtra("recording"))
        {
            return (Recording)intent.getParcelableExtra("recording");
        } else
        {
            return null;
        }
    }

    public static long getUserIdFromFile(File file)
    {
        file = file.getName();
        if (TextUtils.isEmpty(file) || !file.contains("_") || file.indexOf('_') + 1 >= file.length())
        {
            return -1L;
        }
        try
        {
            int j = file.indexOf('_');
            int i;
            if (file.contains("."))
            {
                i = file.indexOf('.');
            } else
            {
                i = file.length();
            }
            return Long.valueOf(file.substring(j + 1, i)).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return -1L;
        }
    }

    private PlaybackStream initializePlaybackStream(Cursor cursor)
    {
        boolean flag1 = true;
        PlaybackStream playbackstream;
        long l;
        long l1;
        long l2;
        boolean flag;
        try
        {
            playbackstream = new PlaybackStream(AudioReader.guessMultiple(new File[] {
                audio_path, getEncodedFile()
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor = SoundCloudApplication.TAG;
            return new PlaybackStream(AudioReader.EMPTY);
        }
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        l2 = cursor.getLong(cursor.getColumnIndex("trim_left"));
        l1 = cursor.getLong(cursor.getColumnIndex("trim_right"));
        l = l1;
        if (l1 > l2)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        l = duration;
        if (cursor.getInt(cursor.getColumnIndex("optimize")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(cursor.getColumnIndex("fading")) != 1)
        {
            flag1 = false;
        }
        playbackstream.setFading(flag1);
        playbackstream.setOptimize(flag);
        playbackstream.setTrim(l2, l);
        return playbackstream;
    }

    public static boolean isAmplitudeFile(String s)
    {
        return AMPLITUDE_PATTERN.matcher(s).matches();
    }

    public static boolean isEncodedFilename(String s)
    {
        return ENCODED_PATTERN.matcher(s).matches();
    }

    public static boolean isRawFilename(String s)
    {
        return RAW_PATTERN.matcher(s).matches();
    }

    private String recordingDateString(Resources resources)
    {
        Time time = new Time();
        time.set(lastModified());
        int i;
        if (time.hour <= 12)
        {
            i = 0x7f0701c7;
        } else
        if (time.hour <= 17)
        {
            i = 0x7f0701c5;
        } else
        if (time.hour <= 21)
        {
            i = 0x7f0701c6;
        } else
        {
            i = 0x7f0701c8;
        }
        return resources.getString(i, new Object[] {
            time.format("%A")
        });
    }

    public static long trimWaveFiles(File file, Recording recording)
    {
        return trimWaveFiles(file, recording, 0x6400000L);
    }

    public static long trimWaveFiles(File file, Recording recording, long l)
    {
        int i = 0;
        long l1 = 0L;
        recording = new RecordingWavFilter(recording);
        long l3 = Math.max(0L, IOUtils.getDirSize(new File[] {
            file
        }) - l);
        long l2 = l1;
        if (l3 > 0L)
        {
            file = IOUtils.nullSafeListFiles(file, recording);
            l2 = l1;
            if (file.length > 0)
            {
                Arrays.sort(file, new FiletimeComparator(true));
                l = l1;
                do
                {
                    l2 = l;
                    if (l >= l3)
                    {
                        break;
                    }
                    l2 = l;
                    if (i >= file.length)
                    {
                        break;
                    }
                    l += file[i].length();
                    file[i].delete();
                    i++;
                } while (true);
            }
        }
        return l2;
    }

    public void clearArtwork()
    {
        IOUtils.deleteFile(artwork_path);
        artwork_path = null;
    }

    public int compareTo(Recording recording)
    {
        return Long.valueOf(lastModified()).compareTo(Long.valueOf(recording.lastModified()));
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Recording)obj);
    }

    public String defaultSharingNote(Resources resources)
    {
        return resources.getString(0x7f0701bb, new Object[] {
            recordingDateString(resources)
        });
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean exists()
    {
        return audio_path.exists() || getEncodedFile().exists();
    }

    public String formattedDuration()
    {
        return ScTextUtils.formatTimestamp(duration, TimeUnit.MILLISECONDS);
    }

    public String getAbsolutePath()
    {
        return audio_path.getAbsolutePath();
    }

    public File getAmplitudeFile()
    {
        return IOUtils.changeExtension(audio_path, "amp");
    }

    public File getArtwork()
    {
        if (resized_artwork_path != null && resized_artwork_path.exists())
        {
            return resized_artwork_path;
        } else
        {
            return artwork_path;
        }
    }

    public long getDuration()
    {
        return duration;
    }

    public File getEncodedFile()
    {
        return IOUtils.changeExtension(audio_path, "ogg");
    }

    public File getFile()
    {
        return audio_path;
    }

    public long getId()
    {
        return (long)getAbsolutePath().hashCode();
    }

    public File getImageFile()
    {
        return getImageFile(IMAGE_DIR);
    }

    public File getImageFile(File file)
    {
        return new File(file, IOUtils.changeExtension(audio_path, "bmp").getName());
    }

    public boolean getIsPrivate()
    {
        return is_private;
    }

    public PlaybackStream getPlaybackStream()
    {
        if (playbackStream == null && !external_upload)
        {
            playbackStream = initializePlaybackStream(null);
        }
        return playbackStream;
    }

    public File getProcessedFile()
    {
        return IOUtils.appendToFilename(getEncodedFile(), "_processed");
    }

    public File getRawFile()
    {
        if (isRawFilename(audio_path.getName()))
        {
            return audio_path;
        } else
        {
            return null;
        }
    }

    public String getStatusMessage(Resources resources)
    {
        switch (upload_status)
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            return resources.getString(0x7f0701c9);

        case 1: // '\001'
            return resources.getString(0x7f0701cc);

        case 4: // '\004'
            return resources.getString(0x7f0701ca);
        }
    }

    public List getTags()
    {
        ArrayList arraylist = new ArrayList();
        if (tags != null)
        {
            String as[] = tags;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s1 = as[i];
                String s = s1;
                if (s1.contains(" "))
                {
                    s = (new StringBuilder("\"")).append(s1).append("\"").toString();
                }
                arraylist.add(s);
            }

        }
        if (external_upload)
        {
            arraylist.add("soundcloud:source=android-3rdparty-upload");
            return arraylist;
        } else
        {
            arraylist.add("soundcloud:source=android-record");
            return arraylist;
        }
    }

    public String getTitle()
    {
        return title;
    }

    public String getTitle(Resources resources)
    {
        if (TextUtils.isEmpty(title))
        {
            return sharingNote(resources);
        } else
        {
            return title;
        }
    }

    public File getUploadFile()
    {
        if (getProcessedFile().exists())
        {
            return getProcessedFile();
        }
        if (getEncodedFile().exists())
        {
            return getEncodedFile();
        }
        if (getFile().exists())
        {
            return getFile();
        } else
        {
            return null;
        }
    }

    public long getUserId()
    {
        return user_id;
    }

    public Intent getViewIntent()
    {
        return new Intent("com.soundcloud.android.action.RECORD");
    }

    public boolean hasArtwork()
    {
        return artwork_path != null && artwork_path.exists();
    }

    public boolean hasResizedArtwork()
    {
        return resized_artwork_path != null && resized_artwork_path.exists();
    }

    public boolean isError()
    {
        return upload_status == 4;
    }

    public boolean isLegacyRecording()
    {
        return external_upload && audio_path.getParentFile().equals(SoundRecorder.RECORD_DIR);
    }

    public boolean isPublic()
    {
        return !is_private;
    }

    public boolean isUploadRecording()
    {
        return external_upload && audio_path.getParentFile().equals(SoundRecorder.UPLOAD_DIR);
    }

    public boolean isUploaded()
    {
        return upload_status == 2;
    }

    public long lastModified()
    {
        if (audio_path.exists())
        {
            return audio_path.lastModified();
        } else
        {
            return getEncodedFile().lastModified();
        }
    }

    public void markUploaded()
    {
        upload_status = 2;
    }

    public boolean needsEncoding()
    {
        if (!external_upload) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        PlaybackStream playbackstream = getPlaybackStream();
        if (playbackstream == null || !playbackstream.isFiltered())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (getProcessedFile().exists()) goto _L1; else goto _L3
_L3:
        return true;
        if (getEncodedFile().exists()) goto _L1; else goto _L4
_L4:
        return true;
    }

    public boolean needsProcessing()
    {
        PlaybackStream playbackstream = getPlaybackStream();
        return !needsEncoding() && playbackstream != null && playbackstream.isTrimmed() && (!getProcessedFile().exists() || getProcessedFile().length() == 0L);
    }

    public boolean needsResizing()
    {
        return hasArtwork() && !hasResizedArtwork();
    }

    public void setDuration(long l)
    {
        duration = l;
    }

    public void setIsPrivate(boolean flag)
    {
        is_private = flag;
    }

    public void setPlaybackStream(PlaybackStream playbackstream)
    {
        long l;
        if (playbackstream == null)
        {
            l = 0L;
        } else
        {
            l = playbackstream.getDuration();
        }
        duration = l;
        playbackStream = playbackstream;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUploadFailed(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        upload_status = i;
    }

    public void setUploading()
    {
        upload_status = 1;
    }

    public void setUserId(long l)
    {
        user_id = l;
    }

    public String sharingNote(Resources resources)
    {
        if (!TextUtils.isEmpty(title))
        {
            return title;
        }
        if (!TextUtils.isEmpty(original_filename))
        {
            return original_filename;
        }
        if (external_upload && !isLegacyRecording() && !isUploadRecording())
        {
            return audio_path.getName();
        } else
        {
            return defaultSharingNote(resources);
        }
    }

    public String tagString()
    {
        return TextUtils.join(" ", getTags());
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Recording{user_id=")).append(user_id).append(", title='").append(title).append('\'').append(", audio_path=").append(audio_path).append(", original_filename=").append(original_filename).append(", duration=").append(duration).append(", artwork_path=").append(artwork_path).append(", is_private=").append(is_private).append(", external_upload=").append(external_upload).append(", upload_status=").append(upload_status).append(", tags=");
        List list;
        if (tags == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(tags);
        }
        return stringbuilder.append(list).append(", description='").append(description).append('\'').append(", genre='").append(genre).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user_id);
        bundle.putString("title_text", title);
        bundle.putString("audio_path", audio_path.getAbsolutePath());
        bundle.putString("original_filename", original_filename);
        if (artwork_path != null)
        {
            bundle.putString("artwork_path", artwork_path.getAbsolutePath());
        }
        if (resized_artwork_path != null)
        {
            bundle.putString("resized_artwork_path", resized_artwork_path.getAbsolutePath());
        }
        bundle.putLong("duration", duration);
        bundle.putString("description", description);
        bundle.putString("genre", genre);
        bundle.putBoolean("is_private", is_private);
        bundle.putBoolean("external_upload", external_upload);
        bundle.putInt("upload_status", upload_status);
        if (!external_upload)
        {
            bundle.putParcelable("playback_stream", playbackStream);
        }
        parcel.writeBundle(bundle);
    }

    static 
    {
        IMAGE_DIR = new File(Consts.EXTERNAL_STORAGE_DIRECTORY, "recordings/images");
    }

    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Recording createFromParcel(Parcel parcel)
        {
            return new Recording(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Recording[] newArray(int i)
        {
            return new Recording[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
