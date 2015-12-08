// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class moa
    implements mnz
{

    private int a;

    moa(int i)
    {
        a = i;
    }

    public final Object a(Object obj)
    {
        return Integer.valueOf(a);
    }

    public final void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putInt(s, a);
    }
}
