// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.library.model.LibraryFeed;
import com.pinterest.activity.library.view.LibraryEmptyStateSectionView;
import com.pinterest.activity.library.view.LibrarySectionView;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class LibraryAdapter extends PinterestBaseAdapter
{

    private String _currentSortOrder;
    protected boolean _dataLoaded;
    private boolean _emptyStateCellAdded;
    protected boolean _isLoadingMore;
    private boolean _likeSectionAdded;
    private LibrarySection _likesSection;
    private LibraryLoadMoreListener _listener;
    private User _user;

    public LibraryAdapter()
    {
        _likeSectionAdded = false;
        _emptyStateCellAdded = false;
        _likesSection = null;
        _currentSortOrder = "last_pinned_to";
    }

    private boolean libraryDataOver()
    {
        return getDataSource() != null && getDataSource().getNextUrl() == null;
    }

    public void addEmptyStateCellIfNeeded(Feed feed)
    {
        if (!_emptyStateCellAdded && feed != null && _user != null && _user.getPinCount() != null)
        {
            _emptyStateCellAdded = true;
            if (MyUser.isUserMe(_user) || _user.getPinCount().intValue() <= 0)
            {
                feed.appendItem(new LibrarySection(null, "empty_state", null));
                return;
            }
        }
    }

    public void addLikeCellIfNeeded(Feed feed)
    {
_L2:
        return;
        if (_likeSectionAdded || _likesSection == null || feed == null || _likesSection.getPinList().size() == 0) goto _L2; else goto _L1
_L1:
        List list = feed.getItems();
        if (list == null) goto _L2; else goto _L3
_L3:
        String s;
        Object obj;
        int i;
        int j;
        Date date;
        if (_user != null)
        {
            date = _user.getLastPinLiked();
        } else
        {
            date = new Date(0x8000000000000000L);
        }
        s = Resources.string(0x7f070336).toLowerCase();
        i = 0;
_L9:
        if (i >= list.size()) goto _L5; else goto _L4
_L4:
        obj = ((LibrarySection)list.get(i)).getBoard();
        if (obj == null || _user == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!TextUtils.equals(_currentSortOrder, "last_pinned_to"))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((Board) (obj)).getLastModifiedAt();
        if (_likesSection == null || obj == null || date == null || !date.after(((Date) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
_L8:
        if (list.size() == 0)
        {
            list.add(0, _likesSection);
        }
        if (j >= 0)
        {
            list.add(j, _likesSection);
            _likeSectionAdded = true;
        }
        feed.setItems(list);
        return;
        if (((Board) (obj)).getName() == null) goto _L2; else goto _L6
_L6:
        j = i;
        if (s.compareTo(((Board) (obj)).getName().toLowerCase()) < 0) goto _L8; else goto _L7
_L7:
        i++;
          goto _L9
_L5:
        j = -1;
          goto _L8
    }

    public void appendItems(LibraryFeed libraryfeed)
    {
        addLikeCellIfNeeded(libraryfeed);
        _dataSource.appendItems(libraryfeed);
        notifyDataSetChanged();
    }

    public final void finishedLoading()
    {
        _isLoadingMore = false;
    }

    public int getItemSpan(int i)
    {
        return 0x7fffffff;
    }

    public String getSortOrder()
    {
        return _currentSortOrder;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        LibrarySection librarysection = (LibrarySection)getItem(i);
        if (librarysection != null)
        {
            LibrarySectionView librarysectionview = LibrarySectionView.get(view, viewgroup);
            if (librarysection.getType().equals("empty_state"))
            {
                viewgroup = LibraryEmptyStateSectionView.get(view, viewgroup);
                view = viewgroup;
                if (_user != null)
                {
                    view = viewgroup;
                    if (!MyUser.isUserMe(_user))
                    {
                        viewgroup.showEmptyPinsMessage(_user.getFirstName());
                        return viewgroup;
                    }
                }
            } else
            {
                int j;
                if (StringUtils.equals(_currentSortOrder, "last_pinned_to"))
                {
                    j = 0;
                } else
                {
                    j = 1;
                }
                librarysectionview.configure(librarysection, _user, j);
                librarysectionview.configureTopics();
                if (!flag)
                {
                    loadMore(i);
                }
                return librarysectionview;
            }
        }
        return view;
    }

    protected final void loadMore(int i)
    {
        if (_listener != null && shouldLoadMore(i) && !_isLoadingMore)
        {
            _listener.loadMore();
            _isLoadingMore = true;
        } else
        if (libraryDataOver())
        {
            setDataLoaded();
            return;
        }
    }

    public void resetDataLoaded()
    {
        _dataLoaded = false;
    }

    public void resetDataSource()
    {
        _dataSource = null;
        _likesSection = null;
        _likeSectionAdded = false;
        _dataLoaded = false;
        _isLoadingMore = false;
        _emptyStateCellAdded = false;
    }

    public final void setDataLoaded()
    {
        if (_dataLoaded)
        {
            return;
        }
        _dataLoaded = true;
        if (!_likeSectionAdded && _likesSection != null && _likesSection.getPinList().size() > 0)
        {
            _dataSource.appendItem(_likesSection);
            _likeSectionAdded = true;
        }
        addEmptyStateCellIfNeeded(_dataSource);
        notifyDataSetChanged();
    }

    public void setDataSource(Feed feed)
    {
        if (feed == null)
        {
            return;
        }
        _likeSectionAdded = false;
        _emptyStateCellAdded = false;
        addLikeCellIfNeeded(feed);
        if (feed.getNextUrl() == null)
        {
            addEmptyStateCellIfNeeded(feed);
        }
        super.setDataSource(feed);
        resetCachedItemHeights();
    }

    public void setDeletedBoard(Board board)
    {
        Iterator iterator = _dataSource.getItems().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Board board1 = ((LibrarySection)iterator.next()).getBoard();
            if (board1 == null || !board.getUid().equals(board1.getUid()))
            {
                continue;
            }
            iterator.remove();
            break;
        } while (true);
        notifyDataSetInvalidated();
    }

    public void setLikeSection(Feed feed)
    {
        if (feed != null && feed.getCount() == 1)
        {
            if ((feed = (LibrarySection)feed.get(0)) != null && feed.getType().equals("likes"))
            {
                _likesSection = feed;
                return;
            }
        }
    }

    public void setListener(LibraryLoadMoreListener libraryloadmorelistener)
    {
        _listener = libraryloadmorelistener;
    }

    public void setSortOrder(String s)
    {
        _currentSortOrder = s;
    }

    protected boolean shouldLoadMore(int i)
    {
        int j;
        if (!_loading && !_dataLoaded)
        {
            if ((j = getItemCount()) <= LOAD_MORE_INDEX || i >= j - LOAD_MORE_INDEX)
            {
                return true;
            }
        }
        return false;
    }

    public void updateInterestsLists(HashMap hashmap)
    {
        if (_dataSource != null)
        {
            Iterator iterator = _dataSource.getItems().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                LibrarySection librarysection = (LibrarySection)iterator.next();
                if (librarysection != null && librarysection.getBoard() != null)
                {
                    String s = librarysection.getBoard().getUid();
                    if (hashmap.containsKey(s))
                    {
                        librarysection.setInterestsFeed((InterestsFeed)hashmap.get(s));
                    }
                }
            } while (true);
            notifyDataSetInvalidated();
        }
    }

    public void updateUser(User user)
    {
        _user = user;
    }

    private class LibraryLoadMoreListener
    {

        public abstract void loadMore();
    }

}
