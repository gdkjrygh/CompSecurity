// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;

// Referenced classes of package org.apache.cordova:
//            CordovaActivity

class val.exit
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
            android.app.r r = new android.app.r(val$me);
            r.setMessage(val$message);
            r.setTitle(val$title);
            r.setCancelable(false);
            r.setPositiveButton(val$button, new android.content.DialogInterface.OnClickListener() {

                final CordovaActivity._cls4 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                    if (exit)
                    {
                        me.endActivity();
                    }
                }

            
            {
                this$1 = CordovaActivity._cls4.this;
                super();
            }
            });
            r.create();
            r.show();
            return;
        }
        catch (Exception exception)
        {
            finish();
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_cordovaactivity;
        val$me = cordovaactivity1;
        val$message = s;
        val$title = s1;
        val$button = s2;
        val$exit = Z.this;
        super();
    }
}
