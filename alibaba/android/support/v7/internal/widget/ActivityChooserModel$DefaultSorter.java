// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserModel

final class <init>
    implements 
{

    private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
    private final Map mPackageNameToActivityMap;
    final ActivityChooserModel this$0;

    public void sort(Intent intent, List list, List list1)
    {
        intent = mPackageNameToActivityMap;
        intent.clear();
        int k = list.size();
        for (int i = 0; i < k; i++)
        {
            eInfo einfo = (eInfo)list.get(i);
            einfo.weight = 0.0F;
            intent.put(einfo.resolveInfo.activityInfo.packageName, einfo);
        }

        int j = list1.size();
        float f = 1.0F;
        for (j--; j >= 0; j--)
        {
            rd rd = (rd)list1.get(j);
            eInfo einfo1 = (eInfo)intent.get(rd.activity.getPackageName());
            if (einfo1 != null)
            {
                float f1 = einfo1.weight;
                einfo1.weight = rd.weight * f + f1;
                f = 0.95F * f;
            }
        }

        Collections.sort(list);
    }

    private rd()
    {
        this$0 = ActivityChooserModel.this;
        super();
        mPackageNameToActivityMap = new HashMap();
    }

    mPackageNameToActivityMap(mPackageNameToActivityMap mpackagenametoactivitymap)
    {
        this();
    }
}
