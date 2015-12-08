// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.res.Resources;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.activities.Activities;
import com.soundcloud.android.api.legacy.model.activities.Activity;
import java.util.List;

// Referenced classes of package com.soundcloud.android.sync:
//            NotificationMessage

static class res
{

    private Activities allActivitiesToNotify;
    private Activities comments;
    private Activities followers;
    private Activities likes;
    private Activities reposts;
    private final Resources res;

    private NotificationMessage buildCommentsOnlyNotification()
    {
        Object obj = comments.getUniquePlayables();
        List list = comments.getUniqueUsers();
        String s = res.getQuantityString(0x7f090003, comments.size(), new Object[] {
            Integer.valueOf(comments.size())
        });
        String s1 = res.getQuantityString(0x7f090007, comments.size(), new Object[] {
            Integer.valueOf(comments.size())
        });
        if (((List) (obj)).size() == 1)
        {
            if (comments.size() == 1)
            {
                obj = res.getString(0x7f070103, new Object[] {
                    ((Playable)((List) (obj)).get(0)).title, ((Activity)comments.get(0)).getUser().username
                });
            } else
            if (comments.size() == 2)
            {
                obj = res.getString(0x7f070105, new Object[] {
                    Integer.valueOf(comments.size()), ((Playable)((List) (obj)).get(0)).title, ((Activity)comments.get(0)).getUser().username, ((Activity)comments.get(1)).getUser().username
                });
            } else
            {
                obj = res.getString(0x7f070104, new Object[] {
                    Integer.valueOf(comments.size()), ((Playable)((List) (obj)).get(0)).title, ((Activity)comments.get(0)).getUser().username, ((Activity)comments.get(1)).getUser().username
                });
            }
        } else
        if (list.size() == 1)
        {
            obj = res.getString(0x7f070101, new Object[] {
                ((PublicApiUser)list.get(0)).username
            });
        } else
        if (list.size() == 2)
        {
            obj = res.getString(0x7f070106, new Object[] {
                ((PublicApiUser)list.get(0)).username, ((PublicApiUser)list.get(1)).username
            });
        } else
        {
            obj = res.getString(0x7f070102, new Object[] {
                ((PublicApiUser)list.get(0)).username, ((PublicApiUser)list.get(1)).username
            });
        }
        return new NotificationMessage(s1, ((CharSequence) (obj)), s, null);
    }

    private NotificationMessage buildFollowersOnlyNotification()
    {
        Object obj = followers.getUniqueUsers();
        String s = res.getQuantityString(0x7f090001, ((List) (obj)).size(), new Object[] {
            Integer.valueOf(((List) (obj)).size())
        });
        String s1 = res.getQuantityString(0x7f090001, ((List) (obj)).size(), new Object[] {
            Integer.valueOf(((List) (obj)).size())
        });
        if (((List) (obj)).size() == 1)
        {
            obj = res.getString(0x7f070108, new Object[] {
                ((PublicApiUser)((List) (obj)).get(0)).getDisplayName()
            });
        } else
        if (((List) (obj)).size() == 2)
        {
            obj = res.getString(0x7f07010a, new Object[] {
                ((PublicApiUser)((List) (obj)).get(0)).getDisplayName(), ((PublicApiUser)((List) (obj)).get(1)).getDisplayName()
            });
        } else
        if (((List) (obj)).size() == 3)
        {
            obj = res.getString(0x7f070109, new Object[] {
                ((PublicApiUser)((List) (obj)).get(0)).getDisplayName(), ((PublicApiUser)((List) (obj)).get(1)).getDisplayName()
            });
        } else
        {
            obj = res.getString(0x7f070107, new Object[] {
                ((PublicApiUser)((List) (obj)).get(0)).getDisplayName(), ((PublicApiUser)((List) (obj)).get(1)).getDisplayName(), Integer.valueOf(((List) (obj)).size() - 2)
            });
        }
        return new NotificationMessage(s1, ((CharSequence) (obj)), s, null);
    }

    private NotificationMessage buildLikesOnlyNotification()
    {
        Object obj = likes.getUniquePlayables();
        String s = res.getQuantityString(0x7f090004, likes.size(), new Object[] {
            Integer.valueOf(likes.size())
        });
        String s1 = res.getQuantityString(0x7f090008, likes.size(), new Object[] {
            Integer.valueOf(likes.size())
        });
        if (((List) (obj)).size() == 1 && likes.size() == 1)
        {
            obj = res.getString(0x7f07010e, new Object[] {
                ((Activity)likes.get(0)).getUser().username, ((Activity)likes.get(0)).getPlayable().title
            });
        } else
        if (((List) (obj)).size() == 1)
        {
            obj = res.getString(0x7f07010b, new Object[] {
                ((Playable)((List) (obj)).get(0)).title
            });
        } else
        if (((List) (obj)).size() == 2)
        {
            obj = res.getString(0x7f07010d, new Object[] {
                ((Playable)((List) (obj)).get(0)).title, ((Playable)((List) (obj)).get(1)).title
            });
        } else
        {
            obj = res.getString(0x7f07010c, new Object[] {
                ((Playable)((List) (obj)).get(0)).title, ((Playable)((List) (obj)).get(1)).title
            });
        }
        return new NotificationMessage(s1, ((CharSequence) (obj)), s, null);
    }

