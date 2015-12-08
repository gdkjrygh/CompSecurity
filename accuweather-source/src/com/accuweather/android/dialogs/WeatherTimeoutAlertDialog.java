// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dialogs;


// Referenced classes of package com.accuweather.android.dialogs:
//            GenericAlertDialogFragment

public class WeatherTimeoutAlertDialog extends GenericAlertDialogFragment
{

    public WeatherTimeoutAlertDialog()
    {
        setMessageResourceId(com.accuweather.android.R.string.PhraseResultError);
        setTitleResourceId(com.accuweather.android.R.string.WeatherData);
        setPositiveButtonResourceId(com.accuweather.android.R.string.TryAgain);
    }
}
