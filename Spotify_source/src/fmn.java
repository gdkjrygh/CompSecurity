// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.List;

public class fmn extends fni
{

    private final Context b;
    private final BroadcastReceiver c = new BroadcastReceiver() {

        private fmn a;

        public final void onReceive(Context context, Intent intent)
        {
            context = intent.getStringArrayListExtra("connections");
            if (context != null)
            {
                fmn.a(a, context);
            }
        }

            
            {
                a = fmn.this;
                super();
            }
    };

    public fmn(fnj fnj1)
    {
        super(fmn.getSimpleName());
        b = fnj1.a;
        b.registerReceiver(c, new IntentFilter("com.spotify.mobile.android.service.media.EVENT_CONNECTION_LABELS"));
    }

    static void a(fmn fmn1, List list)
    {
        if (list.contains("car"))
        {
            fmn1.J_();
            return;
        } else
        {
            fmn1.c();
            return;
        }
    }

    protected final void a()
    {
        super.a();
        b.unregisterReceiver(c);
    }
}
