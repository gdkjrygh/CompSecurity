// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            bd, shelduck, gs

public final class ch
{

    private static ch b;
    HashSet a;

    public ch()
    {
        a = new HashSet();
    }

    public static ch a()
    {
        if (b != null)
        {
            return b;
        } else
        {
            ch ch1 = new ch();
            b = ch1;
            return ch1;
        }
    }

    public final void a(bd bd1)
    {
        if (bd1 == null) goto _L2; else goto _L1
_L1:
        bd1 = bd1.c;
        if (bd1 == null) goto _L4; else goto _L3
_L3:
        Object obj = bd1.optJSONObject("settings").optJSONArray("disable");
        if (obj == null) goto _L4; else goto _L5
_L5:
        int i = 0;
_L7:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((JSONArray) (obj)).get(i) != null && (((JSONArray) (obj)).get(i) instanceof String))
        {
            a.add((String)((JSONArray) (obj)).get(i));
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        Class.forName("com.google.android.gms.location.d");
_L11:
        Class.forName("com.google.android.gms.gcm.b");
_L12:
        obj = a;
        if (((HashSet) (obj)).contains(shelduck.c.B))
        {
            ((HashSet) (obj)).add(shelduck.b.B);
            ((HashSet) (obj)).add(shelduck.a.B);
            ((HashSet) (obj)).add(shelduck.v.B);
            ((HashSet) (obj)).add(shelduck.d.B);
        }
        if (((HashSet) (obj)).contains(shelduck.d.B))
        {
            ((HashSet) (obj)).add(shelduck.e.B);
            ((HashSet) (obj)).add(shelduck.g.B);
            ((HashSet) (obj)).add(shelduck.f.B);
            ((HashSet) (obj)).add(shelduck.i.B);
        }
        if (((HashSet) (obj)).contains(shelduck.m.B))
        {
            ((HashSet) (obj)).add(shelduck.l.B);
            ((HashSet) (obj)).add(shelduck.k.B);
            ((HashSet) (obj)).add(shelduck.r.B);
            ((HashSet) (obj)).add(shelduck.q.B);
            ((HashSet) (obj)).add(shelduck.p.B);
        }
        a = ((HashSet) (obj));
_L4:
        if (bd1 == null) goto _L2; else goto _L8
_L8:
        bd1 = bd1.optJSONObject("settings").optJSONArray("enable");
        if (bd1 == null) goto _L2; else goto _L9
_L9:
        obj = new HashSet();
        i = 0;
_L14:
        if (i < bd1.length())
        {
            if (bd1.get(i) != null && (bd1.get(i) instanceof String))
            {
                a.remove(bd1.get(i));
                ((HashSet) (obj)).add(bd1.get(i));
            }
            break MISSING_BLOCK_LABEL_634;
        }
          goto _L10
        obj;
        a.add(shelduck.t.B);
          goto _L11
        bd1;
        gs.b("error checking disabled sources", bd1);
_L2:
        return;
        obj;
        a.add(shelduck.s.B);
          goto _L12
_L10:
        if (((HashSet) (obj)).contains(shelduck.c.B))
        {
            a.remove(shelduck.b.B);
            a.remove(shelduck.a.B);
            a.remove(shelduck.v.B);
            a.remove(shelduck.d.B);
        }
        if (((HashSet) (obj)).contains(shelduck.d.B))
        {
            a.remove(shelduck.e.B);
            a.remove(shelduck.g.B);
            a.remove(shelduck.f.B);
            a.remove(shelduck.i.B);
        }
        if (!((HashSet) (obj)).contains(shelduck.m.B)) goto _L2; else goto _L13
_L13:
        a.remove(shelduck.l.B);
        a.remove(shelduck.k.B);
        a.remove(shelduck.r.B);
        a.remove(shelduck.q.B);
        a.remove(shelduck.p.B);
        return;
        i++;
          goto _L14
    }
}
