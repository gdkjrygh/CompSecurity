// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.http.WebgateTokenManager;
import com.spotify.mobile.android.util.logging.Logger;

public final class dmu
    implements grl
{

    private final WebgateTokenManager a;

    public dmu(WebgateTokenManager webgatetokenmanager)
    {
        a = webgatetokenmanager;
    }

    private static grt a(grm grm1, grq grq1, String s)
    {
        return grm1.a(grq1.c().b("Authorization", (new StringBuilder("Bearer ")).append(s).toString()).b());
    }

    public final grt a(grm grm1)
    {
        grq grq1 = grm1.a();
        if (dmw.a(grq1)) goto _L2; else goto _L1
_L1:
        Object obj = grm1.a(grq1);
_L4:
        return ((grt) (obj));
_L2:
        Object obj1;
        WebgateTokenManager webgatetokenmanager;
        try
        {
            webgatetokenmanager = a;
            obj = webgatetokenmanager.a.a(webgatetokenmanager.d);
            if (!((gin) (obj)).f(WebgateTokenManager.b) || !((gin) (obj)).f(WebgateTokenManager.c) || gcf.b() > ((gin) (obj)).a(WebgateTokenManager.c, 0L))
            {
                break MISSING_BLOCK_LABEL_152;
            }
            obj = ((gin) (obj)).c(WebgateTokenManager.b);
        }
        // Misplaced declaration of an exception variable
        catch (grm grm1)
        {
            Logger.c("Could not retrieve access token for webgate request", new Object[] {
                grm1
            });
            return (new gru()).a(503).a();
        }
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj1 = webgatetokenmanager.a();
        obj1 = a(grm1, grq1, ((String) (obj1)));
        obj = obj1;
        if (((grt) (obj1)).a() != 401) goto _L4; else goto _L3
_L3:
        if (((grt) (obj1)).e() != null)
        {
            ((grt) (obj1)).e().close();
        }
        grm1 = a(grm1, grq1, a.a());
        return grm1;
        obj = null;
        break MISSING_BLOCK_LABEL_90;
    }
}
