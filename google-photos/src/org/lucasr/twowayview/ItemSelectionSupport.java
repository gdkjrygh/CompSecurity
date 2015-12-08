// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import aen;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.Checkable;

public class ItemSelectionSupport
{

    private static final int CHECK_POSITION_SEARCH_DISTANCE = 20;
    public static final int INVALID_POSITION = -1;
    private static final String STATE_KEY_CHECKED_COUNT = "checkedCount";
    private static final String STATE_KEY_CHECKED_ID_STATES = "checkedIdStates";
    private static final String STATE_KEY_CHECKED_STATES = "checkedStates";
    private static final String STATE_KEY_CHOICE_MODE = "choiceMode";
    private int mCheckedCount;
    private CheckedIdStates mCheckedIdStates;
    private CheckedStates mCheckedStates;
    private ChoiceMode mChoiceMode;
    private final RecyclerView mRecyclerView;
    private final TouchListener mTouchListener;

    private ItemSelectionSupport(RecyclerView recyclerview)
    {
        mChoiceMode = ChoiceMode.NONE;
        mRecyclerView = recyclerview;
        mTouchListener = new TouchListener(recyclerview);
        recyclerview.a(mTouchListener);
    }

    public static ItemSelectionSupport addTo(RecyclerView recyclerview)
    {
        ItemSelectionSupport itemselectionsupport1 = from(recyclerview);
        ItemSelectionSupport itemselectionsupport = itemselectionsupport1;
        if (itemselectionsupport1 == null)
        {
            itemselectionsupport = new ItemSelectionSupport(recyclerview);
            recyclerview.setTag(R.id.twowayview_item_selection_support, itemselectionsupport);
        }
        return itemselectionsupport;
    }

    public static ItemSelectionSupport from(RecyclerView recyclerview)
    {
        if (recyclerview == null)
        {
            return null;
        } else
        {
            return (ItemSelectionSupport)recyclerview.getTag(R.id.twowayview_item_selection_support);
        }
    }

    public static void removeFrom(RecyclerView recyclerview)
    {
        ItemSelectionSupport itemselectionsupport = from(recyclerview);
        if (itemselectionsupport == null)
        {
            return;
        } else
        {
            itemselectionsupport.clearChoices();
            recyclerview.b(itemselectionsupport.mTouchListener);
            recyclerview.setTag(R.id.twowayview_item_selection_support, null);
            return;
        }
    }

