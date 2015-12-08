// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mob
    implements mnz
{

    private long a;

    mob(long l)
    {
        a = l;
    }

    public final Object a(Object obj)
    {
        return Long.valueOf(a);
    }

    public final void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putLong(s, a);
    }
}
