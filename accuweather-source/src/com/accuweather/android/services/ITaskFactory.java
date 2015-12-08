// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.utilities.Data;
import java.util.List;

// Referenced classes of package com.accuweather.android.services:
//            BaseUpdateTask

public interface ITaskFactory
{

    public abstract BaseUpdateTask getTask(List list, Data data);
}
