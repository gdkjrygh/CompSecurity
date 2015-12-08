// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.text;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;

public class ToStringFilter extends ahn
{

    public ToStringFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        return (new ajw()).a("object", 2, aif.b()).b("string", 2, aif.a(java/lang/String)).a();
    }

    protected final void e()
    {
        String s = a("object").a().d().m().toString();
        aju aju1 = b("string");
        aig aig1 = aju1.a(null).d();
        aig1.a(s);
        aju1.a(aig1);
    }
}
