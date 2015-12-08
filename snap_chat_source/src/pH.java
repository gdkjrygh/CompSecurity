// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class pH extends oD
    implements oS.a
{
    public static interface a
    {

        public abstract void a(Tt tt, pi pi1);

        public abstract void a(List list);
    }


    private final a mCallback;

    public pH(a a1)
    {
        registerCallback(Tt, this);
        mCallback = a1;
    }

    protected final String getPath()
    {
        return "/unlockable/location_independent_unlockables?purpose=user_owned_lens";
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        obj = (Tt)obj;
        if (!pi1.c() || obj == null || !((Tt) (obj)).b())
        {
            mCallback.a(((Tt) (obj)), pi1);
            return;
        }
        obj = ((Tt) (obj)).a();
        pi1 = new ArrayList(((List) (obj)).size());
        for (int i = 0; i < ((List) (obj)).size(); i++)
        {
            BY by = new BY((Rg)((List) (obj)).get(i));
            by.mOrder = i + 1;
            pi1.add(by);
        }

        mCallback.a(pi1);
    }
}
