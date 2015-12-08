// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class cj
{

    private static final cq a;

    public static Bundle a(Notification notification)
    {
        return a.a(notification);
    }

    static cq a()
    {
        return a;
    }

    static void a(ch ch1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); ch1.a((ck)arraylist.next())) { }
    }

    static void a(ci ci, cy cy)
    {
        if (cy != null)
        {
            if (cy instanceof cm)
            {
                cy = (cm)cy;
                de.a(ci, ((cm) (cy)).c, false, null, ((cm) (cy)).a);
            } else
            {
                if (cy instanceof cp)
                {
                    cy = (cp)cy;
                    de.a(ci, ((cp) (cy)).c, false, null, ((cp) (cy)).a);
                    return;
                }
                if (cy instanceof cl)
                {
                    cy = (cl)cy;
                    de.a(ci, ((cl) (cy)).c, false, null, ((cl) (cy)).a, null, false);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new cs();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new cr();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new cx();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new cw();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new cv();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new cu();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new ct();
        } else
        {
            a = new cq();
        }
    }
}
