// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.EditText;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.share.client.ShareViewClient;

final class ang.Object
    implements android.view.nClickListener
{

    private fhl a;

    public final void onClick(View view)
    {
        view = fhl.a(a).getText().toString();
        Object obj1 = fhl.b(a).getText().toString();
        Object obj = ((fhi) (a)).Y;
        obj.a = fhl.c(a).a();
        ShareViewClient shareviewclient;
        if (fhl.c(a).equals(com.spotify.mobile.android.spotlets.share.model.k.Type.b))
        {
            obj.b = view;
            obj.d = ((String) (obj1));
        } else
        {
            obj.c = view;
            obj.d = ((String) (obj1));
        }
        obj1 = a.F();
        view = fhl.c(a);
        obj = new com.spotify.mobile.android.spotlets.share.model.t.Request(((fhq) (obj)).a, ((fhq) (obj)).b, ((fhq) (obj)).c, ((fhq) (obj)).d, null);
        shareviewclient = ((fhn) (obj1)).Y;
        obj1 = ((fhn) (obj1)).a(view);
        shareviewclient.b().resolve(ShareViewClient.a(view, ((com.spotify.mobile.android.spotlets.share.model.t.Request) (obj))), ((com.spotify.cosmos.android.er.CallbackReceiver) (obj1)));
        a.dismiss();
    }

    (fhl fhl1)
    {
        a = fhl1;
        super();
    }
}
