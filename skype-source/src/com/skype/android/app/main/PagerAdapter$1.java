// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;


// Referenced classes of package com.skype.android.app.main:
//            PagerAdapter, HubSection

static final class 
{

    static final int $SwitchMap$com$skype$android$app$main$HubSection[];

    static 
    {
        $SwitchMap$com$skype$android$app$main$HubSection = new int[HubSection.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$main$HubSection[HubSection.RECENTS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$main$HubSection[HubSection.FAVORITES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$main$HubSection[HubSection.CONTACTS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
