// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.text.ParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package crittercism.android:
//            t, w, o, h, 
//            p

public final class q
    implements t
{

    private boolean a;
    private ArrayList b;
    private final int c;
    private final String d;
    private final p e;

    public q(int i, boolean flag, String s, p p1)
    {
        a = false;
        c = Math.max(i, 10);
        d = s;
        b = new ArrayList();
        a = flag;
        if (flag)
        {
            a(w.a);
        }
        e = p1;
    }

    private void a(ArrayList arraylist)
    {
        this;
        JVM INSTR monitorenter ;
        b.addAll(arraylist);
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        arraylist;
        throw arraylist;
    }

    private void c()
    {
        int j = 0;
        int k = b.size() - c;
        if (k > 0)
        {
            int i;
            if (a)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            for (; j < k; j++)
            {
                b.remove(i);
            }

        }
    }

    public final JSONArray a()
    {
        JSONArray jsonarray = new JSONArray();
        for (int i = 0; i < b.size(); i++)
        {
            jsonarray.put(((o)b.get(i)).b());
        }

        return jsonarray;
    }

    public final void a(o o1)
    {
        this;
        JVM INSTR monitorenter ;
        b.add(o1);
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        o1;
        throw o1;
    }

    public final boolean a(h h1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        h1.b(s, s1, a().toString());
        this;
        JVM INSTR monitorexit ;
        return true;
        h1;
        throw h1;
    }

    public final Object b()
    {
        return a();
    }

    public final boolean b(h h1, String s, String s1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        s = h1.a(s, s1, (new JSONArray()).toString());
        h1 = new JSONArray();
        s = new JSONArray(s);
        h1 = s;
_L6:
        s = new ArrayList();
        int i = 0;
_L2:
        int j = h1.length();
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s.add(e.a(h1.getJSONArray(i)));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        a(s);
        flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
        h1;
        throw h1;
        h1;
        continue; /* Loop/switch isn't completed */
        h1;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
