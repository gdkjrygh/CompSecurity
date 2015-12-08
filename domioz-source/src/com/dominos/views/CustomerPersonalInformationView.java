// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;

public class CustomerPersonalInformationView extends RelativeLayout
{

    private static final String FORMAT_USER_NAME = "%s %s";
    private static final String FORMAT_USER_PHONE = "%s Ext: %s";
    RelativeLayout mCustomerPersonalInfoContainerLayout;
    private CustomerPersonalInformationClickListener mListener;
    TextView mPersonalInfoEmailView;
    TextView mPersonalInfoNameView;
    TextView mPersonalInfoPhoneView;
    private ViewMode mViewMode;

    public CustomerPersonalInformationView(Context context)
    {
        super(context);
    }

    public CustomerPersonalInformationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void bindUser(UserObject userobject)
    {
        mPersonalInfoNameView.setText(String.format("%s %s", new Object[] {
            userobject.getFirstName(), userobject.getLastName()
        }));
        String s;
        if (userobject.getPhoneExtension().length() > 0)
        {
            s = String.format("%s Ext: %s", new Object[] {
                userobject.getPhone(), userobject.getPhoneExtension()
            });
        } else
        {
            s = userobject.getPhone();
        }
        mPersonalInfoPhoneView.setText(s);
        mPersonalInfoEmailView.setText(userobject.getEmail());
    }

    private void updateViewMode(ViewMode viewmode)
    {
        boolean flag = false;
        mViewMode = viewmode;
        int i;
        if (viewmode == ViewMode.PERSONAL_INFO_LINK)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        viewmode = mCustomerPersonalInfoContainerLayout;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        viewmode.setVisibility(i);
    }

    public void bind(UserObject userobject, ViewMode viewmode, CustomerPersonalInformationClickListener customerpersonalinformationclicklistener)
    {
        bindUser(userobject);
        updateViewMode(viewmode);
        mListener = customerpersonalinformationclicklistener;
    }

    public void onPersonalInfoFooterClick()
    {
        if (mListener != null && mViewMode == ViewMode.PERSONAL_INFO_LINK)
        {
            mListener.onPersonalInformationFooterClicked();
        }
    }

    public void onPersonalInformationLayoutClick()
    {
        if (mListener != null && mViewMode == ViewMode.DEFAULT)
        {
            mListener.onPersonalInformationClicked();
        }
    }

    private class ViewMode extends Enum
    {

        private static final ViewMode $VALUES[];
        public static final ViewMode DEFAULT;
        public static final ViewMode PERSONAL_INFO_LINK;

        public static ViewMode valueOf(String s)
        {
            return (ViewMode)Enum.valueOf(com/dominos/views/CustomerPersonalInformationView$ViewMode, s);
        }

        public static ViewMode[] values()
        {
            return (ViewMode[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new ViewMode("DEFAULT", 0);
            PERSONAL_INFO_LINK = new ViewMode("PERSONAL_INFO_LINK", 1);
            $VALUES = (new ViewMode[] {
                DEFAULT, PERSONAL_INFO_LINK
            });
        }

        private ViewMode(String s, int i)
        {
            super(s, i);
        }
    }


    private class CustomerPersonalInformationClickListener
    {

        public abstract void onPersonalInformationClicked();

        public abstract void onPersonalInformationFooterClicked();
    }

}
