// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


// Referenced classes of package com.facebook.reflex:
//            d

public class Color extends d
{

    public Color()
    {
        a(initialize());
    }

    public Color(int i)
    {
        this();
        setColor((float)android.graphics.Color.alpha(i) / 255F, (float)android.graphics.Color.red(i) / 255F, (float)android.graphics.Color.green(i) / 255F, (float)android.graphics.Color.blue(i) / 255F);
    }

    private native int initialize();

    private native void setColor(float f, float f1, float f2, float f3);

    protected void a()
    {
    }

    protected void c()
    {
    }
}
