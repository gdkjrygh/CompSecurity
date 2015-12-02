// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import com.alibaba.api.mailingaddress.pojo.AddressNode;
import com.alibaba.api.mailingaddress.pojo.AddressNodesResult;
import com.alibaba.app.AEApp;
import java.util.ArrayList;

class lang.Object
    implements lang.Object
{

    final String a;
    final nz b;

    public Object a(t t)
    {
label0:
        {
            try
            {
                t = new xh();
                t.a(a);
                t.b("en_US");
                t = (AddressNodesResult)t.request();
            }
            // Misplaced declaration of an exception variable
            catch (t t)
            {
                lw.b("CountryManager", t.toString(), new Object[0]);
                t = null;
            }
            if (t != null)
            {
                Object obj = AEApp.f().getSharedPreferences(.c(), 0);
                if (obj != null)
                {
                    obj = ((SharedPreferences) (obj)).edit();
                    if (obj != null)
                    {
                        ((android.content.dPreferences.Editor) (obj)).putBoolean((new StringBuilder()).append("countrycode_").append(a).toString(), true);
                        ((android.content.dPreferences.Editor) (obj)).commit();
                    }
                }
                try
                {
                    obj = lv.a(t);
                }
                catch (Exception exception)
                {
                    lw.a("CountryManager", exception, new Object[0]);
                    exception = null;
                }
                t = t.getResult();
                if (me.c(((String) (obj))) || t == null || t.size() <= 0 || t.get(0) == null || !((AddressNode)t.get(0)).isHasChildren() || ((AddressNode)t.get(0)).getChildren() == null)
                {
                    break label0;
                }
                aff.a().a("ADDRESS", (new StringBuilder()).append(a).append("_").append("PROVINCE").toString(), ((String) (obj)), 1);
            }
            return null;
        }
        aff.a().a("ADDRESS", (new StringBuilder()).append(a).append("_").append("PROVINCE").toString(), "", 1);
        return null;
    }

    >(nz nz1, String s)
    {
        b = nz1;
        a = s;
        super();
    }
}
