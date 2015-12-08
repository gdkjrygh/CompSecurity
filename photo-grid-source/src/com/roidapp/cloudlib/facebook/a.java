// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.Context;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;

public final class a extends ak
{

    public static String f = "";

    public a(Class class1, Context context, String s)
    {
        super("FaceBook", class1);
        c = aq.h;
        try
        {
            e = context.getString(at.D);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Facebook";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Facebook";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Facebook";
        }
        f = s;
    }

}
