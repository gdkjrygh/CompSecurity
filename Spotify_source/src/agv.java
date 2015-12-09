// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class agv extends agr
    implements ahx
{

    public agv(String s)
    {
        super(s);
    }

    public final void a(int i)
    {
        Object obj = d;
        String s = c;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#setImage(java.lang.String arg0, int arg1)").toString());
        ((Intent) (obj)).putExtra("arg0", s);
        ((Intent) (obj)).putExtra("arg1", i);
        agm.a(((Intent) (obj)));
    }

    public final void a(adm adm)
    {
        super.a(adm);
    }

    public final void a(String s)
    {
        Object obj = d;
        String s1 = c;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#setTooltip(java.lang.String arg0, java.lang.String arg1)").toString());
        ((Intent) (obj)).putExtra("arg0", s1);
        ((Intent) (obj)).putExtra("arg1", s);
        agm.a(((Intent) (obj)));
    }

    public final void b(boolean flag)
    {
        Object obj = d;
        String s = c;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#setEnabled(java.lang.String arg0, boolean arg1)").toString());
        ((Intent) (obj)).putExtra("arg0", s);
        ((Intent) (obj)).putExtra("arg1", flag);
        agm.a(((Intent) (obj)));
    }

    public final void c(boolean flag)
    {
        Object obj = d;
        String s = c;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#setSelectable(java.lang.String arg0, boolean arg1)").toString());
        ((Intent) (obj)).putExtra("arg0", s);
        ((Intent) (obj)).putExtra("arg1", flag);
        agm.a(((Intent) (obj)));
    }
}
