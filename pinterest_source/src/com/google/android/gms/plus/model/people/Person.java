// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface Person
    extends Freezable
{

    public abstract String getAboutMe();

    public abstract AgeRange getAgeRange();

    public abstract String getBirthday();

    public abstract String getBraggingRights();

    public abstract int getCircledByCount();

    public abstract Cover getCover();

    public abstract String getCurrentLocation();

    public abstract String getDisplayName();

    public abstract int getGender();

    public abstract String getId();

    public abstract Image getImage();

    public abstract String getLanguage();

    public abstract Name getName();

    public abstract String getNickname();

    public abstract int getObjectType();

    public abstract List getOrganizations();

    public abstract List getPlacesLived();

    public abstract int getPlusOneCount();

    public abstract int getRelationshipStatus();

    public abstract String getTagline();

    public abstract String getUrl();

    public abstract List getUrls();

    public abstract boolean hasAboutMe();

    public abstract boolean hasAgeRange();

    public abstract boolean hasBirthday();

    public abstract boolean hasBraggingRights();

    public abstract boolean hasCircledByCount();

    public abstract boolean hasCover();

    public abstract boolean hasCurrentLocation();

    public abstract boolean hasDisplayName();

    public abstract boolean hasGender();

    public abstract boolean hasId();

    public abstract boolean hasImage();

    public abstract boolean hasIsPlusUser();

    public abstract boolean hasLanguage();

    public abstract boolean hasName();

    public abstract boolean hasNickname();

    public abstract boolean hasObjectType();

    public abstract boolean hasOrganizations();

    public abstract boolean hasPlacesLived();

    public abstract boolean hasPlusOneCount();

    public abstract boolean hasRelationshipStatus();

    public abstract boolean hasTagline();

    public abstract boolean hasUrl();

    public abstract boolean hasUrls();

    public abstract boolean hasVerified();

    public abstract boolean isPlusUser();

    public abstract boolean isVerified();
}
