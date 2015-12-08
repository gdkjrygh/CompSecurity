// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.e;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.e:
//            a

public final class b
    implements a
{

    public b()
    {
    }

    public final Object a(String s)
        throws IOException
    {
        Object obj;
        obj = null;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        try
        {
            s = Base64.decode(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException(s);
        }
        obj = new ObjectInputStream(new ByteArrayInputStream(s));
        s = ((String) (((ObjectInputStream) (obj)).readObject()));
        ((ObjectInputStream) (obj)).close();
        obj = s;
        return obj;
        s;
        throw new IOException(s);
        s;
        ((ObjectInputStream) (obj)).close();
        throw s;
        s;
        throw new IOException(s);
    }

    public final String a(Object obj)
        throws IOException
    {
        Object obj1;
        ByteArrayOutputStream bytearrayoutputstream;
        obj1 = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj1 = new ObjectOutputStream(bytearrayoutputstream);
        ((ObjectOutputStream) (obj1)).writeObject(obj);
        ((ObjectOutputStream) (obj1)).close();
        obj1 = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 2);
        return ((String) (obj1));
        obj;
        ((ObjectOutputStream) (obj1)).close();
        throw obj;
    }

    public final Set a(Map map)
        throws IOException
    {
        if (!map.isEmpty()) goto _L2; else goto _L1
_L1:
        map = Collections.emptySet();
_L4:
        return map;
_L2:
        HashSet hashset = new HashSet();
        Iterator iterator = map.values().iterator();
        do
        {
            map = hashset;
            if (!iterator.hasNext())
            {
                continue;
            }
            hashset.add(a((String)iterator.next()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
