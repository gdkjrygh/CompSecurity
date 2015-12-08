// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.view.View;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXHeaderView

class this._cls0
    implements android.view.ener
{

    final NUXHeaderView this$0;

    public void onClick(final View dialog)
    {
        dialog = new BaseDialog();
        if (NUXHeaderView.access$000(NUXHeaderView.this) == null || _skipListener == null)
        {
            return;
        } else
        {
            dialog.setTitle(NUXHeaderView.access$100(NUXHeaderView.this));
            dialog.setMessage(NUXHeaderView.access$200(NUXHeaderView.this));
            class _cls1
                implements android.view.View.OnClickListener
            {

                final NUXHeaderView._cls1 this$1;
                final BaseDialog val$dialog;

                public void onClick(View view)
                {
                    if (_skipListener != null)
                    {
                        _skipListener.skipFragment();
                    }
                    dialog.dismiss();
                }

            _cls1()
            {
                this$1 = NUXHeaderView._cls1.this;
                dialog = basedialog;
                super();
            }
            }

            dialog.setNegativeButton(NUXHeaderView.access$300(NUXHeaderView.this), new _cls1());
            class _cls2
                implements android.view.View.OnClickListener
            {

                final NUXHeaderView._cls1 this$1;
                final BaseDialog val$dialog;

                public void onClick(View view)
                {
                    dialog.dismiss();
                }

            _cls2()
            {
                this$1 = NUXHeaderView._cls1.this;
                dialog = basedialog;
                super();
            }
            }

            dialog.setPositiveButton(NUXHeaderView.access$000(NUXHeaderView.this), new _cls2());
            Events.post(new DialogEvent(dialog));
            return;
        }
    }

    _cls2()
    {
        this$0 = NUXHeaderView.this;
        super();
    }
}
