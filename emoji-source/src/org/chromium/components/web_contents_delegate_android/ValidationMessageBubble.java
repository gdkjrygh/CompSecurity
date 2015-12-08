// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.components.web_contents_delegate_android;

import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.content.browser.RenderCoordinates;

class ValidationMessageBubble
{

    private PopupWindow mPopup;

    private ValidationMessageBubble(ContentViewCore contentviewcore, RectF rectf, String s, String s1)
    {
        ViewGroup viewgroup = (ViewGroup)View.inflate(contentviewcore.getContext(), org.chromium.content.R.layout.validation_message_bubble, null);
        mPopup = new PopupWindow(viewgroup);
        updateTextViews(viewgroup, s, s1);
        measure(contentviewcore.getRenderCoordinates());
        rectf = adjustWindowPosition(contentviewcore, (int)(rectf.centerX() - getAnchorOffset()), (int)rectf.bottom);
        mPopup.showAtLocation(contentviewcore.getContainerView(), 0, ((Point) (rectf)).x, ((Point) (rectf)).y);
    }

    private Point adjustWindowPosition(ContentViewCore contentviewcore, int i, int j)
    {
        int l;
        int i1;
        int j1;
        int k1;
        RenderCoordinates rendercoordinates = contentviewcore.getRenderCoordinates();
        j1 = rendercoordinates.getLastFrameViewportWidthPixInt();
        l = (int)getWebViewOffsetYPixInScreen(contentviewcore) + rendercoordinates.getLastFrameViewportHeightPixInt();
        k1 = mPopup.getContentView().getMeasuredWidth();
        i1 = mPopup.getContentView().getMeasuredHeight();
        if (i >= 0) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        i = j;
        if (j + i1 > l)
        {
            i = l - i1;
        }
        return new Point(k, i);
_L2:
        k = i;
        if (i + k1 > j1)
        {
            k = j1 - k1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void close()
    {
        if (mPopup == null)
        {
            return;
        } else
        {
            mPopup.dismiss();
            mPopup = null;
            return;
        }
    }

    private static ValidationMessageBubble createAndShow(ContentViewCore contentviewcore, int i, int j, int k, int l, String s, String s1)
    {
        return new ValidationMessageBubble(contentviewcore, makePixRectInScreen(contentviewcore, i, j, k, l), s, s1);
    }

    private float getAnchorOffset()
    {
        View view = mPopup.getContentView();
        int i = view.getMeasuredWidth();
        int j = view.findViewById(org.chromium.content.R.id.arrow_image).getMeasuredWidth();
        if (ApiCompatibilityUtils.isLayoutRtl(view))
        {
            return (float)((i * 3) / 4 - j / 2);
        } else
        {
            return (float)(i / 4 + j / 2);
        }
    }

    private static float getWebViewOffsetYPixInScreen(ContentViewCore contentviewcore)
    {
        int ai[] = new int[2];
        contentviewcore.getContainerView().getLocationOnScreen(ai);
        return (float)ai[1] + contentviewcore.getRenderCoordinates().getContentOffsetYPix();
    }

    private static RectF makePixRectInScreen(ContentViewCore contentviewcore, int i, int j, int k, int l)
    {
        RenderCoordinates rendercoordinates = contentviewcore.getRenderCoordinates();
        float f = getWebViewOffsetYPixInScreen(contentviewcore);
        return new RectF(rendercoordinates.fromLocalCssToPix(i), rendercoordinates.fromLocalCssToPix(j) + f, rendercoordinates.fromLocalCssToPix(i + k), rendercoordinates.fromLocalCssToPix(j + l) + f);
    }

    private void measure(RenderCoordinates rendercoordinates)
    {
        mPopup.setWindowLayoutMode(-2, -2);
        mPopup.getContentView().setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        mPopup.getContentView().measure(android.view.View.MeasureSpec.makeMeasureSpec(rendercoordinates.getLastFrameViewportWidthPixInt(), 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(rendercoordinates.getLastFrameViewportHeightPixInt(), 0x80000000));
    }

    private void setPositionRelativeToAnchor(ContentViewCore contentviewcore, int i, int j, int k, int l)
    {
        RectF rectf = makePixRectInScreen(contentviewcore, i, j, k, l);
        contentviewcore = adjustWindowPosition(contentviewcore, (int)(rectf.centerX() - getAnchorOffset()), (int)rectf.bottom);
        mPopup.update(((Point) (contentviewcore)).x, ((Point) (contentviewcore)).y, mPopup.getWidth(), mPopup.getHeight());
    }

    private static void updateTextViews(ViewGroup viewgroup, String s, String s1)
    {
        ((TextView)viewgroup.findViewById(org.chromium.content.R.id.main_text)).setText(s);
        viewgroup = (TextView)viewgroup.findViewById(org.chromium.content.R.id.sub_text);
        if (!TextUtils.isEmpty(s1))
        {
            viewgroup.setText(s1);
            return;
        } else
        {
            ((ViewGroup)viewgroup.getParent()).removeView(viewgroup);
            return;
        }
    }
}
