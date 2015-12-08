.class public Lcom/roidapp/imagelib/freecrop/FreeCropView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/imagelib/freecrop/a;

.field public b:Z

.field private c:Lcom/roidapp/imagelib/freecrop/l;

.field private d:Lcom/roidapp/imagelib/freecrop/Magnifier;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/graphics/PaintFlagsDrawFilter;

.field private g:I

.field private h:I

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a:Lcom/roidapp/imagelib/freecrop/a;

    .line 31
    iput-boolean v5, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->i:Z

    .line 32
    iput-boolean v5, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->b:Z

    .line 37
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 39
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/graphics/Paint;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 41
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 52
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->g:I

    .line 53
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->h:I

    .line 55
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x3

    invoke-direct {v0, v5, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->f:Landroid/graphics/PaintFlagsDrawFilter;

    .line 56
    return-void

    .line 47
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/UnsupportedOperationException;->printStackTrace()V

    goto :goto_0

    .line 48
    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_0

    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method private static a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 85
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 86
    aput p0, v0, v2

    .line 87
    aput p1, v0, v3

    .line 88
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 89
    new-instance v1, Landroid/graphics/PointF;

    aget v2, v0, v2

    aget v0, v0, v3

    invoke-direct {v1, v2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v1
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 6

    .prologue
    const/16 v5, 0xa

    const/4 v4, -0x1

    const/4 v3, 0x0

    .line 167
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    instance-of v0, v0, Lcom/roidapp/imagelib/freecrop/n;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2, v3, v3}, Lcom/roidapp/imagelib/freecrop/l;->a(FFFF)Z

    .line 192
    :goto_0
    return-void

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2, v3, v3}, Lcom/roidapp/imagelib/freecrop/l;->a(FFFF)Z

    .line 172
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a()I

    move-result v0

    .line 174
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 176
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    int-to-float v3, v0

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    int-to-float v3, v0

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    .line 177
    const/16 v2, 0xb

    invoke-virtual {v1, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 178
    invoke-virtual {v1, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 179
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->g:I

    sub-int/2addr v3, v0

    int-to-float v3, v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_2

    .line 182
    const/16 v0, 0x9

    invoke-virtual {v1, v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 183
    invoke-virtual {v1, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 184
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/l;->i()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 188
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a(Landroid/graphics/PointF;)V

    .line 189
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    check-cast v0, Lcom/roidapp/imagelib/freecrop/d;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/d;->b()Lcom/roidapp/imagelib/freecrop/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a(Lcom/roidapp/imagelib/freecrop/c;)V

    .line 190
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->invalidate()V

    goto/16 :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->i:Z

    .line 70
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/freecrop/Magnifier;Landroid/widget/RelativeLayout;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    .line 65
    iput-object p2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->e:Landroid/widget/RelativeLayout;

    .line 66
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/freecrop/l;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    .line 61
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 223
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 224
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->f:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 227
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/roidapp/imagelib/freecrop/l;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Z)V

    .line 229
    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 74
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 75
    if-eq p2, p4, :cond_0

    .line 77
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 78
    aput v2, v0, v2

    .line 79
    const/4 v1, 0x1

    aput v2, v0, v1

    .line 80
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->getLocationOnScreen([I)V

    .line 82
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 94
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    if-nez v2, :cond_1

    .line 145
    :cond_0
    :goto_0
    return v0

    .line 96
    :cond_1
    iget-boolean v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->i:Z

    if-nez v2, :cond_0

    .line 99
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 144
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->invalidate()V

    move v0, v1

    .line 145
    goto :goto_0

    .line 101
    :pswitch_0
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    instance-of v2, v2, Lcom/roidapp/imagelib/freecrop/n;

    if-eqz v2, :cond_3

    .line 102
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/freecrop/l;->a(FF)Z

    move-result v0

    goto :goto_0

    .line 104
    :cond_3
    iget-boolean v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->b:Z

    if-nez v2, :cond_4

    .line 105
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->b:Z

    .line 106
    :cond_4
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/freecrop/l;->a(FF)Z

    .line 108
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    check-cast v0, Lcom/roidapp/imagelib/freecrop/d;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/d;->b()Lcom/roidapp/imagelib/freecrop/c;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a(Lcom/roidapp/imagelib/freecrop/c;)V

    .line 109
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/freecrop/l;->i()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 110
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a(Landroid/graphics/PointF;)V

    .line 111
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    check-cast v0, Lcom/roidapp/imagelib/freecrop/d;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/d;->a()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a(Z)V

    .line 112
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->invalidate()V

    goto :goto_1

    .line 117
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    instance-of v0, v0, Lcom/roidapp/imagelib/freecrop/n;

    if-eqz v0, :cond_5

    .line 118
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/l;->d()Z

    goto :goto_1

    .line 120
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/l;->d()Z

    .line 121
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    check-cast v0, Lcom/roidapp/imagelib/freecrop/d;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/d;->a()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->a(Z)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->d:Lcom/roidapp/imagelib/freecrop/Magnifier;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->invalidate()V

    goto/16 :goto_1

    .line 126
    :pswitch_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x5

    if-gt v2, v3, :cond_6

    .line 127
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/freecrop/l;->a(Z)V

    .line 128
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1149
    :cond_6
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v2

    .line 130
    packed-switch v2, :pswitch_data_1

    goto/16 :goto_1

    .line 132
    :pswitch_3
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/freecrop/l;->a(Z)V

    .line 133
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/freecrop/FreeCropView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 136
    :pswitch_4
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/freecrop/l;->a(Z)V

    .line 1161
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    instance-of v2, v2, Lcom/roidapp/imagelib/freecrop/n;

    if-eqz v2, :cond_2

    .line 1162
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/FreeCropView;->c:Lcom/roidapp/imagelib/freecrop/l;

    .line 2153
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 2157
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 3153
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v4

    .line 3157
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v5

    .line 1162
    invoke-virtual {v2, v3, v0, v4, v5}, Lcom/roidapp/imagelib/freecrop/l;->a(FFFF)Z

    goto/16 :goto_1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 130
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
