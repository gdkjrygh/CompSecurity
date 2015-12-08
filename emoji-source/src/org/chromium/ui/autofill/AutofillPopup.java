// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.autofill;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.ui.DropdownAdapter;
import org.chromium.ui.DropdownPopupWindow;
import org.chromium.ui.base.ViewAndroidDelegate;

// Referenced classes of package org.chromium.ui.autofill:
//            AutofillSuggestion

public class AutofillPopup extends DropdownPopupWindow
    implements android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{
    public static interface AutofillPopupDelegate
    {

        public abstract void dismissed();

        public abstract void suggestionSelected(int i);
    }


    static final boolean $assertionsDisabled;
    private static final int ITEM_ID_SEPARATOR_ENTRY = -3;
    private final AutofillPopupDelegate mAutofillCallback;
    private final Context mContext;
    private List mSuggestions;

    public AutofillPopup(Context context, ViewAndroidDelegate viewandroiddelegate, AutofillPopupDelegate autofillpopupdelegate)
    {
        super(context, viewandroiddelegate);
        mContext = context;
        mAutofillCallback = autofillpopupdelegate;
        setOnItemClickListener(this);
        setOnDismissListener(this);
    }

    public void filterAndShow(AutofillSuggestion aautofillsuggestion[], boolean flag)
    {
        boolean flag1 = true;
        mSuggestions = new ArrayList(Arrays.asList(aautofillsuggestion));
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet();
        int i = 0;
        while (i < aautofillsuggestion.length) 
        {
            if (aautofillsuggestion[i].getSuggestionId() == -3)
            {
                hashset.add(Integer.valueOf(arraylist.size()));
            } else
            {
                arraylist.add(aautofillsuggestion[i]);
            }
            i++;
        }
        setAdapter(new DropdownAdapter(mContext, arraylist, hashset));
        show();
        aautofillsuggestion = getListView();
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        ApiCompatibilityUtils.setLayoutDirection(aautofillsuggestion, i);
        try
        {
            android/widget/ListPopupWindow.getMethod("setForceIgnoreOutsideTouch", new Class[] {
                Boolean.TYPE
            }).invoke(this, new Object[] {
                Boolean.valueOf(true)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AutofillSuggestion aautofillsuggestion[])
        {
            Log.e("AutofillPopup", "ListPopupWindow.setForceIgnoreOutsideTouch not found", aautofillsuggestion);
        }
    }

    public void hide()
    {
        dismiss();
    }

    public void onDismiss()
    {
        mAutofillCallback.dismissed();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (DropdownAdapter)adapterview.getAdapter();
        i = mSuggestions.indexOf(adapterview.getItem(i));
        if (!$assertionsDisabled && i <= -1)
        {
            throw new AssertionError();
        } else
        {
            mAutofillCallback.suggestionSelected(i);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/autofill/AutofillPopup.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
