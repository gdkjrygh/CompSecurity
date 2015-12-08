// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;


// Referenced classes of package com.skype.android.media:
//            CamcorderDeviceProfile

public static final class  extends Enum
{

    public static final B A;
    public static final B B;
    private static final B C[];
    public static final B a;
    public static final B b;
    public static final B c;
    public static final B d;
    public static final B e;
    public static final B f;
    public static final B g;
    public static final B h;
    public static final B i;
    public static final B j;
    public static final B k;
    public static final B l;
    public static final B m;
    public static final B n;
    public static final B o;
    public static final B p;
    public static final B q;
    public static final B r;
    public static final B s;
    public static final B t;
    public static final B u;
    public static final B v;
    public static final B w;
    public static final B x;
    public static final B y;
    public static final B z;

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/skype/android/media/CamcorderDeviceProfile$Key, s1);
    }

    public static [] values()
    {
        return ([])C.clone();
    }

    static 
    {
        a = new <init>("FORCE_FRONT_PREVIEW_SIZE", 0);
        b = new <init>("FORCE_BACK_PREVIEW_SIZE", 1);
        c = new <init>("FORCE_PREVIEW_FORMAT", 2);
        d = new <init>("FORCE_RECORD_SIZE", 3);
        e = new <init>("FORCE_MPEG4_QVGA", 4);
        f = new <init>("FORCE_DEFAULT_AUDIO_SOURCE", 5);
        g = new <init>("FORCE_MEDIA_RECORDER", 6);
        h = new <init>("MIN_PREVIEW_SIZE", 7);
        i = new <init>("MAX_PREVIEW_SIZE", 8);
        j = new <init>("DISABLE_FRONT_CAMERA_PARAMS", 9);
        k = new <init>("DISABLE_BACK_CAMERA_PARAMS", 10);
        l = new <init>("DISABLE_RECORDING_HINT", 11);
        m = new <init>("DISABLE_ORIENTATION_HINT", 12);
        n = new <init>("DISABLE_SURFACE_TEXTURE", 13);
        o = new <init>("DISABLE_VIDEO_STABILIZATION", 14);
        p = new <init>("DISABLE_CONTINUOUS_FOCUS", 15);
        q = new <init>("DISABLE_PREVIEW_SIZES", 16);
        r = new <init>("SYNC_EGL_RENDERING", 17);
        s = new <init>("CAMCORDER_PROFILE_PREVIEW", 18);
        t = new <init>("REVERSE_ACTIVITY_LANDSCAPE_ORIENTATION", 19);
        u = new <init>("AVC_OMX_COLOR_FORMAT", 20);
        v = new <init>("AVC_OMX_ENCODER_PADDING", 21);
        w = new <init>("AVC_OMX_ENCODER_STRIDE", 22);
        x = new <init>("AVC_REVERSE_INPUT_MIRROR", 23);
        y = new <init>("AVC_UV_SWAP", 24);
        z = new <init>("AVC_USE_SOFTWARE_ENCODING", 25);
        A = new <init>("AVC_EGL_DISABLE_RELEASE_THREAD", 26);
        B = new <init>("AVC_EGL_RENDER_MAIN_THREAD", 27);
        C = (new C[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
