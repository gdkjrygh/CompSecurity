// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.DialogInterface;
import com.skype.android.app.InfoDialogFragment;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

final class this._cls1
    implements android.content.
{

    final sh this$1;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        finish();
    }

    l.message()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/vim/VideoMessageRecorderActivity$4

/* anonymous class */
    final class VideoMessageRecorderActivity._cls4
        implements Runnable
    {

        final VideoMessageRecorderActivity this$0;
        final String val$message;

        public final void run()
        {
            InfoDialogFragment infodialogfragment = InfoDialogFragment.create(getString(0x7f0803be), message, getString(0x7f0802f6));
            infodialogfragment.setOnDismissListener(new VideoMessageRecorderActivity._cls4._cls1());
            infodialogfragment.show(getSupportFragmentManager());
        }

            
            {
                this$0 = final_videomessagerecorderactivity;
                message = String.this;
                super();
            }
    }

}
