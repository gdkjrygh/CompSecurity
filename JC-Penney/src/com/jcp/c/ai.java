// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.e.ak;
import com.jcp.e.w;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.searchentity.SearchSuggestionsEntityContainer;
import com.jcp.util.aa;

// Referenced classes of package com.jcp.c:
//            b

public class ai extends com.jcp.c.b
    implements w
{

    public ai(Context context)
    {
        a(context);
    }

    public void a(ak ak1)
    {
        a(((com.jcp.e.f) (ak1)));
    }

    public void a(Response response)
    {
        if (response != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        j = response.getReJcpRequestTypes();
        i = response.getStatusCode();
        Object obj = response.getResponseBody();
        if (!b.a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (SearchSuggestionsEntityContainer)aa.a(((String) (obj)), com/jcp/searchentity/SearchSuggestionsEntityContainer);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((SearchSuggestionsEntityContainer) (obj)).getCount();
        ((SearchSuggestionsEntityContainer) (obj)).getSearchTerm();
        if (((SearchSuggestionsEntityContainer) (obj)).getSuggestions().length <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c() != null)
        {
            ((ak)c()).a(((SearchSuggestionsEntityContainer) (obj)), j);
        }
        i = 0;
_L4:
        if (i && c() != null)
        {
            ((ak)c()).b(response.getResponseBody(), j);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        i = 1;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(String s)
    {
        s = com.jcp.b.b.o(s);
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(true);
        c1.a(44);
        c1.b(0);
        c1.execute(new String[0]);
    }
}
