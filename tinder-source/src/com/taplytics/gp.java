// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hk, gs, gm, gi

final class gp
    implements Runnable
{

    final String a;
    final Object b;
    final View c;
    final String d;

    gp(String s, Object obj, View view, String s1)
    {
        a = s;
        b = obj;
        c = view;
        d = s1;
        super();
    }

    public final void run()
    {
        int j;
        int k;
        k = 0;
        j = 0;
        Object obj = a;
        int i = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 9: default 2161
    //                   -2127641265: 246
    //                   260368425: 232
    //                   515545814: 288
    //                   985651536: 317
    //                   1407839876: 218
    //                   1743806995: 274
    //                   1885480407: 332
    //                   1927155694: 260
    //                   1984984239: 302;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L72:
        obj = d;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 6: default 2215
    //                   -1266517045: 1629
    //                   3212: 1659
    //                   3677: 1644
    //                   104431: 1598
    //                   97526364: 1614
    //                   126056324: 1674;
           goto _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L80:
        obj = Class.forName(d);
        c.getClass().getMethod(a, new Class[] {
            obj
        }).invoke(c, new Object[] {
            b
        });
        return;
_L6:
        if (((String) (obj)).equals("setWidth"))
        {
            i = 0;
        }
          goto _L1
_L3:
        if (((String) (obj)).equals("setHeight"))
        {
            i = 1;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("setPadding"))
        {
            i = 2;
        }
          goto _L1
_L9:
        if (((String) (obj)).equals("setBackgroundDrawable"))
        {
            i = 3;
        }
          goto _L1
_L7:
        if (((String) (obj)).equals("setBackgroundColor"))
        {
            i = 4;
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("setHintText"))
        {
            i = 5;
        }
          goto _L1
_L10:
        if (((String) (obj)).equals("setText"))
        {
            i = 6;
        }
          goto _L1
_L5:
        if (((String) (obj)).equals("setTextSize"))
        {
            i = 7;
        }
          goto _L1
_L8:
        if (((String) (obj)).equals("setImageDrawable"))
        {
            i = 8;
        }
          goto _L1
_L73:
        if (b != JSONObject.NULL)
        {
            float f = ((Number)b).floatValue();
            c.getLayoutParams().width = hk.a(f);
            c.requestLayout();
            return;
        }
          goto _L18
_L33:
        try
        {
            c.setBackgroundDrawable((Drawable)b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b((new StringBuilder()).append(((Exception) (obj)).getCause()).append(": ").append(c.getClass()).append(", ").append(a).append(", ").append(((Exception) (obj)).getMessage()).toString(), ((Exception) (obj)));
            return;
        }
        gs.b((new StringBuilder("Method errors on ")).append(a).toString(), ((Exception) (obj)));
        return;
_L74:
        if (b != JSONObject.NULL)
        {
            f1 = ((Number)b).floatValue();
            c.getLayoutParams().height = hk.a(f1);
            c.requestLayout();
            return;
        }
          goto _L18
_L75:
        obj = (JSONObject)b;
        if (!((JSONObject) (obj)).has("left") || ((JSONObject) (obj)).isNull("left")) goto _L20; else goto _L19
_L19:
        i = hk.a(((JSONObject) (obj)).getInt("left"));
_L27:
        if (!((JSONObject) (obj)).has("right") || ((JSONObject) (obj)).isNull("right")) goto _L22; else goto _L21
_L21:
        j = hk.a(((JSONObject) (obj)).getInt("right"));
_L28:
        if (!((JSONObject) (obj)).has("top") || ((JSONObject) (obj)).isNull("top")) goto _L24; else goto _L23
_L23:
        k = hk.a(((JSONObject) (obj)).getInt("top"));
_L29:
        if (!((JSONObject) (obj)).has("bottom") || ((JSONObject) (obj)).isNull("bottom")) goto _L26; else goto _L25
_L25:
        l = hk.a(((JSONObject) (obj)).getInt("bottom"));
_L30:
        c.getClass().getMethod(a, new Class[] {
            Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE
        }).invoke(c, new Object[] {
            Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(l)
        });
        c.invalidate();
        return;
_L20:
        i = c.getPaddingLeft();
          goto _L27
_L22:
        j = c.getPaddingRight();
          goto _L28
_L24:
        k = c.getPaddingTop();
          goto _L29
_L26:
        l = c.getPaddingBottom();
          goto _L30
_L76:
        if (!(b instanceof Drawable)) goto _L32; else goto _L31
_L31:
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            c.setBackground((Drawable)b);
            return;
        }
          goto _L33
_L32:
        if (!(b instanceof JSONArray) || ((JSONArray)b).length() == 0) goto _L35; else goto _L34
_L34:
        obj = gm.a(b);
        if (!((File) (obj)).exists()) goto _L18; else goto _L36
_L36:
        obj = Drawable.createFromPath(((File) (obj)).getAbsolutePath());
        hk.a(c, b, a, d);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            c.setBackground(((Drawable) (obj)));
            return;
        }
        c.setBackgroundDrawable(((Drawable) (obj)));
        return;
_L35:
        if ((b instanceof String) && b.equals("null"))
        {
            c.setBackground(null);
            return;
        }
          goto _L18
_L77:
        obj = d;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 2276
    //                   -1266517045: 1058
    //                   104431: 1027
    //                   97526364: 1043;
           goto _L37 _L38 _L39 _L40
_L45:
        obj = (String)b;
        ((TextView)c).setHint(((String) (obj)).replace("\\n", "\n"));
        return;
_L39:
        if (!((String) (obj)).equals("int")) goto _L37; else goto _L41
_L41:
        i = k;
          goto _L42
_L40:
        if (!((String) (obj)).equals("float")) goto _L37; else goto _L43
_L43:
        i = 1;
          goto _L42
_L38:
        if (!((String) (obj)).equals("tlColor")) goto _L37; else goto _L44
_L44:
        i = 2;
          goto _L42
_L86:
label0:
        {
            if (!(b instanceof Number))
            {
                break label0;
            }
            c.getClass().getMethod(a, new Class[] {
                Integer.TYPE
            }).invoke(c, new Object[] {
                Integer.valueOf(((Number)b).intValue())
            });
        }
          goto _L45
_L87:
label1:
        {
            if (!(b instanceof Number))
            {
                break label1;
            }
            c.getClass().getMethod(a, new Class[] {
                Float.TYPE
            }).invoke(c, new Object[] {
                Float.valueOf(((Number)b).floatValue())
            });
        }
          goto _L45
_L88:
        if (!(b instanceof Integer)) goto _L47; else goto _L46
_L46:
        c.getClass().getMethod(a, new Class[] {
            Integer.TYPE
        }).invoke(c, new Object[] {
            (Integer)b
        });
          goto _L45
_L47:
        if (!(b instanceof Drawable)) goto _L49; else goto _L48
_L48:
        c.setBackground((Drawable)b);
          goto _L45
_L49:
        if (!(b instanceof String) || !b.equals("null")) goto _L51; else goto _L50
_L50:
        c.setBackground(null);
          goto _L45
_L51:
        obj = gi.a(b);
        if (obj == null) goto _L45; else goto _L52
_L52:
        c.getClass().getMethod(a, new Class[] {
            Integer.TYPE
        }).invoke(c, new Object[] {
            obj
        });
          goto _L45
_L78:
        obj = (String)b;
        ((TextView)c).setText(((String) (obj)).replace("\\n", "\n"));
        return;
_L79:
        if (!(b instanceof Float)) goto _L54; else goto _L53
_L53:
        f1 = ((Float)b).floatValue();
_L56:
        ((TextView)c).setTextSize(0, f1);
        return;
_L54:
        f1 = ((Integer)b).floatValue();
        if (true) goto _L56; else goto _L55
_L55:
        if (!(b instanceof Drawable)) goto _L58; else goto _L57
_L57:
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            ((ImageView)c).setImageDrawable((Drawable)b);
            return;
        }
          goto _L18
