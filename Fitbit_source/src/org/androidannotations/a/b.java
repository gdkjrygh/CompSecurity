// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.a;


public class b
{

    public b()
    {
    }

    public static int a()
    {
    /* block-local class not found */
    class a {}

        if (android.os.Build.VERSION.RELEASE.startsWith("1.5"))
        {
            return 3;
        } else
        {
            return a.a();
        }
    }
}
