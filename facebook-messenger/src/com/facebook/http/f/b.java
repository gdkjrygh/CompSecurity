// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.f;

import android.content.Context;
import android.widget.EditText;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.widget.c.a;

// Referenced classes of package com.facebook.http.f:
//            c

public class b extends a
{

    public b(Context context)
    {
        super(context);
        setKey(c.g.a());
        setTitle(o.debug_http_proxy_title);
        a(getContext().getString(o.debug_http_proxy_summary));
        setDialogTitle(o.debug_http_proxy_dialog_title);
        getEditText().setHint(o.debug_http_proxy_hint);
        getEditText().setSingleLine(true);
        getEditText().setInputType(1);
    }
}
