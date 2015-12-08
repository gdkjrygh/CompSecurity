// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.hmobile.twitter:
//            Twitter, TwitterError

public class AsyncTwitterRunner
{
    public static interface RequestListener
    {

        public abstract void onComplete(String s);

        public abstract void onFileNotFoundException(FileNotFoundException filenotfoundexception);

        public abstract void onIOException(IOException ioexception);

        public abstract void onMalformedURLException(MalformedURLException malformedurlexception);

        public abstract void onTwitterError(TwitterError twittererror);
    }


    Twitter tw;

    public AsyncTwitterRunner(Twitter twitter)
    {
        tw = twitter;
    }

    public void logout(final Context context, final RequestListener listener)
    {
        (new Thread() {

            final AsyncTwitterRunner this$0;
            private final Context val$context;
            private final RequestListener val$listener;

            public void run()
            {
                String s;
                s = tw.logout(context);
                if (s.length() == 0 || s.equals("false"))
                {
                    listener.onTwitterError(new TwitterError("auth.expireSession failed"));
                    return;
                }
                try
                {
                    listener.onComplete(s);
                    return;
                }
                catch (FileNotFoundException filenotfoundexception)
                {
                    listener.onFileNotFoundException(filenotfoundexception);
                    return;
                }
                catch (MalformedURLException malformedurlexception)
                {
                    listener.onMalformedURLException(malformedurlexception);
                    return;
                }
                catch (IOException ioexception)
                {
                    listener.onIOException(ioexception);
                }
                return;
            }

            
            {
                this$0 = AsyncTwitterRunner.this;
                context = context1;
                listener = requestlistener;
                super();
            }
        }).start();
    }
}
