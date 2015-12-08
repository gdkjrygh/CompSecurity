// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class fyt
    implements nus
{

    private fyr a;

    fyt(fyr fyr1)
    {
        a = fyr1;
        super();
    }

    public final String a()
    {
        return "offline_retry_tag_edit_caption";
    }

    public final void c_(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = bundle.getString("unsaved_caption");
            if (bundle != null)
            {
                fyr.a(a).a(bundle);
            }
        }
        fyr.a(a).c();
    }
}
