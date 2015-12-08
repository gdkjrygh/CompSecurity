// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.ViewTreeObserver;
import java.util.LinkedList;
import java.util.List;

public final class gcg
{

    public static Drawable a(Context context, int i)
    {
        if (gem.p)
        {
            return context.getDrawable(i);
        } else
        {
            return context.getResources().getDrawable(i);
        }
    }

    public static List a(ConnectivityManager connectivitymanager)
    {
        int i = 0;
        LinkedList linkedlist = new LinkedList();
        if (gem.p)
        {
            android.net.Network anetwork[] = connectivitymanager.getAllNetworks();
            if (anetwork != null)
            {
                for (; i < anetwork.length; i++)
                {
                    NetworkInfo networkinfo = connectivitymanager.getNetworkInfo(anetwork[i]);
                    if (networkinfo.getType() == 0)
                    {
                        linkedlist.add(networkinfo);
                    }
                }

            }
        } else
        {
            connectivitymanager = connectivitymanager.getNetworkInfo(0);
            if (connectivitymanager != null)
            {
                linkedlist.add(connectivitymanager);
            }
        }
        return linkedlist;
    }

    public static void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (gem.a)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
            return;
        }
    }

    public static int b(Context context, int i)
    {
        if (gem.q)
        {
            return context.getColor(i);
        } else
        {
            return context.getResources().getColor(i);
        }
    }

    public static ColorStateList c(Context context, int i)
    {
        if (gem.q)
        {
            return context.getColorStateList(i);
        } else
        {
            return context.getResources().getColorStateList(i);
        }
    }
}
