// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.dialogs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.audience.dialogs:
//            AudienceSelectionIntentBuilder

public final class CircleSelection
{
    public static interface Results
    {

        public abstract ArrayList getAddedCirclesDelta();

        public abstract ArrayList getRemovedCirclesDelta();

        public abstract ArrayList getSelectedCircles();
    }

    public static interface UpdateBuilder
    {

        public abstract Intent build();

        public abstract UpdateBuilder setAccountName(String s);

        public abstract UpdateBuilder setInitialCircles(List list);

        public abstract UpdateBuilder setTitleText(String s);

        public abstract UpdateBuilder setUpdatePersonId(String s);
    }


    public static Results getResults(Intent intent)
    {
        return new AudienceSelectionIntentBuilder(intent);
    }
}
