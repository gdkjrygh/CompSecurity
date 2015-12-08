// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycOowFragment, KycUiModel

final class this._cls0
    implements OnActionListener
{

    final KycOowFragment this$0;

    private void onAction(Integer integer)
    {
        com.google.wallet.proto.features.erralQuestion erralquestion = KycOowFragment.access$000(KycOowFragment.this).getCurrentQuestion();
        com.google.wallet.proto.features.erralAnswer erralanswer = new com.google.wallet.proto.features.erralAnswer();
        erralanswer.questionId = erralquestion.questionId;
        erralanswer.answer = erralquestion.possibleAnswer[integer.intValue()];
        KycOowFragment.access$000(KycOowFragment.this).setReferralAnswer(KycOowFragment.access$000(KycOowFragment.this).getCurrentQuestionIndex(), erralanswer);
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Integer)obj);
    }

    ralQuestion()
    {
        this$0 = KycOowFragment.this;
        super();
    }
}
