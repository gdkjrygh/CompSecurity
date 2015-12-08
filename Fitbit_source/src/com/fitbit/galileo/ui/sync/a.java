// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui.sync;


public class com.fitbit.galileo.ui.sync.a
{
    static class a
    {

        private CharSequence a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private boolean g;

        a a(CharSequence charsequence)
        {
            a = charsequence;
            return this;
        }

        a a(boolean flag)
        {
            g = flag;
            return this;
        }

        com.fitbit.galileo.ui.sync.a a()
        {
            return new com.fitbit.galileo.ui.sync.a(a, b, c, d, e, f, g);
        }

        a b(CharSequence charsequence)
        {
            b = charsequence;
            return this;
        }

        a c(CharSequence charsequence)
        {
            c = charsequence;
            return this;
        }

        a d(CharSequence charsequence)
        {
            d = charsequence;
            return this;
        }

        a e(CharSequence charsequence)
        {
            f = charsequence;
            return this;
        }

        a f(CharSequence charsequence)
        {
            e = charsequence;
            return this;
        }

        a()
        {
            a = "";
            b = "";
            c = "";
            d = "";
            e = "";
            f = "";
            g = false;
        }
    }


    public static final com.fitbit.galileo.ui.sync.a a = new com.fitbit.galileo.ui.sync.a("", "", "", "", "", "", false);
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final boolean h;
    private final String i;

    private com.fitbit.galileo.ui.sync.a(CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, CharSequence charsequence3, CharSequence charsequence4, CharSequence charsequence5, boolean flag)
    {
        b = charsequence;
        c = charsequence1;
        d = charsequence2;
        e = charsequence3;
        g = charsequence5;
        f = charsequence4;
        h = flag;
        i = (new StringBuilder()).append("CaseInfo:\n\tmessage[").append(charsequence).append("]").append("\n\terrorMessage[").append(charsequence1).append("]").append("").append("\n\tdashboardMessage[").append(charsequence2).append("]").append("\n\tdashboardErrorMessage[").append(charsequence3).append("]").append("\n\tbackgroundSyncMessage[").append(charsequence4).append("]").append("\n\tadditionalDevicesMessage[").append(charsequence5).append("]").append("\n\tliveDataWasConnected[").append(flag).append("]").toString();
    }


    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof com.fitbit.galileo.ui.sync.a)
                {
                    return i.equals(((com.fitbit.galileo.ui.sync.a)obj).i);
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return i.hashCode();
    }

    public String toString()
    {
        return i;
    }

}
