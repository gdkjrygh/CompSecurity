// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import java.io.File;
import java.io.InputStream;
import twitter4j.AccountSettings;
import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.ResponseList;
import twitter4j.User;

public interface UsersResources
{

    public abstract User createBlock(long l);

    public abstract User createBlock(String s);

    public abstract User destroyBlock(long l);

    public abstract User destroyBlock(String s);

    public abstract AccountSettings getAccountSettings();

    public abstract IDs getBlocksIDs();

    public abstract IDs getBlocksIDs(long l);

    public abstract PagableResponseList getBlocksList();

    public abstract PagableResponseList getBlocksList(long l);

    public abstract ResponseList getContributees(long l);

    public abstract ResponseList getContributees(String s);

    public abstract ResponseList getContributors(long l);

    public abstract ResponseList getContributors(String s);

    public abstract ResponseList lookupUsers(long al[]);

    public abstract ResponseList lookupUsers(String as[]);

    public abstract void removeProfileBanner();

    public abstract ResponseList searchUsers(String s, int i);

    public abstract User showUser(long l);

    public abstract User showUser(String s);

    public abstract AccountSettings updateAccountSettings(Integer integer, Boolean boolean1, String s, String s1, String s2, String s3);

    public abstract User updateProfile(String s, String s1, String s2, String s3);

    public abstract User updateProfileBackgroundImage(File file, boolean flag);

    public abstract User updateProfileBackgroundImage(InputStream inputstream, boolean flag);

    public abstract void updateProfileBanner(File file);

    public abstract void updateProfileBanner(InputStream inputstream);

    public abstract User updateProfileColors(String s, String s1, String s2, String s3, String s4);

    public abstract User updateProfileImage(File file);

    public abstract User updateProfileImage(InputStream inputstream);

    public abstract User verifyCredentials();
}
