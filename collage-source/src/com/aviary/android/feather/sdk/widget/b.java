// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.aviary.android.feather.cds.billing.util.Purchase;
import com.aviary.android.feather.cds.billing.util.e;
import com.aviary.android.feather.cds.billing.util.f;
import com.aviary.android.feather.cds.h;
import com.aviary.android.feather.cds.i;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.library.services.IAPService;
import com.aviary.android.feather.sdk.AviaryMainController;
import com.aviary.android.feather.sdk.FeatherActivity;
import java.io.IOException;
import junit.framework.Assert;

public class b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(long l, String s, int k);

        public abstract void a(long l, String s, Purchase purchase);

        public abstract void a(String s, int k);

        public abstract void b(long l, String s, int k);
    }


    static final com.aviary.android.feather.common.a.a.c a;
    com.aviary.android.feather.common.b.b b;
    FeatherActivity c;
    final BroadcastReceiver d = new BroadcastReceiver() {

        final b a;

        public void onReceive(Context context, Intent intent)
        {
            com.aviary.android.feather.sdk.widget.b.a.c("downloadStatusReceiver::onReceive: %s", new Object[] {
                intent
            });
            if (intent != null && a.d())
            {
                context = intent.getStringExtra("packType");
                long l = intent.getLongExtra("packId", -1L);
                int k = intent.getIntExtra("status", -1);
                com.aviary.android.feather.sdk.widget.b.a(a).a(l, context, k);
            }
        }

            
            {
                a = b.this;
                super();
            }
    };
    final BroadcastReceiver e = new BroadcastReceiver() {

        final b a;

        public void onReceive(Context context, Intent intent)
        {
            com.aviary.android.feather.sdk.widget.b.a.c("subscriptionPurchasedReceiver::onReceive: %s", new Object[] {
                intent
            });
            if (intent != null && a.d())
            {
                int k = intent.getIntExtra("purchased", 0);
                context = intent.getStringExtra("identifier");
                com.aviary.android.feather.sdk.widget.b.a(a).a(context, k);
            }
        }

            
            {
                a = b.this;
                super();
            }
    };
    final BroadcastReceiver f = new BroadcastReceiver() {

        final b a;

        public void onReceive(Context context, Intent intent)
        {
            com.aviary.android.feather.sdk.widget.b.a.c("packPurchasedReceiver::onReceive: %s", new Object[] {
                intent
            });
            if (intent != null && a.d())
            {
                context = intent.getStringExtra("packType");
                long l = intent.getLongExtra("packId", -1L);
                intent = (Purchase)intent.getParcelableExtra("purchase");
                com.aviary.android.feather.sdk.widget.b.a(a).a(l, context, intent);
            }
        }

            
            {
                a = b.this;
                super();
            }
    };
    final BroadcastReceiver g = new BroadcastReceiver() {

        final b a;

        public void onReceive(Context context, Intent intent)
        {
            com.aviary.android.feather.sdk.widget.b.a.c("packInstalledReceiver::onReceive: %s", new Object[] {
                intent
            });
            if (intent != null && a.d())
            {
                context = intent.getStringExtra("packType");
                long l = intent.getLongExtra("packId", -1L);
                int k = intent.getIntExtra("purchased", 0);
                com.aviary.android.feather.sdk.widget.b.a(a).b(l, context, k);
            }
        }

            
            {
                a = b.this;
                super();
            }
    };
    final ContentObserver h = new ContentObserver(new Handler()) {

        final b a;

        public void onChange(boolean flag)
        {
            onChange(flag, null);
        }

        public void onChange(boolean flag, Uri uri)
        {
            com.aviary.android.feather.sdk.widget.b.a.b("mServiceFinishedContentObserver::onChange");
            if (a.d())
            {
                com.aviary.android.feather.sdk.widget.b.a(a).a();
            }
        }

            
            {
                a = b.this;
                super(handler);
            }
    };
    private a i;
    private IAPService j;

    public b(a a1)
    {
        i = a1;
    }

    static a a(b b1)
    {
        return b1.i;
    }

    private void a(Purchase purchase, long l, String s, String s1, String s2)
    {
        byte byte0;
        byte0 = 16;
        a.c("onPurchaseSuccess: %s - %s (%s)", new Object[] {
            s, s1, purchase
        });
        if (d()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a(purchase, s2);
        boolean flag = a(l, true);
        if (flag)
        {
            byte0 = -1;
        }
_L4:
        com.aviary.android.feather.cds.h.a(c, l, s1, purchase);
        if (byte0 > -1)
        {
            i.a(l, s1, byte0);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
        s2 = new StringBuilder();
        s2.append(c.getString(com.aviary.android.feather.sdk.R.string.feather_download_start_failed));
        s2.append(".");
        s2.append("\n");
        s2.append("Cause: ");
        s2.append(s.getLocalizedMessage());
        (new android.app.AlertDialog.Builder(c)).setTitle(com.aviary.android.feather.sdk.R.string.feather_iap_download_failed).setMessage(s2.toString()).setPositiveButton(0x1040000, null).create().show();
          goto _L4
    }

    static void a(b b1, Purchase purchase, long l, String s, String s1, String s2)
    {
        b1.a(purchase, l, s, s1, s2);
    }

    public com.aviary.android.feather.cds.h.b a(String s, f f1)
    {
        if (f1 != null)
        {
            if (f1.b(s) != null)
            {
                return new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.d);
            }
            s = f1.a(s);
            if (s != null)
            {
                return new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.a, s.b());
            }
        }
        return new com.aviary.android.feather.cds.h.b(com.aviary.android.feather.cds.h.a.h);
    }

    public void a()
    {
        if (c != null)
        {
            c.registerReceiver(f, new IntentFilter((new StringBuilder()).append(c.getPackageName()).append(".cds.packPurchased").toString()));
            c.registerReceiver(g, new IntentFilter((new StringBuilder()).append(c.getPackageName()).append(".cds.packInstalled").toString()));
            c.registerReceiver(d, new IntentFilter((new StringBuilder()).append(c.getPackageName()).append(".cds.downloadStatusChanged").toString()));
            c.registerReceiver(e, new IntentFilter((new StringBuilder()).append(c.getPackageName()).append(".cds.subscriptionPurchased").toString()));
            c.getContentResolver().registerContentObserver(com.aviary.android.feather.common.utils.f.a(c, "service/finished"), false, h);
        }
    }

    public void a(long l, String s, String s1, String s2, String s3)
    {
        a.c("purchase {%d, %s, %s, %s, %s}", new Object[] {
            Long.valueOf(l), s, s1, s2, s3
        });
        if (!d())
        {
            return;
        }
        if (!j.b_())
        {
            Toast.makeText(c, "There was a problem connecting to the billing service. Please try again.", 0).show();
            j.a(null);
            return;
        }
        s1 = new com.aviary.android.feather.cds.billing.util.d.c(l, s, s1, s3, s2) {

            final long a;
            final String b;
            final String c;
            final String d;
            final String e;
            final b f;

            public void a(e e1, Purchase purchase)
            {
                com.aviary.android.feather.sdk.widget.b.a.b("onIabPurchaseFinished: { result: %s, purchase: %s }", new Object[] {
                    e1, purchase
                });
                if (!f.d())
                {
                    com.aviary.android.feather.sdk.widget.b.a.d("context is no more valid");
                    return;
                }
                if (e1.d())
                {
                    switch (e1.a())
                    {
                    default:
                        Toast.makeText(f.c, e1.b(), 0).show();
                        break;

                    case -1005: 
                        break;
                    }
                } else
                {
                    com.aviary.android.feather.sdk.widget.b.a(f, purchase, a, b, c, d);
                }
                f.b.a(b, e, e1.c());
            }

            
            {
                f = b.this;
                a = l;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                super();
            }
        };
        if (j != null && j.c())
        {
            j.a(s, s1, null);
            b.d(s, s2);
            return;
        } else
        {
            a.d("wrapper disposed or null");
            Toast.makeText(c, com.aviary.android.feather.sdk.R.string.feather_store_connection_problem, 0).show();
            return;
        }
    }

    public void a(long l, String s, String s1, String s2, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3)
    {
        a.c("restore {%d, %s, %s, %s, restore: %b, free: %b, error: %b, subscription: %s}", new Object[] {
            Long.valueOf(l), s, s1, s2, Boolean.valueOf(flag), Boolean.valueOf(flag1), Boolean.valueOf(flag2), Boolean.valueOf(flag3)
        });
        if (d()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        byte byte0;
        if (!flag2)
        {
            if (flag1)
            {
                b.c(s, s2);
            } else
            {
                b.b(s, s2);
            }
            a(s, flag1, flag, flag3);
        }
        byte0 = -1;
        flag = a(l, true);
        if (!flag)
        {
            byte0 = 16;
        }
_L4:
        if (byte0 > -1)
        {
            i.a(l, s1, byte0);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
        s.printStackTrace();
        byte0 = 16;
        s2 = new StringBuilder();
        s2.append(c.getString(com.aviary.android.feather.sdk.R.string.feather_download_start_failed));
        s2.append(".");
        s2.append("\n");
        s2.append("Cause: ");
        s2.append(s.getLocalizedMessage());
        (new android.app.AlertDialog.Builder(c)).setTitle(com.aviary.android.feather.sdk.R.string.feather_iap_download_failed).setMessage(s2.toString()).setPositiveButton(0x1040000, null).create().show();
          goto _L4
    }

    void a(Purchase purchase, String s)
    {
        if (c == null)
        {
            return;
        }
        a.c("sendReceipt{ item: %s, price: %s }", new Object[] {
            purchase, s
        });
        purchase = (new com.aviary.android.feather.a.a.a(false)).a(purchase.c()).a(purchase.d()).b(purchase.b()).c(s).a(true).d(purchase.e());
        try
        {
            purchase = purchase.a();
            com.aviary.android.feather.a.b.a(c).a(purchase);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Purchase purchase)
        {
            purchase.printStackTrace();
        }
    }

    public void a(FeatherActivity featheractivity)
    {
        c = featheractivity;
        b = com.aviary.android.feather.common.b.b.a(c);
        j = (IAPService)featheractivity.A().a(com/aviary/android/feather/library/services/IAPService);
    }

    void a(String s, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3 = true;
        if (c == null)
        {
            return;
        }
        a.c("sendReceipt{ identifier: %s, isFree: %b, isRestore: %b, isSubscription: %b }", new Object[] {
            s, Boolean.valueOf(flag), Boolean.valueOf(flag1), Boolean.valueOf(flag2)
        });
        s = (new com.aviary.android.feather.a.a.a(flag)).a(s);
        if (!flag1)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        s = s.a(flag).a(System.currentTimeMillis());
        if (flag2)
        {
            s.b("subscription");
            s.d("");
            s.c("");
        }
        try
        {
            s = s.a();
            com.aviary.android.feather.a.b.a(c).a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void a(boolean flag, com.aviary.android.feather.cds.billing.util.d.d d1)
    {
        if (d())
        {
            a.c("startSetup: %b", new Object[] {
                Boolean.valueOf(flag)
            });
            if (!j.b_() || flag)
            {
                j.a(d1);
                return;
            }
        }
    }

    boolean a(long l, boolean flag)
        throws AssertionError, IOException
    {
        a.c("requestPackDownload { packId: %d, notify: %b }", new Object[] {
            Long.valueOf(l), Boolean.valueOf(flag)
        });
        if (!d())
        {
            return false;
        }
        Object obj = com.aviary.android.feather.common.utils.f.a(c, (new StringBuilder()).append("pack/id/").append(l).append("/requestDownload/1").toString());
        a.a((new StringBuilder()).append("updating: ").append(obj).toString());
        int k = c.getContentResolver().update(((Uri) (obj)), new ContentValues(), null, null);
        a.a((new StringBuilder()).append("result: ").append(k).toString());
        boolean flag1;
        if (k != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assert.assertTrue("Failed to update the database, please try again later", flag1);
        obj = com.aviary.android.feather.cds.h.a(c, l, flag);
        a.b("requestResult: %s", new Object[] {
            obj
        });
        return true;
    }

    public void b()
    {
        if (c != null)
        {
            c.unregisterReceiver(f);
            c.unregisterReceiver(g);
            c.unregisterReceiver(d);
            c.unregisterReceiver(e);
            c.getContentResolver().unregisterContentObserver(h);
        }
    }

    public void c()
    {
        if (c != null)
        {
            c = null;
            b = null;
            i = null;
        }
    }

    public boolean d()
    {
        return i != null && c != null;
    }

    public boolean e()
    {
        return j.b_();
    }

    public i f()
    {
        return j;
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("AviaryStoreWrapper", com.aviary.android.feather.common.a.a.d.a);
    }
}
