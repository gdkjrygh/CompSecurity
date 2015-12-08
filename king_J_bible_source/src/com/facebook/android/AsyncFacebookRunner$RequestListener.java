// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.facebook.android:
//            AsyncFacebookRunner, FacebookError

public static interface 
{

    public abstract void onComplete(String s, Object obj);

    public abstract void onFacebookError(FacebookError facebookerror, Object obj);

    public abstract void onFileNotFoundException(FileNotFoundException filenotfoundexception, Object obj);

    public abstract void onIOException(IOException ioexception, Object obj);

    public abstract void onMalformedURLException(MalformedURLException malformedurlexception, Object obj);
}
