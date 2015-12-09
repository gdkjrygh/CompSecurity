// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragment;
import java.util.ArrayList;

public final class ChipsGridAdapter extends BaseAdapter
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{
    private static final class ChipModel
    {

        int chipType;
        String displayName;
        int iconImageResId;
        Uri iconImageUri;
        String playerId;
        boolean selected;

        public final boolean equals(Object obj)
        {
            if (obj instanceof ChipModel) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            obj = (ChipModel)obj;
            if (chipType != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (((ChipModel) (obj)).chipType == 0)
            {
                return true;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (chipType != 1)
            {
                break; /* Loop/switch isn't completed */
            }
            if (((ChipModel) (obj)).chipType == 1)
            {
                return true;
            }
            if (true) goto _L1; else goto _L4
_L4:
            if (chipType == 3)
            {
                if (((ChipModel) (obj)).chipType == 3)
                {
                    return true;
                }
            } else
            {
                return playerId.equals(((ChipModel) (obj)).playerId);
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        public final String toString()
        {
            return Objects.toStringHelper(this).add("type", Integer.valueOf(chipType)).add("playerId", playerId).add("displayName", displayName).add("iconImageUri", iconImageUri).add("iconImageResId", Integer.valueOf(iconImageResId)).add("selected", Boolean.valueOf(selected)).toString();
        }

        ChipModel(int i)
        {
            chipType = i;
            selected = false;
        }

        ChipModel(String s, String s1, Uri uri)
        {
            this(2);
            playerId = s;
            displayName = s1;
            iconImageUri = uri;
        }
    }

    private static final class ChipViewHolder
    {

        View container;
        View containerNormalLayer;
        View containerSelectedLayer;
        LoadingImageView image;
        TextView nameNormal;
        TextView nameSelected;
        FrameLayout searchLayer;
        View xButton;

        private ChipViewHolder()
        {
        }

        ChipViewHolder(byte byte0)
        {
            this();
        }
    }

    static interface OnChipsGridChangedListener
    {

        public abstract void onChipAdded();

        public abstract void onChipRemoved();
    }

    public static interface OnRemovePlayerListener
    {

        public abstract void onRemoveAutoMatchPlayer();

        public abstract void onRemovePlayer(String s);
    }

    private static final class ViewHolder
    {

        static final int containerIds[] = {
            0x7f0d012d, 0x7f0d012e, 0x7f0d012f, 0x7f0d0130
        };
        ChipViewHolder chip[];
        FrameLayout spanningSearchLayer;


        private ViewHolder()
        {
            chip = new ChipViewHolder[4];
        }

        ViewHolder(byte byte0)
        {
            this();
        }
    }


    ArrayList mChips;
    ChipModel mFilterChip;
    TextView mFilterTextView;
    View mFilterView;
    String mFilterViewHint;
    final GamesFragment mFragment;
    private final LayoutInflater mInflater;
    int mMaxParticipants;
    int mNumColumns;
    OnChipsGridChangedListener mOnChipsGridChangedListener;
    private boolean mShowMeChip;

    public ChipsGridAdapter(GamesFragment gamesfragment)
    {
        mShowMeChip = false;
        mFilterChip = new ChipModel(3);
        mFragment = gamesfragment;
        mInflater = (LayoutInflater)((Fragment) (mFragment)).mActivity.getSystemService("layout_inflater");
        mNumColumns = 2;
        try
        {
            mNumColumns = mFragment.getResources().getInteger(0x7f0e0048);
        }
        // Misplaced declaration of an exception variable
        catch (GamesFragment gamesfragment)
        {
            GamesLog.e("ChipsGridAdapter", (new StringBuilder("Unable to find numColumns resource: 2131624008")).toString(), gamesfragment);
            Asserts.fail((new StringBuilder("Unable to find numColumns resource: 2131624008")).toString());
        }
        mChips = new ArrayList();
    }

    private void removeChipInternal(ChipModel chipmodel)
    {
        if (!mChips.remove(chipmodel))
        {
            GamesLog.w("ChipsGridAdapter", (new StringBuilder("removeChipInternal: chip ")).append(chipmodel).append(" not found").toString());
        }
        if (mFilterView != null)
        {
            mChips.remove(mFilterChip);
            if (mChips.size() % mNumColumns != 0)
            {
                mChips.add(mFilterChip);
            }
        }
        notifyDataSetChanged();
        if (mOnChipsGridChangedListener != null)
        {
            mOnChipsGridChangedListener.onChipRemoved();
        }
    }

    final void addChipInternal(ChipModel chipmodel)
    {
        int i = mMaxParticipants;
        if (mFilterChip != null)
        {
            mChips.remove(mFilterChip);
        }
        mChips.add(chipmodel);
        if (mFilterChip != null && mChips.size() <= i - 1 && mChips.size() % mNumColumns != 0)
        {
            mChips.add(mFilterChip);
        }
        if (mFilterTextView != null)
        {
            mFilterTextView.setText("");
        }
        notifyDataSetChanged();
        if (mOnChipsGridChangedListener != null)
        {
            mOnChipsGridChangedListener.onChipAdded();
        }
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getCount()
    {
        int j = mChips.size();
        int i = j;
        if (j > 0)
        {
            i = j;
            if (((ChipModel)mChips.get(j - 1)).chipType == 3)
            {
                i = j - 1;
            }
        }
        i = (mNumColumns + i) / mNumColumns;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return i;
    }

    public final Object getItem(int i)
    {
        return null;
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        final ViewHolder vh;
        boolean flag;
        if (view == null)
        {
            Asserts.checkNotNull(viewgroup);
            view = mInflater.inflate(0x7f040050, viewgroup, false);
            viewgroup = new ViewHolder((byte)0);
            viewgroup.spanningSearchLayer = (FrameLayout)view.findViewById(0x7f0d0131);
            int j = 0;
            while (j < 4) 
            {
                ChipViewHolder chipviewholder = new ChipViewHolder((byte)0);
                View view1 = view.findViewById(ViewHolder.containerIds[j]);
                if (mNumColumns > j)
                {
                    chipviewholder.container = view1;
                    chipviewholder.searchLayer = (FrameLayout)view1.findViewById(0x7f0d0129);
                    chipviewholder.containerNormalLayer = view1.findViewById(0x7f0d0124);
                    chipviewholder.containerSelectedLayer = view1.findViewById(0x7f0d0126);
                    chipviewholder.nameNormal = (TextView)view1.findViewById(0x7f0d0125);
                    chipviewholder.nameSelected = (TextView)view1.findViewById(0x7f0d0127);
                    chipviewholder.image = (LoadingImageView)view1.findViewById(0x7f0d006f);
                    chipviewholder.image.mCrossFade = false;
                    chipviewholder.xButton = view1.findViewById(0x7f0d0128);
                    chipviewholder.container.setOnClickListener(this);
                    chipviewholder.container.setOnTouchListener(this);
                    chipviewholder.xButton.setOnClickListener(this);
                    view1.setVisibility(0);
                    ((ViewHolder) (viewgroup)).chip[j] = chipviewholder;
                } else
                {
                    view1.setVisibility(8);
                    ((ViewHolder) (viewgroup)).chip[j] = null;
                }
                j++;
            }
            View view2;
            int k;
            boolean flag1;
            if (mNumColumns <= 4)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            view.setTag(viewgroup);
        }
        vh = (ViewHolder)view.getTag();
        Asserts.checkNotNull(vh);
        vh.spanningSearchLayer.setVisibility(4);
        flag = false;
        j = 0;
        while (j < 4 && j < mNumColumns) 
        {
            k = mNumColumns * i + j;
            final ChipViewHolder cvh;
            if (k < mChips.size())
            {
                flag = true;
                viewgroup = (ChipModel)mChips.get(k);
            } else
            {
                viewgroup = null;
            }
            cvh = vh.chip[j];
            Asserts.checkNotNull(cvh);
            if (viewgroup != null)
            {
                cvh.nameNormal.setText(((ChipModel) (viewgroup)).displayName);
                cvh.nameSelected.setText(((ChipModel) (viewgroup)).displayName);
                int l;
                if (((ChipModel) (viewgroup)).iconImageResId != 0)
                {
                    cvh.image.loadUri$3329f911(null, ((ChipModel) (viewgroup)).iconImageResId, true);
                } else
                {
                    cvh.image.loadUri$3329f911(((ChipModel) (viewgroup)).iconImageUri, 0x7f0200db, true);
                }
                cvh.container.setVisibility(0);
                view2 = cvh.containerNormalLayer;
                if (((ChipModel) (viewgroup)).selected)
                {
                    l = 4;
                } else
                {
                    l = 0;
                }
                view2.setVisibility(l);
                view2 = cvh.containerSelectedLayer;
                if (((ChipModel) (viewgroup)).selected)
                {
                    l = 0;
                } else
                {
                    l = 4;
                }
                view2.setVisibility(l);
                cvh.searchLayer.setVisibility(4);
                cvh.container.setTag(viewgroup);
                if (((ChipModel) (viewgroup)).chipType == 2)
                {
                    cvh.xButton.setTag(((ChipModel) (viewgroup)).playerId);
                    cvh.container.setTag(viewgroup);
                } else
                if (((ChipModel) (viewgroup)).chipType == 0)
                {
                    cvh.container.setTag("current_player_chip");
                    cvh.xButton.setTag(null);
                } else
                if (((ChipModel) (viewgroup)).chipType == 3)
                {
                    cvh.containerNormalLayer.setVisibility(4);
                    cvh.containerSelectedLayer.setVisibility(4);
                    cvh.searchLayer.setVisibility(0);
                    cvh.container.setTag(null);
                    cvh.xButton.setTag(null);
                    cvh.searchLayer.post(new Runnable() {

                        final ChipsGridAdapter this$0;
                        final ChipViewHolder val$cvh;

                        public final void run()
                        {
                            FrameLayout framelayout = (FrameLayout)mFilterView.getParent();
                            if (framelayout != cvh.searchLayer)
                            {
                                if (framelayout != null)
                                {
                                    framelayout.removeView(mFilterView);
                                }
                                cvh.searchLayer.addView(mFilterView);
                                mFilterTextView.setHint("");
                                if (android.os.Build.VERSION.SDK_INT != 16 && android.os.Build.VERSION.SDK_INT != 17)
                                {
                                    mFilterTextView.requestFocus();
                                    return;
                                }
                            }
                        }

            
            {
                this$0 = ChipsGridAdapter.this;
                cvh = chipviewholder;
                super();
            }
                    });
                } else
                {
                    boolean flag2;
                    if (((ChipModel) (viewgroup)).chipType == 1)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    Asserts.checkState(flag2);
                    cvh.container.setTag(viewgroup);
                    cvh.xButton.setTag("auto_match_chip_x");
                }
            } else
            {
                cvh.container.setVisibility(4);
                cvh.container.setTag(null);
                cvh.xButton.setTag(null);
            }
            j++;
        }
        if (mFilterView != null && !flag)
        {
            vh.spanningSearchLayer.setVisibility(0);
            vh.spanningSearchLayer.post(new Runnable() {

                final ChipsGridAdapter this$0;
                final ViewHolder val$vh;

                public final void run()
                {
                    FrameLayout framelayout = (FrameLayout)mFilterView.getParent();
                    if (framelayout != vh.spanningSearchLayer)
                    {
                        if (framelayout != null)
                        {
                            framelayout.removeView(mFilterView);
                        }
                        vh.spanningSearchLayer.addView(mFilterView);
                        if (mChips.size() == 0)
                        {
                            mFilterTextView.setHint(mFilterViewHint);
                        }
                        if (android.os.Build.VERSION.SDK_INT != 16 && android.os.Build.VERSION.SDK_INT != 17)
                        {
                            mFilterTextView.requestFocus();
                            return;
                        }
                    }
                }

            
            {
                this$0 = ChipsGridAdapter.this;
                vh = viewholder;
                super();
            }
            });
        }
        return view;
    }

    public final int getViewTypeCount()
    {
        return 1;
    }

    public final boolean hasStableIds()
    {
        return false;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }

    public final void onClick(View view)
    {
        Object obj = view.getTag();
        if (obj == null)
        {
            GamesLog.w("ChipsGridAdapter", (new StringBuilder("onClick(): null tag for view ")).append(view).toString());
            return;
        }
        if (obj == "current_player_chip")
        {
            GamesLog.w("ChipsGridAdapter", (new StringBuilder("onClick(): unexpected click on current player chip: ")).append(view).toString());
            return;
        }
        if (obj == "auto_match_chip_x")
        {
            if (mFragment instanceof OnRemovePlayerListener)
            {
                ((OnRemovePlayerListener)mFragment).onRemoveAutoMatchPlayer();
            } else
            {
                Asserts.fail((new StringBuilder("Parent ")).append(mFragment).append(" isn't an OnRemovePlayerListener").toString());
            }
            unselectAllChips();
        } else
        if (obj instanceof String)
        {
            view = (String)obj;
            if (mFragment instanceof OnRemovePlayerListener)
            {
                ((OnRemovePlayerListener)mFragment).onRemovePlayer(view);
            } else
            {
                Asserts.fail((new StringBuilder("Parent ")).append(mFragment).append(" isn't an OnRemovePlayerListener").toString());
            }
        } else
        if (obj instanceof ChipModel)
        {
            view = (ChipModel)obj;
            if (((ChipModel) (view)).selected)
            {
                view.selected = false;
            } else
            {
                unselectAllChips();
                view.selected = true;
            }
        } else
        {
            GamesLog.w("ChipsGridAdapter", (new StringBuilder("onClick(): unexpected tag: view ")).append(view).append(", tag ").append(obj).toString());
            return;
        }
        notifyDataSetChanged();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view = ((View) (view.getTag()));
        if (motionevent.getAction() == 0 && view == "current_player_chip")
        {
            unselectAllChips();
            notifyDataSetChanged();
            return true;
        } else
        {
            return false;
        }
    }

    public final void removeAutoMatchPlayer()
    {
        removeChipInternal(new ChipModel(1));
    }

    public final void removePlayer(String s)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        removeChipInternal(new ChipModel(s, null, null));
    }

    public final void unselectAllChips()
    {
        for (int i = 0; i < mChips.size(); i++)
        {
            ((ChipModel)mChips.get(i)).selected = false;
        }

    }




}
