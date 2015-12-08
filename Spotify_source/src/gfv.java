// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.Window;

public final class gfv
{

    public static void a(Context context)
    {
        while (gem.d || !(context instanceof Activity)) 
        {
            return;
        }
        ((Activity)context).getWindow().addFlags(0x4000000);
    }

    public static boolean b(Context context)
    {
        while (gem.d || !(context instanceof Activity) || (((Activity)context).getWindow().getAttributes().flags & 0x4000000) == 0) 
        {
            return false;
        }
        return true;
    }

    public static int c(Context context)
    {
        int i = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (i == 0)
        {
            return 0;
        } else
        {
            return context.getResources().getDimensionPixelSize(i);
        }
    }
}
