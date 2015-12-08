// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.List;

final class nox
    implements npc
{

    nox()
    {
    }

    public final boolean a(List list, int i)
    {
        boolean flag = Log.isLoggable("all", i);
        int k = list.size();
        for (int j = 0; j < k; j++)
        {
            flag |= Log.isLoggable((String)list.get(j), i);
        }

        return flag;
    }
}
