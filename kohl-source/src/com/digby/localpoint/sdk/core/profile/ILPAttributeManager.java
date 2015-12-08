// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.profile;

import java.util.Map;

// Referenced classes of package com.digby.localpoint.sdk.core.profile:
//            ILPAttributeListener

public interface ILPAttributeManager
{

    public abstract void addListener(ILPAttributeListener ilpattributelistener);

    public abstract void removeAllListeners();

    public abstract void removeListener(ILPAttributeListener ilpattributelistener);

    public abstract void updateProfileAttributes(Map map);

    public abstract void updateUserAttributes(Map map);
}
