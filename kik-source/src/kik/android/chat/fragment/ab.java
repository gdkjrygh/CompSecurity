// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.kik.android.a;
import kik.android.chat.b.b;
import kik.android.chat.b.d;

// Referenced classes of package kik.android.chat.fragment:
//            ChatBubbleSelectionFragment

final class ab
    implements android.widget.AdapterView.OnItemClickListener
{

    final ChatBubbleSelectionFragment a;

    ab(ChatBubbleSelectionFragment chatbubbleselectionfragment)
    {
        a = chatbubbleselectionfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (b)a._bubbleList.getItemAtPosition(i);
        a.a.a(adapterview);
        kik.android.chat.fragment.ChatBubbleSelectionFragment.a(a, adapterview);
        if (adapterview != null)
        {
            a.b.b("Chat Bubble Colour Tapped").a("Name", adapterview.e()).b();
        }
    }
}
