// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class dah extends czv
{

    private final cyo c;
    private final cyo d;
    private final WeakHashMap e = new WeakHashMap();
    private final Object f[] = new Object[1];

    public dah(List list, cyo cyo1, cyo cyo2)
    {
        super(list);
        c = cyo1;
        d = cyo2;
    }

    public final void a()
    {
        Iterator iterator = e.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            View view = (View)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj != null)
            {
                f[0] = obj;
                c.a(view, f);
            }
        } while (true);
    }

    public final void a(View view)
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        Object aobj[] = c.a;
        if (1 != aobj.length) goto _L2; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj1 = aobj[0];
        obj = d.a(view);
        if (obj1 != obj) goto _L5; else goto _L4
_L4:
        return;
_L5:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(obj1 instanceof Bitmap) || !(obj instanceof Bitmap)) goto _L7; else goto _L6
_L6:
        if (((Bitmap)obj1).sameAs((Bitmap)obj)) goto _L4; else goto _L8
_L8:
        if ((obj instanceof Bitmap) || (obj instanceof BitmapDrawable) || e.containsKey(view)) goto _L2; else goto _L9
_L9:
        Object obj2;
        f[0] = obj;
        obj2 = c;
        obj1 = ((Object) (f));
        obj2 = ((cyo) (obj2)).b.getParameterTypes();
        if (1 == obj2.length) goto _L11; else goto _L10
_L10:
        int i = 0;
_L16:
        if (i != 0)
        {
            e.put(view, obj);
        } else
        {
            e.put(view, null);
        }
_L2:
        c.a(view);
        return;
_L7:
        if (!(obj1 instanceof BitmapDrawable) || !(obj instanceof BitmapDrawable))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((BitmapDrawable)obj1).getBitmap();
        obj2 = ((BitmapDrawable)obj).getBitmap();
        if (obj1 == null || !((Bitmap) (obj1)).sameAs(((Bitmap) (obj2)))) goto _L8; else goto _L12
_L12:
        return;
        if (!obj1.equals(obj)) goto _L8; else goto _L13
_L13:
        return;
_L11:
        i = 0;
_L17:
        if (i > 0) goto _L15; else goto _L14
_L14:
        Class class1 = cyo.a(obj2[0]);
        if (obj1[0] == null)
        {
            if (class1 != Byte.TYPE && class1 != Short.TYPE && class1 != Integer.TYPE && class1 != Long.TYPE && class1 != Float.TYPE && class1 != Double.TYPE && class1 != Boolean.TYPE && class1 != Character.TYPE)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = 0;
        } else
        {
            if (class1.isAssignableFrom(cyo.a(obj1[0].getClass())))
            {
                continue; /* Loop/switch isn't completed */
            }
            i = 0;
        }
          goto _L16
        i++;
          goto _L17
_L15:
        i = 1;
          goto _L16
    }

    public final volatile void b(View view)
    {
        super.b(view);
    }
}
