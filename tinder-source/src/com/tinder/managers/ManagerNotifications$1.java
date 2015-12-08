// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.e.h;
import com.tinder.model.Match;
import com.tinder.utils.e;
import com.tinder.utils.v;
import java.util.Map;

// Referenced classes of package com.tinder.managers:
//            ManagerNotifications

final class a
    implements h
{

    final b a;
    final ManagerNotifications b;

    public final void a()
    {
        v.b("failed to get match for push notification");
        a.a();
    }

    public final void a(Match match)
    {
        String s1 = match.getThumbnailUrl();
        int i = (int)b.a.getResources().getDimension(0x7f090152);
        x x = new x(s1, match) {

            final String a;
            final Match b;
            final ManagerNotifications._cls1 c;

            public final void onBitmapFailed(Drawable drawable)
            {
                c.b.f.remove(a);
                c.a.a(b);
            }

            public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                c.b.f.remove(a);
                c.a.a(b, bitmap);
            }

            public final void onPrepareLoad(Drawable drawable)
            {
            }

            
            {
                c = ManagerNotifications._cls1.this;
                a = s1;
                b = match;
                super();
            }
        };
        if (TextUtils.isEmpty(s1))
        {
            match = e.a(new com.tinder.utils.e.a() {

                final ManagerNotifications._cls1 a;

                public final Object a()
                {
                    return BitmapFactory.decodeResource(a.b.a.getResources(), 0x7f020233);
                }

            
            {
                a = ManagerNotifications._cls1.this;
                super();
            }
            });
            match.a = new com.tinder.utils.e.c(x) {

                final x a;
                final ManagerNotifications._cls1 b;

                public final void a(Object obj)
                {
                    a.onBitmapLoaded((Bitmap)obj, com.squareup.picasso.Picasso.LoadedFrom.b);
                }

            
            {
                b = ManagerNotifications._cls1.this;
                a = x1;
                super();
            }
            };
            match.a(false);
            return;
        } else
        {
            b.f.put(s1, x);
            Picasso.a(b.a).a(match.getThumbnailUrl()).b(i, i).a(x);
            return;
        }
    }

    _cls3.a(ManagerNotifications managernotifications, _cls3.a a1)
    {
        b = managernotifications;
        a = a1;
        super();
    }
}
