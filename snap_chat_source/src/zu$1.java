// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.snapchat.android.model.StoryGroup;
import com.snapchat.android.util.AlertDialogUtils;

final class lang.Object
    implements android.view.OnClickListener
{

    private zu a;

    public final void onClick(View view)
    {
        view = new FU(a.o, a.r);
        ((FU) (view)).b.a(com.snapchat.android.model.Group.ActionState.CONFIRMING_SAVE);
        Resources resources = ((FU) (view)).a.getResources();
        if (Bt.aU())
        {
            AlertDialogUtils.a(((FU) (view)).a, resources.getString(0x7f080227), resources.getString(0x7f080225), false, new <init>(view));
            return;
        } else
        {
            view.a();
            return;
        }
    }

    >(zu zu1)
    {
        a = zu1;
        super();
    }
}
