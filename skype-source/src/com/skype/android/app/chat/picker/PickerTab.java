// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.PackInfo;
import com.skype.android.mediacontent.PackInfoUtils;
import com.skype.android.util.ViewUtil;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat.picker:
//            AbstractPickerTab, PickerItemViewBuilder, PickerItemInteractionManager, PickerMediaViewHolder

public class PickerTab extends AbstractPickerTab
{
    private final class a extends android.support.v7.widget.RecyclerView.a
    {

        final PickerTab this$0;

        public final MediaContent getItem(int i)
        {
            return ((com.skype.android.mediacontent.PackInfo.ItemInfo)packInfo.d.get(i)).c();
        }

        public final int getItemCount()
        {
            return packInfo.d.size();
        }

        public final int getItemViewType(int i)
        {
            return pickerItemViewBuilder.getItemViewType(getItem(i));
        }

        public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
        {
            onBindViewHolder((PickerMediaViewHolder)v, i);
        }

        public final void onBindViewHolder(PickerMediaViewHolder pickermediaviewholder, int i)
        {
            PickerItemViewBuilder pickeritemviewbuilder = pickerItemViewBuilder;
            MediaContent mediacontent = getItem(i);
            PickerItemInteractionManager pickeriteminteractionmanager = pickeritemClickHandler;
            boolean flag;
            if (i == pickeritemClickHandler.getCurrentMojiSelectedPosition())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            pickeritemviewbuilder.bindViewHolder(pickermediaviewholder, mediacontent, i, pickeriteminteractionmanager, flag);
        }

        public final volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public final PickerMediaViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return pickerItemViewBuilder.createViewHolder(viewgroup, i);
        }

