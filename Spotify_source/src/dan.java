// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.sony.snei.np.android.account.oauth.InstallationStatus;
import com.sony.snei.np.android.account.oauth.InvalidInstanceException;
import com.sony.snei.np.android.account.oauth.MalformedApkException;
import com.sony.snei.np.android.account.oauth.hide.DelegateStateId;
import com.sony.snei.np.android.common.oauth.exception.NpamReasonCodeException;
import com.sony.snei.np.android.common.oauth.exception.OAuthResponseParserException;
import com.sony.snei.np.android.common.oauth.exception.VersaException;
import com.sony.snei.np.android.common.oauth.exception.VersaProtocolException;
import com.sony.snei.np.android.common.oauth.exception.VersaServerException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dan extends daw
{

    public dan(Context context, dba dba)
    {
        super(context, dba);
    }

    static Bundle a(dca dca1, dcg dcg1)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", true);
        bundle.putString("authAccount", dcg1.c);
        bundle.putString("accountType", "com.sony.snei.np.android.account");
        bundle.putString("authtoken", dca1.a);
        bundle.putLong("SRQ", dca1.f.longValue());
        bundle.putString("dfg", dca1.c);
        if (!TextUtils.isEmpty(dca1.g))
        {
            bundle.putString("V4e", dca1.g);
        }
        bundle.putString("pl1", dcg1.b);
        return bundle;
    }

    static Bundle a(Exception exception, Uri uri)
    {
        exception = dbq.a(exception);
        if (daj.a(exception.getInt("9qz")).a)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            exception.putParcelable("intent", intent);
        }
        return exception;
    }

    static dbg a(dan dan1)
    {
        return ((daw) (dan1)).c;
    }

    protected static String a(Bundle bundle)
    {
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        bundle = Uri.parse(bundle.getString("MPc"));
        if (TextUtils.isEmpty(bundle.getFragment()))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        bundle = new dcc(bundle);
_L1:
        dbz.a(bundle, 302);
        boolean flag;
        bundle = bundle.f();
        flag = TextUtils.isEmpty(bundle);
        if (!flag)
        {
            return bundle;
        }
        break MISSING_BLOCK_LABEL_91;
        try
        {
            bundle = new dcd(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            if ((0x80030000 | ((VersaServerException) (bundle)).b) == 0x8003104a)
            {
                throw new OperationCanceledException();
            } else
            {
                throw bundle;
            }
        }
          goto _L1
        throw new VersaProtocolException(302, 2);
        bundle;
        throw new VersaProtocolException(302, bundle);
        throw new OperationCanceledException();
    }

    static void a(dan dan1, String s)
    {
        dan1.e = s;
    }

    static boolean a(VersaException versaexception)
    {
        return b(versaexception);
    }

    static dbg b(dan dan1)
    {
        return ((daw) (dan1)).c;
    }

    private static boolean b(VersaException versaexception)
    {
        boolean flag;
        try
        {
            flag = daj.a(dbq.a(versaexception).getInt("9qz")).a;
        }
        // Misplaced declaration of an exception variable
        catch (VersaException versaexception)
        {
            return false;
        }
        return flag;
    }

    static dbg c(dan dan1)
    {
        return ((daw) (dan1)).c;
    }

    public final AccountManagerFuture a(Activity activity, String s, String s1, String s2, String s3, String s4, AccountManagerCallback accountmanagercallback, 
            Handler handler)
    {
        d();
        String s5 = super.b();
        s1 = new dbu(s, s1, s3, s2);
        s3 = new dch();
        s3.a = s4;
        Object obj = String.valueOf(hashCode());
        dck dck1 = new dck(Uri.parse(String.format("https://auth.api.%ssonyentertainmentnetwork.com/2.0/oauth/authorize", new Object[] {
            dcm.a(s5)
        })));
        java.util.Map.Entry entry;
        for (Iterator iterator = ((dch) (s3)).b.entrySet().iterator(); iterator.hasNext(); ((dcb) (dck1)).a.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        dck1.a("client_id", ((dbu) (s1)).a);
        dck1.a("response_type", "code");
        dck1.a("scope", ((dbu) (s1)).d);
        dck1.a("redirect_uri", ((dbu) (s1)).c);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            dck1.a("state", ((String) (obj)));
        }
        if (!TextUtils.isEmpty(((dch) (s3)).a))
        {
            dck1.a("service_entity", ((dch) (s3)).a);
        }
        obj = ((dcb) (dck1)).a.build();
        return a(((dbl) (new dao(super.a, accountmanagercallback, a(handler), s1, s4, s5, s, s2, s3, activity, ((Uri) (obj))) {

            private dbu a;
            private String d;
            private String e;
            private String f;
            private String g;
            private dch h;
            private Activity i;
            private Uri j;
            private dan k;

            private Bundle a()
            {
_L2:
                if (obj1 == null)
                {
                    if (i == null)
                    {
                        throw new NpamReasonCodeException(0x80f00004);
                    }
                    obj1 = dan.a(a(i, j));
                    obj1 = dcm.a(e, a, h, ((String) (obj2)), ((String) (obj1)));
                }
                try
                {
                    obj2 = dcm.a(e, a, ((dca) (obj1)).a);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    throw new NpamReasonCodeException(((Throwable) (obj1)));
                }
                dan.a(k, ((dcg) (obj2)).b);
                dan.c(k).a(e, ((dcg) (obj2)).b, f, g, d, ((dca) (obj1)).b);
                return dan.a(((dca) (obj1)), ((dcg) (obj2)));
                Object obj1 = dan.a(k).a(e);
                obj1 = dan.b(k).a(e, ((String) (obj1)), f, g, d);
                Object obj2 = ((daw) (k)).d;
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    try
                    {
                        obj1 = dcm.a(e, a, h, ((String) (obj1)));
                        break MISSING_BLOCK_LABEL_75;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        if (!dan.a(((VersaException) (obj1))))
                        {
                            throw obj1;
                        }
                    }
                }
                obj1 = null;
                if (true) goto _L2; else goto _L1
_L1:
            }

            protected final Object a(dar dar1, Exception exception)
            {
                return dan.a(exception, j);
            }

            protected final Object a(dar dar1, Object obj1)
            {
                obj1 = (Bundle)obj1;
                if (((Bundle) (obj1)).getBoolean("booleanResult"))
                {
                    dar1.a(DelegateStateId.b, null);
                }
                return obj1;
            }

            protected final void a(dar dar1)
            {
                dbo.b();
                final class _cls2
                {

                    static final int a[];

                    static 
                    {
                        a = new int[DelegateStateId.values().length];
                        try
                        {
                            a[DelegateStateId.d.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[DelegateStateId.c.ordinal()] = 2;
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

                switch (_cls2.a[dar1.a().ordinal()])
                {
                default:
                    if (!a.a())
                    {
                        throw new IllegalArgumentException();
                    }
                    break;

                case 1: // '\001'
                case 2: // '\002'
                    throw new IllegalStateException(dar1.a().name());
                }
                if (TextUtils.isEmpty(d))
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
                k = dan.this;
                a = dbu1;
                d = s;
                e = s1;
                f = s2;
                g = s3;
                h = dch1;
                i = activity;
                j = uri;
                super(context, accountmanagercallback, handler);
            }
        })));
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
            if (InstallationStatus.a.equals(installationstatus))
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
            return;
        }
    }
}
