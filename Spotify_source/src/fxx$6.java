// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.service.ConnectDevice;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private fxx a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = (ConnectDevice)view.getTag();
            if (!((ConnectDevice) (adapterview)).e && ((ConnectDevice) (adapterview)).g && view.isEnabled())
            {
                fxx.a(a, adapterview);
                if (!fxx.p(a))
                {
                    break label0;
                }
                fxx.a(a, ((ConnectDevice) (adapterview)).b);
            }
            return;
        }
        fxx.b(a, ((ConnectDevice) (adapterview)).b);
    }

    (fxx fxx1)
    {
        a = fxx1;
        super();
    }
}
