// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.content.Context;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;

public final class h extends ak
{

    public h(Class class1, Context context)
    {
        super("Google", class1);
        c = aq.l;
        try
        {
            e = context.getString(at.U);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Google";
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Google";
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Google";
        }
    }
}
