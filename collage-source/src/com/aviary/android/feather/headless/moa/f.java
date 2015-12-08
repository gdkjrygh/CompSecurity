// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;


// Referenced classes of package com.aviary.android.feather.headless.moa:
//            j

public class f extends j
{

    public f()
    {
        a(Float.valueOf(0.0F));
    }

    public f(float f1)
    {
        a(Float.valueOf(f1));
    }

    public Object a()
    {
        return h;
    }

    public Object clone()
    {
        return new f(((Float)h).floatValue());
    }
}
