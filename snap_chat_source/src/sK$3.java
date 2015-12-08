// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Mediabryo;
import java.util.HashMap;

final class nit> extends mU
{

    private AA a;

    public final void onResult(pi pi)
    {
        super.onResult(pi);
        sK.b().remove(((Mediabryo) (a)).mClientId);
    }

    >(AA aa, sL sl, AA aa1)
    {
        a = aa1;
        super(aa, sl);
    }
}
