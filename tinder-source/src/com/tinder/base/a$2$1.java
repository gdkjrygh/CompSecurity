// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.content.Intent;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.e.j;
import com.tinder.e.k;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.managers.d;

// Referenced classes of package com.tinder.base:
//            a

final class >
    implements k
{

    final .w a;

    public final void a()
    {
        ae.w();
    }

    public final void b()
    {
    }

    >(> >)
    {
        a = >;
        super();
    }

    // Unreferenced inner class com/tinder/base/a$2

/* anonymous class */
    final class a._cls2
        implements j
    {

        final com.tinder.base.a a;

        public final void a()
        {
            ae.w();
            Intent intent = new Intent(a, com/tinder/activities/ActivityEditProfile);
            intent.addFlags(0x10000);
            intent.putExtra("instagramConnectValue", 4);
            a.startActivity(intent);
            com.tinder.managers.a.a("Profile.Edit");
        }

        public final void b()
        {
            a.n.a(4, new a._cls2._cls1(this));
        }

            
            {
                a = a1;
                super();
            }
    }

}
