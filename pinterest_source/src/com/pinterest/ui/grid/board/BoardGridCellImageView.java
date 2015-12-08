// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.api.model.Board;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.grid.CachableRoundedBitmap;
import java.util.ArrayList;
import java.util.List;

public class BoardGridCellImageView extends View
{

    private static final int NUM_SUB_IMAGES = 3;
    private static int PRIMARY_COLORS[] = Resources.intArray(0x7f08003c);
    private Board _board;
    private List _cellImgs;
    private Drawable _countBackground;
    private TextPaint _countPaint;
    private CachableRoundedBitmap _coverImg;
    private RectF _coverRect;
    private int _iconPadding;
    private int _iconSize;
    private Paint _outlinePaint;
    private int _primaryColor;
    private Rect _textBounds;
    private int _textPadding;
    private String numPinsText;

    public BoardGridCellImageView(Context context)
    {
        this(context, null);
    }

    public BoardGridCellImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BoardGridCellImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _textBounds = new Rect();
        _textPadding = Constants.MARGIN_HALF;
        init();
    }

    private void drawCounts(Canvas canvas)
    {
        if (numPinsText != null && _textBounds != null)
        {
            int i = _textPadding + _iconPadding;
            int j = (int)(_coverRect.height() - (float)_textPadding - (float)_iconPadding);
            int k = _textBounds.height();
            int l = _textBounds.width();
            _countBackground.setBounds(i - _textPadding, j - k - _textPadding, l + i + _textPadding, _textPadding + j);
            _countBackground.draw(canvas);
            canvas.drawText(numPinsText, i, j - _iconPadding / 2, _countPaint);
        }
    }

    private void drawCover(Canvas canvas)
    {
        _coverImg.draw(canvas, _coverRect.left, _coverRect.top, _coverRect.width(), _coverRect.height());
        canvas.drawRoundRect(_coverRect, Constants.CORNER_RADIUS, Constants.CORNER_RADIUS, _outlinePaint);
    }

    private void drawIcons(Canvas canvas)
    {
        for (int i = 0; i < _cellImgs.size(); i++)
        {
            CachableRoundedBitmap cachableroundedbitmap = (CachableRoundedBitmap)_cellImgs.get(i);
            float f = (_iconSize + _iconPadding) * i;
            float f1 = _coverRect.height();
            cachableroundedbitmap.draw(canvas, f, (float)_iconPadding + f1, _iconSize, _iconSize);
        }

    }

    private void ensurePrimaryColor()
    {
        int i;
        if (_board == null)
        {
            i = hashCode();
        } else
        {
            i = (new StringBuilder()).append(String.valueOf(_board.getName())).append(_board.getPinCountDisplay()).toString().hashCode();
        }
        i = Math.abs(i % PRIMARY_COLORS.length);
        _primaryColor = PRIMARY_COLORS[i];
    }

    private void init()
    {
        _coverRect = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        _coverImg = new CachableRoundedBitmap(this);
        _cellImgs = new ArrayList();
        for (int i = 0; i < 3; i++)
        {
            _cellImgs.add(new CachableRoundedBitmap(this));
        }

        _iconPadding = (int)Resources.dimension(0x7f0a0043);
        _countPaint = new TextPaint(1);
        _countPaint.setColor(-1);
        _countPaint.setTextSize(Resources.dimension(0x7f0a01d9));
        _countPaint.setStyle(android.graphics.Paint.Style.FILL);
        _countPaint.setTypeface(Typeface.DEFAULT);
        _countPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        _countBackground = Resources.drawable(0x7f020046);
        _outlinePaint = new Paint(1);
        _outlinePaint.setStrokeWidth(Resources.dimension(0x7f0a0134));
        _outlinePaint.setColor(Colors.setAlpha(Colors.BLACK, 0.15F));
        _outlinePaint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    private void loadImages()
    {
        ImageCache.loadImage(_coverImg, _board.getImageCoverUrl());
        List list = _board.getImageThumbnailsList();
        int i = 0;
        while (i < _cellImgs.size()) 
        {
            CachableRoundedBitmap cachableroundedbitmap = (CachableRoundedBitmap)_cellImgs.get(i);
            if (i < list.size())
            {
                ImageCache.loadImage(cachableroundedbitmap, (String)list.get(i));
            } else
            {
                cachableroundedbitmap.setUrl("");
                cachableroundedbitmap.setBitmap(null, true);
            }
            i++;
        }
    }

    private void setText()
    {
        if (_board != null && _board.getPinCount() != null && _board.getPinCount().intValue() >= 0)
        {
            numPinsText = Resources.stringPlural(0x7f090016, _board.getPinCount());
            _countPaint.getTextBounds(numPinsText, 0, numPinsText.length(), _textBounds);
        }
    }

    public Board getBoard()
    {
        return _board;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        drawCover(canvas);
        drawIcons(canvas);
        drawCounts(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        _coverRect.right = k;
        _coverRect.bottom = (int)((double)k * 0.75D);
        int l = (int)(0.0F + _coverRect.height());
        int i1 = _iconPadding;
        _iconSize = (k - _iconPadding * 3) / 3;
        int j1 = _iconSize;
        super.onMeasure(i, j);
        setMeasuredDimension(k, l + i1 + j1);
    }

    public void prepareForReuse()
    {
        ImageCache.clean(_coverImg);
        _coverImg.setBitmap(null, false);
        _coverImg.setUrl(null);
        for (int i = 0; i < _cellImgs.size(); i++)
        {
            CachableRoundedBitmap cachableroundedbitmap = (CachableRoundedBitmap)_cellImgs.get(i);
            ImageCache.clean(cachableroundedbitmap);
            cachableroundedbitmap.setBitmap(null, false);
            cachableroundedbitmap.setUrl(null);
        }

        invalidate();
    }

    public void setBoard(Board board, boolean flag)
    {
        boolean flag1;
        if (_board != null && _board.equals(board))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        _board = board;
        if (board != null && !flag && !flag1)
        {
            ensurePrimaryColor();
            setText();
            prepareForReuse();
            loadImages();
        }
    }

    public void usePrimaryColors(boolean flag)
    {
        int i = Colors.BG_GRID;
        if (flag)
        {
            i = _primaryColor;
        }
        _coverImg.setBackgroundColor(i);
        int l = _cellImgs.size();
        int j = 0;
        while (j < l) 
        {
            float f = j + 1;
            CachableRoundedBitmap cachableroundedbitmap = (CachableRoundedBitmap)_cellImgs.get(l - j - 1);
            int k;
            if (flag)
            {
                k = Colors.setAlpha(i, f * 0.2F);
            } else
            {
                k = i;
            }
            cachableroundedbitmap.setBackgroundColor(k);
            j++;
        }
    }

}
