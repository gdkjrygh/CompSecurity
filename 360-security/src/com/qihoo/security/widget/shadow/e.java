// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.shadow;

import android.content.Context;

// Referenced classes of package com.qihoo.security.widget.shadow:
//            ZDepth

public class e
{

    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;

    public e()
    {
    }

    public void a(Context context, ZDepth zdepth)
    {
        a = zdepth.getAlphaTopShadow();
        b = zdepth.getAlphaBottomShadow();
        c = zdepth.getOffsetYTopShadowPx(context);
        d = zdepth.getOffsetYBottomShadowPx(context);
        e = zdepth.getBlurTopShadowPx(context);
        f = zdepth.getBlurBottomShadowPx(context);
    }
}
