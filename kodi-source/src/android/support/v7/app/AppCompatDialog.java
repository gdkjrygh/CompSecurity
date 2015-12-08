// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.TypedValue;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatCallback, AppCompatDelegate

public class AppCompatDialog extends Dialog
    implements AppCompatCallback
{

    private AppCompatDelegate mDelegate;

    public AppCompatDialog(Context context, int i)
    {
        super(context, getThemeResId(context, i));
        getDelegate().onCreate(null);
    }

    private static int getThemeResId(Context context, int i)
    {
        int j = i;
        if (i == 0)
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.dialogTheme, typedvalue, true);
            j = typedvalue.resourceId;
        }
        return j;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().addContentView(view, layoutparams);
    }

    public AppCompatDelegate getDelegate()
    {
        if (mDelegate == null)
        {
            mDelegate = AppCompatDelegate.create(this, this);
        }
        return mDelegate;
    }

    public void invalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }

    protected void onCreate(Bundle bundle)
    {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    protected void onStop()
    {
        super.onStop();
        getDelegate().onStop();
    }

    public void onSupportActionModeFinished(ActionMode actionmode)
    {
    }

    public void onSupportActionModeStarted(ActionMode actionmode)
    {
    }

    public ActionMode onWindowStartingSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return null;
    }

    public void setContentView(int i)
    {
        getDelegate().setContentView(i);
    }

    public void setContentView(View view)
    {
        getDelegate().setContentView(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().setContentView(view, layoutparams);
    }

    public void setTitle(int i)
    {
        super.setTitle(i);
        getDelegate().setTitle(getContext().getString(i));
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        getDelegate().setTitle(charsequence);
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return getDelegate().requestWindowFeature(i);
    }
}