        private a()
        {
            this$0 = PickerTab.this;
            super();
        }

    }

    private static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b NONE;
        public static final b SECTION_FIRST_ITEM;
        public static final b SECTION_FIRST_ROW_ITEM;
        public static final b SPONSORED_FIRST_ITEM;
        public static final b SPONSORED_FIRST_ROW_ITEM;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/chat/picker/PickerTab$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            SPONSORED_FIRST_ITEM = new b("SPONSORED_FIRST_ITEM", 0);
            SPONSORED_FIRST_ROW_ITEM = new b("SPONSORED_FIRST_ROW_ITEM", 1);
            SECTION_FIRST_ITEM = new b("SECTION_FIRST_ITEM", 2);
            SECTION_FIRST_ROW_ITEM = new b("SECTION_FIRST_ROW_ITEM", 3);
            NONE = new b("NONE", 4);
            $VALUES = (new b[] {
                SPONSORED_FIRST_ITEM, SPONSORED_FIRST_ROW_ITEM, SECTION_FIRST_ITEM, SECTION_FIRST_ROW_ITEM, NONE
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    private final class c extends android.support.v7.widget.RecyclerView.g
    {

        private final View dividerView;
        private final int dividerViewHeight;
        private final TextView dividerViewText;
        final PickerTab this$0;

        private void bindDivider(String s)
        {
            dividerViewText.setText(s);
            dividerView.measure(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(dividerViewHeight, 0x40000000));
            dividerView.layout(0, 0, dividerView.getMeasuredWidth(), dividerView.getMeasuredHeight());
        }

        private int getDecoratedTop(int i)
        {
            View view = layoutManager.findViewByPosition(i);
            if (view == null)
            {
                return 0;
            } else
            {
                return layoutManager.getDecoratedTop(view);
            }
        }

        private b getItemPositionTypeInTab(int i)
        {
            int j = packInfo.b.size();
            if (i == 0 && j != 0)
            {
                return b.SPONSORED_FIRST_ITEM;
            }
            if (i < Math.min(j, gridColumnsCount) && j != 0)
            {
                return b.SPONSORED_FIRST_ROW_ITEM;
            }
            boolean flag;
            if (((com.skype.android.mediacontent.PackInfo.ItemInfo)packInfo.d.get(i)).c == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return b.SECTION_FIRST_ITEM;
            }
            com.skype.android.mediacontent.PackInfo.ItemInfo iteminfo = (com.skype.android.mediacontent.PackInfo.ItemInfo)packInfo.d.get(i);
            flag = gridColumnsCount;
            if (i - iteminfo.c < flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                return b.SECTION_FIRST_ROW_ITEM;
            } else
            {
                return b.NONE;
            }
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
        {
            super.getItemOffsets(rect, view, recyclerview, s);
            int i = recyclerview.getChildAdapterPosition(view);
            static final class _cls2
            {

                static final int $SwitchMap$com$skype$android$app$chat$picker$PickerTab$ItemPosition[];

                static 
                {
                    $SwitchMap$com$skype$android$app$chat$picker$PickerTab$ItemPosition = new int[b.values().length];
                    try
                    {
                        $SwitchMap$com$skype$android$app$chat$picker$PickerTab$ItemPosition[b.SPONSORED_FIRST_ITEM.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$chat$picker$PickerTab$ItemPosition[b.SPONSORED_FIRST_ROW_ITEM.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$chat$picker$PickerTab$ItemPosition[b.SECTION_FIRST_ITEM.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$chat$picker$PickerTab$ItemPosition[b.SECTION_FIRST_ROW_ITEM.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$chat$picker$PickerTab$ItemPosition[b.NONE.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls2..SwitchMap.com.skype.android.app.chat.picker.PickerTab.ItemPosition[getItemPositionTypeInTab(i).ordinal()])
            {
            default:
                rect.top = 0;
                return;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                rect.top = dividerViewHeight;
                break;
            }
        }

        public final void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
        {
            super.onDraw(canvas, recyclerview, s);
            if (recyclerview.getChildCount() <= 0) goto _L2; else goto _L1
_L1:
            int i = 0;
_L6:
            int j;
            if (i >= recyclerview.getChildCount())
            {
                break; /* Loop/switch isn't completed */
            }
            j = recyclerview.getChildAdapterPosition(recyclerview.getChildAt(i));
            s = getItemPositionTypeInTab(j);
            _cls2..SwitchMap.com.skype.android.app.chat.picker.PickerTab.ItemPosition[s.ordinal()];
            JVM INSTR tableswitch 1 3: default 80
        //                       1 89
        //                       2 80
        //                       3 89;
               goto _L3 _L4 _L3 _L4
_L3:
            i++;
            break; /* Loop/switch isn't completed */
_L4:
            int k = getDecoratedTop(j);
            s = (com.skype.android.mediacontent.PackInfo.ItemInfo)packInfo.d.get(j);
            if (packInfo.a(j))
            {
                s = featuredDescription;
            } else
            {
                s = s.b();
            }
            bindDivider(s);
            canvas.save();
            canvas.translate(0.0F, k);
            dividerView.draw(canvas);
            canvas.restore();
            if (true) goto _L3; else goto _L5
_L5:
            if (true) goto _L6; else goto _L2
_L2:
        }

        public c()
        {
            this$0 = PickerTab.this;
            super();
            dividerView = LayoutInflater.from(getContext()).inflate(0x7f0300d8, recyclerView, false);
            dividerView.setLayoutParams(new android.support.v7.widget.RecyclerView.j(-1));
            dividerViewText = (TextView)dividerView.findViewById(0x7f1004b1);
            dividerViewHeight = getContext().getResources().getDimensionPixelSize(0x7f0c00d1);
        }
    }


    private a adapter;
    String featuredDescription;
    private int gridColumnsCount;
    private g layoutManager;
    private PackInfo packInfo;
    private final PickerItemViewBuilder pickerItemViewBuilder;
    private final PickerItemInteractionManager pickeritemClickHandler;
    private RecyclerView recyclerView;

    public PickerTab(Context context, ExtensiblePickerDialogFragment.Callback callback, PickerItemInteractionManager.MediaSendCallback mediasendcallback, PickerItemInteractionManager.MediaPreviewCallback mediapreviewcallback, AbstractPickerTab.TabCallback tabcallback, PackInfo packinfo)
    {
        super(context, callback, tabcallback);
        featuredDescription = getContext().getString(0x7f080302);
        packInfo = packinfo;
        gridColumnsCount = getColumnCountForContentType(packinfo.e());
        pickerItemViewBuilder = new PickerItemViewBuilder(context, mediapreviewcallback, this);
        pickeritemClickHandler = new PickerItemInteractionManager(mediasendcallback, mediapreviewcallback, this);
        init();
    }

    public void consume()
    {
        if (!isConsumed())
        {
            packInfo.i();
            setBadgeVisibile(false);
        }
    }

    public int getId()
    {
        return packInfo.c();
    }

    public MediaContent getItem(int i)
    {
        return adapter.getItem(i);
    }

    public int getSortingOrder()
    {
        return packInfo.d() + getTabCallback().getDefaultTabsCount();
    }

    protected String getTelemetryPackName()
    {
        return packInfo.h();
    }

    protected com.skype.android.mediacontent.MediaContent.Source getTelemetrySource()
    {
        return com.skype.android.mediacontent.MediaContent.Source.b;
    }

    protected View initContentView()
    {
        View view = LayoutInflater.from(getContext()).inflate(0x7f0300d9, null);
        recyclerView = (RecyclerView)ViewUtil.a(view, 0x7f1004b2);
        layoutManager = new g(getContext(), gridColumnsCount, 1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new a();
        recyclerView.setClipToPadding(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.getItemAnimator().a(getContext().getResources().getInteger(0x7f0e0034));
        view.setOnClickListener(pickeritemClickHandler);
        return view;
    }

    public boolean isConsumed()
    {
        return packInfo.g();
    }

    protected boolean isItemFeatured(MediaContent mediacontent)
    {
        return packInfo.b.contains(mediacontent);
    }

    protected void loadContent()
    {
        setGlyphAsset(PackInfoUtils.a(packInfo, getContext()));
    }

    protected void onContentLoaded()
    {
        android.support.v7.widget.g.c c1 = new android.support.v7.widget.g.c() {

            final PickerTab this$0;

            public final int getSpanSize(int i)
            {
                com.skype.android.mediacontent.PackInfo.ItemInfo iteminfo = (com.skype.android.mediacontent.PackInfo.ItemInfo)packInfo.d.get(i);
                int j = iteminfo.a();
                if (i - iteminfo.c == j - 1)
                {
                    i = j % gridColumnsCount;
                    if (i > 0)
                    {
                        return (gridColumnsCount + 1) - i;
                    }
                }
                return 1;
            }

            
            {
                this$0 = PickerTab.this;
                super();
            }
        };
        layoutManager.a(c1);
        recyclerView.addItemDecoration(new c());
        recyclerView.setAdapter(adapter);
    }

    public void refreshItem(int i)
    {
        adapter.notifyItemChanged(i);
    }

    public void removeCurrentMojiSelectedPosition()
    {
        pickeritemClickHandler.removeCurrentMojiSelectedPosition();
    }






}
