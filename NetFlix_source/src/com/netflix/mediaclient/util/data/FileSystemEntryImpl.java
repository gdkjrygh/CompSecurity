// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.data;

import java.io.File;

public class FileSystemEntryImpl
    implements DataRepository.Entry
{

    private String mFileName;
    private long mSizeInBytes;
    private long mTs;

    FileSystemEntryImpl(File file)
    {
        mFileName = file.getName();
        mTs = file.lastModified();
        mSizeInBytes = file.length();
    }

    FileSystemEntryImpl(String s, long l, long l1)
    {
        mFileName = getFilenameForKey(s);
        mTs = l;
        mSizeInBytes = l1;
    }

    static String getFilenameForKey(String s)
    {
        int i = s.length() / 2;
        int j = s.substring(0, i).hashCode();
        return (new StringBuilder()).append(String.valueOf(j)).append(String.valueOf(s.substring(i).hashCode())).toString();
    }

    public String getKey()
    {
        return mFileName;
    }

    public long getSizeInBytes()
    {
        return mSizeInBytes;
    }

    public long getTs()
    {
        return mTs;
    }
}
