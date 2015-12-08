// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            BackStackRecord, Fragment, FragmentManagerImpl

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int mOps[];
    final ArrayList mSharedElementSourceNames;
    final ArrayList mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    public BackStackState(Parcel parcel)
    {
        mOps = parcel.createIntArray();
        mTransition = parcel.readInt();
        mTransitionStyle = parcel.readInt();
        mName = parcel.readString();
        mIndex = parcel.readInt();
        mBreadCrumbTitleRes = parcel.readInt();
        mBreadCrumbTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mBreadCrumbShortTitleRes = parcel.readInt();
        mBreadCrumbShortTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mSharedElementSourceNames = parcel.createStringArrayList();
        mSharedElementTargetNames = parcel.createStringArrayList();
    }

    public BackStackState(FragmentManagerImpl fragmentmanagerimpl, BackStackRecord backstackrecord)
    {
        fragmentmanagerimpl = backstackrecord.mHead;
        int i;
        int j;
        for (i = 0; fragmentmanagerimpl != null; i = j)
        {
            j = i;
            if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed != null)
            {
                j = i + ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
            }
            fragmentmanagerimpl = ((BackStackRecord.Op) (fragmentmanagerimpl)).next;
        }

        mOps = new int[i + backstackrecord.mNumOp * 7];
        if (!backstackrecord.mAddToBackStack)
        {
            throw new IllegalStateException("Not on back stack");
        }
        fragmentmanagerimpl = backstackrecord.mHead;
        i = 0;
        while (fragmentmanagerimpl != null) 
        {
            int ai[] = mOps;
            int k = i + 1;
            ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).cmd;
            ai = mOps;
            int l = k + 1;
            if (((BackStackRecord.Op) (fragmentmanagerimpl)).fragment != null)
            {
                i = ((BackStackRecord.Op) (fragmentmanagerimpl)).fragment.mIndex;
            } else
            {
                i = -1;
            }
            ai[k] = i;
            ai = mOps;
            i = l + 1;
            ai[l] = ((BackStackRecord.Op) (fragmentmanagerimpl)).enterAnim;
            ai = mOps;
            k = i + 1;
            ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).exitAnim;
            ai = mOps;
            i = k + 1;
            ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popEnterAnim;
            ai = mOps;
            k = i + 1;
            ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popExitAnim;
            if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed != null)
            {
                int i1 = ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
                int ai1[] = mOps;
                i = k + 1;
                ai1[k] = i1;
                for (k = 0; k < i1;)
                {
                    mOps[i] = ((Fragment)((BackStackRecord.Op) (fragmentmanagerimpl)).removed.get(k)).mIndex;
                    k++;
                    i++;
                }

            } else
            {
                int ai2[] = mOps;
                i = k + 1;
                ai2[k] = 0;
            }
            fragmentmanagerimpl = ((BackStackRecord.Op) (fragmentmanagerimpl)).next;
        }
        mTransition = backstackrecord.mTransition;
        mTransitionStyle = backstackrecord.mTransitionStyle;
        mName = backstackrecord.mName;
        mIndex = backstackrecord.mIndex;
        mBreadCrumbTitleRes = backstackrecord.mBreadCrumbTitleRes;
        mBreadCrumbTitleText = backstackrecord.mBreadCrumbTitleText;
        mBreadCrumbShortTitleRes = backstackrecord.mBreadCrumbShortTitleRes;
        mBreadCrumbShortTitleText = backstackrecord.mBreadCrumbShortTitleText;
        mSharedElementSourceNames = backstackrecord.mSharedElementSourceNames;
        mSharedElementTargetNames = backstackrecord.mSharedElementTargetNames;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final BackStackRecord instantiate(FragmentManagerImpl fragmentmanagerimpl)
    {
        BackStackRecord backstackrecord = new BackStackRecord(fragmentmanagerimpl);
        int k = 0;
        for (int i = 0; i < mOps.length;)
        {
            BackStackRecord.Op op = new BackStackRecord.Op();
            int ai[] = mOps;
            int j = i + 1;
            op.cmd = ai[i];
            if (FragmentManagerImpl.DEBUG)
            {
                (new StringBuilder("Instantiate ")).append(backstackrecord).append(" op #").append(k).append(" base fragment #").append(mOps[j]);
            }
            ai = mOps;
            i = j + 1;
            j = ai[j];
            int i1;
            if (j >= 0)
            {
                op.fragment = (Fragment)fragmentmanagerimpl.mActive.get(j);
            } else
            {
                op.fragment = null;
            }
            ai = mOps;
            j = i + 1;
            op.enterAnim = ai[i];
            ai = mOps;
            i = j + 1;
            op.exitAnim = ai[j];
            ai = mOps;
            j = i + 1;
            op.popEnterAnim = ai[i];
            ai = mOps;
            i = j + 1;
            op.popExitAnim = ai[j];
            ai = mOps;
            j = i + 1;
            i1 = ai[i];
            i = j;
            if (i1 > 0)
            {
                op.removed = new ArrayList(i1);
                int l = 0;
                do
                {
                    i = j;
                    if (l >= i1)
                    {
                        break;
                    }
                    if (FragmentManagerImpl.DEBUG)
                    {
                        (new StringBuilder("Instantiate ")).append(backstackrecord).append(" set remove fragment #").append(mOps[j]);
                    }
                    Fragment fragment = (Fragment)fragmentmanagerimpl.mActive.get(mOps[j]);
                    op.removed.add(fragment);
                    l++;
                    j++;
                } while (true);
            }
            backstackrecord.addOp(op);
            k++;
        }

        backstackrecord.mTransition = mTransition;
        backstackrecord.mTransitionStyle = mTransitionStyle;
        backstackrecord.mName = mName;
        backstackrecord.mIndex = mIndex;
        backstackrecord.mAddToBackStack = true;
        backstackrecord.mBreadCrumbTitleRes = mBreadCrumbTitleRes;
        backstackrecord.mBreadCrumbTitleText = mBreadCrumbTitleText;
        backstackrecord.mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
        backstackrecord.mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
        backstackrecord.mSharedElementSourceNames = mSharedElementSourceNames;
        backstackrecord.mSharedElementTargetNames = mSharedElementTargetNames;
        backstackrecord.bumpBackStackNesting(1);
        return backstackrecord;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeIntArray(mOps);
        parcel.writeInt(mTransition);
        parcel.writeInt(mTransitionStyle);
        parcel.writeString(mName);
        parcel.writeInt(mIndex);
        parcel.writeInt(mBreadCrumbTitleRes);
        TextUtils.writeToParcel(mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(mSharedElementSourceNames);
        parcel.writeStringList(mSharedElementTargetNames);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final BackStackState createFromParcel(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final BackStackState[] newArray(int i)
        {
            return new BackStackState[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
