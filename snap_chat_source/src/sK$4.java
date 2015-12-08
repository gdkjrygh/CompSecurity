// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Mediabryo;
import java.util.HashMap;

final class nit> extends mT
{

    private AA a;

    public final void a(Tk tk, pi pi)
    {
        super.a(tk, pi);
        sK.c().remove(((Mediabryo) (a)).mClientId);
    }

    public final void onJsonResult(Object obj, pi pi)
    {
        a((Tk)obj, pi);
    }

    >(AA aa, sL sl, AA aa1)
    {
        a = aa1;
        super(aa, sl);
    }
}
