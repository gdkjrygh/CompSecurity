// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.gallery3d.common;

import java.io.Closeable;
import java.io.File;
import mzi;

public final class FileCache
    implements Closeable
{

    public static File a(FileCache filecache)
    {
        return null;
    }

    public final void close()
    {
        throw new NullPointerException();
    }

    static 
    {
        String s = FileEntry.a.b;
        String.format("sum(%s)", new Object[] {
            "size"
        });
        String.format("%s ASC", new Object[] {
            "last_access"
        });
    }

    private class FileEntry extends mzf
    {

        public static final mzi a = new mzi(com/google/android/libraries/social/gallery3d/common/FileCache$FileEntry);
        public String contentUrl;
        public String filename;
        public long hashCode;
        public long lastAccess;
        public long size;

        public final String toString()
        {
            long l = hashCode;
            String s = contentUrl;
            long l1 = lastAccess;
            String s1 = filename;
            return (new StringBuilder(String.valueOf(s).length() + 87 + String.valueOf(s1).length())).append("hash_code: ").append(l).append(", content_url").append(s).append(", last_access").append(l1).append(", filename").append(s1).toString();
        }


        private FileEntry()
        {
        }
    }

}
