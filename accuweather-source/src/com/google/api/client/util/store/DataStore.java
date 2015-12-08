// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.store;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.api.client.util.store:
//            DataStoreFactory

public interface DataStore
{

    public abstract DataStore clear()
        throws IOException;

    public abstract boolean containsKey(String s)
        throws IOException;

    public abstract boolean containsValue(Serializable serializable)
        throws IOException;

    public abstract DataStore delete(String s)
        throws IOException;

    public abstract Serializable get(String s)
        throws IOException;

    public abstract DataStoreFactory getDataStoreFactory();

    public abstract String getId();

    public abstract boolean isEmpty()
        throws IOException;

    public abstract Set keySet()
        throws IOException;

    public abstract DataStore set(String s, Serializable serializable)
        throws IOException;

    public abstract int size()
        throws IOException;

    public abstract Collection values()
        throws IOException;
}
