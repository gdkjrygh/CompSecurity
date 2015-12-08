// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;

// Referenced classes of package com.soundcloud.android.skippy:
//            ProxyUtils, LibraryLoader, ServiceAvailability, SkippyVersionValidator, 
//            ServiceAvailabilityListener

public class Skippy
{
    public static final class CacheRestriction extends Enum
    {

        private static final CacheRestriction $VALUES[];
        public static final CacheRestriction DISABLE_CACHE;
        public static final CacheRestriction NONE;
        public static final CacheRestriction NONE_EXPERIMENTAL;
        public static final CacheRestriction ONLINE_ONLY;

        public static CacheRestriction valueOf(String s)
        {
            return (CacheRestriction)Enum.valueOf(com/soundcloud/android/skippy/Skippy$CacheRestriction, s);
        }

        public static CacheRestriction[] values()
        {
            return (CacheRestriction[])$VALUES.clone();
        }

        static 
        {
            NONE = new CacheRestriction("NONE", 0);
            ONLINE_ONLY = new CacheRestriction("ONLINE_ONLY", 1);
            DISABLE_CACHE = new CacheRestriction("DISABLE_CACHE", 2);
            NONE_EXPERIMENTAL = new CacheRestriction("NONE_EXPERIMENTAL", 3);
            $VALUES = (new CacheRestriction[] {
                NONE, ONLINE_ONLY, DISABLE_CACHE, NONE_EXPERIMENTAL
            });
        }

        private CacheRestriction(String s, int i)
        {
            super(s, i);
        }
    }

    public static class Configuration
    {

        private int androidVersion;
        private long bufferDurationMs;
        private byte cacheKey[];
        private long cacheMaxSizeBytes;
        private long cacheMinFreeSpaceBytes;
        private String cachePath;
        private CacheRestriction cacheRestriction;
        private boolean enableDebug;
        private int progressIntervalMs;

        public int getAndroidVersion()
        {
            return androidVersion;
        }

        public byte[] getCacheKey()
        {
            return cacheKey;
        }

        public long getCacheMaxSizeBytes()
        {
            return cacheMaxSizeBytes;
        }

        public long getCacheMinFreeSpaceBytes()
        {
            return cacheMinFreeSpaceBytes;
        }

        public String getCachePath()
        {
            return cachePath;
        }

        public CacheRestriction getCacheRestriction()
        {
            return cacheRestriction;
        }

        public boolean getDisableCaching()
        {
            return cacheRestriction == CacheRestriction.DISABLE_CACHE;
        }

        public boolean getEnableDebug()
        {
            return enableDebug;
        }

        public boolean shouldUseCacheOnlineOnly()
        {
            return cacheRestriction == CacheRestriction.ONLINE_ONLY;
        }


        private Configuration()
        {
            androidVersion = android.os.Build.VERSION.SDK_INT;
            progressIntervalMs = -1;
            bufferDurationMs = -1L;
            cacheMaxSizeBytes = -1L;
            cacheMinFreeSpaceBytes = -1L;
            cachePath = null;
            cacheKey = null;
            enableDebug = true;
            cacheRestriction = CacheRestriction.ONLINE_ONLY;
        }

        public Configuration(int i, long l, long l1, long l2, 
                String s, byte abyte0[], boolean flag, CacheRestriction cacherestriction)
        {
            androidVersion = android.os.Build.VERSION.SDK_INT;
            progressIntervalMs = i;
            bufferDurationMs = l;
            cacheMaxSizeBytes = l1;
            cacheMinFreeSpaceBytes = l2;
            cachePath = s;
            enableDebug = flag;
            cacheRestriction = cacherestriction;
            if (abyte0 != null && abyte0.length != 16)
            {
                throw new IllegalArgumentException("Key needs to be exactly 16 bytes");
            }
            if (abyte0 != null)
            {
                cacheKey = new byte[16];
                System.arraycopy(abyte0, 0, cacheKey, 0, 16);
                return;
            } else
            {
                cacheKey = null;
                return;
            }
        }

        Configuration(_cls1 _pcls1)
        {
            this();
        }
    }

