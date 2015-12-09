// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;

// Referenced classes of package org.apache.cordova:
//            DroidGap

class this._cls1
    implements android.content.ce.OnClickListener
{

    final ctivity this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (exit)
        {
            me.endActivity();
        }
    }

    l.exit()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/DroidGap$4

/* anonymous class */
    class DroidGap._cls4
        implements Runnable
    {

        final DroidGap this$0;
        final String val$button;
        final boolean val$exit;
        final DroidGap val$me;
        final String val$message;
        final String val$title;

        public void run()
        {
            try
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(me);
                builder.setMessage(message);
                builder.setTitle(title);
                builder.setCancelable(false);
                builder.setPositiveButton(button, new DroidGap._cls4._cls1());
                builder.create();
                builder.show();
                return;
            }
            catch (Exception exception)
            {
                finish();
            }
        }

            
            {
                this$0 = final_droidgap;
                me = droidgap1;
                message = s;
                title = s1;
                button = s2;
                exit = Z.this;
                super();
            }
    }

}
