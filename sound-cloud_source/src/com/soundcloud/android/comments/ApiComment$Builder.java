// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.Urn;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.comments:
//            ApiComment

public static abstract class 
{

    public abstract  body(String s);

    public abstract ApiComment build();

    public abstract  createdAt(Date date);

    public abstract  trackTime(long l);

    public abstract  trackUrn(Urn urn1);

    public abstract  urn(Urn urn1);

    public abstract  user(ApiUser apiuser);

    public ()
    {
    }
}
