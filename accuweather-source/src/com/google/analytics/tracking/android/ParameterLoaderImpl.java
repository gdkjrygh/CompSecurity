// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

// Referenced classes of package com.google.analytics.tracking.android:
//            ParameterLoader, Log

class ParameterLoaderImpl
    implements ParameterLoader
{

    private final Context mContext;

    public ParameterLoaderImpl(Context context)
    {
        if (context == null)
        {
            throw new NullPointerException("Context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            return;
        }
    }

    private int getResourceIdForType(String s, String s1)
    {
        if (mContext == null)
        {
            return 0;
        } else
        {
            return mContext.getResources().getIdentifier(s, s1, mContext.getPackageName());
        }
    }

    public boolean getBoolean(String s)
    {
        int i = getResourceIdForType(s, "bool");
        if (i == 0)
        {
            return false;
        } else
        {
            return "true".equalsIgnoreCase(mContext.getString(i));
        }
    }

    public Double getDoubleFromString(String s)
    {
        s = getString(s);
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        double d;
        try
        {
            d = Double.parseDouble(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.w((new StringBuilder()).append("NumberFormatException parsing ").append(s).toString());
            return null;
        }
        return Double.valueOf(d);
    }

    public int getInt(String s, int i)
    {
        int j = getResourceIdForType(s, "integer");
        if (j == 0)
        {
            return i;
        }
        int k;
        try
        {
            k = Integer.parseInt(mContext.getString(j));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w((new StringBuilder()).append("NumberFormatException parsing ").append(mContext.getString(j)).toString());
            return i;
        }
        return k;
    }

    public String getString(String s)
    {
        int i = getResourceIdForType(s, "string");
        if (i == 0)
        {
            return null;
        } else
        {
            return mContext.getString(i);
        }
    }

    public boolean isBooleanKeyPresent(String s)
    {
        return getResourceIdForType(s, "bool") != 0;
    }
}
