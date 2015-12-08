// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.anim;


// Referenced classes of package com.google.android.apps.translate.anim:
//            f

public final class e extends f
{

    private final f a[];

    public transient e(f af[])
    {
        a = af;
    }

    public final void a(float f1)
    {
        f af[] = a;
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            af[i].a(f1);
        }

    }
}
