// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.graphics.Rect;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.util.DeviceFeatures;

// Referenced classes of package com.skype.android.app.chat.picker:
//            ExtensiblePickerDialogFragment

public class InputMethodOverlay
    implements android.view.View.OnLayoutChangeListener
{

    private FragmentActivity activity;
    private ExtensiblePickerDialogFragment.Callback callback;
    private InputMethodManager imm;
    private boolean immShown;
    private int initialHeight;
    private int inputMethodHeight;
    private boolean isShowing;
    private final PickerItemInteractionManager.MediaSendCallback mediaSendCallback;
    private final ExtensiblePickerDialogFragment.SearchCallback searchCallback;
    private boolean showPicker;

    public InputMethodOverlay(FragmentActivity fragmentactivity, ExtensiblePickerDialogFragment.Callback callback1, ExtensiblePickerDialogFragment.SearchCallback searchcallback, PickerItemInteractionManager.MediaSendCallback mediasendcallback)
    {
        activity = fragmentactivity;
        callback = callback1;
        searchCallback = searchcallback;
        mediaSendCallback = mediasendcallback;
        fragmentactivity.getWindow().getDecorView().addOnLayoutChangeListener(this);
        imm = (InputMethodManager)fragmentactivity.getSystemService("input_method");
    }

    private void show()
    {
        ExtensiblePickerDialogFragment.show(activity.getSupportFragmentManager(), callback, searchCallback, mediaSendCallback);
        showPicker = false;
        isShowing = true;
        if (DeviceFeatures.d() && immShown && isShowing)
        {
            imm.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public int getInputMethodHeight()
    {
        return inputMethodHeight;
    }

    public boolean hide()
    {
        boolean flag = false;
        SkypeDialogFragment skypedialogfragment = (SkypeDialogFragment)activity.getSupportFragmentManager().a("pickerDialog");
        if (skypedialogfragment != null)
        {
            skypedialogfragment.dismiss();
            isShowing = false;
            flag = true;
        }
        return flag;
    }

    public boolean hideWithInputMethod(View view)
    {
        view.clearFocus();
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return hide();
    }

    public boolean isShowing()
    {
        return isShowing;
    }

    public void onLayoutChange(View view, int i, int j, int k, int i1, int j1, int k1, 
            int l1, int i2)
    {
        view = new Rect();
        View view1 = activity.getWindow().getDecorView();
        view1.getWindowVisibleDisplayFrame(view);
        i = view1.getHeight() - (((Rect) (view)).bottom - ((Rect) (view)).top);
        boolean flag;
        if ((float)i > (float)view1.getHeight() * 0.2F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        immShown = flag;
        if (initialHeight == 0 && !immShown)
        {
            initialHeight = i;
        }
        if ((DeviceFeatures.a(activity) || DeviceFeatures.d()) && i == initialHeight)
        {
            inputMethodHeight = (((Rect) (view)).bottom - ((Rect) (view)).top) / 2;
            immShown = true;
        } else
        {
            inputMethodHeight = i - initialHeight;
        }
        if (showPicker && immShown)
        {
            show();
        } else
        if (!immShown && !showPicker)
        {
            hide();
            return;
        }
    }

    public boolean showWithInputMethod(View view)
    {
        if (!hide())
        {
            if (immShown)
            {
                show();
                return true;
            } else
            {
                view.requestFocus();
                view.requestFocusFromTouch();
                imm.showSoftInput(view, 1);
                showPicker = true;
                return true;
            }
        } else
        {
            return false;
        }
    }
}
