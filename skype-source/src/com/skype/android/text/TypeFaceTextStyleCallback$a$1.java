// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.text;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.util.HashMap;

// Referenced classes of package com.skype.android.text:
//            TypeFaceTextStyleCallback, TypeFaceFactory

static final class b extends b
{

    private HashMap b;

    private Constructor b(String s)
    {
        Object obj1;
        Constructor constructor;
        constructor = (Constructor)b.get(s);
        obj1 = constructor;
        if (constructor != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        obj2 = null;
        obj = constructor;
        if (s.contains(".")) goto _L4; else goto _L3
_L3:
        obj = constructor;
        obj1 = (new StringBuilder("android.support.v7.widget.AppCompat")).append(s).toString();
        obj = constructor;
        Class class1 = Class.forName(((String) (obj1)));
        obj = class1;
_L5:
        obj2 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = constructor;
        obj2 = Class.forName(((String) (obj1)));
        obj = constructor;
        obj1 = constructor;
        if (!android/widget/TextView.isAssignableFrom(((Class) (obj2))))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = constructor;
        obj1 = ((Class) (obj2)).getConstructor(new Class[] {
            android/content/Context, android/util/AttributeSet
        });
        obj = obj1;
        b.put(s, obj1);
        return ((Constructor) (obj1));
        obj;
        obj = constructor;
        obj1 = (new StringBuilder("android.widget.")).append(s).toString();
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = s;
        obj = obj2;
        if (true) goto _L5; else goto _L2
        s;
        s.printStackTrace();
        obj1 = obj;
_L2:
        return ((Constructor) (obj1));
    }

    public final View a(TypeFaceFactory typefacefactory, String s, Context context, AttributeSet attributeset)
    {
        s = b(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s = (TextView)s.newInstance(new Object[] {
            context, attributeset
        });
        context = s.getTypeface();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (!context.isBold())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        s.setTypeface(typefacefactory.getBold(s.getTextSize()));
        return s;
        s.setTypeface(typefacefactory.getDefault(s.getTextSize()));
        return s;
        typefacefactory;
        typefacefactory.printStackTrace();
        return null;
        s.setTypeface(typefacefactory.getDefault(s.getTextSize()));
        return s;
    }

    public final boolean a(String s)
    {
        return s.endsWith("TextView") || s.endsWith("Button") || s.endsWith("EditText") || s.endsWith("CheckBox") || s.endsWith("SearchAutoComplete") || s.endsWith("Switch");
    }

    (String s)
    {
        super(s, (byte)0);
        b = new HashMap();
    }
}
