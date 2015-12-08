// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.is;
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
        implements ir
    {

        final RemoteMediaPlayer FK;
        private GoogleApiClient FX;
        private long FY;

        public void a(String s, String s1, long l, String s2)
            throws IOException
        {
            if (FX == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(FX, s, s1).setResultCallback(new a(this, l));
                return;
            }
        }

        public void b(GoogleApiClient googleapiclient)
        {
            FX = googleapiclient;
        }

        public long fx()
        {
            long l = FY + 1L;
            FY = l;
            return l;
        }

        public a()
        {
            FK = RemoteMediaPlayer.this;
            super();
            FY = 0L;
        }
    }

    private final class a.a
        implements ResultCallback
    {

        private final long FZ;
        final a Ga;

        public void k(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(Ga.FK).b(FZ, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            k((Status)result);
        }

        a.a(a a1, long l)
        {
            Ga = a1;
            super();
            FZ = l;
        }
    }

    private static abstract class b extends Cast.a
    {

        is Gb;

        public Result c(Status status)
        {
            return l(status);
        }

        public MediaChannelResult l(Status status)
        {
            return new MediaChannelResult(this, status) {

                final Status CW;
                final b Gc;

                public JSONObject getCustomData()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return CW;
                }

            
            {
                Gc = b1;
                CW = status;
                super();
            }
            };
        }

        b()
        {
            Gb = new _cls1(this);
        }
    }

    private static final class c
        implements MediaChannelResult
    {

        private final Status CM;
        private final JSONObject Fl;

        public JSONObject getCustomData()
        {
            return Fl;
        }

        public Status getStatus()
        {
            return CM;
        }

        c(Status status, JSONObject jsonobject)
        {
            CM = status;
            Fl = jsonobject;
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
    private final iq FG = new iq() {

        final RemoteMediaPlayer FK;

        protected void onMetadataUpdated()
        {
            RemoteMediaPlayer.b(FK);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.a(FK);
        }

            
            {
                FK = RemoteMediaPlayer.this;
                super();
            }
    };
    private final a FH = new a();
    private OnMetadataUpdatedListener FI;
    private OnStatusUpdatedListener FJ;
    private final Object mw = new Object();

    public RemoteMediaPlayer()
    {
        FG.a(FH);
    }

    static void a(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onStatusUpdated();
    }

    static void b(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onMetadataUpdated();
    }

    static Object c(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.mw;
    }

    static a d(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.FH;
    }

    static iq e(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.FG;
    }

    private void onMetadataUpdated()
    {
        if (FI != null)
        {
            FI.onMetadataUpdated();
        }
    }

    private void onStatusUpdated()
    {
        if (FJ != null)
        {
            FJ.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized (mw)
        {
            l = FG.getApproximateStreamPosition();
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
        synchronized (mw)
        {
            mediainfo = FG.getMediaInfo();
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
        synchronized (mw)
        {
            mediastatus = FG.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return FG.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized (mw)
        {
            l = FG.getStreamDuration();
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
        return googleapiclient.b(new b(googleapiclient, mediainfo, flag, l, al, jsonobject) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;
            final MediaInfo FO;
            final boolean FP;
            final long FQ;
            final long FR[];
            final JSONObject FS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).a(Gb, FO, FP, FQ, FR, FS);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FO = mediainfo;
                FP = flag;
                FQ = l;
                FR = al;
                FS = jsonobject;
                super();
            }
        });
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        FG.aD(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;
            final JSONObject FS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).a(Gb, FS);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FS = jsonobject;
                super();
            }
        });
    }

    public PendingResult play(GoogleApiClient googleapiclient)
    {
        return play(googleapiclient, null);
    }

    public PendingResult play(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;
            final JSONObject FS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).c(Gb, FS);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FS = jsonobject;
                super();
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new b(googleapiclient) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).a(Gb);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                super();
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
        return googleapiclient.b(new b(googleapiclient, l, i, jsonobject) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;
            final JSONObject FS;
            final long FT;
            final int FU;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).a(Gb, FT, FU, FS);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FT = l;
                FU = i;
                FS = jsonobject;
                super();
            }
        });
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
    {
        return googleapiclient.b(new b(googleapiclient, al) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;
            final long FM[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).a(Gb, FM);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FM = al;
                super();
            }
        });
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        FI = onmetadataupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        FJ = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, flag, jsonobject) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;
            final JSONObject FS;
            final boolean FW;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).a(Gb, FW, FS);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FW = flag;
                FS = jsonobject;
                super();
            }
        });
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d1)
        throws IllegalArgumentException
    {
        return setStreamVolume(googleapiclient, d1, null);
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d1, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        } else
        {
            return googleapiclient.b(new b(googleapiclient, d1, jsonobject) {

                final RemoteMediaPlayer FK;
                final GoogleApiClient FL;
                final JSONObject FS;
                final double FV;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((ij)a1);
                }

                protected void a(ij ij1)
                {
                    ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                    ij1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(FK).b(FL);
                    RemoteMediaPlayer.e(FK).a(Gb, FV, FS);
                    RemoteMediaPlayer.d(FK).b(null);
_L1:
                    ij1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    b(l(new Status(2100)));
                    RemoteMediaPlayer.d(FK).b(null);
                      goto _L1
                    obj;
                    ij1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    b(l(new Status(2100)));
                    RemoteMediaPlayer.d(FK).b(null);
                      goto _L1
                    obj;
                    b(l(new Status(2100)));
                    RemoteMediaPlayer.d(FK).b(null);
                      goto _L1
                    obj;
                    RemoteMediaPlayer.d(FK).b(null);
                    throw obj;
                }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FV = d1;
                FS = jsonobject;
                super();
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
            return googleapiclient.b(new b(googleapiclient, texttrackstyle) {

                final RemoteMediaPlayer FK;
                final GoogleApiClient FL;
                final TextTrackStyle FN;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((ij)a1);
                }

                protected void a(ij ij1)
                {
                    ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                    ij1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(FK).b(FL);
                    RemoteMediaPlayer.e(FK).a(Gb, FN);
                    RemoteMediaPlayer.d(FK).b(null);
_L1:
                    ij1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    b(l(new Status(2100)));
                    RemoteMediaPlayer.d(FK).b(null);
                      goto _L1
                    obj;
                    ij1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.d(FK).b(null);
                    throw obj;
                }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FN = texttrackstyle;
                super();
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
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer FK;
            final GoogleApiClient FL;
            final JSONObject FS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
            {
                ij1 = ((ij) (RemoteMediaPlayer.c(FK)));
                ij1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(FK).b(FL);
                RemoteMediaPlayer.e(FK).b(Gb, FS);
                RemoteMediaPlayer.d(FK).b(null);
_L1:
                ij1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(2100)));
                RemoteMediaPlayer.d(FK).b(null);
                  goto _L1
                obj;
                ij1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(FK).b(null);
                throw obj;
            }

            
            {
                FK = RemoteMediaPlayer.this;
                FL = googleapiclient;
                FS = jsonobject;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$b$1

/* anonymous class */
    class b._cls1
        implements is
    {

        final b Gc;

        public void a(long l, int i, JSONObject jsonobject)
        {
            Gc.b(new c(new Status(i), jsonobject));
        }

        public void n(long l)
        {
            Gc.b(Gc.l(new Status(2103)));
        }

            
            {
                Gc = b1;
                super();
            }
    }

}
