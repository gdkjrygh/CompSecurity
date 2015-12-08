// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.an;
import com.tinder.enums.StatusCode;
import com.tinder.parse.f;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            aa, ae

final class a
    implements com.android.volley.
{

    final an a;
    final aa b;

    public final void a(Object obj)
    {
        Object obj1 = (JSONObject)obj;
        obj = a;
        int i;
        try
        {
            (new StringBuilder("response: ")).append(obj1);
            i = ((JSONObject) (obj1)).getInt("status");
            if (i == StatusCode.OK.getCode())
            {
                obj1 = f.b(((JSONObject) (obj1)));
                (new StringBuilder("status OK; purchases: ")).append(obj1.toString());
                ae.c(aa.a(((java.util.List) (obj1))));
                ((an) (obj)).a();
                return;
            }
        }
        catch (Exception exception)
        {
            ae.c(false);
            v.a("Failed to retrieve purchase data from shared prefs", exception);
            exception.getMessage();
            ((an) (obj)).b();
            return;
        }
        v.b((new StringBuilder("Tinder purchase status not OK: ")).append(i).toString());
        ae.c(false);
        ((JSONObject) (obj1)).toString();
        ((an) (obj)).b();
        return;
    }

    de(aa aa1, an an1)
    {
        b = aa1;
        a = an1;
        super();
    }
}
