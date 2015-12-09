// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.widget.CompoundButton;
import android.widget.EditText;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            LastFmLoginDialog

final class a
    implements android.widget.ckedChangeListener
{

    private LastFmLoginDialog a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = LastFmLoginDialog.a(a);
        int i;
        if (flag)
        {
            i = 145;
        } else
        {
            i = 129;
        }
        compoundbutton.setInputType(i);
        i = LastFmLoginDialog.a(a).length();
        LastFmLoginDialog.a(a).setSelection(i);
        LastFmLoginDialog.b(a);
    }

    (LastFmLoginDialog lastfmlogindialog)
    {
        a = lastfmlogindialog;
        super();
    }
}