    private void updateOnScreenCheckedViews()
    {
        int j = mRecyclerView.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = mRecyclerView.getChildAt(i);
            int k = mRecyclerView.c(view);
            setViewChecked(view, mCheckedStates.get(k));
        }

    }

    public void clearChoices()
    {
        if (mCheckedStates != null)
        {
            mCheckedStates.clear();
        }
        if (mCheckedIdStates != null)
        {
            mCheckedIdStates.clear();
        }
        mCheckedCount = 0;
        updateOnScreenCheckedViews();
    }

    public int getCheckedItemCount()
    {
        return mCheckedCount;
    }

    public long[] getCheckedItemIds()
    {
        int i = 0;
        if (mChoiceMode != ChoiceMode.NONE && mCheckedIdStates != null && mRecyclerView.d != null) goto _L2; else goto _L1
_L1:
        long al[] = new long[0];
_L4:
        return al;
_L2:
        int j = mCheckedIdStates.size();
        long al1[] = new long[j];
        do
        {
            al = al1;
            if (i >= j)
            {
                continue;
            }
            al1[i] = mCheckedIdStates.keyAt(i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getCheckedItemPosition()
    {
        if (mChoiceMode == ChoiceMode.SINGLE && mCheckedStates != null && mCheckedStates.size() == 1)
        {
            return mCheckedStates.keyAt(0);
        } else
        {
            return -1;
        }
    }

    public SparseBooleanArray getCheckedItemPositions()
    {
        if (mChoiceMode != ChoiceMode.NONE)
        {
            return mCheckedStates;
        } else
        {
            return null;
        }
    }

    public ChoiceMode getChoiceMode()
    {
        return mChoiceMode;
    }

    public boolean isItemChecked(int i)
    {
        if (mChoiceMode != ChoiceMode.NONE && mCheckedStates != null)
        {
            return mCheckedStates.get(i);
        } else
        {
            return false;
        }
    }

    public void onAdapterDataChanged()
    {
        aen aen1 = mRecyclerView.d;
        if (mChoiceMode != ChoiceMode.NONE && aen1 != null && aen1.b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int l;
        l = aen1.a();
        mCheckedStates.clear();
        i = 0;
_L8:
        if (i >= mCheckedIdStates.size()) goto _L1; else goto _L3
_L3:
        int k;
        long l1;
        l1 = mCheckedIdStates.keyAt(i);
        k = ((Integer)mCheckedIdStates.valueAt(i)).intValue();
        if (l1 == aen1.b(k)) goto _L5; else goto _L4
_L4:
        int j;
        j = Math.max(0, k - 20);
        k = Math.min(k + 20, l);
_L9:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        if (l1 != aen1.b(j)) goto _L7; else goto _L6
_L6:
        mCheckedStates.put(j, true);
        mCheckedIdStates.setValueAt(i, Integer.valueOf(j));
        j = 1;
_L11:
        k = i;
        if (j == 0)
        {
            mCheckedIdStates.delete(l1);
            mCheckedCount = mCheckedCount - 1;
            k = i - 1;
        }
_L10:
        i = k + 1;
          goto _L8
_L7:
        j++;
          goto _L9
_L5:
        mCheckedStates.put(k, true);
        k = i;
          goto _L10
        j = 0;
          goto _L11
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        mChoiceMode = ChoiceMode.values()[bundle.getInt("choiceMode")];
        mCheckedStates = (CheckedStates)bundle.getParcelable("checkedStates");
        mCheckedIdStates = (CheckedIdStates)bundle.getParcelable("checkedIdStates");
        mCheckedCount = bundle.getInt("checkedCount");
    }

    public Bundle onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("choiceMode", mChoiceMode.ordinal());
        bundle.putParcelable("checkedStates", mCheckedStates);
        bundle.putParcelable("checkedIdStates", mCheckedIdStates);
        bundle.putInt("checkedCount", mCheckedCount);
        return bundle;
    }

    public void setChoiceMode(ChoiceMode choicemode)
    {
        if (mChoiceMode != choicemode)
        {
            mChoiceMode = choicemode;
            if (mChoiceMode != ChoiceMode.NONE)
            {
                if (mCheckedStates == null)
                {
                    mCheckedStates = new CheckedStates();
                }
                choicemode = mRecyclerView.d;
                if (mCheckedIdStates == null && choicemode != null && ((aen) (choicemode)).b)
                {
                    mCheckedIdStates = new CheckedIdStates();
                    return;
                }
            }
        }
    }

    public void setItemChecked(int i, boolean flag)
    {
        aen aen1;
        if (mChoiceMode == ChoiceMode.NONE)
        {
            return;
        }
        aen1 = mRecyclerView.d;
        if (mChoiceMode != ChoiceMode.MULTIPLE) goto _L2; else goto _L1
_L1:
        boolean flag2 = mCheckedStates.get(i);
        mCheckedStates.put(i, flag);
        if (mCheckedIdStates != null && aen1.b)
        {
            if (flag)
            {
                mCheckedIdStates.put(aen1.b(i), Integer.valueOf(i));
            } else
            {
                mCheckedIdStates.delete(aen1.b(i));
            }
        }
        if (flag2 != flag)
        {
            if (flag)
            {
                mCheckedCount = mCheckedCount + 1;
            } else
            {
                mCheckedCount = mCheckedCount - 1;
            }
        }
_L4:
        updateOnScreenCheckedViews();
        return;
_L2:
        boolean flag1;
        if (mCheckedIdStates != null && aen1.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || isItemChecked(i))
        {
            mCheckedStates.clear();
            if (flag1)
            {
                mCheckedIdStates.clear();
            }
        }
        if (flag)
        {
            mCheckedStates.put(i, true);
            if (flag1)
            {
                mCheckedIdStates.put(aen1.b(i), Integer.valueOf(i));
            }
            mCheckedCount = 1;
        } else
        if (mCheckedStates.size() == 0 || !mCheckedStates.valueAt(0))
        {
            mCheckedCount = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setViewChecked(View view, boolean flag)
    {
        if (view instanceof Checkable)
        {
            ((Checkable)view).setChecked(flag);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            view.setActivated(flag);
            return;
        }
    }






/*
    static int access$602(ItemSelectionSupport itemselectionsupport, int i)
    {
        itemselectionsupport.mCheckedCount = i;
        return i;
    }

*/


/*
    static int access$608(ItemSelectionSupport itemselectionsupport)
    {
        int i = itemselectionsupport.mCheckedCount;
        itemselectionsupport.mCheckedCount = i + 1;
        return i;
    }

*/


/*
    static int access$610(ItemSelectionSupport itemselectionsupport)
    {
        int i = itemselectionsupport.mCheckedCount;
        itemselectionsupport.mCheckedCount = i - 1;
        return i;
    }

*/


    private class ChoiceMode extends Enum
    {

        private static final ChoiceMode $VALUES[];
        public static final ChoiceMode MULTIPLE;
        public static final ChoiceMode NONE;
        public static final ChoiceMode SINGLE;

        public static ChoiceMode valueOf(String s)
        {
            return (ChoiceMode)Enum.valueOf(org/lucasr/twowayview/ItemSelectionSupport$ChoiceMode, s);
        }

        public static ChoiceMode[] values()
        {
            return (ChoiceMode[])$VALUES.clone();
        }

        static 
        {
            NONE = new ChoiceMode("NONE", 0);
            SINGLE = new ChoiceMode("SINGLE", 1);
            MULTIPLE = new ChoiceMode("MULTIPLE", 2);
            $VALUES = (new ChoiceMode[] {
                NONE, SINGLE, MULTIPLE
            });
        }

        private ChoiceMode(String s, int i)
        {
            super(s, i);
        }
    }


    private class TouchListener extends ClickItemTouchListener
    {

        final ItemSelectionSupport this$0;

        boolean performItemClick(RecyclerView recyclerview, View view, int i, long l)
        {
            boolean flag1;
            flag1 = true;
            recyclerview = mRecyclerView.d;
            if (mChoiceMode != ChoiceMode.MULTIPLE) goto _L2; else goto _L1
_L1:
            boolean flag2;
            if (!mCheckedStates.get(i, false))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            mCheckedStates.put(i, flag2);
            if (mCheckedIdStates != null && ((aen) (recyclerview)).b)
            {
                if (flag2)
                {
                    mCheckedIdStates.put(recyclerview.b(i), Integer.valueOf(i));
                } else
                {
                    mCheckedIdStates.delete(recyclerview.b(i));
                }
            }
            if (flag2)
            {
                int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        boolean performItemLongClick(RecyclerView recyclerview, View view, int i, long l)
        {
            return true;
        }

        TouchListener(RecyclerView recyclerview)
        {
            this$0 = ItemSelectionSupport.this;
            super(recyclerview);
        }
    }


    private class CheckedStates extends SparseBooleanArray
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private static final int FALSE = 0;
        private static final int TRUE = 1;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            int k = size();
            parcel.writeInt(k);
            i = 0;
            while (i < k) 
            {
                parcel.writeInt(keyAt(i));
                int j;
                if (valueAt(i))
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                parcel.writeInt(j);
                i++;
            }
        }


        public CheckedStates()
        {
        }

        private CheckedStates(Parcel parcel)
        {
            int j = parcel.readInt();
            if (j > 0)
            {
                int i = 0;
                while (i < j) 
                {
                    int k = parcel.readInt();
                    boolean flag;
                    if (parcel.readInt() == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    put(k, flag);
                    i++;
                }
            }
        }

        CheckedStates(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final CheckedStates createFromParcel(Parcel parcel)
            {
                return new CheckedStates(parcel, null);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public final CheckedStates[] newArray(int i)
            {
                return new CheckedStates[i];
            }

                _cls1()
                {
                }
        }

    }


    private class CheckedIdStates extends jo
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            int j = size();
            parcel.writeInt(j);
            for (i = 0; i < j; i++)
            {
                parcel.writeLong(keyAt(i));
                parcel.writeInt(((Integer)valueAt(i)).intValue());
            }

        }


        public CheckedIdStates()
        {
        }

        private CheckedIdStates(Parcel parcel)
        {
            int j = parcel.readInt();
            if (j > 0)
            {
                for (int i = 0; i < j; i++)
                {
                    put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
                }

            }
        }

        CheckedIdStates(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final CheckedIdStates createFromParcel(Parcel parcel)
            {
                return new CheckedIdStates(parcel, null);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public final CheckedIdStates[] newArray(int i)
            {
                return new CheckedIdStates[i];
            }

                _cls1()
                {
                }
        }

    }

}
