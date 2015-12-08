// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import java.io.File;
import java.io.InputStream;

public interface UsersResourcesAsync
{

    public abstract void createBlock(long l);

    public abstract void createBlock(String s);

    public abstract void createMute(long l);

    public abstract void createMute(String s);

    public abstract void destroyBlock(long l);

    public abstract void destroyBlock(String s);

    public abstract void destroyMute(long l);

    public abstract void destroyMute(String s);

    public abstract void getAccountSettings();

    public abstract void getBlocksIDs();

    public abstract void getBlocksIDs(long l);

    public abstract void getBlocksList();

    public abstract void getBlocksList(long l);

    public abstract void getContributees(long l);

    public abstract void getContributees(String s);

    public abstract void getContributors(long l);

    public abstract void getContributors(String s);

    public abstract void getMutesIDs(long l);

    public abstract void getMutesList(long l);

    public abstract void lookupUsers(long al[]);

    public abstract void lookupUsers(String as[]);

    public abstract void removeProfileBanner();

    public abstract void searchUsers(String s, int i);

    public abstract void showUser(long l);

    public abstract void showUser(String s);

    public abstract void updateAccountSettings(Integer integer, Boolean boolean1, String s, String s1, String s2, String s3);

    public abstract void updateProfile(String s, String s1, String s2, String s3);

    public abstract void updateProfileBackgroundImage(File file, boolean flag);

    public abstract void updateProfileBackgroundImage(InputStream inputstream, boolean flag);

    public abstract void updateProfileBanner(File file);

    public abstract void updateProfileBanner(InputStream inputstream);

    public abstract void updateProfileColors(String s, String s1, String s2, String s3, String s4);

    public abstract void updateProfileImage(File file);

    public abstract void updateProfileImage(InputStream inputstream);

    public abstract void verifyCredentials();
}
