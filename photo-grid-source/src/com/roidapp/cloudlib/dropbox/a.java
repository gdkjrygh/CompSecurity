// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.content.Context;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;

public final class a extends ak
{

    public static String f = "";
    public static String g = "";
    public static com.dropbox.client2.session.Session.AccessType h;
    public static String i = "image/gif,image/jpeg,image/png,image/x-ms-bmp";

    public a(Class class1, Context context, String s, String s1, com.dropbox.client2.session.Session.AccessType accesstype)
    {
        super("DropBox", class1);
        c = aq.e;
        try
        {
            e = context.getString(at.w);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Dropbox";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Dropbox";
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            e = "Dropbox";
        }
        f = s;
        g = s1;
        h = accesstype;
    }

}
