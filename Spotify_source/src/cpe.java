// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public abstract class cpe
{

    public final cpf g;
    public cpc h;
    public final List i = new ArrayList();

    public cpe(cpf cpf, cnp cnp)
    {
        btl.a(cpf);
        g = cpf;
        cpf = new cpc(this, cnp);
        cpf.g = true;
        h = cpf;
    }

    public void a(cpc cpc1)
    {
    }
}
