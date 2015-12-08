// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import de.greenrobot.dao.Property;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            RankedUserDao

public static class 
{

    public static final Property AboutMe = new Property(1, java/lang/String, "aboutMe", false, "ABOUT_ME");
    public static final Property Active = new Property(29, java/lang/Boolean, "active", false, "ACTIVE");
    public static final Property AreFriendshipsPublic = new Property(30, java/lang/Boolean, "areFriendshipsPublic", false, "ARE_FRIENDSHIPS_PUBLIC");
    public static final Property Avatar = new Property(2, java/lang/String, "avatar", false, "AVATAR");
    public static final Property ChallengesBeta = new Property(27, java/lang/Boolean, "challengesBeta", false, "CHALLENGES_BETA");
    public static final Property City = new Property(3, java/lang/String, "city", false, "CITY");
    public static final Property ContactId;
    public static final Property Country = new Property(4, java/lang/String, "country", false, "COUNTRY");
    public static final Property DisplayName = new Property(5, java/lang/String, "displayName", false, "DISPLAY_NAME");
    public static final Property Email = new Property(20, java/lang/String, "email", false, "EMAIL");
    public static final Property EncodedId = new Property(6, java/lang/String, "encodedId", false, "ENCODED_ID");
    public static final Property EntityStatus = new Property(15, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
    public static final Property FriendshipOldStatus = new Property(18, java/lang/Integer, "friendshipOldStatus", false, "FRIENDSHIP_OLD_STATUS");
    public static final Property FriendshipStatus = new Property(17, java/lang/Integer, "friendshipStatus", false, "FRIENDSHIP_STATUS");
    public static final Property FullName = new Property(7, java/lang/String, "fullName", false, "FULL_NAME");
    public static final Property Gender = new Property(8, java/lang/String, "gender", false, "GENDER");
    public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
    public static final Property InviteDate = new Property(25, java/util/Date, "inviteDate", false, "INVITE_DATE");
    public static final Property InviteId = new Property(22, java/lang/Long, "inviteId", false, "INVITE_ID");
    public static final Property IsFromContactBook = new Property(26, java/lang/Boolean, "isFromContactBook", false, "IS_FROM_CONTACT_BOOK");
    public static final Property IsFromFacebook = new Property(28, java/lang/Boolean, "isFromFacebook", false, "IS_FROM_FACEBOOK");
    public static final Property IsNewInvite = new Property(23, java/lang/Boolean, "isNewInvite", false, "IS_NEW_INVITE");
    public static final Property JoinedDate = new Property(24, java/util/Date, "joinedDate", false, "JOINED_DATE");
    public static final Property Nickname = new Property(9, java/lang/String, "nickname", false, "NICKNAME");
    public static final Property Postal = new Property(21, java/lang/String, "postal", false, "POSTAL");
    public static final Property State = new Property(11, java/lang/String, "state", false, "STATE");
    public static final Property StepsAverage = new Property(16, java/lang/Long, "stepsAverage", false, "STEPS_AVERAGE");
    public static final Property StepsSummary = new Property(14, java/lang/Long, "stepsSummary", false, "STEPS_SUMMARY");
    public static final Property TimeCreated = new Property(13, java/util/Date, "timeCreated", false, "TIME_CREATED");
    public static final Property Timezone = new Property(12, java/lang/String, "timezone", false, "TIMEZONE");
    public static final Property TimezoneOffset = new Property(10, java/lang/Long, "timezoneOffset", false, "TIMEZONE_OFFSET");

    static 
    {
        ContactId = new Property(19, Long.TYPE, "contactId", false, "CONTACT_ID");
    }

    public ()
    {
    }
}
