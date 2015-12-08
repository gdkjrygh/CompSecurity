// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.enums.AppStore;

public final class aa
{

    public static final int a[];

    static 
    {
        a = new int[AppStore.values().length];
        try
        {
            a[AppStore.GOOGLE_PLAY_STORE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[AppStore.KINDLE_STORE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
