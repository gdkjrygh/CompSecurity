// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.kit.application.Resources;

public class PeoplePickerPersonCell extends PersonListCell
{

    private TypeAheadItem _item;

    public PeoplePickerPersonCell(Context context)
    {
        super(context);
    }

    public PeoplePickerPersonCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void loadImage()
    {
        if (_item.getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONNECT_FB_PLACEHOLDER)
        {
            setImage(0x7f02016c);
            return;
        }
        if (_item.getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_PLACEHOLDER)
        {
            setImage(0x7f02016b);
            return;
        }
        if (_item.getImageUri() != null)
        {
            setImage(_item.getImageUri());
            return;
        } else
        {
            setImage(0x7f020182);
            return;
        }
    }

    protected void setDesc()
    {
        String s = null;
        _cls1..SwitchMap.com.pinterest.activity.search.model.TypeAheadItem.ItemType[_item.getItemType().ordinal()];
        JVM INSTR tableswitch 1 7: default 60
    //                   1 66
    //                   2 66
    //                   3 77
    //                   4 86
    //                   5 95
    //                   6 95
    //                   7 106;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L5 _L6
_L1:
        setDesc(s);
        return;
_L2:
        s = _item.getIdentifier();
        continue; /* Loop/switch isn't completed */
_L3:
        s = Resources.string(0x7f070380);
        continue; /* Loop/switch isn't completed */
_L4:
        s = Resources.string(0x7f070280);
        continue; /* Loop/switch isn't completed */
_L5:
        s = _item.getUid();
        continue; /* Loop/switch isn't completed */
_L6:
        s = Resources.string(0x7f070422);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setItem(TypeAheadItem typeaheaditem)
    {
        _item = typeaheaditem;
        setTitle(_item.getTitle());
        setDesc();
        loadImage();
    }

    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.TypeAheadItem.ItemType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.PHONE_CONTACT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.MUTUAL_FOLLOW.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.FACEBOOK_CONTACT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.YAHOO_CONTACT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.GOOGLE_CONTACT.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[com.pinterest.activity.search.model.TypeAheadItem.ItemType.PINNER.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
