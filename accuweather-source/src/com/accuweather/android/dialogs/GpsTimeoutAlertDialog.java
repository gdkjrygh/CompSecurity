// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dialogs;


// Referenced classes of package com.accuweather.android.dialogs:
//            GenericAlertDialogFragment

public class GpsTimeoutAlertDialog extends GenericAlertDialogFragment
{

    public GpsTimeoutAlertDialog()
    {
        setMessageResourceId(com.accuweather.android.R.string.LocationSearchFailed);
        setTitleResourceId(com.accuweather.android.R.string.Error_Word);
        setPositiveButtonResourceId(com.accuweather.android.R.string.TryAgain);
    }
}
