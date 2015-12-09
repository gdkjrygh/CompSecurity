// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            fm, ar, as, aq, 
//            go, fr, gl, ge, 
//            aw

final class gd
{

    private fm a;

    gd()
    {
        a = new fm();
    }

    public static aq a(long l)
    {
        return a(l, ar.b, as.b);
    }

    static aq a(long l, ar ar1, as as1)
    {
        aq aq1 = new aq();
        aq1.b = l;
        a(aq1, ar1);
        aq1.a = ar1;
        aq1.d = as1.a();
        aq1.e = null;
        aq1.f = 0.0D;
        aq1.g = null;
        aq1.h = null;
        aq1.i = null;
        aq1.j = null;
        return aq1;
    }

    static aq a(long l, ar ar1, as as1, JSONObject jsonobject)
    {
        aq aq1;
        JSONArray jsonarray;
        aq1 = new aq();
        aq1.b = l;
        aq1.u = jsonobject;
        jsonarray = go.c(jsonobject, "Response.adk.beliefState.hints.hints");
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        aq1.v = ((List) (obj));
        aq1.d = as1.a();
        aq1.e = go.b(jsonobject, "Response.adk.recognition.slots");
        aq1.f = go.a(jsonobject, "Response.adk.recognition.best.confidence", Double.valueOf(1.0D)).doubleValue();
        aq1.g = go.a(jsonobject, "Response.adk.recognition.best.literal", "");
        aq1.h = go.a(jsonobject, "Response.adk.recognition.rawLiteral", "");
        aq1.i = go.a(jsonobject, "Response.adk.recognition.filteredLiteral", "");
        a(aq1, ar1);
        aq1.a = ar1;
        as1 = go.a(jsonobject, "Response.adk.agent.customEventString", null);
        ar1 = as1;
        if (as1 == null)
        {
            ar1 = go.a(jsonobject, "Response.adk.agent.customEvenString", null);
        }
        aq1.j = ar1;
        aq1.l = go.a(jsonobject, "Response.adk.agency.canonicalName", null);
        aq1.k = go.a(jsonobject, "Response.adk.agency.name", null);
        aq1.n = go.a(jsonobject, "Response.adk.agent.focus.agentname", null);
        aq1.o = go.a(jsonobject, "Response.adk.agent.focus.slotname", null);
        aq1.p = new ArrayList();
        aq1.q = new ArrayList();
        aq1.r = new ArrayList();
        aq1.s = new HashMap();
        ar1 = go.c(jsonobject, "Response.adk.agent.actions");
        if (ar1 != null)
        {
            int i1 = ar1.length();
            int i = 0;
            while (i < i1) 
            {
                ArrayList arraylist;
                int j1;
                try
                {
                    aq1.p.add(ar1.get(i).toString());
                }
                // Misplaced declaration of an exception variable
                catch (as as1)
                {
                    fr.b("Bad JSON: Error extracting agent actions from json response. Some results may be dropped");
                }
                i++;
            }
        }
        break MISSING_BLOCK_LABEL_393;
_L2:
        arraylist = new ArrayList(jsonarray.length());
        j1 = jsonarray.length();
        i = 0;
        do
        {
            obj = arraylist;
            if (i >= j1)
            {
                break;
            }
            arraylist.add(jsonarray.optString(i));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        ar1 = go.c(jsonobject, "Response.adk.agent.prompts");
        if (ar1 != null)
        {
            int k1 = ar1.length();
            int j = 0;
            while (j < k1) 
            {
                try
                {
                    aq1.q.add(ar1.get(j).toString());
                }
                // Misplaced declaration of an exception variable
                catch (as as1)
                {
                    fr.b("Bad JSON: Error extracting agent text prompts from json response. Some results may be dropped");
                }
                j++;
            }
        }
        ar1 = go.c(jsonobject, "Response.adk.agent.tts");
        if (ar1 != null)
        {
            int l1 = ar1.length();
            int k = 0;
            while (k < l1) 
            {
                try
                {
                    aq1.r.add(ar1.get(k).toString());
                }
                // Misplaced declaration of an exception variable
                catch (as as1)
                {
                    fr.b("Bad JSON: Error extracting agent ssml prompts from json response. Some results may be dropped");
                }
                k++;
            }
        }
        aq1.w = gl.a(go.c(jsonobject, "Response.adk.agent.grammars"));
        ar1 = go.b(jsonobject, "Response.adk.agent.internalization");
        if (ar1 != null)
        {
            String s;
            for (as1 = ar1.keys(); as1.hasNext(); aq1.s.put(s, ar1.optString(s)))
            {
                s = (String)as1.next();
            }

        }
        aq1.t = go.b(jsonobject, "Response.adk.concept");
        if (aq1.t == null)
        {
            aq1.t = new JSONObject();
        }
        aq1.m = go.b(jsonobject, "Response.adk.agency");
        if (aq1.m == null)
        {
            aq1.m = new JSONObject();
        }
        if ("Text".equals(aq1.d) && aq1.g == null)
        {
            fr.b("Warning: Server returned null literal text for text interpretation.");
            a(aq1, ar.c);
        }
        return aq1;
    }

    private static void a(aq aq1, ar ar1)
    {
        switch (ge.a[ar1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            aq1.c = aw.c;
            return;

        case 2: // '\002'
            aq1.c = aw.d;
            return;

        case 3: // '\003'
            aq1.c = aw.e;
            return;

        case 4: // '\004'
            aq1.c = aw.f;
            return;

        case 5: // '\005'
            aq1.c = aw.a;
            return;

        case 6: // '\006'
            aq1.c = aw.k;
            break;
        }
    }

    public static aq b(long l)
    {
        return a(l, ar.b, as.e);
    }
}
