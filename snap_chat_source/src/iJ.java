// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class iJ extends kl
{

    private hR destination;
    private iP destinationPage;
    private final String eventName = "PROFILE_MY_FRIENDS_PAGE_EXIT";
    public Long myFriendBlockCount;
    public Long myFriendBlockInSearchCount;
    public Long myFriendCount;
    public Long myFriendNameEditCount;
    public Long myFriendNameEditInSearchCount;
    public Long myFriendReAddCount;
    public Long myFriendReAddInSearchCount;
    public Long myFriendRemoveCount;
    public Long myFriendRemoveInSearchCount;

    public iJ()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "PROFILE_MY_FRIENDS_PAGE_EXIT");
        if (destination != null)
        {
            hashmap.put("destination", destination);
        }
        if (destinationPage != null)
        {
            hashmap.put("destination_page", destinationPage);
        }
        if (myFriendBlockCount != null)
        {
            hashmap.put("my_friend_block_count", myFriendBlockCount);
        }
        if (myFriendBlockInSearchCount != null)
        {
            hashmap.put("my_friend_block_in_search_count", myFriendBlockInSearchCount);
        }
        if (myFriendCount != null)
        {
            hashmap.put("my_friend_count", myFriendCount);
        }
        if (myFriendNameEditCount != null)
        {
            hashmap.put("my_friend_name_edit_count", myFriendNameEditCount);
        }
        if (myFriendNameEditInSearchCount != null)
        {
            hashmap.put("my_friend_name_edit_in_search_count", myFriendNameEditInSearchCount);
        }
        if (myFriendReAddCount != null)
        {
            hashmap.put("my_friend_re_add_count", myFriendReAddCount);
        }
        if (myFriendReAddInSearchCount != null)
        {
            hashmap.put("my_friend_re_add_in_search_count", myFriendReAddInSearchCount);
        }
        if (myFriendRemoveCount != null)
        {
            hashmap.put("my_friend_remove_count", myFriendRemoveCount);
        }
        if (myFriendRemoveInSearchCount != null)
        {
            hashmap.put("my_friend_remove_in_search_count", myFriendRemoveInSearchCount);
        }
        hashmap.putAll(super.a());
        return hashmap;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (iJ)obj;
            if (destination == null ? ((iJ) (obj)).destination != null : !destination.equals(((iJ) (obj)).destination))
            {
                return false;
            }
            if (destinationPage == null ? ((iJ) (obj)).destinationPage != null : !destinationPage.equals(((iJ) (obj)).destinationPage))
            {
                return false;
            }
            if (myFriendBlockCount == null ? ((iJ) (obj)).myFriendBlockCount != null : !myFriendBlockCount.equals(((iJ) (obj)).myFriendBlockCount))
            {
                return false;
            }
            if (myFriendBlockInSearchCount == null ? ((iJ) (obj)).myFriendBlockInSearchCount != null : !myFriendBlockInSearchCount.equals(((iJ) (obj)).myFriendBlockInSearchCount))
            {
                return false;
            }
            if (myFriendCount == null ? ((iJ) (obj)).myFriendCount != null : !myFriendCount.equals(((iJ) (obj)).myFriendCount))
            {
                return false;
            }
            if (myFriendNameEditCount == null ? ((iJ) (obj)).myFriendNameEditCount != null : !myFriendNameEditCount.equals(((iJ) (obj)).myFriendNameEditCount))
            {
                return false;
            }
            if (myFriendNameEditInSearchCount == null ? ((iJ) (obj)).myFriendNameEditInSearchCount != null : !myFriendNameEditInSearchCount.equals(((iJ) (obj)).myFriendNameEditInSearchCount))
            {
                return false;
            }
            if (myFriendReAddCount == null ? ((iJ) (obj)).myFriendReAddCount != null : !myFriendReAddCount.equals(((iJ) (obj)).myFriendReAddCount))
            {
                return false;
            }
            if (myFriendReAddInSearchCount == null ? ((iJ) (obj)).myFriendReAddInSearchCount != null : !myFriendReAddInSearchCount.equals(((iJ) (obj)).myFriendReAddInSearchCount))
            {
                return false;
            }
            if (myFriendRemoveCount == null ? ((iJ) (obj)).myFriendRemoveCount != null : !myFriendRemoveCount.equals(((iJ) (obj)).myFriendRemoveCount))
            {
                return false;
            }
            if (myFriendRemoveInSearchCount == null ? ((iJ) (obj)).myFriendRemoveInSearchCount != null : !myFriendRemoveInSearchCount.equals(((iJ) (obj)).myFriendRemoveInSearchCount))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k2 = 0;
        int l2 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (destination != null)
        {
            i = destination.hashCode();
        } else
        {
            i = 0;
        }
        if (destinationPage != null)
        {
            j = destinationPage.hashCode();
        } else
        {
            j = 0;
        }
        if (myFriendBlockCount != null)
        {
            k = myFriendBlockCount.hashCode();
        } else
        {
            k = 0;
        }
        if (myFriendBlockInSearchCount != null)
        {
            l = myFriendBlockInSearchCount.hashCode();
        } else
        {
            l = 0;
        }
        if (myFriendCount != null)
        {
            i1 = myFriendCount.hashCode();
        } else
        {
            i1 = 0;
        }
        if (myFriendNameEditCount != null)
        {
            j1 = myFriendNameEditCount.hashCode();
        } else
        {
            j1 = 0;
        }
        if (myFriendNameEditInSearchCount != null)
        {
            k1 = myFriendNameEditInSearchCount.hashCode();
        } else
        {
            k1 = 0;
        }
        if (myFriendReAddCount != null)
        {
            l1 = myFriendReAddCount.hashCode();
        } else
        {
            l1 = 0;
        }
        if (myFriendReAddInSearchCount != null)
        {
            i2 = myFriendReAddInSearchCount.hashCode();
        } else
        {
            i2 = 0;
        }
        if (myFriendRemoveCount != null)
        {
            j2 = myFriendRemoveCount.hashCode();
        } else
        {
            j2 = 0;
        }
        if (myFriendRemoveInSearchCount != null)
        {
            k2 = myFriendRemoveInSearchCount.hashCode();
        }
        return (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + (i + l2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + k2;
    }
}
