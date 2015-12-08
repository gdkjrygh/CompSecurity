// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.store;

import com.google.api.client.util.Maps;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.api.client.util.store:
//            DataStoreFactory, DataStore

public abstract class AbstractDataStoreFactory
    implements DataStoreFactory
{

    private static final Pattern ID_PATTERN = Pattern.compile("\\w{1,30}");
    private final Map dataStoreMap = Maps.newHashMap();
    private final Lock lock = new ReentrantLock();

    public AbstractDataStoreFactory()
    {
    }

    protected abstract DataStore createDataStore(String s)
        throws IOException;

    public final DataStore getDataStore(String s)
        throws IOException
    {
        Preconditions.checkArgument(ID_PATTERN.matcher(s).matches(), "%s does not match pattern %s", new Object[] {
            s, ID_PATTERN
        });
        lock.lock();
        DataStore datastore1 = (DataStore)dataStoreMap.get(s);
        DataStore datastore;
        datastore = datastore1;
        if (datastore1 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        datastore = createDataStore(s);
        dataStoreMap.put(s, datastore);
        lock.unlock();
        return datastore;
        s;
        lock.unlock();
        throw s;
    }

}
