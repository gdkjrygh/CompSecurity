// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class djn
    implements drx
{

    private String a;
    private String b;

    djn(djm djm, String s, String s1)
    {
        a = s;
        b = s1;
        super();
    }

    public final erm a(erm erm1)
    {
        if (!TextUtils.isEmpty(a))
        {
            Object obj = Collections.singletonList(a);
            erm1.n = false;
            erm1.b(b.b("media_key", ((List) (obj)).size()));
            String s1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); erm1.d.add(s1))
            {
                s1 = (String)((Iterator) (obj)).next();
            }

        } else
        {
            String s = b;
            erm1.n = false;
            erm1.b("content_uri = ?");
            erm1.d.add(s);
        }
        return erm1;
    }
}
