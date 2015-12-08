// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            cr, gs, ci, cv, 
//            gp, gq

public final class go
{

    private static Object a(View view, Method method)
        throws InvocationTargetException, IllegalAccessException
    {
_L2:
        Object obj = method.invoke(view, new Object[0]);
        return obj;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String a(Class class1)
    {
        String s = null;
        cr.a();
        if (cr.b().containsKey(class1.getSimpleName()))
        {
            s = class1.getSimpleName();
        } else
        if (!class1.getSimpleName().equals("View"))
        {
            return a(class1.getSuperclass());
        }
        return s;
    }

    public static JSONObject a(Class class1, View view)
        throws JSONException
    {
        JSONArray jsonarray;
        JSONArray jsonarray1;
        HashSet hashset1;
        HashSet hashset2;
        Iterator iterator;
        jsonarray = new JSONArray();
        jsonarray1 = new JSONArray();
        HashSet hashset = new HashSet(Arrays.asList(class1.getMethods()));
        class1 = a(class1);
        cr.a();
        hashset1 = (HashSet)cr.b().get(class1);
        cr.a();
        hashset2 = (HashSet)cr.c().get(class1);
        iterator = hashset.iterator();
_L2:
        JSONObject jsonobject;
        String s;
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Method)iterator.next();
        s = ((Method) (obj)).getName();
        JSONObject jsonobject1 = new JSONObject();
        JSONArray jsonarray2 = new JSONArray();
        if (hashset1.contains(s))
        {
            obj = ((Method) (obj)).getParameterTypes();
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                Class class2 = obj[i];
                class1 = class2;
                if (class2.isArray())
                {
                    class1 = class2.getComponentType();
                }
                jsonarray2.put(class1.getName());
            }

            jsonobject1.put("paramTypes", jsonarray2);
            jsonobject1.put("methodName", s);
            jsonarray.put(jsonobject1);
            hashset1.remove(s);
            continue; /* Loop/switch isn't completed */
        }
        if (!hashset2.contains(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = new JSONObject();
        class1 = ((Method) (obj)).getReturnType();
        boolean flag;
        if (!class1.equals(java/lang/Integer) && !class1.equals(java/lang/Boolean) && !class1.equals(java/lang/CharSequence) && !class1.equals(java/lang/String) && !class1.equals(Float.TYPE) && !class1.equals(Integer.TYPE) && !class1.equals(Long.TYPE) && !class1.equals(Short.TYPE) && !class1.equals(java/lang/Number) && !class1.equals(java/lang/CharSequence) && !class1.equals(Double.TYPE) && !class1.equals(Boolean.TYPE) && !class1.equals(Byte.TYPE) && !class1.equals(java/lang/StringBuilder) && !class1.equals(java/lang/StringBuffer) && !class1.equals(java/lang/Float) && !class1.equals(java/lang/Double) && !class1.equals(java/lang/Long) && !class1.equals(java/lang/Short) && !class1.equals(java/lang/Byte))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        class1 = ((Class) (a(view, ((Method) (obj)))));
        jsonobject.put("methodName", ((Method) (obj)).getName());
        if (class1 == null)
        {
            class1 = "null";
        }
        try
        {
            jsonobject.put("currentValue", class1);
            jsonarray1.put(jsonobject);
            hashset2.remove(s);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            gs.b("something", class1);
        }
        if (true) goto _L2; else goto _L1
_L1:
        class1 = new JSONObject();
        view = new JSONArray();
        class1.put("methodName", "setWidth");
        view.put(Integer.TYPE.getName());
        class1.put("paramTypes", view);
        jsonarray.put(class1);
        class1 = new JSONObject();
        view = new JSONArray();
        class1.put("methodName", "setHeight");
        view.put(Integer.TYPE.getName());
        class1.put("paramTypes", view);
        jsonarray.put(class1);
        class1 = new JSONObject();
        class1.put("variables", jsonarray1);
        class1.put("setters", jsonarray);
        return class1;
    }

    public static void a(View view, String s, Object obj, String s1, boolean flag, boolean flag1)
    {
        if (ci.b().v == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag2;
        flag2 = false;
        i = 0;
        if (flag || obj == null) goto _L4; else goto _L3
_L3:
        if (obj != JSONObject.NULL && !a(obj) && (!(obj instanceof JSONArray) || ((JSONArray)obj).length() != 0)) goto _L5; else goto _L4
_L4:
        Object obj1 = view.getTag(cv.a().o);
        if (obj1 == null) goto _L5; else goto _L6
_L6:
        if (!(obj1 instanceof HashMap) || !((HashMap)obj1).containsKey(s)) goto _L5; else goto _L7
_L7:
        obj1 = ((HashMap)obj1).get(s);
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        i = ((flag2) ? 1 : 0);
        if (!(obj1 instanceof HashMap)) goto _L9; else goto _L10
_L10:
        i = 1;
        obj = ((HashMap)obj1).get(s);
        i = 1;
_L36:
        obj1 = obj;
_L18:
        if (obj1 == null || obj1 == JSONObject.NULL || a(obj1) || (obj1 instanceof JSONArray) && ((JSONArray)obj1).length() == 0) goto _L2; else goto _L11
_L11:
        if (i != 0 || !flag1 && !ci.b().g) goto _L13; else goto _L12
_L12:
        obj = view.getTag(cv.a().o);
        if (obj == null) goto _L15; else goto _L14
_L14:
        if (!(obj instanceof HashMap)) goto _L15; else goto _L16
_L16:
        HashMap hashmap = (HashMap)obj;
_L19:
        flag = hashmap.containsKey(s);
        if (!flag) goto _L17; else goto _L13
_L13:
        ci.b().v.runOnUiThread(new gp(s, obj1, view, s1));
_L2:
        return;
        obj1;
_L35:
        gs.b("resetting view error", ((Exception) (obj1)));
        obj1 = obj;
          goto _L18
_L15:
        hashmap = new HashMap();
          goto _L19
_L17:
        HashMap hashmap1;
        hashmap1 = new HashMap();
        hashmap1.put("parameterType", s1);
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 7: default 929
    //                   -2127641265: 453
    //                   260368425: 484
    //                   475815924: 499
    //                   1407839876: 469
    //                   1743806995: 515
    //                   1885480407: 531
    //                   1927155694: 547;
           goto _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L37:
        obj = view.getClass().getMethod(s.replaceAll("set", "get"), new Class[0]).invoke(view, new Object[0]);
_L28:
        hashmap1.put(s, obj);
        hashmap.put(s, hashmap1);
        view.setTag(cv.a().o, hashmap);
          goto _L13
_L21:
        if (s.equals("setPadding"))
        {
            i = 0;
        }
          goto _L20
_L24:
        if (s.equals("setWidth"))
        {
            i = 1;
        }
          goto _L20
_L22:
        if (s.equals("setHeight"))
        {
            i = 2;
        }
          goto _L20
_L23:
        if (s.equals("setTextColor"))
        {
            i = 3;
        }
          goto _L20
_L25:
        if (s.equals("setBackgroundColor"))
        {
            i = 4;
        }
          goto _L20
_L26:
        if (s.equals("setImageDrawable"))
        {
            i = 5;
        }
          goto _L20
_L27:
        if (s.equals("setBackgroundDrawable"))
        {
            i = 6;
        }
          goto _L20
_L38:
        i = view.getPaddingTop();
        int j = view.getPaddingLeft();
        int k = view.getPaddingRight();
        int l = view.getPaddingBottom();
        obj = new JSONObject();
        ((JSONObject) (obj)).put("top", i);
        ((JSONObject) (obj)).put("bottom", j);
        ((JSONObject) (obj)).put("left", k);
        ((JSONObject) (obj)).put("right", l);
        hashmap1.put(s, obj);
          goto _L28
_L39:
        try
        {
            view.post(new gq(view, s, s1));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("error adding method to view tag", ((Exception) (obj)));
        }
          goto _L13
_L40:
        obj = view.getClass().getMethod("getCurrentTextColor", new Class[0]).invoke(view, new Object[0]);
          goto _L28
_L41:
        obj = (ColorDrawable)view.getBackground();
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L30; else goto _L29
_L29:
        obj = Integer.valueOf(((ColorDrawable) (obj)).getColor());
          goto _L28
_L30:
        obj = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        Rect rect = new Rect();
        ColorDrawable colordrawable = (ColorDrawable)view.getBackground();
        rect.set(colordrawable.getBounds());
        colordrawable.setBounds(0, 0, 1, 1);
        colordrawable.draw(canvas);
        i = ((Bitmap) (obj)).getPixel(0, 0);
        colordrawable.setBounds(rect);
        obj = Integer.valueOf(i);
          goto _L28
        obj;
        android.graphics.drawable.Drawable drawable = view.getBackground();
        obj = drawable;
        if (drawable == null)
        {
            obj = "null";
        }
          goto _L28
_L42:
        if (!(view instanceof ImageView)) goto _L32; else goto _L31
_L31:
        if (!(((ImageView)view).getDrawable() instanceof BitmapDrawable)) goto _L34; else goto _L33
_L33:
        obj = ((BitmapDrawable)((ImageView)view).getDrawable()).getBitmap();
          goto _L28
_L34:
        obj = ((ImageView)view).getDrawable();
          goto _L28
_L32:
        obj = view.getBackground();
          goto _L28
_L43:
        drawable = view.getBackground();
        obj = drawable;
        if (drawable == null)
        {
            obj = "null";
        }
          goto _L28
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
          goto _L35
_L9:
        i = 0;
        obj = obj1;
          goto _L36
_L5:
        i = 0;
          goto _L36
_L20:
        i;
        JVM INSTR tableswitch 0 6: default 972
    //                   0 564
    //                   1 647
    //                   2 647
    //                   3 665
    //                   4 691
    //                   5 826
    //                   6 882;
           goto _L37 _L38 _L39 _L39 _L40 _L41 _L42 _L43
    }

    private static boolean a(Object obj)
    {
        if (!(obj instanceof JSONObject)) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        obj = (JSONObject)obj;
        iterator = ((JSONObject) (obj)).keys();
_L4:
        Object obj1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj1 = (String)iterator.next();
        if (((JSONObject) (obj)).get(((String) (obj1))) == JSONObject.NULL)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((JSONObject) (obj)).get(((String) (obj1)));
        if (obj1 != null)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        return true;
_L2:
        return false;
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
