// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.entitymanager;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.base.entitymanager:
//            TypedCursor, EntityUtil

public final class EntityCursor extends CursorWrapper
    implements TypedCursor
{

    private final int mBlobColumn;
    private final EntityUtil mEntityUtil;

    EntityCursor(Cursor cursor, int i, EntityUtil entityutil)
    {
        super(cursor);
        mBlobColumn = i;
        mEntityUtil = entityutil;
    }

    private MessageNano get()
    {
        byte abyte0[] = getBlob(mBlobColumn);
        MessageNano messagenano;
        try
        {
            messagenano = mEntityUtil.parseFrom(abyte0);
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            throw new IllegalStateException(invalidprotocolbuffernanoexception);
        }
        return messagenano;
    }

    public final volatile Object get()
    {
        return get();
    }
}
