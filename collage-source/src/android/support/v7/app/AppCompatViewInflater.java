// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

class AppCompatViewInflater
{
    private static class DeclaredOnClickListener
        implements android.view.View.OnClickListener
    {

        private final View mHostView;
        private final String mMethodName;
        private Context mResolvedContext;
        private Method mResolvedMethod;

        private void resolveMethod(Context context, String s)
        {
_L2:
            if (context == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (context.isRestricted())
            {
                break MISSING_BLOCK_LABEL_48;
            }
            s = context.getClass().getMethod(mMethodName, new Class[] {
                android/view/View
            });
            if (s != null)
            {
                try
                {
                    mResolvedMethod = s;
                    mResolvedContext = context;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            if (context instanceof ContextWrapper)
            {
                context = ((ContextWrapper)context).getBaseContext();
            } else
            {
                context = null;
            }
            if (true) goto _L2; else goto _L1
_L1:
            int i = mHostView.getId();
            if (i == -1)
            {
                context = "";
            } else
            {
                context = (new StringBuilder()).append(" with id '").append(mHostView.getContext().getResources().getResourceEntryName(i)).append("'").toString();
            }
            throw new IllegalStateException((new StringBuilder()).append("Could not find method ").append(mMethodName).append("(View) in a parent or ancestor Context for android:onClick ").append("attribute defined on view ").append(mHostView.getClass()).append(context).toString());
        }

        public void onClick(View view)
        {
            if (mResolvedMethod == null)
            {
                resolveMethod(mHostView.getContext(), mMethodName);
            }
            try
            {
                mResolvedMethod.invoke(mResolvedContext, new Object[] {
                    view
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw new IllegalStateException("Could not execute method for android:onClick", view);
            }
        }

        public DeclaredOnClickListener(View view, String s)
        {
            mHostView = view;
            mMethodName = s;
        }
    }


    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final Map sConstructorMap = new ArrayMap();
    private static final Class sConstructorSignature[] = {
        android/content/Context, android/util/AttributeSet
    };
    private static final int sOnClickAttrs[] = {
        0x101026f
    };
    private final Object mConstructorArgs[] = new Object[2];

    AppCompatViewInflater()
    {
    }

    private void checkOnClickListener(View view, AttributeSet attributeset)
    {
        Object obj = view.getContext();
        if (!ViewCompat.hasOnClickListeners(view) || !(obj instanceof ContextWrapper))
        {
            return;
        }
        attributeset = ((Context) (obj)).obtainStyledAttributes(attributeset, sOnClickAttrs);
        obj = attributeset.getString(0);
        if (obj != null)
        {
            view.setOnClickListener(new DeclaredOnClickListener(view, ((String) (obj))));
        }
        attributeset.recycle();
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

    private View createViewFromTag(Context context, String s, AttributeSet attributeset)
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

    private static Context themifyContext(Context context, AttributeSet attributeset, boolean flag, boolean flag1)
    {
label0:
        {
            attributeset = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.View, 0, 0);
            int i;
            int j;
            if (flag)
            {
                i = attributeset.getResourceId(android.support.v7.appcompat.R.styleable.View_android_theme, 0);
            } else
            {
                i = 0;
            }
            j = i;
            if (flag1)
            {
                j = i;
                if (i == 0)
                {
                    i = attributeset.getResourceId(android.support.v7.appcompat.R.styleable.View_theme, 0);
                    j = i;
                    if (i != 0)
                    {
                        Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                        j = i;
                    }
                }
            }
            attributeset.recycle();
            attributeset = context;
            if (j == 0)
            {
                break label0;
            }
            if (context instanceof ContextThemeWrapper)
            {
                attributeset = context;
                if (((ContextThemeWrapper)context).getThemeResId() == j)
                {
                    break label0;
                }
            }
            attributeset = new ContextThemeWrapper(context, j);
        }
        return attributeset;
    }

    public final View createView(View view, String s, Context context, AttributeSet attributeset, boolean flag, boolean flag1, boolean flag2)
    {
label0:
        {
            Object obj;
            byte byte0;
            if (flag && view != null)
            {
                view = view.getContext();
            } else
            {
                view = context;
            }
            if (!flag1)
            {
                obj = view;
                if (!flag2)
                {
                    break label0;
                }
            }
            obj = themifyContext(view, attributeset, flag1, flag2);
        }
        view = null;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 13: default 164
    //                   -1946472170: 435
    //                   -1455429095: 387
    //                   -1346021293: 419
    //                   -938935918: 265
    //                   -937446323: 340
    //                   -658531749: 451
    //                   -339785223: 325
    //                   776382189: 371
    //                   1125864064: 280
    //                   1413872058: 403
    //                   1601505219: 355
    //                   1666676343: 310
    //                   2001146706: 295;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        byte0;
        JVM INSTR tableswitch 0 12: default 232
    //                   0 467
    //                   1 482
    //                   2 497
    //                   3 512
    //                   4 527
    //                   5 542
    //                   6 557
    //                   7 572
    //                   8 587
    //                   9 602
    //                   10 617
    //                   11 632
    //                   12 647;
           goto _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L15:
        if (view == null && context != obj)
        {
            view = createViewFromTag(((Context) (obj)), s, attributeset);
        }
        if (view != null)
        {
            checkOnClickListener(view, attributeset);
        }
        return view;
_L5:
        if (s.equals("TextView"))
        {
            byte0 = 0;
        }
          goto _L1
_L10:
        if (s.equals("ImageView"))
        {
            byte0 = 1;
        }
          goto _L1
_L14:
        if (s.equals("Button"))
        {
            byte0 = 2;
        }
          goto _L1
_L13:
        if (s.equals("EditText"))
        {
            byte0 = 3;
        }
          goto _L1
_L8:
        if (s.equals("Spinner"))
        {
            byte0 = 4;
        }
          goto _L1
_L6:
        if (s.equals("ImageButton"))
        {
            byte0 = 5;
        }
          goto _L1
_L12:
        if (s.equals("CheckBox"))
        {
            byte0 = 6;
        }
          goto _L1
_L9:
        if (s.equals("RadioButton"))
        {
            byte0 = 7;
        }
          goto _L1
_L3:
        if (s.equals("CheckedTextView"))
        {
            byte0 = 8;
        }
          goto _L1
_L11:
        if (s.equals("AutoCompleteTextView"))
        {
            byte0 = 9;
        }
          goto _L1
_L4:
        if (s.equals("MultiAutoCompleteTextView"))
        {
            byte0 = 10;
        }
          goto _L1
_L2:
        if (s.equals("RatingBar"))
        {
            byte0 = 11;
        }
          goto _L1
_L7:
        if (s.equals("SeekBar"))
        {
            byte0 = 12;
        }
          goto _L1
_L16:
        view = new AppCompatTextView(((Context) (obj)), attributeset);
          goto _L15
_L17:
        view = new AppCompatImageView(((Context) (obj)), attributeset);
          goto _L15
_L18:
        view = new AppCompatButton(((Context) (obj)), attributeset);
          goto _L15
_L19:
        view = new AppCompatEditText(((Context) (obj)), attributeset);
          goto _L15
_L20:
        view = new AppCompatSpinner(((Context) (obj)), attributeset);
          goto _L15
_L21:
        view = new AppCompatImageButton(((Context) (obj)), attributeset);
          goto _L15
_L22:
        view = new AppCompatCheckBox(((Context) (obj)), attributeset);
          goto _L15
_L23:
        view = new AppCompatRadioButton(((Context) (obj)), attributeset);
          goto _L15
_L24:
        view = new AppCompatCheckedTextView(((Context) (obj)), attributeset);
          goto _L15
_L25:
        view = new AppCompatAutoCompleteTextView(((Context) (obj)), attributeset);
          goto _L15
_L26:
        view = new AppCompatMultiAutoCompleteTextView(((Context) (obj)), attributeset);
          goto _L15
_L27:
        view = new AppCompatRatingBar(((Context) (obj)), attributeset);
          goto _L15
_L28:
        view = new AppCompatSeekBar(((Context) (obj)), attributeset);
          goto _L15
    }

}
