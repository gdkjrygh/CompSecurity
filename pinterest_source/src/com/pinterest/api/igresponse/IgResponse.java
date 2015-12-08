// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.pinterest.api.ApiResponse;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.util.List;

// Referenced classes of package com.pinterest.api.igresponse:
//            Nag, DeveloperError, SearchNag

public abstract class IgResponse
{

    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public List i;
    public SearchNag j;
    public DeveloperError k;

    public IgResponse()
    {
    }

    public abstract void a();

    public final void a(ApiResponse apiresponse)
    {
        int l = 0;
        apiresponse.setStatus(c);
        apiresponse.setCode(d);
        apiresponse.setBookmark(e);
        apiresponse.setGeneratedAt(f);
        apiresponse.setMessage(g);
        apiresponse.setMessageDetail(h);
        if (i != null && i.size() > 0)
        {
            PinterestJsonArray pinterestjsonarray = new PinterestJsonArray();
            PinterestJsonObject pinterestjsonobject1 = new PinterestJsonObject();
            pinterestjsonobject1.b("nag_type", ((Nag)i.get(0)).a);
            pinterestjsonarray.a(pinterestjsonobject1);
            apiresponse.setNags(pinterestjsonarray);
        }
        if (k != null)
        {
            PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
            pinterestjsonobject.b("message", k.a);
            apiresponse.setDeveloperError(pinterestjsonobject);
        }
        String s;
        String s1;
        int i1;
        try
        {
            if (j == null || j.a == null)
            {
                break MISSING_BLOCK_LABEL_305;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse)
        {
            CrashReporting.a(apiresponse);
            return;
        }
        s = "";
        s1 = s;
        if (j.a.b == null) goto _L2; else goto _L1
_L1:
        i1 = j.a.b.size();
_L3:
        s1 = s;
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        s1 = (new StringBuilder()).append(s).append("<br/><br/>").toString();
        s = (new StringBuilder()).append(s1).append((String)j.a.b.get(l)).toString();
        l++;
        if (true) goto _L3; else goto _L2
_L2:
        apiresponse.setNagMessage(s1);
        apiresponse.setNagTheme(j.a.c);
    }

    public abstract void b();

    public ApiResponse c()
    {
        ApiResponse apiresponse = new ApiResponse();
        a(apiresponse);
        return apiresponse;
    }
}
