// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import android.content.ContentUris;
import android.content.UriMatcher;
import android.net.Uri;
import android_src.c.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package android_src.mms.g:
//            a, k

public final class j extends a
{

    private static final UriMatcher a;
    private static final HashMap b;
    private static j c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();

    private j()
    {
    }

    private void a(long l)
    {
        Object obj = (HashSet)e.remove(Long.valueOf(l));
        if (obj != null)
        {
            obj = ((HashSet) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Uri uri = (Uri)((Iterator) (obj)).next();
                k k1 = (k)super.b(uri);
                if (k1 != null)
                {
                    c(uri, k1);
                }
            } while (true);
        }
    }

    private void a(Integer integer)
    {
        if (integer != null)
        {
            integer = (HashSet)d.remove(integer);
            if (integer != null)
            {
                integer = integer.iterator();
                do
                {
                    if (!integer.hasNext())
                    {
                        break;
                    }
                    Uri uri = (Uri)integer.next();
                    k k1 = (k)super.b(uri);
                    if (k1 != null)
                    {
                        b(uri, k1);
                    }
                } while (true);
            }
        }
    }

    public static final j b()
    {
        android_src/mms/g/j;
        JVM INSTR monitorenter ;
        j j1;
        if (c == null)
        {
            c = new j();
        }
        j1 = c;
        android_src/mms/g/j;
        JVM INSTR monitorexit ;
        return j1;
        Exception exception;
        exception;
        throw exception;
    }

    private k b(Uri uri)
    {
        k k1 = (k)super.b(uri);
        if (k1 != null)
        {
            b(uri, k1);
            c(uri, k1);
            return k1;
        } else
        {
            return null;
        }
    }

    private void b(Uri uri, k k1)
    {
        k1 = (HashSet)e.get(Long.valueOf(k1.c()));
        if (k1 != null)
        {
            k1.remove(uri);
        }
    }

    private Uri c(Uri uri)
    {
        Uri uri1 = uri;
        switch (a.match(uri))
        {
        case 2: // '\002'
        case 4: // '\004'
        case 6: // '\006'
        case 8: // '\b'
        default:
            uri1 = null;
            // fall through

        case 1: // '\001'
            return uri1;

        case 3: // '\003'
        case 5: // '\005'
        case 7: // '\007'
        case 9: // '\t'
            uri = uri.getLastPathSegment();
            break;
        }
        return Uri.withAppendedPath(d.a, uri);
    }

    private void c(Uri uri, k k1)
    {
        k1 = (HashSet)e.get(Long.valueOf(k1.b()));
        if (k1 != null)
        {
            k1.remove(uri);
        }
    }

    public k a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.match(uri);
        i;
        JVM INSTR tableswitch 0 11: default 72
    //                   0 107
    //                   1 78
    //                   2 116
    //                   3 87
    //                   4 116
    //                   5 87
    //                   6 116
    //                   7 87
    //                   8 116
    //                   9 87
    //                   10 107
    //                   11 138;
           goto _L1 _L2 _L3 _L4 _L5 _L4 _L5 _L4 _L5 _L4 _L5 _L2 _L6
_L1:
        uri = null;
_L8:
        this;
        JVM INSTR monitorexit ;
        return uri;
_L3:
        uri = b(uri);
        continue; /* Loop/switch isn't completed */
_L5:
        uri = uri.getLastPathSegment();
        uri = b(Uri.withAppendedPath(d.a, uri));
        continue; /* Loop/switch isn't completed */
_L2:
        a();
        uri = null;
        continue; /* Loop/switch isn't completed */
_L4:
        a((Integer)b.get(Integer.valueOf(i)));
        uri = null;
        continue; /* Loop/switch isn't completed */
_L6:
        a(ContentUris.parseId(uri));
        uri = null;
        if (true) goto _L8; else goto _L7
_L7:
        uri;
        throw uri;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        super.a();
        d.clear();
        e.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(Uri uri, k k1)
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset;
        int i;
        i = k1.b();
        hashset = (HashSet)d.get(Integer.valueOf(i));
        if (hashset != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        hashset = new HashSet();
        d.put(Integer.valueOf(i), hashset);
        HashSet hashset2;
        long l;
        l = k1.c();
        hashset2 = (HashSet)e.get(Long.valueOf(l));
        HashSet hashset1;
        hashset1 = hashset2;
        if (hashset2 != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        hashset1 = new HashSet();
        e.put(Long.valueOf(l), hashset1);
        boolean flag;
        uri = c(uri);
        flag = super.a(uri, k1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        hashset.add(uri);
        hashset1.add(uri);
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        throw uri;
    }

    public volatile boolean a(Object obj, Object obj1)
    {
        return a((Uri)obj, (k)obj1);
    }

    public Object b(Object obj)
    {
        return a((Uri)obj);
    }

    static 
    {
        a = new UriMatcher(-1);
        a.addURI("mms", null, 0);
        a.addURI("mms", "#", 1);
        a.addURI("mms", "inbox", 2);
        a.addURI("mms", "inbox/#", 3);
        a.addURI("mms", "sent", 4);
        a.addURI("mms", "sent/#", 5);
        a.addURI("mms", "drafts", 6);
        a.addURI("mms", "drafts/#", 7);
        a.addURI("mms", "outbox", 8);
        a.addURI("mms", "outbox/#", 9);
        a.addURI("mms-sms", "conversations", 10);
        a.addURI("mms-sms", "conversations/#", 11);
        b = new HashMap();
        b.put(Integer.valueOf(2), Integer.valueOf(1));
        b.put(Integer.valueOf(4), Integer.valueOf(2));
        b.put(Integer.valueOf(6), Integer.valueOf(3));
        b.put(Integer.valueOf(8), Integer.valueOf(4));
    }
}