    private NotificationMessage buildMixedActivitiesNotification()
    {
        Object obj = allActivitiesToNotify.getUniquePlayables();
        List list = allActivitiesToNotify.getUniqueUsers();
        String s = res.getQuantityString(0x7f090002, allActivitiesToNotify.size(), new Object[] {
            Integer.valueOf(allActivitiesToNotify.size())
        });
        String s1 = res.getQuantityString(0x7f090006, allActivitiesToNotify.size(), new Object[] {
            Integer.valueOf(allActivitiesToNotify.size())
        });
        if (list.size() == 1)
        {
            if (((List) (obj)).size() == 1)
            {
                obj = res.getString(0x7f0700fe, new Object[] {
                    ((PublicApiUser)list.get(0)).username, ((Playable)((List) (obj)).get(0)).title
                });
            } else
            {
                obj = res.getString(0x7f0700fd, new Object[] {
                    ((PublicApiUser)list.get(0)).username
                });
            }
        } else
        if (list.size() == 2)
        {
            obj = res.getString(0x7f070100, new Object[] {
                ((PublicApiUser)list.get(0)).username, ((PublicApiUser)list.get(1)).username
            });
        } else
        {
            obj = res.getString(0x7f0700ff, new Object[] {
                ((PublicApiUser)list.get(0)).username, ((PublicApiUser)list.get(1)).username
            });
        }
        return new NotificationMessage(s1, ((CharSequence) (obj)), s, null);
    }

    private NotificationMessage buildRepostsOnlyNotification()
    {
        Object obj = reposts.getUniquePlayables();
        String s = res.getQuantityString(0x7f090005, reposts.size(), new Object[] {
            Integer.valueOf(reposts.size())
        });
        String s1 = res.getQuantityString(0x7f090009, reposts.size(), new Object[] {
            Integer.valueOf(reposts.size())
        });
        if (((List) (obj)).size() == 1 && reposts.size() == 1)
        {
            obj = res.getString(0x7f07010f, new Object[] {
                ((Activity)reposts.get(0)).getUser().username, ((Activity)reposts.get(0)).getPlayable().title
            });
        } else
        if (((List) (obj)).size() == 1)
        {
            obj = res.getString(0x7f070110, new Object[] {
                ((Playable)((List) (obj)).get(0)).title
            });
        } else
        if (((List) (obj)).size() == 2)
        {
            obj = res.getString(0x7f070112, new Object[] {
                ((Playable)((List) (obj)).get(0)).title, ((Playable)((List) (obj)).get(1)).title
            });
        } else
        {
            obj = res.getString(0x7f070111, new Object[] {
                ((Playable)((List) (obj)).get(0)).title, ((Playable)((List) (obj)).get(1)).title
            });
        }
        return new NotificationMessage(s1, ((CharSequence) (obj)), s, null);
    }

    private boolean hasCommentsOnly()
    {
        return !comments.isEmpty() && likes.isEmpty() && reposts.isEmpty() && followers.isEmpty();
    }

    private boolean hasFollowersOnly()
    {
        return !followers.isEmpty() && likes.isEmpty() && comments.isEmpty() && reposts.isEmpty();
    }

    private boolean hasLikesOnly()
    {
        return !likes.isEmpty() && comments.isEmpty() && reposts.isEmpty() && followers.isEmpty();
    }

    private boolean hasRepostsOnly()
    {
        return !reposts.isEmpty() && likes.isEmpty() && comments.isEmpty() && followers.isEmpty();
    }

    NotificationMessage build()
    {
        if (hasRepostsOnly())
        {
            return buildRepostsOnlyNotification();
        }
        if (hasLikesOnly())
        {
            return buildLikesOnlyNotification();
        }
        if (hasCommentsOnly())
        {
            return buildCommentsOnlyNotification();
        }
        if (hasFollowersOnly())
        {
            return buildFollowersOnlyNotification();
        } else
        {
            return buildMixedActivitiesNotification();
        }
    }

    public ities setAllActivitiesToNotify(Activities activities)
    {
        allActivitiesToNotify = activities;
        return this;
    }

    public ities setComments(Activities activities)
    {
        comments = activities;
        return this;
    }

    public ities setFollowers(Activities activities)
    {
        followers = activities;
        return this;
    }

    public ities setLikes(Activities activities)
    {
        likes = activities;
        return this;
    }

    public ities setReposts(Activities activities)
    {
        reposts = activities;
        return this;
    }

    ities(Resources resources)
    {
        likes = Activities.EMPTY;
        comments = Activities.EMPTY;
        reposts = Activities.EMPTY;
        followers = Activities.EMPTY;
        allActivitiesToNotify = Activities.EMPTY;
        res = resources;
    }
}
