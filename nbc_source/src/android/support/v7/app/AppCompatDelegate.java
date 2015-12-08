// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV14, AppCompatDelegateImplV11, AppCompatDelegateImplV7, AppCompatCallback, 
//            ActionBar

public abstract class AppCompatDelegate
{

    AppCompatDelegate()
    {
    }

    public static AppCompatDelegate create(Activity activity, AppCompatCallback appcompatcallback)
    {
        return create(((Context) (activity)), activity.getWindow(), appcompatcallback);
    }

    public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appcompatcallback)
    {
        return create(dialog.getContext(), dialog.getWindow(), appcompatcallback);
    }

    private static AppCompatDelegate create(Context context, Window window, AppCompatCallback appcompatcallback)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            return new AppCompatDelegateImplV14(context, window, appcompatcallback);
        }
        if (i >= 11)
        {
            return new AppCompatDelegateImplV11(context, window, appcompatcallback);
        } else
        {
            return new AppCompatDelegateImplV7(context, window, appcompatcallback);
        }
    }

    public abstract void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public abstract MenuInflater getMenuInflater();

    public abstract ActionBar getSupportActionBar();

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void setSupportActionBar(Toolbar toolbar);

    public abstract void setTitle(CharSequence charsequence);

    public abstract ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback);
}
