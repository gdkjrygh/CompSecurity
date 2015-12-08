// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.kik.android.a;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikPromotedChatsFragment

final class oc
    implements android.widget.AdapterView.OnItemClickListener
{

    final KikPromotedChatsFragment a;

    oc(KikPromotedChatsFragment kikpromotedchatsfragment)
    {
        a = kikpromotedchatsfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = ((AdapterView) (adapterview.getItemAtPosition(i)));
            if (adapterview instanceof k)
            {
                adapterview = (k)adapterview;
                if (adapterview != null)
                {
                    view = adapterview.b();
                    String s = adapterview.e();
                    a.l.b("Suggested Chat Click").a("Bots", new String[] {
                        s
                    }).a("Is Contact", adapterview.l()).b();
                    if (!adapterview.m() && adapterview.p())
                    {
                        break label0;
                    }
                    a.b(view);
                }
            }
            return;
        }
        a.a(view);
    }
}
