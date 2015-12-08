// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.api.model:
//            DynamicStory, Model, ModelHelper

public abstract class Feed extends ApiResponse
    implements Parcelable
{

    protected String _baseUrl;
    private boolean _cached;
    protected DataListener _dataListener;
    protected List _ids;
    protected List _items;
    private boolean _offline;
    protected List _stories;
    protected Map _storyPosMap;

    protected Feed()
    {
        _items = new ArrayList();
        _ids = new ArrayList();
    }

    protected Feed(Feed feed)
    {
        super(null);
        _items = new ArrayList();
        _ids = new ArrayList();
        if (feed == null)
        {
            return;
        } else
        {
            _status = feed.getStatus();
            _bookmark = feed.getBookmark();
            _message = feed.getMessage();
            _messageDetail = feed.getMessageDetail();
            _generatedAt = feed.getGeneratedAt();
            _baseUrl = feed.getBaseUrl();
            setItems(new ArrayList(feed.getItems()));
            return;
        }
    }

    public Feed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject);
        _items = new ArrayList();
        _ids = new ArrayList();
        _baseUrl = s;
    }

    private boolean containsStories()
    {
        return _stories != null && !_stories.isEmpty() && _storyPosMap != null && !_storyPosMap.isEmpty();
    }

    private void decrementStoryPositionsAfterIndex(int i)
    {
        if (!containsStories())
        {
            return;
        }
        Iterator iterator = _stories.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DynamicStory dynamicstory = (DynamicStory)iterator.next();
            int j = dynamicstory.getPosition().intValue();
            if (j > i)
            {
                dynamicstory.setPosition(Integer.valueOf(j - 1));
            }
        } while (true);
        updateStoryPos();
    }

    private DynamicStory getClientGeneratedStory()
    {
        if (!containsStories())
        {
            return null;
        }
        for (Iterator iterator = _stories.iterator(); iterator.hasNext();)
        {
            DynamicStory dynamicstory = (DynamicStory)iterator.next();
            if (dynamicstory.getIsClientGenerated())
            {
                return dynamicstory;
            }
        }

        return null;
    }

    public static String getName()
    {
        return "__FEED";
    }

    private void incrementStoryPositionsAfterIndex(int i)
    {
        if (!containsStories())
        {
            return;
        }
        Iterator iterator = _stories.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DynamicStory dynamicstory = (DynamicStory)iterator.next();
            int j = dynamicstory.getPosition().intValue();
            if (j >= i)
            {
                dynamicstory.setPosition(Integer.valueOf(j + 1));
            }
        } while (true);
        updateStoryPos();
    }

    public static Feed restoreInstanceState(Bundle bundle)
    {
        return restoreInstanceState(bundle, getName());
    }

    public static Feed restoreInstanceState(Bundle bundle, String s)
    {
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            s = (Feed)bundle.getParcelable(s);
            bundle = s;
            if (s != null)
            {
                bundle = s;
                if (((Feed) (s))._code != -1)
                {
                    s.onStart();
                    return s;
                }
            }
        }
        return bundle;
    }

    public void addItem(int i, Model model)
    {
        if (_items == null || i < 0 || i >= _items.size())
        {
            return;
        } else
        {
            incrementStoryPositionsAfterIndex(i);
            _items.add(i, model);
            updateIds();
            return;
        }
    }

    public void addStory(DynamicStory dynamicstory)
    {
        if (dynamicstory == null)
        {
            return;
        }
        if (_stories == null)
        {
            _stories = new ArrayList();
        }
        if (_storyPosMap == null)
        {
            _storyPosMap = new HashMap();
        }
        incrementStoryPositionsAfterIndex(dynamicstory.getPosition().intValue());
        _stories.add(dynamicstory);
        _storyPosMap.put(dynamicstory.getPosition(), dynamicstory);
    }

    public void appendItem(Model model)
    {
        List list = _items;
        if (!hasItems())
        {
            onStart();
        }
        list.add(model);
        setItems(list);
    }

    public void appendItems(Feed feed)
    {
        update(feed);
        if (!hasItems())
        {
            onStart();
        }
        setItems(_items);
        List list = _items;
        if (list == null)
        {
            setStories(feed.getStories());
            setItems(feed.getItems());
            return;
        }
        int i = getTotalCount();
        Iterator iterator = feed.getItems().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Model model = (Model)iterator.next();
            if (!list.contains(model))
            {
                list.add(model);
            }
        } while (true);
        if (feed.getStories() != null)
        {
            offsetStoryPositions(i, feed.getStories());
            if (_stories == null)
            {
                setStories(feed.getStories());
            } else
            {
                _stories.addAll(feed.getStories());
            }
        }
        setItems(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public final void destroy()
    {
        _data = null;
        _items.clear();
        _ids.clear();
        _items = null;
        _ids = null;
        _code = -1;
        _baseUrl = null;
        _generatedAt = null;
        _message = null;
        _bookmark = null;
        _status = null;
    }

    public Model get(int i)
    {
        if (getCount() == 0 || i > _items.size() - 1)
        {
            return null;
        } else
        {
            return (Model)_items.get(i);
        }
    }

    public int getAbsCount()
    {
        if (_ids == null)
        {
            return 0;
        } else
        {
            return _ids.size();
        }
    }

    public String getBaseUrl()
    {
        return _baseUrl;
    }

    public int getCount()
    {
        if (_items == null)
        {
            return 0;
        } else
        {
            return _items.size();
        }
    }

    public int getFeedIndex(int i)
    {
        if (_storyPosMap != null && !_storyPosMap.isEmpty()) goto _L2; else goto _L1
_L1:
        int k = i;
_L4:
        return k;
_L2:
        Iterator iterator = _storyPosMap.keySet().iterator();
        int j = i;
        do
        {
            k = j;
            if (!iterator.hasNext())
            {
                continue;
            }
            if (((Integer)iterator.next()).intValue() < i)
            {
                j--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public List getIds()
    {
        return _ids;
    }

    protected String getItemId(Model model)
    {
        return model.getUid();
    }

    public List getItems()
    {
        if (getCount() == 0)
        {
            onStart();
        }
        if (_items == null)
        {
            return new ArrayList();
        } else
        {
            return _items;
        }
    }

    public String getNextUrl()
    {
        if (!ModelHelper.isValid(_baseUrl) || !ModelHelper.isValid(_bookmark))
        {
            return null;
        }
        _baseUrl = _baseUrl.replaceAll("(?<=[?&;])bookmark=.*?($|[&;])", "");
        if (_baseUrl.contains("item_count="))
        {
            _baseUrl = NetworkUtils.replaceParam(_baseUrl, "item_count", String.valueOf(getTotalCount()));
        }
        String s = "?bookmark=";
        if (_baseUrl.contains("?"))
        {
            s = "&bookmark=";
        }
        return String.format("%s%s%s", new Object[] {
            _baseUrl, s, Uri.encode(_bookmark)
        });
    }

    protected abstract List getPersistedItems();

    public List getStories()
    {
        return _stories;
    }

    public DynamicStory getStory(int i)
    {
        if (_storyPosMap == null)
        {
            return null;
        } else
        {
            return (DynamicStory)_storyPosMap.get(Integer.valueOf(i));
        }
    }

    public int getStoryCount()
    {
        if (_stories == null)
        {
            return 0;
        } else
        {
            return _stories.size();
        }
    }

    public int getTotalCount()
    {
        return getCount() + getStoryCount();
    }

    public boolean hasItems()
    {
        return _items != null && _items.size() > 0;
    }

    public boolean hasStories()
    {
        return _stories != null && !_stories.isEmpty();
    }

    public boolean isAtEnd()
    {
        return !ModelHelper.isValid(_bookmark) || _bookmark.equals("");
    }

    public boolean isCached()
    {
        return _cached;
    }

    public boolean isOffline()
    {
        return _offline;
    }

    public boolean isStory(int i)
    {
        if (_storyPosMap == null)
        {
            return false;
        } else
        {
            return _storyPosMap.containsKey(Integer.valueOf(i));
        }
    }

    public FeedApiResponseHandler newApiHandler()
    {
        return null;
    }

    public void offsetStoryPositions(int i, List list)
    {
        DynamicStory dynamicstory;
        for (list = list.iterator(); list.hasNext(); dynamicstory.setPosition(Integer.valueOf(dynamicstory.getPosition().intValue() + i)))
        {
            dynamicstory = (DynamicStory)list.next();
        }

    }

    public boolean onStart()
    {
        if (_ids != null && _ids.size() > 0 && !hasItems())
        {
            int i = _ids.size();
            setItems(getPersistedItems());
            if (_dataListener != null)
            {
                DataListener datalistener = _dataListener;
                boolean flag;
                if (i != _ids.size())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                datalistener.onStart(flag);
            }
            if (i != _ids.size())
            {
                return true;
            }
        }
        return false;
    }

    public void onStop()
    {
        if (_dataListener != null)
        {
            _dataListener.onStop();
        }
        if (_items != null)
        {
            _items.clear();
        }
    }

    public void prependItem(Model model)
    {
        if (!hasItems())
        {
            onStart();
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(model);
        arraylist.addAll(_items);
        setItems(arraylist);
    }

    public void prependItems(Feed feed)
    {
        update(feed);
        if (!hasItems())
        {
            onStart();
        }
        feed = new ArrayList(feed.getItems());
        feed.addAll(_items);
        setItems(feed);
    }

    protected void readFromParcel(Parcel parcel)
    {
        if (parcel == null)
        {
            return;
        } else
        {
            _code = parcel.readInt();
            _status = parcel.readString();
            _message = parcel.readString();
            _generatedAt = parcel.readString();
            _bookmark = parcel.readString();
            _baseUrl = parcel.readString();
            _ids = new ArrayList();
            parcel.readList(_ids, java/lang/String.getClassLoader());
            return;
        }
    }

    public final void refresh()
    {
        onStop();
        onStart();
    }

    public void removeClientGeneratedStory()
    {
        DynamicStory dynamicstory;
        if (containsStories())
        {
            if ((dynamicstory = getClientGeneratedStory()) != null)
            {
                removeStory(dynamicstory);
                return;
            }
        }
    }

    public Model removeItem(int i)
    {
        if (_items == null || i < 0 || i >= _items.size())
        {
            return null;
        } else
        {
            Model model = (Model)_items.remove(i);
            decrementStoryPositionsAfterIndex(i);
            updateIds();
            return model;
        }
    }

    public Model removeItem(Model model)
    {
        int i = _items.indexOf(model);
        if (i >= 0)
        {
            return removeItem(i);
        } else
        {
            return null;
        }
    }

    public void removeItems(int i, int j)
    {
        int k;
label0:
        {
            if (i >= 0)
            {
                k = j;
                if (j < _items.size())
                {
                    break label0;
                }
            }
            return;
        }
        for (; k > i; k--)
        {
            _items.remove(i);
        }

        updateIds();
    }

    public void removeStory(DynamicStory dynamicstory)
    {
        while (!containsStories() || dynamicstory == null || !_stories.remove(dynamicstory)) 
        {
            return;
        }
        _storyPosMap.remove(dynamicstory.getPosition());
        decrementStoryPositionsAfterIndex(dynamicstory.getPosition().intValue());
    }

    public void replaceStory(DynamicStory dynamicstory, DynamicStory dynamicstory1)
    {
        if (_stories != null)
        {
            int i = _stories.indexOf(dynamicstory);
            if (i != -1)
            {
                _stories.set(i, dynamicstory1);
                _storyPosMap.put(dynamicstory.getPosition(), dynamicstory1);
            }
        }
    }

    public void saveInstanceState(Bundle bundle)
    {
        saveInstanceState(bundle, getName());
    }

    public void saveInstanceState(Bundle bundle, String s)
    {
        bundle.putParcelable(s, this);
    }

    public void setBaseUrl(String s)
    {
        _baseUrl = s;
    }

    public void setCached(boolean flag)
    {
        _cached = flag;
    }

    public void setDataListener(DataListener datalistener)
    {
        _dataListener = datalistener;
    }

    public void setItem(int i, Model model)
    {
        _items.set(i, model);
        updateIds();
    }

    public void setItems(List list)
    {
        _items = list;
        updateIds();
        updateStoryPos();
    }

    public void setOffline(boolean flag)
    {
        _offline = flag;
    }

    public void setStories(List list)
    {
        _stories = list;
    }

    public void updateIds()
    {
        if (_items != null)
        {
            Iterator iterator;
            if (_ids == null)
            {
                _ids = new ArrayList();
            } else
            {
                _ids.clear();
            }
            iterator = _items.iterator();
            while (iterator.hasNext()) 
            {
                Model model = (Model)iterator.next();
                _ids.add(getItemId(model));
            }
        }
    }

    protected void updateStoryPos()
    {
        if (_stories != null)
        {
            Iterator iterator;
            if (_storyPosMap == null)
            {
                _storyPosMap = new HashMap();
            } else
            {
                _storyPosMap.clear();
            }
            iterator = _stories.iterator();
            while (iterator.hasNext()) 
            {
                DynamicStory dynamicstory = (DynamicStory)iterator.next();
                _storyPosMap.put(dynamicstory.getPosition(), dynamicstory);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(_code);
        if (_status == null)
        {
            _status = "";
        }
        parcel.writeString(_status);
        if (_message == null)
        {
            _message = "";
        }
        parcel.writeString(_message);
        if (_generatedAt == null)
        {
            _generatedAt = "";
        }
        parcel.writeString(_generatedAt);
        if (_bookmark == null)
        {
            _bookmark = "";
        }
        parcel.writeString(_bookmark);
        if (_baseUrl == null)
        {
            _baseUrl = "";
        }
        parcel.writeString(_baseUrl);
        if (_ids == null)
        {
            _ids = new ArrayList();
        }
        parcel.writeList(_ids);
    }

    private class DataListener
    {

        public void onChange(int i, boolean flag)
        {
        }

        public void onStart(boolean flag)
        {
        }

        public void onStop()
        {
        }

        public DataListener()
        {
        }
    }

}
