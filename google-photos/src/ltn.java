// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ltn
    implements Runnable
{

    private android.content.SharedPreferences.Editor a;

    public ltn(android.content.SharedPreferences.Editor editor)
    {
        a = editor;
        super();
    }

    public final void run()
    {
        a.commit();
    }
}
