// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.sphere.intent;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package com.htc.sphere.intent:
//            MenuUtils

public static final class fragName
    implements Parcelable, MenuItem
{

    public static final android.os.leMenuItem.fragName CREATOR = new _cls1();
    public static final int INVOKE_SEND_BROADCAST = 2;
    public static final int INVOKE_START_ACTIVITY = 0;
    public static final int INVOKE_START_FRAGMENT = 3;
    public static final int INVOKE_START_SERVICE = 1;
    public String fragName;
    public int iconRes;
    public Intent intent;
    public int invokeMethod;
    public int itemId;
    public String packageName;
    public int titleRes;

    public boolean collapseActionView()
    {
        return false;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean expandActionView()
    {
        return false;
    }

    public ActionProvider getActionProvider()
    {
        return null;
    }

    public View getActionView()
    {
        return null;
    }

    public char getAlphabeticShortcut()
    {
        return '\0';
    }

    public String getFragmentName()
    {
        return fragName;
    }

    public int getGroupId()
    {
        return 0;
    }

    public Drawable getIcon()
    {
        return null;
    }

    public int getIconRes()
    {
        return iconRes;
    }

    public Intent getIntent()
    {
        return intent;
    }

    public int getInvokeMethod()
    {
        return invokeMethod;
    }

    public int getItemId()
    {
        return itemId;
    }

    public android.view.fo getMenuInfo()
    {
        return null;
    }

    public char getNumericShortcut()
    {
        return '\0';
    }

    public int getOrder()
    {
        return 0;
    }

    public String getPackageName()
    {
        return packageName;
    }

    public SubMenu getSubMenu()
    {
        return null;
    }

    public CharSequence getTitle()
    {
        return null;
    }

    public CharSequence getTitleCondensed()
    {
        return null;
    }

    public int getTitleRes()
    {
        return titleRes;
    }

    public boolean hasSubMenu()
    {
        return false;
    }

    public boolean isActionViewExpanded()
    {
        return false;
    }

    public boolean isCheckable()
    {
        return false;
    }

    public boolean isChecked()
    {
        return false;
    }

    public boolean isEnabled()
    {
        return false;
    }

    public boolean isVisible()
    {
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        return null;
    }

    public MenuItem setActionView(int i)
    {
        return null;
    }

    public MenuItem setActionView(View view)
    {
        return null;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        return null;
    }

    public MenuItem setCheckable(boolean flag)
    {
        return null;
    }

    public MenuItem setChecked(boolean flag)
    {
        return null;
    }

    public MenuItem setEnabled(boolean flag)
    {
        return null;
    }

    public void setFragmentName(String s)
    {
        fragName = s;
    }

    public MenuItem setIcon(int i)
    {
        return null;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        return null;
    }

    public void setIconRes(int i)
    {
        iconRes = i;
    }

    public MenuItem setIntent(Intent intent1)
    {
        return null;
    }

    public void setInvokeMethod(int i)
    {
        invokeMethod = i;
    }

    public void setItemId(int i)
    {
        itemId = i;
    }

    public MenuItem setNumericShortcut(char c)
    {
        return null;
    }

    public MenuItem setOnActionExpandListener(android.view.stener stener)
    {
        return null;
    }

    public MenuItem setOnMenuItemClickListener(android.view.istener istener)
    {
        return null;
    }

    public void setPackageName(String s)
    {
        packageName = s;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        return null;
    }

    public void setShowAsAction(int i)
    {
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        return null;
    }

    public MenuItem setTitle(int i)
    {
        return null;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        return null;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        return null;
    }

    public void setTitleRes(int i)
    {
        titleRes = i;
    }

    public MenuItem setVisible(boolean flag)
    {
        return null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(itemId);
        parcel.writeString(packageName);
        parcel.writeInt(titleRes);
        parcel.writeInt(invokeMethod);
        parcel.writeParcelable(intent, 0);
        parcel.writeInt(iconRes);
        parcel.writeString(fragName);
    }


    public _cls1()
    {
    }

    public _cls1(int i, String s, int j, int k, int l, Intent intent1)
    {
        itemId = i;
        packageName = s;
        titleRes = j;
        invokeMethod = l;
        intent = intent1;
        iconRes = k;
    }

    public iconRes(int i, String s, int j, int k, Intent intent1)
    {
        this(i, s, j, 0, k, intent1);
    }

    public <init>(Parcel parcel)
    {
        itemId = parcel.readInt();
        packageName = parcel.readString();
        titleRes = parcel.readInt();
        invokeMethod = parcel.readInt();
        intent = (Intent)parcel.readParcelable(android/content/Intent.getClassLoader());
        iconRes = parcel.readInt();
        fragName = parcel.readString();
    }

    public fragName(String s, String s1, Intent intent1)
    {
        this(0, s, 0, 0, 3, intent1);
        fragName = s1;
    }

    /* block-local class not found */
    class _cls1 {}

}
