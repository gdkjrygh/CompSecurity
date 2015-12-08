// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import de.greenrobot.dao.Property;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodLocaleDao

public static class A
{

    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property ImageUpload = new Property(4, java/lang/Boolean, "imageUpload", false, "IMAGE_UPLOAD");
    public static final Property Label = new Property(2, java/lang/String, "label", false, "LABEL");
    public static final Property SupportsLookupByBarCode = new Property(3, java/lang/Boolean, "supportsLookupByBarCode", false, "SUPPORTS_LOOKUP_BY_BAR_CODE");
    public static final Property Value = new Property(1, java/lang/String, "value", false, "VALUE");


    public A()
    {
    }
}
