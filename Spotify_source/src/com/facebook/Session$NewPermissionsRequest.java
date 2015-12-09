// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import ape;
import java.util.List;

// Referenced classes of package com.facebook:
//            SessionDefaultAudience, SessionLoginBehavior

public final class a extends a
{

    private static final long serialVersionUID = 1L;

    final ionRequest a()
    {
        ionRequest ionrequest = super.();
        ionrequest.isRerequest = true;
        return ionrequest;
    }

    public final volatile ionRequest.isRerequest a(int i)
    {
        super.(i);
        return this;
    }

    public final volatile  a(ape ape)
    {
        super.(ape);
        return this;
    }

    public final volatile  a(SessionDefaultAudience sessiondefaultaudience)
    {
        super.(sessiondefaultaudience);
        return this;
    }

    public final volatile  a(SessionLoginBehavior sessionloginbehavior)
    {
        super.(sessionloginbehavior);
        return this;
    }

    public final  b()
    {
        super.(101);
        return this;
    }

    public ionRequest(Activity activity, List list)
    {
        super(activity);
        a(list);
    }
}
