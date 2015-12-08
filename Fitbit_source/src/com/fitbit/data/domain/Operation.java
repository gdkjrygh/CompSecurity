// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            a

public class Operation
{
    public static final class OperationType extends Enum
        implements a
    {

        private static final OperationType $VALUES[];
        public static final OperationType CREATE;
        public static final OperationType DELETE;
        public static final OperationType UPDATE;
        private final int code;

        public static OperationType valueOf(String s)
        {
            return (OperationType)Enum.valueOf(com/fitbit/data/domain/Operation$OperationType, s);
        }

        public static OperationType[] values()
        {
            return (OperationType[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        static 
        {
            CREATE = new OperationType("CREATE", 0, 0);
            UPDATE = new OperationType("UPDATE", 1, 1);
            DELETE = new OperationType("DELETE", 2, 2);
            $VALUES = (new OperationType[] {
                CREATE, UPDATE, DELETE
            });
        }

        private OperationType(String s, int i, int j)
        {
            super(s, i);
            code = j;
        }
    }


    private String a;
    private OperationType b;
    private boolean c;
    private long d;
    private Long e;
    private boolean f;

    public Operation()
    {
    }

    public Operation(long l, String s, OperationType operationtype)
    {
        a = s;
        b = operationtype;
        d = l;
    }

    public OperationType a()
    {
        return b;
    }

    public void a(long l)
    {
        d = l;
    }

    public void a(OperationType operationtype)
    {
        b = operationtype;
    }

    public void a(Long long1)
    {
        e = long1;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public String b()
    {
        return a;
    }

    public void b(boolean flag)
    {
        f = flag;
    }

    public long c()
    {
        return d;
    }

    public boolean d()
    {
        return c;
    }

    public Long e()
    {
        return e;
    }

    public boolean f()
    {
        return f;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Op ").append(b()).append("/").append(e()).append("/").append(a()).append("/").append(c()).toString();
    }
}
