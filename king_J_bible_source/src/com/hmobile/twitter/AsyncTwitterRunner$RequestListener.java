// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.hmobile.twitter:
//            AsyncTwitterRunner, TwitterError

public static interface 
{

    public abstract void onComplete(String s);

    public abstract void onFileNotFoundException(FileNotFoundException filenotfoundexception);

    public abstract void onIOException(IOException ioexception);

    public abstract void onMalformedURLException(MalformedURLException malformedurlexception);

    public abstract void onTwitterError(TwitterError twittererror);
}
