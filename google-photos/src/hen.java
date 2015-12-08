// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

final class hen
    implements ejq
{

    private hek a;

    hen(hek hek1)
    {
        a = hek1;
        super();
    }

    public final void a()
    {
        Toast.makeText(hek.c(a), b.vC, 1).show();
        hek.b(a).c();
        a.O_().finish();
    }

    public final void a(int i, int j)
    {
        double d = (double)i / (double)j;
        hek.b(a).a(a.a(b.vD, new Object[] {
            Integer.valueOf(j - i)
        })).a(false).a(d);
    }

    public final void a(List list)
    {
        hek.b(a).c();
        hek hek1 = a;
        Intent intent = new Intent();
        intent.setData((Uri)list.get(0));
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            hfc hfc1 = new hfc();
            hfc1.a.addAll(list);
            intent.setClipData(hfc1.a());
        }
        intent.addFlags(1);
        hek1.O_().setResult(-1, intent);
        hek1.O_().finish();
    }
}
