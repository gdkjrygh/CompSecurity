// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.adapters;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.SimpleArrayMap;
import com.android.ex.photo.Intents;
import com.android.ex.photo.fragments.PhotoViewFragment;

// Referenced classes of package com.android.ex.photo.adapters:
//            BaseCursorPagerAdapter

public final class PhotoPagerAdapter extends BaseCursorPagerAdapter
{

    protected SimpleArrayMap mColumnIndices;
    protected boolean mDisplayThumbsFullScreen;
    protected final float mMaxScale;

    public PhotoPagerAdapter(Context context, FragmentManager fragmentmanager, Cursor cursor, float f, boolean flag)
    {
        super(context, fragmentmanager, cursor);
        mColumnIndices = new SimpleArrayMap(com.android.ex.photo.provider.PhotoContract.PhotoQuery.PROJECTION.length);
        mMaxScale = f;
        mDisplayThumbsFullScreen = flag;
    }

    private static PhotoViewFragment createPhotoViewFragment(Intent intent, int i, boolean flag)
    {
        return PhotoViewFragment.newInstance(intent, i, flag);
    }

    private static Class getPhotoViewFragmentClass()
    {
        return com/android/ex/photo/fragments/PhotoViewFragment;
    }

    private String getString(Cursor cursor, String s)
    {
        if (mColumnIndices.containsKey(s))
        {
            return cursor.getString(((Integer)mColumnIndices.get(s)).intValue());
        } else
        {
            return null;
        }
    }

    private boolean shouldShowLoadingIndicator(Cursor cursor)
    {
        cursor = getString(cursor, "loadingIndicator");
        if (cursor == null)
        {
            return false;
        } else
        {
            return Boolean.valueOf(cursor).booleanValue();
        }
    }

    public final Fragment getItem(Context context, Cursor cursor, int i)
    {
        context = getPhotoUri(cursor);
        String s = getThumbnailUri(cursor);
        boolean flag2 = shouldShowLoadingIndicator(cursor);
        boolean flag1 = false;
        boolean flag = flag1;
        if (context == null)
        {
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        cursor = Intents.newPhotoViewFragmentIntentBuilder(mContext, getPhotoViewFragmentClass());
        cursor.setResolvedPhotoUri(context).setThumbnailUri(s).setDisplayThumbsFullScreen(mDisplayThumbsFullScreen).setMaxInitialScale(mMaxScale);
        return createPhotoViewFragment(cursor.build(), i, flag);
    }

    public final String getPhotoUri(Cursor cursor)
    {
        return getString(cursor, "contentUri");
    }

    public final String getThumbnailUri(Cursor cursor)
    {
        return getString(cursor, "thumbnailUri");
    }

    public final Cursor swapCursor(Cursor cursor)
    {
        boolean flag = false;
        mColumnIndices.clear();
        if (cursor != null)
        {
            String as[] = com.android.ex.photo.provider.PhotoContract.PhotoQuery.PROJECTION;
            int l = as.length;
            for (int i = 0; i < l; i++)
            {
                String s = as[i];
                mColumnIndices.put(s, Integer.valueOf(cursor.getColumnIndexOrThrow(s)));
            }

            as = com.android.ex.photo.provider.PhotoContract.PhotoQuery.OPTIONAL_COLUMNS;
            l = as.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                String s1 = as[j];
                int k = cursor.getColumnIndex(s1);
                if (k != -1)
                {
                    mColumnIndices.put(s1, Integer.valueOf(k));
                }
            }

        }
        return super.swapCursor(cursor);
    }
}
