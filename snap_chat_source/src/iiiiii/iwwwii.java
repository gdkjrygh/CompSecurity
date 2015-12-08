// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package iiiiii;


public final class iwwwii
{

    public final String b041E041E041E041E041E041E_java_lang_String_fld;
    private int b041E041E041E041E041E041E_int_fld;
    public final int b041E041E041E041E041E041E_int_fld;

    public iwwwii(String s)
    {
        b041E041E041E041E041E041E_java_lang_String_fld = s;
        b041E041E041E041E041E041E_int_fld = s.length();
    }

    public int b041A041A041A041A041A041A()
    {
        int i = b041E041E041E041E041E041E_java_lang_String_fld.codePointAt(b041E041E041E041E041E041E_int_fld);
        b041E041E041E041E041E041E_int_fld = b041E041E041E041E041E041E_int_fld + 1;
        if (i >= 0x10000 && b041E041E041E041E041E041E_int_fld < b041E041E041E041E041E041E_int_fld && b041E041E041E041E041E041E_java_lang_String_fld.codePointAt(b041E041E041E041E041E041E_int_fld) < 0x10000)
        {
            b041E041E041E041E041E041E_int_fld = b041E041E041E041E041E041E_int_fld + 1;
        }
        return i;
    }

    public boolean b041A041A041A041A041A041A()
    {
        return b041E041E041E041E041E041E_int_fld < b041E041E041E041E041E041E_int_fld;
    }
}
