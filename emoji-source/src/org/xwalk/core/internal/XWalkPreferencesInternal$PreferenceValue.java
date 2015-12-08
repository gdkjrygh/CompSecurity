// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkPreferencesInternal

static class mValue
{

    static final int PREFERENCE_TYPE_BOOLEAN = 1;
    static final int PREFERENCE_TYPE_INTEGER = 2;
    static final int PREFERENCE_TYPE_STRING = 3;
    int mType;
    Object mValue;

    boolean getBooleanValue()
    {
        if (mType != 1)
        {
            return false;
        } else
        {
            return ((Boolean)mValue).booleanValue();
        }
    }

    int getIntegerValue()
    {
        if (mType != 2)
        {
            return -1;
        } else
        {
            return ((Integer)mValue).intValue();
        }
    }

    String getStringValue()
    {
        if (mType != 3)
        {
            return null;
        } else
        {
            return (String)mValue;
        }
    }

    int getType()
    {
        return mType;
    }

    (int i)
    {
        mType = 2;
        mValue = Integer.valueOf(i);
    }

    mValue(String s)
    {
        mType = 3;
        mValue = s;
    }

    mValue(boolean flag)
    {
        mType = 1;
        mValue = Boolean.valueOf(flag);
    }
}
