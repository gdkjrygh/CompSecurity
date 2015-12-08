// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.net.Uri;

// Referenced classes of package com.google.android.apps.wallet.api:
//            UriRegistry

static final class uri
{

    final String pattern;
    final Uri uri;

    final String toFormat()
    {
        return pattern.replaceAll("\\{[^\\}]*\\}", "%s");
    }

    (String s)
    {
        this("comgooglewallet", "", s);
    }

    private <init>(String s, String s1, String s2)
    {
        s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length())).append(s).append("://").append(s1).toString());
        s1 = String.valueOf(s2);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        pattern = s;
        uri = Uri.parse(pattern);
        UriRegistry.validate(uri);
    }
}
