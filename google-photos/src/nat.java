// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

final class nat
    implements nug
{

    private final Context a;
    private final mmv b;
    private final nym c;
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();

    nat(Context context, mmv mmv1, nym nym1, nam nam1)
    {
        a = context;
        b = mmv1;
        c = nym1;
        nam1.a().a(this, false);
    }

    private boolean a(nyn nyn1)
    {
        Iterator iterator;
        boolean flag;
        iterator = b.a(new String[] {
            "logged_in"
        }).iterator();
        flag = true;
_L2:
        int i;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((Integer)iterator.next()).intValue();
        String s = b.a(i).b("account_name");
        nyn1.b(a, s);
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
_L3:
        if (Log.isLoggable("OauthFactory", 6))
        {
            String s1 = String.valueOf("Failed to invalidate auth token, accountId: ");
            Log.e("OauthFactory", (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i).toString(), ((Throwable) (obj)));
        }
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("OauthFactory", 3))
        {
            nyn1 = String.valueOf("Invalidated auth tokens, success: ");
            (new StringBuilder(String.valueOf(nyn1).length() + 5)).append(nyn1).append(flag);
        }
        return flag;
        obj;
          goto _L3
        obj;
          goto _L3
    }

    final Map a(int i)
    {
        Object obj = c.a("oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
        this;
        JVM INSTR monitorenter ;
        if (d.get() != e.get())
        {
            d.set(e.get());
            a(((nyn) (obj)));
        }
        this;
        JVM INSTR monitorexit ;
        Object obj2;
        boolean flag;
        mmx mmx1 = b.a(i);
        obj2 = ((nyn) (obj)).a(a, mmx1.b("account_name"));
        flag = TextUtils.isEmpty(((CharSequence) (obj2)));
        if (!flag) goto _L2; else goto _L1
_L1:
        obj2 = null;
_L4:
        return ((Map) (obj2));
        obj;
        this;
        JVM INSTR monitorexit ;
        Object obj1;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = null;
        }
_L7:
        obj2 = obj1;
        if (!Log.isLoggable("OauthFactory", 6)) goto _L4; else goto _L3
_L3:
        Log.e("OauthFactory", "Cannot obtain authentication token", ((Throwable) (obj)));
        return ((Map) (obj1));
_L2:
        obj1 = ((nyn) (obj)).c(a, ((String) (obj2)));
        if (obj1 == null)
        {
            return null;
        }
        obj = String.valueOf(obj2);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        obj = "Bearer ".concat(((String) (obj)));
_L6:
        obj2 = Long.toString(((Long) (obj1)).longValue());
        obj1 = new HashMap();
        ((Map) (obj1)).put("Authorization", obj);
        ((Map) (obj1)).put("X-Auth-Time", obj2);
        obj2 = obj1;
        if (!Log.isLoggable("OauthFactory", 3)) goto _L4; else goto _L5
_L5:
        obj = String.valueOf("Built auth headers, accountId: ");
        (new StringBuilder(String.valueOf(obj).length() + 11)).append(((String) (obj))).append(i);
        return ((Map) (obj1));
        obj;
        break MISSING_BLOCK_LABEL_106;
        obj = new String("Bearer ");
          goto _L6
        obj;
        break MISSING_BLOCK_LABEL_106;
        obj;
          goto _L7
    }

    public final void b_(Object obj)
    {
        e.incrementAndGet();
    }
}