_L58:
        if (b instanceof Bitmap)
        {
            ((ImageView)c).setImageBitmap((Bitmap)b);
            return;
        }
        if ((b instanceof JSONArray) && ((JSONArray)b).length() != 0)
        {
            obj = gm.a(b);
            if (((File) (obj)).exists())
            {
                obj = Drawable.createFromPath(((File) (obj)).getAbsolutePath());
                hk.a(c, obj, a, d);
                if (android.os.Build.VERSION.SDK_INT >= 9)
                {
                    ((ImageView)c).setImageDrawable(((Drawable) (obj)));
                    return;
                }
            }
        }
          goto _L18
_L15:
        if (!((String) (obj)).equals("int")) goto _L11; else goto _L59
_L59:
        i = j;
          goto _L60
_L16:
        if (!((String) (obj)).equals("float")) goto _L11; else goto _L61
_L61:
        i = 1;
          goto _L60
_L12:
        if (!((String) (obj)).equals("tlColor")) goto _L11; else goto _L62
_L62:
        i = 2;
          goto _L60
_L14:
        if (!((String) (obj)).equals("sp")) goto _L11; else goto _L63
_L63:
        i = 3;
          goto _L60
_L13:
        if (!((String) (obj)).equals("dp")) goto _L11; else goto _L64
