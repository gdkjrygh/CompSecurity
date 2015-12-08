// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Board, Category, Domain, FilterOption, 
//            Interest, Pin, User

public class ModelAccessCache
{

    private static final int MAX_FILTER_OPTION_SIZE = 500;
    private static final int MAX_SIZE = 100;
    private static final LruCache _boardCache = new LruCache(100);
    private static final LruCache _categoryCache = new LruCache(100);
    private static final LruCache _domainCache = new LruCache(100);
    private static final LruCache _filterOptionCache = new LruCache(500);
    private static final LruCache _interestCache = new LruCache(100);
    private static final LruCache _pinCache = new LruCache(100);
    private static final LruCache _userCache = new LruCache(100);

    public ModelAccessCache()
    {
    }

    public static ArrayList fromIdList(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            ArrayList arraylist1 = new ArrayList();
            for (int i = 0; i < arraylist.size(); i++)
            {
                arraylist1.add(getFilterOption((String)arraylist.get(i)));
            }

            return arraylist1;
        } else
        {
            return new ArrayList();
        }
    }

    public static Board getBoard(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (Board)_boardCache.get(s);
        }
    }

    public static Category getCategory(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (Category)_categoryCache.get(s);
        }
    }

    public static Domain getDomain(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (Domain)_domainCache.get(s);
        }
    }

    public static FilterOption getFilterOption(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (FilterOption)_filterOptionCache.get(s);
        }
    }

    public static Interest getInterest(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (Interest)_interestCache.get(s);
        }
    }

    public static Pin getPin(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (Pin)_pinCache.get(s);
        }
    }

    public static User getUser(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (User)_userCache.get(s);
        }
    }

    public static void put(Board board)
    {
        if (board == null || board.getUid() == null)
        {
            return;
        }
        synchronized (_boardCache)
        {
            _boardCache.put(board.getUid(), board);
        }
        return;
        board;
        lrucache;
        JVM INSTR monitorexit ;
        throw board;
    }

    public static void put(Category category)
    {
        if (category == null || category.getUid() == null)
        {
            return;
        }
        synchronized (_categoryCache)
        {
            _categoryCache.put(category.getUid(), category);
        }
        return;
        category;
        lrucache;
        JVM INSTR monitorexit ;
        throw category;
    }

    public static void put(Domain domain)
    {
        if (domain == null || domain.getUid() == null)
        {
            return;
        }
        synchronized (_domainCache)
        {
            _domainCache.put(domain.getUid(), domain);
        }
        return;
        domain;
        lrucache;
        JVM INSTR monitorexit ;
        throw domain;
    }

    public static void put(FilterOption filteroption)
    {
        if (filteroption == null || filteroption.getId() == null)
        {
            return;
        }
        synchronized (_filterOptionCache)
        {
            _filterOptionCache.put(filteroption.getId().toString(), filteroption);
        }
        return;
        filteroption;
        lrucache;
        JVM INSTR monitorexit ;
        throw filteroption;
    }

    public static void put(Interest interest)
    {
        if (interest == null || interest.getUid() == null)
        {
            return;
        }
        synchronized (_interestCache)
        {
            _interestCache.put(interest.getUid(), interest);
        }
        return;
        interest;
        lrucache;
        JVM INSTR monitorexit ;
        throw interest;
    }

    public static void put(Pin pin)
    {
        if (pin == null || pin.getUid() == null)
        {
            return;
        }
        synchronized (_pinCache)
        {
            _pinCache.put(pin.getUid(), pin);
        }
        return;
        pin;
        lrucache;
        JVM INSTR monitorexit ;
        throw pin;
    }

    public static void put(User user)
    {
        if (user == null || user.getUid() == null)
        {
            return;
        }
        synchronized (_userCache)
        {
            _userCache.put(user.getUid(), user);
        }
        return;
        user;
        lrucache;
        JVM INSTR monitorexit ;
        throw user;
    }

    public static void removeBoard(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_boardCache)
        {
            _boardCache.remove(s);
        }
        return;
        s;
        lrucache;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void removeCategory(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_categoryCache)
        {
            _categoryCache.remove(s);
        }
        return;
        s;
        lrucache;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void removeDomain(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_domainCache)
        {
            _domainCache.remove(s);
        }
        return;
        s;
        lrucache;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void removeFilterOption(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_filterOptionCache)
        {
            _filterOptionCache.remove(s);
        }
        return;
        s;
        lrucache;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void removeInterest(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_interestCache)
        {
            _interestCache.remove(s);
        }
        return;
        s;
        lrucache;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void removePin(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_pinCache)
        {
            _pinCache.remove(s);
        }
        return;
        s;
        lrucache;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void removeUser(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_userCache)
        {
            _userCache.remove(s);
        }
        return;
        s;
        lrucache;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static ArrayList toIdList(List list)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < list.size(); i++)
            {
                arraylist.add(((FilterOption)list.get(i)).getId().toString());
                put((FilterOption)list.get(i));
            }

            return arraylist;
        } else
        {
            return new ArrayList();
        }
    }

}
