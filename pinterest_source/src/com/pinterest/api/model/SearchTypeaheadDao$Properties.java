// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import de.greenrobot.dao.Property;
import java.util.Date;

public class 
{

    public static final Property CacheExpirationDate = new Property(1, java/util/Date, "cacheExpirationDate", false, "CACHE_EXPIRATION_DATE");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property Query = new Property(2, java/lang/String, "query", true, "QUERY");
    public static final Property Score = new Property(3, java/lang/Float, "score", false, "SCORE");


    public ()
    {
    }
}
