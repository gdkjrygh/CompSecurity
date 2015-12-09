// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import java.util.List;

// Referenced classes of package b.a:
//            bj, bk, af

public final class bl
    implements bj
{

    private String a;

    public bl()
    {
        String s = null;
        super();
        a = null;
        bk.c();
        bk.b();
        if (bk.c().b)
        {
            s = ((android.app.ActivityManager.RunningTaskInfo)((ActivityManager)bk.b().getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.flattenToShortString().replace("/", "");
        }
        a = s;
    }

    public final String a()
    {
        return "activity";
    }

    public final volatile Object b()
    {
        return a;
    }
}
