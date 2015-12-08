// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import java.util.ArrayList;

// Referenced classes of package kik.android.chat.fragment:
//            KikAddContactFragment

public static final class  extends com.kik.ui.fragment.ent.b
{

    static String a( )
    {
        return .g("NameSuggestion");
    }

    static ArrayList b(g g)
    {
        return (ArrayList)g.k("FilteredNames");
    }

    static int c(k k)
    {
        return k.b("ActionType", 1);
    }

    static boolean d(b b1)
    {
        return b1.f("showKeyboard").booleanValue();
    }

    public final f a()
    {
        a("showKeyboard", true);
        return this;
    }

    public final a a(String s)
    {
        a("NameSuggestion", s);
        return this;
    }

    public final a a(ArrayList arraylist)
    {
        a("FilteredNames", ((java.io.Serializable) (arraylist)));
        return this;
    }

    public final a b(int i)
    {
        a("ActionType", i);
        return this;
    }

    public ()
    {
    }
}
