// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.AutoResizeTextView;
import com.netflix.mediaclient.android.widget.StrokeTextView;
import com.netflix.mediaclient.service.player.subtitles.ColorMapping;
import com.netflix.mediaclient.service.player.subtitles.DoubleLength;
import com.netflix.mediaclient.service.player.subtitles.HorizontalAlignment;
import com.netflix.mediaclient.service.player.subtitles.Outline;
import com.netflix.mediaclient.service.player.subtitles.Region;
import com.netflix.mediaclient.service.player.subtitles.SubtitleBlock;
import com.netflix.mediaclient.service.player.subtitles.SubtitleParser;
import com.netflix.mediaclient.service.player.subtitles.SubtitleScreen;
import com.netflix.mediaclient.service.player.subtitles.SubtitleTextNode;
import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.player.subtitles.VerticalAlignment;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.SubtitleUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            SubtitleManager, PlayerActivity, PlayScreen

final class EnhancedSubtitleManager
    implements SubtitleManager
{

    private static final String DEFAULT_REGION_ID = "DEFAULT";
    private static final int H_REGION_PADDING = 5;
    private static final float SAFE_DISPLAY_AREA_MARGIN = 5F;
    private static final String TAG = "nf_subtitles_render";
    private static final int V_REGION_PADDING = 1;
    private PlayerActivity mActivity;
    private LinearLayout mDefaultRegion;
    private float mDefaultTextSize;
    private RelativeLayout mDisplayArea;
    final android.view.ViewTreeObserver.OnPreDrawListener mDoNotDraw = new android.view.ViewTreeObserver.OnPreDrawListener() {

        final EnhancedSubtitleManager this$0;

        public boolean onPreDraw()
        {
            Log.d("nf_subtitles_render", "onPreDraw on display area");
            return false;
        }

            
            {
                this$0 = EnhancedSubtitleManager.this;
                super();
            }
    };
    private Handler mHandler;
    private int mHorizontalRegionPadding;
    private SubtitleParser mParser;
    private List mPendingActions;
    private Map mRegions;
    private RelativeLayout mSafeDisplayArea;
    private PlayScreen mScreen;
    private Integer mSubtitleParserId;
    private int mTransparent;
    private int mVerticalRegionPadding;
    private Map mVisibleBlocks;

    EnhancedSubtitleManager(PlayerActivity playeractivity)
    {
        mRegions = new HashMap();
        mVisibleBlocks = new HashMap();
        mPendingActions = Collections.synchronizedList(new ArrayList());
        Log.d("nf_subtitles_render", "EnhancedSubtitleManager created");
        mActivity = playeractivity;
        mScreen = mActivity.getScreen();
        if (mScreen == null)
        {
            throw new IllegalArgumentException("Player screen is not initialized!");
        }
        if (mActivity.isTablet())
        {
            mDefaultTextSize = mActivity.getResources().getDimension(0x7f0a0073);
        } else
        {
            mDefaultTextSize = mActivity.getResources().getDimension(0x7f0a0072);
        }
        createDefaults();
        mHorizontalRegionPadding = AndroidUtils.dipToPixels(playeractivity, 5);
        mVerticalRegionPadding = AndroidUtils.dipToPixels(playeractivity, 1);
        mTransparent = playeractivity.getResources().getColor(0x106000d);
    }

    private void addRegion(Region region)
    {
        Log.d("nf_subtitles_render", "Add region ");
        LinearLayout linearlayout = new LinearLayout(mActivity);
        linearlayout.setVisibility(4);
        linearlayout.setTag(region.getId());
        Object obj = setRegionPosition(linearlayout, region.getExtent(), region.getOrigin());
        linearlayout.setOrientation(1);
        mDisplayArea.addView(linearlayout, ((android.view.ViewGroup.LayoutParams) (obj)));
        mRegions.put(region.getId(), linearlayout);
        VerticalAlignment verticalalignment = null;
        obj = verticalalignment;
        if (region != null)
        {
            obj = verticalalignment;
            if (region.getHorizontalAlignment() != null)
            {
                obj = region.getHorizontalAlignment();
            }
        }
        Object obj1 = null;
        verticalalignment = obj1;
        if (region != null)
        {
            verticalalignment = obj1;
            if (region.getVerticalAlignment() != null)
            {
                verticalalignment = region.getVerticalAlignment();
            }
        }
        if (obj != null && verticalalignment != null)
        {
            if (Log.isLoggable("nf_subtitles_render", 2))
            {
                Log.v("nf_subtitles_render", (new StringBuilder()).append("Set gravity for region ").append(region.getId()).toString());
            }
            linearlayout.setGravity(SubtitleUtils.toGravity(((HorizontalAlignment) (obj)), verticalalignment));
        }
    }

    private void applyEdge(TextView textview, Outline outline)
    {
        Log.d("nf_subtitles_render", "Apply edge");
        Object obj = outline;
        if (mParser.getUserDefaults() != null && mParser.getUserDefaults().getOutline() != null)
        {
            Log.d("nf_subtitles_render", "Using user outline overide");
            obj = mParser.getUserDefaults().getOutline();
        } else
        {
            Log.d("nf_subtitles_render", "Using content outline if exist");
        }
        if (obj == null || !((Outline) (obj)).isOutlineRequired())
        {
            Log.d("nf_subtitles_render", "No outline to be applied");
            return;
        }
        outline = SubtitleUtils.getEdgeColor(outline, mParser.getUserDefaults());
        if (outline == null)
        {
            Log.w("nf_subtitles_render", "Edge color unresolved, not setting anything!");
            return;
        }
        obj = ((Outline) (obj)).getShadow();
        if (obj == null)
        {
            Log.w("nf_subtitles_render", "Shadow is null, not setting anything!");
            return;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Sets text shadow with color ").append(outline).append(", radius ").append(((com.netflix.mediaclient.service.player.subtitles.Outline.Shadow) (obj)).radius).append(", dx ").append(((com.netflix.mediaclient.service.player.subtitles.Outline.Shadow) (obj)).dx).append(", dy ").append(((com.netflix.mediaclient.service.player.subtitles.Outline.Shadow) (obj)).dy).toString());
        }
        textview.setShadowLayer(((com.netflix.mediaclient.service.player.subtitles.Outline.Shadow) (obj)).radius, ((com.netflix.mediaclient.service.player.subtitles.Outline.Shadow) (obj)).dx, ((com.netflix.mediaclient.service.player.subtitles.Outline.Shadow) (obj)).dy, outline.intValue());
    }

    private void applyOutline(TextView textview, TextStyle textstyle)
    {
        if (textstyle.getOutline() != null)
        {
            if (textview instanceof StrokeTextView)
            {
                applyStroke((StrokeTextView)textview, textstyle.getOutline());
                return;
            } else
            {
                applyEdge(textview, textstyle.getOutline());
                return;
            }
        } else
        {
            Log.d("nf_subtitles_render", "No outline!");
            return;
        }
    }

    private void applyStroke(StrokeTextView stroketextview, Outline outline)
    {
        Integer integer = SubtitleUtils.getEdgeColor(outline, mParser.getUserDefaults());
        int i;
        if (outline.getOutlineWidth() != null)
        {
            i = outline.getOutlineWidth().intValue();
        } else
        {
            i = 1;
        }
        if (integer != null)
        {
            stroketextview.setStrokeWidth(i);
            stroketextview.setStrokeColor(integer.intValue());
        }
    }

    private void applyStyle(TextView textview, TextStyle textstyle)
    {
        TextStyle textstyle2 = mParser.getUserDefaults();
        TextStyle textstyle1 = textstyle;
        if (textstyle == null)
        {
            Log.w("nf_subtitles_render", "Style is null! Apply default!");
            textstyle1 = mParser.getTextStyleDefault();
        }
        if (textstyle1 == null)
        {
            Log.e("nf_subtitles_render", "Style does NOT exist, apply default! This should NEVER happen!");
            textview.setTextColor(mActivity.getResources().getColor(0x7f090035));
            textview.setTextSize(0, mDefaultTextSize);
            return;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Apply user style first ").append(textstyle2).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Apply style ").append(textstyle1).toString());
        }
        float f = SubtitleUtils.getFontSizeMultiplier(textstyle1, mParser.getUserDefaults());
        float f1 = mDefaultTextSize * f;
        textview.setTextSize(0, f1);
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Text size ").append(f1).append(", scale ").append(f).toString());
        }
        textview.setTypeface(SubtitleUtils.toTypeFace(textstyle1, mParser.getUserDefaults()), SubtitleUtils.toTypeFaceStyle(textstyle1));
        textstyle = SubtitleUtils.getTextColor(textstyle1, mParser.getUserDefaults());
        if (textstyle != null)
        {
            if (Log.isLoggable("nf_subtitles_render", 3))
            {
                Log.d("nf_subtitles_render", (new StringBuilder()).append("Sets text color to ").append(textstyle).toString());
            }
            textview.setTextColor(textstyle.intValue());
        } else
        {
            Log.w("nf_subtitles_render", "Text color unresolved, not setting anything!");
        }
        textstyle = SubtitleUtils.getBackgroundColor(textstyle1, mParser.getUserDefaults());
        if (textstyle != null)
        {
            if (Log.isLoggable("nf_subtitles_render", 3))
            {
                Log.d("nf_subtitles_render", (new StringBuilder()).append("Sets text view background color to ").append(textstyle).toString());
            }
            textview.setBackgroundColor(textstyle.intValue());
        } else
        {
            Log.w("nf_subtitles_render", "Background color unresolved, not setting anything!");
        }
        applyOutline(textview, textstyle1);
    }

    private void clearDelayedPosts()
    {
        this;
        JVM INSTR monitorenter ;
        if (mPendingActions == null) goto _L2; else goto _L1
_L1:
        int i = mPendingActions.size();
        if (i >= 1) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Runnable runnable;
        for (Iterator iterator = mPendingActions.iterator(); iterator.hasNext(); mHandler.removeCallbacks(runnable))
        {
            runnable = (Runnable)iterator.next();
        }

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        throw exception;
        mPendingActions.clear();
          goto _L2
    }

    private void createDefaultRegion()
    {
        Log.v("nf_subtitles_render", "Create default region");
        mDefaultRegion = new LinearLayout(mActivity);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        mDefaultRegion.setOrientation(1);
        layoutparams.addRule(12);
        mSafeDisplayArea.addView(mDefaultRegion, layoutparams);
        mDefaultRegion.setVisibility(4);
        mVisibleBlocks.put("DEFAULT", new ArrayList());
    }

    private void createDefaults()
    {
        Log.v("nf_subtitles_render", "Create handler.");
        mHandler = new Handler();
        Log.v("nf_subtitles_render", "Find root display area");
        mDisplayArea = (RelativeLayout)mActivity.findViewById(0x7f07014e);
        if (mDisplayArea == null)
        {
            Log.e("nf_subtitles_render", "Display area NOT found! This should NOT happen!");
            return;
        } else
        {
            Log.v("nf_subtitles_render", "Create safe display area");
            mSafeDisplayArea = new RelativeLayout(mActivity);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams.addRule(13);
            mDisplayArea.addView(mSafeDisplayArea, layoutparams);
            Log.v("nf_subtitles_render", "Create safe display area done.");
            createDefaultRegion();
            return;
        }
    }

    private void createRegions(Region aregion[])
    {
        setMarginsForSafeDisplayArea();
        mVisibleBlocks.put("DEFAULT", new ArrayList());
        if (aregion == null || aregion.length < 1)
        {
            Log.e("nf_subtitles_render", "createRegions:: no region found to be added!");
        } else
        {
            int i = 0;
            while (i < aregion.length) 
            {
                Region region = aregion[i];
                if (region == null)
                {
                    Log.e("nf_subtitles_render", (new StringBuilder()).append("createRegions:: region is null on position ").append(i).toString());
                } else
                if (region.getId() == null)
                {
                    Log.e("nf_subtitles_render", (new StringBuilder()).append("createRegions:: region ID is null on position ").append(i).append(". Ignore region ").append(region).toString());
                } else
                {
                    if (Log.isLoggable("nf_subtitles_render", 2))
                    {
                        Log.v("nf_subtitles_render", (new StringBuilder()).append("Create linear layout from region ").append(region).append(" on position ").append(i).toString());
                    }
                    addRegion(region);
                }
                i++;
            }
        }
    }

    private Runnable createRunnable(final SubtitleBlock block, final boolean show)
    {
        block = new Runnable() {

            final EnhancedSubtitleManager this$0;
            final SubtitleBlock val$block;
            final boolean val$show;

            public void run()
            {
                boolean flag = mPendingActions.remove(this);
                if (Log.isLoggable("nf_subtitles_render", 3))
                {
                    Log.d("nf_subtitles_render", (new StringBuilder()).append("Delayed show ").append(show).append(" for block ").append(block.getId()).toString());
                    Log.d("nf_subtitles_render", (new StringBuilder()).append("Removed from pending queue ").append(flag).toString());
                }
                if (show)
                {
                    Log.w("nf_subtitles_render", "===> showSubtitleBlock was called from pending queue!!");
                    showSubtitleBlock(block, null);
                    return;
                } else
                {
                    removeSubtitleBlock(block);
                    return;
                }
            }

            
            {
                this$0 = EnhancedSubtitleManager.this;
                show = flag;
                block = subtitleblock;
                super();
            }
        };
        mPendingActions.add(block);
        return block;
    }

    private String createText(String s, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (i > 1)
        {
            for (int j = 1; j < i; j++)
            {
                stringbuilder.append('\n');
            }

        }
        if (!StringUtils.isEmpty(s))
        {
            stringbuilder.append(s);
        }
        stringbuilder.append(" ");
        return stringbuilder.toString();
    }

    private LinearLayout findRegionLayout(SubtitleBlock subtitleblock)
    {
        Log.d("nf_subtitles_render", "findRegionLayout start");
        subtitleblock = subtitleblock.getRegion();
        if (subtitleblock == null || subtitleblock.getId() == null)
        {
            Log.d("nf_subtitles_render", "Block does not have region, put it in default region");
            return mDefaultRegion;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Block have region ").append(subtitleblock).toString());
        }
        Object obj = (LinearLayout)mRegions.get(subtitleblock.getId());
        if (obj == null)
        {
            if (Log.isLoggable("nf_subtitles_render", 6))
            {
                Log.e("nf_subtitles_render", (new StringBuilder()).append("Regions known ").append(mRegions.size()).toString());
                String s;
                for (obj = mRegions.keySet().iterator(); ((Iterator) (obj)).hasNext(); Log.e("nf_subtitles_render", (new StringBuilder()).append("Region '").append(s).append("' found!").toString()))
                {
                    s = (String)((Iterator) (obj)).next();
                }

                Log.e("nf_subtitles_render", (new StringBuilder()).append("Region NOT found for '").append(subtitleblock.getId()).append("'. Default to default region!").toString());
            }
            return mDefaultRegion;
        } else
        {
            Log.d("nf_subtitles_render", "LL for region found!");
            return ((LinearLayout) (obj));
        }
    }

    private List findTextView(String s, List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            TextView textview = (TextView)list.next();
            if (textview == null)
            {
                Log.e("nf_subtitles_render", "Text view can not be null!");
            } else
            if (s.equals((String)textview.getTag()))
            {
                Log.d("nf_subtitles_render", "Text view found for removal");
                arraylist.add(textview);
            }
        } while (true);
        if (arraylist.size() < 1)
        {
            Log.w("nf_subtitles_render", (new StringBuilder()).append("Text view NOT found for removal for block ").append(s).toString());
        }
        return arraylist;
    }

    private void handleDelayedSubtitleBlocks(List list, boolean flag)
    {
        SubtitleBlock subtitleblock;
        for (list = list.iterator(); list.hasNext(); mHandler.postDelayed(createRunnable(subtitleblock, flag), subtitleblock.getEnd()))
        {
            subtitleblock = (SubtitleBlock)list.next();
            if (Log.isLoggable("nf_subtitles_render", 2))
            {
                Log.v("nf_subtitles_render", (new StringBuilder()).append("Posting delayed block by ").append(subtitleblock.getEnd()).append(" [ms]. Display ").append(flag).append(" for block ").append(subtitleblock.getId()).toString());
            }
        }

    }

    private boolean isNextNodeInSameLine(List list, int i)
    {
        boolean flag = true;
        i++;
        if (list.size() <= i)
        {
            return false;
        }
        if (((SubtitleTextNode)list.get(i)).getLineBreaks() >= 1)
        {
            flag = false;
        }
        return flag;
    }

    private boolean isPositionDefinedInBlock(LinearLayout linearlayout, SubtitleBlock subtitleblock)
    {
        Log.d("nf_subtitles_render", "isPositionDefinedInBlock start");
        if (subtitleblock.getRegion() == null)
        {
            Log.d("nf_subtitles_render", "isPositionDefinedInBlock no region, no need for wrapper");
            return false;
        }
        if (subtitleblock.getTextNodes().size() < 1)
        {
            Log.w("nf_subtitles_render", "isPositionDefinedInBlock no text blocks!");
            return false;
        }
        linearlayout = (SubtitleTextNode)subtitleblock.getTextNodes().get(0);
        if (linearlayout == null || linearlayout.getStyle() == null)
        {
            Log.w("nf_subtitles_render", "isPositionDefinedInBlock p missing");
            return false;
        }
        linearlayout = subtitleblock.getStyle().getExtent();
        subtitleblock = subtitleblock.getStyle().getOrigin();
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("isPositionDefinedInBlock extent ").append(linearlayout).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("isPositionDefinedInBlock origin ").append(subtitleblock).toString());
        }
        if (DoubleLength.canUse(linearlayout) && DoubleLength.canUse(subtitleblock))
        {
            Log.d("nf_subtitles_render", "isPositionDefinedInBlock using block extent and origin overrides, return true");
            return true;
        } else
        {
            Log.d("nf_subtitles_render", "isPositionDefinedInBlock using region defaults for extent and origin, return false");
            return false;
        }
    }

    private void makeItVisible(List list)
    {
        com.netflix.mediaclient.util.ViewUtils.ViewComparator viewcomparator;
        for (list = list.iterator(); list.hasNext(); viewcomparator.getView().setVisibility(0))
        {
            viewcomparator = (com.netflix.mediaclient.util.ViewUtils.ViewComparator)list.next();
            viewcomparator.getView().setTag(null);
        }

    }

    private void moveBlocksAppartIfNeeded(List list)
    {
        Collections.sort(list, com.netflix.mediaclient.util.ViewUtils.ViewComparator.REVERSE_SORT_BY_TOP);
        if (moveBlocksUpIfNeeded(list))
        {
            Log.d("nf_subtitles_render", "Blocks moved appart, but we hit top, reorder blocks and move appart by pushing to bottom");
            Collections.sort(list, com.netflix.mediaclient.util.ViewUtils.ViewComparator.SORT_BY_TOP);
            Log.d("nf_subtitles_render", "Sorted");
            moveBlocksBottomIfNeeded(list);
            return;
        } else
        {
            Log.d("nf_subtitles_render", "Blocks moved appart, no issues");
            return;
        }
    }

    private void moveBlocksBottomIfNeeded(List list)
    {
        int k = list.size();
        for (int i = 0; i < k - 1; i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (Log.isLoggable("nf_subtitles_render", 3))
                {
                    Log.d("nf_subtitles_render", (new StringBuilder()).append("Blocks ").append(i).append(" and ").append(j).append(" test ").append(list.size()).toString());
                }
                SubtitleUtils.adjustIfIntersectByMovingSecondDown((LinearLayout)((com.netflix.mediaclient.util.ViewUtils.ViewComparator)list.get(i)).getView(), (LinearLayout)((com.netflix.mediaclient.util.ViewUtils.ViewComparator)list.get(j)).getView(), mDisplayArea.getHeight());
            }

        }

    }

    private boolean moveBlocksUpIfNeeded(List list)
    {
        boolean flag = false;
        int k = list.size();
        for (int i = 0; i < k - 1; i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (Log.isLoggable("nf_subtitles_render", 3))
                {
                    Log.d("nf_subtitles_render", (new StringBuilder()).append("Blocks ").append(i).append(" and ").append(j).append(" test ").append(list.size()).toString());
                }
                if (SubtitleUtils.adjustIfIntersectByMovingFirstUp((LinearLayout)((com.netflix.mediaclient.util.ViewUtils.ViewComparator)list.get(j)).getView(), (LinearLayout)((com.netflix.mediaclient.util.ViewUtils.ViewComparator)list.get(i)).getView()) == -1)
                {
                    Log.w("nf_subtitles_render", "We hit top!");
                    flag = true;
                }
            }

        }

        return flag;
    }

    private com.netflix.mediaclient.util.SubtitleUtils.Margins moveRegionInsideVisibleDisplayArea(com.netflix.mediaclient.util.SubtitleUtils.Margins margins, int i, int j, Rect rect)
    {
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Margins, left: ").append(margins.left).append(", top: ").append(margins.top).append(", right: ").append(margins.right).append(", bottom: ").append(margins.bottom).toString());
        }
        com.netflix.mediaclient.util.SubtitleUtils.Margins margins1 = new com.netflix.mediaclient.util.SubtitleUtils.Margins();
        int i1 = margins.top;
        int l = margins.left;
        int k;
        if (rect.height() >= j)
        {
            Log.d("nf_subtitles_render", "Original region is high enough, keep original measure");
            k = margins.bottom;
        } else
        {
            Log.d("nf_subtitles_render", "Original region is NOT high enough, recalculate");
            k = margins.top + j + mVerticalRegionPadding * 2;
        }
        if (rect.width() >= i)
        {
            Log.d("nf_subtitles_render", "Original region is wide enough, keep original measure");
            j = margins.right;
        } else
        {
            Log.d("nf_subtitles_render", "Original region is NOT wide enough, recalculate");
            j = margins.left + i + mHorizontalRegionPadding * 2;
        }
        Log.d("nf_subtitles_render", "Check if region bottom is lower than display area");
        if (k > mDisplayArea.getHeight())
        {
            k = i1 - (k - mDisplayArea.getHeight());
            i = k;
            if (Log.isLoggable("nf_subtitles_render", 3))
            {
                Log.d("nf_subtitles_render", (new StringBuilder()).append("New top ").append(k).toString());
                i = k;
            }
        } else
        {
            Log.d("nf_subtitles_render", "No need to change top");
            i = i1;
        }
        Log.d("nf_subtitles_render", "Check if region top is higher than display area");
        if (i < 0)
        {
            k = 0;
            Log.d("nf_subtitles_render", "Top is 0");
        } else
        {
            Log.d("nf_subtitles_render", "No need to change top");
            k = i;
        }
        Log.d("nf_subtitles_render", "Check if region right is pass right of display area");
        if (j > mDisplayArea.getWidth())
        {
            j = l - (j - mDisplayArea.getWidth());
            i = j;
            if (Log.isLoggable("nf_subtitles_render", 3))
            {
                Log.d("nf_subtitles_render", (new StringBuilder()).append("New left ").append(j).toString());
                i = j;
            }
        } else
        {
            Log.d("nf_subtitles_render", "No need to change left");
            i = l;
        }
        Log.d("nf_subtitles_render", "Check if region left is pass left of display area");
        if (i < 0)
        {
            i = 0;
            Log.d("nf_subtitles_render", "Left is 0");
        } else
        {
            Log.d("nf_subtitles_render", "No need to change left");
        }
        margins1.left = i;
        margins1.top = k;
        return margins1;
    }

    private void removeAll(boolean flag)
    {
        clearDelayedPosts();
        removeVisibleSubtitleBlocks(flag);
    }

    private void removeBlock(String s, List list, String s1)
    {
        if (s == null)
        {
            Log.w("nf_subtitles_render", "Block id can not be null!");
        } else
        {
            if (list == null || list.size() < 1)
            {
                Log.d("nf_subtitles_render", "Views are null or empty, nothing to remove!");
                return;
            }
            if ("DEFAULT".equals(s1))
            {
                removeViews((LinearLayout)mRegions.get(s1), findTextView(s1, list));
            }
            s = list.iterator();
            while (s.hasNext()) 
            {
                if ((TextView)s.next() == null)
                {
                    Log.e("nf_subtitles_render", "Text view can not be null!");
                }
            }
        }
    }

    private void removeRegions()
    {
        this;
        JVM INSTR monitorenter ;
        if (mRegions.size() >= 1) goto _L2; else goto _L1
_L1:
        Log.d("nf_subtitles_render", "removeRegions:: no region found to remove.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = mRegions.keySet().iterator();
_L5:
        String s;
        LinearLayout linearlayout;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_175;
        }
        s = (String)iterator.next();
        linearlayout = (LinearLayout)mRegions.get(s);
        if (linearlayout != null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (!Log.isLoggable("nf_subtitles_render", 6)) goto _L4; else goto _L3
_L3:
        Log.e("nf_subtitles_render", (new StringBuilder()).append("Removing region ").append(s).append(" is not possible. Region is null!").toString());
          goto _L4
        Exception exception;
        exception;
        throw exception;
        if (Log.isLoggable("nf_subtitles_render", 2))
        {
            Log.v("nf_subtitles_render", (new StringBuilder()).append("Removing region ").append(s).toString());
        }
        mDisplayArea.removeView(linearlayout);
          goto _L5
        mRegions.clear();
          goto _L4
    }

    private void removeSubtitleBlock(SubtitleBlock subtitleblock)
    {
        if (subtitleblock == null)
        {
            Log.e("nf_subtitles_render", "Subtitle block can not be null!");
            return;
        }
        Object obj = subtitleblock.getRegion();
        if (obj == null)
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Remove block from default region for id ").append(subtitleblock.getId()).toString());
            removeBlock(subtitleblock.getId(), (List)mVisibleBlocks.get("DEFAULT"), "DEFAULT");
            return;
        }
        obj = ((Region) (obj)).getId();
        if (obj == null)
        {
            Log.e("nf_subtitles_render", "Region id can NOT be null!");
            return;
        } else
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Remove block from region ").append(((String) (obj))).append(" for block id ").append(subtitleblock.getId()).toString());
            removeBlock(subtitleblock.getId(), (List)mVisibleBlocks.get(obj), ((String) (obj)));
            return;
        }
    }

    private void removeViews(LinearLayout linearlayout, List list)
    {
        if (linearlayout == null)
        {
            Log.e("nf_subtitles_render", "Region is null, can not remove views!");
        } else
        {
            if (list == null)
            {
                Log.e("nf_subtitles_render", "Blocks are null, can not remove views!");
                return;
            }
            list = list.iterator();
            while (list.hasNext()) 
            {
                TextView textview = (TextView)list.next();
                Log.d("nf_subtitles_render", (new StringBuilder()).append("Removing block from region ").append(linearlayout.getTag()).toString());
                linearlayout.removeView(textview);
                linearlayout.setVisibility(4);
            }
        }
    }

    private void removeVisibleSubtitleBlocks(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (mDefaultRegion == null) goto _L2; else goto _L1
_L1:
        mDefaultRegion.setBackgroundColor(mTransparent);
        mDefaultRegion.setVisibility(4);
        if (!flag) goto _L4; else goto _L3
_L3:
        mDefaultRegion.removeAllViews();
_L2:
        Iterator iterator = mRegions.keySet().iterator();
_L10:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        String s;
        LinearLayout linearlayout;
        s = (String)iterator.next();
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Removing visible blocks for region ").append(s).toString());
        }
        linearlayout = (LinearLayout)mRegions.get(s);
        if (linearlayout != null) goto _L8; else goto _L7
