// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import Bf;
import IJ;
import IY;
import Qs;
import RT;
import RW;
import SQ;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.snapchat.android.model:
//            StorySnapLogbook

public class StoryGroup
{
    public static final class ActionState extends Enum
    {

        private static final ActionState $VALUES[];
        public static final ActionState CONFIRMING_SAVE;
        public static final ActionState READY;
        public static final ActionState SAVED;
        public static final ActionState SAVING;

        public static ActionState valueOf(String s)
        {
            return (ActionState)Enum.valueOf(com/snapchat/android/model/StoryGroup$ActionState, s);
        }

        public static ActionState[] values()
        {
            return (ActionState[])$VALUES.clone();
        }

        static 
        {
            READY = new ActionState("READY", 0);
            CONFIRMING_SAVE = new ActionState("CONFIRMING_SAVE", 1);
            SAVING = new ActionState("SAVING", 2);
            SAVED = new ActionState("SAVED", 3);
            $VALUES = (new ActionState[] {
                READY, CONFIRMING_SAVE, SAVING, SAVED
            });
        }

        private ActionState(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class a
    {

        public String mCustomDescription;
        public String mDisplayName;
        public boolean mShouldFetchCustomDescription;
        String mStoryId;

        public a(String s)
        {
            mStoryId = s;
        }
    }

    public static interface b
    {

        public abstract void a(StoryGroup storygroup);
    }


    private static final String TAG = "StoryGroup";
    public transient ActionState mActionState;
    private final transient List mAllStorySnapLogbooks;
    public transient b mChangedListener;
    protected String mCustomDescription;
    public String mDisplayName;
    protected boolean mIsOfficialStoryGroup;
    public transient int mSaveProgress;
    protected boolean mShouldFetchCustomDescription;
    public String mStoryId;
    public List mStorySnapLogbooks;

    public StoryGroup()
    {
        mStorySnapLogbooks = new ArrayList();
        mIsOfficialStoryGroup = false;
        mActionState = ActionState.READY;
        mSaveProgress = 0;
        mAllStorySnapLogbooks = new ArrayList();
        mChangedListener = null;
    }

    public StoryGroup(RT rt)
    {
        mStorySnapLogbooks = new ArrayList();
        mIsOfficialStoryGroup = false;
        mActionState = ActionState.READY;
        mSaveProgress = 0;
        mAllStorySnapLogbooks = new ArrayList();
        mChangedListener = null;
        mStoryId = rt.a();
        mDisplayName = rt.b();
        mShouldFetchCustomDescription = IJ.a(rt.d());
        mStorySnapLogbooks.clear();
        rt = rt.c();
        if (rt != null && !rt.isEmpty())
        {
            StorySnapLogbook storysnaplogbook;
            for (rt = rt.iterator(); rt.hasNext(); mStorySnapLogbooks.add(storysnaplogbook))
            {
                storysnaplogbook = new StorySnapLogbook((RW)rt.next());
                storysnaplogbook.mStoryId = mStoryId;
            }

        }
    }

    private StoryGroup(a a1)
    {
        mStorySnapLogbooks = new ArrayList();
        mIsOfficialStoryGroup = false;
        mActionState = ActionState.READY;
        mSaveProgress = 0;
        mAllStorySnapLogbooks = new ArrayList();
        mChangedListener = null;
        mStoryId = a1.mStoryId;
        mDisplayName = a1.mDisplayName;
        mShouldFetchCustomDescription = a1.mShouldFetchCustomDescription;
        mCustomDescription = a1.mCustomDescription;
    }

    public StoryGroup(a a1, byte byte0)
    {
        this(a1);
    }

    public StoryGroup(String s)
    {
        mStorySnapLogbooks = new ArrayList();
        mIsOfficialStoryGroup = false;
        mActionState = ActionState.READY;
        mSaveProgress = 0;
        mAllStorySnapLogbooks = new ArrayList();
        mChangedListener = null;
        mStoryId = s;
    }

    public StoryGroup(String s, String s1)
    {
        mStorySnapLogbooks = new ArrayList();
        mIsOfficialStoryGroup = false;
        mActionState = ActionState.READY;
        mSaveProgress = 0;
        mAllStorySnapLogbooks = new ArrayList();
        mChangedListener = null;
        mStoryId = s;
        mDisplayName = s1;
    }

    public StoryGroup(String s, String s1, List list)
    {
        mStorySnapLogbooks = new ArrayList();
        mIsOfficialStoryGroup = false;
        mActionState = ActionState.READY;
        mSaveProgress = 0;
        mAllStorySnapLogbooks = new ArrayList();
        mChangedListener = null;
        mStoryId = s;
        mDisplayName = s1;
        mStorySnapLogbooks.clear();
        mIsOfficialStoryGroup = true;
        list = list.iterator();
        while (list.hasNext()) 
        {
            Object obj = (SQ)list.next();
            StorySnapLogbook.a a1 = new StorySnapLogbook.a(((SQ) (obj)));
            a1.mIsOfficialStorySnapLogbook = true;
            a1.mStoryGroupId = s;
            if (obj instanceof Qs)
            {
                a1.mPoster = ((Qs)obj).a();
            } else
            {
                Timber.e("StoryGroup", (new StringBuilder("logbook don't have poster for official stories: ")).append(s).append(", ").append(s1).toString(), new Object[0]);
            }
            obj = a1.a();
            mStorySnapLogbooks.add(obj);
        }
    }

    private void a()
    {
        if (mChangedListener != null)
        {
            mChangedListener.a(this);
        }
    }

    public final List a(boolean flag)
    {
        if (flag)
        {
            List list = j();
            List list1 = k();
            mAllStorySnapLogbooks.clear();
            mAllStorySnapLogbooks.addAll(IY.a(list, mStoryId));
            mAllStorySnapLogbooks.addAll(IY.a(list1, mStoryId));
            mAllStorySnapLogbooks.addAll(mStorySnapLogbooks);
        }
        return mAllStorySnapLogbooks;
    }

    public final void a(int i1)
    {
        if (i1 < 0 || i1 > 100)
        {
            throw new IllegalArgumentException((new StringBuilder("Save progress out of range: ")).append(i1).toString());
        } else
        {
            mSaveProgress = i1;
            a();
            return;
        }
    }

    public final void a(ActionState actionstate)
    {
        if (actionstate == null)
        {
            throw new NullPointerException("actionState is null");
        }
        if (mActionState != actionstate)
        {
            mActionState = actionstate;
            if (actionstate != ActionState.SAVING)
            {
                mSaveProgress = 0;
            }
            a();
        }
    }

    public final void a(String s)
    {
        mCustomDescription = s;
        a();
    }

    public final String c()
    {
        return mStoryId;
    }

    public final String d()
    {
        return mDisplayName;
    }

    public final String e()
    {
        if (TextUtils.isEmpty(mDisplayName))
        {
            return mStoryId;
        } else
        {
            return mDisplayName;
        }
    }

    public final boolean f()
    {
        return mIsOfficialStoryGroup;
    }

    public final boolean g()
    {
        return mShouldFetchCustomDescription;
    }

    public final String h()
    {
        return mCustomDescription;
    }

    public final List i()
    {
        return mStorySnapLogbooks;
    }

    public final List j()
    {
        return new ArrayList(Bf.a().a(mStoryId).values());
    }

    public final List k()
    {
        return new ArrayList(Bf.a().b(mStoryId).values());
    }

    public final int l()
    {
        Bf bf = Bf.a();
        int i1 = bf.a(mStoryId).size();
        return bf.b(mStoryId).size() + i1;
    }

    public final int m()
    {
        Bf bf = Bf.a();
        int i1 = mStorySnapLogbooks.size();
        int j1 = bf.a(mStoryId).size();
        return bf.b(mStoryId).size() + (i1 + j1);
    }

    public final Collection n()
    {
        ArrayList arraylist = new ArrayList(mAllStorySnapLogbooks.size());
        for (Iterator iterator = mAllStorySnapLogbooks.iterator(); iterator.hasNext(); arraylist.add(((StorySnapLogbook)iterator.next()).mStorySnap)) { }
        return arraylist;
    }
}
