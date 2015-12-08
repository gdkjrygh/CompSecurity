// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.List;

public class gwd
{

    private static final ekk a = (new ekm()).b(hpe).a();
    private final Context b;
    private final gwe c;
    private final fuh d;
    private final noz e;

    gwd(Context context)
    {
        b = context;
        c = (gwe)olm.a(context, gwe);
        d = (fuh)olm.a(context, fuh);
        e = noz.a(context, "ServerSaveExecutor", new String[0]);
    }

    private hpk a(ekq ekq1, ekp ekp1)
    {
        ekp1 = (hpg)ekp1.a(hpg);
        try
        {
            ekq1 = (hpe)((ekq)b.b(b, ekq1).a(ekq1, a).a()).b(hpe);
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq1)
        {
            throw new gwh("Failed to load ResolvedMediaCollectionFeature for the mediaCollection", ekq1);
        }
        if (ekq1 != null)
        {
            ekq1 = ((hpe) (ekq1)).a.a;
        } else
        {
            ekq1 = null;
        }
        if (ekq1 != null)
        {
            return ekp1.a(ekq1);
        } else
        {
            return ekp1.b();
        }
    }

    private String a(int i, Uri uri, ekp ekp1, ekq ekq1)
    {
        String s;
        nnd nnd1;
        long l;
        try
        {
            ekq1 = (hpe)((ekq)b.b(b, ekq1).a(ekq1, a).a()).b(hpe);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new gwh("Failed to retrieve collection album id", uri);
        }
        if (ekq1 != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        ekq1 = "instant";
        s = ((fzu)ekp1.a(fzu)).a.g;
        l = ekp1.d();
        ekp1 = (new nmr(c.a)).a(i).a();
        try
        {
            nnd1 = new nnd();
            nnd1.a = uri;
            nnd1.d = ekq1;
            nnd1.f = true;
            nnd1.b = s;
            nnd1.e = l + 5L;
            nnd1.c = "image/jpeg";
            uri = ekp1.a(nnd1.a());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new gwh("Failed to upload media", uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new gwh("Failed to upload media", uri);
        }
        return ((nmo) (uri)).b;
        ekq1 = Long.toString(((hpe) (ekq1)).a.b.longValue());
        break MISSING_BLOCK_LABEL_48;
    }

    private qor a(int i, String s, qor qor1)
    {
        pnp pnp1 = new pnp();
        pnp1.a = qor1;
        s = new gvr(b, i, s, pnp1);
        s.d();
        if (s.l())
        {
            if (e.a())
            {
                noy.a("errorCode", Integer.valueOf(((nxx) (s)).l));
                noy.a("reason", ((nxx) (s)).m);
            }
            if (((nxx) (s)).l == 0)
            {
                throw new gwh("Connection timeout on the client while uploading photos edit list");
            }
        }
        return ((gvr) (s)).a.a;
    }

    private static byte[] a(qor qor1, qor qor2)
    {
        qor2.a = qor1.a;
        return qlw.a(qor2);
    }

    public final gwf a(gue gue1)
    {
        byte abyte0[];
        qor qor1;
        byte abyte1[];
        Object obj;
        ekq ekq1;
        ekp ekp1;
        boolean flag;
        int j;
        flag = false;
        j = gue1.a;
        abyte1 = gue1.f;
        try
        {
            qor1 = (qor)qlw.a(new qor(), abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (gue gue1)
        {
            throw new gwh("Failed to create editlist proto", gue1);
        }
        ekq1 = gue1.b;
        ekp1 = gue1.c;
        obj = a(ekq1, ekp1);
        abyte0 = ((hpk) (obj)).c;
        if (!((hpk) (obj)).a()) goto _L2; else goto _L1
_L1:
        int i;
        if (gue1.h == gvl.a)
        {
            gue1 = ((hpk) (obj)).c;
            abyte0 = ((hpk) (obj)).d;
            obj = new gvq(b, j);
            obj.c = abyte0;
            obj.d = gue1;
            obj.e = qor1;
            p.a(((gvq) (obj)).d, "photoMediaKey must be set.");
            gue1 = new gvp(((gvq) (obj)));
            gue1.d();
            if (gue1.l())
            {
                if (e.a())
                {
                    noy.a("errorCode", Integer.valueOf(((nxx) (gue1)).l));
                    noy.a("reason", ((nxx) (gue1)).m);
                }
                throw new gwh("Failed to fork photo with updated edit list");
            } else
            {
                gue1 = (String)((gvp) (gue1)).a.get(0);
                return new gwf(gwg.a, gue1, abyte1);
            }
        }
        gue1 = abyte0;
          goto _L3
_L2:
label0:
        {
            gue1 = gue1.d;
            try
            {
                if (d.a(j, ((hpk) (obj))))
                {
                    break label0;
                }
                gue1 = new gwf(gwg.d);
            }
            // Misplaced declaration of an exception variable
            catch (gue gue1)
            {
                throw new gwh("Failed to figure out autoupload status", gue1);
            }
            return gue1;
        }
        gue1 = a(j, ((Uri) (gue1)), ekp1, ekq1);
        flag = true;
_L5:
        qor1.a = a(j, ((hpk) (obj)).c, qor1).a;
        abyte0 = qlw.a(qor1);
        if (flag)
        {
            i = gwg.b;
        } else
        {
            i = gwg.c;
        }
        return new gwf(i, gue1, abyte0);
_L3:
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final byte[] a(ekp ekp1, gue gue1, gum gum1)
    {
        ekq ekq1 = gue1.b;
        hpk hpk1 = a(ekq1, ekp1);
        int i = gue1.a;
        String s = hpk1.c;
        if (!hpk1.a())
        {
            ekp1 = a(i, gum1.b, ekp1, ekq1);
        } else
        {
            ekp1 = s;
        }
        gum1 = gum1.g;
        try
        {
            gum1 = (qor)qlw.a(new qor(), gum1);
        }
        // Misplaced declaration of an exception variable
        catch (ekp ekp1)
        {
            throw new gwh("Failed to create editlist proto", ekp1);
        }
        if (gue1.h == gvl.a)
        {
            gum1.a = Long.valueOf(1L);
        }
        return a(a(i, ((String) (ekp1)), ((qor) (gum1))), ((qor) (gum1)));
    }

    public final byte[] a(gum gum1, gum gum2)
    {
        try
        {
            gum1 = (qor)qlw.a(new qor(), gum1.g);
            gum2 = (qor)qlw.a(new qor(), gum2.g);
        }
        // Misplaced declaration of an exception variable
        catch (gum gum1)
        {
            throw new gwh("Failed to create editlist proto", gum1);
        }
        return a(((qor) (gum1)), ((qor) (gum2)));
    }

}
