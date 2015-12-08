// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.support.v4.app.Fragment;
import java.util.List;

// Referenced classes of package com.facebook:
//            SessionDefaultAudience, SessionLoginBehavior

public final class setPermissions extends setPermissions
{

    private static final long serialVersionUID = 1L;

    final ionRequest getAuthorizationClientRequest()
    {
        ionRequest ionrequest = super.etAuthorizationClientRequest();
        ionrequest.setRerequest(true);
        return ionrequest;
    }

    public final volatile ionRequest.setRerequest setCallback(ionRequest.setRerequest setrerequest)
    {
        return setCallback(setrerequest);
    }

    public final setCallback setCallback(setCallback setcallback)
    {
        super.etCallback(setcallback);
        return this;
    }

    public final volatile etCallback setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
    {
        return setDefaultAudience(sessiondefaultaudience);
    }

    public final setDefaultAudience setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
    {
        super.etDefaultAudience(sessiondefaultaudience);
        return this;
    }

    public final volatile etDefaultAudience setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
    {
        return setLoginBehavior(sessionloginbehavior);
    }

    public final setLoginBehavior setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
    {
        super.etLoginBehavior(sessionloginbehavior);
        return this;
    }

    public final volatile etLoginBehavior setRequestCode(int i)
    {
        return setRequestCode(i);
    }

    public final setRequestCode setRequestCode(int i)
    {
        super.etRequestCode(i);
        return this;
    }

    public ionRequest(Activity activity, List list)
    {
        super(activity);
        setPermissions(list);
    }

    public transient setPermissions(Activity activity, String as[])
    {
        super(activity);
        setPermissions(as);
    }

    public setPermissions(Fragment fragment, List list)
    {
        super(fragment);
        setPermissions(list);
    }

    public transient setPermissions(Fragment fragment, String as[])
    {
        super(fragment);
        setPermissions(as);
    }
}
