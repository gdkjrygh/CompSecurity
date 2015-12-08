// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class gzl
    implements opl, ops, opv
{

    public ekk a;

    public gzl(opd opd1)
    {
        a = ekk.a;
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            a = (ekk)bundle.getParcelable("feature_set");
        }
    }

    public final void a(ekk ekk1)
    {
        a = (new ekm()).a(a).a(ekk1).a();
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("feature_set", a);
    }
}
