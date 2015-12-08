// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.propeller.InsertResult;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.Collections;

// Referenced classes of package com.soundcloud.android.comments:
//            StoreCommentCommand, CommentRecord

class  extends com.soundcloud.propeller.saction
{

    final StoreCommentCommand this$0;
    final CommentRecord val$comment;

    public void steps(PropellerDatabase propellerdatabase)
    {
        android.content.ContentValues contentvalues = StoreCommentCommand.access$000(val$comment);
        step((WriteResult)(new StoreUsersCommand(propellerdatabase)).call(Collections.singleton(val$comment.getUser())));
        StoreCommentCommand.access$102(StoreCommentCommand.this, ((InsertResult)step(propellerdatabase.insert(com.soundcloud.android.storage..step, contentvalues))).getRowId());
    }

    ()
    {
        this$0 = final_storecommentcommand;
        val$comment = CommentRecord.this;
        super();
    }
}
