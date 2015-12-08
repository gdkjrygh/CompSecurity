// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.y;
import com.tinder.model.ProfilePhoto;
import com.tinder.utils.v;
import java.util.List;

// Referenced classes of package com.tinder.managers:
//            z

final class f
    implements com.android.volley.
{

    final boolean a = true;
    final y b;
    final int c;
    final int d;
    final String e;
    final ProfilePhoto f;
    final z g;

    public final void a(VolleyError volleyerror)
    {
        v.b((new StringBuilder()).append(volleyerror).append(" : ").append(volleyerror.getMessage()).toString());
        if (a)
        {
            b.a(c);
            g.a(d, c, e, null, new y() {

                final z._cls4 a;

                public final void a()
                {
                }

                public final void a(int i)
                {
                }

                public final void a(int i, int j)
                {
                }

                public final void a(int i, ProfilePhoto profilephoto)
                {
                }

                public final void a(List list)
                {
                }

                public final void b()
                {
                }

                public final void b(int i)
                {
                }

                public final void b(int i, int j)
                {
                }

                public final void c(int i)
                {
                }

            
            {
                a = z._cls4.this;
                super();
            }
            }, false, false, f);
            return;
        } else
        {
            b.b(d, c);
            return;
        }
    }

    Photo(z z1, y y1, int i, int j, String s, ProfilePhoto profilephoto)
    {
        g = z1;
        b = y1;
        c = i;
        d = j;
        e = s;
        f = profilephoto;
        super();
    }
}
