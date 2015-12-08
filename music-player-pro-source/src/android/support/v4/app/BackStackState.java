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
    }

    public BackStackState(FragmentManagerImpl fragmentmanagerimpl, BackStackRecord backstackrecord)
    {
        int i = 0;
        for (fragmentmanagerimpl = backstackrecord.mHead; fragmentmanagerimpl != null;)
        {
            int j = i;
            if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed != null)
            {
                j = i + ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
            }
            fragmentmanagerimpl = ((BackStackRecord.Op) (fragmentmanagerimpl)).next;
            i = j;
        }

        mOps = new int[backstackrecord.mNumOp * 7 + i];
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
            i = k + 1;
            ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).fragment.mIndex;
            ai = mOps;
            k = i + 1;
            ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).enterAnim;
            ai = mOps;
            i = k + 1;
            ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).exitAnim;
            ai = mOps;
            k = i + 1;
            ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popEnterAnim;
            ai = mOps;
            int j1 = k + 1;
            ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popExitAnim;
            if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed != null)
            {
                int i1 = ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
                mOps[j1] = i1;
                int l = 0;
                for (i = j1 + 1; l < i1; i++)
                {
                    mOps[i] = ((Fragment)((BackStackRecord.Op) (fragmentmanagerimpl)).removed.get(l)).mIndex;
                    l++;
                }

            } else
            {
                int ai1[] = mOps;
                i = j1 + 1;
                ai1[j1] = 0;
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
    }

    public int describeContents()
    {
        return 0;
    }

    public BackStackRecord instantiate(FragmentManagerImpl fragmentmanagerimpl)
    {
        BackStackRecord backstackrecord = new BackStackRecord(fragmentmanagerimpl);
        for (int i = 0; i < mOps.length;)
        {
            BackStackRecord.Op op = new BackStackRecord.Op();
            int ai[] = mOps;
            int j = i + 1;
            op.cmd = ai[i];
            if (FragmentManagerImpl.DEBUG)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("BSE ").append(backstackrecord).append(" set base fragment #").append(mOps[j]).toString());
            }
            ArrayList arraylist = fragmentmanagerimpl.mActive;
            int ai1[] = mOps;
            i = j + 1;
            op.fragment = (Fragment)arraylist.get(ai1[j]);
            arraylist = mOps;
            j = i + 1;
            op.enterAnim = arraylist[i];
            arraylist = mOps;
            i = j + 1;
            op.exitAnim = arraylist[j];
            arraylist = mOps;
            j = i + 1;
            op.popEnterAnim = arraylist[i];
            arraylist = mOps;
            int k = j + 1;
            op.popExitAnim = arraylist[j];
            arraylist = mOps;
            i = k + 1;
            int i1 = arraylist[k];
            j = i;
            if (i1 > 0)
            {
                op.removed = new ArrayList(i1);
                int l = 0;
                do
                {
                    j = i;
                    if (l >= i1)
                    {
                        break;
                    }
                    if (FragmentManagerImpl.DEBUG)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("BSE ").append(backstackrecord).append(" set remove fragment #").append(mOps[i]).toString());
                    }
                    Fragment fragment = (Fragment)fragmentmanagerimpl.mActive.get(mOps[i]);
                    op.removed.add(fragment);
                    l++;
                    i++;
                } while (true);
            }
            i = j;
            backstackrecord.addOp(op);
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
    }

}
