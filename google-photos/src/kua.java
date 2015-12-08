// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

final class kua
    implements kuf
{

    kua()
    {
    }

    public final void a(kxu kxu1, Map map)
    {
        Uri uri;
        String s;
        map = (String)map.get("u");
        if (map == null)
        {
            b.m("URL missing from click GMSG.");
            return;
        }
        s = jqc.c().a(kxu1.getContext(), map, kxu1.s());
        uri = Uri.parse(s);
        ksq ksq1 = kxu1.l();
        map = uri;
        if (ksq1 != null)
        {
            map = uri;
            try
            {
                if (ksq1.a(uri))
                {
                    map = ksq1.a(uri, kxu1.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                b.m((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
                map = uri;
            }
        }
        map = map.toString();
        kwv.a(((kwr) (new kxq(kxu1.getContext(), kxu1.m().b, map))).c);
        return;
    }
}
