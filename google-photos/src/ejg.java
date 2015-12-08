// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

public class ejg
{

    private final Context a;
    private final noz b;

    public ejg(Context context)
    {
        a = context;
        b = noz.a(context, 3, "RemoteMediaProviderUtil", new String[0]);
    }

    public final Uri a(eiz eiz1)
    {
        Object obj = new few(eiz1.b, eiz1.a());
        obj = mtj.b(a, ((mtf) (obj)));
        if (obj == null || ((mue) (obj)).c())
        {
            if (b.a())
            {
                noy.a("identifier", eiz1);
            }
            return null;
        }
        String s = ((mue) (obj)).a().getString("downloadUrl");
        if (TextUtils.isEmpty(s))
        {
            if (b.a())
            {
                noy.a("identifier", eiz1);
            }
            return null;
        }
        obj = s;
        if (eiz1.e == ejm.d)
        {
            obj = nkj.a(s, 0x30000);
        }
        return Uri.parse(((String) (obj)));
    }

    public final ekp a(eiz eiz1, ekk ekk)
    {
        Object obj = Collections.singletonList(eiz1.a());
        obj = new dmb(eiz1.b, ((List) (obj)));
        ekv ekv1 = b.a(a, ((ekq) (obj)));
        try
        {
            ekk = (List)ekv1.a(((ekq) (obj)), ekw.a, ekk).a();
        }
        // Misplaced declaration of an exception variable
        catch (ekk ekk)
        {
            if (b.a())
            {
                noy.a("identifier", eiz1);
            }
            return null;
        }
        return (ekp)ekk.get(0);
    }
}
