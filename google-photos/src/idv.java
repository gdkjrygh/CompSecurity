// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcelable;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

final class idv
    implements ejq
{

    private idu a;

    idv(idu idu1)
    {
        a = idu1;
        super();
    }

    public final void a()
    {
        idu.a(a).c();
        Toast.makeText(idu.f(a), b.yM, 1).show();
    }

    public final void a(int i, int j)
    {
        idu.a(a, i, j, idu.e(a).getString(b.yR, new Object[] {
            Integer.valueOf(j - i)
        }));
    }

    public final void a(List list)
    {
        idu.a(a).c();
        ief ief1 = idu.d(a);
        ifc ifc1 = idu.b(a);
        boolean flag1 = idu.c(a);
        p.a(ifc1.b(), "targetIntents must allow shareMedia");
        Intent intent;
        ArrayList arraylist;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "contentUris cannot be empty");
        intent = ifc1.c;
        arraylist = new ArrayList(list);
        if (list.size() == 1)
        {
            intent.putExtra("android.intent.extra.STREAM", (Parcelable)list.get(0));
        } else
        {
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arraylist);
        }
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            list = intent.getComponent().getPackageName();
            ief1.a.a(list, arraylist);
        }
        intent.addFlags(1);
        if (flag1)
        {
            ief1.a(ifc1, intent);
        }
        ief1.b(ifc1, intent);
    }
}
