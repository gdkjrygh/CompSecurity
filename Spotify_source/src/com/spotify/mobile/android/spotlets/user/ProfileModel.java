// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import eso;
import fko;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            ProfileV2VolatileModel, ProfileV2Model, InvitationCodeModel, PlaylistModel, 
//            TopArtistModel

public class ProfileModel
    implements JacksonModel
{

    private final eso mFollowData;
    private final String mFullName;
    private boolean mHasRecentShares;
    private final String mImageUrl;
    private final InvitationCodeModel mInvitationCodes[];
    private final boolean mIsVerified;
    private final int mPlaylistCount;
    private final PlaylistModel mPlaylists[];
    private final TopArtistModel mTopArtists[];
    private final Integer mTotalInvitationCodes;
    private final String mUri;
    private final String mUsername;

    public ProfileModel(String s, String s1, int i, int j, int k, String s2, boolean flag, 
            String s3, String s4, boolean flag1, PlaylistModel aplaylistmodel[], TopArtistModel atopartistmodel[], InvitationCodeModel ainvitationcodemodel[], Integer integer)
    {
        if (s != null)
        {
            mUri = s;
        } else
        if (s3 != null)
        {
            mUri = s3;
        } else
        if (s4 != null)
        {
            mUri = s4;
        } else
        {
            Assertion.a("A ProfileModel must have a uri");
            mUri = null;
        }
        mUsername = Uri.decode(fko.c(mUri));
        mFullName = s1;
        mPlaylistCount = i;
        mImageUrl = s2;
        mFollowData = new eso(mUri, j, k, flag);
        mIsVerified = flag1;
        mPlaylists = aplaylistmodel;
        mTopArtists = atopartistmodel;
        mInvitationCodes = ainvitationcodemodel;
        mTotalInvitationCodes = integer;
    }

    public static ProfileModel create(ProfileV2VolatileModel profilev2volatilemodel, ProfileV2Model profilev2model)
    {
        profilev2model = new ProfileModel(profilev2volatilemodel.mUri, profilev2volatilemodel.mFullName, profilev2volatilemodel.mPlaylistCount, profilev2volatilemodel.mFollowersCount, profilev2volatilemodel.mFollowingCount, profilev2volatilemodel.mImageUrl, profilev2volatilemodel.mIsFollowing, profilev2volatilemodel.mUserUri, profilev2volatilemodel.mArtistUri, profilev2volatilemodel.mIsVerified, profilev2model.mPlaylists, profilev2model.mTopArtists, profilev2model.mInvitationCodes, profilev2model.mTotalInvitationCodes);
        profilev2model.setHasRecentShares(profilev2volatilemodel.mHasRecentShares);
        return profilev2model;
    }

    private void setHasRecentShares(boolean flag)
    {
        mHasRecentShares = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ProfileModel)obj;
            if (mHasRecentShares != ((ProfileModel) (obj)).mHasRecentShares)
            {
                return false;
            }
            if (mPlaylistCount != ((ProfileModel) (obj)).mPlaylistCount)
            {
                return false;
            }
            if (mFollowData == null ? ((ProfileModel) (obj)).mFollowData != null : !mFollowData.equals(((ProfileModel) (obj)).mFollowData))
            {
                return false;
            }
            if (mFullName == null ? ((ProfileModel) (obj)).mFullName != null : !mFullName.equals(((ProfileModel) (obj)).mFullName))
            {
                return false;
            }
            if (mImageUrl == null ? ((ProfileModel) (obj)).mImageUrl != null : !mImageUrl.equals(((ProfileModel) (obj)).mImageUrl))
            {
                return false;
            }
            if (!Arrays.equals(mInvitationCodes, ((ProfileModel) (obj)).mInvitationCodes))
            {
                return false;
            }
            if (!Arrays.equals(mPlaylists, ((ProfileModel) (obj)).mPlaylists))
            {
                return false;
            }
            if (!Arrays.equals(mTopArtists, ((ProfileModel) (obj)).mTopArtists))
            {
                return false;
            }
            if (mTotalInvitationCodes == null ? ((ProfileModel) (obj)).mTotalInvitationCodes != null : !mTotalInvitationCodes.equals(((ProfileModel) (obj)).mTotalInvitationCodes))
            {
                return false;
            }
            if (!mUri.equals(((ProfileModel) (obj)).mUri))
            {
                return false;
            }
            if (mUsername == null ? ((ProfileModel) (obj)).mUsername != null : !mUsername.equals(((ProfileModel) (obj)).mUsername))
            {
                return false;
            }
        }
        return true;
    }

    public String getDisplayName()
    {
        if (TextUtils.isEmpty(mFullName))
        {
            return mUsername;
        } else
        {
            return mFullName;
        }
    }

    public eso getFollowData()
    {
        return mFollowData;
    }

    public int getFollowersCount()
    {
        return mFollowData.c;
    }

    public int getFollowingCount()
    {
        return mFollowData.b;
    }

    public String getFullName()
    {
        return mFullName;
    }

    public String getImageHttpUrl()
    {
        return mImageUrl;
    }

    public InvitationCodeModel[] getInvitationCodes()
    {
        return mInvitationCodes;
    }

    public Integer getInvitationCodesCount()
    {
        return mTotalInvitationCodes;
    }

    public int getPlaylistCount()
    {
        return mPlaylistCount;
    }

    public PlaylistModel[] getPlaylists()
    {
        return mPlaylists;
    }

    public TopArtistModel[] getTopArtists()
    {
        return mTopArtists;
    }

    public String getUri()
    {
        return mUri;
    }

    public String getUsername()
    {
        return mUsername;
    }

    public boolean hasMoreInvitationCodes()
    {
        return mTotalInvitationCodes != null && mInvitationCodes != null && mTotalInvitationCodes.intValue() > mInvitationCodes.length;
    }

    public boolean hasRecentShares()
    {
        return mHasRecentShares;
    }

    public int hashCode()
    {
        int i2 = 0;
        int j2 = mUri.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int k2;
        if (mUsername != null)
        {
            i = mUsername.hashCode();
        } else
        {
            i = 0;
        }
        if (mFullName != null)
        {
            j = mFullName.hashCode();
        } else
        {
            j = 0;
        }
        k2 = mPlaylistCount;
        if (mImageUrl != null)
        {
            k = mImageUrl.hashCode();
        } else
        {
            k = 0;
        }
        if (mFollowData != null)
        {
            l = mFollowData.hashCode();
        } else
        {
            l = 0;
        }
        if (mPlaylists != null)
        {
            i1 = Arrays.hashCode(mPlaylists);
        } else
        {
            i1 = 0;
        }
        if (mTopArtists != null)
        {
            j1 = Arrays.hashCode(mTopArtists);
        } else
        {
            j1 = 0;
        }
        if (mInvitationCodes != null)
        {
            k1 = Arrays.hashCode(mInvitationCodes);
        } else
        {
            k1 = 0;
        }
        if (mTotalInvitationCodes != null)
        {
            l1 = mTotalInvitationCodes.hashCode();
        } else
        {
            l1 = 0;
        }
        if (mHasRecentShares)
        {
            i2 = 1;
        }
        return (l1 + (k1 + (j1 + (i1 + (l + (k + ((j + (i + j2 * 31) * 31) * 31 + k2) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i2;
    }

    public boolean isFollowing()
    {
        return mFollowData.d;
    }

    public boolean isVerified()
    {
        return mIsVerified;
    }

    public String toString()
    {
        return String.format(Locale.US, "uri: %s  username: %s  fullname: %s  playlistCount: %s, imageUrl: %s  followData: %s", new Object[] {
            mUri, mUsername, mFullName, Integer.valueOf(mPlaylistCount), mImageUrl, mFollowData
        });
    }
}
