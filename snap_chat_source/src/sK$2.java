// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Mediabryo;
import java.util.HashMap;

public final class nit> extends Kg
{

    private AA a;
    private sK b;

    protected final void onPostExecute(Object obj)
    {
        obj = (Void)obj;
        sK.a(b, a);
        sK.a().remove(((Mediabryo) (a)).mClientId);
        super.onPostExecute(obj);
    }

    public >(sK sk, AA aa)
    {
        b = sk;
        a = aa;
        super();
    }
}
