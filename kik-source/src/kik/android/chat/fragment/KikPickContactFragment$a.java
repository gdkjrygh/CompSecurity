// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import java.util.ArrayList;
import kik.android.util.an;

// Referenced classes of package kik.android.chat.fragment:
//            KikPickContactFragment

public static final class  extends an
{

    private static String a = "groupIdforPick";
    private static String b = "groupOnlyOneContact";

    static String a( )
    {
        return .g(b);
    }

    static String b(b b1)
    {
        return b1.g(a);
    }

    static ArrayList c(a a1)
    {
        return (ArrayList)a1.k("kikpickcontactfrag.EXTRA_FILTERED_USERS");
    }


    public ()
    {
    }
}
