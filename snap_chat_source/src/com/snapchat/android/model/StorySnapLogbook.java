// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import AA;
import AQ;
import Bd;
import Bk;
import RW;
import SN;
import SO;
import SQ;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.snapchat.android.model:
//            Mediabryo

public final class StorySnapLogbook
{
    public static final class ActionState extends Enum
    {

        private static final ActionState $VALUES[];
        public static final ActionState DELETED;
        public static final ActionState DELETING;
        public static final ActionState READY;
        public static final ActionState SAVED;
        public static final ActionState SAVING;

        public static ActionState valueOf(String s)
        {
            return (ActionState)Enum.valueOf(com/snapchat/android/model/StorySnapLogbook$ActionState, s);
        }

        public static ActionState[] values()
        {
            return (ActionState[])$VALUES.clone();
        }

        static 
        {
            READY = new ActionState("READY", 0);
            SAVING = new ActionState("SAVING", 1);
            DELETING = new ActionState("DELETING", 2);
            SAVED = new ActionState("SAVED", 3);
            DELETED = new ActionState("DELETED", 4);
            $VALUES = (new ActionState[] {
                READY, SAVING, DELETING, SAVED, DELETED
            });
        }

        private ActionState(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class a
    {

        public boolean mIsOfficialStorySnapLogbook;
        public SN mPoster;
        public String mStoryGroupId;
        Bk mStorySnap;
        SO mStorySnapExtra;
        List mStorySnapNotes;

        public final StorySnapLogbook a()
        {
            return new StorySnapLogbook(this, (byte)0);
        }

        public a(Bk bk)
        {
            mStorySnapNotes = new ArrayList();
            mStorySnapExtra = new SO();
            mIsOfficialStorySnapLogbook = false;
            mStorySnap = bk;
        }

        public a(SQ sq)
        {
            mStorySnapNotes = new ArrayList();
            mStorySnapExtra = new SO();
            mIsOfficialStorySnapLogbook = false;
            mStorySnap = new Bk(sq.b());
            mStorySnapNotes = sq.d();
            mStorySnapExtra = sq.c();
            mIsOfficialStorySnapLogbook = false;
        }
    }

    public static interface b
    {
    }


    public transient ActionState mActionState;
    private transient b mChangedListener;
    public transient boolean mIsDeletingAllowed;
    public final boolean mIsOfficialStorySnapLogbook;
    public final SN mPoster;
    public transient String mStoryId;
    public final Bk mStorySnap;
    public final SO mStorySnapExtra;
    public final List mStorySnapNotes;

    public StorySnapLogbook(AA aa, String s, String s1)
    {
        this(new Bk(aa, s, s1), ((List) (null)), ((SO) (null)));
        mStoryId = ((AQ)((Bd)((Mediabryo) (aa)).mMediaMailingMetadata).mPostToStories.get(0)).mStoryId;
    }

    public StorySnapLogbook(Bk bk, List list, SO so)
    {
        mActionState = ActionState.READY;
        mIsDeletingAllowed = true;
        mChangedListener = null;
        mStorySnap = bk;
        mStorySnapNotes = list;
        mStorySnapExtra = so;
        mIsOfficialStorySnapLogbook = false;
        mPoster = null;
    }

    public StorySnapLogbook(RW rw)
    {
        this(new Bk(rw.b()), ((List) (null)), rw.c());
    }

    public StorySnapLogbook(SQ sq)
    {
        this(new Bk(sq.b()), sq.d(), sq.c());
    }

    private StorySnapLogbook(a a1)
    {
        mActionState = ActionState.READY;
        mIsDeletingAllowed = true;
        mChangedListener = null;
        mStorySnap = a1.mStorySnap;
        mStorySnapNotes = a1.mStorySnapNotes;
        mStorySnapExtra = a1.mStorySnapExtra;
        mIsOfficialStorySnapLogbook = a1.mIsOfficialStorySnapLogbook;
        mPoster = a1.mPoster;
        mStoryId = a1.mStoryGroupId;
    }

    StorySnapLogbook(a a1, byte byte0)
    {
        this(a1);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof StorySnapLogbook))
        {
            return false;
        } else
        {
            obj = (StorySnapLogbook)obj;
            return TextUtils.equals(mStorySnap.mClientId, ((StorySnapLogbook) (obj)).mStorySnap.mClientId);
        }
    }

    public final int hashCode()
    {
        return mStorySnap.mClientId.hashCode() + 527;
    }
}
