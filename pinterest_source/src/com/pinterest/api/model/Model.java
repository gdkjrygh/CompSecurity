// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

public abstract class Model
{

    public Model()
    {
        setCacheExpirationDate(ModelHelper.defaultCacheExpirationDate());
    }

    public abstract Date getCacheExpirationDate();

    public abstract String getUid();

    public abstract void setCacheExpirationDate(Date date);
}
