// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            BackStackRecord, Fragment, FragmentManagerImpl

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BackStackState createFromParcel(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public BackStackState[] newArray(int i)
        {
            return new BackStackState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
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

    public BackStackState(BackStackRecord backstackrecord)
    {
        BackStackRecord.Op op = backstackrecord.mHead;
        int i;
        int j;
        for (i = 0; op != null; i = j)
        {
            j = i;
            if (op.removed != null)
            {
                j = i + op.removed.size();
            }
            op = op.next;
        }

        mOps = new int[i + backstackrecord.mNumOp * 7];
        if (!backstackrecord.mAddToBackStack)
        {
            throw new IllegalStateException("Not on back stack");
        }
        op = backstackrecord.mHead;
        i = 0;
        while (op != null) 
        {
            int ai[] = mOps;
            int k = i + 1;
            ai[i] = op.cmd;
            ai = mOps;
            int l = k + 1;
            if (op.fragment != null)
            {
                i = op.fragment.mIndex;
            } else
            {
                i = -1;
            }
            ai[k] = i;
            ai = mOps;
            i = l + 1;
            ai[l] = op.enterAnim;
            ai = mOps;
            k = i + 1;
            ai[i] = op.exitAnim;
            ai = mOps;
            i = k + 1;
            ai[k] = op.popEnterAnim;
            ai = mOps;
            k = i + 1;
            ai[i] = op.popExitAnim;
            if (op.removed != null)
            {
                int i1 = op.removed.size();
                int ai1[] = mOps;
                i = k + 1;
                ai1[k] = i1;
                for (k = 0; k < i1;)
                {
                    mOps[i] = ((Fragment)op.removed.get(k)).mIndex;
                    k++;
                    i++;
                }

            } else
            {
                int ai2[] = mOps;
                i = k + 1;
                ai2[k] = 0;
            }
            op = op.next;
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

    public int describeContents()
    {
        return 0;
    }

    public BackStackRecord instantiate(FragmentManagerImpl fragmentmanagerimpl)
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
                Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(backstackrecord).append(" op #").append(k).append(" base fragment #").append(mOps[j]).toString());
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
                        Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(backstackrecord).append(" set remove fragment #").append(mOps[j]).toString());
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

    public void writeToParcel(Parcel parcel, int i)
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

}
