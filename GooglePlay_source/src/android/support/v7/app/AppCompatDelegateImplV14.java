// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.internal.view.StandaloneActionMode;
import android.support.v7.internal.view.SupportActionModeWrapper;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.view.ActionMode;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV11, AppCompatCallback, AppCompatDelegateImplV7, ActionBar

final class AppCompatDelegateImplV14 extends AppCompatDelegateImplV11
{
    final class AppCompatWindowCallbackV14 extends AppCompatDelegateImplBase.AppCompatWindowCallbackBase
    {

        final AppCompatDelegateImplV14 this$0;

        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
        {
            if (mHandleNativeActionModes)
            {
                android.support.v7.internal.view.SupportActionModeWrapper.CallbackWrapper callbackwrapper = new android.support.v7.internal.view.SupportActionModeWrapper.CallbackWrapper(mContext, callback);
                AppCompatDelegateImplV14 appcompatdelegateimplv14 = AppCompatDelegateImplV14.this;
                if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionMode != null)
                {
                    ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionMode.finish();
                }
                AppCompatDelegateImplV7.ActionModeCallbackWrapperV7 actionmodecallbackwrapperv7 = new AppCompatDelegateImplV7.ActionModeCallbackWrapperV7(appcompatdelegateimplv14, callbackwrapper);
                callback = appcompatdelegateimplv14.getSupportActionBar();
                if (callback != null)
                {
                    appcompatdelegateimplv14.mActionMode = callback.startActionMode(actionmodecallbackwrapperv7);
                }
                if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionMode == null)
                {
                    if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionMode != null)
                    {
                        ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionMode.finish();
                    }
                    AppCompatDelegateImplV7.ActionModeCallbackWrapperV7 actionmodecallbackwrapperv7_1 = new AppCompatDelegateImplV7.ActionModeCallbackWrapperV7(appcompatdelegateimplv14, actionmodecallbackwrapperv7);
                    if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView == null)
                    {
                        if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mIsFloating)
                        {
                            Object obj = new TypedValue();
                            callback = ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mContext.getTheme();
                            callback.resolveAttribute(0x7f0100ff, ((TypedValue) (obj)), true);
                            int i;
                            if (((TypedValue) (obj)).resourceId != 0)
                            {
                                android.content.res.Resources.Theme theme = ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mContext.getResources().newTheme();
                                theme.setTo(callback);
                                theme.applyStyle(((TypedValue) (obj)).resourceId, true);
                                callback = new ContextThemeWrapper(((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mContext, 0);
                                callback.getTheme().setTo(theme);
                            } else
                            {
                                callback = ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mContext;
                            }
                            appcompatdelegateimplv14.mActionModeView = new ActionBarContextView(callback);
                            appcompatdelegateimplv14.mActionModePopup = new PopupWindow(callback, null, 0x7f010112);
                            ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModePopup.setContentView(((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView);
                            ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModePopup.setWidth(-1);
                            callback.getTheme().resolveAttribute(0x7f010101, ((TypedValue) (obj)), true);
                            i = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj)).data, callback.getResources().getDisplayMetrics());
                            ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.setContentHeight(i);
                            ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModePopup.setHeight(-2);
                            appcompatdelegateimplv14.mShowActionModePopup = new AppCompatDelegateImplV7._cls4(appcompatdelegateimplv14);
                        } else
                        {
                            callback = (ViewStubCompat)((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mSubDecor.findViewById(0x7f0d00c7);
                            if (callback != null)
                            {
                                callback.mInflater = LayoutInflater.from(appcompatdelegateimplv14.getActionBarThemedContext());
                                appcompatdelegateimplv14.mActionModeView = (ActionBarContextView)callback.inflate();
                            }
                        }
                    }
                    if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView != null)
                    {
                        ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.killMode();
                        callback = ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.getContext();
                        obj = ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView;
                        boolean flag;
                        if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModePopup == null)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        callback = new StandaloneActionMode(callback, ((ActionBarContextView) (obj)), actionmodecallbackwrapperv7_1, flag);
                        if (actionmodecallbackwrapperv7.onCreateActionMode(callback, callback.getMenu()))
                        {
                            callback.invalidate();
                            ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.initForMode(callback);
                            ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.setVisibility(0);
                            appcompatdelegateimplv14.mActionMode = callback;
                            if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModePopup != null)
                            {
                                ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mWindow.getDecorView().post(((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mShowActionModePopup);
                            }
                            ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.sendAccessibilityEvent(32);
                            if (((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.getParent() != null)
                            {
                                ViewCompat.requestApplyInsets((View)((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionModeView.getParent());
                            }
                        } else
                        {
                            appcompatdelegateimplv14.mActionMode = null;
                        }
                    }
                    appcompatdelegateimplv14.mActionMode = ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionMode;
                }
                callback = ((AppCompatDelegateImplV7) (appcompatdelegateimplv14)).mActionMode;
                if (callback != null)
                {
                    callback = new SupportActionModeWrapper(mContext, callback);
                    callbackwrapper.mActionModes.add(callback);
                    return callback;
                } else
                {
                    return null;
                }
            } else
            {
                return super.onWindowStartingActionMode(callback);
            }
        }

        AppCompatWindowCallbackV14(android.view.Window.Callback callback)
        {
            this$0 = AppCompatDelegateImplV14.this;
            super(AppCompatDelegateImplV14.this, callback);
        }
    }


    boolean mHandleNativeActionModes;

    AppCompatDelegateImplV14(Context context, Window window, AppCompatCallback appcompatcallback)
    {
        super(context, window, appcompatcallback);
        mHandleNativeActionModes = true;
    }

    final android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
    {
        return new AppCompatWindowCallbackV14(callback);
    }
}
