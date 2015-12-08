// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.content.Context;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;

public final class h extends ak
{

    public String f;
    public String g;
    public String h;

    public h(Class class1, Context context, String s, String s1, String s2)
    {
        super("Instagram", class1);
        f = "";
        g = "";
        h = "";
        c = aq.z;
        try
        {
            e = context.getString(at.W);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Instagram";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Instagram";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Instagram";
        }
        f = s;
        g = s1;
        h = s2;
    }
}