_L64:
        i = 4;
          goto _L60
_L17:
        if (!((String) (obj)).equals("ScaleType")) goto _L11; else goto _L65
_L65:
        i = 5;
          goto _L60
_L81:
        if (b instanceof Number)
        {
            c.getClass().getMethod(a, new Class[] {
                Integer.TYPE
            }).invoke(c, new Object[] {
                Integer.valueOf(((Number)b).intValue())
            });
            return;
        }
_L82:
        if (b instanceof Number)
        {
            c.getClass().getMethod(a, new Class[] {
                Float.TYPE
            }).invoke(c, new Object[] {
                Float.valueOf(((Number)b).floatValue())
            });
            return;
        }
_L83:
        if (!(b instanceof Integer)) goto _L67; else goto _L66
_L66:
        c.getClass().getMethod(a, new Class[] {
            Integer.TYPE
        }).invoke(c, new Object[] {
            (Integer)b
        });
_L70:
        if (b instanceof Number)
        {
            c.getClass().getMethod(a, new Class[] {
                Integer.TYPE, Float.TYPE
            }).invoke(c, new Object[] {
                Integer.valueOf(2), Float.valueOf(((Number)b).floatValue())
            });
            return;
        }
          goto _L18
_L67:
        if (!(b instanceof Drawable)) goto _L69; else goto _L68
_L68:
        c.setBackground((Drawable)b);
          goto _L70
_L69:
        obj = gi.a(b);
        if (obj == null) goto _L70; else goto _L71
_L71:
        c.getClass().getMethod(a, new Class[] {
            Integer.TYPE
        }).invoke(c, new Object[] {
            obj
        });
        return;
_L84:
        if (b instanceof Number)
        {
            i = hk.a(((Number)b).floatValue());
            c.getClass().getMethod(a, new Class[] {
                Integer.TYPE
            }).invoke(c, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
          goto _L18
_L85:
        if (b instanceof Number)
        {
            obj = android.widget.ImageView.ScaleType.values()[((Number)b).intValue()];
            c.getClass().getMethod(a, new Class[] {
                android/widget/ImageView$ScaleType
            }).invoke(c, new Object[] {
                obj
            });
            return;
        }
          goto _L18
_L1:
        i;
        JVM INSTR tableswitch 0 8: default 2212
    //                   0 347
    //                   1 415
    //                   2 458
    //                   3 725
    //                   4 957
    //                   5 1000
    //                   6 1377
    //                   7 1404
    //                   8 1452;
           goto _L72 _L73 _L74 _L75 _L76 _L77 _L45 _L78 _L79 _L55
_L11:
        i = -1;
_L60:
        i;
        JVM INSTR tableswitch 0 5: default 2256
    //                   0 1689
    //                   1 1752
    //                   2 1815
    //                   3 1871
    //                   4 2027
    //                   5 2095;
           goto _L80 _L81 _L82 _L83 _L70 _L84 _L85
_L18:
        return;
_L37:
        i = -1;
_L42:
        i;
        JVM INSTR tableswitch 0 2: default 2304
    //                   0 1073
    //                   1 1138
    //                   2 1203;
           goto _L45 _L86 _L87 _L88
    }
}
