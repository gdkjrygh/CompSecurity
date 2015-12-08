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

    private H a;

    public final void run()
    {
        u.c(String.format(Locale.ROOT, "Leaving trace \"%s\".", new Object[] {
            H.f(a).h()
        }));
        H.a(a).loadUrl("javascript:utag.track('kill_visitor_session', { event: 'kill_visitor_session', 'cp.trace_id' : utag.data['cp.trace_id'] });");
        H.a(a).loadUrl("javascript:document.cookie = 'trace_id=; expires=Thu, 01 Jan 1970 00:00:01 GMT; path=/'");
        H.f(a).a(b);
        H.a(a).reload();
    }

    (H h)
    {
        a = h;
        super();
    }
}
