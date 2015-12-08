// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;

// Referenced classes of package org.apache.cordova:
//            CordovaActivity

class this._cls1
    implements android.content.ickListener
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

    // Unreferenced inner class org/apache/cordova/CordovaActivity$4

/* anonymous class */
    class CordovaActivity._cls4
        implements Runnable
    {

        final CordovaActivity this$0;
        final String val$button;
        final boolean val$exit;
        final CordovaActivity val$me;
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
                builder.setPositiveButton(button, new CordovaActivity._cls4._cls1());
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
                this$0 = final_cordovaactivity;
                me = cordovaactivity1;
                message = s;
                title = s1;
                button = s2;
                exit = Z.this;
                super();
            }
    }

}
