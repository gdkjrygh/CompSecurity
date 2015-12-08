// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.favorites;

import com.skype.PROPKEY;
import com.skype.Proptable;
import com.skype.android.util.ImageSource;

public class Favorite
    implements ImageSource
{

    static final PROPKEY CONVERSATION_PROPKEYS[];
    private int index;
    private Proptable table;

    Favorite(Proptable proptable, int i)
    {
        table = proptable;
        index = i;
    }

    public int getConversationObjectId()
    {
        return table.getObjectID(index);
    }

    public String getDisplayName()
    {
        return table.getStr(index, PROPKEY.CONVERSATION_DISPLAYNAME.toInt());
    }

    public String getIdentity()
    {
        return table.getStr(index, PROPKEY.CONVERSATION_IDENTITY.toInt());
    }

    public byte[] getImageData()
    {
        return table.getBin(index, PROPKEY.CONVERSATION_META_PICTURE.toInt());
    }

    public long getImageTimestamp()
    {
        return 0L;
    }

    public String getPicture()
    {
        return table.getStr(index, PROPKEY.CONVERSATION_PICTURE.toInt());
    }

    public boolean isDialog()
    {
        return com.skype.Conversation.TYPE.fromInt(table.getInt(index, PROPKEY.CONVERSATION_TYPE.toInt())) == com.skype.Conversation.TYPE.DIALOG;
    }

    static 
    {
        CONVERSATION_PROPKEYS = (new PROPKEY[] {
            PROPKEY.CONVERSATION_IDENTITY, PROPKEY.CONVERSATION_DISPLAYNAME, PROPKEY.CONVERSATION_META_PICTURE, PROPKEY.CONVERSATION_TYPE, PROPKEY.CONVERSATION_CREATION_TIMESTAMP, PROPKEY.CONVERSATION_PICTURE
        });
    }
}
