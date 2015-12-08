// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.facebook.android:
//            AsyncFacebookRunner, Facebook, FacebookError

class val.state extends Thread
{

    final AsyncFacebookRunner this$0;
    private final Context val$context;
    private final questListener val$listener;
    private final Object val$state;

    public void run()
    {
        String s;
        s = fb.logoutImpl(val$context);
        if (s.length() == 0 || s.equals("false"))
        {
            val$listener.onFacebookError(new FacebookError("auth.expireSession failed"), val$state);
            return;
        }
        try
        {
            val$listener.onComplete(s, val$state);
            return;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            val$listener.onFileNotFoundException(filenotfoundexception, val$state);
            return;
        }
        catch (MalformedURLException malformedurlexception)
        {
            val$listener.onMalformedURLException(malformedurlexception, val$state);
            return;
        }
        catch (IOException ioexception)
        {
            val$listener.onIOException(ioexception, val$state);
        }
        return;
    }

    questListener()
    {
        this$0 = final_asyncfacebookrunner;
        val$context = context1;
        val$listener = questlistener;
        val$state = Object.this;
        super();
    }
}
