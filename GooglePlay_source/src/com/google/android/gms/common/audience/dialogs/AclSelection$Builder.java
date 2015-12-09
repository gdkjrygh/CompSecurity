// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.dialogs;

import android.content.Intent;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.audience.dialogs:
//            AclSelection

public static interface I
{

    public abstract Intent build();

    public abstract I setAccountName(String s);

    public abstract I setInitialAcl(List list);

    public abstract I setTitleText(String s);
}
