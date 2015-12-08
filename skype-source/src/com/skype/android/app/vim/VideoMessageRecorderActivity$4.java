// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.DialogInterface;
import com.skype.android.app.InfoDialogFragment;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

final class val.message
    implements Runnable
{

    final VideoMessageRecorderActivity this$0;
    final String val$message;

    public final void run()
    {
        InfoDialogFragment infodialogfragment = InfoDialogFragment.create(getString(0x7f0803be), val$message, getString(0x7f0802f6));
        infodialogfragment.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final VideoMessageRecorderActivity._cls4 this$1;

            public final void onDismiss(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$1 = VideoMessageRecorderActivity._cls4.this;
                super();
            }
        });
        infodialogfragment.show(getSupportFragmentManager());
    }

    _cls1.this._cls1()
    {
        this$0 = final_videomessagerecorderactivity;
        val$message = String.this;
        super();
    }
}
