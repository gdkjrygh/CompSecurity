// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;

// Referenced classes of package bo.app:
//            ag

public final class r
{

    static final String a;
    int b;
    boolean c;

    public r()
    {
        b = ag.a;
        c = false;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/r.getName()
        });
    }
}
