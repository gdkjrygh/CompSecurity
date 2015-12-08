// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;

public class hfg
    implements omb, opv
{

    private lzn a;
    private final Activity b;
    private final android.content.DialogInterface.OnClickListener c = new hfh(this);

    public hfg(opd opd1, Activity activity)
    {
        b = activity;
        opd1.a(this);
    }

    static lzn a(hfg hfg1)
    {
        return hfg1.a;
    }

    static Activity b(hfg hfg1)
    {
        return hfg1.b;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (lzn)olm1.a(lzn);
    }

    public final boolean a(boolean flag)
    {
        boolean flag1;
        if (a.a(b) == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && a.b(a.a(b)))
        {
            boolean flag2;
            if (a.a(b) == 2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2)
            {
                android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(b)).setTitle(b.vN).setPositiveButton(b.vO, c);
                if (flag)
                {
                    builder.setMessage(b.vM).setNegativeButton(b.vQ, null);
                } else
                {
                    builder.setMessage(b.vP).setNegativeButton(0x1040000, null);
                }
                builder.create().show();
            } else
            {
                android.app.AlertDialog.Builder builder1 = (new android.app.AlertDialog.Builder(b)).setTitle(b.vK).setPositiveButton(0x104000a, null);
                int i;
                if (flag)
                {
                    i = b.vJ;
                } else
                {
                    i = b.vL;
                }
                builder1.setMessage(i);
                builder1.create().show();
            }
        }
        return !flag1;
    }
}
