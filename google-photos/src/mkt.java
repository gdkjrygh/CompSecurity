// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class mkt
{

    private static final mky a = new mku();
    private static final mky b = new mkv();
    private static final mky c = new mkw();
    private static final mky d = new mkx();
    private final mld e;

    public mkt(mld mld1)
    {
        if (mld1 == null)
        {
            mld1 = new mld();
        }
        e = mld1;
    }

    static mlm b(JSONObject jsonobject)
    {
        Object obj = jsonobject.opt("width");
        jsonobject = ((JSONObject) (jsonobject.opt("height")));
        if (!(obj instanceof Integer) || !(jsonobject instanceof Integer))
        {
            throw new mlb("Size missing width or height.");
        } else
        {
            return new mlm(((Integer)obj).intValue(), ((Integer)jsonobject).intValue());
        }
    }

    static mll c(JSONObject jsonobject)
    {
        return f(jsonobject);
    }

    static mll d(JSONObject jsonobject)
    {
        return g(jsonobject);
    }

    static TimeInterpolator e(JSONObject jsonobject)
    {
        String s;
        byte byte0;
        if (jsonobject == null)
        {
            return new LinearInterpolator();
        }
        s = jsonobject.optString("name");
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 52
    //                   -1102672091: 94
    //                   2146926274: 80;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_94;
_L4:
        switch (byte0)
        {
        default:
            return new LinearInterpolator();

        case 0: // '\0'
            return new mlk((float)jsonobject.optDouble("x1"), (float)jsonobject.optDouble("y1"), (float)jsonobject.optDouble("x2"), (float)jsonobject.optDouble("y2"));
        }
_L3:
        if (s.equals("cubic-bezier"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("linear"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    private static mll f(JSONObject jsonobject)
    {
        if (!(jsonobject.opt("x") instanceof Number) || !(jsonobject.opt("y") instanceof Number))
        {
            throw new mlb("Point missing x or y.");
        } else
        {
            return new mll((float)jsonobject.optDouble("x"), (float)jsonobject.optDouble("y"));
        }
    }

    private static mll g(JSONObject jsonobject)
    {
        if (!(jsonobject.opt("sx") instanceof Number) || !(jsonobject.opt("sy") instanceof Number))
        {
            throw new mlb("Scale missing sx or sy.");
        } else
        {
            return new mll((float)jsonobject.optDouble("sx"), (float)jsonobject.optDouble("sy"));
        }
    }

    private static int h(JSONObject jsonobject)
    {
        double d4 = 1.0D;
        double d1;
        double d2;
        double d3;
        if (jsonobject.has("a"))
        {
            d1 = jsonobject.optDouble("a");
        } else
        {
            d1 = 1.0D;
        }
        if (jsonobject.has("r"))
        {
            d2 = jsonobject.optDouble("r");
        } else
        {
            d2 = 1.0D;
        }
        if (jsonobject.has("g"))
        {
            d3 = jsonobject.optDouble("g");
        } else
        {
            d3 = 1.0D;
        }
        if (jsonobject.has("b"))
        {
            d4 = jsonobject.optDouble("b");
        }
        return Color.argb((int)Math.round(d1 * 255D), (int)Math.round(d2 * 255D), (int)Math.round(d3 * 255D), (int)Math.round(d4 * 255D));
    }

    mkq a(JSONObject jsonobject)
    {
        Object obj1;
        String s3;
        String s = jsonobject.optString("type");
        if (!s.equals("animationGroup"))
        {
            jsonobject = String.valueOf(s);
            if (jsonobject.length() != 0)
            {
                jsonobject = "Unexpected animation group type: ".concat(jsonobject);
            } else
            {
                jsonobject = new String("Unexpected animation group type: ");
            }
            throw new mlb(jsonobject);
        }
        s3 = jsonobject.optString("id");
        if (TextUtils.isEmpty(s3))
        {
            throw new mlb("Found animation missing id.");
        }
        obj1 = jsonobject.optString("parentId");
        if (jsonobject.optJSONObject("shape") == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        obj = jsonobject.optJSONObject("shape").optString("name");
        i = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 2: default 152
    //                   -1656480802: 259
    //                   1121299823: 275;
           goto _L3 _L4 _L5
_L3:
        i;
        JVM INSTR tableswitch 0 1: default 176
    //                   0 291
    //                   1 297;
           goto _L2 _L6 _L7
_L2:
        int j;
        j = 0;
        break; /* Loop/switch isn't completed */
_L4:
        if (((String) (obj)).equals("ellipse"))
        {
            i = 0;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (((String) (obj)).equals("rectangle"))
        {
            i = 1;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        j = 1;
          goto _L8
_L7:
        j = 0;
_L8:
        long l1 = Math.round(jsonobject.optDouble("duration") * 1000D);
        String s1;
        String s2;
        if (jsonobject.has("text"))
        {
            s1 = e.a(s3, jsonobject.optString("text"));
        } else
        {
            s1 = null;
        }
        float f1;
        float f2;
        Object obj2;
        Object obj3;
        ArrayList arraylist;
        Object obj4;
        Object obj5;
        int k;
        int l;
        int i1;
        long l2;
        long l3;
        if (!TextUtils.isEmpty(jsonobject.optString("backgroundImage")))
        {
            s2 = jsonobject.optString("backgroundImage");
        } else
        {
            s2 = null;
        }
        if (jsonobject.optJSONObject("initialValues") == null)
        {
            throw new mlb("Animation group missing initial values.");
        }
        obj2 = jsonobject.optJSONArray("animations");
        if (obj2 == null)
        {
            i = 0;
        } else
        {
            i = ((JSONArray) (obj2)).length();
        }
        arraylist = new ArrayList(i);
        if (obj2 == null) goto _L10; else goto _L9
_L9:
        k = 0;
_L22:
        if (k >= ((JSONArray) (obj2)).length()) goto _L10; else goto _L11
_L11:
        obj = ((JSONArray) (obj2)).optJSONObject(k);
        if (obj == null)
        {
            jsonobject = String.valueOf(Integer.toString(k));
            if (jsonobject.length() != 0)
            {
                jsonobject = "Unexpected animation at index ".concat(jsonobject);
            } else
            {
                jsonobject = new String("Unexpected animation at index ");
            }
            throw new mlb(jsonobject);
        }
        obj3 = ((JSONObject) (obj)).optString("id", null);
        obj4 = ((JSONObject) (obj)).optString("type");
        if (!((String) (obj4)).equals("animation"))
        {
            jsonobject = String.valueOf(obj4);
            if (jsonobject.length() != 0)
            {
                jsonobject = "Unexpected animation group type: ".concat(jsonobject);
            } else
            {
                jsonobject = new String("Unexpected animation group type: ");
            }
            throw new mlb(jsonobject);
        }
        l2 = Math.round(((JSONObject) (obj)).optDouble("delay") * 1000D);
        l3 = Math.round(((JSONObject) (obj)).optDouble("duration") * 1000D);
        obj4 = ((JSONObject) (obj)).optJSONArray("keyframes");
        obj5 = ((JSONObject) (obj)).optString("property");
        i = -1;
        ((String) (obj5)).hashCode();
        JVM INSTR lookupswitch 4: default 596
    //                   -1267206133: 685
    //                   -40300674: 719
    //                   109250890: 736
    //                   747804969: 702;
           goto _L12 _L13 _L14 _L15 _L16
_L12:
        i;
        JVM INSTR tableswitch 0 3: default 628
    //                   0 753
    //                   1 780
    //                   2 807
    //                   3 834;
           goto _L17 _L18 _L19 _L20 _L21
_L17:
        obj = String.valueOf(((JSONObject) (obj)).optString("property"));
        if (((String) (obj)).length() != 0)
        {
            obj = "Unrecognised animation property: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Unrecognised animation property: ");
        }
        Log.w("ButterflyJSONParser", ((String) (obj)));
        obj = null;
        arraylist.add(obj);
        k++;
          goto _L22
_L13:
        if (((String) (obj5)).equals("opacity"))
        {
            i = 0;
        }
          goto _L12
_L16:
        if (((String) (obj5)).equals("position"))
        {
            i = 1;
        }
          goto _L12
_L14:
        if (((String) (obj5)).equals("rotation"))
        {
            i = 2;
        }
          goto _L12
_L15:
        if (((String) (obj5)).equals("scale"))
        {
            i = 3;
        }
          goto _L12
_L18:
        obj = new mkp(((String) (obj3)), 0, l2, l3, a.b(((JSONArray) (obj4))));
        break MISSING_BLOCK_LABEL_668;
_L19:
        obj = new mkp(((String) (obj3)), 1, l2, l3, b.b(((JSONArray) (obj4))));
        break MISSING_BLOCK_LABEL_668;
_L20:
        obj = new mkp(((String) (obj3)), 3, l2, l3, c.b(((JSONArray) (obj4))));
        break MISSING_BLOCK_LABEL_668;
_L21:
        obj = new mkp(((String) (obj3)), 2, l2, l3, d.b(((JSONArray) (obj4))));
        break MISSING_BLOCK_LABEL_668;
_L10:
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = null;
        } else
        {
            obj = obj1;
        }
        obj5 = jsonobject.optJSONObject("initialValues");
        obj4 = ((JSONObject) (obj5)).optJSONObject("size");
        if (obj4 == null)
        {
            throw new mlb("Missing size in initial values.");
        }
        if (((JSONObject) (obj5)).optJSONObject("anchorPoint") != null)
        {
            obj1 = f(((JSONObject) (obj5)).optJSONObject("anchorPoint"));
        } else
        {
            obj1 = new mll(0.0F, 0.0F);
        }
        if (((JSONObject) (obj5)).optJSONObject("backgroundColor") != null)
        {
            k = h(((JSONObject) (obj5)).optJSONObject("backgroundColor"));
        } else
        {
            k = 0;
        }
        f1 = (float)((JSONObject) (obj5)).optDouble("opacity", 1.0D);
        if (((JSONObject) (obj5)).optJSONObject("position") != null)
        {
            obj2 = f(((JSONObject) (obj5)).optJSONObject("position"));
        } else
        {
            obj2 = new mll(0.0F, 0.0F);
        }
        if (((JSONObject) (obj5)).optJSONObject("scale") != null)
        {
            obj3 = g(((JSONObject) (obj5)).optJSONObject("scale"));
        } else
        {
            obj3 = new mll(1.0F, 1.0F);
        }
        i1 = ((JSONObject) (obj5)).optInt("rotation", 0);
        f2 = (float)((JSONObject) (obj5)).optDouble("fontSize");
        if (((JSONObject) (obj5)).optJSONObject("textColor") != null)
        {
            l = h(((JSONObject) (obj5)).optJSONObject("textColor"));
        } else
        {
            l = 0xff000000;
        }
        jsonobject = ((JSONObject) (obj5)).optString("textStyle");
        i = -1;
        jsonobject.hashCode();
        JVM INSTR lookupswitch 4: default 1136
    //                   -1178781136: 1396
    //                   -1039745817: 1364
    //                   3029637: 1380
    //                   309230200: 1412;
           goto _L23 _L24 _L25 _L26 _L27
_L23:
        i;
        JVM INSTR tableswitch 2 4: default 1164
    //                   2 1428
    //                   3 1436
    //                   4 1444;
           goto _L28 _L29 _L30 _L31
_L28:
        jsonobject = Typeface.DEFAULT;
_L43:
        obj5 = ((JSONObject) (obj5)).optString("textAlign");
        i = -1;
        ((String) (obj5)).hashCode();
        JVM INSTR lookupswitch 5: default 1236
    //                   -1364013995: 1469
    //                   3317767: 1452
    //                   108511772: 1486
    //                   292953382: 1520
    //                   1374474459: 1503;
           goto _L32 _L33 _L34 _L35 _L36 _L37
_L32:
        i;
        JVM INSTR tableswitch 2 5: default 1268
    //                   2 1537
    //                   3 1544
    //                   4 1551
    //                   5 1558;
           goto _L38 _L39 _L40 _L41 _L42
_L38:
        i = 51;
        break; /* Loop/switch isn't completed */
_L25:
        if (jsonobject.equals("normal"))
        {
            i = 0;
        }
          goto _L23
_L26:
        if (jsonobject.equals("bold"))
        {
            i = 2;
        }
          goto _L23
_L24:
        if (jsonobject.equals("italic"))
        {
            i = 3;
        }
          goto _L23
_L27:
        if (jsonobject.equals("bold-italic"))
        {
            i = 4;
        }
          goto _L23
_L29:
        jsonobject = Typeface.defaultFromStyle(1);
          goto _L43
_L30:
        jsonobject = Typeface.defaultFromStyle(2);
          goto _L43
_L31:
        jsonobject = Typeface.defaultFromStyle(3);
          goto _L43
_L34:
        if (((String) (obj5)).equals("left"))
        {
            i = 0;
        }
          goto _L32
_L33:
        if (((String) (obj5)).equals("center"))
        {
            i = 2;
        }
          goto _L32
_L35:
        if (((String) (obj5)).equals("right"))
        {
            i = 3;
        }
          goto _L32
_L37:
        if (((String) (obj5)).equals("left-center"))
        {
            i = 4;
        }
          goto _L32
_L36:
        if (((String) (obj5)).equals("right-center"))
        {
            i = 5;
        }
          goto _L32
_L39:
        i = 49;
          goto _L44
_L40:
        i = 53;
          goto _L44
_L41:
        i = 19;
          goto _L44
_L42:
        i = 21;
_L44:
        if (!(((JSONObject) (obj4)).opt("width") instanceof Number) || !(((JSONObject) (obj4)).opt("height") instanceof Number))
        {
            throw new mlb("Size missing width or height.");
        }
        return new mkq(s3, ((String) (obj)), j, l1, s1, s2, new mkr(new mln((float)((JSONObject) (obj4)).optDouble("width"), (float)((JSONObject) (obj4)).optDouble("height")), ((mll) (obj1)), k, f1, ((mll) (obj2)), ((mll) (obj3)), i1, f2, l, jsonobject, i), arraylist);
        if (true) goto _L3; else goto _L45
_L45:
    }

}
