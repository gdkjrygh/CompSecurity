// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package group.pals.android.lib.ui.lockpattern.widget:
//            LockPatternUtils

public class LockPatternView extends View
{
    public static class Cell
    {

        static Cell sCells[][];
        int column;
        int row;

        private static void checkRange(int i, int j)
        {
            if (i < 0 || i > 2)
            {
                throw new IllegalArgumentException("row must be in range 0-2");
            }
            if (j < 0 || j > 2)
            {
                throw new IllegalArgumentException("column must be in range 0-2");
            } else
            {
                return;
            }
        }

        public static Cell of(int i, int j)
        {
            group/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
            JVM INSTR monitorenter ;
            Cell cell;
            checkRange(i, j);
            cell = sCells[i][j];
            group/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;
            JVM INSTR monitorexit ;
            return cell;
            Exception exception;
            exception;
            throw exception;
        }

        public int getColumn()
        {
            return column;
        }

        public int getRow()
        {
            return row;
        }

        public String toString()
        {
            return (new StringBuilder()).append("(row=").append(row).append(",clmn=").append(column).append(")").toString();
        }

        static 
        {
            sCells = (Cell[][])Array.newInstance(group/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell, new int[] {
                3, 3
            });
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    sCells[i][j] = new Cell(i, j);
                }

            }

        }

        private Cell(int i, int j)
        {
            checkRange(i, j);
            row = i;
            column = j;
        }
    }

    public static final class DisplayMode extends Enum
    {

        private static final DisplayMode $VALUES[];
        public static final DisplayMode Animate;
        public static final DisplayMode Correct;
        public static final DisplayMode Wrong;

        public static DisplayMode valueOf(String s)
        {
            return (DisplayMode)Enum.valueOf(group/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode, s);
        }

        public static DisplayMode[] values()
        {
            return (DisplayMode[])$VALUES.clone();
        }

        static 
        {
            Correct = new DisplayMode("Correct", 0);
            Animate = new DisplayMode("Animate", 1);
            Wrong = new DisplayMode("Wrong", 2);
            $VALUES = (new DisplayMode[] {
                Correct, Animate, Wrong
            });
        }

        private DisplayMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface OnPatternListener
    {

        public abstract void onPatternCellAdded(List list);

        public abstract void onPatternCleared();

        public abstract void onPatternDetected(List list);

        public abstract void onPatternStart();
    }

    private static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final int mDisplayMode;
        private final boolean mInStealthMode;
        private final boolean mInputEnabled;
        private final String mSerializedPattern;
        private final boolean mTactileFeedbackEnabled;

        public int getDisplayMode()
        {
            return mDisplayMode;
        }

        public String getSerializedPattern()
        {
            return mSerializedPattern;
        }

        public boolean isInStealthMode()
        {
            return mInStealthMode;
        }

        public boolean isInputEnabled()
        {
            return mInputEnabled;
        }

        public boolean isTactileFeedbackEnabled()
        {
            return mTactileFeedbackEnabled;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(mSerializedPattern);
            parcel.writeInt(mDisplayMode);
            parcel.writeValue(Boolean.valueOf(mInputEnabled));
            parcel.writeValue(Boolean.valueOf(mInStealthMode));
            parcel.writeValue(Boolean.valueOf(mTactileFeedbackEnabled));
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            mSerializedPattern = parcel.readString();
            mDisplayMode = parcel.readInt();
            mInputEnabled = ((Boolean)parcel.readValue(null)).booleanValue();
            mInStealthMode = ((Boolean)parcel.readValue(null)).booleanValue();
            mTactileFeedbackEnabled = ((Boolean)parcel.readValue(null)).booleanValue();
        }


        private SavedState(Parcelable parcelable, String s, int i, boolean flag, boolean flag1, boolean flag2)
        {
            super(parcelable);
            mSerializedPattern = s;
            mDisplayMode = i;
            mInputEnabled = flag;
            mInStealthMode = flag1;
            mTactileFeedbackEnabled = flag2;
        }

    }


    private static final int ASPECT_LOCK_HEIGHT = 2;
    private static final int ASPECT_LOCK_WIDTH = 1;
    private static final int ASPECT_SQUARE = 0;
    private static final int MILLIS_PER_CIRCLE_ANIMATING = 700;
    private static final boolean PROFILE_DRAWING = false;
    static final int STATUS_BAR_HEIGHT = 25;
    private AccessibilityManager accessibilityManager;
    private long mAnimatingPeriodStart;
    private final Matrix mArrowMatrix;
    private int mAspect;
    private Bitmap mBitmapArrowGreenUp;
    private Bitmap mBitmapArrowRedUp;
    private Bitmap mBitmapBtnDefault;
    private Bitmap mBitmapBtnTouched;
    private Bitmap mBitmapCircleDefault;
    private Bitmap mBitmapCircleGreen;
    private Bitmap mBitmapCircleRed;
    private int mBitmapHeight;
    private int mBitmapWidth;
    private final Matrix mCircleMatrix;
    private final Context mContext;
    private final Path mCurrentPath;
    private float mDiameterFactor;
    private boolean mDrawingProfilingStarted;
    private boolean mEnableHapticFeedback;
    private final int mErrorLineColor;
    private float mHitFactor;
    private float mInProgressX;
    private float mInProgressY;
    private boolean mInStealthMode;
    private boolean mInputEnabled;
    private final Rect mInvalidate;
    private final int mLineColor;
    private OnPatternListener mOnPatternListener;
    private final int mPadding;
    private final int mPaddingBottom;
    private final int mPaddingLeft;
    private final int mPaddingRight;
    private final int mPaddingTop;
    private Paint mPaint;
    private Paint mPathPaint;
    private ArrayList mPattern;
    private DisplayMode mPatternDisplayMode;
    private boolean mPatternDrawLookup[][];
    private boolean mPatternInProgress;
    private float mSquareHeight;
    private float mSquareWidth;
    private final int mStrokeAlpha;

    public LockPatternView(Context context)
    {
        this(context, null);
    }

    public LockPatternView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mDrawingProfilingStarted = false;
        mPaint = new Paint();
        mPathPaint = new Paint();
        mPattern = new ArrayList(9);
        mPatternDrawLookup = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
            3, 3
        });
        mInProgressX = -1F;
        mInProgressY = -1F;
        mPatternDisplayMode = DisplayMode.Correct;
        mInputEnabled = true;
        mInStealthMode = false;
        mEnableHapticFeedback = true;
        mPatternInProgress = false;
        mLineColor = Color.rgb(135, 186, 231);
        mErrorLineColor = Color.rgb(207, 65, 73);
        mDiameterFactor = 0.4F;
        mStrokeAlpha = 255;
        mHitFactor = 0.6F;
        mCurrentPath = new Path();
        mInvalidate = new Rect();
        mArrowMatrix = new Matrix();
        mCircleMatrix = new Matrix();
        mPadding = 0;
        mPaddingLeft = 0;
        mPaddingRight = 0;
        mPaddingTop = 0;
        mPaddingBottom = 0;
        mContext = context;
        int j;
        if ("square".equals(""))
        {
            mAspect = 0;
        } else
        if ("lock_width".equals(""))
        {
            mAspect = 1;
        } else
        if ("lock_height".equals(""))
        {
            mAspect = 2;
        } else
        {
            mAspect = 0;
        }
        setClickable(true);
        mPathPaint.setAntiAlias(true);
        mPathPaint.setDither(true);
        mPathPaint.setColor(mLineColor);
        mPathPaint.setAlpha(255);
        mPathPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mPathPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        mPathPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        mBitmapBtnDefault = getBitmapFor(group.pals.android.lib.ui.lockpattern.R.drawable.alp_btn_code_lock_default_holo);
        mBitmapBtnTouched = getBitmapFor(group.pals.android.lib.ui.lockpattern.R.drawable.alp_btn_code_lock_touched_holo);
        mBitmapCircleDefault = getBitmapFor(group.pals.android.lib.ui.lockpattern.R.drawable.alp_indicator_code_lock_point_area_default_holo);
        mBitmapCircleGreen = getBitmapFor(group.pals.android.lib.ui.lockpattern.R.drawable.alp_indicator_code_lock_point_area_green_holo);
        mBitmapCircleRed = getBitmapFor(group.pals.android.lib.ui.lockpattern.R.drawable.alp_indicator_code_lock_point_area_red_holo);
        mBitmapArrowGreenUp = getBitmapFor(group.pals.android.lib.ui.lockpattern.R.drawable.alp_indicator_code_lock_drag_direction_green_up);
        mBitmapArrowRedUp = getBitmapFor(group.pals.android.lib.ui.lockpattern.R.drawable.alp_indicator_code_lock_drag_direction_red_up);
        context = new Bitmap[5];
        context[0] = mBitmapBtnDefault;
        context[1] = mBitmapBtnTouched;
        context[2] = mBitmapCircleDefault;
        context[3] = mBitmapCircleGreen;
        context[4] = mBitmapCircleRed;
        j = context.length;
        for (int i = 0; i < j; i++)
        {
            attributeset = context[i];
            mBitmapWidth = Math.max(mBitmapWidth, attributeset.getWidth());
            mBitmapHeight = Math.max(mBitmapHeight, attributeset.getHeight());
        }

        accessibilityManager = (AccessibilityManager)mContext.getSystemService("accessibility");
    }

    private void addCellToPattern(Cell cell)
    {
        mPatternDrawLookup[cell.getRow()][cell.getColumn()] = true;
        mPattern.add(cell);
        notifyCellAdded();
    }

    private Cell checkForNewHit(float f, float f1)
    {
        int i = getRowHit(f1);
        int j;
        if (i >= 0)
        {
            if ((j = getColumnHit(f)) >= 0 && !mPatternDrawLookup[i][j])
            {
                return Cell.of(i, j);
            }
        }
        return null;
    }

    private void clearPatternDrawLookup()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                mPatternDrawLookup[i][j] = false;
            }

        }

    }

    private Cell detectAndAddHit(float f, float f1)
    {
        byte byte0 = -1;
        Cell cell1 = checkForNewHit(f, f1);
        if (cell1 != null)
        {
            Cell cell = null;
            ArrayList arraylist = mPattern;
            if (!arraylist.isEmpty())
            {
                cell = (Cell)arraylist.get(arraylist.size() - 1);
                int j1 = cell1.row - cell.row;
                int i1 = cell1.column - cell.column;
                int j = cell.row;
                int l = cell.column;
                int i = j;
                if (Math.abs(j1) == 2)
                {
                    i = j;
                    if (Math.abs(i1) != 1)
                    {
                        int k = cell.row;
                        if (j1 > 0)
                        {
                            i = 1;
                        } else
                        {
                            i = -1;
                        }
                        i = k + i;
                    }
                }
                k = l;
                if (Math.abs(i1) == 2)
                {
                    k = l;
                    if (Math.abs(j1) != 1)
                    {
                        l = cell.column;
                        k = byte0;
                        if (i1 > 0)
                        {
                            k = 1;
                        }
                        k = l + k;
                    }
                }
                cell = Cell.of(i, k);
            }
            if (cell != null && !mPatternDrawLookup[cell.row][cell.column])
            {
                addCellToPattern(cell);
            }
            addCellToPattern(cell1);
            if (mEnableHapticFeedback)
            {
                performHapticFeedback(1, 3);
            }
            return cell1;
        } else
        {
            return null;
        }
    }

    private void drawArrow(Canvas canvas, float f, float f1, Cell cell, Cell cell1)
    {
        float f2;
        float f3;
        float f4;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (mPatternDisplayMode != DisplayMode.Wrong)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = cell1.row;
        k = cell.row;
        l = cell1.column;
        i1 = cell.column;
        j1 = ((int)mSquareWidth - mBitmapWidth) / 2;
        k1 = ((int)mSquareHeight - mBitmapHeight) / 2;
        if (i != 0)
        {
            cell = mBitmapArrowGreenUp;
        } else
        {
            cell = mBitmapArrowRedUp;
        }
        i = mBitmapWidth;
        l1 = mBitmapHeight;
        f2 = (float)Math.toDegrees((float)Math.atan2(j - k, l - i1));
        f3 = Math.min(mSquareWidth / (float)mBitmapWidth, 1.0F);
        f4 = Math.min(mSquareHeight / (float)mBitmapHeight, 1.0F);
        mArrowMatrix.setTranslate((float)j1 + f, (float)k1 + f1);
        mArrowMatrix.preTranslate(mBitmapWidth / 2, mBitmapHeight / 2);
        mArrowMatrix.preScale(f3, f4);
        mArrowMatrix.preTranslate(-mBitmapWidth / 2, -mBitmapHeight / 2);
        mArrowMatrix.preRotate(f2 + 90F, (float)i / 2.0F, (float)l1 / 2.0F);
        mArrowMatrix.preTranslate((float)(i - cell.getWidth()) / 2.0F, 0.0F);
        canvas.drawBitmap(cell, mArrowMatrix, mPaint);
    }

    private void drawCircle(Canvas canvas, int i, int j, boolean flag)
    {
        float f;
        float f1;
        Bitmap bitmap;
        Bitmap bitmap1;
        int k;
        int l;
        if (!flag || mInStealthMode && mPatternDisplayMode != DisplayMode.Wrong)
        {
            bitmap1 = mBitmapCircleDefault;
            bitmap = mBitmapBtnDefault;
        } else
        if (mPatternInProgress)
        {
            bitmap1 = mBitmapCircleGreen;
            bitmap = mBitmapBtnTouched;
        } else
        if (mPatternDisplayMode == DisplayMode.Wrong)
        {
            bitmap1 = mBitmapCircleDefault;
            bitmap = mBitmapCircleRed;
        } else
        if (mPatternDisplayMode == DisplayMode.Correct || mPatternDisplayMode == DisplayMode.Animate)
        {
            bitmap1 = mBitmapCircleGreen;
            bitmap = mBitmapBtnTouched;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("unknown display mode ").append(mPatternDisplayMode).toString());
        }
        l = mBitmapWidth;
        k = mBitmapHeight;
        f = mSquareWidth;
        f1 = mSquareHeight;
        l = (int)((f - (float)l) / 2.0F);
        k = (int)((f1 - (float)k) / 2.0F);
        f = Math.min(mSquareWidth / (float)mBitmapWidth, 1.0F);
        f1 = Math.min(mSquareHeight / (float)mBitmapHeight, 1.0F);
        mCircleMatrix.setTranslate(i + l, j + k);
        mCircleMatrix.preTranslate(mBitmapWidth / 2, mBitmapHeight / 2);
        mCircleMatrix.preScale(f, f1);
        mCircleMatrix.preTranslate(-mBitmapWidth / 2, -mBitmapHeight / 2);
        canvas.drawBitmap(bitmap1, mCircleMatrix, mPaint);
        canvas.drawBitmap(bitmap, mCircleMatrix, mPaint);
    }

    private Bitmap getBitmapFor(int i)
    {
        return BitmapFactory.decodeResource(getContext().getResources(), i);
    }

    private float getCenterXForColumn(int i)
    {
        return 0.0F + (float)i * mSquareWidth + mSquareWidth / 2.0F;
    }

    private float getCenterYForRow(int i)
    {
        return 0.0F + (float)i * mSquareHeight + mSquareHeight / 2.0F;
    }

    private int getColumnHit(float f)
    {
        float f1 = mSquareWidth;
        float f2 = f1 * mHitFactor;
        float f3 = (f1 - f2) / 2.0F;
        for (int i = 0; i < 3; i++)
        {
            float f4 = 0.0F + f3 + (float)i * f1;
            if (f >= f4 && f <= f4 + f2)
            {
                return i;
            }
        }

        return -1;
    }

    private int getRowHit(float f)
    {
        float f1 = mSquareHeight;
        float f2 = f1 * mHitFactor;
        float f3 = (f1 - f2) / 2.0F;
        for (int i = 0; i < 3; i++)
        {
            float f4 = 0.0F + f3 + (float)i * f1;
            if (f >= f4 && f <= f4 + f2)
            {
                return i;
            }
        }

        return -1;
    }

    private void handleActionDown(MotionEvent motionevent)
    {
        resetPattern();
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        motionevent = detectAndAddHit(f, f1);
        if (motionevent != null)
        {
            mPatternInProgress = true;
            mPatternDisplayMode = DisplayMode.Correct;
            notifyPatternStarted();
        } else
        {
            mPatternInProgress = false;
            notifyPatternCleared();
        }
        if (motionevent != null)
        {
            float f2 = getCenterXForColumn(((Cell) (motionevent)).column);
            float f3 = getCenterYForRow(((Cell) (motionevent)).row);
            float f4 = mSquareWidth / 2.0F;
            float f5 = mSquareHeight / 2.0F;
            invalidate((int)(f2 - f4), (int)(f3 - f5), (int)(f2 + f4), (int)(f3 + f5));
        }
        mInProgressX = f;
        mInProgressY = f1;
    }

    private void handleActionMove(MotionEvent motionevent)
    {
        int j = motionevent.getHistorySize();
        int i = 0;
        while (i < j + 1) 
        {
            float f2;
            float f3;
            Cell cell;
            int k;
            int l;
            if (i < j)
            {
                f3 = motionevent.getHistoricalX(i);
            } else
            {
                f3 = motionevent.getX();
            }
            if (i < j)
            {
                f2 = motionevent.getHistoricalY(i);
            } else
            {
                f2 = motionevent.getY();
            }
            k = mPattern.size();
            cell = detectAndAddHit(f3, f2);
            l = mPattern.size();
            if (cell != null && l == 1)
            {
                mPatternInProgress = true;
                notifyPatternStarted();
            }
            if (Math.abs(f3 - mInProgressX) + Math.abs(f2 - mInProgressY) > mSquareWidth * 0.01F)
            {
                float f7 = mInProgressX;
                float f4 = mInProgressY;
                mInProgressX = f3;
                mInProgressY = f2;
                if (mPatternInProgress && l > 0)
                {
                    ArrayList arraylist = mPattern;
                    float f11 = mSquareWidth * mDiameterFactor * 0.5F;
                    Object obj = (Cell)arraylist.get(l - 1);
                    float f1 = getCenterXForColumn(((Cell) (obj)).column);
                    float f = getCenterYForRow(((Cell) (obj)).row);
                    obj = mInvalidate;
                    float f8;
                    float f10;
                    if (f1 < f3)
                    {
                        float f9 = f1;
                        f8 = f3;
                        f3 = f9;
                    } else
                    {
                        f8 = f1;
                    }
                    if (f < f2)
                    {
                        f10 = f;
                    } else
                    {
                        f10 = f2;
                        f2 = f;
                    }
                    ((Rect) (obj)).set((int)(f3 - f11), (int)(f10 - f11), (int)(f8 + f11), (int)(f2 + f11));
                    if (f1 < f7)
                    {
                        f2 = f7;
                    } else
                    {
                        f2 = f1;
                        f1 = f7;
                    }
                    if (f < f4)
                    {
                        f3 = f;
                        f = f4;
                    } else
                    {
                        f3 = f4;
                    }
                    ((Rect) (obj)).union((int)(f1 - f11), (int)(f3 - f11), (int)(f2 + f11), (int)(f + f11));
                    if (cell != null)
                    {
                        f1 = getCenterXForColumn(cell.column);
                        f = getCenterYForRow(cell.row);
                        if (l >= 2)
                        {
                            Cell cell1 = (Cell)arraylist.get(l - 1 - (l - k));
                            f2 = getCenterXForColumn(cell1.column);
                            f3 = getCenterYForRow(cell1.row);
                            if (f1 >= f2)
                            {
                                float f5 = f1;
                                f1 = f2;
                                f2 = f5;
                            }
                            if (f < f3)
                            {
                                f4 = f;
                                f = f3;
                                f3 = f4;
                            }
                        } else
                        {
                            f2 = f1;
                            float f6 = f;
                            f3 = f;
                            f = f6;
                        }
                        f4 = mSquareWidth / 2.0F;
                        f7 = mSquareHeight / 2.0F;
                        ((Rect) (obj)).set((int)(f1 - f4), (int)(f3 - f7), (int)(f2 + f4), (int)(f + f7));
                    }
                    invalidate(((Rect) (obj)));
                } else
                {
                    invalidate();
                }
            }
            i++;
        }
    }

    private void handleActionUp(MotionEvent motionevent)
    {
        if (!mPattern.isEmpty())
        {
            mPatternInProgress = false;
            notifyPatternDetected();
            invalidate();
        }
    }

    private void notifyCellAdded()
    {
        Object obj;
        String s;
        if (mOnPatternListener != null)
        {
            mOnPatternListener.onPatternCellAdded(mPattern);
        }
        obj = LockPatternUtils.patternToStringValue(mPattern);
        s = (new StringBuilder()).append("key").append(((String) (obj)).substring(((String) (obj)).length() - 1, ((String) (obj)).length()).toString()).toString();
        break MISSING_BLOCK_LABEL_65;
        if (((Integer)getTag()).intValue() == 1 || ((Integer)getTag()).intValue() != 2);
        if (((Integer)getTag()).intValue() == 2)
        {
            if (accessibilityManager.isEnabled())
            {
                Log.i("isAccessibilityEnabled", "true");
                try
                {
                    MediaPlayer.create(getContext(), ((Integer)group/pals/android/lib/ui/lockpattern/R$raw.getField(s).get(null)).intValue()).start();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("LockPatternView", "IllegalArgumentException in MediaPlayer attempt to play tone for pattern for accessibility");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("LockPatternView", "IllegalAccessException in MediaPlayer attempt to play tone for pattern for accessibility");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("LockPatternView", "NoSuchFieldException in MediaPlayer attempt to play tone for pattern for accessibility");
                }
            }
        } else
        {
            setContentDescription(((String) (obj)).substring(((String) (obj)).length() - 1));
            sendAccessibilityEvent(4);
        }
        invalidate();
        return;
    }

    private void notifyPatternCleared()
    {
        if (mOnPatternListener != null)
        {
            mOnPatternListener.onPatternCleared();
        }
        sendAccessEvent(group.pals.android.lib.ui.lockpattern.R.string.alp_lockscreen_access_pattern_cleared);
    }

    private void notifyPatternDetected()
    {
        if (mOnPatternListener != null)
        {
            mOnPatternListener.onPatternDetected(mPattern);
        }
    }

    private void notifyPatternStarted()
    {
        if (mOnPatternListener != null)
        {
            mOnPatternListener.onPatternStart();
        }
        String s = LockPatternUtils.patternToStringValue(mPattern);
        setContentDescription((new StringBuilder()).append("Pattern started at ").append(s).toString());
        sendAccessibilityEvent(4);
    }

    private void resetPattern()
    {
        mPattern.clear();
        clearPatternDrawLookup();
        mPatternDisplayMode = DisplayMode.Correct;
        invalidate();
    }

    private int resolveMeasured(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        switch (android.view.View.MeasureSpec.getMode(i))
        {
        default:
            return k;

        case 0: // '\0'
            return j;

        case -2147483648: 
            return Math.max(k, j);
        }
    }

    public void clearPattern()
    {
        resetPattern();
    }

    public void disableInput()
    {
        mInputEnabled = false;
    }

    public void enableInput()
    {
        mInputEnabled = true;
    }

    public DisplayMode getDisplayMode()
    {
        return mPatternDisplayMode;
    }

    public List getPattern()
    {
        return (List)mPattern.clone();
    }

    protected int getSuggestedMinimumHeight()
    {
        return mBitmapWidth * 3;
    }

    protected int getSuggestedMinimumWidth()
    {
        return mBitmapWidth * 3;
    }

    public boolean isInStealthMode()
    {
        return mInStealthMode;
    }

    public boolean isTactileFeedbackEnabled()
    {
        return mEnableHapticFeedback;
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        float f3;
        Path path;
        Cell cell2;
        Cell cell3;
        int j;
        int k;
        boolean flag;
        ArrayList arraylist = mPattern;
        int l = arraylist.size();
        boolean aflag[][] = mPatternDrawLookup;
        if (mPatternDisplayMode == DisplayMode.Animate)
        {
            k = (int)(SystemClock.elapsedRealtime() - mAnimatingPeriodStart) % ((l + 1) * 700);
            int i1 = k / 700;
            clearPatternDrawLookup();
            for (int i = 0; i < i1; i++)
            {
                Cell cell = (Cell)arraylist.get(i);
                aflag[cell.getRow()][cell.getColumn()] = true;
            }

            float f5;
            if (i1 > 0 && i1 < l)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                float f = (float)(k % 700) / 700F;
                Cell cell1 = (Cell)arraylist.get(i1 - 1);
                float f2 = getCenterXForColumn(cell1.column);
                float f4 = getCenterYForRow(cell1.row);
                cell1 = (Cell)arraylist.get(i1);
                float f7 = getCenterXForColumn(cell1.column);
                float f9 = getCenterYForRow(cell1.row);
                mInProgressX = f2 + f * (f7 - f2);
                mInProgressY = f4 + f * (f9 - f4);
            }
            invalidate();
        }
        f1 = mSquareWidth;
        f3 = mSquareHeight;
        f5 = mDiameterFactor;
        mPathPaint.setStrokeWidth(f5 * f1 * 0.5F);
        path = mCurrentPath;
        path.rewind();
        if (!mInStealthMode || mPatternDisplayMode == DisplayMode.Wrong)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if ((mPaint.getFlags() & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mPaint.setFilterBitmap(true);
        if (j == 0) goto _L2; else goto _L1
_L1:
        k = 0;
_L12:
        if (k >= l - 1) goto _L2; else goto _L3
_L3:
        cell2 = (Cell)arraylist.get(k);
        cell3 = (Cell)arraylist.get(k + 1);
        if (aflag[cell3.row][cell3.column]) goto _L4; else goto _L2
_L2:
        if (j == 0) goto _L6; else goto _L5
_L5:
        k = 0;
        j = 0;
_L10:
        if (j >= l) goto _L8; else goto _L7
_L7:
        cell2 = (Cell)arraylist.get(j);
        if (aflag[cell2.row][cell2.column]) goto _L9; else goto _L8
_L8:
        if ((mPatternInProgress || mPatternDisplayMode == DisplayMode.Animate) && k != 0)
        {
            path.lineTo(mInProgressX, mInProgressY);
        }
        float f6;
        float f8;
        if (mPatternDisplayMode == DisplayMode.Wrong)
        {
            mPathPaint.setColor(mErrorLineColor);
        } else
        {
            mPathPaint.setColor(mLineColor);
        }
        canvas.drawPath(path, mPathPaint);
          goto _L6
_L4:
        drawArrow(canvas, 0.0F + (float)cell2.column * f1, 0.0F + (float)cell2.row * f3, cell2, cell3);
        k++;
        continue; /* Loop/switch isn't completed */
_L9:
        k = 1;
        f6 = getCenterXForColumn(cell2.column);
        f8 = getCenterYForRow(cell2.row);
        if (j == 0)
        {
            path.moveTo(f6, f8);
        } else
        {
            path.lineTo(f6, f8);
        }
        j++;
          goto _L10
_L6:
        for (j = 0; j < 3; j++)
        {
            f5 = j;
            for (k = 0; k < 3; k++)
            {
                drawCircle(canvas, (int)(0.0F + (float)k * f1), (int)(0.0F + f5 * f3), aflag[j][k]);
            }

        }

        mPaint.setFilterBitmap(flag);
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        k = getSuggestedMinimumWidth();
        int l = getSuggestedMinimumHeight();
        k = resolveMeasured(i, k);
        i = resolveMeasured(j, l);
        mAspect;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 65
    //                   1 76
    //                   2 87;
           goto _L1 _L2 _L3 _L4
_L1:
        j = k;
_L6:
        setMeasuredDimension(j, i);
        return;
_L2:
        i = Math.min(k, i);
        j = i;
        continue; /* Loop/switch isn't completed */
_L3:
        i = Math.min(k, i);
        j = k;
        continue; /* Loop/switch isn't completed */
_L4:
        j = Math.min(k, i);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setPattern(DisplayMode.Correct, LockPatternUtils.stringToPattern(parcelable.getSerializedPattern()));
        mPatternDisplayMode = DisplayMode.values()[parcelable.getDisplayMode()];
        mInputEnabled = parcelable.isInputEnabled();
        mInStealthMode = parcelable.isInStealthMode();
        mEnableHapticFeedback = parcelable.isTactileFeedbackEnabled();
    }

    protected Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), LockPatternUtils.patternToString(mPattern), mPatternDisplayMode.ordinal(), mInputEnabled, mInStealthMode, mEnableHapticFeedback);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        mSquareWidth = (float)(i + 0 + 0) / 3F;
        mSquareHeight = (float)(j + 0 + 0) / 3F;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!mInputEnabled || !isEnabled())
        {
            return false;
        }
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            handleActionDown(motionevent);
            return true;

        case 1: // '\001'
            handleActionUp(motionevent);
            return true;

        case 2: // '\002'
            handleActionMove(motionevent);
            return true;

        case 3: // '\003'
            resetPattern();
            break;
        }
        mPatternInProgress = false;
        notifyPatternCleared();
        return true;
    }

    public void sendAccessEvent(int i)
    {
        setContentDescription(mContext.getString(i));
        sendAccessibilityEvent(4);
        setContentDescription(null);
    }

    public void setDisplayMode(DisplayMode displaymode)
    {
        mPatternDisplayMode = displaymode;
        if (displaymode == DisplayMode.Animate)
        {
            if (mPattern.size() == 0)
            {
                throw new IllegalStateException("you must have a pattern to animate if you want to set the display mode to animate");
            }
            mAnimatingPeriodStart = SystemClock.elapsedRealtime();
            displaymode = (Cell)mPattern.get(0);
            mInProgressX = getCenterXForColumn(displaymode.getColumn());
            mInProgressY = getCenterYForRow(displaymode.getRow());
            clearPatternDrawLookup();
        }
        invalidate();
    }

    public void setInStealthMode(boolean flag)
    {
        mInStealthMode = flag;
    }

    public void setOnPatternListener(OnPatternListener onpatternlistener)
    {
        mOnPatternListener = onpatternlistener;
    }

    public void setPattern(DisplayMode displaymode, List list)
    {
        mPattern.clear();
        mPattern.addAll(list);
        clearPatternDrawLookup();
        for (list = list.iterator(); list.hasNext();)
        {
            Cell cell = (Cell)list.next();
            mPatternDrawLookup[cell.getRow()][cell.getColumn()] = true;
        }

        setDisplayMode(displaymode);
    }

    public void setTactileFeedbackEnabled(boolean flag)
    {
        mEnableHapticFeedback = flag;
    }
}
