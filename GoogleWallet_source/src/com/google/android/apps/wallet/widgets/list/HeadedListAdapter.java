// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.SectionIndexer;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            MergedListAdapter, SingleRowAdapter

public class HeadedListAdapter extends MergedListAdapter
{
    public static class Builder
    {

        private View mFooterView;
        private View mHeaderView;
        private ListAdapter mListAdapter;

        public final HeadedListAdapter build()
        {
            Object obj;
            if (mListAdapter != null && (mListAdapter instanceof SectionIndexer))
            {
                obj = new HeadedSectionIndexerListAdapter();
            } else
            {
                obj = new HeadedListAdapter();
            }
            if (mHeaderView != null)
            {
                ((HeadedListAdapter) (obj)).setHeaderView(mHeaderView);
            }
            if (mFooterView != null)
            {
                ((HeadedListAdapter) (obj)).setFooterView(mFooterView);
            }
            if (mListAdapter != null)
            {
                ((HeadedListAdapter) (obj)).setAdapter(mListAdapter);
            }
            return ((HeadedListAdapter) (obj));
        }

        public final Builder withDefaultHeaderView(Activity activity)
        {
            mHeaderView = LayoutInflater.from(activity).inflate(com.google.android.apps.walletnfcrel.R.layout.subheader, null);
            return this;
        }

        public final Builder withHeaderView(View view)
        {
            mHeaderView = view;
            return this;
        }

        public final Builder withListAdapter(ListAdapter listadapter)
        {
            mListAdapter = listadapter;
            return this;
        }

        public Builder()
        {
        }
    }

    final class FixedRowAdapter extends SingleRowAdapter
    {

        private FixedViewVisibility mVisibility;
        final HeadedListAdapter this$0;

        public final boolean isVisible()
        {
            if (getView() != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            static final class _cls1
            {

                static final int $SwitchMap$com$google$android$apps$wallet$widgets$list$HeadedListAdapter$FixedViewVisibility[];

                static 
                {
                    $SwitchMap$com$google$android$apps$wallet$widgets$list$HeadedListAdapter$FixedViewVisibility = new int[FixedViewVisibility.values().length];
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$widgets$list$HeadedListAdapter$FixedViewVisibility[FixedViewVisibility.VISIBLE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$widgets$list$HeadedListAdapter$FixedViewVisibility[FixedViewVisibility.GONE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$widgets$list$HeadedListAdapter$FixedViewVisibility[FixedViewVisibility.VISIBLE_UNLESS_EMPTY.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility[mVisibility.ordinal()])
            {
            default:
                throw new AssertionError("unexpected");

            case 2: // '\002'
                break;

            case 3: // '\003'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                return true;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (mAdapter.isEmpty()) goto _L1; else goto _L4
_L4:
            return true;
        }

        public final void setVisibility(FixedViewVisibility fixedviewvisibility)
        {
            if (mVisibility != fixedviewvisibility)
            {
                mVisibility = fixedviewvisibility;
                notifyDataSetChanged();
            }
        }

        private FixedRowAdapter()
        {
            this$0 = HeadedListAdapter.this;
            super();
            mVisibility = FixedViewVisibility.VISIBLE;
        }

    }

    public static final class FixedViewVisibility extends Enum
    {

        private static final FixedViewVisibility $VALUES[];
        public static final FixedViewVisibility GONE;
        public static final FixedViewVisibility VISIBLE;
        public static final FixedViewVisibility VISIBLE_UNLESS_EMPTY;

        public static FixedViewVisibility valueOf(String s)
        {
            return (FixedViewVisibility)Enum.valueOf(com/google/android/apps/wallet/widgets/list/HeadedListAdapter$FixedViewVisibility, s);
        }

        public static FixedViewVisibility[] values()
        {
            return (FixedViewVisibility[])$VALUES.clone();
        }

        static 
        {
            VISIBLE = new FixedViewVisibility("VISIBLE", 0);
            VISIBLE_UNLESS_EMPTY = new FixedViewVisibility("VISIBLE_UNLESS_EMPTY", 1);
            GONE = new FixedViewVisibility("GONE", 2);
            $VALUES = (new FixedViewVisibility[] {
                VISIBLE, VISIBLE_UNLESS_EMPTY, GONE
            });
        }

        private FixedViewVisibility(String s, int i)
        {
            super(s, i);
        }
    }

    static final class HeadedSectionIndexerListAdapter extends HeadedListAdapter
        implements SectionIndexer
    {

        private SectionIndexer mSectionIndexer;

        public final int getPositionForSection(int i)
        {
            if (i == 0)
            {
                return 0;
            }
            int j;
            if (mHeaderAdapter.isVisible())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            i = mSectionIndexer.getPositionForSection(i);
            if (i >= mAdapter.getCount())
            {
                if (mFooterAdapter.isVisible())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                return mAdapter.getCount() + j + i;
            } else
            {
                return i + j;
            }
        }

        public final int getSectionForPosition(int i)
        {
            int j;
            if (mHeaderAdapter.isVisible())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (i <= j)
            {
                return 0;
            } else
            {
                return mSectionIndexer.getSectionForPosition(i - j);
            }
        }

        public final Object[] getSections()
        {
            return mSectionIndexer.getSections();
        }

        public final void setAdapter(ListAdapter listadapter)
        {
            Preconditions.checkArgument(listadapter instanceof SectionIndexer, "adapter must implement SectionIndexer");
            mSectionIndexer = (SectionIndexer)listadapter;
            setAdapter(listadapter);
        }

        protected HeadedSectionIndexerListAdapter()
        {
        }
    }


    protected ListAdapter mAdapter;
    protected final FixedRowAdapter mFooterAdapter = new FixedRowAdapter(null);
    protected final FixedRowAdapter mHeaderAdapter = new FixedRowAdapter(null);

    protected HeadedListAdapter()
    {
    }

    private void setFooterView(View view, boolean flag)
    {
        mFooterAdapter.setView(view, null, flag);
    }

    private void setHeaderView(View view, boolean flag)
    {
        mHeaderAdapter.setView(view, null, flag);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        mAdapter = listadapter;
        super.setAdapters(new ListAdapter[] {
            mHeaderAdapter, listadapter, mFooterAdapter
        });
    }

    public final transient void setAdapters(ListAdapter alistadapter[])
    {
        throw new AssertionError("Use setAdapter");
    }

    public final void setFooterView(View view)
    {
        setFooterView(view, false);
    }

    public final void setHeaderText(String s)
    {
        mHeaderAdapter.setText(s);
    }

    public final void setHeaderView(View view)
    {
        setHeaderView(view, false);
    }

    public final void setHeaderVisibility(FixedViewVisibility fixedviewvisibility)
    {
        mHeaderAdapter.setVisibility(fixedviewvisibility);
    }
}
