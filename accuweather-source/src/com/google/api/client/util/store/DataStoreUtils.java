// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.store;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.api.client.util.store:
//            DataStore

public final class DataStoreUtils
{

    private DataStoreUtils()
    {
    }

    public static String toString(DataStore datastore)
    {
        StringBuilder stringbuilder;
        Iterator iterator;
        String s;
        boolean flag;
        try
        {
            stringbuilder = new StringBuilder();
            stringbuilder.append('{');
        }
        // Misplaced declaration of an exception variable
        catch (DataStore datastore)
        {
            throw new RuntimeException(datastore);
        }
        flag = true;
        iterator = datastore.keySet().iterator();
_L1:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        s = (String)iterator.next();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        flag = false;
_L2:
        stringbuilder.append(s).append('=').append(datastore.get(s));
          goto _L1
        stringbuilder.append(", ");
          goto _L2
        datastore = stringbuilder.append('}').toString();
        return datastore;
    }
}
