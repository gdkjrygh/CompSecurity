// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.g.p;
import com.kik.g.r;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kik.android.util.e;

// Referenced classes of package com.kik.cards.usermedia:
//            k

final class l extends r
{

    final boolean a;
    final p b;
    final k c;

    l(k k1, boolean flag, p p1)
    {
        c = k1;
        a = flag;
        b = p1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (Intent)obj;
        Context context = k.a(c).t();
        if (a)
        {
            obj = new ArrayList();
            obj1 = e.a(((Intent) (obj1)));
            if (obj1 != null)
            {
                File file = e.a(((Uri) (obj1)), context);
                if (file != null)
                {
                    ((List) (obj)).add(file.getAbsolutePath());
                } else
                {
                    Toast.makeText(context, context.getString(0x7f090062), 1).show();
                    ((List) (obj)).add(((Uri) (obj1)).toString());
                }
            } else
            {
                Toast.makeText(context, context.getString(0x7f090062), 1).show();
                ((List) (obj)).add(UUID.randomUUID().toString());
            }
        } else
        {
            obj = new ArrayList(((Intent) (obj1)).getStringArrayListExtra("CustomGalleryActivity.EXTRA_RESULTS"));
        }
        b.a(obj);
    }

    public final void a(Throwable throwable)
    {
        b.a(throwable);
    }
}
