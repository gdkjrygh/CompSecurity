// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.annotations.sharedpreferences;


// Referenced classes of package org.androidannotations.annotations.sharedpreferences:
//            SharedPref

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/androidannotations/annotations/sharedpreferences/SharedPref$Scope, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("APPLICATION_DEFAULT", 0);
        b = new <init>("ACTIVITY", 1);
        c = new <init>("ACTIVITY_DEFAULT", 2);
        d = new <init>("UNIQUE", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