    public static class DumpLogger
    {

        private static final int LOG_ENTRY_MAX_LEN = 4096;

        public static void log(int i, String s)
        {
            while (!s.isEmpty()) 
            {
                int k = s.lastIndexOf('\n', 4096);
                int j;
                if (k != -1)
                {
                    j = k;
                } else
                {
                    j = Math.min(4096, s.length());
                }
                Log.println(i, "Skippy", s.substring(0, j));
                if (k != -1)
                {
                    s = s.substring(j + 1);
                } else
                {
                    s = s.substring(j);
                }
            }
        }

        public DumpLogger()
        {
        }
    }

    public static class EnumResolver
    {

        private SparseArray a;

        public Enum forValue(int i)
        {
            return (Enum)a.get(i);
        }

        public String nameForValue(int i)
        {
            return ((Enum)a.get(i)).name();
        }

        public EnumResolver(SparseArray sparsearray)
        {
            a = sparsearray;
        }
    }

    public static final class Error extends Enum
    {

        private static final Error $VALUES[];
        public static final Error FAILED;
        public static final Error FORBIDDEN;
        public static final Error MEDIA_NOT_FOUND;
        public static final Error OK;
        public static final Error TIMEOUT;

        public static Error valueOf(String s)
        {
            return (Error)Enum.valueOf(com/soundcloud/android/skippy/Skippy$Error, s);
        }

        public static Error[] values()
        {
            return (Error[])$VALUES.clone();
        }

        static 
        {
            OK = new Error("OK", 0);
            FAILED = new Error("FAILED", 1);
            MEDIA_NOT_FOUND = new Error("MEDIA_NOT_FOUND", 2);
            FORBIDDEN = new Error("FORBIDDEN", 3);
            TIMEOUT = new Error("TIMEOUT", 4);
            $VALUES = (new Error[] {
                OK, FAILED, MEDIA_NOT_FOUND, FORBIDDEN, TIMEOUT
            });
        }

