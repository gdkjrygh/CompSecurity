// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.content.Context;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;

public final class a extends ak
{

    public static String f = "";
    public static String g = "";
    public static String h = "";
    public static String i = "";

    public a(Context context, String s, String s1, String s2, String s3)
    {
        super("Twitter", null);
        c = aq.J;
        try
        {
            e = context.getString(at.bd);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e = "Twitter";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e = "Twitter";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e = "Twitter";
        }
        f = s;
        g = s1;
        h = s2;
        i = s3;
    }

}
