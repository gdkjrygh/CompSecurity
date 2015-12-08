// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class itemView
{

    public final View itemView;
    int mFlags;
    private int mIsRecyclableCount;
    long mItemId;
    int mItemViewType;
    int mOldPosition;
    RecyclerView mOwnerRecyclerView;
    public int mPosition;
    public int mPreLayoutPosition;
    mFlags mScrapContainer;
    mFlags mShadowedHolder;
    mFlags mShadowingHolder;

    final void addFlags(int i)
    {
        mFlags = mFlags | i;
    }

    final void clearOldPosition()
    {
        mOldPosition = -1;
        mPreLayoutPosition = -1;
    }

    final void clearReturnedFromScrapFlag()
    {
        mFlags = mFlags & 0xffffffdf;
    }

    final void clearTmpDetachFlag()
    {
        mFlags = mFlags & 0xfffffeff;
    }

    public final int getLayoutPosition()
    {
        if (mPreLayoutPosition == -1)
        {
            return mPosition;
        } else
        {
            return mPreLayoutPosition;
        }
    }

    final boolean isBound()
    {
        return (mFlags & 1) != 0;
    }

    final boolean isChanged()
    {
        return (mFlags & 0x40) != 0;
    }

    final boolean isInvalid()
    {
        return (mFlags & 4) != 0;
    }

    public final boolean isRecyclable()
    {
        return (mFlags & 0x10) == 0 && !ViewCompat.hasTransientState(itemView);
    }

    public final boolean isRemoved()
    {
        return (mFlags & 8) != 0;
    }

    final boolean isScrap()
    {
        return mScrapContainer != null;
    }

    final boolean isTmpDetached()
    {
        return (mFlags & 0x100) != 0;
    }

    public final boolean needsUpdate()
    {
        return (mFlags & 2) != 0;
    }

    final void offsetPosition(int i, boolean flag)
    {
        if (mOldPosition == -1)
        {
            mOldPosition = mPosition;
        }
        if (mPreLayoutPosition == -1)
        {
            mPreLayoutPosition = mPosition;
        }
        if (flag)
        {
            mPreLayoutPosition = mPreLayoutPosition + i;
        }
        mPosition = mPosition + i;
        if (itemView.getLayoutParams() != null)
        {
            ((s)itemView.getLayoutParams()).mInsetsDirty = true;
        }
    }

    final void resetInternal()
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

    final void setFlags(int i, int j)
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
            Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
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

    final boolean shouldIgnore()
    {
        return (mFlags & 0x80) != 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
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
            stringbuilder.append((new StringBuilder(" not recyclable(")).append(mIsRecyclableCount).append(")").toString());
        }
        boolean flag;
        if ((mFlags & 0x200) != 0 || isInvalid())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append("undefined adapter position");
        }
        if (itemView.getParent() == null)
        {
            stringbuilder.append(" no parent");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    final void unScrap()
    {
        mScrapContainer.scrapView(this);
    }

    final boolean wasReturnedFromScrap()
    {
        return (mFlags & 0x20) != 0;
    }


    public s(View view)
    {
        mPosition = -1;
        mOldPosition = -1;
        mItemId = -1L;
        mItemViewType = -1;
        mPreLayoutPosition = -1;
        mShadowedHolder = null;
        mShadowingHolder = null;
        mIsRecyclableCount = 0;
        mScrapContainer = null;
        if (view == null)
        {
            throw new IllegalArgumentException("itemView may not be null");
        } else
        {
            itemView = view;
            return;
        }
    }
}
