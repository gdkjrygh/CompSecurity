// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.search.suggestions.Shortcut;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;
import com.soundcloud.android.storage.provider.Content;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SearchSuggestions
    implements Iterable
{
    public static class Query
    {

        public static final String KIND_PLAYLIST = "playlist";
        public static final String KIND_TRACK = "track";
        public static final String KIND_USER = "user";
        public static final Set SUPPORTED_KINDS;
        public List highlights;
        private String iconUri;
        public long id;
        private String intentData;
        public String kind;
        public String query;
        public int query_position;
        public String query_urn;
        public long score;

        private Uri contentProviderUri()
        {
            Urn urn = getUrn();
            if (urn.isTrack())
            {
                return Content.TRACK.forId(urn.getNumericId());
            }
            if (urn.isUser())
            {
                return Content.USER.forId(urn.getNumericId());
            }
            if (urn.isPlaylist())
            {
                return Content.PLAYLIST.forId(urn.getNumericId());
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't convert to content Uri: ")).append(urn).toString());
            }
        }

        static Uri getDataUri(Urn urn)
        {
            if (urn.isUser())
            {
                return Content.USER.forId(urn.getNumericId());
            }
            if (urn.isTrack() || urn.isPlaylist())
            {
                return Content.TRACK.forId(urn.getNumericId());
            } else
            {
                throw new IllegalStateException((new StringBuilder("Unknown urn type ")).append(urn).toString());
            }
        }

        static String kindFromUrn(Urn urn)
        {
            if (urn.isUser())
            {
                return "user";
            }
            if (urn.isTrack())
            {
                return "track";
            }
            if (urn.isPlaylist())
            {
                return "playlist";
            } else
            {
                throw new IllegalStateException((new StringBuilder("Unknown urn type ")).append(urn).toString());
            }
        }

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Query)obj;
            if (id != ((Query) (obj)).id)
            {
                break; /* Loop/switch isn't completed */
            }
            if (kind == null) goto _L4; else goto _L3
_L3:
            if (kind.equals(((Query) (obj)).kind)) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (((Query) (obj)).kind == null)
            {
                return true;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public String getIntentData()
        {
            if (intentData != null)
            {
                return intentData;
            } else
            {
                return contentProviderUri().toString();
            }
        }

        public Urn getUrn()
        {
            return new Urn((new StringBuilder("soundcloud:")).append(kind).append("s:").append(id).toString());
        }

        public int hashCode()
        {
            int i;
            if (kind != null)
            {
                i = kind.hashCode();
            } else
            {
                i = 0;
            }
            return i * 31 + (int)(id ^ id >>> 32);
        }

        public boolean isLocal()
        {
            return score == 0L;
        }

        public boolean isRemote()
        {
            return score != 0L;
        }

        public String toString()
        {
            return (new StringBuilder("Query{query='")).append(query).append('\'').append(", kind='").append(kind).append('\'').append(", id=").append(id).append(", score=").append(score).append(", iconUri=").append(iconUri).append('}').toString();
        }

        static 
        {
            HashSet hashset = new HashSet();
            SUPPORTED_KINDS = hashset;
            hashset.add("user");
            SUPPORTED_KINDS.add("track");
        }


/*
        static String access$002(Query query1, String s)
        {
            query1.intentData = s;
            return s;
        }

*/

        public Query()
        {
        }
    }


    public static final SearchSuggestions EMPTY = new SearchSuggestions();
    public int limit;
    public String query;
    public long query_time_in_millis;
    public String query_urn;
    public List suggestions;

    public SearchSuggestions()
    {
        suggestions = new ArrayList();
    }

    public SearchSuggestions(List list)
    {
        suggestions = new ArrayList(list.size());
        fromLocalShortcuts(list);
    }

    private void addQueryToCursor(MatrixCursor matrixcursor, Query query1, int i)
    {
        int j = 1;
        boolean flag = query1.isLocal();
        long l = query1.id;
        String s = query1.query;
        String s1 = query1.getIntentData();
        String s2;
        if (!flag)
        {
            j = 0;
        }
        s2 = buildHighlightData(query1);
        if (flag)
        {
            query1 = null;
        } else
        {
            query1 = query_urn;
        }
        if (flag)
        {
            i = -1;
        }
        matrixcursor.addRow(new Object[] {
            Integer.valueOf(-1), Long.valueOf(l), s, s1, null, Integer.valueOf(j), s2, query1, Integer.valueOf(i)
        });
    }

    private String buildHighlightData(Query query1)
    {
        if (query1.highlights == null || query1.highlights.isEmpty())
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        query1 = query1.highlights.iterator();
        do
        {
            if (!query1.hasNext())
            {
                break;
            }
            Map map = (Map)query1.next();
            stringbuilder.append(map.get("pre")).append(',').append(map.get("post"));
            if (query1.hasNext())
            {
                stringbuilder.append(';');
            }
        } while (true);
        return stringbuilder.toString();
    }

    private void fromLocalShortcuts(List list)
    {
        Query query1;
        for (list = list.iterator(); list.hasNext(); suggestions.add(query1))
        {
            Shortcut shortcut = (Shortcut)list.next();
            Urn urn = shortcut.getUrn();
            query1 = new Query();
            query1.id = urn.getNumericId();
            query1.query = shortcut.getDisplayText();
            query1.intentData = Query.getDataUri(urn).toString();
            query1.kind = Query.kindFromUrn(urn);
            query1.query_urn = query_urn;
            query1.query_position = -1;
        }

    }

    public void add(Query query1)
    {
        suggestions.add(query1);
    }

    public Cursor asCursor()
    {
        MatrixCursor matrixcursor = new MatrixCursor(SuggestionsAdapter.COLUMN_NAMES);
        Iterator iterator1 = iterator();
        int i = 0;
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Query query1 = (Query)iterator1.next();
            if (Query.SUPPORTED_KINDS.contains(query1.kind))
            {
                addQueryToCursor(matrixcursor, query1, i);
                if (query1.isRemote())
                {
                    i++;
                }
            }
        } while (true);
        return matrixcursor;
    }

    public boolean contains(Query query1)
    {
        return suggestions.contains(query1);
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Iterator iterator()
    {
        return suggestions.iterator();
    }

    public SearchSuggestions mergeWithRemote(SearchSuggestions searchsuggestions)
    {
        SearchSuggestions searchsuggestions1 = new SearchSuggestions();
        if (searchsuggestions.query_urn != null)
        {
            searchsuggestions1.query_urn = searchsuggestions.query_urn;
        }
        for (Iterator iterator1 = iterator(); iterator1.hasNext(); searchsuggestions1.add((Query)iterator1.next())) { }
        searchsuggestions = searchsuggestions.iterator();
        do
        {
            if (!searchsuggestions.hasNext())
            {
                break;
            }
            Query query1 = (Query)searchsuggestions.next();
            if (!searchsuggestions1.contains(query1))
            {
                searchsuggestions1.add(query1);
            }
        } while (true);
        return searchsuggestions1;
    }

    public void putRemoteIds(List list, List list1, List list2)
    {
        Iterator iterator1 = iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Query query1 = (Query)iterator1.next();
            if (query1.isRemote())
            {
                if ("user".equals(query1.kind))
                {
                    list1.add(Long.valueOf(query1.id));
                } else
                if ("track".equals(query1.kind))
                {
                    list.add(Long.valueOf(query1.id));
                } else
                if ("playlist".equals(query1.kind))
                {
                    list2.add(Long.valueOf(query1.id));
                }
            }
        } while (true);
    }

    public int size()
    {
        return suggestions.size();
    }

    public String toString()
    {
        return (new StringBuilder("SearchSuggestions{query_time_in_millis=")).append(query_time_in_millis).append(", query='").append(query).append('\'').append(", limit=").append(limit).append(", suggestions=").append(suggestions).append(", query_urn=").append(query_urn).append('}').toString();
    }

}
