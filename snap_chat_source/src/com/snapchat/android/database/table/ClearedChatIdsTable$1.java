// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import android.content.Context;

// Referenced classes of package com.snapchat.android.database.table:
//            ClearedChatIdsTable

static final class c
    implements Runnable
{

    private Context a;
    private String b;
    private String c;

    public final void run()
    {
        ClearedChatIdsTable.b(a, b, c);
    }

    (Context context, String s, String s1)
    {
        a = context;
        b = s;
        c = s1;
        super();
    }
}
