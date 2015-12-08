// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.database.CursorIndexOutOfBoundsException;
import com.facebook.model.GraphObject;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.facebook.widget:
//            GraphObjectCursor

class SimpleGraphObjectCursor
    implements GraphObjectCursor
{

    private boolean closed;
    private boolean fromCache;
    private ArrayList graphObjects;
    private boolean moreObjectsAvailable;
    private int pos;

    SimpleGraphObjectCursor()
    {
        pos = -1;
        closed = false;
        graphObjects = new ArrayList();
        moreObjectsAvailable = false;
        fromCache = false;
    }

    SimpleGraphObjectCursor(SimpleGraphObjectCursor simplegraphobjectcursor)
    {
        pos = -1;
        closed = false;
        graphObjects = new ArrayList();
        moreObjectsAvailable = false;
        fromCache = false;
        pos = simplegraphobjectcursor.pos;
        closed = simplegraphobjectcursor.closed;
        graphObjects = new ArrayList();
        graphObjects.addAll(simplegraphobjectcursor.graphObjects);
        fromCache = simplegraphobjectcursor.fromCache;
    }

    public void addGraphObjects(Collection collection, boolean flag)
    {
        graphObjects.addAll(collection);
        fromCache = fromCache | flag;
    }

    public boolean areMoreObjectsAvailable()
    {
        return moreObjectsAvailable;
    }

    public void close()
    {
        closed = true;
    }

    public int getCount()
    {
        return graphObjects.size();
    }

    public GraphObject getGraphObject()
    {
        if (pos < 0)
        {
            throw new CursorIndexOutOfBoundsException("Before first object.");
        }
        if (pos >= graphObjects.size())
        {
            throw new CursorIndexOutOfBoundsException("After last object.");
        } else
        {
            return (GraphObject)graphObjects.get(pos);
        }
    }

    public int getPosition()
    {
        return pos;
    }

    public boolean isAfterLast()
    {
        int i = getCount();
        return i == 0 || pos == i;
    }

    public boolean isBeforeFirst()
    {
        return getCount() == 0 || pos == -1;
    }

    public boolean isClosed()
    {
        return closed;
    }

    public boolean isFirst()
    {
        return pos == 0 && getCount() != 0;
    }

    public boolean isFromCache()
    {
        return fromCache;
    }

    public boolean isLast()
    {
        int i = getCount();
        return pos == i - 1 && i != 0;
    }

    public boolean move(int i)
    {
        return moveToPosition(pos + i);
    }

    public boolean moveToFirst()
    {
        return moveToPosition(0);
    }

    public boolean moveToLast()
    {
        return moveToPosition(getCount() - 1);
    }

    public boolean moveToNext()
    {
        return moveToPosition(pos + 1);
    }

    public boolean moveToPosition(int i)
    {
        int j = getCount();
        if (i >= j)
        {
            pos = j;
            return false;
        }
        if (i < 0)
        {
            pos = -1;
            return false;
        } else
        {
            pos = i;
            return true;
        }
    }

    public boolean moveToPrevious()
    {
        return moveToPosition(pos - 1);
    }

    public void setFromCache(boolean flag)
    {
        fromCache = flag;
    }

    public void setMoreObjectsAvailable(boolean flag)
    {
        moreObjectsAvailable = flag;
    }
}
