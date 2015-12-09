// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.internal.LikeActionController;

public final class aqy
    implements Runnable
{

    private String a;
    private String b;

    public aqy(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final void run()
    {
        LikeActionController.a(a, b);
    }
}
