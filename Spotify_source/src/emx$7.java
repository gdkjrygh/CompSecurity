// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private emx a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = ((AdapterView) (view.getTag()));
            if (adapterview instanceof ent)
            {
                adapterview = (ent)adapterview;
                a.a(ClientEventFactory.a("artists", com.spotify.mobile.android.util.Event.SubEvent.at, adapterview.getUri(), Long.valueOf(l)));
                view = eos.a(((emz) (a)).Z, adapterview);
                if (!emx.a(a).a())
                {
                    break label0;
                }
                emx.a(a).a(view, adapterview.getName(), false);
            }
            return;
        }
        a.a(gms.a(a.k(), view).a(adapterview.getName()).a);
    }

    (emx emx1)
    {
        a = emx1;
        super();
    }
}
