// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public class agm extends aib
    implements agj
{

    public agm()
    {
    }

    public final void a(String s, int i)
    {
        Intent intent = new Intent((new StringBuilder()).append(a).append("#setPosition(java.lang.String arg0, int arg1)").toString());
        intent.putExtra("arg0", s);
        intent.putExtra("arg1", i);
        a(intent);
    }

    public final void a(String s, String s1)
    {
        Intent intent = new Intent((new StringBuilder()).append(a).append("#setTarget(java.lang.String arg0, java.lang.String arg1)").toString());
        intent.putExtra("arg0", s);
        intent.putExtra("arg1", s1);
        a(intent);
    }

    public final void a(String s, boolean flag)
    {
        Intent intent = new Intent((new StringBuilder()).append(a).append("#setVisible(java.lang.String arg0, boolean arg1)").toString());
        intent.putExtra("arg0", s);
        intent.putExtra("arg1", flag);
        a(intent);
    }

    public final void a(String s, byte abyte0[])
    {
        Intent intent = new Intent((new StringBuilder()).append(a).append("#setImage(java.lang.String arg0, byte[] arg1)").toString());
        intent.putExtra("arg0", s);
        intent.putExtra("arg1", abyte0);
        a(intent);
    }

    public final void a(String s, String as[], String as1[], String as2[], int ai[], byte abyte0[])
    {
        Intent intent = new Intent((new StringBuilder()).append(a).append("#setItems(java.lang.String arg0, java.lang.String[] arg1, java.lang.String[] arg2, java.lang.String[] arg3, int[] arg4, byte[] arg5)").toString());
        intent.putExtra("arg0", s);
        intent.putExtra("arg1", as);
        intent.putExtra("arg2", as1);
        intent.putExtra("arg3", as2);
        intent.putExtra("arg4", ai);
        intent.putExtra("arg5", abyte0);
        a(intent);
    }

    public final void b(String s, String s1)
    {
        Intent intent = new Intent((new StringBuilder()).append(a).append("#setText(java.lang.String arg0, java.lang.String arg1)").toString());
        intent.putExtra("arg0", s);
        intent.putExtra("arg1", s1);
        a(intent);
    }
}