        private Error(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface PlayListener
    {

        public abstract void onDownloadPerformed(long l, long l1, int i, int j, String s);

        public abstract void onErrorMessage(String s, String s1, int i, String s2, String s3, String s4);

        public abstract void onInitializationError(Throwable throwable, String s);

        public abstract void onPerformanceMeasured(PlaybackMetric playbackmetric, long l, String s, String s1);

        public abstract void onProgressChange(long l, long l1, String s);

        public abstract void onStateChanged(State state, Reason reason, Error error, long l, long l1, 
                String s);
    }

    public static final class PlaybackMetric extends Enum
    {

        private static final PlaybackMetric $VALUES[];
        public static final PlaybackMetric CACHE_USAGE_PERCENT;
        public static final PlaybackMetric FRAGMENT_DOWNLOAD_RATE;
        public static final PlaybackMetric TIME_TO_BUFFER;
        public static final PlaybackMetric TIME_TO_GET_PLAYLIST;
        public static final PlaybackMetric TIME_TO_LOAD_LIBRARY;
        public static final PlaybackMetric TIME_TO_PLAY;
        public static final PlaybackMetric TIME_TO_SEEK;
        public static final PlaybackMetric UNINTERRUPTED_PLAYTIME;

        public static PlaybackMetric valueOf(String s)
        {
            return (PlaybackMetric)Enum.valueOf(com/soundcloud/android/skippy/Skippy$PlaybackMetric, s);
        }

        public static PlaybackMetric[] values()
        {
            return (PlaybackMetric[])$VALUES.clone();
        }

        static 
        {
            TIME_TO_PLAY = new PlaybackMetric("TIME_TO_PLAY", 0);
            TIME_TO_GET_PLAYLIST = new PlaybackMetric("TIME_TO_GET_PLAYLIST", 1);
            TIME_TO_BUFFER = new PlaybackMetric("TIME_TO_BUFFER", 2);
            TIME_TO_SEEK = new PlaybackMetric("TIME_TO_SEEK", 3);
            FRAGMENT_DOWNLOAD_RATE = new PlaybackMetric("FRAGMENT_DOWNLOAD_RATE", 4);
            TIME_TO_LOAD_LIBRARY = new PlaybackMetric("TIME_TO_LOAD_LIBRARY", 5);
            CACHE_USAGE_PERCENT = new PlaybackMetric("CACHE_USAGE_PERCENT", 6);
            UNINTERRUPTED_PLAYTIME = new PlaybackMetric("UNINTERRUPTED_PLAYTIME", 7);
            $VALUES = (new PlaybackMetric[] {
                TIME_TO_PLAY, TIME_TO_GET_PLAYLIST, TIME_TO_BUFFER, TIME_TO_SEEK, FRAGMENT_DOWNLOAD_RATE, TIME_TO_LOAD_LIBRARY, CACHE_USAGE_PERCENT, UNINTERRUPTED_PLAYTIME
            });
        }

        private PlaybackMetric(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Reason extends Enum
    {

        private static final Reason $VALUES[];
        public static final Reason BUFFERING;
        public static final Reason COMPLETE;
        public static final Reason ERROR;
        public static final Reason NOTHING;
        public static final Reason PAUSED;

        public static Reason valueOf(String s)
        {
            return (Reason)Enum.valueOf(com/soundcloud/android/skippy/Skippy$Reason, s);
        }

        public static Reason[] values()
        {
            return (Reason[])$VALUES.clone();
        }

        static 
        {
            NOTHING = new Reason("NOTHING", 0);
            PAUSED = new Reason("PAUSED", 1);
            BUFFERING = new Reason("BUFFERING", 2);
            COMPLETE = new Reason("COMPLETE", 3);
            ERROR = new Reason("ERROR", 4);
            $VALUES = (new Reason[] {
                NOTHING, PAUSED, BUFFERING, COMPLETE, ERROR
            });
        }

        private Reason(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State IDLE;
        public static final State PLAYING;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/soundcloud/android/skippy/Skippy$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            IDLE = new State("IDLE", 0);
            PLAYING = new State("PLAYING", 1);
            $VALUES = (new State[] {
                IDLE, PLAYING
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private static final SparseArray ERRORS;
    public static final EnumResolver ErrorsResolver;
    private static final SparseArray METRICS;
    public static final EnumResolver MetricsResolver;
    private static final SparseArray REASONS;
    public static final EnumResolver ReasonsResolver;
    private static final SparseArray STATES;
    public static final EnumResolver StatesResolver;
    private static final String TAG = "Skippy";
    static final int VERSION_MAJOR = 4;
    static final int VERSION_MINOR = 3;
    static final int VERSION_PATCH = 3;
    private Configuration configuration;
    private long lastPositionSeconds;
    private final LibraryLoader libraryLoader;
    private final SkippyVersionValidator libraryVersionValidator;
    private long nativeGlobalRef;
    private long nativeSkippy;
    private final PlayListener playListener;
    private final ProxyUtils proxyUtils;
    private ServiceAvailability serviceAvailability;
    private ServiceAvailabilityListener serviceAvailabilityListener;

    public Skippy()
    {
        this(null);
    }

    public Skippy(PlayListener playlistener)
    {
        this(playlistener, null);
    }

    public Skippy(PlayListener playlistener, LibraryLoader libraryloader)
    {
        lastPositionSeconds = -1L;
        libraryVersionValidator = new _cls1();
        proxyUtils = new ProxyUtils();
        playListener = playlistener;
        playlistener = libraryloader;
        if (libraryloader == null)
        {
            playlistener = new LibraryLoader(libraryVersionValidator);
        }
        libraryLoader = playlistener;
    }

    protected Skippy(PlayListener playlistener, LibraryLoader libraryloader, ServiceAvailability serviceavailability, ServiceAvailabilityListener serviceavailabilitylistener)
    {
        this(playlistener, libraryloader);
        serviceAvailability = serviceavailability;
        serviceAvailabilityListener = serviceavailabilitylistener;
    }

    public static void LogDebug(String s)
    {
    }

    public static void LogError(String s)
    {
        DumpLogger.log(3, (new StringBuilder("ERROR: ")).append(s).toString());
    }

    public static void LogVerbose(String s)
    {
    }

    public static void LogWarn(String s)
    {
    }

    private void applySystemProxySettings()
    {
        String s = proxyUtils.systemProxyToString();
        if (s.isEmpty())
        {
            setProxy(null);
            return;
        } else
        {
            setProxy(s);
            return;
        }
    }

    private ServiceAvailability getOrCreateServiceAvailability(Context context)
    {
        if (serviceAvailability == null)
        {
            serviceAvailability = new ServiceAvailability(context);
        }
        return serviceAvailability;
    }

    private ServiceAvailabilityListener getOrCreateServiceAvailabilityListener()
    {
        if (serviceAvailabilityListener == null)
        {
            serviceAvailabilityListener = new _cls2();
        }
        return serviceAvailabilityListener;
    }

    private native void nativeClearCache();

    private native void nativeCue(String s);

    private native void nativeDestroy();

    private native long nativeGetDuration();

    private native long nativeGetPosition();

    private native int nativeGetVersionMajor();

    private native int nativeGetVersionMinor();

    private native int nativeGetVersionPatch();

    private native float nativeGetVolume();

    private native void nativePause();

    private native void nativePlay(String s, long l);

    private native void nativePlayOffline(String s, long l, byte abyte0[], byte abyte1[]);

    private native void nativeResume();

    private native void nativeSeek(long l);

    private native void nativeSetCachingEnabled(boolean flag);

    private static native void nativeSetProxy(String s);

    private native void nativeSetVolume(float f);

    private void onDownloadPerformed(long l, long l1, int i, int j, String s)
    {
        LogVerbose((new StringBuilder("DOWNLOAD: Media Start=")).append(l).append(" ms Media End=").append(l1).append(" ms Loaded Bytes=").append(i).append(" of Total Bytes=").append(j).append(" URI=").append(s).toString());
        if (playListener != null)
        {
            playListener.onDownloadPerformed(l, l1, i, j, s);
        }
    }

    private void onInitializationError(Throwable throwable, String s)
    {
        LogWarn((new StringBuilder("Failed loading native libraries: ")).append(s).append(". Error type: ").append(throwable.toString()).append(" Detailed message: ").append(throwable.getMessage()).toString());
        if (playListener != null)
        {
            playListener.onInitializationError(throwable, s);
        }
    }

    private void onPerformanceMeasured(int i, long l, String s, String s1)
    {
        LogDebug((new StringBuilder("PERFORMANCE: Metric=")).append(MetricsResolver.nameForValue(i)).append(" Value=").append(l).append(" URI=").append(s).append(" CDN=").append(s1).toString());
        if (playListener != null)
        {
            playListener.onPerformanceMeasured((PlaybackMetric)MetricsResolver.forValue(i), l, s, s1);
        }
    }

    private void onProgressChange(long l, long l1, String s)
    {
        long l2 = Math.round((double)l / 1000D);
        if (l == 0L || l2 != lastPositionSeconds)
        {
            lastPositionSeconds = l2;
            LogDebug((new StringBuilder("PROGRESS: Position=")).append(l).append(" Duration=").append(l1).append(" URI=").append(s).toString());
        }
        if (playListener != null)
        {
            playListener.onProgressChange(l, l1, s);
        }
    }

    private void onStateChange(int i, int j, int k, long l, long l1, 
            String s)
    {
        LogDebug((new StringBuilder("STATUS: State=")).append(StatesResolver.nameForValue(i)).append(" Reason=").append(ReasonsResolver.nameForValue(j)).append(" Error=").append(ErrorsResolver.nameForValue(k)).append(" Position= ").append(l).append(" Duration=").append(l1).append(" URI=").append(s).toString());
        if (playListener != null)
        {
            playListener.onStateChanged((State)StatesResolver.forValue(i), (Reason)ReasonsResolver.forValue(j), (Error)ErrorsResolver.forValue(k), l, l1, s);
        }
    }

    public static void setProxy(String s)
    {
        LogDebug((new StringBuilder("Called set proxy with host: ")).append(s).toString());
        nativeSetProxy(s);
    }

    private static Boolean translateCachePolicy(Configuration configuration1, NetworkConnectivityListener.State state)
    {
        boolean flag = true;
        (new StringBuilder("CacheRestriction: ")).append(configuration1.cacheRestriction.name()).append(" / ConnectionState: ").append(state.name());
        if (configuration1.cacheRestriction == CacheRestriction.NONE)
        {
            return Boolean.valueOf(true);
        }
        if (state != NetworkConnectivityListener.State.CONNECTED || configuration1.cacheRestriction != CacheRestriction.ONLINE_ONLY)
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public void clearCache()
    {
        LogDebug("Called clearCache");
        nativeClearCache();
    }

    public void cue(String s, long l)
    {
        LogDebug((new StringBuilder("Called cue: URI=")).append(s).toString());
        nativeCue(s);
    }

    public void destroy()
    {
        LogDebug("Called destroy");
        if (serviceAvailability != null)
        {
            serviceAvailability.unregisterListener(serviceAvailabilityListener);
        }
        nativeDestroy();
    }

    public long getDuration()
    {
        LogVerbose("Called getDuration");
        return nativeGetDuration();
    }

    public long getPosition()
    {
        LogVerbose("Called getPosition");
        return nativeGetPosition();
    }

    public float getVolume()
    {
        LogDebug("Called getVolume");
        return nativeGetVolume();
    }

    public boolean init(Context context, Configuration configuration1)
    {
        LogDebug("Initializing skippy. Library version: 4.3.3");
        libraryLoader.start(context);
        Throwable throwable = libraryLoader.getLoadError();
        if (throwable != null)
        {
            LogWarn("There was a libary loading error, we need to abort initialization");
            context = libraryLoader.listNativeLibDir(context);
            onInitializationError(throwable, (new StringBuilder("libsDir=[")).append(context).append("]").toString());
            return false;
        }
        LogDebug("Loading native binaries succeeded");
        long l = libraryLoader.getProgressTotalMilliseconds();
        LogDebug((new StringBuilder("Took ")).append(l).append(" ms to load native libraries and initialize GStreamer").toString());
        if (playListener != null)
        {
            playListener.onPerformanceMeasured(PlaybackMetric.TIME_TO_LOAD_LIBRARY, l, null, null);
        } else
        {
            LogWarn("No PlayListener attached");
        }
        if (configuration1 == null)
        {
            LogDebug("Using default configuration for initialization");
            configuration1 = new Configuration(null);
            configuration = configuration1;
        } else
        {
            LogDebug("Using custom configuration for initialization");
            configuration = configuration1;
        }
        LogDebug("Initializing native component ...");
        nativeInit(configuration1);
        getOrCreateServiceAvailability(context);
        getOrCreateServiceAvailabilityListener();
        if (!configuration1.shouldUseCacheOnlineOnly()) goto _L2; else goto _L1
_L1:
        nativeSetCachingEnabled(false);
        serviceAvailability.registerListener(serviceAvailabilityListener);
_L5:
        LogDebug("Initialization succeeded");
        applySystemProxySettings();
        return true;
_L2:
        if (!configuration1.getDisableCaching()) goto _L4; else goto _L3
_L3:
        nativeSetCachingEnabled(false);
          goto _L5
        context;
        LogError("Error while initializing native component");
        onInitializationError(context, "nativeInit failed");
        return false;
_L4:
        if (configuration1.cacheRestriction != CacheRestriction.NONE_EXPERIMENTAL) goto _L5; else goto _L6
_L6:
        serviceAvailability.registerListener(serviceAvailabilityListener);
          goto _L5
    }

    public boolean isNativeSkippyLibVersionCorrect()
    {
        int i = nativeGetVersionMajor();
        int j = nativeGetVersionMinor();
        int k = nativeGetVersionPatch();
        if (k != 3 || j != 3 || i != 4)
        {
            LogError((new StringBuilder("Wrong version of skippy native library loaded. Native version info: ")).append(i).append(".").append(j).append(".").append(k).append(". Expected version: 4.3.3").toString());
            return false;
        } else
        {
            return true;
        }
    }

    protected native void nativeInit(Configuration configuration1);

    protected void onErrorMessage(String s, String s1, int i, String s2, String s3, String s4)
    {
        LogError((new StringBuilder("Category=")).append(s).append(" Source File=").append(s1).append(":").append(i).append(" URI=").append(s3).append(" CDN=").append(s4).append(" Message={").append(s2).append("}").toString());
        if (playListener != null)
        {
            playListener.onErrorMessage(s, s1, i, s2, s3, s4);
        }
    }

    public void pause()
    {
        LogDebug("Called pause");
        nativePause();
    }

    public void play(String s, long l)
    {
        LogDebug((new StringBuilder("Called play: URI=")).append(s).append(" Position=").append(l).toString());
        nativePlay(s, l);
    }

    public void playAd(String s, long l)
    {
        LogDebug((new StringBuilder("Called playAd: URI=")).append(s).append(" Position=").append(l).toString());
        nativePlay(s, l);
    }

    public void playOffline(String s, long l, byte abyte0[], byte abyte1[])
    {
        LogDebug((new StringBuilder("Called playOffline: URI=")).append(s).append(" Position=").append(l).toString());
        if (abyte0.length != 16 || abyte1.length != 16)
        {
            throw new IllegalArgumentException("Key/IV pair must be 16 bytes long each");
        } else
        {
            nativePlayOffline(s, l, abyte0, abyte1);
            return;
        }
    }

    public void preload(Context context)
    {
        libraryLoader.preload(context);
    }

    public void resume()
    {
        LogDebug("Called resume");
        nativeResume();
    }

    public void seek(long l)
    {
        LogDebug((new StringBuilder("Called seek: Position=")).append(l).toString());
        nativeSeek(l);
    }

    public void setVolume(float f)
    {
        LogDebug((new StringBuilder("Called setVolume: Level=")).append(f).toString());
        nativeSetVolume(f);
    }

    static 
    {
        boolean flag = false;
        STATES = new SparseArray(State.values().length);
        REASONS = new SparseArray(Reason.values().length);
        ERRORS = new SparseArray(Error.values().length);
        METRICS = new SparseArray(PlaybackMetric.values().length);
        StatesResolver = new EnumResolver(STATES);
        ReasonsResolver = new EnumResolver(REASONS);
        ErrorsResolver = new EnumResolver(ERRORS);
        MetricsResolver = new EnumResolver(METRICS);
        Object aobj[] = State.values();
        int i1 = aobj.length;
        for (int i = 0; i < i1; i++)
        {
            State state = aobj[i];
            STATES.put(state.ordinal(), state);
        }

        aobj = Reason.values();
        i1 = aobj.length;
        for (int j = 0; j < i1; j++)
        {
            Reason reason = aobj[j];
            REASONS.put(reason.ordinal(), reason);
        }

        aobj = Error.values();
        i1 = aobj.length;
        for (int k = 0; k < i1; k++)
        {
            Error error = aobj[k];
            ERRORS.put(error.ordinal(), error);
        }

        aobj = PlaybackMetric.values();
        i1 = aobj.length;
        for (int l = ((flag) ? 1 : 0); l < i1; l++)
        {
            PlaybackMetric playbackmetric = aobj[l];
            METRICS.put(playbackmetric.ordinal(), playbackmetric);
        }

    }




    private class _cls1
        implements SkippyVersionValidator
    {

        final Skippy this$0;

        public boolean isValidLibraryVersionLoaded(SkippyLibrary skippylibrary)
        {
            if (skippylibrary.equals(SkippyLibrary.SKIPPY))
            {
                return isNativeSkippyLibVersionCorrect();
            } else
            {
                return true;
            }
        }

        _cls1()
        {
            this$0 = Skippy.this;
            super();
        }
    }


    private class _cls2
        implements ServiceAvailabilityListener
    {

        final Skippy this$0;

        public void onServiceAvailabilityChanged(boolean flag)
        {
            applySystemProxySettings();
            if (configuration.shouldUseCacheOnlineOnly())
            {
                nativeSetCachingEnabled(flag);
            }
        }

        _cls2()
        {
            this$0 = Skippy.this;
            super();
        }
    }

}
