// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public final class anF
    implements anD
{

    private final String a;
    private final ClassLoader b;
    private final Map c;

    public anF(String s)
    {
        this(s, (byte)0);
    }

    private anF(String s, byte byte0)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("No resource path provided");
        }
        String s1 = s;
        if (!s.endsWith("/"))
        {
            s1 = (new StringBuilder()).append(s).append('/').toString();
        }
        a = s1;
        b = getClass().getClassLoader();
        c = a(b("ZoneInfoMap"));
    }

    private static Map a(InputStream inputstream)
    {
        ConcurrentHashMap concurrenthashmap;
        concurrenthashmap = new ConcurrentHashMap();
        inputstream = new DataInputStream(inputstream);
        a(((DataInputStream) (inputstream)), ((Map) (concurrenthashmap)));
        Exception exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        concurrenthashmap.put("UTC", new SoftReference(alw.a));
        return concurrenthashmap;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw exception;
    }

    private static void a(DataInputStream datainputstream, Map map)
    {
        boolean flag = false;
        int k = datainputstream.readUnsignedShort();
        String as[] = new String[k];
        for (int i = 0; i < k; i++)
        {
            as[i] = datainputstream.readUTF().intern();
        }

        k = datainputstream.readUnsignedShort();
        int j = ((flag) ? 1 : 0);
        while (j < k) 
        {
            try
            {
                map.put(as[datainputstream.readUnsignedShort()], as[datainputstream.readUnsignedShort()]);
            }
            // Misplaced declaration of an exception variable
            catch (DataInputStream datainputstream)
            {
                throw new IOException("Corrupt zone info map");
            }
            j++;
        }
    }

    private InputStream b(String s)
    {
        Object obj = a.concat(s);
        if (b != null)
        {
            s = b.getResourceAsStream(((String) (obj)));
        } else
        {
            s = ClassLoader.getSystemResourceAsStream(((String) (obj)));
        }
        if (s == null)
        {
            obj = (new StringBuilder(40)).append("Resource not found: \"").append(((String) (obj))).append("\" ClassLoader: ");
            if (b != null)
            {
                s = b.toString();
            } else
            {
                s = "system";
            }
            throw new IOException(((StringBuilder) (obj)).append(s).toString());
        } else
        {
            return s;
        }
    }

    private alw c(String s)
    {
        InputStream inputstream1 = b(s);
        InputStream inputstream = inputstream1;
        if (!(inputstream1 instanceof DataInput)) goto _L2; else goto _L1
_L1:
        inputstream = inputstream1;
        Object obj = anz.a((DataInput)inputstream1, s);
_L4:
        inputstream = inputstream1;
        c.put(s, new SoftReference(obj));
        Thread thread;
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return ((alw) (obj));
            }
        }
        return ((alw) (obj));
_L2:
        inputstream = inputstream1;
        obj = anz.a(new DataInputStream(inputstream1), s);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        inputstream1 = null;
_L8:
        inputstream = inputstream1;
        thread = Thread.currentThread();
        inputstream = inputstream1;
        thread.getThreadGroup().uncaughtException(thread, ((Throwable) (obj)));
        inputstream = inputstream1;
        c.remove(s);
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
        inputstream = null;
_L6:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception) { }
        }
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final alw a(String s)
    {
_L6:
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((alw) (obj));
_L2:
        obj = c.get(s);
        if (obj == null)
        {
            return null;
        }
        if (s.equals(obj))
        {
            return c(s);
        }
        if (!(obj instanceof SoftReference))
        {
            break; /* Loop/switch isn't completed */
        }
        alw alw1 = (alw)((SoftReference)obj).get();
        obj = alw1;
        if (alw1 == null)
        {
            return c(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
        s = (String)obj;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final Set a()
    {
        return new TreeSet(c.keySet());
    }
}
