// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

public class XWalkMixedResources extends Resources
{

    private Resources mLibraryResource;

    XWalkMixedResources(Resources resources, Resources resources1)
    {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        mLibraryResource = resources1;
    }

    private boolean isCalledInLibrary()
    {
        StackTraceElement astacktraceelement[];
        int i;
        int j;
        boolean flag1;
        flag1 = false;
        astacktraceelement = Thread.currentThread().getStackTrace();
        j = astacktraceelement.length;
        i = 0;
_L7:
        boolean flag = flag1;
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s = astacktraceelement[i].getClassName();
        if (!s.startsWith("org.chromium") && !s.startsWith("org.xwalk.core.internal")) goto _L4; else goto _L3
_L3:
        flag = true;
_L2:
        return flag;
_L4:
        if (!s.startsWith("org.xwalk.core"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!s.endsWith("XWalkMixedResources")) goto _L2; else goto _L5
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Drawable getDrawable(int i)
    {
        boolean flag;
        flag = isCalledInLibrary();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        return mLibraryResource.getDrawable(i);
        Drawable drawable = super.getDrawable(i);
        return drawable;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        if (flag)
        {
            return super.getDrawable(i);
        } else
        {
            return mLibraryResource.getDrawable(i);
        }
    }

    public int getIdentifier(String s, String s1, String s2)
    {
        if (isCalledInLibrary())
        {
            int i = mLibraryResource.getIdentifier(s, s1, s2);
            if (i != 0)
            {
                return i;
            } else
            {
                return super.getIdentifier(s, s1, s2);
            }
        }
        int j = super.getIdentifier(s, s1, s2);
        if (j != 0)
        {
            return j;
        } else
        {
            return mLibraryResource.getIdentifier(s, s1, s2);
        }
    }

    public XmlResourceParser getLayout(int i)
        throws android.content.res.Resources.NotFoundException
    {
        boolean flag;
        flag = isCalledInLibrary();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        return mLibraryResource.getLayout(i);
        XmlResourceParser xmlresourceparser = super.getLayout(i);
        return xmlresourceparser;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        if (flag)
        {
            return super.getLayout(i);
        } else
        {
            return mLibraryResource.getLayout(i);
        }
    }

    public CharSequence getText(int i)
        throws android.content.res.Resources.NotFoundException
    {
        boolean flag;
        flag = isCalledInLibrary();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        return mLibraryResource.getText(i);
        CharSequence charsequence = super.getText(i);
        return charsequence;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        if (flag)
        {
            return super.getText(i);
        } else
        {
            return mLibraryResource.getText(i);
        }
    }

    public void getValue(int i, TypedValue typedvalue, boolean flag)
    {
        boolean flag1;
        flag1 = isCalledInLibrary();
        if (flag1)
        {
            try
            {
                mLibraryResource.getValue(i, typedvalue, flag);
                return;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception) { }
            break MISSING_BLOCK_LABEL_32;
        }
        super.getValue(i, typedvalue, flag);
        return;
        if (flag1)
        {
            super.getValue(i, typedvalue, flag);
            return;
        } else
        {
            mLibraryResource.getValue(i, typedvalue, flag);
            return;
        }
    }

    public void getValueForDensity(int i, int j, TypedValue typedvalue, boolean flag)
    {
        boolean flag1;
        flag1 = isCalledInLibrary();
        if (flag1)
        {
            try
            {
                mLibraryResource.getValueForDensity(i, j, typedvalue, flag);
                return;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception) { }
            break MISSING_BLOCK_LABEL_36;
        }
        super.getValueForDensity(i, j, typedvalue, flag);
        return;
        if (flag1)
        {
            super.getValueForDensity(i, j, typedvalue, flag);
            return;
        } else
        {
            mLibraryResource.getValueForDensity(i, j, typedvalue, flag);
            return;
        }
    }
}
