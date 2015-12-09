// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class clf extends MutableContextWrapper
{

    Activity a;
    Context b;
    private Context c;

    public clf(Context context)
    {
        super(context);
        setBaseContext(context);
    }

    public final Object getSystemService(String s)
    {
        return b.getSystemService(s);
    }

    public final void setBaseContext(Context context)
    {
        c = context.getApplicationContext();
        Activity activity;
        if (context instanceof Activity)
        {
            activity = (Activity)context;
        } else
        {
            activity = null;
        }
        a = activity;
        b = context;
        super.setBaseContext(c);
    }

    public final void startActivity(Intent intent)
    {
        if (a != null && !cnv.a(21))
        {
            a.startActivity(intent);
            return;
        } else
        {
            intent.setFlags(0x10000000);
            c.startActivity(intent);
            return;
        }
    }
}
