// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.skype.android.app.chat:
//            TranslatorSettingDialog

final class this._cls0
    implements android.widget.Listener
{

    final TranslatorSettingDialog this$0;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapter.onItemSelected(i, OTHER);
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = TranslatorSettingDialog.this;
        super();
    }
}
