// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

public final class iqv
    implements nab
{

    private final Context a;
    private String b;
    private String c;

    public iqv(Context context)
    {
        a = context;
    }

    public final nac a(Intent intent)
    {
        if (intent.getData() == null)
        {
            return null;
        }
        intent = intent.getData();
        List list = intent.getPathSegments();
        if (list.size() == 4)
        {
            b = (String)list.get(3);
        } else
        if (list.size() == 3)
        {
            b = (String)list.get(2);
        } else
        if (list.size() == 2)
        {
            b = (String)list.get(1);
        }
        c = intent.getQueryParameter("key");
        if (b != null)
        {
            return new iqw(a, b, c);
        } else
        {
            return null;
        }
    }
}
