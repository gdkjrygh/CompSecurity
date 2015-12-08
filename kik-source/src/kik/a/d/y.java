// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.a.a.b.a;

public class y extends LinkedHashMap
{

    private static MessageDigest a[];
    private int b;
    private int c;

    public y()
    {
        b = 0;
        c = 0;
    }

    public y(Map map)
    {
        super(map);
        b = 0;
        c = 0;
    }

    private static int a(int i, byte abyte0[])
    {
        MessageDigest messagedigest;
        long l;
        long l1;
        messagedigest = a[i];
        l = 0L;
        l1 = l;
        if (messagedigest == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        messagedigest;
        JVM INSTR monitorenter ;
        messagedigest.reset();
        abyte0 = messagedigest.digest(abyte0);
        messagedigest;
        JVM INSTR monitorexit ;
        i = 0;
        do
        {
            l1 = l;
            if (i >= abyte0.length)
            {
                break;
            }
            l ^= (long)abyte0[i + 3] << 24 | (long)abyte0[i + 2] << 16 | (long)abyte0[i + 1] << 8 | (long)abyte0[i];
            i += 4;
        } while (true);
        break MISSING_BLOCK_LABEL_89;
        abyte0;
        messagedigest;
        JVM INSTR monitorexit ;
        throw abyte0;
        return (int)l1;
    }

    protected final void a(int i)
    {
        b = i;
    }

    protected final void b(int i)
    {
        c = i;
    }

    public int hashCode()
    {
        StringBuffer stringbuffer1 = new StringBuffer();
        StringBuffer stringbuffer = new StringBuffer();
        Object aobj1[] = (new ArrayList(keySet())).toArray();
        Arrays.sort(aobj1);
        Object aobj[] = org.a.a.b.a.a(aobj1);
        org.a.a.b.a.b(aobj);
        int k = aobj1.length;
        for (int i = 0; i < k; i++)
        {
            Object obj1 = aobj1[i];
            stringbuffer1.append(obj1).append(get(obj1));
        }

        k = aobj.length;
        for (int j = 0; j < k; j++)
        {
            Object obj = aobj[j];
            stringbuffer.append(obj).append(get(obj));
        }

        byte abyte1[] = stringbuffer1.toString().getBytes();
        byte abyte0[] = stringbuffer.toString().getBytes();
        aobj = new int[6];
        aobj[0] = a(0, abyte1);
        aobj[1] = a(1, abyte1);
        aobj[2] = a(2, abyte1);
        aobj[3] = a(0, abyte0);
        aobj[4] = a(1, abyte0);
        aobj[5] = a(2, abyte0);
        return b ^ aobj[0] << c ^ aobj[5] << c * 2 ^ aobj[1] << c ^ aobj[0];
    }

    static 
    {
        a = new MessageDigest[3];
        try
        {
            a[0] = MessageDigest.getInstance("SHA-256");
            a[1] = MessageDigest.getInstance("SHA-1");
            a[2] = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception.printStackTrace();
        }
    }
}
