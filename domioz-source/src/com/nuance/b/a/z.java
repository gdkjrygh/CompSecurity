// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import android.util.Log;
import com.nuance.b.b.a;
import com.nuance.b.b.aa;
import com.nuance.b.b.aq;
import com.nuance.b.b.dw;
import com.nuance.b.b.dx;
import com.nuance.b.b.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.a:
//            l, aa, ab, ae, 
//            f, t, u, v, 
//            w, r, s, i, 
//            a

public final class z
{

    public final ae a;
    final String b = "YES";
    private l c;
    private List d;
    private List e;
    private f f;
    private ab g;
    private List h;
    private List i;
    private AtomicBoolean j;

    public z(ae ae1)
    {
        c = new l();
        d = new ArrayList();
        e = new LinkedList();
        f = null;
        h = new ArrayList();
        i = new ArrayList();
        j = new AtomicBoolean(false);
        if (ae1 == null)
        {
            throw new NullPointerException("null dialogModel");
        } else
        {
            a = ae1;
            return;
        }
    }

    private void b(aq aq1)
    {
        if (aq1.u == null) goto _L2; else goto _L1
_L1:
        Object obj = "get response object";
        aq1 = aq1.u.getJSONObject("Response");
        obj = "get adk object";
        JSONObject jsonobject = aq1.getJSONObject("adk");
        obj = "get nbest content";
        aq1 = ((aq) (obj));
        jsonobject = jsonobject.getJSONObject("SemanticInterpretation");
        aq1 = ((aq) (obj));
        Object obj1 = new TreeSet(new com.nuance.b.a.aa(this));
        aq1 = ((aq) (obj));
        Object obj2 = jsonobject.keys();
_L4:
        aq1 = ((aq) (obj));
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        aq1 = ((aq) (obj));
        ((TreeSet) (obj1)).add((String)((Iterator) (obj2)).next());
        if (true) goto _L4; else goto _L3
        obj;
_L8:
        Log.d("ConversationManager", (new StringBuilder("nBest: ")).append(aq1).toString());
_L2:
        return;
_L3:
        aq1 = ((aq) (obj));
        obj1 = ((TreeSet) (obj1)).iterator();
_L6:
        aq1 = ((aq) (obj));
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L5
_L5:
        aq1 = ((aq) (obj));
        String s1 = (String)((Iterator) (obj1)).next();
        aq1 = ((aq) (obj));
        obj = (new StringBuilder("couldn't get nbest.")).append(s1).toString();
        aq1 = ((aq) (obj));
        obj2 = jsonobject.getJSONObject(s1);
        aq1 = ((aq) (obj));
        obj = (new StringBuilder("couldn't put nbest.")).append(s1).toString();
        aq1 = ((aq) (obj));
        obj = aq1;
        c.a.add(obj2);
        obj = aq1;
          goto _L6
        aq1;
        aq1 = ((aq) (obj));
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e.isEmpty();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final l a()
    {
        this;
        JVM INSTR monitorenter ;
        l l1 = c;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ab ab1)
    {
        g = ab1;
    }

    public final void a(aq aq1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        String s1;
        g = ab.f;
        c.d(aq1.g);
        c.e(aq1.a());
        c.f(aq1.b());
        c.c(aq1.x);
        c.a(aq1.a);
        c.a(aq1);
        c.a = new ArrayList();
        b(aq1);
        if (aq1.n != null)
        {
            c.b(aq1.n);
        }
        if (aq1.k != null)
        {
            c.a(aq1.k);
        }
        s1 = c.b();
        d = new ArrayList();
        obj = new ArrayList();
        if (aq1.q != null)
        {
            for (Iterator iterator = aq1.q.iterator(); iterator.hasNext(); ((List) (obj)).add((String)iterator.next())) { }
        }
        c.b = ((List) (obj));
        obj = new ArrayList();
        if (aq1.r != null)
        {
            for (Iterator iterator1 = aq1.r.iterator(); iterator1.hasNext(); ((List) (obj)).add((String)iterator1.next())) { }
        }
        c.c = ((List) (obj));
        h = new ArrayList();
        i = new ArrayList();
        Object obj1 = null;
        Object obj3 = aq1.u;
        Object obj2;
        obj2 = null;
        obj = obj3;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        obj = ((JSONObject) (obj3)).optJSONObject("Response");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        obj1 = ((JSONObject) (obj)).optJSONObject("adk");
        obj2 = ((JSONObject) (obj)).optJSONObject("request");
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        obj = ((JSONObject) (obj2)).optString("jsessionid");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        c.g(((String) (obj)));
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj2 = ((JSONObject) (obj1)).optJSONObject("beliefState");
        obj = ((JSONObject) (obj1)).optJSONObject("agent");
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        obj1 = ((JSONObject) (obj2)).optJSONObject("hints");
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        obj1 = ((JSONObject) (obj1)).optJSONArray("hints");
        if (obj1 == null) goto _L4; else goto _L6
_L6:
        int k = 0;
_L7:
        if (k >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        d.add(((JSONArray) (obj1)).optString(k));
        k++;
        if (true) goto _L7; else goto _L4
_L2:
        c.e = new ArrayList();
        aq1 = a.a(s1);
        if (aq1 == null)
        {
            break MISSING_BLOCK_LABEL_521;
        }
        if (c.c() != null)
        {
            d.addAll(a.getHints(c.c(), this));
        }
        aq1.handleInterpretation(s1, this);
_L17:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1850;
        }
        obj = ((JSONObject) (obj)).optJSONObject("collectedValues");
_L21:
        Object obj4;
        obj2 = new ArrayList();
        obj1 = new ArrayList();
        obj3 = new ArrayList();
        obj4 = new ArrayList();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1385;
        }
        Iterator iterator2 = ((JSONObject) (obj)).keys();
_L11:
        String s2;
        if (!iterator2.hasNext())
        {
            break MISSING_BLOCK_LABEL_1385;
        }
        s2 = (String)iterator2.next();
        ((List) (obj2)).add(s2);
        Object obj5;
        Object obj6;
        Object obj7;
        boolean flag1;
        obj7 = ((JSONObject) (obj)).getJSONObject(s2);
        obj5 = new t(((JSONObject) (obj7)).optString("surfaceMeaning", ""), ((JSONObject) (obj7)).optString("groundedMeaning", ""), ((JSONObject) (obj7)).optString("literal", ""), ((JSONObject) (obj7)).optInt("attempt", 0), ((JSONObject) (obj7)).optInt("turn", 0), (float)((JSONObject) (obj7)).optDouble("confidence", 0.0D), (float)((JSONObject) (obj7)).optDouble("predictionScore", 0.0D), com.nuance.b.a.u.a(((JSONObject) (obj7)).optString("inputMode")), com.nuance.b.a.v.a(((JSONObject) (obj7)).optString("source")), com.nuance.b.a.w.a(((JSONObject) (obj7)).optString("status")), "YES".equals(((JSONObject) (obj7)).optString("collectedDuringLastTurn")), ((JSONObject) (obj7)).optString("agentName", ""));
        flag1 = "YES".equals(((JSONObject) (obj7)).optString("collectedDuringLastTurn", ""));
        obj6 = a.b(s2);
        if (obj6 != null) goto _L9; else goto _L8
_L8:
        Log.d("ConversationManager", (new StringBuilder("Agent in collectedValues that is not present in dialog model: '")).append(s2).append("'").toString());
        obj6 = new r(((JSONObject) (obj7)).optString("slot", ""), com.nuance.b.a.s.a, null);
        ((r) (obj6)).setValue(((t) (obj5)));
        ((List) (obj3)).add(obj6);
        if (!flag1) goto _L11; else goto _L10
_L10:
        ((List) (obj4)).add(obj6);
          goto _L11
_L13:
        Log.e("ConversationManager", (new StringBuilder("Error extracting slot ")).append(s2).append(" from interpretation").toString());
        Log.e("ConversationManager", ((JSONException) (obj5)).toString());
          goto _L11
_L9:
label0:
        {
            ((List) (obj3)).add(((i) (obj6)).concept);
            if (((i) (obj6)).concept.getValue() != null)
            {
                break label0;
            }
            ((List) (obj4)).add(((i) (obj6)).concept);
            ((i) (obj6)).concept.setValue(((t) (obj5)));
            if (!((i) (obj6)).a.name.equals(s1) && !((List) (obj1)).contains(((i) (obj6)).a))
            {
                ((List) (obj1)).add(((i) (obj6)).a);
            }
        }
        if (true) goto _L11; else goto _L12
_L12:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1050;
        }
        ((i) (obj6)).concept.setValue(((t) (obj5)));
        ((List) (obj4)).add(((i) (obj6)).concept);
          goto _L11
        obj7 = ((i) (obj6)).concept.getValue();
        if (((t) (obj5)).k || obj7 == null)
        {
            break MISSING_BLOCK_LABEL_1855;
        }
        try
        {
            if ((((t) (obj5)).a == null || ((t) (obj5)).a.equals(((t) (obj7)).a)) && (((t) (obj5)).c == null || ((t) (obj5)).c.equals(((t) (obj7)).c)) && (((t) (obj7)).c == null || ((t) (obj7)).c.equals(((t) (obj5)).c)) && ((t) (obj5)).d == ((t) (obj7)).d && ((t) (obj5)).e == ((t) (obj7)).e && ((t) (obj5)).f == ((t) (obj7)).f && ((t) (obj5)).g == ((t) (obj7)).g && ((t) (obj5)).h == ((t) (obj7)).h && ((t) (obj5)).i == ((t) (obj7)).i && ((t) (obj5)).j == ((t) (obj7)).j)
            {
                break MISSING_BLOCK_LABEL_1861;
            }
            break MISSING_BLOCK_LABEL_1855;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj5) { }
        finally
        {
            throw aq1;
        }
          goto _L13
        flag = true;
        boolean flag;
        for (; !flag; flag = false)
        {
            break MISSING_BLOCK_LABEL_1272;
        }

