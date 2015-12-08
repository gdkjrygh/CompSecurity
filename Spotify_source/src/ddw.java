// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.squareup.picasso.Picasso;
import java.util.Set;

public final class ddw
{

    public static Dialog a(Context context, View view)
    {
        if (dgn.a(context))
        {
            context = new Dialog(context, 0x103000a);
            context.setContentView(view);
            return context;
        } else
        {
            context = new android.app.AlertDialog.Builder(context);
            context.setView(view);
            context = context.create();
            context.setCanceledOnTouchOutside(true);
            return context;
        }
    }

    public static ddv a(Context context, deh deh, Picasso picasso, String s, Set set)
    {
        if (dgn.a(context))
        {
            return new ddx(context, deh, picasso, s, set);
        } else
        {
            return new dec(context, deh, picasso, s, set);
        }
    }
}
