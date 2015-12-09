// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ProfileType

public interface UserProfile
{

    public abstract String getAvatarUrl();

    public abstract String getEmail();

    public abstract String getFirstName();

    public abstract String getGeoCountry();

    public abstract String[] getLanguages();

    public abstract String getLanguagesInCsv();

    public abstract List getLanguagesList();

    public abstract String getLastName();

    public abstract String getProfileId();

    public abstract String getProfileName();

    public abstract ProfileType getProfileType();

    public abstract String getReqCountry();

    public abstract String getUserId();

    public abstract boolean isAutoPlayEnabled();

    public abstract boolean isIQEnabled();

    public abstract boolean isKidsProfile();

    public abstract boolean isPrimaryProfile();

    public abstract boolean isSocialConnected();
}