        ((i) (obj6)).concept.setValue(((t) (obj5)));
        ((List) (obj4)).add(((i) (obj6)).concept);
          goto _L11
        ((i) (obj6)).concept.setValue(((t) (obj5)));
        obj5 = ((i) (obj6)).concept;
        if (obj5 == null) goto _L11; else goto _L14
_L14:
        obj6 = ((r) (obj5)).getValue();
        if (obj6 == null) goto _L11; else goto _L15
_L15:
        if (!((t) (obj6)).k) goto _L11; else goto _L16
_L16:
        ((r) (obj5)).setValue(new t(((t) (obj6)).a, ((t) (obj6)).b, ((t) (obj6)).c, ((t) (obj6)).d, ((t) (obj6)).e, ((t) (obj6)).f, ((t) (obj6)).g, ((t) (obj6)).h, ((t) (obj6)).i, ((t) (obj6)).j, false, ((t) (obj6)).l));
          goto _L11
        c.d = ((List) (obj3));
        c.e = ((List) (obj4));
        obj = a.b().entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj4 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj3 = (String)((java.util.Map.Entry) (obj4)).getKey();
            obj4 = (com.nuance.b.a.a)((java.util.Map.Entry) (obj4)).getValue();
            if ((obj4 instanceof i) && !((List) (obj2)).contains(obj3))
            {
                ((i)obj4).concept.setValue(null);
            }
        } while (true);
        if (c.c() != null)
        {
            d.addAll(a.getHints(c.c(), this));
        }
        if (!"none".equals(aq1.k) || !"".equals(aq1.l))
        {
            break MISSING_BLOCK_LABEL_1593;
        }
        aq1 = c.c();
        if (aq1 == null)
        {
            break MISSING_BLOCK_LABEL_1583;
        }
        if (-1 != aq1.indexOf('#'))
        {
            break MISSING_BLOCK_LABEL_1593;
        }
        g = ab.c;
          goto _L17
        Log.d("ConversationManager", "Going to handleInterpretation on transient agencies");
        Log.d("ConversationManager", Arrays.toString(((List) (obj1)).toArray()));
        Log.d("ConversationManager", (new StringBuilder("And on active agency: ")).append(s1).toString());
        for (aq1 = ((List) (obj1)).iterator(); aq1.hasNext(); ((f) (obj)).deactivate())
        {
            obj = (f)aq1.next();
            if (!((f) (obj)).isActive())
            {
                ((f) (obj)).activate();
            }
            ((f) (obj)).handleInterpretation(s1, this);
        }

        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1818;
        }
        aq1 = a.a(s1);
        if (f != null && f != aq1 && f.isActive())
        {
            f.deactivate();
        }
        f = aq1;
        if (aq1 == null) goto _L19; else goto _L18
