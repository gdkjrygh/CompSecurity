// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

// Referenced classes of package yuku.ambilwarna:
//            AmbilWarnaSquare

public class AmbilWarnaDialog
{
    public static interface OnAmbilWarnaListener
    {

        public abstract void onCancel(AmbilWarnaDialog ambilwarnadialog);

        public abstract void onOk(AmbilWarnaDialog ambilwarnadialog, int i);
    }


    int alpha;
    final float currentColorHsv[];
    final AlertDialog dialog;
    final OnAmbilWarnaListener listener;
    private final boolean supportsAlpha;
    final ImageView viewAlphaCheckered;
    final ImageView viewAlphaCursor;
    final View viewAlphaOverlay;
    final ViewGroup viewContainer;
    final ImageView viewCursor;
    final View viewHue;
    final View viewNewColor;
    final View viewOldColor;
    final AmbilWarnaSquare viewSatVal;
    final ImageView viewTarget;

    public AmbilWarnaDialog(Context context, int i, OnAmbilWarnaListener onambilwarnalistener)
    {
        this(context, i, false, onambilwarnalistener);
    }

    public AmbilWarnaDialog(Context context, int i, boolean flag, final OnAmbilWarnaListener view)
    {
        byte byte0 = 8;
        super();
        currentColorHsv = new float[3];
        supportsAlpha = flag;
        listener = view;
        int j = i;
        if (!flag)
        {
            j = i | 0xff000000;
        }
        Color.colorToHSV(j, currentColorHsv);
        alpha = Color.alpha(j);
        view = LayoutInflater.from(context).inflate(R.layout.ambilwarna_dialog, null);
        viewHue = view.findViewById(R.id.ambilwarna_viewHue);
        viewSatVal = (AmbilWarnaSquare)view.findViewById(R.id.ambilwarna_viewSatBri);
        viewCursor = (ImageView)view.findViewById(R.id.ambilwarna_cursor);
        viewOldColor = view.findViewById(R.id.ambilwarna_oldColor);
        viewNewColor = view.findViewById(R.id.ambilwarna_newColor);
        viewTarget = (ImageView)view.findViewById(R.id.ambilwarna_target);
        viewContainer = (ViewGroup)view.findViewById(R.id.ambilwarna_viewContainer);
        viewAlphaOverlay = view.findViewById(R.id.ambilwarna_overlay);
        viewAlphaCursor = (ImageView)view.findViewById(R.id.ambilwarna_alphaCursor);
        viewAlphaCheckered = (ImageView)view.findViewById(R.id.ambilwarna_alphaCheckered);
        Object obj = viewAlphaOverlay;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = viewAlphaCursor;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        obj = viewAlphaCheckered;
        i = byte0;
        if (flag)
        {
            i = 0;
        }
        ((ImageView) (obj)).setVisibility(i);
        viewSatVal.setHue(getHue());
        viewOldColor.setBackgroundColor(j);
        viewNewColor.setBackgroundColor(j);
        viewHue.setOnTouchListener(new android.view.View.OnTouchListener() {

            final AmbilWarnaDialog this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 2 || motionevent.getAction() == 0 || motionevent.getAction() == 1)
                {
                    float f1 = motionevent.getY();
                    float f = f1;
                    if (f1 < 0.0F)
                    {
                        f = 0.0F;
                    }
                    f1 = f;
                    if (f > (float)viewHue.getMeasuredHeight())
                    {
                        f1 = (float)viewHue.getMeasuredHeight() - 0.001F;
                    }
                    f1 = 360F - (360F / (float)viewHue.getMeasuredHeight()) * f1;
                    f = f1;
                    if (f1 == 360F)
                    {
                        f = 0.0F;
                    }
                    setHue(f);
                    viewSatVal.setHue(getHue());
                    moveCursor();
                    viewNewColor.setBackgroundColor(getColor());
                    updateAlphaView();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = AmbilWarnaDialog.this;
                super();
            }
        });
        if (flag)
        {
            viewAlphaCheckered.setOnTouchListener(new android.view.View.OnTouchListener() {

                final AmbilWarnaDialog this$0;

                public boolean onTouch(View view1, MotionEvent motionevent)
                {
                    if (motionevent.getAction() == 2 || motionevent.getAction() == 0 || motionevent.getAction() == 1)
                    {
                        float f1 = motionevent.getY();
                        float f = f1;
                        if (f1 < 0.0F)
                        {
                            f = 0.0F;
                        }
                        f1 = f;
                        if (f > (float)viewAlphaCheckered.getMeasuredHeight())
                        {
                            f1 = (float)viewAlphaCheckered.getMeasuredHeight() - 0.001F;
                        }
                        int k = Math.round(255F - (255F / (float)viewAlphaCheckered.getMeasuredHeight()) * f1);
                        setAlpha(k);
                        moveAlphaCursor();
                        int l = getColor();
                        viewNewColor.setBackgroundColor(k << 24 | 0xffffff & l);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = AmbilWarnaDialog.this;
                super();
            }
            });
        }
        viewSatVal.setOnTouchListener(new android.view.View.OnTouchListener() {

            final AmbilWarnaDialog this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 2 || motionevent.getAction() == 0 || motionevent.getAction() == 1)
                {
                    float f1 = motionevent.getX();
                    float f2 = motionevent.getY();
                    float f = f1;
                    if (f1 < 0.0F)
                    {
                        f = 0.0F;
                    }
                    f1 = f;
                    if (f > (float)viewSatVal.getMeasuredWidth())
                    {
                        f1 = viewSatVal.getMeasuredWidth();
                    }
                    f = f2;
                    if (f2 < 0.0F)
                    {
                        f = 0.0F;
                    }
                    f2 = f;
                    if (f > (float)viewSatVal.getMeasuredHeight())
                    {
                        f2 = viewSatVal.getMeasuredHeight();
                    }
                    setSat((1.0F / (float)viewSatVal.getMeasuredWidth()) * f1);
                    setVal(1.0F - (1.0F / (float)viewSatVal.getMeasuredHeight()) * f2);
                    moveTarget();
                    viewNewColor.setBackgroundColor(getColor());
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = AmbilWarnaDialog.this;
                super();
            }
        });
        dialog = (new android.app.AlertDialog.Builder(context)).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final AmbilWarnaDialog this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                if (listener != null)
                {
                    listener.onOk(AmbilWarnaDialog.this, getColor());
                }
            }

            
            {
                this$0 = AmbilWarnaDialog.this;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final AmbilWarnaDialog this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                if (listener != null)
                {
                    listener.onCancel(AmbilWarnaDialog.this);
                }
            }

            
            {
                this$0 = AmbilWarnaDialog.this;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final AmbilWarnaDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                if (listener != null)
                {
                    listener.onCancel(AmbilWarnaDialog.this);
                }
            }

            
            {
                this$0 = AmbilWarnaDialog.this;
                super();
            }
        }).create();
        dialog.setView(view, 0, 0, 0, 0);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final AmbilWarnaDialog this$0;
            private final View val$view;

            public void onGlobalLayout()
            {
                moveCursor();
                if (supportsAlpha)
                {
                    moveAlphaCursor();
                }
                moveTarget();
                if (supportsAlpha)
                {
                    updateAlphaView();
                }
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }

            
            {
                this$0 = AmbilWarnaDialog.this;
                view = view1;
                super();
            }
        });
    }

    private float getAlpha()
    {
        return (float)alpha;
    }

    private int getColor()
    {
        int i = Color.HSVToColor(currentColorHsv);
        return alpha << 24 | 0xffffff & i;
    }

    private float getHue()
    {
        return currentColorHsv[0];
    }

    private float getSat()
    {
        return currentColorHsv[1];
    }

    private float getVal()
    {
        return currentColorHsv[2];
    }

    private void setAlpha(int i)
    {
        alpha = i;
    }

    private void setHue(float f)
    {
        currentColorHsv[0] = f;
    }

    private void setSat(float f)
    {
        currentColorHsv[1] = f;
    }

    private void setVal(float f)
    {
        currentColorHsv[2] = f;
    }

    private void updateAlphaView()
    {
        Object obj = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
        int ai[] = new int[2];
        ai[0] = Color.HSVToColor(currentColorHsv);
        obj = new GradientDrawable(((android.graphics.drawable.GradientDrawable.Orientation) (obj)), ai);
        viewAlphaOverlay.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
    }

    public AlertDialog getDialog()
    {
        return dialog;
    }

    protected void moveAlphaCursor()
    {
        int i = viewAlphaCheckered.getMeasuredHeight();
        float f = i;
        float f1 = (getAlpha() * (float)i) / 255F;
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)viewAlphaCursor.getLayoutParams();
        layoutparams.leftMargin = (int)((double)viewAlphaCheckered.getLeft() - Math.floor(viewAlphaCursor.getMeasuredWidth() / 2) - (double)viewContainer.getPaddingLeft());
        layoutparams.topMargin = (int)((double)((float)viewAlphaCheckered.getTop() + (f - f1)) - Math.floor(viewAlphaCursor.getMeasuredHeight() / 2) - (double)viewContainer.getPaddingTop());
        viewAlphaCursor.setLayoutParams(layoutparams);
    }

    protected void moveCursor()
    {
        float f1 = (float)viewHue.getMeasuredHeight() - (getHue() * (float)viewHue.getMeasuredHeight()) / 360F;
        float f = f1;
        if (f1 == (float)viewHue.getMeasuredHeight())
        {
            f = 0.0F;
        }
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)viewCursor.getLayoutParams();
        layoutparams.leftMargin = (int)((double)viewHue.getLeft() - Math.floor(viewCursor.getMeasuredWidth() / 2) - (double)viewContainer.getPaddingLeft());
        layoutparams.topMargin = (int)((double)((float)viewHue.getTop() + f) - Math.floor(viewCursor.getMeasuredHeight() / 2) - (double)viewContainer.getPaddingTop());
        viewCursor.setLayoutParams(layoutparams);
    }

    protected void moveTarget()
    {
        float f = getSat();
        float f1 = viewSatVal.getMeasuredWidth();
        float f2 = getVal();
        float f3 = viewSatVal.getMeasuredHeight();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)viewTarget.getLayoutParams();
        layoutparams.leftMargin = (int)((double)((float)viewSatVal.getLeft() + f * f1) - Math.floor(viewTarget.getMeasuredWidth() / 2) - (double)viewContainer.getPaddingLeft());
        layoutparams.topMargin = (int)((double)((float)viewSatVal.getTop() + (1.0F - f2) * f3) - Math.floor(viewTarget.getMeasuredHeight() / 2) - (double)viewContainer.getPaddingTop());
        viewTarget.setLayoutParams(layoutparams);
    }

    public void show()
    {
        dialog.show();
    }








}
