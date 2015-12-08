// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import fs.org.simpleframework.xml.Serializer;
import fs.org.simpleframework.xml.core.Persister;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.fsr.tracker:
//            DateMatcher, PersistedState

public class TrackerStateSerializer
{

    public TrackerStateSerializer()
    {
    }

    public static PersistedState deserialize(String s)
        throws Exception
    {
        return (PersistedState)(new Persister(new DateMatcher())).read(com/fsr/tracker/PersistedState, s);
    }

    public static String serialize(PersistedState persistedstate)
        throws Exception
    {
        Persister persister = new Persister(new DateMatcher());
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        persister.write(persistedstate, bytearrayoutputstream);
        return bytearrayoutputstream.toString();
    }
}
