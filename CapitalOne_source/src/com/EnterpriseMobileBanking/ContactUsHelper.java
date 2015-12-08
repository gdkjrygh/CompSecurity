// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Plugins.NativeCache;
import com.EnterpriseMobileBanking.Utils.Log;
import java.text.MessageFormat;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper

public class ContactUsHelper
{

    private static final String TAG = "ContactUsHelper";
    private static ContactUsHelper mInstance;
    private View m360Email;
    private View m360FB;
    private View m360PhoneNum;
    private View m360Twitter;
    private Activity mActivity;
    private View mCap1FB;
    private View mCap1OutsideUs;
    private View mCap1PhoneNum;
    private View mCap1Twitter;
    private View mCopyright;

    private ContactUsHelper(Activity activity)
    {
        mActivity = activity;
        mCap1PhoneNum = mActivity.findViewById(0x7f08003b);
        mCap1OutsideUs = mActivity.findViewById(0x7f08003d);
        mCap1Twitter = mActivity.findViewById(0x7f080042);
        mCap1FB = mActivity.findViewById(0x7f080044);
        m360PhoneNum = mActivity.findViewById(0x7f080047);
        m360Email = mActivity.findViewById(0x7f080049);
        m360Twitter = mActivity.findViewById(0x7f08004b);
        m360FB = mActivity.findViewById(0x7f08004d);
        mCopyright = mActivity.findViewById(0x7f08004e);
    }

    public static ContactUsHelper getInstance(Activity activity)
    {
        if (mInstance == null)
        {
            mInstance = new ContactUsHelper(activity);
        }
        return mInstance;
    }

    public void initContactUs()
    {
        Resources resources = mActivity.getResources();
        String s = NativeCache.staticRead("SP_CONTACT_CAP1_US_PHONE", resources.getString(0x7f0900e5));
        ((TextView)mActivity.findViewById(0x7f08003c)).setText(MessageFormat.format(resources.getString(0x7f0900b9), new Object[] {
            s
        }));
        ((TextView)mActivity.findViewById(0x7f08003c)).setContentDescription((new StringBuilder()).append(resources.getString(0x7f09013f)).append(resources.getString(0x7f090131)).toString());
        mCap1PhoneNum.setTag(MessageFormat.format(resources.getString(0x7f0900ba), new Object[] {
            s
        }));
        s = NativeCache.staticRead("SP_CONTACT_CAP1_NON_US_PHONE", resources.getString(0x7f0900e6));
        ((TextView)mActivity.findViewById(0x7f080040)).setText(MessageFormat.format(resources.getString(0x7f0900bc), new Object[] {
            s
        }));
        ((TextView)mActivity.findViewById(0x7f080040)).setContentDescription((new StringBuilder()).append(resources.getString(0x7f090140)).append(resources.getString(0x7f090131)).toString());
        mCap1OutsideUs.setTag(MessageFormat.format(resources.getString(0x7f0900bd), new Object[] {
            s
        }));
        s = NativeCache.staticRead("SP_CONTACT_CAP1_TWITTER", resources.getString(0x7f0900e7));
        mCap1Twitter.setTag(s);
        mCap1Twitter.setContentDescription((new StringBuilder()).append(resources.getString(0x7f0900c2)).append(" ").append(resources.getString(0x7f09012e)).toString());
        s = NativeCache.staticRead("SP_CONTACT_CAP1_FACEBOOK", resources.getString(0x7f0900e8));
        mCap1FB.setTag(s);
        mCap1FB.setContentDescription((new StringBuilder()).append(resources.getString(0x7f090143)).append(" ").append(resources.getString(0x7f09012e)).toString());
        s = NativeCache.staticRead("SP_CONTACT_360_US_PHONE", resources.getString(0x7f0900e9));
        ((TextView)mActivity.findViewById(0x7f080048)).setText(MessageFormat.format(resources.getString(0x7f0900bf), new Object[] {
            s
        }));
        ((TextView)mActivity.findViewById(0x7f080048)).setContentDescription((new StringBuilder()).append(resources.getString(0x7f090141)).append(resources.getString(0x7f090131)).toString());
        m360PhoneNum.setTag(MessageFormat.format(resources.getString(0x7f0900c0), new Object[] {
            s
        }));
        s = NativeCache.staticRead("SP_CONTACT_360_EMAIL", resources.getString(0x7f0900ea));
        m360Email.setTag(s);
        m360Email.setContentDescription((new StringBuilder()).append(resources.getString(0x7f090142)).append(" ").append(resources.getString(0x7f09012f)).toString());
        s = NativeCache.staticRead("SP_CONTACT_360_TWITTER", resources.getString(0x7f0900eb));
        m360Twitter.setTag(s);
        m360Twitter.setContentDescription((new StringBuilder()).append(resources.getString(0x7f0900c2)).append(" ").append(resources.getString(0x7f09012e)).toString());
        s = NativeCache.staticRead("SP_CONTACT_360_FACEBOOK", resources.getString(0x7f0900ec));
        m360FB.setTag(s);
        m360FB.setContentDescription((new StringBuilder()).append(resources.getString(0x7f090143)).append(" ").append(resources.getString(0x7f09012e)).toString());
        AppHelper.setCopyrightYear((TextView)mCopyright);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        int i = menuitem.getItemId();
        Log.v("ContactUsHelper", (new StringBuilder()).append("item id: ").append(i).toString());
        switch (i)
        {
        default:
            flag = false;
            // fall through

        case 2131230922: 
        case 2131230923: 
        case 2131230924: 
        case 2131230925: 
            return flag;
        }
    }

    public boolean onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view.getId() == mCap1PhoneNum.getId())
        {
            mActivity.getMenuInflater().inflate(0x7f0e0001, contextmenu);
            return true;
        } else
        {
            return false;
        }
    }
}
