// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui;

import android.app.Dialog;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui:
//            TracksChooserDialog

class this._cls0
    implements android.content.kListener
{

    final TracksChooserDialog this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        getDialog().cancel();
    }

    ()
    {
        this$0 = TracksChooserDialog.this;
        super();
    }
}
