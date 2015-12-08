// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.store;

import java.io.IOException;

// Referenced classes of package com.google.api.client.util.store:
//            AbstractDataStoreFactory, DataStore, AbstractMemoryDataStore, DataStoreFactory

public class MemoryDataStoreFactory extends AbstractDataStoreFactory
{
    static class InstanceHolder
    {

        static final MemoryDataStoreFactory INSTANCE = new MemoryDataStoreFactory();


        InstanceHolder()
        {
        }
    }

    static class MemoryDataStore extends AbstractMemoryDataStore
    {

        public volatile DataStoreFactory getDataStoreFactory()
        {
            return getDataStoreFactory();
        }

        public MemoryDataStoreFactory getDataStoreFactory()
        {
            return (MemoryDataStoreFactory)super.getDataStoreFactory();
        }

        MemoryDataStore(MemoryDataStoreFactory memorydatastorefactory, String s)
        {
            super(memorydatastorefactory, s);
        }
    }


    public MemoryDataStoreFactory()
    {
    }

    public static MemoryDataStoreFactory getDefaultInstance()
    {
        return InstanceHolder.INSTANCE;
    }

    protected DataStore createDataStore(String s)
        throws IOException
    {
        return new MemoryDataStore(this, s);
    }
}
