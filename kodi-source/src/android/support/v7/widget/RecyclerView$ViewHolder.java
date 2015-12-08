// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class mScrapContainer
{

    public final View itemView;
    private int mFlags;
    private int mIsRecyclableCount;
    long mItemId;
    int mItemViewType;
    int mOldPosition;
    int mPosition;
    int mPreLayoutPosition;
    private mFlags mScrapContainer;
    mFlags mShadowedHolder;
    mFlags mShadowingHolder;

    void addFlags(int i)
    {
        mFlags = mFlags | i;
    }

    void clearOldPosition()
    {
        mOldPosition = -1;
        mPreLayoutPosition = -1;
    }

    void clearReturnedFromScrapFlag()
    {
        mFlags = mFlags & 0xffffffdf;
    }

    void clearTmpDetachFlag()
    {
        mFlags = mFlags & 0xfffffeff;
    }

    public final long getItemId()
    {
        return mItemId;
    }

    public final int getItemViewType()
    {
        return mItemViewType;
    }

    public final int getPosition()
    {
        if (mPreLayoutPosition == -1)
        {
            return mPosition;
        } else
        {
            return mPreLayoutPosition;
        }
    }

    boolean isBound()
    {
        return (mFlags & 1) != 0;
    }

    boolean isChanged()
    {
        return (mFlags & 0x40) != 0;
    }

    boolean isInvalid()
    {
        return (mFlags & 4) != 0;
    }

    public final boolean isRecyclable()
    {
        return (mFlags & 0x10) == 0 && !ViewCompat.hasTransientState(itemView);
    }

    boolean isRemoved()
    {
        return (mFlags & 8) != 0;
    }

    boolean isScrap()
    {
        return mScrapContainer != null;
    }

    boolean isTmpDetached()
    {
        return (mFlags & 0x100) != 0;
    }

    boolean needsUpdate()
    {
        return (mFlags & 2) != 0;
    }

    void resetInternal()
    {
        mFlags = 0;
        mPosition = -1;
        mOldPosition = -1;
        mItemId = -1L;
        mPreLayoutPosition = -1;
        mIsRecyclableCount = 0;
        mShadowedHolder = null;
        mShadowingHolder = null;
    }

    void saveOldPosition()
    {
        if (mOldPosition == -1)
        {
            mOldPosition = mPosition;
        }
    }

    void setFlags(int i, int j)
    {
        mFlags = mFlags & ~j | i & j;
    }

    public final void setIsRecyclable(boolean flag)
    {
        int i;
        if (flag)
        {
            i = mIsRecyclableCount - 1;
        } else
        {
            i = mIsRecyclableCount + 1;
        }
        mIsRecyclableCount = i;
        if (mIsRecyclableCount < 0)
        {
            mIsRecyclableCount = 0;
            Log.e("View", (new StringBuilder()).append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this).toString());
        } else
        {
            if (!flag && mIsRecyclableCount == 1)
            {
                mFlags = mFlags | 0x10;
                return;
            }
            if (flag && mIsRecyclableCount == 0)
            {
                mFlags = mFlags & 0xffffffef;
                return;
            }
        }
    }

    void setScrapContainer(mFlags mflags)
    {
        mScrapContainer = mflags;
    }

    boolean shouldIgnore()
    {
        return (mFlags & 0x80) != 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append("ViewHolder{").append(Integer.toHexString(hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
        if (isScrap())
        {
            stringbuilder.append(" scrap");
        }
        if (isInvalid())
        {
            stringbuilder.append(" invalid");
        }
        if (!isBound())
        {
            stringbuilder.append(" unbound");
        }
        if (needsUpdate())
        {
            stringbuilder.append(" update");
        }
        if (isRemoved())
        {
            stringbuilder.append(" removed");
        }
        if (shouldIgnore())
        {
            stringbuilder.append(" ignored");
        }
        if (isChanged())
        {
            stringbuilder.append(" changed");
        }
        if (isTmpDetached())
        {
            stringbuilder.append(" tmpDetached");
        }
        if (!isRecyclable())
        {
            stringbuilder.append((new StringBuilder()).append(" not recyclable(").append(mIsRecyclableCount).append(")").toString());
        }
        if (itemView.getParent() == null)
        {
            stringbuilder.append(" no parent");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    void unScrap()
    {
        mScrapContainer.scrapView(this);
    }

    boolean wasReturnedFromScrap()
    {
        return (mFlags & 0x20) != 0;
    }


/*
    static  access$4002( ,  1)
    {
        .mScrapContainer = 1;
        return 1;
    }

*/
}
