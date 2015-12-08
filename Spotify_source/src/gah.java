// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public final class gah
    implements gwk
{

    private int a;
    private int b;
    private float c;
    private String d;
    private Drawable e;
    private boolean f;

    private gah(Context context, boolean flag)
    {
        a = 50;
        c = 0.5F;
        b = 200;
        f = flag;
        d = (new StringBuilder("RadioCardTransformation")).append(a).append(",").append(c).append(",").append(b).append(",").append(f).append(")").toString();
        e = gcg.a(context, 0x7f020265);
    }

    public gah(Context context, boolean flag, byte byte0)
    {
        this(context, flag);
    }

    public final Bitmap a(Bitmap bitmap)
    {
        return dgb.a(bitmap, e, a, c, b, f);
    }

    public final String a()
    {
        return d;
    }
}
