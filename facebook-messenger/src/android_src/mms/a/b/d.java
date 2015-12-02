// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b;

import org.a.a.b.g;

public abstract class d
    implements org.a.a.b.d
{

    final g a;

    d(g g1)
    {
        a = g1;
    }

    public void a(float f)
    {
        a.setAttribute("dur", (new StringBuilder()).append(Integer.toString((int)(1000F * f))).append("ms").toString());
    }
}
