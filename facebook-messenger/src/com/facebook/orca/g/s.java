// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.g:
//            x

public class s
{

    public static final x a;
    public static final x b = new x("/sync/last_thread_fetch_action_id/");
    public static final x c;

    public s()
    {
    }

    public static final x a(FolderName foldername)
    {
        return (x)((x)a.c(foldername.b())).c("/last_get_threads_client_time_ms");
    }

    public static final x a(String s1)
    {
        return (x)b.c(s1);
    }

    public static final x b(FolderName foldername)
    {
        return (x)((x)a.c(foldername.b())).c("/last_get_threads_action_id");
    }

    public static final x c(FolderName foldername)
    {
        return (x)((x)a.c(foldername.b())).c("/threads_table_out_of_date");
    }

    static 
    {
        a = new x("/sync/");
        c = (x)a.c("/last_get_top_groups_fetch_time_ms");
    }
}
