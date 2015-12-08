// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.leanplum;

import com.leanplum.Leanplum;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.leanplum:
//            LeanplumService

class this._cls0
    implements Action1
{

    final LeanplumService this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        user = user.getId();
        if (!LeanplumService.access$100(LeanplumService.this).equals(user) && !Strings.isNullOrEmpty(user))
        {
            Leanplum.setUserId(user);
        }
    }

    ()
    {
        this$0 = LeanplumService.this;
        super();
    }
}
