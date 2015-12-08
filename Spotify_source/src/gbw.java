// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.spotify.mobile.android.orbit.OrbitSessionInterface;

public final class gbw
{

    final Context a;
    final OrbitSessionInterface b;
    public boolean c;
    private final Handler d = new Handler();

    public gbw(Context context, OrbitSessionInterface orbitsessioninterface)
    {
        a = context;
        b = orbitsessioninterface;
    }

    static void a(gbw gbw1, boolean flag)
    {
        int i = 1;
        ContentValues contentvalues = new ContentValues();
        if (!flag)
        {
            i = 0;
        }
        contentvalues.put("offline_mode", Integer.valueOf(i));
        gbw1.a.getContentResolver().update(dtx.a, contentvalues, null, null);
    }

    public final void a()
    {
        Toast.makeText(a, 0x7f080568, 1).show();
        d.postDelayed(new Runnable() {

            private gbw a;

            public final void run()
            {
                gbw.a(a, true);
            }

            
            {
                a = gbw.this;
                super();
            }
        }, 3000L);
        d.postDelayed(new Runnable() {

            private gbw a;

            public final void run()
            {
                gbw.a(a, false);
            }

            
            {
                a = gbw.this;
                super();
            }
        }, 6000L);
        d.postDelayed(new Runnable() {

            private gbw a;

            public final void run()
            {
                gbw gbw1 = a;
                dxm.b(gbw1.a);
                gbw1.b.eraseOfflineUser();
                if (gbw1.c)
                {
                    boolean flag = gbw1.c;
                    ContentValues contentvalues = new ContentValues();
                    String s;
                    if (flag)
                    {
                        s = "true";
                    } else
                    {
                        s = "false";
                    }
                    contentvalues.put("should_show_trial_start_notice", s);
                    gbw1.a.getContentResolver().update(dtx.a, contentvalues, null, null);
                }
                gbw1.b.logout(false);
            }

            
            {
                a = gbw.this;
                super();
            }
        }, 9000L);
    }
}
