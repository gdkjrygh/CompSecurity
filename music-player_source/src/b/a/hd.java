// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.text.TextUtils;
import com.b.a.l;
import com.b.a.t;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            cb, ch, fj, fp, 
//            hx, fs

public final class hd
{

    private static final byte a[] = "pbl0".getBytes();
    private static hd d;
    private hx b;
    private cb c;
    private Context e;

    private hd(Context context)
    {
        c = null;
        e = context;
    }

    private int a(String s)
    {
        cb cb1 = c;
        if (cb1 == null || !cb1.b())
        {
            return -1;
        }
        s = (ch)cb1.a().get(s);
        if (s == null || TextUtils.isEmpty(s.a()))
        {
            return -1;
        }
        int i;
        try
        {
            i = Integer.parseInt(s.a().trim());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    public static hd a(Context context)
    {
        Object obj = null;
        Object obj1 = null;
        b/a/hd;
        JVM INSTR monitorenter ;
        if (d != null) goto _L2; else goto _L1
_L1:
        hd hd1;
        boolean flag;
        hd1 = new hd(context);
        d = hd1;
        flag = (new File(hd1.e.getFilesDir(), ".imprint")).exists();
        if (!flag) goto _L2; else goto _L3
_L3:
        context = hd1.e.openFileInput(".imprint");
        obj = context;
        byte abyte0[] = fj.b(context);
        obj = abyte0;
        fj.c(context);
_L5:
        if (obj == null) goto _L2; else goto _L4
_L4:
        context = new cb();
        (new fp()).a(context, ((byte []) (obj)));
        hd1.c = context;
_L2:
        context = d;
        b/a/hd;
        JVM INSTR monitorexit ;
        return context;
        Exception exception;
        exception;
        context = null;
_L7:
        obj = context;
        exception.printStackTrace();
        fj.c(context);
        obj = obj1;
          goto _L5
        context;
        throw context;
        context;
_L6:
        fj.c(((java.io.InputStream) (obj)));
        throw context;
        context;
        context.printStackTrace();
          goto _L2
        context;
          goto _L6
        exception;
          goto _L7
    }

    private static String b(cb cb1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = (new TreeMap(cb1.a())).entrySet().iterator(); iterator.hasNext(); stringbuilder.append(((ch)entry.getValue()).g()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append(((ch)entry.getValue()).a());
            stringbuilder.append(((ch)entry.getValue()).d());
        }

        stringbuilder.append(cb1.b);
        return fj.a(stringbuilder.toString()).toLowerCase(Locale.US);
    }

    public final cb a()
    {
        this;
        JVM INSTR monitorenter ;
        cb cb1 = c;
        this;
        JVM INSTR monitorexit ;
        return cb1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(cb cb1)
    {
        if (cb1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (cb1.g().equals(b(cb1))) goto _L4; else goto _L3
_L3:
        int i = 0;
_L9:
        if (i == 0) goto _L1; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        Object obj = c;
        byte abyte0[];
        byte abyte3[];
        if (obj != null)
        {
label0:
            {
                if (cb1 != null)
                {
                    break label0;
                }
                cb1 = ((cb) (obj));
            }
        }
_L12:
        c = cb1;
        this;
        JVM INSTR monitorexit ;
        if (c != null && b != null)
        {
            i = a("defcon");
            if (i != -1)
            {
                b.a(i);
                t.a(e);
                t.a(i);
            }
            i = a("latent");
            if (i != -1)
            {
                i *= 1000;
                b.b(i);
                t.a(e);
                t.b(i);
            }
            i = a("codex");
            if (i == 0 || i == 1 || i == -1)
            {
                b.c(i);
                t.a(e);
                t.c(i);
                return;
            }
        }
          goto _L1
_L4:
        obj = cb1.a().values().iterator();
_L7:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_350;
        }
        ch ch1 = (ch)((Iterator) (obj)).next();
        abyte0 = l.a(ch1.g());
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bytebuffer.order(null);
        bytebuffer.putLong(ch1.d());
        byte abyte1[] = bytebuffer.array();
        byte abyte2[] = a;
        abyte3 = new byte[4];
        for (i = 0; i < 4; i++)
        {
            abyte3[i] = (byte)(abyte1[i] ^ abyte2[i]);
        }

        i = 0;
_L10:
        if (i >= 4) goto _L7; else goto _L6
_L6:
label1:
        {
            if (abyte0[i] == abyte3[i])
            {
                break label1;
            }
            i = 0;
        }
        if (true) goto _L9; else goto _L8
_L8:
        i++;
          goto _L10
        i = 1;
          goto _L9
        Map map;
        Iterator iterator;
        map = ((cb) (obj)).a();
        iterator = cb1.a().entrySet().iterator();
_L11:
        java.util.Map.Entry entry;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_470;
            }
            entry = (java.util.Map.Entry)iterator.next();
            if (!((ch)entry.getValue()).b())
            {
                break MISSING_BLOCK_LABEL_453;
            }
            map.put(entry.getKey(), entry.getValue());
        } while (true);
        cb1;
        throw cb1;
        map.remove(entry.getKey());
          goto _L11
        ((cb) (obj)).a(cb1.d());
        ((cb) (obj)).a(b(((cb) (obj))));
        cb1 = ((cb) (obj));
          goto _L12
    }

    public final void a(hx hx1)
    {
        b = hx1;
    }

    public final void b()
    {
        if (c == null)
        {
            return;
        }
        try
        {
            byte abyte0[] = (new fs()).a(c);
            fj.a(new File(e.getFilesDir(), ".imprint"), abyte0);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

}
