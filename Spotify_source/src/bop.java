// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

abstract class bop extends bpi
{

    public bop(bqu bqu)
    {
        super(bqu);
    }

    public final brc a(Status status)
    {
        return new boi(status) {

            private Status a;

            public final ApplicationMetadata a()
            {
                return null;
            }

            public final boolean b()
            {
                return false;
            }

            public final Status c()
            {
                return a;
            }

            
            {
                a = status;
                super();
            }
        };
    }
}
