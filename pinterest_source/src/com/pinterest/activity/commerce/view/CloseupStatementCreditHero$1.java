// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            CloseupStatementCreditHero

class this._cls0 extends ClickableSpan
{

    final CloseupStatementCreditHero this$0;

    public void onClick(View view)
    {
        Events.post(new Navigation(Location.BROWSER, "https://help.pinterest.com/en/articles/mastercard-statement-credit"));
    }

    public void updateDrawState(TextPaint textpaint)
    {
        textpaint.setFakeBoldText(true);
    }

    ()
    {
        this$0 = CloseupStatementCreditHero.this;
        super();
    }
}
