// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.dialogs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class AclSelection
{
    public static interface Builder
    {

        public abstract Intent build();

        public abstract Builder setAccountName(String s);

        public abstract Builder setInitialAcl(List list);

        public abstract Builder setTitleText(String s);
    }

    public static interface Results
    {

        public abstract ArrayList getSelectedAudienceMembers();
    }

}
