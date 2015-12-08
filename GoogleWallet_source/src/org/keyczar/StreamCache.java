// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.util.concurrent.ConcurrentHashMap;
import org.keyczar.interfaces.Stream;

// Referenced classes of package org.keyczar:
//            StreamQueue, KeyczarKey

final class StreamCache
{

    private final ConcurrentHashMap cacheMap = new ConcurrentHashMap();

    StreamCache()
    {
    }

    private StreamQueue getQueue(KeyczarKey keyczarkey)
    {
        StreamQueue streamqueue = (StreamQueue)cacheMap.get(keyczarkey);
        if (streamqueue != null)
        {
            keyczarkey = streamqueue;
        } else
        {
            StreamQueue streamqueue1 = new StreamQueue();
            StreamQueue streamqueue2 = (StreamQueue)cacheMap.putIfAbsent(keyczarkey, streamqueue1);
            keyczarkey = streamqueue1;
            if (streamqueue2 != null)
            {
                return streamqueue2;
            }
        }
        return keyczarkey;
    }

    final Stream get(KeyczarKey keyczarkey)
    {
        return (Stream)getQueue(keyczarkey).poll();
    }

    final void put(KeyczarKey keyczarkey, Stream stream)
    {
        getQueue(keyczarkey).add(stream);
    }
}
