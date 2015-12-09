// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.a.a;
import com.appboy.d.a.b;
import com.appboy.d.a.c;
import com.appboy.d.a.d;
import com.appboy.d.a.e;
import com.appboy.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            di, at, db

public final class bm
{

    private static final String a;

    public bm()
    {
    }

    public static List a(JSONArray jsonarray, Class class1, at at, db db)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        i = 0;
_L8:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_312;
        }
        Object obj = jsonarray.optString(i);
        if (!class1.equals(java/lang/String)) goto _L2; else goto _L1
_L1:
        obj = a.a.di.a(obj, class1);
_L5:
        String s;
        if (obj != null)
        {
            try
            {
                arraylist.add(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                String.format("Unable to cast JSON to [%s] in array. Ignoring.", new Object[] {
                    class1.getName()
                });
            }
        }
        break MISSING_BLOCK_LABEL_315;
_L2:
        if (!class1.equals(com/appboy/d/a/c))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        obj = new JSONObject(((String) (obj)));
        s = ((JSONObject) (obj)).getString("type");
        if (!"banner_image".equals(s)) goto _L4; else goto _L3
_L3:
        obj = new a(((JSONObject) (obj)), at, db);
_L6:
        obj = a.a.di.a(obj, class1);
          goto _L5
_L4:
label0:
        {
            if (!"captioned_image".equals(s))
            {
                break label0;
            }
            obj = new b(((JSONObject) (obj)), at, db);
        }
          goto _L6
label1:
        {
            if (!"cross_promotion_small".equals(s))
            {
                break label1;
            }
            obj = new d(((JSONObject) (obj)), at, db);
        }
          goto _L6
label2:
        {
            if (!"short_news".equals(s))
            {
                break label2;
            }
            obj = new e(((JSONObject) (obj)), at, db);
        }
          goto _L6
label3:
        {
            if (!"text_announcement".equals(s))
            {
                break label3;
            }
            obj = new com.appboy.d.a.f(((JSONObject) (obj)), at, db);
        }
          goto _L6
        throw new JSONException(String.format("Failed to construct java object of type %s from JSON [%s]", new Object[] {
            s, ((JSONObject) (obj)).toString()
        }));
        throw new JSONException(String.format("Failed to construct java object %s, target class %s isn'tString nor Card. Please update the createObject in ModelFactory to handle extra class type.", new Object[] {
            obj, class1.toString()
        }));
        return arraylist;
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/bm.getName()
        });
    }
}
