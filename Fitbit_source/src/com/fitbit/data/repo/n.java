// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface n
    extends ao
{

    public abstract Device getByEncodedId(String s);

    public abstract List getByProfile(Profile profile);
}
