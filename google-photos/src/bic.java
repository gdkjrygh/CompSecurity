// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public class bic extends omc
{

    public bic()
    {
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        a.a("com.google.android.libraries.social.appid", 171);
    }

    public void onBuildHeaders(List list)
    {
        loadHeadersFromResource(b._fldif, list);
    }
}
