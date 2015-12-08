// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager, MnvStateData

static class type
{
    static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a ASYNC;
        public static final a FAILURE;
        public static final a NONE;
        public static final a SUCCESS;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/mnv/MnvManager$a$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            NONE = new a("NONE", 0);
            SUCCESS = new a("SUCCESS", 1);
            FAILURE = new a("FAILURE", 2);
            ASYNC = new a("ASYNC", 3);
            $VALUES = (new a[] {
                NONE, SUCCESS, FAILURE, ASYNC
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private MnvStateData stateData;
    private a type;

    public MnvStateData getStateData()
    {
        return stateData;
    }

    public a getType()
    {
        return type;
    }

    public void setStateData(MnvStateData mnvstatedata)
    {
        stateData = mnvstatedata;
    }

    public a(MnvStateData mnvstatedata, a a1)
    {
        stateData = mnvstatedata;
        type = a1;
    }
}
