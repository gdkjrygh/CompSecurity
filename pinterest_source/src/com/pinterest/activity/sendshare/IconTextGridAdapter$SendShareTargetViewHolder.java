// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;

// Referenced classes of package com.pinterest.activity.sendshare:
//            IconTextGridAdapter

public class _cls1 extends android.support.v7.widget.Holder
{

    ImageView _iconIv;
    com.pinterest.adapter.ViewHolder._iconIv _item;
    TextView _textTv;
    final IconTextGridAdapter this$0;

    public void bind(com.pinterest.adapter.ViewHolder viewholder)
    {
        _item = viewholder;
        _textTv.setText(viewholder._textTv);
        _iconIv.setImageDrawable(viewholder._iconIv);
        _iconIv.setBackgroundResource(0x7f0e00b0);
        int i = (int)_iconIv.getResources().getDimension(0x7f0a0161);
        _iconIv.setPadding(i, i, i, i);
    }

    public _cls1.val.this._cls0(View view)
    {
        this.this$0 = IconTextGridAdapter.this;
        super(view);
        ButterKnife.a(this, view);
        class _cls1
            implements android.view.View.OnClickListener
        {

            final IconTextGridAdapter.SendShareTargetViewHolder this$1;
            final IconTextGridAdapter val$this$0;

            public void onClick(View view1)
            {
                IconTextGridAdapter.access$000(IconTextGridAdapter.SendShareTargetViewHolder.this.this$0).onItemClick(_item);
            }

            _cls1()
            {
                this$1 = IconTextGridAdapter.SendShareTargetViewHolder.this;
                this$0 = icontextgridadapter;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
    }
}
