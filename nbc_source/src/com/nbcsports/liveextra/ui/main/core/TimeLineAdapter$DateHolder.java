// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.view.View;
import java.util.List;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            TimeLineAdapter, TimelineItemView

public class this._cls0 extends android.support.v7.widget.DateHolder
    implements android.view.iewHolder
{

    final TimeLineAdapter this$0;

    public void bind(DateTime datetime)
    {
        ((TimelineItemView)itemView).bind(datetime);
        datetime = itemView;
        boolean flag;
        if (getPosition() == TimeLineAdapter.access$000(TimeLineAdapter.this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        datetime.setSelected(flag);
    }

    public void onClick(View view)
    {
        selectItem(getPosition());
        itemView.setSelected(true);
        TimeLineAdapter.access$200(TimeLineAdapter.this).onItemClick((DateTime)TimeLineAdapter.access$100(TimeLineAdapter.this).get(getPosition()));
    }

    public Listener(View view)
    {
        this$0 = TimeLineAdapter.this;
        super(view);
        view.setOnClickListener(this);
    }
}
