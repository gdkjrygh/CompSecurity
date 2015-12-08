// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.ModelAccessCache;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.api.model.User;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.PApplication;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.ViewParameterType;
import com.pinterest.schemas.event.ViewType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.task.model:
//            Location

public class Navigation
    implements Parcelable
{

    public static final String BUNDLE_KEY = "NAVIGATION_MODEL_BUNDLE_KEY";
    private static final String CACHED_MODEL = "__cached_model";
    public static final android.os.Parcelable.Creator CREATOR = new _cls2();
    public static final int NONE = -1;
    private static final HashMap _modeMap;
    private Bundle _bundle;
    private Long _createdAt;
    private DisplayMode _displayMode;
    private Map _extras;
    private Class _fragmentClass;
    private String _id;
    private Location _location;

    public Navigation()
    {
        _location = Location.NONE;
        _id = "";
        _displayMode = DisplayMode.DEFAULT;
        _createdAt = Long.valueOf(-1L);
        _extras = new HashMap();
        _bundle = new Bundle();
    }

    public Navigation(Parcel parcel)
    {
        _location = Location.NONE;
        _id = "";
        _displayMode = DisplayMode.DEFAULT;
        _createdAt = Long.valueOf(-1L);
        _extras = new HashMap();
        _bundle = new Bundle();
        readFromParcel(parcel);
    }

    public Navigation(Location location)
    {
        _location = Location.NONE;
        _id = "";
        _displayMode = DisplayMode.DEFAULT;
        _createdAt = Long.valueOf(-1L);
        _extras = new HashMap();
        _bundle = new Bundle();
        setLocation(location);
        setCreatedAt(Long.valueOf(SystemClock.uptimeMillis()));
    }

    public Navigation(Location location, Model model)
    {
        this(location);
        if (model == null)
        {
            return;
        }
        if (model instanceof Category)
        {
            setId(((Category)model).getKey());
        } else
        {
            setId(model.getUid());
        }
        setCachedModel(model);
    }

    public Navigation(Location location, String s)
    {
        this(location);
        setId(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (equalsIgnoreCreatedAt(obj)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (Navigation)obj;
        if (_createdAt == null) goto _L4; else goto _L3
_L3:
        if (!_createdAt.equals(((Navigation) (obj))._createdAt)) goto _L1; else goto _L5
_L5:
        return true;
_L4:
        if (((Navigation) (obj))._createdAt != null)
        {
            return false;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public boolean equalsIgnoreCreatedAt(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Navigation)obj;
            if (_location != ((Navigation) (obj))._location)
            {
                return false;
            }
            if (_id == null ? ((Navigation) (obj))._id != null : !_id.equals(((Navigation) (obj))._id))
            {
                return false;
            }
        }
        return true;
    }

    public Object getCachedModel()
    {
        return getExtra("__cached_model");
    }

    public Long getCreatedAt()
    {
        return _createdAt;
    }

    public DisplayMode getDisplayMode()
    {
        return _displayMode;
    }

    public Object getExtra(String s)
    {
        return _extras.get(s);
    }

    public Class getFragmentClass()
    {
        return _fragmentClass;
    }

    public ViewParameterType getFragmentViewParameterType()
    {
        return Pinalytics.b(getFragmentClass());
    }

    public ViewType getFragmentViewType()
    {
        return Pinalytics.a(getFragmentClass());
    }

    public String getId()
    {
        return _id;
    }

    public int getIntParcelable(String s)
    {
        return _bundle.getInt(s, 0);
    }

    public Location getLocation()
    {
        return _location;
    }

    public Board getModelAsBoard()
    {
        Object obj = getCachedModel();
        if (obj instanceof Board)
        {
            obj = (Board)obj;
        } else
        {
            Board board = ModelHelper.getBoard(getId());
            obj = board;
            if (board != null)
            {
                setCachedModel(board);
                return board;
            }
        }
        return ((Board) (obj));
    }

    public Category getModelAsCategory()
    {
        Object obj = getCachedModel();
        if (obj instanceof Category)
        {
            return (Category)obj;
        } else
        {
            Category category = ModelHelper.getCategory(getId());
            setCachedModel(category);
            return category;
        }
    }

    public Interest getModelAsInterest()
    {
        Object obj = getCachedModel();
        if (obj instanceof Interest)
        {
            obj = (Interest)obj;
        } else
        {
            Interest interest = ModelHelper.getInterest(getId());
            obj = interest;
            if (interest != null)
            {
                setCachedModel(interest);
                return interest;
            }
        }
        return ((Interest) (obj));
    }

    public Pin getModelAsPin()
    {
        Object obj = getCachedModel();
        if (obj instanceof Pin)
        {
            obj = (Pin)obj;
        } else
        {
            Pin pin = ModelHelper.getPin(getId());
            obj = pin;
            if (pin != null)
            {
                setCachedModel(pin);
                return pin;
            }
        }
        return ((Pin) (obj));
    }

    public Place getModelAsPlace()
    {
        Object obj = getCachedModel();
        if (obj instanceof Place)
        {
            return (Place)obj;
        } else
        {
            Place place = ModelHelper.getPlace(getId());
            setCachedModel(place);
            return place;
        }
    }

    public User getModelAsUser()
    {
        Object obj = getCachedModel();
        if (MyUser.isUserMe(getId()))
        {
            obj = MyUser.get();
        } else
        {
            if (obj instanceof User)
            {
                return (User)obj;
            }
            User user = ModelHelper.getUser(getId());
            obj = user;
            if (user != null)
            {
                setCachedModel(user);
                return user;
            }
        }
        return ((User) (obj));
    }

    public Parcelable getParcelable(String s)
    {
        return _bundle.getParcelable(s);
    }

    public ArrayList getStringArrayListParcelable(String s)
    {
        return _bundle.getStringArrayList(s);
    }

    public String getStringParcelable(String s)
    {
        return _bundle.getString(s);
    }

    public void putExtra(String s, Object obj)
    {
        _extras.put(s, obj);
    }

    public void putIntParcelable(String s, int i)
    {
        _bundle.putInt(s, i);
    }

    public void putParcelable(String s, Parcelable parcelable)
    {
        _bundle.putParcelable(s, parcelable);
    }

    public void putStringArrayListParcelable(String s, ArrayList arraylist)
    {
        _bundle.putStringArrayList(s, arraylist);
    }

    public void putStringParcelable(String s, String s1)
    {
        _bundle.putString(s, s1);
    }

    protected void readFromParcel(Parcel parcel)
    {
        if (parcel == null)
        {
            return;
        }
        try
        {
            _location = Location.from(parcel.readInt());
            _fragmentClass = Class.forName(parcel.readString());
            _id = parcel.readString();
            _createdAt = Long.valueOf(parcel.readLong());
            _displayMode = DisplayMode.from(parcel.readInt());
            _bundle = parcel.readBundle();
            _bundle.setClassLoader(com/pinterest/kit/application/PApplication.getClassLoader());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            PLog.error(parcel, "exception occurred", new Object[0]);
        }
    }

    public void removeExtra(String s)
    {
        _extras.remove(s);
    }

    public void removeParcelable(String s)
    {
        _bundle.remove(s);
    }

    public void setCachedModel(Object obj)
    {
        _extras.put("__cached_model", obj);
        if (obj instanceof Pin)
        {
            ModelAccessCache.put((Pin)obj);
        } else
        {
            if (obj instanceof Board)
            {
                ModelAccessCache.put((Board)obj);
                return;
            }
            if (obj instanceof User)
            {
                ModelAccessCache.put((User)obj);
                return;
            }
            if (obj instanceof Interest)
            {
                ModelAccessCache.put((Interest)obj);
                return;
            }
            if (obj instanceof Category)
            {
                ModelAccessCache.put((Category)obj);
                return;
            }
        }
    }

    public void setCreatedAt(Long long1)
    {
        _createdAt = long1;
    }

    public void setDisplayMode(DisplayMode displaymode)
    {
        _displayMode = displaymode;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setLocation(Location location)
    {
        _location = location;
        if (_location == Location.USER && Experiments.x())
        {
            _location = Location.USER_LIBRARY_PROFILE;
        }
        _fragmentClass = _location.getDisplayClass();
        _displayMode = (DisplayMode)_modeMap.get(_location);
    }

    public String toBreadCrumb()
    {
        String s1 = null;
        String s;
        if (_location != null && _location.getDisplayClass() != null)
        {
            s = _location.getDisplayClass().getSimpleName();
        } else
        {
            s = null;
        }
        if (getCachedModel() != null)
        {
            s1 = getCachedModel().getClass().getSimpleName();
        }
        return (new StringBuilder("location:")).append(s).append(" ID:").append(_id).append(" Model:").append(s1).toString();
    }

    public String toString()
    {
        return (new StringBuilder()).append(_fragmentClass).append(":").append(_createdAt).append(":").append(_id).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (parcel == null)
        {
            return;
        } else
        {
            parcel.writeInt(_location.ordinal());
            parcel.writeString(_fragmentClass.getName());
            parcel.writeString(_id);
            parcel.writeLong(_createdAt.longValue());
            parcel.writeInt(_displayMode.ordinal());
            parcel.writeBundle(_bundle);
            return;
        }
    }

    static 
    {
        Object obj = new _cls1();
        _modeMap = ((HashMap) (obj));
        ((HashMap) (obj)).put(Location.CSR_PICKER, DisplayMode.MODAL);
        _modeMap.put(Location.REPIN, DisplayMode.MODAL);
        _modeMap.put(Location.BOARD_SORT, DisplayMode.MODAL);
        _modeMap.put(Location.SHARE_EXTENSION, DisplayMode.MODAL);
        _modeMap.put(Location.BROWSER, DisplayMode.DEFAULT);
        HashMap hashmap = _modeMap;
        Location location = Location.INVITE_FRIENDS;
        if (Device.isTablet())
        {
            obj = DisplayMode.OVERLAY;
        } else
        {
            obj = DisplayMode.DEFAULT;
        }
        hashmap.put(location, obj);
        hashmap = _modeMap;
        location = Location.FIND_FRIENDS;
        if (Device.isTablet())
        {
            obj = DisplayMode.OVERLAY;
        } else
        {
            obj = DisplayMode.DEFAULT;
        }
        hashmap.put(location, obj);
        hashmap = _modeMap;
        location = Location.INVITE_ALL_FRIENDS;
        if (Device.isTablet())
        {
            obj = DisplayMode.OVERLAY;
        } else
        {
            obj = DisplayMode.DEFAULT;
        }
        hashmap.put(location, obj);
        _modeMap.put(Location.SEND_SHARE, DisplayMode.MODAL);
        _modeMap.put(Location.UPLOAD_CONTACTS, DisplayMode.MODAL);
        _modeMap.put(Location.APP_PERMISSION_SETTINGS_GUIDE, DisplayMode.MODAL);
        _modeMap.put(Location.PRICE_FILTER, DisplayMode.MODAL);
    }

    private class DisplayMode extends Enum
    {

        private static final DisplayMode $VALUES[];
        public static final DisplayMode DEFAULT;
        public static final DisplayMode EDUCATION;
        public static final DisplayMode EMBED;
        public static final DisplayMode MODAL;
        public static final DisplayMode OVERLAY;
        public static final DisplayMode SYSTEM;
        private static DisplayMode values[];

        public static DisplayMode from(int i)
        {
            if (values == null)
            {
                values = values();
            }
            if (i < 0 || i >= values.length)
            {
                return DEFAULT;
            } else
            {
                return values[i];
            }
        }

        public static DisplayMode valueOf(String s)
        {
            return (DisplayMode)Enum.valueOf(com/pinterest/activity/task/model/Navigation$DisplayMode, s);
        }

        public static DisplayMode[] values()
        {
            return (DisplayMode[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new DisplayMode("DEFAULT", 0);
            MODAL = new DisplayMode("MODAL", 1);
            OVERLAY = new DisplayMode("OVERLAY", 2);
            SYSTEM = new DisplayMode("SYSTEM", 3);
            EDUCATION = new DisplayMode("EDUCATION", 4);
            EMBED = new DisplayMode("EMBED", 5);
            $VALUES = (new DisplayMode[] {
                DEFAULT, MODAL, OVERLAY, SYSTEM, EDUCATION, EMBED
            });
        }

        private DisplayMode(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1 extends HashMap
    {

        public final DisplayMode get(Object obj)
        {
            DisplayMode displaymode = (DisplayMode)super.get(obj);
            obj = displaymode;
            if (displaymode == null)
            {
                obj = DisplayMode.DEFAULT;
            }
            return ((DisplayMode) (obj));
        }

        public final volatile Object get(Object obj)
        {
            return get(obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements android.os.Parcelable.Creator
    {

        public final Navigation createFromParcel(Parcel parcel)
        {
            return new Navigation(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Navigation[] newArray(int i)
        {
            return new Navigation[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls2()
        {
        }
    }

}
