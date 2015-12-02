// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.qihoo.security.dialog.AbsDialogActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo.utils.notice.a;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.qihoo.security.v5:
//            c, UpdateHelper, d, UpdateDownloadUIService, 
//            MobileConnectWarningDialog

public class UpdatedDialog extends AbsDialogActivity
{

    private Context c;
    private boolean d;
    private int e;
    private int f;
    private final BroadcastReceiver g = new BroadcastReceiver() {

        final UpdatedDialog a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null && "com.qihoo.security.action.ACTION_DISMISS_UPDATED_DIALOG".equals(intent.getAction()))
            {
                a.finish();
            }
        }

            
            {
                a = UpdatedDialog.this;
                super();
            }
    };

    public UpdatedDialog()
    {
        d = false;
        e = 0;
    }

    static Context a(UpdatedDialog updateddialog)
    {
        return updateddialog.c;
    }

    static int b(UpdatedDialog updateddialog)
    {
        return updateddialog.f;
    }

    public static boolean b(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    private boolean c()
    {
        if (!o.a(getApplicationContext(), "com.android.vending") || !o.d(getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        Intent intent;
        intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "market://details?id=%s", new Object[] {
            "com.qihoo.security.lite"
        })));
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        intent.addFlags(0x10008000);
_L1:
        intent.setPackage("com.android.vending");
        com.qihoo.security.v5.c.a(getApplicationContext());
        startActivity(intent);
        return true;
        intent.addFlags(0x10000000);
          goto _L1
        Exception exception;
        exception;
        return false;
    }

    static boolean c(UpdatedDialog updateddialog)
    {
        return updateddialog.d;
    }

    protected View a()
    {
        return null;
    }

    public void onBackPressed()
    {
        if (!d)
        {
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (com.qihoo.security.v5.UpdateHelper.a)
        {
            finish();
            return;
        }
        bundle = getIntent().getExtras();
        if (bundle == null)
        {
            finish();
            return;
        }
        if (bundle.getBoolean("FromNotify", false))
        {
            Object obj = bundle.getString("path");
            if (obj != null)
            {
                obj = new File(((String) (obj)));
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.fromFile(((File) (obj))), "application/vnd.android.package-archive");
                intent.setFlags(0x10000000);
                startActivity(intent);
                finish();
            }
            com.qihoo.security.support.b.b(27016);
        }
        e = bundle.getInt("UPDATE_TYPE", 0);
        f = bundle.getInt("type");
        c = getApplicationContext();
        Object obj1 = new IntentFilter();
        ((IntentFilter) (obj1)).addAction("com.qihoo.security.action.ACTION_DISMISS_UPDATED_DIALOG");
        registerReceiver(g, ((IntentFilter) (obj1)), "com.qihoo.security.lite.PERMISSION", null);
        if ("com.qihoo.security.action.ACTION_SHOW_NEW_VERSION_DIALOG".equals(getIntent().getAction()))
        {
            com.qihoo.utils.notice.a.a().b(4105);
        }
        Object obj2;
        boolean flag;
        boolean flag1;
        switch (e)
        {
        default:
            return;

        case 0: // '\0'
            com.qihoo.security.support.b.b(27007);
            setDialogTitle(0x7f0c017f);
            setDialogMessage(String.format(b.a(0x7f0c01bf), new Object[] {
                b.a(0x7f0c01d2)
            }));
            setButtonText(new int[] {
                0x7f0c0156
            });
            setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final UpdatedDialog a;

                    public void onClick(View view)
                    {
                        a.finish();
                    }

            
            {
                a = UpdatedDialog.this;
                super();
            }
                }
            });
            return;

        case 2: // '\002'
            bundle = SharedPref.b(c);
            setDialogTitle(0x7f0c01ba);
            setDialogMessage(b.a(0x7f0c0180, new Object[] {
                bundle
            }));
            setButtonText(new int[] {
                0x7f0c0156
            });
            com.qihoo.security.support.b.b(27002);
            setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final UpdatedDialog a;

                    public void onClick(View view)
                    {
                        a.finish();
                    }

            
            {
                a = UpdatedDialog.this;
                super();
            }
                }
            });
            return;

        case 1: // '\001'
            obj2 = com.qihoo.security.v5.d.a(bundle);
            flag1 = ((com.qihoo.security.v5.d) (obj2)).a();
            d = ((com.qihoo.security.v5.d) (obj2)).e;
            flag = d;
            break;
        }
        if (bundle.containsKey("uiforce"))
        {
            flag = bundle.getBoolean("uiforce");
        }
        obj1 = ((com.qihoo.security.v5.d) (obj2)).d;
        String s = SharedPref.b(c);
        obj2 = ((com.qihoo.security.v5.d) (obj2)).c;
        setDialogTitle(0x7f0c017f);
        if (d)
        {
            if (obj1 == null)
            {
                bundle = b.a(0x7f0c0182, new Object[] {
                    obj2
                });
            } else
            {
                bundle = (new StringBuilder()).append(b.a(0x7f0c0183)).append(((String) (obj1))).toString();
            }
            setDialogMessage(bundle);
        } else
        {
            bundle = ((Bundle) (obj1));
            if (obj1 == null)
            {
                bundle = b.a(0x7f0c0181, new Object[] {
                    s, obj2
                });
            }
            setDialogMessage(bundle);
            if (f == 0 && !com.qihoo360.common.e.b.a(getApplicationContext()))
            {
                q.a().a(0x7f0c00c5);
                finish();
                return;
            }
            if (c())
            {
                com.qihoo.security.support.b.b(27008);
                finish();
                return;
            }
        }
        setButtonText(new int[] {
            0x7f0c0184, 0x7f0c014f
        });
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(flag, flag1) {

                final boolean a;
                final boolean b;
                final UpdatedDialog c;

                public void onClick(View view)
                {
                    boolean flag2 = com.qihoo.security.v5.UpdatedDialog.b(com.qihoo360.common.e.b.c(c.getApplicationContext()));
                    com.qihoo.security.support.b.b(27010);
                    if (!flag2)
                    {
                        view = new Intent(com.qihoo.security.v5.UpdatedDialog.a(c), com/qihoo/security/v5/UpdateDownloadUIService);
                        view.putExtra("uiforce", a);
                        view.putExtra("ispatch", b);
                        view.putExtra("type", com.qihoo.security.v5.UpdatedDialog.b(c));
                        c.startService(view);
                        c.finish();
                        return;
                    } else
                    {
                        view = new Intent(com.qihoo.security.v5.UpdatedDialog.a(c), com/qihoo/security/v5/MobileConnectWarningDialog);
                        view.putExtra("uiforce", a);
                        view.putExtra("ispatch", b);
                        view.putExtra("type", com.qihoo.security.v5.UpdatedDialog.b(c));
                        c.startActivity(view);
                        c.finish();
                        com.qihoo.security.support.b.b(27011);
                        return;
                    }
                }

            
            {
                c = UpdatedDialog.this;
                a = flag;
                b = flag1;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final UpdatedDialog a;

                public void onClick(View view)
                {
                    com.qihoo.security.v5.c.a(com.qihoo.security.v5.UpdatedDialog.a(a));
                    if (UpdatedDialog.c(a))
                    {
                        com.qihoo360.mobilesafe.b.a.e(com.qihoo.security.v5.UpdatedDialog.a(a));
                    }
                    a.finish();
                }

            
            {
                a = UpdatedDialog.this;
                super();
            }
            }
        });
        com.qihoo.security.support.b.b(27009);
    }

    public void onDestroy()
    {
        try
        {
            unregisterReceiver(g);
        }
        catch (Exception exception)
        {
            Log.e("V5UpdatedDialog", "[unregisterReceiver]", exception);
        }
        super.onDestroy();
    }
}
