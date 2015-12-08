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

final class a
    implements y
{

    final oto a;

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

    oto(oto oto)
    {
        a = oto;
        super();
    }

    // Unreferenced inner class com/tinder/managers/z$4

/* anonymous class */
    final class z._cls4
        implements com.android.volley.i.a
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
                g.a(d, c, e, null, new z._cls4._cls1(this), false, false, f);
                return;
            } else
            {
                b.b(d, c);
                return;
            }
        }

            
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

}
