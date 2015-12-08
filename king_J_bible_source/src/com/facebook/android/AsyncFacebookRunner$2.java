// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.facebook.android:
//            AsyncFacebookRunner, Facebook

class val.state extends Thread
{

    final AsyncFacebookRunner this$0;
    private final String val$graphPath;
    private final String val$httpMethod;
    private final questListener val$listener;
    private final Bundle val$parameters;
    private final Object val$state;

    public void run()
    {
        try
        {
            String s = fb.requestImpl(val$graphPath, val$parameters, val$httpMethod);
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
    }

    questListener()
    {
        this$0 = final_asyncfacebookrunner;
        val$graphPath = s;
        val$parameters = bundle;
        val$httpMethod = s1;
        val$listener = questlistener;
        val$state = Object.this;
        super();
    }
}
