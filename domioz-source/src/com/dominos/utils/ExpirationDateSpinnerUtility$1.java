// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.widget.Spinner;

// Referenced classes of package com.dominos.utils:
//            ExpirationDateSpinnerUtility

class this._cls0
    implements Runnable
{

    final ExpirationDateSpinnerUtility this$0;

    public void run()
    {
        class _cls1
            implements android.widget.AdapterView.OnItemSelectedListener
        {

            final ExpirationDateSpinnerUtility._cls1 this$1;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                if (adapterview.getSelectedItemPosition() > 0)
                {
                    ExpirationDateSpinnerUtility.access$000(this$0).performClick();
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            _cls1()
            {
                this$1 = ExpirationDateSpinnerUtility._cls1.this;
                super();
            }
        }

        ExpirationDateSpinnerUtility.access$100(ExpirationDateSpinnerUtility.this).setOnItemSelectedListener(new _cls1());
    }

    _cls1()
    {
        this$0 = ExpirationDateSpinnerUtility.this;
        super();
    }
}
