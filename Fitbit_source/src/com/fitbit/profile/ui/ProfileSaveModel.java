// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.profile.ui;

import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.weight.Weight;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.fitbit.profile.ui:
//            b

public final class ProfileSaveModel
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    Date date;
    String foodsLocale;
    String fullName;
    Gender gender;
    Length height;
    Weight weight;

    public ProfileSaveModel()
    {
    }

    public void a(b b1)
    {
        fullName = b1.a();
        date = b1.b();
        height = b1.c();
        weight = b1.d();
        gender = b1.e();
    }
}
