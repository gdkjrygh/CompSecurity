// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.media.CamcorderProfile;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.skype.android.media:
//            DeviceProfile, b, Size

public class CamcorderDeviceProfile
    implements DeviceProfile, b
{
    public static final class Key extends Enum
    {

        public static final Key A;
        public static final Key B;
        private static final Key C[];
        public static final Key a;
        public static final Key b;
        public static final Key c;
        public static final Key d;
        public static final Key e;
        public static final Key f;
        public static final Key g;
        public static final Key h;
        public static final Key i;
        public static final Key j;
        public static final Key k;
        public static final Key l;
        public static final Key m;
        public static final Key n;
        public static final Key o;
        public static final Key p;
        public static final Key q;
        public static final Key r;
        public static final Key s;
        public static final Key t;
        public static final Key u;
        public static final Key v;
        public static final Key w;
        public static final Key x;
        public static final Key y;
        public static final Key z;

        public static Key valueOf(String s1)
        {
            return (Key)Enum.valueOf(com/skype/android/media/CamcorderDeviceProfile$Key, s1);
        }

        public static Key[] values()
        {
            return (Key[])C.clone();
        }

        static 
        {
            a = new Key("FORCE_FRONT_PREVIEW_SIZE", 0);
            b = new Key("FORCE_BACK_PREVIEW_SIZE", 1);
            c = new Key("FORCE_PREVIEW_FORMAT", 2);
            d = new Key("FORCE_RECORD_SIZE", 3);
            e = new Key("FORCE_MPEG4_QVGA", 4);
            f = new Key("FORCE_DEFAULT_AUDIO_SOURCE", 5);
            g = new Key("FORCE_MEDIA_RECORDER", 6);
            h = new Key("MIN_PREVIEW_SIZE", 7);
            i = new Key("MAX_PREVIEW_SIZE", 8);
            j = new Key("DISABLE_FRONT_CAMERA_PARAMS", 9);
            k = new Key("DISABLE_BACK_CAMERA_PARAMS", 10);
            l = new Key("DISABLE_RECORDING_HINT", 11);
            m = new Key("DISABLE_ORIENTATION_HINT", 12);
            n = new Key("DISABLE_SURFACE_TEXTURE", 13);
            o = new Key("DISABLE_VIDEO_STABILIZATION", 14);
            p = new Key("DISABLE_CONTINUOUS_FOCUS", 15);
            q = new Key("DISABLE_PREVIEW_SIZES", 16);
            r = new Key("SYNC_EGL_RENDERING", 17);
            s = new Key("CAMCORDER_PROFILE_PREVIEW", 18);
            t = new Key("REVERSE_ACTIVITY_LANDSCAPE_ORIENTATION", 19);
            u = new Key("AVC_OMX_COLOR_FORMAT", 20);
            v = new Key("AVC_OMX_ENCODER_PADDING", 21);
            w = new Key("AVC_OMX_ENCODER_STRIDE", 22);
            x = new Key("AVC_REVERSE_INPUT_MIRROR", 23);
            y = new Key("AVC_UV_SWAP", 24);
            z = new Key("AVC_USE_SOFTWARE_ENCODING", 25);
            A = new Key("AVC_EGL_DISABLE_RELEASE_THREAD", 26);
            B = new Key("AVC_EGL_RENDER_MAIN_THREAD", 27);
            C = (new Key[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B
            });
        }

        private Key(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class Square extends CamcorderDeviceProfile
    {

        public final void d()
        {
            Size size;
            d();
            a(Key.g, Boolean.valueOf(false));
            a(Key.s, Boolean.valueOf(true));
            a(Key.h, Size.j);
            size = Size.e;
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                size = Size.g;
            }
            a(Key.i, size);
            if (Build.BOARD.startsWith("MSM8960") || Build.BOARD.equalsIgnoreCase("MAKO") || Build.BOARD.equalsIgnoreCase("flo"))
            {
                a(Key.d, Size.i);
            }
            if (android.os.Build.VERSION.SDK_INT < 18 && (Build.MODEL.equalsIgnoreCase("GT-I9195") || Build.MODEL.equalsIgnoreCase("GT-I9190")))
            {
                a(Key.m, Boolean.valueOf(true));
            }
            if (!Build.BOARD.equals("MSM8960") && Build.MODEL.equals("HTC One X"))
            {
                a(Key.c, Integer.valueOf(0x32315659));
            }
            a(Key.q, new HashSet(Arrays.asList(new Size[] {
                new Size(576, 432), new Size(704, 576), new Size(528, 432), new Size(1056, 864), new Size(880, 720)
            })));
            size = null;
            if (android.os.Build.VERSION.SDK_INT < 18) goto _L2; else goto _L1
_L1:
            a(Key.h, Size.g);
_L4:
            if (size != null)
            {
                a(Key.a, size);
                a(Key.b, size);
            }
            return;
_L2:
            if (Build.MODEL.equalsIgnoreCase("SAMSUNG-SGH-I747"))
            {
                size = Size.i;
            } else
            if (Build.MODEL.startsWith("GT-I9082"))
            {
                size = Size.e;
            } else
            if (Build.MODEL.startsWith("GT-I919"))
            {
                size = Size.g;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean d(int i1)
        {
            return false;
        }

        public Square()
        {
        }
    }


    private Map b;

    public CamcorderDeviceProfile()
    {
        b = new HashMap();
        d();
    }

    private Object b(Key key, Object obj)
    {
        if (b.containsKey(key))
        {
            obj = b.get(key);
        }
        return obj;
    }

    public final int a(int i1)
    {
        int k1 = ((Integer)b(Key.w, Integer.valueOf(0))).intValue();
        int j1 = i1;
        if (k1 > 0)
        {
            j1 = (i1 + k1) - i1 % k1;
        }
        return j1;
    }

    public final int a(int i1, int j1)
    {
        int k1 = ((Integer)b(Key.v, Integer.valueOf(0))).intValue();
        if (k1 > 0)
        {
            return (i1 * j1) % k1;
        } else
        {
            return 0;
        }
    }

    public final int a(String s)
    {
        int j1 = ((Integer)b(Key.u, Integer.valueOf(0))).intValue();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = 21;
            if (s.startsWith("OMX.TI"))
            {
                i1 = 0x7f000100;
            } else
            {
                if (s.startsWith("OMX.Nvidia"))
                {
                    return 19;
                }
                if (s.startsWith("OMX.MTK"))
                {
                    return 19;
                }
            }
        }
        return i1;
    }

    public final void a(CamcorderProfile camcorderprofile, android.hardware.Camera.Parameters parameters)
    {
        if (((Boolean)b(Key.s, Boolean.valueOf(false))).booleanValue())
        {
            if (parameters != null)
            {
                parameters = parameters.getPreviewSize();
            } else
            {
                parameters = null;
            }
            if (parameters != null)
            {
                int i1 = ((android.hardware.Camera.Size) (parameters)).width;
                int j1 = ((android.hardware.Camera.Size) (parameters)).height;
                if (i1 > j1)
                {
                    camcorderprofile.videoFrameWidth = i1;
                    camcorderprofile.videoFrameHeight = j1;
                } else
                {
                    camcorderprofile.videoFrameWidth = j1;
                    camcorderprofile.videoFrameHeight = i1;
                }
            }
        }
        if (((Boolean)b(Key.e, Boolean.valueOf(false))).booleanValue())
        {
            camcorderprofile.videoCodec = 3;
            camcorderprofile.videoFrameWidth = 320;
            camcorderprofile.videoFrameHeight = 240;
            camcorderprofile.fileFormat = 2;
        }
        if (camcorderprofile.videoCodec != 2)
        {
            camcorderprofile.videoCodec = 2;
        }
    }

    public final void a(Key key, Object obj)
    {
        b.put(key, obj);
    }

    public final boolean a()
    {
        return ((Boolean)b(Key.y, Boolean.valueOf(false))).booleanValue();
    }

    public final boolean a(boolean flag)
    {
label0:
        {
            boolean flag1 = flag;
            if (((Boolean)b(Key.x, Boolean.valueOf(false))).booleanValue())
            {
                if (flag)
                {
                    break label0;
                }
                flag1 = true;
            }
            return flag1;
        }
        return false;
    }

    public final CamcorderProfile b(int i1)
    {
        boolean flag = false;
        int j1 = 0;
        do
        {
label0:
            {
                int k1 = ((flag) ? 1 : 0);
                if (j1 < 4)
                {
                    k1 = (new int[] {
                        4, 7, 0, 1
                    })[j1];
                    if (!CamcorderProfile.hasProfile(i1, k1))
                    {
                        break label0;
                    }
                }
                return CamcorderProfile.get(i1, k1);
            }
            j1++;
        } while (true);
    }

    public final boolean b()
    {
        return ((Boolean)b(Key.A, Boolean.valueOf(false))).booleanValue();
    }

    public final int c(int i1)
    {
label0:
        {
            int j1;
label1:
            {
                j1 = i1;
                if (!((Boolean)b(Key.t, Boolean.valueOf(false))).booleanValue())
                {
                    break label1;
                }
                if (i1 != 8)
                {
                    j1 = i1;
                    if (i1 != 0)
                    {
                        break label1;
                    }
                }
                if (i1 != 0)
                {
                    break label0;
                }
                j1 = 8;
            }
            return j1;
        }
        return 0;
    }

    public final boolean c()
    {
        return ((Boolean)b(Key.z, Boolean.valueOf(false))).booleanValue();
    }

    public void d()
    {
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            if (Build.PRODUCT.equalsIgnoreCase("mantaray") || Build.MODEL.equalsIgnoreCase("GT-I9505") || Build.MODEL.equalsIgnoreCase("GT-I8190") || Build.MODEL.equalsIgnoreCase("GT-I9295") || Build.MODEL.equalsIgnoreCase("GT-S5310") || Build.MODEL.equalsIgnoreCase("SM-G900V") || Build.MODEL.equalsIgnoreCase("SM-N9005") || Build.MODEL.equalsIgnoreCase("GT-S7582") || Build.MODEL.equalsIgnoreCase("GT-N8000") || Build.MODEL.equalsIgnoreCase("GT-I8262") || Build.MODEL.equalsIgnoreCase("GT-I9192") || Build.MODEL.equalsIgnoreCase("GT-S7275T") || Build.MODEL.equalsIgnoreCase("GT-S7392") || Build.MODEL.equalsIgnoreCase("SM-T325") || Build.MODEL.equalsIgnoreCase("SM-T320") || Build.MODEL.equalsIgnoreCase("GT-I9515") || Build.MODEL.startsWith("GT-I9305") || Build.MODEL.startsWith("GT-N710") || Build.MODEL.startsWith("SM-C101") || Build.MODEL.startsWith("SM-C105") || Build.MODEL.startsWith("SM-N900"))
            {
                a(Key.k, Boolean.valueOf(true));
                a(Key.j, Boolean.valueOf(true));
            }
            if (Build.MODEL.equalsIgnoreCase("GT-I9300") || Build.MODEL.equalsIgnoreCase("SGH-T889"))
            {
                a(Key.j, Boolean.valueOf(true));
            }
        }
        if (Build.MODEL.equalsIgnoreCase("GT-I9300I") || Build.PRODUCT.equalsIgnoreCase("BlackBerry"))
        {
            a(Key.g, Boolean.valueOf(true));
        }
        if (Build.MODEL.startsWith("Nokia_X") || Build.MODEL.contains("Hudl") || Build.MODEL.equalsIgnoreCase("HTC One") || Build.MODEL.equalsIgnoreCase("HTC One X") || Build.MODEL.equalsIgnoreCase("HTC One 801e") || Build.MODEL.equalsIgnoreCase("HTC6435LVW") || Build.MODEL.startsWith("SGH-T999") || Build.MODEL.equalsIgnoreCase("SCH-I535"))
        {
            a(Key.s, Boolean.valueOf(true));
            a(Key.i, Size.e);
        }
        if (Build.MODEL.equalsIgnoreCase("GT-S7562"))
        {
            a(Key.n, Boolean.valueOf(true));
            a(Key.a, Size.e);
            a(Key.b, Size.e);
            a(Key.s, Boolean.valueOf(true));
        }
        if (Build.MODEL.equalsIgnoreCase("GT-P7500") || Build.MODEL.equalsIgnoreCase("GT-P7510") || Build.MODEL.equalsIgnoreCase("GT-P7310"))
        {
            a(Key.n, Boolean.valueOf(true));
        }
        if (Build.MODEL.equalsIgnoreCase("HTC Sensation Z710e"))
        {
            a(Key.n, Boolean.valueOf(true));
            a(Key.a, Size.e);
            a(Key.b, Size.e);
            a(Key.s, Boolean.valueOf(true));
        }
        if (Build.MODEL.equals("DROID RAZR"))
        {
            a(Key.b, Size.e);
        }
        if (Build.MODEL.equalsIgnoreCase("GT-S7262"))
        {
            a(Key.b, Size.c);
            a(Key.s, Boolean.valueOf(true));
        }
        if (Build.PRODUCT.equalsIgnoreCase("SGH-I957"))
        {
            a(Key.e, Boolean.valueOf(true));
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Amazon") && (Build.MODEL.startsWith("KFTHWI") || Build.MODEL.startsWith("KFAPWI") || Build.MODEL.startsWith("KFSAWI") || Build.MODEL.startsWith("KFSAWA")))
        {
            a(Key.l, Boolean.valueOf(true));
            a(Key.i, Size.f);
            a(Key.t, Boolean.valueOf(true));
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.startsWith("SD4930UR"))
        {
            a(Key.l, Boolean.valueOf(true));
            a(Key.i, Size.e);
            a(Key.t, Boolean.valueOf(true));
        }
        if (Build.MODEL.equalsIgnoreCase("SM-N900"))
        {
            a(Key.o, Boolean.valueOf(true));
        }
        if (Build.BOARD.startsWith("MSM8960") || Build.BOARD.equalsIgnoreCase("MAKO") || Build.BOARD.equalsIgnoreCase("flo"))
        {
            a(Key.d, Size.g);
        }
        if (Build.BOARD.contains("tegra") || Build.BOARD.contains("grouper"))
        {
            a(Key.r, Boolean.valueOf(true));
        }
        if (Build.MODEL.equals("GT-I8190"))
        {
            a(Key.p, Boolean.valueOf(true));
        }
        if (Build.MODEL.equalsIgnoreCase("ST26a") || Build.MODEL.equalsIgnoreCase("ST26i"))
        {
            a(Key.y, Boolean.valueOf(true));
            a(Key.x, Boolean.valueOf(true));
        }
        if (Build.MODEL.equals("LT25i"))
        {
            a(Key.f, Boolean.valueOf(true));
        }
        if (Build.MODEL.equalsIgnoreCase("GT-I9300I") || Build.MODEL.equalsIgnoreCase("GT-I9500") && android.os.Build.VERSION.SDK_INT == 18)
        {
            a(Key.A, Boolean.valueOf(true));
        }
        if (Build.MODEL.equals("LG-D800"))
        {
            a(Key.w, Integer.valueOf(128));
        }
        if (Build.MODEL.equals("HTC One X") || Build.MODEL.equals("LG-E975"))
        {
            a(Key.v, Integer.valueOf(2048));
        }
        if (Build.MODEL.equals("LT22i"))
        {
            a(Key.z, Boolean.valueOf(true));
            a(Key.a, Size.c);
            a(Key.y, Boolean.valueOf(true));
        }
        if (Build.MODEL.equals("GT-N7100"))
        {
            a(Key.B, Boolean.valueOf(true));
        }
        if (Build.MODEL.equals("Nexus 9"))
        {
            a(Key.l, Boolean.valueOf(true));
        }
    }

    public boolean d(int i1)
    {
        switch (i1)
        {
        default:
            return false;

        case 1: // '\001'
            return ((Boolean)b(Key.j, Boolean.valueOf(false))).booleanValue();

        case 0: // '\0'
            return ((Boolean)b(Key.k, Boolean.valueOf(false))).booleanValue();
        }
    }

    public final Size e(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return (Size)b(Key.a, null);

        case 0: // '\0'
            return (Size)b(Key.b, null);
        }
    }

    public final boolean e()
    {
        return ((Boolean)b(Key.n, Boolean.valueOf(false))).booleanValue();
    }

    public final boolean f()
    {
        return ((Boolean)b(Key.p, Boolean.valueOf(false))).booleanValue();
    }

    public final Set g()
    {
        return (Set)b(Key.q, null);
    }

    public final Integer h()
    {
        return (Integer)b(Key.c, null);
    }

    public final Size i()
    {
        return (Size)b(Key.d, null);
    }

    public final boolean j()
    {
        return ((Boolean)b(Key.f, Boolean.valueOf(false))).booleanValue();
    }

    public final boolean k()
    {
        return ((Boolean)b(Key.g, Boolean.valueOf(false))).booleanValue();
    }

    public final boolean l()
    {
        return ((Boolean)b(Key.m, Boolean.valueOf(false))).booleanValue();
    }

    public final Size m()
    {
        return (Size)b(Key.h, Size.c);
    }

    public final Size n()
    {
        return (Size)b(Key.i, Size.a);
    }

    public final boolean o()
    {
        return ((Boolean)b(Key.o, Boolean.valueOf(false))).booleanValue();
    }

    public final boolean p()
    {
        return ((Boolean)b(Key.l, Boolean.valueOf(false))).booleanValue();
    }

    public final boolean q()
    {
        return ((Boolean)b(Key.r, Boolean.valueOf(false))).booleanValue();
    }

    public final boolean r()
    {
        return ((Boolean)b(Key.B, Boolean.valueOf(false))).booleanValue();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("\n");
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); stringbuilder.append("\n"))
        {
            Key key = (Key)iterator.next();
            stringbuilder.append(key.toString().toLowerCase());
            stringbuilder.append(" : ");
            stringbuilder.append(b.get(key));
        }

        return stringbuilder.toString();
    }
}
