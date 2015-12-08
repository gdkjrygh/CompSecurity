// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaStatus, CastDevice, TextTrackStyle, 
//            Cast

public class RemoteMediaPlayer
    implements Cast.MessageReceivedCallback
{
    public static interface MediaChannelResult
        extends Result
    {

        public abstract JSONObject getCustomData();
    }

    public static interface OnMetadataUpdatedListener
    {

        public abstract void onMetadataUpdated();
    }

    public static interface OnStatusUpdatedListener
    {

        public abstract void onStatusUpdated();
    }

    private class a
        implements zzn
    {

        final RemoteMediaPlayer a;
        private GoogleApiClient b;
        private long c;

        public void a(GoogleApiClient googleapiclient)
        {
            b = googleapiclient;
        }

        public void zza(String s, String s1, long l, String s2)
            throws IOException
        {
            if (b == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(b, s, s1).setResultCallback(new a(this, l));
                return;
            }
        }

        public long zzjU()
        {
            long l = c + 1L;
            c = l;
            return l;
        }

        public a()
        {
            a = RemoteMediaPlayer.this;
            super();
            c = 0L;
        }
    }

    private final class a.a
        implements ResultCallback
    {

        final a a;
        private final long b;

        public void a(Status status)
        {
            if (!status.isSuccess())
            {
                com.google.android.gms.cast.RemoteMediaPlayer.zze(a.a).zzb(b, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            a((Status)result);
        }

        a.a(a a1, long l)
        {
            a = a1;
            super();
            b = l;
        }
    }

    private static abstract class b extends zzb
    {

        zzo h;

        public MediaChannelResult a(Status status)
        {
            return new MediaChannelResult(this, status) {

                final Status a;
                final b b;

                public JSONObject getCustomData()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return a;
                }

            
            {
                b = b1;
                a = status;
                super();
            }
            };
        }

        public Result createFailedResult(Status status)
        {
            return a(status);
        }

        b(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            h = new _cls1(this);
        }
    }

    private static final class c
        implements MediaChannelResult
    {

        private final Status a;
        private final JSONObject b;

        public JSONObject getCustomData()
        {
            return b;
        }

        public Status getStatus()
        {
            return a;
        }

        c(Status status, JSONObject jsonobject)
        {
            a = status;
            b = jsonobject;
        }
    }


    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final zzm zzMJ = new zzm(null) {

        final RemoteMediaPlayer a;

        protected void onMetadataUpdated()
        {
            com.google.android.gms.cast.RemoteMediaPlayer.zzb(a);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.zza(a);
        }

            
            {
                a = RemoteMediaPlayer.this;
                super(s);
            }
    };
    private final a zzMK = new a();
    private OnMetadataUpdatedListener zzML;
    private OnStatusUpdatedListener zzMM;
    private final Object zzoe = new Object();

    public RemoteMediaPlayer()
    {
        zzMJ.zza(zzMK);
    }

    private void onMetadataUpdated()
    {
        if (zzML != null)
        {
            zzML.onMetadataUpdated();
        }
    }

    private void onStatusUpdated()
    {
        if (zzMM != null)
        {
            zzMM.onStatusUpdated();
        }
    }

    static void zza(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onStatusUpdated();
    }

    static void zzb(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onMetadataUpdated();
    }

    static Object zzc(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzoe;
    }

    static a zzd(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzMK;
    }

    static zzm zze(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzMJ;
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized (zzoe)
        {
            l = zzMJ.getApproximateStreamPosition();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaInfo getMediaInfo()
    {
        MediaInfo mediainfo;
        synchronized (zzoe)
        {
            mediainfo = zzMJ.getMediaInfo();
        }
        return mediainfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaStatus getMediaStatus()
    {
        MediaStatus mediastatus;
        synchronized (zzoe)
        {
            mediastatus = zzMJ.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return zzMJ.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized (zzoe)
        {
            l = zzMJ.getStreamDuration();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo)
    {
        return load(googleapiclient, mediainfo, true, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag)
    {
        return load(googleapiclient, mediainfo, flag, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l)
    {
        return load(googleapiclient, mediainfo, flag, l, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
    {
        return load(googleapiclient, mediainfo, flag, l, null, jsonobject);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, long al[], JSONObject jsonobject)
    {
        return googleapiclient.zzb(new b(googleapiclient, googleapiclient, mediainfo, flag, l, al, jsonobject) {

            final GoogleApiClient a;
            final MediaInfo b;
            final boolean c;
            final long d;
            final long e[];
            final JSONObject f;
            final RemoteMediaPlayer g;

            protected void a(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(g)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(g).a(a);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(g).zza(h, b, c, d, e, f);
                RemoteMediaPlayer.zzd(g).a(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(a(new Status(2100)));
                RemoteMediaPlayer.zzd(g).a(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(g).a(null);
                throw obj;
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zze)zza1);
            }

            
            {
                g = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = mediainfo;
                c = flag;
                d = l;
                e = al;
                f = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        zzMJ.zzbm(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new b(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient a;
            final JSONObject b;
            final RemoteMediaPlayer c;

            protected void a(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(c)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(c).a(a);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(c).zza(h, b);
                RemoteMediaPlayer.zzd(c).a(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(a(new Status(2100)));
                RemoteMediaPlayer.zzd(c).a(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(c).a(null);
                throw obj;
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zze)zza1);
            }

            
            {
                c = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult play(GoogleApiClient googleapiclient)
    {
        return play(googleapiclient, null);
    }

    public PendingResult play(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new b(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient a;
            final JSONObject b;
            final RemoteMediaPlayer c;

            protected void a(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(c)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(c).a(a);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(c).zzc(h, b);
                RemoteMediaPlayer.zzd(c).a(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(a(new Status(2100)));
                RemoteMediaPlayer.zzd(c).a(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(c).a(null);
                throw obj;
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zze)zza1);
            }

            
            {
                c = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new b(googleapiclient, googleapiclient) {

            final GoogleApiClient a;
            final RemoteMediaPlayer b;

            protected void a(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(b)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(b).a(a);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(b).zza(h);
                RemoteMediaPlayer.zzd(b).a(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(a(new Status(2100)));
                RemoteMediaPlayer.zzd(b).a(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(b).a(null);
                throw obj;
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zze)zza1);
            }

            
            {
                b = RemoteMediaPlayer.this;
                a = googleapiclient1;
                super(googleapiclient);
            }
        });
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l)
    {
        return seek(googleapiclient, l, 0, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i)
    {
        return seek(googleapiclient, l, i, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new b(googleapiclient, googleapiclient, l, i, jsonobject) {

            final GoogleApiClient a;
            final long b;
            final int c;
            final JSONObject d;
            final RemoteMediaPlayer e;

            protected void a(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(e)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(e).a(a);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(e).zza(h, b, c, d);
                RemoteMediaPlayer.zzd(e).a(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(a(new Status(2100)));
                RemoteMediaPlayer.zzd(e).a(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(e).a(null);
                throw obj;
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zze)zza1);
            }

            
            {
                e = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = l;
                c = i;
                d = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
    {
        if (al == null)
        {
            throw new IllegalArgumentException("trackIds cannot be null");
        } else
        {
            return googleapiclient.zzb(new b(googleapiclient, googleapiclient, al) {

                final GoogleApiClient a;
                final long b[];
                final RemoteMediaPlayer c;

                protected void a(zze zze1)
                {
                    zze1 = ((zze) (RemoteMediaPlayer.zzc(c)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzd(c).a(a);
                    com.google.android.gms.cast.RemoteMediaPlayer.zze(c).zza(h, b);
                    RemoteMediaPlayer.zzd(c).a(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    setResult(a(new Status(2100)));
                    RemoteMediaPlayer.zzd(c).a(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzd(c).a(null);
                    throw obj;
                }

                protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    a((zze)zza1);
                }

            
            {
                c = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = al;
                super(googleapiclient);
            }
            });
        }
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        zzML = onmetadataupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        zzMM = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new b(googleapiclient, googleapiclient, flag, jsonobject) {

            final GoogleApiClient a;
            final boolean b;
            final JSONObject c;
            final RemoteMediaPlayer d;

            protected void a(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(d)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(d).a(a);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(d).zza(h, b, c);
                RemoteMediaPlayer.zzd(d).a(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
_L2:
                setResult(a(new Status(2100)));
                RemoteMediaPlayer.zzd(d).a(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(d).a(null);
                throw obj;
                obj;
                  goto _L2
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zze)zza1);
            }

            
            {
                d = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = flag;
                c = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d)
        throws IllegalArgumentException
    {
        return setStreamVolume(googleapiclient, d, null);
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        if (Double.isInfinite(d) || Double.isNaN(d))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        } else
        {
            return googleapiclient.zzb(new b(googleapiclient, googleapiclient, d, jsonobject) {

                final GoogleApiClient a;
                final double b;
                final JSONObject c;
                final RemoteMediaPlayer d;

                protected void a(zze zze1)
                {
                    zze1 = ((zze) (RemoteMediaPlayer.zzc(d)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzd(d).a(a);
                    com.google.android.gms.cast.RemoteMediaPlayer.zze(d).zza(h, b, c);
                    RemoteMediaPlayer.zzd(d).a(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
_L2:
                    setResult(a(new Status(2100)));
                    RemoteMediaPlayer.zzd(d).a(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzd(d).a(null);
                    throw obj;
                    obj;
                      goto _L2
                    obj;
                      goto _L2
                }

                protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    a((zze)zza1);
                }

            
            {
                d = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = d1;
                c = jsonobject;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult setTextTrackStyle(GoogleApiClient googleapiclient, TextTrackStyle texttrackstyle)
    {
        if (texttrackstyle == null)
        {
            throw new IllegalArgumentException("trackStyle cannot be null");
        } else
        {
            return googleapiclient.zzb(new b(googleapiclient, googleapiclient, texttrackstyle) {

                final GoogleApiClient a;
                final TextTrackStyle b;
                final RemoteMediaPlayer c;

                protected void a(zze zze1)
                {
                    zze1 = ((zze) (RemoteMediaPlayer.zzc(c)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzd(c).a(a);
                    com.google.android.gms.cast.RemoteMediaPlayer.zze(c).zza(h, b);
                    RemoteMediaPlayer.zzd(c).a(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    setResult(a(new Status(2100)));
                    RemoteMediaPlayer.zzd(c).a(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzd(c).a(null);
                    throw obj;
                }

                protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    a((zze)zza1);
                }

            
            {
                c = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = texttrackstyle;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult stop(GoogleApiClient googleapiclient)
    {
        return stop(googleapiclient, null);
    }

    public PendingResult stop(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new b(googleapiclient, googleapiclient, jsonobject) {

            final GoogleApiClient a;
            final JSONObject b;
            final RemoteMediaPlayer c;

            protected void a(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(c)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(c).a(a);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(c).zzb(h, b);
                RemoteMediaPlayer.zzd(c).a(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(a(new Status(2100)));
                RemoteMediaPlayer.zzd(c).a(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(c).a(null);
                throw obj;
            }

            protected void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                a((zze)zza1);
            }

            
            {
                c = RemoteMediaPlayer.this;
                a = googleapiclient1;
                b = jsonobject;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$b$1

/* anonymous class */
    class b._cls1
        implements zzo
    {

        final b a;

        public void zza(long l, int i, Object obj)
        {
            if (obj instanceof JSONObject)
            {
                obj = (JSONObject)obj;
            } else
            {
                obj = null;
            }
            a.setResult(new c(new Status(i), ((JSONObject) (obj))));
        }

        public void zzw(long l)
        {
            a.setResult(a.a(new Status(2103)));
        }

            
            {
                a = b1;
                super();
            }
    }

}
