// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.hmobile.twitter:
//            AsyncTwitterRunner, Twitter, TwitterError

class questListener extends Thread
{

    final AsyncTwitterRunner this$0;
    private final Context val$context;
    private final questListener val$listener;

    public void run()
    {
        String s;
        s = tw.logout(val$context);
        if (s.length() == 0 || s.equals("false"))
        {
            val$listener.onTwitterError(new TwitterError("auth.expireSession failed"));
            return;
        }
        try
        {
            val$listener.onComplete(s);
            return;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            val$listener.onFileNotFoundException(filenotfoundexception);
            return;
        }
        catch (MalformedURLException malformedurlexception)
        {
            val$listener.onMalformedURLException(malformedurlexception);
            return;
        }
        catch (IOException ioexception)
        {
            val$listener.onIOException(ioexception);
        }
        return;
    }

    questListener()
    {
        this$0 = final_asynctwitterrunner;
        val$context = context1;
        val$listener = questListener.this;
        super();
    }
}
