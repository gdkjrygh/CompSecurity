// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a.a;

import jp.co.cyberagent.android.a.an;

final class b
{

    static final int a[];

    static 
    {
        a = new int[an.a().length];
        try
        {
            a[an.b - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[an.c - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[an.d - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[an.a - 1] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
