// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.common.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            ae, ad, ac

public final class ab extends DialogFragment
{

    private Activity a;
    private String b;
    private boolean c;

    public ab()
    {
    }

    static Activity a(ab ab1)
    {
        return ab1.a;
    }

    public static void a(Activity activity, String s)
    {
        Object obj;
        obj = (new StringBuilder("market://details?id=com.roidapp.photogrid.plugin.stickers")).append(s).toString();
        s = (new StringBuilder("https://play.google.com/store/apps/details?id=com.roidapp.photogrid.plugin.stickers")).append(s).toString();
        if (!n.a(activity, "com.android.vending"))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        Intent intent1;
        Uri uri = Uri.parse(((String) (obj)));
        intent1 = new Intent("android.intent.action.VIEW");
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            intent1.setFlags(0x10000000);
        }
        intent1.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        intent1.setData(uri);
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (activity.isFinishing())
        {
            return;
        }
        try
        {
            activity.startActivity(intent1);
            return;
        }
        catch (Exception exception1)
        {
            exception1.printStackTrace();
        }
        Intent intent;
        try
        {
            obj = Uri.parse(((String) (obj)));
            intent = new Intent("android.intent.action.VIEW");
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                intent.setFlags(0x10000000);
            }
            intent.setPackage("com.android.vending");
            intent.setData(((Uri) (obj)));
        }
        catch (Exception exception)
        {
            b(activity, s);
            exception.printStackTrace();
            return;
        }
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (!activity.isFinishing())
        {
            activity.startActivity(intent);
            return;
        }
        break MISSING_BLOCK_LABEL_192;
        b(activity, s);
    }

    static String b(ab ab1)
    {
        return ab1.b;
    }

    private static void b(Activity activity, String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uri = Uri.parse(s);
        intent.setFlags(0x10000000);
        intent.setData(uri);
        intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
        activity.startActivity(intent);
_L2:
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        Intent intent2;
        intent2 = new Intent("android.intent.action.VIEW");
        Uri uri1 = Uri.parse(s);
        intent2.setFlags(0x10000000);
        intent2.setData(uri1);
        intent2.setPackage("com.android.browser");
        if (activity == null) goto _L2; else goto _L1
_L1:
        if (activity.isFinishing()) goto _L2; else goto _L3
_L3:
        activity.startActivity(intent2);
        return;
        Exception exception1;
        exception1;
        exception.printStackTrace();
        s = Uri.parse(s);
        Intent intent1 = new Intent("android.intent.action.VIEW");
        intent1.setFlags(0x10000000);
        intent1.setData(s);
        if (activity != null && !activity.isFinishing())
        {
            try
            {
                activity.startActivity(intent1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                activity.printStackTrace();
            }
            return;
        }
          goto _L2
    }

    public final void a(String s)
    {
        b = s;
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final void onAttach(Activity activity)
    {
        com.roidapp.photogrid.common.b.a("AddDecoViewTipDialogFragment/onAttach");
        a = activity;
        super.onAttach(activity);
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        com.roidapp.photogrid.common.b.a("AddDecoViewTipDialogFragment/onCreateDialog");
        bundle = new android.app.AlertDialog.Builder(getActivity());
        android.app.AlertDialog.Builder builder;
        int i;
        if (c)
        {
            i = 0x7f070239;
        } else
        {
            i = 0x7f0702e7;
        }
        builder = bundle.setTitle(i);
        if (c)
        {
            i = 0x7f07023a;
        } else
        {
            i = 0x7f07022e;
        }
        builder.setMessage(i).setPositiveButton(0x7f070133, new ae(this)).setNegativeButton(0x7f070130, new ad(this)).setOnCancelListener(new ac(this));
        return bundle.create();
    }
}
