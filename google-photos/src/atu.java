// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class atu
{

    private static final atx a = new atx();
    private static final atm b = new atv();
    private final List c;
    private final Context d;
    private final atx e;
    private final Set f;
    private final jw g;

    public atu(Context context, jw jw)
    {
        this(context, jw, a);
    }

    private atu(Context context, jw jw, atx atx1)
    {
        c = new ArrayList();
        f = new HashSet();
        g = jw;
        d = context.getApplicationContext();
        e = atx1;
    }

    private atm a(atw atw1)
    {
        return (atm)b.a(atw1.b.a(d, this), "Argument must not be null");
    }

    private void a(Class class1, Class class2, ato ato1, boolean flag)
    {
        class1 = new atw(class1, class2, ato1);
        class2 = c;
        int i;
        if (flag)
        {
            i = c.size();
        } else
        {
            i = 0;
        }
        class2.add(i, class1);
    }

    private List b(Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            atw atw1 = (atw)iterator.next();
            if (atw1.a(class1, class2))
            {
                iterator.remove();
                arraylist.add(atw1.b);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_80;
        class1;
        throw class1;
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    public final atm a(Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = c.iterator();
        boolean flag = false;
_L3:
        atw atw1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        atw1 = (atw)iterator.next();
        if (!f.contains(atw1)) goto _L2; else goto _L1
_L1:
        flag = true;
          goto _L3
_L2:
        if (!atw1.a(class1, class2)) goto _L3; else goto _L4
_L4:
        f.add(atw1);
        arraylist.add(a(atw1));
        f.remove(atw1);
          goto _L3
        class1;
        f.clear();
        throw class1;
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        if (arraylist.size() <= 1) goto _L6; else goto _L5
_L5:
        class1 = new ats(arraylist, g);
_L8:
        this;
        JVM INSTR monitorexit ;
        return class1;
_L6:
label0:
        {
            if (arraylist.size() != 1)
            {
                break label0;
            }
            class1 = (atm)arraylist.get(0);
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        class1 = b;
          goto _L8
        throw new ao(class1, class2);
    }

    final List a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        try
        {
            arraylist = new ArrayList();
            Iterator iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                atw atw1 = (atw)iterator.next();
                if (!f.contains(atw1) && atw1.a(class1))
                {
                    f.add(atw1);
                    arraylist.add(a(atw1));
                    f.remove(atw1);
                }
            } while (true);
            break MISSING_BLOCK_LABEL_120;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1) { }
        finally
        {
            this;
        }
        f.clear();
        throw class1;
        throw class1;
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    final void a(Class class1, Class class2, ato ato1)
    {
        this;
        JVM INSTR monitorenter ;
        a(class1, class2, ato1, true);
        this;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    final List b(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            atw atw1 = (atw)iterator.next();
            if (!arraylist.contains(atw1.a) && atw1.a(class1))
            {
                arraylist.add(atw1.a);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_83;
        class1;
        throw class1;
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    final void b(Class class1, Class class2, ato ato1)
    {
        this;
        JVM INSTR monitorenter ;
        a(class1, class2, ato1, false);
        this;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    final List c(Class class1, Class class2, ato ato1)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        list = b(class1, class2);
        a(class1, class2, ato1);
        this;
        JVM INSTR monitorexit ;
        return list;
        class1;
        throw class1;
    }

}
