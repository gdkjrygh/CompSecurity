// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import android.content.ContentValues;
import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.TxnResult;
import com.soundcloud.propeller.WriteResult;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentRecord

public class StoreCommentCommand extends DefaultWriteStorageCommand
{

    private long lastRowId;

    public StoreCommentCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
        lastRowId = -1L;
    }

    private static ContentValues buildContentValues(CommentRecord commentrecord)
    {
        ContentValuesBuilder contentvaluesbuilder = ContentValuesBuilder.values();
        contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.Comments.URN, commentrecord.getUrn().toString());
        contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.Comments.TRACK_ID, commentrecord.getTrackUrn().getNumericId());
        contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.Comments.USER_ID, commentrecord.getUser().getUrn().getNumericId());
        contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.Comments.BODY, commentrecord.getBody());
        contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.Comments.CREATED_AT, commentrecord.getCreatedAt().getTime());
        contentvaluesbuilder.put(com.soundcloud.android.storage.Tables.Comments.TIMESTAMP, commentrecord.getTrackTime());
        return contentvaluesbuilder.get();
    }

    public long lastRowId()
    {
        return lastRowId;
    }

    protected TxnResult write(PropellerDatabase propellerdatabase, final CommentRecord comment)
    {
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (CommentRecord)obj);
    }



/*
    static long access$102(StoreCommentCommand storecommentcommand, long l)
    {
        storecommentcommand.lastRowId = l;
        return l;
    }

*/

    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StoreCommentCommand this$0;
        final CommentRecord val$comment;

        public void steps(PropellerDatabase propellerdatabase)
        {
            ContentValues contentvalues = StoreCommentCommand.buildContentValues(comment);
            step((WriteResult)(new StoreUsersCommand(propellerdatabase)).call(Collections.singleton(comment.getUser())));
            lastRowId = ((InsertResult)step(propellerdatabase.insert(com.soundcloud.android.storage.Tables.Comments.TABLE, contentvalues))).getRowId();
        }

        _cls1()
        {
            this$0 = StoreCommentCommand.this;
            comment = commentrecord;
            super();
        }
    }

}
