// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.os.Bundle;
import android.os.Message;
import oauth.signpost.OAuthProvider;
import oauth.signpost.exception.OAuthException;

// Referenced classes of package me.grantland.twitter:
//            TwitterActivity

class this._cls0 extends Thread
{

    final TwitterActivity this$0;

    public void run()
    {
        try
        {
            Message message = new Message();
            message.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("url", TwitterActivity.access$5(TwitterActivity.this).retrieveRequestToken(TwitterActivity.access$6(TwitterActivity.this), "gc://twitt"));
            message.setData(bundle);
            TwitterActivity.access$7(TwitterActivity.this).sendMessage(message);
            return;
        }
        catch (OAuthException oauthexception)
        {
            TwitterActivity.access$4(TwitterActivity.this, oauthexception);
        }
    }

    ()
    {
        this$0 = TwitterActivity.this;
        super();
    }
}
