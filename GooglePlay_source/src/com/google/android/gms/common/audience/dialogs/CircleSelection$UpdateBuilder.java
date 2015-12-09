// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.dialogs;

import android.content.Intent;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.audience.dialogs:
//            CircleSelection

public static interface 
{

    public abstract Intent build();

    public abstract  setAccountName(String s);

    public abstract  setInitialCircles(List list);

    public abstract  setTitleText(String s);

    public abstract  setUpdatePersonId(String s);
}
