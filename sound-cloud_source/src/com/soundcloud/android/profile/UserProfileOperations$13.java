// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.PagedRemoteCollection;
import com.soundcloud.android.commands.Command;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.Pager;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            UserProfileOperations

class val.nextPage
    implements com.soundcloud.rx.perations._cls13
{

    final UserProfileOperations this$0;
    final Command val$nextPage;

    public volatile Object call(Object obj)
    {
        return call((PagedRemoteCollection)obj);
    }

    public b call(PagedRemoteCollection pagedremotecollection)
    {
        pagedremotecollection = pagedremotecollection.nextPageLink();
        if (pagedremotecollection.isPresent())
        {
            return ((b)val$nextPage.call(pagedremotecollection.get())).subscribeOn(UserProfileOperations.access$100(UserProfileOperations.this));
        } else
        {
            return Pager.finish();
        }
    }

    ()
    {
        this$0 = final_userprofileoperations;
        val$nextPage = Command.this;
        super();
    }
}
