// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona

class this._cls0
    implements android.widget.ckListener
{

    final DominosNinaPersona this$0;

    public void onItemClick(final AdapterView parent, View view, final int position, long l)
    {
        class _cls1
            implements Runnable
        {

            final DominosNinaPersona._cls2 this$1;
            final AdapterView val$parent;
            final int val$position;

            public void run()
            {
                DominosNinaPersona.access$000(this$0).closeHints();
                DominosNinaPersona.access$100(this$0).n();
                String s = (String)parent.getItemAtPosition(position);
                DominosNinaPersona.access$100(this$0).b(s);
            }

            _cls1()
            {
                this$1 = DominosNinaPersona._cls2.this;
                parent = adapterview;
                position = i;
                super();
            }
        }

        (new Thread(new _cls1())).start();
    }

    _cls1()
    {
        this$0 = DominosNinaPersona.this;
        super();
    }
}
