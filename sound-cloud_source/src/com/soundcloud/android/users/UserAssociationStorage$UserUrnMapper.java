// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.users:
//            UserAssociationStorage

private class <init> extends RxResultMapper
{

    final UserAssociationStorage this$0;

    public Urn map(CursorReader cursorreader)
    {
        return Urn.forUser(cursorreader.getLong("_id"));
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
        this$0 = UserAssociationStorage.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
