// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.Participant;
import com.skype.android.util.ContactUtil;
import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.calling:
//            CallRosterFragment

private final class collator
    implements Comparator
{

    private Collator collator;
    final compare this$1;

    public final int compare(Participant participant, Participant participant1)
    {
        participant = cess._mth000(this._cls1.this, participant);
        participant1 = cess._mth000(this._cls1.this, participant1);
        participant = contactUtil.l(participant);
        participant1 = contactUtil.l(participant1);
        return collator.compare(participant, participant1);
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((Participant)obj, (Participant)obj1);
    }

    public ()
    {
        this$1 = this._cls1.this;
        super();
        collator = Collator.getInstance();
        collator.setStrength(0);
    }
}