_L18:
        if (!aq1.isActive())
        {
            aq1.activate();
        }
        aq1.handleInterpretation(s1, this);
          goto _L17
_L19:
        if (a.h == null) goto _L17; else goto _L20
_L20:
        if (!a.h.isActive())
        {
            a.h.activate();
        }
        a.h.handleInterpretation(s1, this);
          goto _L17
        if (f != null && f.isActive())
        {
            f.deactivate();
        }
        f = null;
          goto _L17
        obj = null;
          goto _L21
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s1.length() != 0) goto _L3; else goto _L2
_L2:
        Log.e("ConversationMgr.resetAgency: ", "Attempted to reset null target");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (a.b(s1) == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        e.add(new dw(s1, a));
          goto _L4
        s1;
        throw s1;
label0:
        {
            if (a.a(s1) == null)
            {
                break label0;
            }
            e.add(new dw(s1, a));
        }
          goto _L4
        Log.e("ConversationMgr.resetAgency: ", (new StringBuilder("Cant find target node. ")).append(s1).toString());
          goto _L4
    }

    public final void a(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        e.add(new dx(s1, s2, aa.b));
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public final long b()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = 0x8000000000000000L;
        long l2;
        if (!h())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        l2 = v.r().a((a[])e.toArray(new a[0]));
        l1 = l2;
        if (l2 < 0L)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        e.clear();
        l1 = l2;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(String s1)
    {
        h.add(s1);
    }

    public final long c()
    {
        if (!j.getAndSet(false))
        {
            return 0x8000000000000000L;
        }
        long l1;
        try
        {
            JSONArray jsonarray = new JSONArray("[{\"body\":{\"action\":\"markContext\"},\"subject\":\"beliefStateUpdate\"}]");
            l1 = v.r().a(jsonarray);
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException("Unreachable", jsonexception);
        }
        return l1;
    }

    public final void c(String s1)
    {
        i.add(s1);
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        f f1 = f;
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        if (f1.isActive())
        {
            f1.deactivate();
        }
        f1 = a.a(c.b());
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (f1.isActive())
        {
            f1.deactivate();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final List e()
    {
        this;
        JVM INSTR monitorenter ;
        List list = h;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public final List f()
    {
        this;
        JVM INSTR monitorenter ;
        List list = i;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public final ab g()
    {
        return g;
    }
}
