// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.Locale;

final class fzb
    implements android.view.View.OnClickListener
{

    private double a;
    private double b;

    public fzb(double d, double d1)
    {
        a = d;
        b = d1;
    }

    public final void onClick(View view)
    {
        android.net.Uri.Builder builder = Uri.EMPTY.buildUpon();
        Object obj = String.format(Locale.US, "%.6f,%.6f", new Object[] {
            Double.valueOf(a), Double.valueOf(b)
        });
        builder.scheme("geo").opaquePart(((String) (obj))).appendQueryParameter("z", "13").appendQueryParameter("q", ((String) (obj)));
        obj = new Intent("android.intent.action.VIEW");
        ((Intent) (obj)).setData(builder.build());
        if (((Intent) (obj)).resolveActivity(view.getContext().getPackageManager()) != null)
        {
            view.getContext().startActivity(((Intent) (obj)));
        }
    }
}
