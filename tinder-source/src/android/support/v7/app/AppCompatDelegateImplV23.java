// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.ActionMode;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV14, AppCompatCallback

class AppCompatDelegateImplV23 extends AppCompatDelegateImplV14
{
    class AppCompatWindowCallbackV23 extends AppCompatDelegateImplV14.AppCompatWindowCallbackV14
    {

        final AppCompatDelegateImplV23 this$0;

        public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
        {
            return null;
        }

        public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
        {
            if (!isHandleNativeActionModesEnabled()) goto _L2; else goto _L1
_L1:
            i;
            JVM INSTR tableswitch 0 0: default 28
        //                       0 35;
               goto _L2 _L3
_L2:
            return super.onWindowStartingActionMode(callback, i);
_L3:
            return startAsSupportActionMode(callback);
        }

        AppCompatWindowCallbackV23(android.view.Window.Callback callback)
        {
            this$0 = AppCompatDelegateImplV23.this;
            super(AppCompatDelegateImplV23.this, callback);
        }
    }


    AppCompatDelegateImplV23(Context context, Window window, AppCompatCallback appcompatcallback)
    {
        super(context, window, appcompatcallback);
    }

    android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
    {
        return new AppCompatWindowCallbackV23(callback);
    }
}
