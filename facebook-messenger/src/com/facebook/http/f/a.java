// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.f;

import android.content.Context;
import android.preference.CheckBoxPreference;
import com.facebook.o;
import com.facebook.prefs.shared.ae;

// Referenced classes of package com.facebook.http.f:
//            c

public class a extends CheckBoxPreference
{

    public a(Context context)
    {
        super(context);
        setKey(c.f.a());
        setDefaultValue(Boolean.valueOf(true));
        setTitle(o.debug_ssl_cert_check_title);
        setSummary(o.debug_ssl_cert_check_summary);
    }
}
