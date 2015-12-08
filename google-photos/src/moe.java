// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class moe
    implements mnz
{

    private String a;

    moe(String s)
    {
        a = s;
    }

    public final Object a(Object obj)
    {
        return a;
    }

    public final void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putString(s, a);
    }
}
