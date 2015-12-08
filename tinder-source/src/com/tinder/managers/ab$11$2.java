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
    implements com.tinder.utils.._cls2
{

    final JSONObject a;
    final b b;

    public final Object a()
    {
        Pair pair;
        try
        {
            (new StringBuilder("RECS URL ")).append(b.b);
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

    a(a a1, JSONObject jsonobject)
    {
        b = a1;
        a = jsonobject;
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
            obj = e.a(new ab._cls11._cls2(this, (JSONObject)obj));
            obj.a = new ab._cls11._cls1();
            ((e) (obj)).a(true);
        }

            
            {
                b = ab1;
                a = s;
                super();
            }

        // Unreferenced inner class com/tinder/managers/ab$11$1

/* anonymous class */
        final class ab._cls11._cls1
            implements com.tinder.utils.e.c
        {

            final ab._cls11 a;

            public final void a(Object obj)
            {
                if (obj != null) goto _L2; else goto _L1
_L1:
                a.b.b(false);
_L4:
                a.b.d = false;
                return;
_L2:
                obj = (Pair)obj;
                (new StringBuilder("valid status: ")).append(((Pair) (obj)).first);
                switch (ab._cls8.a[((com.tinder.parse.UserParse.RecsResponse)((Pair) (obj)).first).ordinal()])
                {
                case 1: // '\001'
                    a.b.a(false);
                    a.b.a((ArrayList)((Pair) (obj)).second);
                    a.b.i();
                    break;

                case 3: // '\003'
                    a.b.b(false);
                    break;

                case 4: // '\004'
                case 5: // '\005'
                    a.b.a(true);
                    a.b.b(false);
                    break;

                case 2: // '\002'
                    a.b.a(false);
                    a.b.h();
                    a.b.b(false);
                    break;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

                    
                    {
                        a = ab._cls11.this;
                        super();
                    }
        }

    }

}
