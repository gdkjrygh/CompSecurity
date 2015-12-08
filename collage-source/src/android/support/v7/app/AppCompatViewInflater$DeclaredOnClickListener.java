// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.app:
//            AppCompatViewInflater

private static class mMethodName
    implements android.view.kListener
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

    public (View view, String s)
    {
        mHostView = view;
        mMethodName = s;
    }
}
