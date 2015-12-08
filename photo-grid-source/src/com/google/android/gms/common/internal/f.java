// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

public final class f
{

    public static String a(String s, String s1, Context context, AttributeSet attributeset, String s2)
    {
label0:
        {
            if (attributeset == null)
            {
                s = null;
            } else
            {
                s = attributeset.getAttributeValue(s, s1);
            }
            attributeset = s;
            if (s != null)
            {
                attributeset = s;
                if (s.startsWith("@string/"))
                {
                    String s3 = s.substring(8);
                    String s4 = context.getPackageName();
                    attributeset = new TypedValue();
                    try
                    {
                        context.getResources().getValue((new StringBuilder()).append(s4).append(":string/").append(s3).toString(), attributeset, true);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        Log.w(s2, (new StringBuilder("Could not find resource for ")).append(s1).append(": ").append(s).toString());
                    }
                    if (((TypedValue) (attributeset)).string == null)
                    {
                        break label0;
                    }
                    attributeset = ((TypedValue) (attributeset)).string.toString();
                }
            }
            return attributeset;
        }
        Log.w(s2, (new StringBuilder("Resource ")).append(s1).append(" was not a string: ").append(attributeset).toString());
        return s;
    }
}
