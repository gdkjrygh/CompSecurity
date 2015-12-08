// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.token;

import android.text.TextUtils;
import android.util.Base64;
import com.skype.Account;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.Charsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.skype.android.app.token:
//            SkypeTokenRequest

protected class expirationMillis
{

    private static final long ELBOW_ROOM = 0x1d4c0L;
    private static final long FIVE_MINUTES_IN_SECONDS = 300L;
    private static final long TWENTYFOUR_HOURS_IN_SECONDS = 0x15180L;
    private Account accountForToken;
    private long expirationMillis;
    final SkypeTokenRequest this$0;
    private String token;

    private long nowInSecondsPlus(long l)
    {
        return System.currentTimeMillis() / 1000L + l;
    }

    private long parseExpiration(String s)
    {
        long l1 = nowInSecondsPlus(0x15180L);
        s = s.split("\\.");
        long l = l1;
        if (s.length > 1)
        {
            try
            {
                s = (JSONObject)(new JSONTokener(new String(Base64.decode(s[1], 0), Charsets.a))).nextValue();
                l = s.getLong("iat");
                l = nowInSecondsPlus(s.getLong("exp") - l);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SkypeTokenRequest.access$000().info((new StringBuilder("Unable to determine token expiration:")).append(s.getMessage()).toString());
                return l1;
            }
        }
        return l;
    }

    private void reportExpiration()
    {
        Date date = new Date(expirationMillis);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy:MM:dd(HH:mm:ss)");
        SkypeTokenRequest.access$000().info((new StringBuilder("New cached Skype Token expires at: ")).append(simpledateformat.format(date)).toString());
    }

    protected String getToken()
    {
        if (!hasValidToken())
        {
            token = null;
        }
        return token;
    }

    protected boolean hasValidToken()
    {
        boolean flag;
        boolean flag1;
        if (System.currentTimeMillis() < expirationMillis)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (accountProvider.get() == accountForToken)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

    public void setToken(String s, long l)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
_L4:
        expirationMillis = 1000L * l1 - 0x1d4c0L;
        reportExpiration();
        accountForToken = accountProvider.get();
        token = s;
        return;
_L2:
        l1 = l;
        if (l <= 0L)
        {
            l1 = parseExpiration(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected ()
    {
        this$0 = SkypeTokenRequest.this;
        super();
        expirationMillis = -1L;
    }
}
