// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.google.api.client.util.store:
//            AbstractMemoryDataStore, FileDataStoreFactory, DataStoreFactory

static class dataFile extends AbstractMemoryDataStore
{

    private final File dataFile;

    public volatile DataStoreFactory getDataStoreFactory()
    {
        return getDataStoreFactory();
    }

    public FileDataStoreFactory getDataStoreFactory()
    {
        return (FileDataStoreFactory)super.getDataStoreFactory();
    }

    void save()
        throws IOException
    {
        IOUtils.serialize(keyValueMap, new FileOutputStream(dataFile));
    }

    I(FileDataStoreFactory filedatastorefactory, File file, String s)
        throws IOException
    {
        super(filedatastorefactory, s);
        dataFile = new File(file, s);
        if (IOUtils.isSymbolicLink(dataFile))
        {
            throw new IOException((new StringBuilder()).append("unable to use a symbolic link: ").append(dataFile).toString());
        }
        if (dataFile.createNewFile())
        {
            keyValueMap = Maps.newHashMap();
            save();
            return;
        } else
        {
            keyValueMap = (HashMap)IOUtils.deserialize(new FileInputStream(dataFile));
            return;
        }
    }
}
