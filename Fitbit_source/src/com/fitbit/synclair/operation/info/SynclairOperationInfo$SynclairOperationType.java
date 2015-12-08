// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fitbit.synclair.operation.info:
//            SynclairOperationInfo

public static final class operationStages extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    private static final n o[];
    private final List operationStages;

    public static operationStages valueOf(String s)
    {
        return (operationStages)Enum.valueOf(com/fitbit/synclair/operation/info/SynclairOperationInfo$SynclairOperationType, s);
    }

    public static operationStages[] values()
    {
        return (operationStages[])o.clone();
    }

    public List a()
    {
        return operationStages;
    }

    static 
    {
        a = new <init>("INITIALIZATION", 0);
        b = new <init>("LOAD_CONFIG", 1);
        c = new <init>("SEARCH_TRACKER_FOR_PAIRING", 2);
        d = new <init>("SEARCH_TRACKER_FOR_UPDATE", 3);
        e = new <init>("CHECK_FOR_FIRMWARE", 4);
        f = new <init>("SEND_FIRMWARE", 5);
        g = new <init>("DISPLAY_CODE", 6);
        h = new <init>("TAP_TRACKER", 7, new int[] {
            1, 2
        });
        i = new <init>("PAIR_TRACKER", 8);
        j = new <init>("SYNC_TRACKER", 9);
        k = new <init>("REFRESH_PROFILE", 10);
        l = new <init>("SYNC_TRACKER_TYPES", 11);
        m = new <init>("SEND_SELECTED_EXERCISES", 12);
        n = new <init>("SEND_GREETING", 13);
        o = (new o[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }

    private (String s, int i1)
    {
        this(s, i1, new int[] {
            0
        });
    }

    private transient <init>(String s, int i1, int ai[])
    {
        super(s, i1);
        s = new ArrayList(ai.length);
        int j1 = ai.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            s.add(Integer.valueOf(ai[i1]));
        }

        operationStages = Collections.unmodifiableList(s);
    }
}
