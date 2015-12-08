// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface aa
    extends ao
{

    public abstract List getBetweenDates(Date date, Date date1);

    public abstract List getByDate(Date date);
}
