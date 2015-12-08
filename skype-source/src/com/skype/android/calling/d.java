// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.Video;
import com.skype.VideoImpl;
import com.skype.android.video.render.GLTextureView;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.calling:
//            a, VideoCall, BindingRendererContext

final class d
    implements android.view.TextureView.SurfaceTextureListener, BindingRendererContext.a, a
{

    private VideoCall a;
    private Participant b;
    private Set c;
    private GLTextureView d;
    private final Object e = new Object();
    private BindingRendererContext f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private long k;
    private long l;
    private long m;
    private int n;
    private boolean o;

    d(VideoCall videocall, Participant participant)
    {
        a = videocall;
        b = participant;
        c = new CopyOnWriteArraySet();
        g = 320;
        h = 240;
        i = false;
        j = SystemClock.elapsedRealtime();
        k = j;
        l = j;
    }

    private Video a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        obj = (Video)iterator.next();
        j1 = ((Video) (obj)).getObjectID();
        if (j1 != i1) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((Video) (obj));
_L2:
        obj = new VideoImpl();
        VideoCall.a.info((new StringBuilder("createVideo new video object ")).append(i1).toString());
        if (a.b().getVideo(i1, ((Video) (obj))) && (((Video) (obj)).getMediaTypeProp() == com.skype.Video.MEDIATYPE.MEDIA_VIDEO || ((Video) (obj)).getMediaTypeProp() == com.skype.Video.MEDIATYPE.MEDIA_SCREENSHARING))
        {
            ((Video) (obj)).addListener(a.c());
            ((Video) (obj)).addListener(a.c());
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_154;
        obj;
        throw obj;
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void a(Video video, GLTextureView gltextureview)
    {
        VideoCall.a.info((new StringBuilder("createBinding ")).append(Integer.toHexString(s())).toString());
        synchronized (e)
        {
            if (f == null)
            {
                f = new BindingRendererContext(video, gltextureview, this);
            }
        }
        return;
        video;
        obj;
        JVM INSTR monitorexit ;
        throw video;
    }

    static void a(d d1)
    {
        d1.t();
    }

    static void a(d d1, Video video, GLTextureView gltextureview)
    {
        d1.a(video, gltextureview);
    }

    private void a(boolean flag)
    {
        if (flag == i)
        {
            return;
        }
        VideoCall.a.info((new StringBuilder("speaker ")).append(b.getIdentityProp()).append(" setSpeaker ").append(flag).toString());
        long l1 = SystemClock.elapsedRealtime();
        if (flag)
        {
            j = l1;
        } else
        {
            k = l1;
            l1 = (k - j) / 1000L;
            u();
            m = m + l1;
            VideoCall.a.info((new StringBuilder("speaker ")).append(b.getIdentityProp()).append(" spoke for ").append(l1).append(" total ").append(m).append(" seconds").toString());
        }
        i = flag;
    }

    static Set b(d d1)
    {
        return d1.c;
    }

    static VideoCall c(d d1)
    {
        return d1.a;
    }

    static GLTextureView d(d d1)
    {
        return d1.d;
    }

    private void r()
    {
        if (d != null)
        {
            a.d().post(new Runnable() {

                final d a;

                public final void run()
                {
                    a.j();
                }

            
            {
                a = d.this;
                super();
            }
            });
        }
    }

    private int s()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        int i1;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        i1 = (int)f.b();
        return i1;
        obj;
        JVM INSTR monitorexit ;
        return 0;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void t()
    {
        VideoCall.a.info((new StringBuilder("releaseBinding ")).append(Integer.toHexString(s())).toString());
        synchronized (e)
        {
            if (f != null)
            {
                f.a();
                f = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void u()
    {
        long l1 = SystemClock.elapsedRealtime();
        if (l1 - l > 60000L)
        {
            VideoCall.a.info((new StringBuilder("speaker ")).append(b.getIdentityProp()).append(" currentTime ").append(l1).append(" spokenSampleTime ").append(l).append(" clearing spoken time").toString());
            l = l1;
            m = 0L;
        }
    }

    public final View a(Context context)
    {
        VideoCall.a.info((new StringBuilder("attachView ")).append(Integer.toHexString(s())).append(" view ").append(d).toString());
        if (d == null)
        {
            d = new GLTextureView(context);
            d.setSurfaceTextureListener(this);
            l();
        }
        return d;
    }

    public final Participant a()
    {
        return b;
    }

    public final void a(int i1, int j1)
    {
        VideoCall.a.info((new StringBuilder("onSizeChanged: ")).append(i1).append("x").append(j1).toString());
        g = i1;
        h = j1;
        r();
    }

    public final void a(Conversation conversation)
    {
        conversation = conversation.getLocalLiveStatusProp();
        VideoCall.a.info((new StringBuilder("handleConversationLocalLiveStatusChanged status: ")).append(conversation).toString());
        static final class _cls4
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[com.skype.Participant.VOICE_STATUS.values().length];
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.VOICE_STOPPED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.VOICE_CONNECTING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.RINGING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.EARLY_MEDIA.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.LISTENING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.SPEAKING.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.VOICE_NA.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.VOICE_UNKNOWN.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.VOICE_AVAILABLE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    c[com.skype.Participant.VOICE_STATUS.VOICE_ON_HOLD.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                b = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    b[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.skype.Video.STATUS.values().length];
                try
                {
                    a[com.skype.Video.STATUS.RUNNING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.skype.Video.STATUS.PAUSED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.skype.Video.STATUS.AVAILABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4.b[conversation.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.d().post(new Runnable() {

                final d a;

                public final void run()
                {
                    for (Iterator iterator = a.b().iterator(); iterator.hasNext(); d.a(a))
                    {
                        ((Video)iterator.next()).stop();
                    }

                    Video video;
                    b b1;
                    for (Iterator iterator1 = d.b(a).iterator(); iterator1.hasNext(); video.removeListener(b1))
                    {
                        video = (Video)iterator1.next();
                        b1 = d.c(a).c();
                        video.removeListener(b1);
                    }

                }

            
            {
                a = d.this;
                super();
            }
            });
            break;
        }
    }

    public final void a(Video video)
    {
        VideoCall.a.info((new StringBuilder("handleVideoStatusChange ")).append(video.getStatusProp()).append(" objid ").append(video.getObjectID()).toString());
        _cls4.a[video.getStatusProp().ordinal()];
        JVM INSTR tableswitch 3 3: default 76
    //                   3 77;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (d != null)
        {
            a.d().post(new Runnable(video) {

                final Video a;
                final d b;

                public final void run()
                {
                    d.a(b, a, d.d(b));
                    a.start();
                }

            
            {
                b = d.this;
                a = video;
                super();
            }
            });
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final Set b()
    {
        return c;
    }

    public final void b(int i1, int j1)
    {
        synchronized (e)
        {
            if (f != null)
            {
                f.a(i1, j1);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        com.skype.Participant.VOICE_STATUS voice_status = b.getVoiceStatusProp();
        switch (_cls4.c[voice_status.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            n = (int)TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime());
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            n = 0;
            break;
        }
    }

    public final void d()
    {
        VideoCall.a.info((new StringBuilder("detachView ")).append(Integer.toHexString(s())).append(" view ").append(d).toString());
        t();
        d = null;
    }

    public final int e()
    {
        return g;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof d)
        {
            return ((d)obj).b.getIdentityProp().equals(b.getIdentityProp());
        } else
        {
            return false;
        }
    }

    public final int f()
    {
        return h;
    }

    public final long g()
    {
        u();
        return m;
    }

    public final boolean h()
    {
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Video video = (Video)iterator.next();
            switch (_cls4.a[video.getStatusProp().ordinal()])
            {
            case 1: // '\001'
            case 2: // '\002'
                return true;
            }
        } while (true);
        return false;
    }

    public final void i()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        r();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void j()
    {
        if (d == null)
        {
            return;
        }
        float f1 = (float)d.getWidth() / (float)g;
        float f2 = (float)d.getHeight() / (float)h;
        Matrix matrix = d.getTransform(null);
        float f3;
        float f4;
        int i1;
        int j1;
        if (o)
        {
            f1 = Math.min(f1, f2);
        } else
        {
            f1 = Math.max(f1, f2);
        }
        i1 = (int)((float)g * f1);
        j1 = (int)((float)h * f1);
        f1 = (float)i1 / (float)d.getWidth();
        f2 = (float)j1 / (float)d.getHeight();
        f3 = (d.getWidth() - i1) / 2;
        f4 = (d.getHeight() - j1) / 2;
        matrix.setScale(f1, f2);
        matrix.postTranslate(f3, f4);
        d.setTransform(matrix);
    }

    public final void k()
    {
        int i1 = b.getSoundLevelProp();
        VideoCall.a.info((new StringBuilder("speaker ")).append(b.getIdentityProp()).append(" soundLevel changed to ").append(i1).toString());
        if (i1 >= 5)
        {
            a(true);
            return;
        } else
        {
            a(false);
            return;
        }
    }

    final Set l()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = b.getLiveSessionVideos();
        VideoCall.a.info((new StringBuilder("updateParticipantVideo video objects: ")).append(((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_videoObjectIDList.length).toString());
        if (!((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_return || ((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_videoObjectIDList.length <= 0) goto _L2; else goto _L1
_L1:
        int ai[];
        int j1;
        c.clear();
        ai = ((com.skype.Participant.GetLiveSessionVideos_Result) (obj)).m_videoObjectIDList;
        j1 = ai.length;
        int i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        Video video = a(ai[i1]);
        if (video == null) goto _L5; else goto _L4
_L4:
        c.add(video);
        com.skype.Video.STATUS status = video.getStatusProp();
        if (d != null)
        {
            a(video, d);
        }
        if (status == com.skype.Video.STATUS.AVAILABLE || status == com.skype.Video.STATUS.NOT_STARTED)
        {
            VideoCall.a.info("updateParticipantVideo video.start");
            video.start();
        }
          goto _L5
_L2:
        ai = c;
        this;
        JVM INSTR monitorexit ;
        return ai;
        Exception exception;
        exception;
        throw exception;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean m()
    {
        long l1 = SystemClock.elapsedRealtime();
        if (!i) goto _L2; else goto _L1
_L1:
        l1 -= j;
        if (l1 < 2000L || l1 > 20000L) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (l1 - k >= 2000L)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final boolean n()
    {
        switch (_cls4.c[b.getVoiceStatusProp().ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        default:
            return true;

        case 1: // '\001'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return false;
        }
    }

    public final boolean o()
    {
        switch (_cls4.c[b.getVoiceStatusProp().ordinal()])
        {
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        default:
            return false;

        case 5: // '\005'
        case 6: // '\006'
        case 10: // '\n'
            return true;
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        VideoCall.a.info((new StringBuilder("onSurfaceTextureAvailable ")).append(i1).append("x").append(j1).toString());
        l();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        VideoCall.a.info("onSurfaceTextureDestroyed");
        t();
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        VideoCall.a.info((new StringBuilder("onSurfaceTextureSizeChanged ")).append(i1).append("x").append(j1).toString());
        synchronized (e)
        {
            if (f != null)
            {
                f.a(i1, j1);
            }
        }
        return;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public final int p()
    {
        if (n == 0)
        {
            return n;
        } else
        {
            return (int)TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()) - n;
        }
    }

    public final boolean q()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            Video video = (Video)iterator.next();
            com.skype.Video.STATUS status = video.getStatusProp();
            boolean flag;
            if (com.skype.Video.STATUS.STARTING == status || com.skype.Video.STATUS.RUNNING == status)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (video.getMediaTypeProp() == com.skype.Video.MEDIATYPE.MEDIA_SCREENSHARING)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b.getIdentityProp()).append(" video: ").append(c.size()).toString();
    }
}
