// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements android.view.nClickListener
{

    private evn a;

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            Assertion.a("If you end up here, Notifications tab architecture is bork3n");
            return;

        case 2131821668: 
            a.a();
            return;

        case 2131821669: 
            a.b();
            break;
        }
    }

    (evn evn1)
    {
        a = evn1;
        super();
    }
}
