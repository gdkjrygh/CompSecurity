// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.c.s;
import com.facebook.common.c.f;

// Referenced classes of package com.facebook.orca.h:
//            a

public class b
{

    private final Context a;
    private final s b;
    private final a c;

    public b(Context context, s s1, a a1)
    {
        a = context;
        b = s1;
        c = a1;
    }

    public void a()
    {
        Object obj1 = c.a();
        if (obj1 == null)
        {
            return;
        } else
        {
            Object obj = Uri.fromFile(((f) (obj1)).a());
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("From file: ").append(((f) (obj1)).a()).append("\n");
            obj1 = new Intent("android.intent.action.SEND");
            ((Intent) (obj1)).setType("text/html");
            ((Intent) (obj1)).putExtra("android.intent.extra.EMAIL", new String[] {
                "orca-crashes@lists.facebook.com"
            });
            ((Intent) (obj1)).putExtra("android.intent.extra.SUBJECT", "Android Error Report");
            ((Intent) (obj1)).putExtra("android.intent.extra.TEXT", stringbuilder.toString());
            ((Intent) (obj1)).putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
            obj = Intent.createChooser(((Intent) (obj1)), "Email Report");
            b.b(((Intent) (obj)), a);
            return;
        }
    }
}
