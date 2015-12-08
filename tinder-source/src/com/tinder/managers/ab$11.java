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
    implements com.android.volley.
{

    final String a;
    final ab b;

    public final void a(Object obj)
    {
        obj = e.a(new com.tinder.utils.e.a((JSONObject)obj) {

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
        });
        obj.a = new com.tinder.utils.e.c() {

            final ab._cls11 a;

            public final void a(Object obj1)
            {
                if (obj1 != null) goto _L2; else goto _L1
_L1:
                a.b.b(false);
_L4:
                a.b.d = false;
                return;
_L2:
                obj1 = (Pair)obj1;
                (new StringBuilder("valid status: ")).append(((Pair) (obj1)).first);
                switch (ab._cls8.a[((com.tinder.parse.UserParse.RecsResponse)((Pair) (obj1)).first).ordinal()])
                {
                case 1: // '\001'
                    a.b.a(false);
                    a.b.a((ArrayList)((Pair) (obj1)).second);
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
        };
        ((e) (obj)).a(true);
    }

    _cls2.a(ab ab1, String s)
    {
        b = ab1;
        a = s;
        super();
    }
}
