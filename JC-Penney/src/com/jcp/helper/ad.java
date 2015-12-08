// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.content.Context;
import android.content.res.AssetManager;
import com.jcp.model.State;
import com.jcp.util.aa;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class ad
{

    public static String a(String s, Context context)
    {
        String s1 = " ";
        Iterator iterator = a(context).iterator();
        context = s1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            State state = (State)iterator.next();
            if (state.getAbbreviation().equals(s))
            {
                context = state.getName();
            }
        } while (true);
        return context;
    }

    public static List a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        context = (State[])aa.a(b(context), [Lcom/jcp/model/State;);
        if (context != null)
        {
            return Arrays.asList(context);
        } else
        {
            return arraylist;
        }
    }

    private static String b(Context context)
    {
        try
        {
            context = context.getAssets().open("usStateList.txt");
            byte abyte0[] = new byte[context.available()];
            context.read(abyte0);
            context.close();
            context = new String(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        return context;
    }

    public static String b(String s, Context context)
    {
        String s1 = " ";
        Iterator iterator = a(context).iterator();
        context = s1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            State state = (State)iterator.next();
            if (state.getName().equals(s))
            {
                context = state.getAbbreviation();
            }
        } while (true);
        return context;
    }
}
