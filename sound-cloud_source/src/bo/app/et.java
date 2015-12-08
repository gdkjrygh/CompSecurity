// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.c;
import com.appboy.d;
import com.appboy.d.b.a;
import com.appboy.e;
import com.google.android.gms.wearable.DataMap;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            an, dc, eu, cz, 
//            cb

public class et
{

    private static final String a;

    public et()
    {
    }

    public static dc a(DataMap datamap)
    {
        dc dc1 = null;
        if (b(datamap) == an.w)
        {
            try
            {
                dc1 = bo.app.dc.a(new JSONObject(datamap.getString("v0")));
            }
            // Misplaced declaration of an exception variable
            catch (DataMap datamap)
            {
                return null;
            }
        }
        return dc1;
    }

    private static a a(String s)
    {
        try
        {
            s = new a(new JSONObject(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static boolean a(DataMap datamap, e e1)
    {
        an an1 = b(datamap);
        boolean flag = datamap.getBoolean("h");
        Object obj;
        if (flag)
        {
            obj = a(datamap.getString("p"));
        } else
        {
            obj = null;
        }
        switch (bo.app.eu.a[an1.ordinal()])
        {
        default:
            (new StringBuilder("No current implementation for action in DataMap: ")).append(datamap.toString());
            return false;

        case 1: // '\001'
            datamap = datamap.getString("v0");
            if (flag && obj != null)
            {
                return e1.a(datamap, ((a) (obj)));
            } else
            {
                return e1.a(datamap);
            }

        case 2: // '\002'
            String s = datamap.getString("v0");
            String s1 = datamap.getString("v1");
            datamap = new BigDecimal(datamap.getString("v2"));
            if (flag && obj != null)
            {
                return e1.a(s, s1, datamap, ((a) (obj)));
            } else
            {
                return e1.a(s, s1, datamap);
            }

        case 3: // '\003'
            return e1.b(datamap.getString("v0"));

        case 4: // '\004'
            return e1.a(datamap.getString("v0"), datamap.getString("v1"), datamap.getBoolean("v2"));

        case 5: // '\005'
            obj = datamap.getString("k");
            datamap = datamap.getString("v0");
            return e1.e().b(((String) (obj)), datamap);

        case 6: // '\006'
            obj = datamap.getString("k");
            int i = datamap.getInt("v0");
            return e1.e().b(((String) (obj)), i);

        case 7: // '\007'
            obj = datamap.getString("k");
            datamap = datamap.getStringArray("v0");
            return e1.e().a(((String) (obj)), datamap);

        case 8: // '\b'
            obj = datamap.getString("k");
            int j = datamap.getInt("v1");
            if (j == 1)
            {
                return e1.e().a(((String) (obj)), datamap.getBoolean("v0"));
            }
            if (j == 3)
            {
                return e1.e().a(((String) (obj)), datamap.getFloat("v0"));
            }
            if (j == 4)
            {
                return e1.e().a(((String) (obj)), datamap.getInt("v0"));
            }
            if (j == 5)
            {
                return e1.e().a(((String) (obj)), datamap.getLong("v0"));
            }
            double d1;
            double d2;
            int k;
            long l;
            if (j == 2)
            {
                return e1.e().a(((String) (obj)), datamap.getString("v0"));
            } else
            {
                return false;
            }

        case 9: // '\t'
            datamap = datamap.getString("k");
            return e1.e().g(datamap);

        case 10: // '\n'
            datamap = datamap.getString("k");
            return e1.e().h(datamap);

        case 11: // '\013'
            obj = datamap.getString("k");
            l = datamap.getLong("v0");
            return e1.e().b(((String) (obj)), l);

        case 12: // '\f'
            d1 = datamap.getDouble("v0");
            d2 = datamap.getDouble("v1");
            if (datamap.containsKey("v2"))
            {
                obj = Double.valueOf(datamap.getDouble("v2"));
            } else
            {
                obj = null;
            }
            if (datamap.containsKey("v3"))
            {
                datamap = Double.valueOf(datamap.getDouble("v3"));
            } else
            {
                datamap = null;
            }
            e1 = e1.e();
            try
            {
                datamap = new cz(d1, d2, datamap, ((Double) (obj)));
                ((c) (e1)).b.a(datamap);
            }
            // Misplaced declaration of an exception variable
            catch (DataMap datamap) { }
            return true;

        case 13: // '\r'
            return e1.e().i(datamap.getString("v0"));

        case 14: // '\016'
            return e1.e().d(datamap.getString("v0"));

        case 15: // '\017'
            return e1.e().c(datamap.getString("v0"));

        case 16: // '\020'
            return e1.e().a(datamap.getString("v0"));

        case 17: // '\021'
            return e1.e().e(datamap.getString("v0"));

        case 18: // '\022'
            return e1.e().b(datamap.getString("v0"));

        case 19: // '\023'
            return e1.e().f(datamap.getString("v0"));

        case 20: // '\024'
            datamap = com.appboy.b.d.valueOf(datamap.getString("v0"));
            return e1.e().a(datamap);

        case 21: // '\025'
            j = datamap.getInt("v0");
            obj = com.appboy.b.e.valueOf(datamap.getString("v1"));
            k = datamap.getInt("v2");
            return e1.e().a(j, ((com.appboy.b.e) (obj)), k);

        case 22: // '\026'
            (new StringBuilder("Got an unsupported wearable sdk action. DataMap: ")).append(datamap.toString());
            return false;
        }
    }

    public static an b(DataMap datamap)
    {
        return bo.app.an.a(datamap.getString("t"));
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/et.getName()
        });
    }
}
