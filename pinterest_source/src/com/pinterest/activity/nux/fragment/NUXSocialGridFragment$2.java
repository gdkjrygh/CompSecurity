// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.nux.adapter.NUXSocialGridAdapter;
import com.pinterest.activity.nux.view.NUXSocialGridCell;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXSocialGridFragment

class this._cls0
    implements android.widget.istener
{

    final NUXSocialGridFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (NUXSocialGridFragment.access$000(NUXSocialGridFragment.this) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        adapterview = NUXSocialGridCell.from(view, view.getContext());
        if (!adapterview.isFirstCell() || i != 0) goto _L4; else goto _L3
_L3:
        ((NUXSocialGridAdapter)NUXSocialGridFragment.access$100(NUXSocialGridFragment.this)).toggleCheckAllUsers();
_L6:
        if (((NUXSocialGridAdapter)NUXSocialGridFragment.access$500(NUXSocialGridFragment.this)).getCheckUsersSize() == 0 || ((NUXSocialGridAdapter)NUXSocialGridFragment.access$600(NUXSocialGridFragment.this)).getCheckUsersSize() == 1 && adapterview.isChecked())
        {
            NUXSocialGridFragment.access$800(NUXSocialGridFragment.this, ((NUXSocialGridAdapter)NUXSocialGridFragment.access$700(NUXSocialGridFragment.this)).isCheckedUsersEmpty());
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (!((NUXSocialGridAdapter)NUXSocialGridFragment.access$200(NUXSocialGridFragment.this)).isAllUsersChecked())
        {
            view = adapterview.getUser();
            ((NUXSocialGridAdapter)NUXSocialGridFragment.access$300(NUXSocialGridFragment.this)).toggleCheckUser(view);
            adapterview.setChecked(((NUXSocialGridAdapter)NUXSocialGridFragment.access$400(NUXSocialGridFragment.this)).isUserChecked(view));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!adapterview.isFirstCell() || ((NUXSocialGridAdapter)NUXSocialGridFragment.access$900(NUXSocialGridFragment.this)).getCheckUsersSize() != 0 && (((NUXSocialGridAdapter)NUXSocialGridFragment.access$1000(NUXSocialGridFragment.this)).getCheckUsersSize() != 1 || !((NUXSocialGridAdapter)NUXSocialGridFragment.access$1100(NUXSocialGridFragment.this)).isAllUsersChecked())) goto _L1; else goto _L7
_L7:
        NUXSocialGridFragment.access$800(NUXSocialGridFragment.this, ((NUXSocialGridAdapter)NUXSocialGridFragment.access$1200(NUXSocialGridFragment.this)).isCheckedUsersEmpty());
        return;
    }

    A()
    {
        this$0 = NUXSocialGridFragment.this;
        super();
    }
}
