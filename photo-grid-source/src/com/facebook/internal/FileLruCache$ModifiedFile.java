// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;

final class modified
    implements Comparable
{

    private static final int HASH_MULTIPLIER = 37;
    private static final int HASH_SEED = 29;
    private final File file;
    private final long modified;

    public final int compareTo(modified modified1)
    {
        if (getModified() < modified1.getModified())
        {
            return -1;
        }
        if (getModified() > modified1.getModified())
        {
            return 1;
        } else
        {
            return getFile().compareTo(modified1.getFile());
        }
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof compareTo) && compareTo((compareTo)obj) == 0;
    }

    final File getFile()
    {
        return file;
    }

    final long getModified()
    {
        return modified;
    }

    public final int hashCode()
    {
        return (file.hashCode() + 1073) * 37 + (int)(modified % 0x7fffffffL);
    }

    (File file1)
    {
        file = file1;
        modified = file1.lastModified();
    }
}
