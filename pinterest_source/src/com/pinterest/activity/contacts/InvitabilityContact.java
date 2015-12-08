// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.text.TextUtils;

public class InvitabilityContact
{

    private long _id;
    public String email;
    public String firstName;
    public boolean hasPhoto;
    public boolean isCloseFriend;
    public boolean isFacebookFriend;
    public String lastName;
    public String name;
    public int numPiecesOfInfo;
    public String phoneNumber;

    public InvitabilityContact(long l)
    {
        _id = l;
    }

    public long getId()
    {
        return _id;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format("{\"id\":%d,", new Object[] {
            Long.valueOf(_id)
        }));
        if (!TextUtils.isEmpty(name))
        {
            stringbuilder.append(String.format("\"name\":\"%s\",", new Object[] {
                name
            }));
        }
        if (!TextUtils.isEmpty(firstName))
        {
            stringbuilder.append(String.format("\"first_name\":\"%s\",", new Object[] {
                firstName
            }));
        }
        if (!TextUtils.isEmpty(lastName))
        {
            stringbuilder.append(String.format("\"last_name\":\"%s\",", new Object[] {
                lastName
            }));
        }
        if (!TextUtils.isEmpty(email))
        {
            stringbuilder.append(String.format("\"email\":\"%s\",", new Object[] {
                email
            }));
        }
        if (!TextUtils.isEmpty(phoneNumber))
        {
            stringbuilder.append(String.format("\"phone_number\":\"%s\",", new Object[] {
                phoneNumber
            }));
        }
        int i;
        if (hasPhoto)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        stringbuilder.append(String.format("\"has_photo\":%d,", new Object[] {
            Integer.valueOf(i)
        }));
        if (isCloseFriend)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        stringbuilder.append(String.format("\"is_close_friend\":%d,", new Object[] {
            Integer.valueOf(i)
        }));
        if (isFacebookFriend)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        stringbuilder.append(String.format("\"is_facebook_friend\":%d,", new Object[] {
            Integer.valueOf(i)
        }));
        stringbuilder.append(String.format("\"num_pieces_of_info\":%d}", new Object[] {
            Integer.valueOf(numPiecesOfInfo)
        }));
        return stringbuilder.toString();
    }
}
