// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import rx.a.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentsOperations

final class this._cls0 extends a
{

    final CommentsOperations this$0;

    public final volatile Object call(Object obj)
    {
        return call((tion)obj);
    }

    public final b call(tion tion)
    {
        if (tion.getNextHref() != null)
        {
            return CommentsOperations.access$000(CommentsOperations.this, tion.getNextHref());
        } else
        {
            return a.finish();
        }
    }

    tion()
    {
        this$0 = CommentsOperations.this;
        super();
    }
}
