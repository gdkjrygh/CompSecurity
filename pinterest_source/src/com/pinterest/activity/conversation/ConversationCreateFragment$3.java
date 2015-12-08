// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.utils.SignupFormUtils;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment, ConversationCreateAdapter

class this._cls0
    implements android.widget.er
{

    final ConversationCreateFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Object obj1;
        _peopleFacetSearchBar.getFocus();
        obj1 = (TypeAheadItem)ConversationCreateFragment.access$000(ConversationCreateFragment.this).getItem(i);
        if (((TypeAheadItem) (obj1)).getItemType() != com.pinterest.activity.search.model.PLACEHOLDER)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        obj1 = ConversationCreateFragment.access$100(ConversationCreateFragment.this);
        if (!SignupFormUtils.isEmailValid(((String) (obj1)))) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new TypeAheadItem();
        ((TypeAheadItem) (obj)).setItemType(com.pinterest.activity.search.model.CONTACT);
        ((TypeAheadItem) (obj)).setIdentifier(((String) (obj1)));
_L3:
        if (ConversationCreateFragment.access$200(ConversationCreateFragment.this).add(obj))
        {
            _peopleFacetSearchBar.onPersonSelected(((TypeAheadItem) (obj)));
            ConversationCreateFragment.access$000(ConversationCreateFragment.this).onPersonSelected(((TypeAheadItem) (obj)));
        } else
        {
            ConversationCreateFragment.access$200(ConversationCreateFragment.this).remove(obj);
            _peopleFacetSearchBar.onPersonUnselected(((TypeAheadItem) (obj)));
            ConversationCreateFragment.access$000(ConversationCreateFragment.this).onPersonUnselected(((TypeAheadItem) (obj)));
        }
        ConversationCreateFragment.access$000(ConversationCreateFragment.this).getView(i, view, adapterview);
        return;
_L2:
        Application.showToast(0x7f0702fa);
        return;
        obj = obj1;
        if (((TypeAheadItem) (obj1)).getItemType() == com.pinterest.activity.search.model.T_FB_PLACEHOLDER)
        {
            Events.post(new com.pinterest.base.nit>(com.pinterest.base.nit>));
            return;
        }
          goto _L3
    }

    ()
    {
        this$0 = ConversationCreateFragment.this;
        super();
    }
}
