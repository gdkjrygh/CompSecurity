// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.inject.internal.util:
//            $FinalizableReferenceQueue

static class 
    implements 
{

    private static final String LOADING_ERROR = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Google Collections to your system class path.";

    URL getBaseUrl()
        throws IOException
    {
        String s = (new StringBuilder()).append("com.google.inject.internal.util.$Finalizer".replace('.', '/')).append(".class").toString();
        Object obj = getClass().getClassLoader().getResource(s);
        if (obj == null)
        {
            throw new FileNotFoundException(s);
        }
        obj = ((URL) (obj)).toString();
        if (!((String) (obj)).endsWith(s))
        {
            throw new IOException((new StringBuilder()).append("Unsupported path style: ").append(((String) (obj))).toString());
        } else
        {
            return new URL(((String) (obj)).substring(0, ((String) (obj)).length() - s.length()));
        }
    }

    public Class loadFinalizer()
    {
        Class class1;
        try
        {
            class1 = newLoader(getBaseUrl()).loadClass("com.google.inject.internal.util.$Finalizer");
        }
        catch (Exception exception)
        {
            $FinalizableReferenceQueue.access$000().log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Google Collections to your system class path.", exception);
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
