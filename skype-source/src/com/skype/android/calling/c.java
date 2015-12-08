// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.Video;
import com.skype.VideoImpl;
import com.skype.android.video.ControlUnit;
import com.skype.android.video.DeviceProfile;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.calling:
//            CameraControl, a, CameraFacing, e, 
//            VideoCall

final class c
    implements android.view.TextureView.SurfaceTextureListener, CameraControl, a
{

    private VideoCall a;
    private Participant b;
    private Set c;
    private CameraFacing d;
    private com.skype.Conversation.LOCAL_LIVESTATUS e;
    private View f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private WindowManager m;
    private boolean n;
    private boolean o;

    c(VideoCall videocall, Participant participant, boolean flag)
    {
        o = true;
        a = videocall;
        b = participant;
        n = flag;
        c = new CopyOnWriteArraySet();
        l = -1;
        d = CameraFacing.c;
        g = 320;
        h = 240;
        i = g;
        j = h;
    }

    static VideoCall a(c c1)
    {
        return c1.a;
    }

    public final View a(Context context)
    {
        int i1 = 0;
        if (f == null)
        {
            if (!n || DeviceProfile.isHwEncoderEnabled())
            {
                context = new SurfaceView(context);
                context.setZOrderOnTop(false);
                if (!DeviceProfile.isHwEncoderEnabled())
                {
                    i1 = 3;
                }
                context.getHolder().addCallback(new e(f, i1));
                f = context;
            } else
            {
                context = new TextureView(context);
                context.setSurfaceTextureListener(this);
                f = context;
            }
            m = (WindowManager)f.getContext().getSystemService("window");
            l = -1;
            k();
        }
        return f;
    }

    public final Participant a()
    {
        return b;
    }

    public final void a(int i1, int j1)
    {
        if (m == null)
        {
            return;
        } else
        {
            g = i1;
            h = j1;
            l = -1;
            k();
            return;
        }
    }

    public final void a(Conversation conversation)
    {
        com.skype.Conversation.LOCAL_LIVESTATUS local_livestatus = conversation.getLocalLiveStatusProp();
        if (e != com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_LOCALLY && e != com.skype.Conversation.LOCAL_LIVESTATUS.ON_HOLD_REMOTELY) goto _L2; else goto _L1
_L1:
        if (local_livestatus == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE)
        {
            a(d);
        }
_L4:
        e = local_livestatus;
        return;
_L2:
        static final class _cls2
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[CameraFacing.values().length];
                try
                {
                    c[CameraFacing.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    c[CameraFacing.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                b = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                try
                {
                    b[com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.skype.Video.STATUS.values().length];
                try
                {
                    a[com.skype.Video.STATUS.STARTING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.skype.Video.STATUS.RUNNING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.skype.Video.STATUS.PAUSED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.b[local_livestatus.ordinal()])
        {
        default:
            break;

        case 1: // '\001'
label0:
            {
                Object obj1 = null;
                Object obj = obj1;
                if (d == CameraFacing.c)
                {
                    break label0;
                }
                Iterator iterator = c.iterator();
                do
                {
                    obj = obj1;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    Video video1 = (Video)iterator.next();
                    if (d == CameraFacing.a)
                    {
                        obj = "FRONT CAMERA";
                    } else
                    {
                        obj = "/BACK";
                    }
                } while (!video1.getDeviceNameProp().equalsIgnoreCase(((String) (obj))));
                obj = video1;
            }
            if (obj != null)
            {
                conversation.attachVideoToLiveSession(((Video) (obj)).getObjectID());
            }
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            Video video;
            for (conversation = c.iterator(); conversation.hasNext(); a.d().post(new Runnable(video) {

        final Video a;
        final c b;

        public final void run()
        {
            b b1 = c.a(b).c();
            a.removeListener(b1);
            a.removeListener(b1);
        }

            
            {
                b = c.this;
                a = video;
                super();
            }
    }))
            {
                video = (Video)conversation.next();
                video.stop();
            }

            c.clear();
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Video video)
    {
        String s = video.getDeviceNameProp();
        _cls2.c[d.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 96
    //                   2 106;
           goto _L1 _L2 _L3
_L1:
        boolean flag = false;
_L5:
        if (flag && video.getStatusProp() == com.skype.Video.STATUS.AVAILABLE)
        {
            video.start();
            VideoCall.a.info((new StringBuilder()).append(video.getDeviceNameProp()).append(" start ").toString());
        }
        return;
_L2:
        flag = s.equals("FRONT CAMERA");
        continue; /* Loop/switch isn't completed */
_L3:
        flag = s.equals("BACK CAMERA");
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(CameraFacing camerafacing)
    {
        Object obj2;
        obj2 = null;
        if (d == camerafacing)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        if (camerafacing == CameraFacing.c)
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((Video)iterator.next()).stop()) { }
            break MISSING_BLOCK_LABEL_422;
        }
        _cls2.c[camerafacing.ordinal()];
        JVM INSTR tableswitch 1 2: default 84
    //                   1 366
    //                   2 376;
           goto _L1 _L2 _L3
_L1:
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
_L5:
        Video video = ((Video) (obj2));
        if (obj1 != null)
        {
            Iterator iterator1 = c.iterator();
            do
            {
                video = ((Video) (obj2));
                if (!iterator1.hasNext())
                {
                    break;
                }
                video = (Video)iterator1.next();
            } while (!video.getDeviceNameProp().equals(obj1));
        }
        obj2 = video;
        if (video == null)
        {
            int i1 = a.b().createLocalVideo(com.skype.Video.MEDIATYPE.MEDIA_VIDEO, ((String) (obj1)), ((String) (obj)));
            obj2 = new VideoImpl();
            a.b().getVideo(i1, ((Video) (obj2)));
            ((Video) (obj2)).addListener(a.c());
            ((Video) (obj2)).addListener(a.c());
            c.add(obj2);
            a.a().attachVideoToLiveSession(((Video) (obj2)).getObjectID());
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        obj = c.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (Video)((Iterator) (obj)).next();
            if (!((Video) (obj1)).getDeviceNameProp().equals(((Video) (obj2)).getDeviceNameProp()) && ((Video) (obj1)).getStatusProp() == com.skype.Video.STATUS.RUNNING)
            {
                ((Video) (obj1)).stop();
                VideoCall.a.info((new StringBuilder()).append(((Video) (obj1)).getDeviceNameProp()).append(" video.stop()").toString());
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        obj1 = "FRONT CAMERA";
        obj = "/FRONT";
        continue; /* Loop/switch isn't completed */
_L3:
        obj1 = "BACK CAMERA";
        obj = "/BACK";
        if (true) goto _L5; else goto _L4
_L4:
        ((Video) (obj2)).start();
        VideoCall.a.info((new StringBuilder("set camera status ")).append(((Video) (obj2)).getStatusProp()).toString());
        d = camerafacing;
    }

    public final boolean a(int i1, int j1, int k1, int l1, Rect rect)
    {
        if (o && k1 > i1 && l1 > j1 && j > 0 && i > 0)
        {
            int i2 = k1 - i1;
            int j2 = l1 - j1;
            int k2 = i2 * j;
            int l2 = j2 * i;
            if (l2 > k2)
            {
                rect.left = i1;
                rect.right = k1;
                i1 = (j2 - k2 / i) / 2;
                rect.top = j1 + i1;
                rect.bottom = l1 - i1;
                return true;
            }
            if (l2 < k2)
            {
                rect.top = j1;
                rect.bottom = l1;
                j1 = (i2 - l2 / j) / 2;
                rect.left = i1 + j1;
                rect.right = k1 - j1;
                return true;
            }
        }
        return false;
    }

    public final Set b()
    {
        return c;
    }

    public final void c()
    {
    }

    public final void d()
    {
        if (f instanceof TextureView)
        {
            ((TextureView)f).setSurfaceTextureListener(null);
        }
        f = null;
        m = null;
    }

    public final int e()
    {
        return i;
    }

    public final int f()
    {
        return j;
    }

    public final long g()
    {
        return 0L;
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
            switch (_cls2.a[video.getStatusProp().ordinal()])
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
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
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Set j()
    {
        EnumSet enumset = EnumSet.of(CameraFacing.c);
        if (ControlUnit.hasBackCamera())
        {
            enumset.add(CameraFacing.b);
        }
        if (ControlUnit.hasFrontCamera())
        {
            enumset.add(CameraFacing.a);
        }
        return enumset;
    }

    public final void k()
    {
        int j1;
        if (m != null)
        {
            if (l != (j1 = m.getDefaultDisplay().getRotation() * 90))
            {
                int i1;
                if (d == CameraFacing.a)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (DeviceProfile.changePreviewDimensions(i1, j1))
                {
                    i = h;
                    j = g;
                } else
                {
                    i = g;
                    j = h;
                }
                l = j1;
                return;
            }
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        k = ControlUnit.registerView(surfacetexture, 0, 3, 0);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        ControlUnit.unregisterView(k, 0, 3, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        ControlUnit.sendControlCommand(4, 0, i1, j1);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b.getIdentityProp()).append(" (local) video: ").append(c.size()).append("size ").append(i).append(" x ").append(j).toString();
    }
}
