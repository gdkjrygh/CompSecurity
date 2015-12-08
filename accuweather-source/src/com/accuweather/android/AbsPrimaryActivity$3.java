// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import com.accuweather.android.utilities.MainContentPage;

// Referenced classes of package com.accuweather.android:
//            AbsPrimaryActivity

static class Page
{

    static final int $SwitchMap$com$accuweather$android$utilities$MainContentPage[];

    static 
    {
        $SwitchMap$com$accuweather$android$utilities$MainContentPage = new int[MainContentPage.values().length];
        try
        {
            $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.Now.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$accuweather$android$utilities$MainContentPage[MainContentPage.MinuteCast.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
