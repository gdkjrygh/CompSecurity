// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dialogs;


// Referenced classes of package com.accuweather.android.dialogs:
//            GenericAlertDialogFragment

public class NoConnectionAlertDialog extends GenericAlertDialogFragment
{

    public NoConnectionAlertDialog()
    {
        hideNegativeButton();
        setMessageResourceId(com.accuweather.android.R.string.PhraseCannotConnectToServer);
        setTitleResourceId(com.accuweather.android.R.string.NetworkConnectionError);
        setPositiveButtonResourceId(com.accuweather.android.R.string.OK);
        setCancelable(false);
    }
}
