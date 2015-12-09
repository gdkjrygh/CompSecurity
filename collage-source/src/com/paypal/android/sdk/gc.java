// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            do, fu, dx, dw

public final class gc extends do
{

    private final boolean c;
    private final int d;

    public gc(dx dx, int i, boolean flag, int j)
    {
        super(i, dx);
        c = flag;
        d = j;
    }

    protected final String a()
    {
        int j = d;
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",\n");
            }
            String s = (new String(new char[4])).replace("\0", (new StringBuilder()).append(i).toString()).substring(0, 4);
            stringbuilder.append(String.format(Locale.US, "    {\n        \"type\":\"sms_otp\",\n        \"token_identifier\":\"mock_token_id_%s\",\n        \"token_identifier_display\":\"xxx-xxx-%s\"\n    }\n", new Object[] {
                Integer.valueOf(i), s
            }));
        }

        return String.format(Locale.US, "{\n    \"nonce\":\"mock-login-nonce\",\n    \"error\":\"2fa_required\",\n    \"error_description\":\"Unable to authenticate the user. 2fa flow completion is necessary for successful login.\",\n    \"visitor_id\":\"mock-visitor_id\",\n    \"2fa_enabled\":\"true\",\n    \"2fa_token_identifier\":[\n%s    ]\n}", new Object[] {
            stringbuilder.toString()
        });
    }

    protected final int b()
    {
        return 401;
    }

    protected final boolean c(dw dw)
    {
        return c && (dw instanceof fu) && !((fu)dw).u();
    }
}
