// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.util.Pair;
import com.tinder.parse.UserParse;
import com.tinder.utils.e;
import com.tinder.utils.v;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ab

final class a
    implements com.tinder.utils.._cls1
{

    final a a;

    public final void a(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        a.a.b(false);
_L4:
        a.a.d = false;
        return;
_L2:
        obj = (Pair)obj;
        (new StringBuilder("valid status: ")).append(((Pair) (obj)).first);
        switch (nd[((com.tinder.parse.e.RecsResponse)((Pair) (obj)).first).ordinal()])
        {
        case 1: // '\001'
            a.a.a(false);
            a.a.a((ArrayList)((Pair) (obj)).second);
            a.a.i();
            break;

        case 3: // '\003'
            a.a.b(false);
            break;

        case 4: // '\004'
        case 5: // '\005'
            a.a.a(true);
            a.a.b(false);
            break;

        case 2: // '\002'
            a.a.a(false);
            a.a.h();
            a.a.b(false);
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/tinder/managers/ab$11

/* anonymous class */
    final class ab._cls11
        implements com.android.volley.i.b
    {

        final String a;
        final ab b;

        public final void a(Object obj)
        {
            obj = e.a(new ab._cls11._cls2((JSONObject)obj));
            obj.a = new ab._cls11._cls1(this);
            ((e) (obj)).a(true);
        }

            
            {
                b = ab1;
                a = s;
                super();
            }

        // Unreferenced inner class com/tinder/managers/ab$11$2

/* anonymous class */
        final class ab._cls11._cls2
            implements com.tinder.utils.e.a
        {

            final JSONObject a;
            final ab._cls11 b;

            public final Object a()
            {
                Pair pair;
                try
                {
                    (new StringBuilder("RECS URL ")).append(b.a);
                    pair = b.b.k.a(a, b.b.c);
                }
                catch (JSONException jsonexception)
                {
                    v.a("Failed to parse recs", jsonexception);
                    return null;
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    System.gc();
                    v.a("Out of memory parsing recs", outofmemoryerror);
                    return null;
                }
                return pair;
            }

                    
                    {
                        b = ab._cls11.this;
                        a = jsonobject;
                        super();
                    }
        }

    }

}
