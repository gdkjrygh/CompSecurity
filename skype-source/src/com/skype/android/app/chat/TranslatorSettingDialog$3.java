// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.widget.CompoundButton;
import com.skype.android.app.chat.picker.OnTranslatorEnabled;
import com.skype.android.event.EventBus;

// Referenced classes of package com.skype.android.app.chat:
//            TranslatorSettingDialog

final class this._cls0
    implements android.widget.angeListener
{

    final TranslatorSettingDialog this$0;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).a != flag)
        {
            TranslatorSettingDialog.access$102(TranslatorSettingDialog.this, true);
        }
        TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).a = flag;
        eventBus.a(new OnTranslatorEnabled(TranslatorSettingDialog.access$200(TranslatorSettingDialog.this), flag));
    }

    ()
    {
        this$0 = TranslatorSettingDialog.this;
        super();
    }
}
