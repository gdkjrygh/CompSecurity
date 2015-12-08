// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.webkit.WebView;
import java.util.Locale;

// Referenced classes of package com.tealium.library:
//            H, s, u

final class a
    implements Runnable
{

    private String a;
    private H b;

    public final void run()
    {
        if (H.f(b).h() != null)
        {
            u.c(String.format(Locale.ROOT, "Leaving trace \"%s\".", new Object[] {
                H.f(b).h()
            }));
            H.a(b).loadUrl("javascript:utag.track('kill_visitor_session', { event: 'kill_visitor_session', 'cp.trace_id' : utag.data['cp.trace_id'] });");
            H.a(b).loadUrl("javascript:document.cookie = 'trace_id=; expires=Thu, 01 Jan 1970 00:00:01 GMT; path=/'");
        }
        u.c(String.format(Locale.ROOT, "Starting trace with id \"%s\".", new Object[] {
            a
        }));
        String s1 = String.format(Locale.ROOT, "javascript:document.cookie = 'trace_id=%s; expires=0; path=/';", new Object[] {
            a
        });
        H.a(b).loadUrl(s1);
        H.f(b).a(b);
        H.a(b).reload();
    }

    (H h, String s1)
    {
        b = h;
        a = s1;
        super();
    }
}
