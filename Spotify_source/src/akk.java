// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class akk extends gyh
    implements gyi
{

    public final alu a;
    private Collection b;

    public akk()
    {
        this(new akl(), new ali(), new alu());
    }

    private akk(akl akl1, ali ali1, alu alu1)
    {
        a = alu1;
        b = Collections.unmodifiableCollection(Arrays.asList(new gyh[] {
            akl1, ali1, alu1
        }));
    }

    public static akk d()
    {
        return (akk)gya.a(akk);
    }

    public final String a()
    {
        return "2.5.2.79";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final Collection c()
    {
        return b;
    }

    protected final volatile Object e()
    {
        return null;
    }
}
