// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.text.TextUtils;
import com.skype.PROPKEY;
import com.skype.Proptable;

final class b
{

    static final PROPKEY PROPKEYS[];
    private int index;
    private Proptable table;

    public b(Proptable proptable, int i)
    {
        table = proptable;
        index = i;
    }

    public final com.skype.Contact.AVAILABILITY getAvailability()
    {
        return com.skype.Contact.AVAILABILITY.fromInt(table.getInt(index, PROPKEY.CONTACT_AVAILABILITY.toInt()));
    }

    public final byte[] getAvatar()
    {
        return table.getBin(index, PROPKEY.CONTACT_AVATAR_IMAGE.toInt());
    }

    public final String getDisplayName()
    {
        String s1 = table.getStr(index, PROPKEY.CONTACT_DISPLAYNAME.toInt());
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getIdentity();
        }
        return s;
    }

    public final String getIdentity()
    {
        return table.getStr(index, PROPKEY.CONTACT_SKYPENAME.toInt());
    }

    public final int getIntProperty(PROPKEY propkey)
    {
        return table.getInt(index, propkey.toInt());
    }

    public final String getStrProperty(PROPKEY propkey)
    {
        return table.getStr(index, propkey.toInt());
    }

    public final com.skype.Contact.TYPE getType()
    {
        return com.skype.Contact.TYPE.fromInt(table.getInt(index, PROPKEY.CONTACT_TYPE.toInt()));
    }

    public final boolean isBlocked()
    {
        return table.getInt(index, PROPKEY.USER_ISBLOCKED.toInt()) > 0;
    }

    static 
    {
        PROPKEYS = (new PROPKEY[] {
            PROPKEY.CONTACT_SKYPENAME, PROPKEY.CONTACT_DISPLAYNAME, PROPKEY.CONTACT_TYPE, PROPKEY.CONTACT_AVAILABILITY, PROPKEY.CONTACT_COUNTRY, PROPKEY.CONTACT_PROVINCE, PROPKEY.CONTACT_CITY, PROPKEY.CONTACT_BIRTHDAY, PROPKEY.CONTACT_PROFILE_TIMESTAMP, PROPKEY.CONTACT_MOOD_TEXT, 
            PROPKEY.CONTACT_MOOD_TIMESTAMP, PROPKEY.CONTACT_AVATAR_IMAGE, PROPKEY.CONTACT_AVATAR_TIMESTAMP, PROPKEY.CONTACT_HOMEPAGE, PROPKEY.CONTACT_PHONE_HOME, PROPKEY.CONTACT_PHONE_OFFICE, PROPKEY.CONTACT_PHONE_MOBILE, PROPKEY.USER_ISBLOCKED
        });
    }
}
