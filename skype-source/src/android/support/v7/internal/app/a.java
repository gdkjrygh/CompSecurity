// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.internal.view.b;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

public final class a
{

    static final Class a[] = {
        android/content/Context, android/util/AttributeSet
    };
    private static final Map b = new android.support.v4.util.a();
    private final Object c[] = new Object[2];

    public a()
    {
    }

    private View a(Context context, String s, AttributeSet attributeset)
    {
        String s1;
        s1 = s;
        if (s.equals("view"))
        {
            s1 = attributeset.getAttributeValue(null, "class");
        }
        c[0] = context;
        c[1] = attributeset;
        if (-1 != s1.indexOf('.'))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        context = a(context, s1, "android.widget.");
        c[0] = null;
        c[1] = null;
        return context;
        try
        {
            context = a(context, s1, ((String) (null)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            c[0] = null;
            c[1] = null;
            return null;
        }
        finally
        {
            c[0] = null;
        }
        c[0] = null;
        c[1] = null;
        return context;
        c[1] = null;
        throw context;
    }

    private View a(Context context, String s, String s1)
        throws ClassNotFoundException, InflateException
    {
        Object obj;
        Constructor constructor;
        constructor = (Constructor)b.get(s);
        obj = constructor;
        if (constructor != null) goto _L2; else goto _L1
_L1:
        try
        {
            obj = context.getClassLoader();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        context = (new StringBuilder()).append(s1).append(s).toString();
_L3:
        obj = ((ClassLoader) (obj)).loadClass(context).asSubclass(android/view/View).getConstructor(a);
        b.put(s, obj);
_L2:
        ((Constructor) (obj)).setAccessible(true);
        context = (View)((Constructor) (obj)).newInstance(c);
        return context;
        context = s;
          goto _L3
    }

    public final View a(View view, String s, Context context, AttributeSet attributeset, boolean flag, boolean flag1)
    {
label0:
        {
            Context context1 = context;
            if (flag)
            {
                context1 = context;
                if (view != null)
                {
                    context1 = view.getContext();
                }
            }
            view = context1.obtainStyledAttributes(attributeset, android.support.v7.appcompat.k.View, 0, 0);
            int i;
            int j;
            if (flag1)
            {
                i = view.getResourceId(android.support.v7.appcompat.k.View_android_theme, 0);
            } else
            {
                i = 0;
            }
            j = i;
            if (i == 0)
            {
                i = view.getResourceId(android.support.v7.appcompat.k.View_theme, 0);
                j = i;
                if (i != 0)
                {
                    Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                    j = i;
                }
            }
            view.recycle();
            view = context1;
            if (j == 0)
            {
                break label0;
            }
            if (context1 instanceof b)
            {
                view = context1;
                if (((b)context1).a() == j)
                {
                    break label0;
                }
            }
            view = new b(context1, j);
        }
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 10: default 236
    //                   -1946472170: 412
    //                   -1455429095: 366
    //                   -1346021293: 396
    //                   -938935918: 444
    //                   -339785223: 321
    //                   776382189: 351
    //                   1413872058: 381
    //                   1601505219: 336
    //                   1666676343: 306
    //                   2001146706: 428;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_444;
_L12:
        switch (i)
        {
        default:
            if (context != view)
            {
                return a(((Context) (view)), s, attributeset);
            } else
            {
                return null;
            }

        case 0: // '\0'
            return new AppCompatEditText(view, attributeset);

        case 1: // '\001'
            return new AppCompatSpinner(view, attributeset);

        case 2: // '\002'
            return new AppCompatCheckBox(view, attributeset);

        case 3: // '\003'
            return new AppCompatRadioButton(view, attributeset);

        case 4: // '\004'
            return new AppCompatCheckedTextView(view, attributeset);

        case 5: // '\005'
            return new AppCompatAutoCompleteTextView(view, attributeset);

        case 6: // '\006'
            return new AppCompatMultiAutoCompleteTextView(view, attributeset);

        case 7: // '\007'
            return new AppCompatRatingBar(view, attributeset);

        case 8: // '\b'
            return new AppCompatButton(view, attributeset);

        case 9: // '\t'
            return new AppCompatTextView(view, attributeset);
        }
_L10:
        if (s.equals("EditText"))
        {
            i = 0;
        }
          goto _L12
_L6:
        if (s.equals("Spinner"))
        {
            i = 1;
        }
          goto _L12
_L9:
        if (s.equals("CheckBox"))
        {
            i = 2;
        }
          goto _L12
_L7:
        if (s.equals("RadioButton"))
        {
            i = 3;
        }
          goto _L12
_L3:
        if (s.equals("CheckedTextView"))
        {
            i = 4;
        }
          goto _L12
_L8:
        if (s.equals("AutoCompleteTextView"))
        {
            i = 5;
        }
          goto _L12
_L4:
        if (s.equals("MultiAutoCompleteTextView"))
        {
            i = 6;
        }
          goto _L12
_L2:
        if (s.equals("RatingBar"))
        {
            i = 7;
        }
          goto _L12
_L11:
        if (s.equals("Button"))
        {
            i = 8;
        }
          goto _L12
        if (s.equals("TextView"))
        {
            i = 9;
        }
          goto _L12
    }

}
