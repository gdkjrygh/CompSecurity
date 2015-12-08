// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.Context;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;

public final class j extends ak
{

    public String f;
    public String g;
    public String h;

    public j(Class class1, Context context, String s, String s1, String s2)
    {
        super("Flickr", class1);
        f = "";
        g = "";
        h = "";
        c = aq.j;
        try
        {
            e = context.getString(at.K);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Flikcr";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Flikcr";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Flikcr";
        }
        f = s;
        g = s1;
        h = s2;
    }
}
