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

final class b
    implements x
{

    final String a;
    final Match b;
    final b c;

    public final void onBitmapFailed(Drawable drawable)
    {
        c.c.f.remove(a);
        c.c.c(b);
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso. )
    {
        c.c.f.remove(a);
        c.c.c(b, bitmap);
    }

    public final void onPrepareLoad(Drawable drawable)
    {
    }

    a(a a1, String s, Match match)
    {
        c = a1;
        a = s;
        b = match;
        super();
    }

    // Unreferenced inner class com/tinder/managers/ManagerNotifications$1

/* anonymous class */
    final class ManagerNotifications._cls1
        implements h
    {

        final ManagerNotifications.a a;
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
            ManagerNotifications._cls1._cls1 _lcls1 = new ManagerNotifications._cls1._cls1(this, s1, match);
            if (TextUtils.isEmpty(s1))
            {
                match = e.a(new ManagerNotifications._cls1._cls3());
                match.a = new ManagerNotifications._cls1._cls2(_lcls1);
                match.a(false);
                return;
            } else
            {
                b.f.put(s1, _lcls1);
                Picasso.a(b.a).a(match.getThumbnailUrl()).b(i, i).a(_lcls1);
                return;
            }
        }

            
            {
                b = managernotifications;
                a = a1;
                super();
            }

        // Unreferenced inner class com/tinder/managers/ManagerNotifications$1$2

/* anonymous class */
        final class ManagerNotifications._cls1._cls2
            implements com.tinder.utils.e.c
        {

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
        }


        // Unreferenced inner class com/tinder/managers/ManagerNotifications$1$3

/* anonymous class */
        final class ManagerNotifications._cls1._cls3
            implements com.tinder.utils.e.a
        {

            final ManagerNotifications._cls1 a;

            public final Object a()
            {
                return BitmapFactory.decodeResource(a.b.a.getResources(), 0x7f020233);
            }

                    
                    {
                        a = ManagerNotifications._cls1.this;
                        super();
                    }
        }

    }

}
