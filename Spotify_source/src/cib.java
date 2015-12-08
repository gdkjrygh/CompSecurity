// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

public final class cib
    implements chx
{

    private final boolean a;

    public cib(boolean flag)
    {
        a = flag;
    }

    private static cnm a(cnm cnm1)
    {
        cnm cnm2 = new cnm();
        for (int i = 0; i < cnm1.size(); i++)
        {
            cnm2.put(cnm1.b(i), ((Future)cnm1.c(i)).get());
        }

        return cnm2;
    }

    public final bhh a(chw chw1, JSONObject jsonobject)
    {
        cnm cnm1 = new cnm();
        cnm cnm2 = new cnm();
        ckk ckk = chw1.a(jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray("custom_assets");
        int i = 0;
        while (i < jsonarray.length()) 
        {
            Object obj = jsonarray.getJSONObject(i);
            Object obj1 = ((JSONObject) (obj)).getString("type");
            if ("string".equals(obj1))
            {
                cnm2.put(((JSONObject) (obj)).getString("name"), ((JSONObject) (obj)).getString("string_value"));
            } else
            if ("image".equals(obj1))
            {
                String s = ((JSONObject) (obj)).getString("name");
                boolean flag = a;
                obj1 = ((JSONObject) (obj)).getJSONObject("image_value");
                boolean flag1 = ((JSONObject) (obj1)).optBoolean("require", true);
                obj = obj1;
                if (obj1 == null)
                {
                    obj = new JSONObject();
                }
                cnm1.put(s, chw1.a(((JSONObject) (obj)), flag1, flag));
            } else
            {
                bka.e((new StringBuilder("Unknown custom asset type: ")).append(((String) (obj1))).toString());
            }
            i++;
        }
        return new bhe(jsonobject.getString("custom_template_id"), a(cnm1), cnm2, (bgz)ckk.get());
    }
}
