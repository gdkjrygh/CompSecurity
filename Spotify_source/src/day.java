// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.sony.snei.np.android.account.oauth.InstallationStatus;
import com.sony.snei.np.android.account.oauth.InvalidInstanceException;
import com.sony.snei.np.android.account.oauth.MalformedApkException;
import com.sony.snei.np.android.account.oauth.hide.ApiException;
import com.sony.snei.np.android.account.oauth.hide.DelegateStateId;
import java.nio.channels.IllegalSelectorException;

public final class day extends daw
{

    final String f;
    private final BroadcastReceiver g = new BroadcastReceiver() {

        private day a;

        public final void onReceive(Context context1, Intent intent)
        {
            day.a(a, intent);
        }

            
            {
                a = day.this;
                super();
            }
    };

    public day(Context context, String s, dba dba)
    {
        super(context, dba);
        f = s;
        context = new IntentFilter();
        context.addAction("com.sony.snei.np.android.account.action.ACCOUNT_ADDED");
        context.addAction("com.sony.snei.np.android.account.action.ACCOUNT_CHANGED");
        context.addAction("com.sony.snei.np.android.account.action.ACCOUNT_REMOVED");
        super.a.registerReceiver(g, context, "com.sony.snei.np.android.account.permission.ACCOUNT_BROADCAST", null);
    }

    static dbg a(day day1)
    {
        return ((daw) (day1)).c;
    }

