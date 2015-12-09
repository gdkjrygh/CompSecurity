// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dpo
{

    public com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format a;
    private final String b;
    private com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font c;

    public dpo(String s)
    {
        a = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.c;
        c = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.a;
        b = s;
    }

    public final com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText.PorcelainJsonLine a()
    {
        return new com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText.PorcelainJsonLine(b, a, c);
    }
}
