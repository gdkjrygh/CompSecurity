// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.net.URLClassLoader;
import java.util.Locale;

public class MissingEntryException extends RuntimeException
{

    private String debugMsg;
    protected final String key;
    protected final ClassLoader loader;
    protected final Locale locale;
    protected final String resource;

    public MissingEntryException(String s, String s1, String s2, Locale locale1, ClassLoader classloader)
    {
        super(s);
        resource = s1;
        key = s2;
        locale = locale1;
        loader = classloader;
    }

    public MissingEntryException(String s, Throwable throwable, String s1, String s2, Locale locale1, ClassLoader classloader)
    {
        super(s, throwable);
        resource = s1;
        key = s2;
        locale = locale1;
        loader = classloader;
    }

    public ClassLoader getClassLoader()
    {
        return loader;
    }

    public String getDebugMsg()
    {
        if (debugMsg == null)
        {
            debugMsg = (new StringBuilder()).append("Can not find entry ").append(key).append(" in resource file ").append(resource).append(" for the locale ").append(locale).append(".").toString();
            if (loader instanceof URLClassLoader)
            {
                java.net.URL aurl[] = ((URLClassLoader)loader).getURLs();
                debugMsg = (new StringBuilder()).append(debugMsg).append(" The following entries in the classpath were searched: ").toString();
                for (int i = 0; i != aurl.length; i++)
                {
                    debugMsg = (new StringBuilder()).append(debugMsg).append(aurl[i]).append(" ").toString();
                }

            }
        }
        return debugMsg;
    }

    public String getKey()
    {
        return key;
    }

    public Locale getLocale()
    {
        return locale;
    }

    public String getResource()
    {
        return resource;
    }
}
