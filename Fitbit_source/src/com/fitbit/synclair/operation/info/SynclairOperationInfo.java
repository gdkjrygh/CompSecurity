// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation.info;

import com.fitbit.synclair.SynclairError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface SynclairOperationInfo
{
    public static final class SynclairOperationResult extends Enum
    {

        public static final SynclairOperationResult a;
        public static final SynclairOperationResult b;
        public static final SynclairOperationResult c;
        private static final SynclairOperationResult d[];

        public static SynclairOperationResult valueOf(String s)
        {
            return (SynclairOperationResult)Enum.valueOf(com/fitbit/synclair/operation/info/SynclairOperationInfo$SynclairOperationResult, s);
        }

        public static SynclairOperationResult[] values()
        {
            return (SynclairOperationResult[])d.clone();
        }

        static 
        {
            a = new SynclairOperationResult("COMPLETED", 0);
            b = new SynclairOperationResult("FAILED", 1);
            c = new SynclairOperationResult("CANCELED", 2);
            d = (new SynclairOperationResult[] {
                a, b, c
            });
        }

        private SynclairOperationResult(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class SynclairOperationType extends Enum
    {

        public static final SynclairOperationType a;
        public static final SynclairOperationType b;
        public static final SynclairOperationType c;
        public static final SynclairOperationType d;
        public static final SynclairOperationType e;
        public static final SynclairOperationType f;
        public static final SynclairOperationType g;
        public static final SynclairOperationType h;
        public static final SynclairOperationType i;
        public static final SynclairOperationType j;
        public static final SynclairOperationType k;
        public static final SynclairOperationType l;
        public static final SynclairOperationType m;
        public static final SynclairOperationType n;
        private static final SynclairOperationType o[];
        private final List operationStages;

        public static SynclairOperationType valueOf(String s)
        {
            return (SynclairOperationType)Enum.valueOf(com/fitbit/synclair/operation/info/SynclairOperationInfo$SynclairOperationType, s);
        }

        public static SynclairOperationType[] values()
        {
            return (SynclairOperationType[])o.clone();
        }

        public List a()
        {
            return operationStages;
        }

        static 
        {
            a = new SynclairOperationType("INITIALIZATION", 0);
            b = new SynclairOperationType("LOAD_CONFIG", 1);
            c = new SynclairOperationType("SEARCH_TRACKER_FOR_PAIRING", 2);
            d = new SynclairOperationType("SEARCH_TRACKER_FOR_UPDATE", 3);
            e = new SynclairOperationType("CHECK_FOR_FIRMWARE", 4);
            f = new SynclairOperationType("SEND_FIRMWARE", 5);
            g = new SynclairOperationType("DISPLAY_CODE", 6);
            h = new SynclairOperationType("TAP_TRACKER", 7, new int[] {
                1, 2
            });
            i = new SynclairOperationType("PAIR_TRACKER", 8);
            j = new SynclairOperationType("SYNC_TRACKER", 9);
            k = new SynclairOperationType("REFRESH_PROFILE", 10);
            l = new SynclairOperationType("SYNC_TRACKER_TYPES", 11);
            m = new SynclairOperationType("SEND_SELECTED_EXERCISES", 12);
            n = new SynclairOperationType("SEND_GREETING", 13);
            o = (new SynclairOperationType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n
            });
        }

        private SynclairOperationType(String s, int i1)
        {
            this(s, i1, new int[] {
                0
            });
        }

        private transient SynclairOperationType(String s, int i1, int ai[])
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


    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;

    public abstract SynclairOperationResult a();

    public abstract SynclairError b();

    public abstract SynclairOperationType c();

    public abstract int e();

    public abstract boolean g();

    public abstract boolean h();
}
