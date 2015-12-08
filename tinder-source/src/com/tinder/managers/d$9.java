// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.text.TextUtils;
import com.tinder.e.aw;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.User;
import com.tinder.model.UserMeta;

// Referenced classes of package com.tinder.managers:
//            d, z

final class a
    implements Runnable
{

    final int a;
    final d b;

    public final void run()
    {
        d.d(b).a(new aw() {

            final d._cls9 a;

            public final void onProfileLoaded(User user)
            {
                if (user.getInstagramDataSet() == null) goto _L2; else goto _L1
_L1:
                String s;
                if (TextUtils.equals("null", user.getInstagramDataSet().lastFetchTime))
                {
                    s = "";
                } else
                {
                    s = user.getInstagramDataSet().lastFetchTime;
                }
                if (!TextUtils.isEmpty(s)) goto _L3; else goto _L2
_L2:
                d.a(a.b, a.a + 1);
_L5:
                return;
_L3:
                String s1;
                if (TextUtils.equals("null", user.getInstagramDataSet().lastFetchTime))
                {
                    s1 = "";
                } else
                {
                    s1 = user.getInstagramDataSet().lastFetchTime;
                }
                String.format("retryInstagramPhotos lastfetchTime[%s]", new Object[] {
                    s1
                });
                if (d.h() != null)
                {
                    d.h().instagramDataSet = user.getInstagramDataSet();
                    return;
                }
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                a = d._cls9.this;
                super();
            }
        });
    }

    _cls1.a(d d1, int i)
    {
        b = d1;
        a = i;
        super();
    }
}
