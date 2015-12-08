// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.util.ArrayMap;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

public final class AppCompatViewInflater
{

    private static final Map sConstructorMap = new ArrayMap();
    static final Class sConstructorSignature[] = {
        android/content/Context, android/util/AttributeSet
    };
    private final Object mConstructorArgs[] = new Object[2];

    public AppCompatViewInflater()
    {
    }

    private View createView(Context context, String s, String s1)
        throws ClassNotFoundException, InflateException
    {
        Object obj;
        Constructor constructor;
        constructor = (Constructor)sConstructorMap.get(s);
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
        obj = ((ClassLoader) (obj)).loadClass(context).asSubclass(android/view/View).getConstructor(sConstructorSignature);
        sConstructorMap.put(s, obj);
_L2:
        ((Constructor) (obj)).setAccessible(true);
        context = (View)((Constructor) (obj)).newInstance(mConstructorArgs);
        return context;
        context = s;
          goto _L3
    }

    public static Context themifyContext(Context context, AttributeSet attributeset, boolean flag, boolean flag1)
    {
label0:
        {
            attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.View, 0, 0);
            int i = 0;
            if (flag)
            {
                i = attributeset.getResourceId(0, 0);
            }
            int k = i;
            if (i == 0)
            {
                int j = attributeset.getResourceId(4, 0);
                k = j;
                if (j != 0)
                {
                    Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                    k = j;
                }
            }
            attributeset.recycle();
            attributeset = context;
            if (k == 0)
            {
                break label0;
            }
            if (context instanceof ContextThemeWrapper)
            {
                attributeset = context;
                if (((ContextThemeWrapper)context).mThemeResource == k)
                {
                    break label0;
                }
            }
            attributeset = new ContextThemeWrapper(context, k);
        }
        return attributeset;
    }

    public final View createViewFromTag(Context context, String s, AttributeSet attributeset)
    {
        String s1;
        s1 = s;
        if (s.equals("view"))
        {
            s1 = attributeset.getAttributeValue(null, "class");
        }
        mConstructorArgs[0] = context;
        mConstructorArgs[1] = attributeset;
        if (-1 != s1.indexOf('.'))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        context = createView(context, s1, "android.widget.");
        mConstructorArgs[0] = null;
        mConstructorArgs[1] = null;
        return context;
        try
        {
            context = createView(context, s1, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            mConstructorArgs[0] = null;
            mConstructorArgs[1] = null;
            return null;
        }
        finally
        {
            mConstructorArgs[0] = null;
        }
        mConstructorArgs[0] = null;
        mConstructorArgs[1] = null;
        return context;
        mConstructorArgs[1] = null;
        throw context;
    }

}
