// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.base:
//            FinalizableReferenceQueue

class 
    implements 
{

    URL getBaseUrl()
    {
        String s = (new StringBuilder()).append("com.google.common.base.internal.Finalizer".replace('.', '/')).append(".class").toString();
        URL url = getClass().getClassLoader().getResource(s);
        if (url == null)
        {
            throw new FileNotFoundException(s);
        }
        String s1 = url.toString();
        if (!s1.endsWith(s))
        {
            throw new IOException((new StringBuilder()).append("Unsupported path style: ").append(s1).toString());
        } else
        {
            return new URL(url, s1.substring(0, s1.length() - s.length()));
        }
    }

    public Class loadFinalizer()
    {
        Class class1;
        try
        {
            class1 = newLoader(getBaseUrl()).loadClass("com.google.common.base.internal.Finalizer");
        }
        catch (Exception exception)
        {
            FinalizableReferenceQueue.access$000().log(Level.WARNING, "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.", exception);
            return null;
        }
        return class1;
    }

    URLClassLoader newLoader(URL url)
    {
        return new URLClassLoader(new URL[] {
            url
        });
    }

    ()
    {
    }
}
