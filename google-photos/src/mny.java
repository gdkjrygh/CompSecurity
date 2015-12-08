// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mny
    implements mnz
{

    private boolean a;

    mny(boolean flag)
    {
        a = flag;
    }

    public final Object a(Object obj)
    {
        return Boolean.valueOf(a);
    }

    public final void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putBoolean(s, a);
    }
}
