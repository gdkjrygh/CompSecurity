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
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.it;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.iv;
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
        implements iu
    {

        final RemoteMediaPlayer GA;
        private GoogleApiClient GN;
        private long GO;

        public void a(String s, String s1, long l, String s2)
            throws IOException
        {
            if (GN == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(GN, s, s1).setResultCallback(new a(this, l));
                return;
            }
        }

        public void b(GoogleApiClient googleapiclient)
        {
            GN = googleapiclient;
        }

        public long fS()
        {
            long l = GO + 1L;
            GO = l;
            return l;
        }

        public a()
        {
            GA = RemoteMediaPlayer.this;
            super();
            GO = 0L;
        }
    }

    private final class a.a
        implements ResultCallback
    {

        private final long GP;
        final a GQ;

        public void j(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(GQ.GA).b(GP, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            j((Status)result);
        }

        a.a(a a1, long l)
        {
            GQ = a1;
            super();
            GP = l;
        }
    }

    private static abstract class b extends Cast.a
    {

        iv GR;

        public Result c(Status status)
        {
            return k(status);
        }

        public MediaChannelResult k(Status status)
        {
            return new MediaChannelResult(this, status) {

                final Status DS;
                final b GS;

                public JSONObject getCustomData()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                GS = b1;
                DS = status;
                super();
            }
            };
        }

        b(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            GR = new _cls1(this);
        }
    }

    private static final class c
        implements MediaChannelResult
    {

        private final Status Eb;
        private final JSONObject Ga;

        public JSONObject getCustomData()
        {
            return Ga;
        }

        public Status getStatus()
        {
            return Eb;
        }

        c(Status status, JSONObject jsonobject)
        {
            Eb = status;
            Ga = jsonobject;
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
    private final it Gw = new it() {

        final RemoteMediaPlayer GA;

        protected void onMetadataUpdated()
        {
            RemoteMediaPlayer.b(GA);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.a(GA);
        }

            
            {
                GA = RemoteMediaPlayer.this;
                super();
            }
    };
    private final a Gx = new a();
    private OnMetadataUpdatedListener Gy;
    private OnStatusUpdatedListener Gz;
    private final Object mH = new Object();

    public RemoteMediaPlayer()
    {
        Gw.a(Gx);
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
        return remotemediaplayer.mH;
    }

    static a d(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.Gx;
    }

    static it e(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.Gw;
    }

    private void onMetadataUpdated()
    {
        if (Gy != null)
        {
            Gy.onMetadataUpdated();
        }
    }

    private void onStatusUpdated()
    {
        if (Gz != null)
        {
            Gz.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized (mH)
        {
            l = Gw.getApproximateStreamPosition();
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
        synchronized (mH)
        {
            mediainfo = Gw.getMediaInfo();
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
        synchronized (mH)
        {
            mediastatus = Gw.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return Gw.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized (mH)
        {
            l = Gw.getStreamDuration();
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
        return googleapiclient.b(new b(googleapiclient, googleapiclient, mediainfo, flag, l, al, jsonobject) {

            final RemoteMediaPlayer GA;
            final GoogleApiClient GB;
            final MediaInfo GE;
            final boolean GF;
            final long GG;
            final long GH[];
            final JSONObject GI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((im)a1);
            }

            protected void a(im im1)
            {
                im1 = ((im) (RemoteMediaPlayer.c(GA)));
                im1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(GA).b(GB);
                RemoteMediaPlayer.e(GA).a(GR, GE, GF, GG, GH, GI);
                RemoteMediaPlayer.d(GA).b(null);
_L1:
                im1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                im1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(GA).b(null);
                throw obj;
            }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GE = mediainfo;
                GF = flag;
                GG = l;
                GH = al;
                GI = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        Gw.aD(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, googleapiclient, jsonobject) {

            final RemoteMediaPlayer GA;
            final GoogleApiClient GB;
            final JSONObject GI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((im)a1);
            }

            protected void a(im im1)
            {
                im1 = ((im) (RemoteMediaPlayer.c(GA)));
                im1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(GA).b(GB);
                RemoteMediaPlayer.e(GA).a(GR, GI);
                RemoteMediaPlayer.d(GA).b(null);
_L1:
                im1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                im1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(GA).b(null);
                throw obj;
            }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GI = jsonobject;
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
        return googleapiclient.b(new b(googleapiclient, googleapiclient, jsonobject) {

            final RemoteMediaPlayer GA;
            final GoogleApiClient GB;
            final JSONObject GI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((im)a1);
            }

            protected void a(im im1)
            {
                im1 = ((im) (RemoteMediaPlayer.c(GA)));
                im1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(GA).b(GB);
                RemoteMediaPlayer.e(GA).c(GR, GI);
                RemoteMediaPlayer.d(GA).b(null);
_L1:
                im1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                im1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(GA).b(null);
                throw obj;
            }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GI = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new b(googleapiclient, googleapiclient) {

            final RemoteMediaPlayer GA;
            final GoogleApiClient GB;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((im)a1);
            }

            protected void a(im im1)
            {
                im1 = ((im) (RemoteMediaPlayer.c(GA)));
                im1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(GA).b(GB);
                RemoteMediaPlayer.e(GA).a(GR);
                RemoteMediaPlayer.d(GA).b(null);
_L1:
                im1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                im1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(GA).b(null);
                throw obj;
            }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
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
        return googleapiclient.b(new b(googleapiclient, googleapiclient, l, i, jsonobject) {

            final RemoteMediaPlayer GA;
            final GoogleApiClient GB;
            final JSONObject GI;
            final long GJ;
            final int GK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((im)a1);
            }

            protected void a(im im1)
            {
                im1 = ((im) (RemoteMediaPlayer.c(GA)));
                im1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(GA).b(GB);
                RemoteMediaPlayer.e(GA).a(GR, GJ, GK, GI);
                RemoteMediaPlayer.d(GA).b(null);
_L1:
                im1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                im1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(GA).b(null);
                throw obj;
            }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GJ = l;
                GK = i;
                GI = jsonobject;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
    {
        if (al == null || al.length == 0)
        {
            throw new IllegalArgumentException("trackIds cannot be null or empty");
        } else
        {
            return googleapiclient.b(new b(googleapiclient, googleapiclient, al) {

                final RemoteMediaPlayer GA;
                final GoogleApiClient GB;
                final long GC[];

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                {
                    im1 = ((im) (RemoteMediaPlayer.c(GA)));
                    im1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(GA).b(GB);
                    RemoteMediaPlayer.e(GA).a(GR, GC);
                    RemoteMediaPlayer.d(GA).b(null);
_L1:
                    im1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    b(k(new Status(2100)));
                    RemoteMediaPlayer.d(GA).b(null);
                      goto _L1
                    obj;
                    im1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.d(GA).b(null);
                    throw obj;
                }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GC = al;
                super(googleapiclient);
            }
            });
        }
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        Gy = onmetadataupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        Gz = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, googleapiclient, flag, jsonobject) {

            final RemoteMediaPlayer GA;
            final GoogleApiClient GB;
            final JSONObject GI;
            final boolean GM;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((im)a1);
            }

            protected void a(im im1)
            {
                im1 = ((im) (RemoteMediaPlayer.c(GA)));
                im1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(GA).b(GB);
                RemoteMediaPlayer.e(GA).a(GR, GM, GI);
                RemoteMediaPlayer.d(GA).b(null);
_L1:
                im1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                im1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                RemoteMediaPlayer.d(GA).b(null);
                throw obj;
            }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GM = flag;
                GI = jsonobject;
                super(googleapiclient);
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
            return googleapiclient.b(new b(googleapiclient, googleapiclient, d1, jsonobject) {

                final RemoteMediaPlayer GA;
                final GoogleApiClient GB;
                final JSONObject GI;
                final double GL;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                {
                    im1 = ((im) (RemoteMediaPlayer.c(GA)));
                    im1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(GA).b(GB);
                    RemoteMediaPlayer.e(GA).a(GR, GL, GI);
                    RemoteMediaPlayer.d(GA).b(null);
_L1:
                    im1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    b(k(new Status(2100)));
                    RemoteMediaPlayer.d(GA).b(null);
                      goto _L1
                    obj;
                    im1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    b(k(new Status(2100)));
                    RemoteMediaPlayer.d(GA).b(null);
                      goto _L1
                    obj;
                    b(k(new Status(2100)));
                    RemoteMediaPlayer.d(GA).b(null);
                      goto _L1
                    obj;
                    RemoteMediaPlayer.d(GA).b(null);
                    throw obj;
                }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GL = d1;
                GI = jsonobject;
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
            return googleapiclient.b(new b(googleapiclient, googleapiclient, texttrackstyle) {

                final RemoteMediaPlayer GA;
                final GoogleApiClient GB;
                final TextTrackStyle GD;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                {
                    im1 = ((im) (RemoteMediaPlayer.c(GA)));
                    im1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(GA).b(GB);
                    RemoteMediaPlayer.e(GA).a(GR, GD);
                    RemoteMediaPlayer.d(GA).b(null);
_L1:
                    im1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    b(k(new Status(2100)));
                    RemoteMediaPlayer.d(GA).b(null);
                      goto _L1
                    obj;
                    im1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.d(GA).b(null);
                    throw obj;
                }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GD = texttrackstyle;
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
        return googleapiclient.b(new b(googleapiclient, googleapiclient, jsonobject) {

            final RemoteMediaPlayer GA;
            final GoogleApiClient GB;
            final JSONObject GI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((im)a1);
            }

            protected void a(im im1)
            {
                im1 = ((im) (RemoteMediaPlayer.c(GA)));
                im1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(GA).b(GB);
                RemoteMediaPlayer.e(GA).b(GR, GI);
                RemoteMediaPlayer.d(GA).b(null);
_L1:
                im1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(k(new Status(2100)));
                RemoteMediaPlayer.d(GA).b(null);
                  goto _L1
                obj;
                im1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(GA).b(null);
                throw obj;
            }

            
            {
                GA = RemoteMediaPlayer.this;
                GB = googleapiclient1;
                GI = jsonobject;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$b$1

/* anonymous class */
    class b._cls1
        implements iv
    {

        final b GS;

        public void a(long l, int i, JSONObject jsonobject)
        {
            GS.b(new c(new Status(i), jsonobject));
        }

        public void n(long l)
        {
            GS.b(GS.k(new Status(2103)));
        }

            
            {
                GS = b1;
                super();
            }
    }

}