_L7:
        if (!Log.isLoggable("nf_subtitles_render", 3)) goto _L10; else goto _L9
_L9:
        Log.d("nf_subtitles_render", (new StringBuilder()).append("Region not found for id ").append(s).append(". Probably default region.").toString());
          goto _L10
        Exception exception;
        exception;
        throw exception;
_L4:
        mDefaultRegion.removeAllViewsInLayout();
        continue; /* Loop/switch isn't completed */
_L8:
        linearlayout.setBackgroundColor(mTransparent);
        linearlayout.setVisibility(4);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        linearlayout.removeAllViews();
          goto _L10
        linearlayout.removeAllViewsInLayout();
          goto _L10
_L6:
        mVisibleBlocks.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L2; else goto _L11
_L11:
    }

    private void setAlignmentToRegion(LinearLayout linearlayout, SubtitleBlock subtitleblock)
    {
        Object obj2 = subtitleblock.getRegion();
        Object obj = HorizontalAlignment.center;
        HorizontalAlignment horizontalalignment = ((HorizontalAlignment) (obj));
        if (obj2 != null)
        {
            horizontalalignment = ((HorizontalAlignment) (obj));
            if (((Region) (obj2)).getHorizontalAlignment() != null)
            {
                Log.d("nf_subtitles_render", "Horizontal alignment from region");
                horizontalalignment = ((Region) (obj2)).getHorizontalAlignment();
            }
        }
        Object obj1 = VerticalAlignment.bottom;
        obj = obj1;
        if (obj2 != null)
        {
            obj = obj1;
            if (((Region) (obj2)).getVerticalAlignment() != null)
            {
                Log.d("nf_subtitles_render", "Vertical alignment from region");
                obj = ((Region) (obj2)).getVerticalAlignment();
            }
        }
        obj1 = horizontalalignment;
        obj2 = obj;
        if (subtitleblock.getTextNodes().size() > 1)
        {
            subtitleblock = (SubtitleTextNode)subtitleblock.getTextNodes().get(0);
            obj1 = horizontalalignment;
            obj2 = obj;
            if (subtitleblock != null)
            {
                obj1 = horizontalalignment;
                obj2 = obj;
                if (subtitleblock.getStyle() != null)
                {
                    if (subtitleblock.getStyle().getHorizontalAlignment() != null)
                    {
                        Log.d("nf_subtitles_render", "Horizontal alignment overide from p!");
                        horizontalalignment = subtitleblock.getStyle().getHorizontalAlignment();
                    }
                    obj1 = horizontalalignment;
                    obj2 = obj;
                    if (subtitleblock.getStyle().getVerticalAlignment() != null)
                    {
                        Log.d("nf_subtitles_render", "Vertical alignment overide from p!");
                        obj2 = subtitleblock.getStyle().getVerticalAlignment();
                        obj1 = horizontalalignment;
                    }
                }
            }
        }
        linearlayout.setGravity(SubtitleUtils.toGravity(((HorizontalAlignment) (obj1)), ((VerticalAlignment) (obj2))));
    }

    private void setBackgroundColorToRegion(LinearLayout linearlayout, SubtitleBlock subtitleblock)
    {
        Object obj = mParser.getUserDefaults();
        Object obj1 = null;
        if (obj == null)
        {
            Log.d("nf_subtitles_render", "No user overides for window color");
            obj = obj1;
            if (subtitleblock.getTextNodes().size() > 0)
            {
                subtitleblock = ((SubtitleTextNode)subtitleblock.getTextNodes().get(0)).getStyle();
                obj = obj1;
                if (subtitleblock != null)
                {
                    obj = obj1;
                    if (subtitleblock.getWindowColor() != null)
                    {
                        obj = ColorMapping.resolveColor(subtitleblock.getWindowOpacity(), subtitleblock.getWindowColor());
                    }
                }
            }
        } else
        {
            Log.d("nf_subtitles_render", "User overides found for window color");
            obj = ColorMapping.resolveColor(((TextStyle) (obj)).getWindowOpacity(), ((TextStyle) (obj)).getWindowColor());
        }
        if (obj == null)
        {
            Log.d("nf_subtitles_render", "Sets region background color to transparent");
            linearlayout.setBackgroundColor(mActivity.getResources().getColor(0x106000d));
            return;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Sets region background color to ").append(obj).toString());
        }
        linearlayout.setBackgroundColor(((Integer) (obj)).intValue());
    }

    private void setMarginsForSafeDisplayArea()
    {
        Log.d("nf_subtitles_render", "Sets margin for safe display area");
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mSafeDisplayArea.getLayoutParams();
        int i = (int)((float)(mDisplayArea.getWidth() / 100) * 5F);
        int j = (int)((float)(mDisplayArea.getHeight() / 100) * 5F);
        layoutparams.setMargins(i, j, i, j);
        mSafeDisplayArea.setLayoutParams(layoutparams);
    }

    private android.widget.RelativeLayout.LayoutParams setRegionPosition(LinearLayout linearlayout, DoubleLength doublelength, DoubleLength doublelength1)
    {
        Rect rect = SubtitleUtils.createRegionForRectangle(mDisplayArea, doublelength, doublelength1);
        if (doublelength == null || !doublelength.isValid())
        {
            Log.d("nf_subtitles_render", "Region w/h not know, wrap around content");
            linearlayout = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        } else
        {
            int j = rect.width();
            int l = rect.height();
            if (Log.isLoggable("nf_subtitles_render", 2))
            {
                Log.v("nf_subtitles_render", (new StringBuilder()).append("Display area: w ").append(mDisplayArea.getWidth()).append(", h ").append(mDisplayArea.getHeight()).toString());
                Log.v("nf_subtitles_render", (new StringBuilder()).append("Region w/h ").append(j).append("/").append(l).append(" known, set them").toString());
            }
            if (mDisplayArea != null)
            {
                int j1 = mDisplayArea.getHeight() / 4;
                if (Log.isLoggable("nf_subtitles_render", 2))
                {
                    Log.d("nf_subtitles_render", (new StringBuilder()).append("h: ").append(l).append(", maxHeight: ").append(j1).toString());
                }
                if (l < j1)
                {
                    Log.d("nf_subtitles_render", "Use wrap content for height");
                    linearlayout = new android.widget.RelativeLayout.LayoutParams(j, -2);
                } else
                {
                    Log.d("nf_subtitles_render", "Use region height");
                    linearlayout = new android.widget.RelativeLayout.LayoutParams(j, l);
                }
            } else
            {
                Log.d("nf_subtitles_render", "Use wrap content for height");
                linearlayout = new android.widget.RelativeLayout.LayoutParams(j, -2);
            }
        }
        if (doublelength1 != null && doublelength1.isValid() && doublelength != null && doublelength.isValid())
        {
            int i = rect.left;
            int k = rect.top;
            int i1 = mDisplayArea.getWidth() - rect.right;
            int k1 = mDisplayArea.getHeight() - rect.bottom;
            if (Log.isLoggable("nf_subtitles_render", 3))
            {
                Log.d("nf_subtitles_render", (new StringBuilder()).append("Margins, left: ").append(i).append(", top: ").append(k).append(", right: ").append(i1).append(", bottom: ").append(k1).toString());
            }
            linearlayout.setMargins(i, k, i1, k1);
        }
        return linearlayout;
    }

    private void setVisibilityForAllRegions(boolean flag)
    {
        Iterator iterator = mRegions.values().iterator();
        while (iterator.hasNext()) 
        {
            LinearLayout linearlayout = (LinearLayout)iterator.next();
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            linearlayout.setVisibility(i);
        }
    }

    private void showSubtitleBlock(SubtitleBlock subtitleblock, List list)
    {
        if (subtitleblock == null || subtitleblock.getTextNodes().size() < 1)
        {
            Log.e("nf_subtitles_render", "Block is empty! Can not show!");
            return;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Show subtitle block: ").append(subtitleblock).toString());
        }
        LinearLayout linearlayout1 = findRegionLayout(subtitleblock);
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("LL for region ").append(linearlayout1.getTag()).toString());
        }
        linearlayout1.setVisibility(4);
        if (list != null)
        {
            list.add(new com.netflix.mediaclient.util.ViewUtils.ViewComparator(linearlayout1));
        }
        Object obj;
        LinearLayout linearlayout;
        int i;
        int j;
        int k1;
        if (!isPositionDefinedInBlock(linearlayout1, subtitleblock))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setAlignmentToRegion(linearlayout1, subtitleblock);
        linearlayout = linearlayout1;
        if (i != 0)
        {
            Log.d("nf_subtitles_render", "Using extent/origin from original region, add wrapper region that will be wrapped around block and that will be used for background color for region");
            linearlayout = new LinearLayout(mActivity);
            linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            linearlayout.setPadding(mHorizontalRegionPadding, mVerticalRegionPadding, mHorizontalRegionPadding, mVerticalRegionPadding);
            linearlayout.setOrientation(1);
            linearlayout1.addView(linearlayout);
        } else
        {
            Log.d("nf_subtitles_render", "Using extent/origin from block, region will be wrapped around block and background color will be applied to it.");
        }
        i = 0;
        j = 0;
        obj = null;
        k1 = 0;
        while (k1 < subtitleblock.getTextNodes().size()) 
        {
            SubtitleTextNode subtitletextnode = (SubtitleTextNode)subtitleblock.getTextNodes().get(k1);
            TextView textview = toTextView(subtitletextnode);
            list = ((List) (obj));
            int i1 = j;
            int k = i;
            if (subtitletextnode.getLineBreaks() > 0)
            {
                Log.d("nf_subtitles_render", "This node belongs to its own line");
                i1 = j;
                k = i;
                if (obj != null)
                {
                    ((LinearLayout) (obj)).measure(0, 0);
                    j += ((LinearLayout) (obj)).getMeasuredHeight();
                    i1 = j;
                    k = i;
                    if (i < ((LinearLayout) (obj)).getMeasuredWidth())
                    {
                        k = ((LinearLayout) (obj)).getMeasuredWidth();
                        i1 = j;
                    }
                }
                list = null;
            }
            if (isNextNodeInSameLine(subtitleblock.getTextNodes(), k1))
            {
                Log.d("nf_subtitles_render", "Next node is in same line, add current node to horizontal LL.");
                obj = list;
                if (list == null)
                {
                    obj = new LinearLayout(mActivity);
                    ((LinearLayout) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                    ((LinearLayout) (obj)).setOrientation(0);
                    linearlayout.addView(((View) (obj)));
                }
            } else
            {
                Log.d("nf_subtitles_render", "Next node is not in same line");
                obj = list;
            }
            if (obj != null)
            {
                Log.d("nf_subtitles_render", "Adding node to horizontal wrapper");
                ((LinearLayout) (obj)).addView(textview);
                i = k;
                j = i1;
            } else
            {
                Log.d("nf_subtitles_render", "Adding node directly to a window region");
                linearlayout.addView(textview);
                i1 += textview.getMeasuredHeight();
                j = i1;
                i = k;
                if (k < textview.getMeasuredWidth())
                {
                    i = textview.getMeasuredWidth();
                    j = i1;
                }
            }
            k1++;
        }
        int l;
        if (obj != null)
        {
            Log.d("nf_subtitles_render", "Last horizontal wrapper needs to be measured");
            ((LinearLayout) (obj)).measure(0, 0);
            int j1 = j + ((LinearLayout) (obj)).getMeasuredHeight();
            j = j1;
            l = i;
            if (i < ((LinearLayout) (obj)).getMeasuredWidth())
            {
                l = ((LinearLayout) (obj)).getMeasuredWidth();
                j = j1;
            }
        } else
        {
            Log.d("nf_subtitles_render", "No unmeasured last horizontal wrapper");
            l = i;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Region w: ").append(l).append(", h: ").append(j).toString());
        }
        updatePositionIfNeeded(linearlayout1, subtitleblock, l, j);
        setBackgroundColorToRegion(linearlayout, subtitleblock);
    }

    private void showSubtitleBlocks(List list)
    {
        ViewTreeObserver viewtreeobserver = mDisplayArea.getViewTreeObserver();
        viewtreeobserver.addOnPreDrawListener(mDoNotDraw);
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); showSubtitleBlock((SubtitleBlock)iterator.next(), arraylist)) { }
        moveBlocksAppartIfNeeded(arraylist);
        makeItVisible(arraylist);
        viewtreeobserver.removeOnPreDrawListener(mDoNotDraw);
        mDisplayArea.forceLayout();
        mDisplayArea.requestLayout();
        mDisplayArea.invalidate();
        Log.d("nf_subtitles_render", "Add displayed block to pending queue to be removed at end time");
        handleDelayedSubtitleBlocks(list, false);
    }

    private TextView toTextView(SubtitleTextNode subtitletextnode)
    {
        String s = createText(subtitletextnode.getText(), subtitletextnode.getLineBreaks());
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Create text view from ").append(subtitletextnode).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Text to set ").append(s).toString());
        }
        Object obj;
        if (SubtitleUtils.isStrokeTextViewRequired(subtitletextnode.getStyle(), mParser.getUserDefaults()))
        {
            obj = new StrokeTextView(mActivity);
        } else
        {
            obj = new AutoResizeTextView(mActivity);
        }
        ((AutoResizeTextView) (obj)).setEllipsize(null);
        ((AutoResizeTextView) (obj)).setSingleLine(true);
        ((AutoResizeTextView) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        if (Boolean.TRUE.equals(subtitletextnode.getStyle().getUnderline()))
        {
            Log.d("nf_subtitles_render", "Sets underline");
            ((AutoResizeTextView) (obj)).setUnderline(true);
        }
        applyStyle(((TextView) (obj)), subtitletextnode.getStyle());
        ((AutoResizeTextView) (obj)).setText(s);
        ((AutoResizeTextView) (obj)).setGravity(119);
        ((AutoResizeTextView) (obj)).measure(0, 0);
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Post measure text view mw: ").append(((AutoResizeTextView) (obj)).getMeasuredWidth()).append(", mh: ").append(((AutoResizeTextView) (obj)).getMeasuredHeight()).toString());
        }
        return ((TextView) (obj));
    }

    private void updatePositionIfNeeded(LinearLayout linearlayout, SubtitleBlock subtitleblock, int i, int j)
    {
        Log.d("nf_subtitles_render", "updatePositionIfNeeded start");
        Region region = subtitleblock.getRegion();
        if (region == null)
        {
            Log.d("nf_subtitles_render", "updatePositionIfNeeded no region, no update");
        } else
        {
            Log.d("nf_subtitles_render", "updatePositionIfNeeded start for real");
            if (subtitleblock.getTextNodes().size() < 1)
            {
                Log.w("nf_subtitles_render", "updatePositionIfNeeded no text blocks!");
                return;
            }
            Object obj = (SubtitleTextNode)subtitleblock.getTextNodes().get(0);
            if (obj == null || ((SubtitleTextNode) (obj)).getStyle() == null)
            {
                Log.w("nf_subtitles_render", "updatePositionIfNeeded p missing");
                return;
            }
            obj = subtitleblock.getStyle().getExtent();
            subtitleblock = subtitleblock.getStyle().getOrigin();
            if (DoubleLength.canUse(((DoubleLength) (obj))) && DoubleLength.canUse(subtitleblock))
            {
                Log.w("nf_subtitles_render", "updatePositionIfNeeded using block extent and origin overrides");
                updateRegionPosition(linearlayout, i, j, ((DoubleLength) (obj)), subtitleblock);
                return;
            }
            Log.w("nf_subtitles_render", "updatePositionIfNeeded using region defaults for extent and origin");
            if (Log.isLoggable("nf_subtitles_render", 2))
            {
                Log.d("nf_subtitles_render", (new StringBuilder()).append("Region h ").append(linearlayout.getHeight()).append(", needed h ").append(j).toString());
            }
            if (DoubleLength.canUse(region.getExtent()) && DoubleLength.canUse(region.getOrigin()))
            {
                subtitleblock = SubtitleUtils.createRegionForRectangle(mDisplayArea, region.getExtent(), region.getOrigin());
                if (subtitleblock.height() < j && subtitleblock.width() < i)
                {
                    Log.d("nf_subtitles_render", "Text does not fit into region by height AND width. Update region position taking into account measured data.");
                    updateRegionPosition(linearlayout, i, j, region.getExtent(), region.getOrigin());
                    return;
                }
                if (subtitleblock.height() < j)
                {
                    Log.d("nf_subtitles_render", "Text does not fit into region by height. Update region position taking into account measured data.");
                    updateRegionPosition(linearlayout, i, j, region.getExtent(), region.getOrigin());
                    return;
                }
                if (subtitleblock.width() < i)
                {
                    Log.d("nf_subtitles_render", "Text does not fit into region by width. Update region position taking into account measured data.");
                    updateRegionPosition(linearlayout, i, j, region.getExtent(), region.getOrigin());
                    return;
                } else
                {
                    Log.d("nf_subtitles_render", "Text fits into region.");
                    return;
                }
            }
        }
    }

    private void updateRegionPosition(LinearLayout linearlayout, int i, int j, DoubleLength doublelength, DoubleLength doublelength1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
        if (Log.isLoggable("nf_subtitles_render", 2))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Display area: w ").append(mDisplayArea.getWidth()).append(", h ").append(mDisplayArea.getHeight()).toString());
        }
        Rect rect = SubtitleUtils.createRegionForRectangle(mDisplayArea, doublelength, doublelength1);
        doublelength = moveRegionInsideVisibleDisplayArea(SubtitleUtils.getMarginsForRectangle(mDisplayArea, doublelength, doublelength1), i, j, rect);
        layoutparams.setMargins(((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).left, ((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).top, 0, 0);
        if (rect.height() >= j)
        {
            Log.d("nf_subtitles_render", "Original region is high enough, keep original measure");
            j = ((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).top + rect.height();
        } else
        {
            Log.d("nf_subtitles_render", "Original region is NOT high enough, recalculate");
            layoutparams.height = mVerticalRegionPadding * 2 + j;
            j = ((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).top + layoutparams.height;
        }
        if (rect.width() >= i)
        {
            Log.d("nf_subtitles_render", "Original region is wide enough, keep original measure");
            i = ((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).left + rect.width();
        } else
        {
            Log.d("nf_subtitles_render", "Original region is NOT wide enough, recalculate");
            layoutparams.width = mHorizontalRegionPadding * 2 + i;
            i = ((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).left + layoutparams.width;
        }
        linearlayout.setTag(new Rect(((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).left, ((com.netflix.mediaclient.util.SubtitleUtils.Margins) (doublelength)).top, i, j));
        linearlayout.setPadding(mHorizontalRegionPadding, mVerticalRegionPadding, mHorizontalRegionPadding, mVerticalRegionPadding);
        linearlayout.setLayoutParams(layoutparams);
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        Log.v("nf_subtitles_render", "Remove pending actions");
        removeAll(true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void clearPendingUpdates()
    {
        clearDelayedPosts();
    }

    public void onSubtitleChange(SubtitleScreen subtitlescreen)
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("nf_subtitles_render", "EnhancedSubtitleManager:: update subtitle data");
        if (subtitlescreen != null) goto _L2; else goto _L1
_L1:
        Log.e("nf_subtitles_render", "Subtitle data is null. This should never happen!");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (subtitlescreen.getParser() != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        Log.e("nf_subtitles_render", "Subtitle parser is null. This should never happen!");
          goto _L3
        subtitlescreen;
        throw subtitlescreen;
        int i;
        mParser = subtitlescreen.getParser();
        removeAll(false);
        i = subtitlescreen.getParser().hashCode();
        if (mSubtitleParserId == null || mSubtitleParserId.intValue() != i)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (Log.isLoggable("nf_subtitles_render", 2))
        {
            Log.v("nf_subtitles_render", (new StringBuilder()).append("Same subtitles file ").append(mSubtitleParserId).toString());
        }
_L4:
        showSubtitleBlocks(subtitlescreen.getDisplayNowBlocks());
        handleDelayedSubtitleBlocks(subtitlescreen.getDisplayLaterBlocks(), true);
          goto _L3
        if (Log.isLoggable("nf_subtitles_render", 2))
        {
            Log.v("nf_subtitles_render", (new StringBuilder()).append("Subtitles file changed. Was ").append(mSubtitleParserId).append(", now ").append(i).append(". (Re) create regions!").toString());
        }
        mSubtitleParserId = Integer.valueOf(subtitlescreen.getParser().hashCode());
        removeRegions();
        createRegions(subtitlescreen.getParser().getRegions());
          goto _L4
    }

    public void onSubtitleRemove()
    {
        Log.d("nf_subtitles_render", "Remove all subtitles.");
        removeAll(true);
    }

    public void onSubtitleShow(String s)
    {
        Log.w("nf_subtitles_render", "EnhancedSubtitleManager does not implement onSubtitleShow!");
    }

    public void setSubtitleVisibility(final boolean visibility)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("EnhancedSubtitleManager:: set subtitle visibility to visible ").append(visibility).toString());
        }
        mHandler.post(new Runnable() {

            final EnhancedSubtitleManager this$0;
            final boolean val$visibility;

            public void run()
            {
                setVisibilityForAllRegions(visibility);
            }

            
            {
                this$0 = EnhancedSubtitleManager.this;
                visibility = flag;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }




}