    static void a(day day1, Intent intent)
    {
        day1.a(day1. new dbl(intent) {

            private Intent a;
            private day b;

            protected final Object a(dar dar1, Exception exception)
            {
                throw exception;
            }

            protected final Object a(dar dar1, Object obj)
            {
                obj = (Boolean)obj;
                if (((Boolean) (obj)).booleanValue())
                {
                    String s = day.d(b);
                    day.e(b);
                    day.f(b).a();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("qOm", true);
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("pl1", s);
                    bundle.putBundle("D7o", bundle1);
                    dar1.a(DelegateStateId.a, bundle);
                }
                return obj;
            }

            protected final void a(dar dar1)
            {
                final class _cls4
                {

                    static final int a[];

                    static 
                    {
                        a = new int[DelegateStateId.values().length];
                        try
                        {
                            a[DelegateStateId.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[DelegateStateId.d.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[DelegateStateId.a.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls4.a[dar1.a().ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                case 2: // '\002'
                    throw new IllegalSelectorException();
                }
            }

            protected final Object b(dar dar1)
            {
                boolean flag;
                flag = true;
                if (!DelegateStateId.b.equals(dar1.a()))
                {
                    break MISSING_BLOCK_LABEL_62;
                }
                break MISSING_BLOCK_LABEL_15;
                if (!"com.sony.snei.np.android.account.action.ACCOUNT_REMOVED".equals(a.getAction()) && day.c(b).equals(a.getStringExtra("pl1")))
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
                return Boolean.valueOf(false);
            }

            
            {
                b = day.this;
                a = intent;
                super();
            }
        });
    }

    static void a(day day1, String s)
    {
        day1.e = s;
    }

    static dbg b(day day1)
    {
        return ((daw) (day1)).c;
    }

    static String c(day day1)
    {
        return ((daw) (day1)).e;
    }

    static String d(day day1)
    {
        return ((daw) (day1)).e;
    }

    static void e(day day1)
    {
        day1.e = null;
    }

    static dbg f(day day1)
    {
        return ((daw) (day1)).c;
    }

    public final AccountManagerFuture a(Activity activity, String s, String s1, String s2, String s3, String s4, AccountManagerCallback accountmanagercallback, 
            Handler handler)
    {
        d();
        dbu dbu1 = new dbu(s, s1, s3, s2);
        return a(((dbl) (new daz(super.a, accountmanagercallback, a(handler), dbu1, s4, activity, s, s2, s1, s3) {

            private dbu d;
            private String e;
            private Activity f;
            private String g;
            private String h;
            private String i;
            private String j;
            private day k;

            private Bundle a()
            {
                Account aaccount[];
                String s5;
                AccountManager accountmanager;
                Bundle bundle;
                s5 = k.b();
                accountmanager = AccountManager.get(super.a);
                aaccount = accountmanager.getAccountsByType(k.f);
                bundle = new Bundle();
                bundle.putString("Pdw", s5);
                bundle.putBoolean("DIj", true);
                bundle.putString("QVd", e);
                if (aaccount == null) goto _L2; else goto _L1
_L1:
                if (aaccount.length <= 0) goto _L2; else goto _L3
_L3:
                Object obj1 = aaccount[0];
                day day1 = k;
                obj1 = (Bundle)accountmanager.getAuthToken(((Account) (obj1)), (new StringBuilder()).append(day1.f).append(".ACCOUNT_DIGEST").toString(), bundle, null, null, null).getResult();
                a(((Bundle) (obj1)));
                obj1 = ((Bundle) (obj1)).getString("authtoken");
                Object obj;
                Object obj2;
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    obj = aaccount[0];
                } else
                {
                    obj = null;
                }
_L9:
                obj2 = obj;
                if (obj != null)
                {
                    break MISSING_BLOCK_LABEL_234;
                }
                bundle.putBoolean("G6E", true);
                bundle.putBoolean("zqq", true);
                obj = (Bundle)accountmanager.addAccount(k.f, null, null, bundle, f, null, null).getResult();
                a(((Bundle) (obj)));
                obj2 = new Account(((Bundle) (obj)).getString("authAccount"), ((Bundle) (obj)).getString("accountType"));
                obj1 = ((Bundle) (obj)).getString("pl1");
                obj = day.a(k).a(s5, ((String) (obj1)), g, h, e);
                bundle.putString("lFo", g);
                bundle.putString("uRs", i);
                bundle.putString("nzD", j);
                bundle.putString("RLN", h);
                bundle.putString("DRm", ((daw) (k)).d);
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    bundle.putString("adh", ((String) (obj)));
                }
                obj = k;
                obj = (Bundle)accountmanager.getAuthToken(((Account) (obj2)), (new StringBuilder()).append(((day) (obj)).f).append(".ACCESS_TOKEN").toString(), bundle, f, null, null).getResult();
                a(((Bundle) (obj)));
                day.a(k, ((Bundle) (obj)).getString("pl1"));
                obj2 = ((Bundle) (obj)).getString("adh");
                day.b(k).a(s5, ((String) (obj1)), g, h, e, ((String) (obj2)));
_L5:
                return ((Bundle) (obj));
                obj;
                obj2 = f;
                obj1 = dbq.a(((ApiException) (obj)).a);
                obj = obj1;
                if (obj2 != null) goto _L5; else goto _L4
_L4:
                obj = obj1;
                if (!((Bundle) (obj1)).containsKey("intent")) goto _L5; else goto _L6
_L6:
                obj = obj1;
                if (((Bundle) (obj1)).containsKey("9qz")) goto _L5; else goto _L7
_L7:
                ((Bundle) (obj1)).putInt("9qz", 0x80f00004);
                return ((Bundle) (obj1));
_L2:
                obj1 = null;
                obj = null;
                if (true) goto _L9; else goto _L8
_L8:
            }

            protected final Object a(dar dar1, Exception exception)
            {
                return dbq.a(exception);
            }

            protected final Object a(dar dar1, Object obj)
            {
                obj = (Bundle)obj;
                if (((Bundle) (obj)).getBoolean("booleanResult"))
                {
                    dar1.a(DelegateStateId.b, ((Bundle) (obj)));
                }
                return dbq.a(((Bundle) (obj)));
            }

            protected final void a(dar dar1)
            {
                dbo.b();
                switch (_cls4.a[dar1.a().ordinal()])
                {
                default:
                    if (!d.a())
                    {
                        throw new IllegalArgumentException();
                    }
                    break;

                case 1: // '\001'
                case 2: // '\002'
                    throw new IllegalStateException();
                }
                if (TextUtils.isEmpty(e))
                {
                    throw new IllegalArgumentException();
                } else
                {
                    return;
                }
            }

            protected final Object b(dar dar1)
            {
                return a();
            }

            
            {
                k = day.this;
                d = dbu1;
                e = s;
                f = activity;
                g = s1;
                h = s2;
                i = s3;
                j = s4;
                super(context, accountmanagercallback, handler);
            }
        })));
    }

    public final void a()
    {
        if (!DelegateStateId.d.equals(super.b.a()))
        {
            super.a.unregisterReceiver(g);
        }
        super.a();
    }

    public final boolean a(String s)
    {
        return super.a(s);
    }

    public final String b()
    {
        return super.b();
    }

    protected final void c()
    {
        try
        {
            d();
            InstallationStatus installationstatus = dbm.a(super.a);
            if (!InstallationStatus.a.equals(installationstatus))
            {
                super.c.a();
                super.b.a(DelegateStateId.c, null);
                a();
            }
            return;
        }
        catch (InvalidInstanceException invalidinstanceexception)
        {
            return;
        }
        catch (MalformedApkException malformedapkexception)
        {
            super.c.a();
        }
        super.b.a(DelegateStateId.c, null);
        a();
    }
}
