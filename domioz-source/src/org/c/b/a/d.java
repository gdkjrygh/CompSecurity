// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b.a;

import java.io.File;
import java.net.URI;
import java.net.URL;

// Referenced classes of package org.c.b.a:
//            c

public interface d
    extends c
{

    public abstract long contentLength();

    public abstract d createRelative(String s);

    public abstract boolean exists();

    public abstract String getDescription();

    public abstract File getFile();

    public abstract String getFilename();

    public abstract URI getURI();

    public abstract URL getURL();

    public abstract boolean isOpen();

    public abstract boolean isReadable();

    public abstract long lastModified();
}
