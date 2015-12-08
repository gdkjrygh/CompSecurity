// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.os.Bundle;
import android.os.Message;
import oauth.signpost.OAuthProvider;
import oauth.signpost.exception.OAuthException;

// Referenced classes of package me.grantland.twitter:
//            TwitterDialog

class this._cls0 extends Thread
{

    final TwitterDialog this$0;

    public void run()
    {
        Message message = new Message();
        Bundle bundle = new Bundle();
        try
        {
            message.what = 1;
            bundle.putString("url", TwitterDialog.access$7(TwitterDialog.this).retrieveRequestToken(TwitterDialog.access$8(TwitterDialog.this), "gc://twitt"));
        }
        catch (OAuthException oauthexception)
        {
            message.what = -1;
            bundle.putSerializable("error", oauthexception);
        }
        message.setData(bundle);
        TwitterDialog.access$9(TwitterDialog.this).sendMessage(message);
    }

    on()
    {
        this$0 = TwitterDialog.this;
        super();
    }
}
