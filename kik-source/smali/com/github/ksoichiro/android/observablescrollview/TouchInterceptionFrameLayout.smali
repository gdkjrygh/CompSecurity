.class public Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Landroid/graphics/PointF;

.field private f:Landroid/view/MotionEvent;

.field private g:Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 91
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 94
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 95
    return-void
.end method

.method private varargs a(Landroid/view/MotionEvent;[Landroid/view/MotionEvent;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 254
    if-nez p1, :cond_1

    .line 285
    :cond_0
    return-void

    .line 257
    :cond_1
    invoke-virtual {p0}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_0
    if-ltz v3, :cond_0

    .line 258
    invoke-virtual {p0, v3}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 259
    if-eqz v4, :cond_4

    .line 260
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 261
    invoke-virtual {v4, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 262
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v5

    .line 263
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v0, v1, v6}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 264
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v0

    neg-int v0, v0

    int-to-float v6, v0

    .line 267
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v0

    neg-int v0, v0

    int-to-float v7, v0

    .line 269
    array-length v8, p2

    move v1, v2

    move v0, v2

    :goto_1
    if-ge v1, v8, :cond_3

    aget-object v9, p2, v1

    .line 271
    if-eqz v9, :cond_2

    .line 272
    invoke-static {v9}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v9

    .line 273
    invoke-virtual {v9, v6, v7}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 274
    invoke-virtual {v4, v9}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v9

    or-int/2addr v0, v9

    .line 270
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 278
    :cond_3
    invoke-virtual {v5, v6, v7}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 279
    invoke-virtual {v4, v5}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 280
    if-nez v0, :cond_0

    .line 281
    :cond_4
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_0
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 108
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->g:Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;

    if-nez v1, :cond_0

    .line 137
    :goto_0
    return v0

    .line 115
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 117
    :pswitch_1
    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    .line 118
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->f:Landroid/view/MotionEvent;

    .line 119
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->b:Z

    .line 120
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->g:Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;

    invoke-interface {v1}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;->a()Z

    move-result v1

    iput-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    .line 121
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    iput-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->c:Z

    .line 122
    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->d:Z

    .line 123
    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    goto :goto_0

    .line 126
    :pswitch_2
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    if-nez v0, :cond_1

    .line 127
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    .line 132
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 133
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 134
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->g:Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;

    invoke-interface {v0}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    .line 135
    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    goto :goto_0

    .line 115
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v4, 0x0

    .line 142
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->g:Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;

    if-eqz v1, :cond_0

    .line 143
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 235
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_1
    :goto_1
    return v0

    .line 145
    :pswitch_0
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    if-eqz v1, :cond_0

    .line 146
    new-array v1, v4, [Landroid/view/MotionEvent;

    invoke-direct {p0, p1, v1}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a(Landroid/view/MotionEvent;[Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 153
    :pswitch_1
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    if-nez v1, :cond_2

    .line 154
    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    .line 159
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 160
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 161
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->g:Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;

    invoke-interface {v1}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout$a;->a()Z

    move-result v1

    iput-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    .line 162
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a:Z

    if-eqz v1, :cond_5

    .line 165
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->c:Z

    if-nez v1, :cond_3

    .line 166
    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->c:Z

    .line 168
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->f:Landroid/view/MotionEvent;

    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 169
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 170
    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->e:Landroid/graphics/PointF;

    .line 173
    :cond_3
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->d:Z

    if-nez v1, :cond_4

    .line 178
    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->d:Z

    .line 179
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->setAction(I)V

    new-array v2, v4, [Landroid/view/MotionEvent;

    invoke-direct {p0, v1, v2}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a(Landroid/view/MotionEvent;[Landroid/view/MotionEvent;)V

    .line 182
    :cond_4
    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->b:Z

    goto :goto_1

    .line 193
    :cond_5
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->b:Z

    if-eqz v1, :cond_6

    .line 194
    iput-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->b:Z

    .line 195
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->f:Landroid/view/MotionEvent;

    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 196
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 197
    new-array v0, v0, [Landroid/view/MotionEvent;

    aput-object v1, v0, v4

    invoke-direct {p0, p1, v0}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a(Landroid/view/MotionEvent;[Landroid/view/MotionEvent;)V

    .line 206
    :goto_2
    iput-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->c:Z

    .line 209
    iput-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->d:Z

    goto/16 :goto_0

    .line 199
    :cond_6
    new-array v0, v4, [Landroid/view/MotionEvent;

    invoke-direct {p0, p1, v0}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a(Landroid/view/MotionEvent;[Landroid/view/MotionEvent;)V

    goto :goto_2

    .line 214
    :pswitch_2
    iput-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->c:Z

    .line 215
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->d:Z

    if-nez v1, :cond_1

    .line 222
    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->d:Z

    .line 223
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->b:Z

    if-eqz v1, :cond_7

    .line 224
    iput-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->b:Z

    .line 225
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->f:Landroid/view/MotionEvent;

    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 226
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 227
    new-array v2, v0, [Landroid/view/MotionEvent;

    aput-object v1, v2, v4

    invoke-direct {p0, p1, v2}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a(Landroid/view/MotionEvent;[Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 229
    :cond_7
    new-array v1, v4, [Landroid/view/MotionEvent;

    invoke-direct {p0, p1, v1}, Lcom/github/ksoichiro/android/observablescrollview/TouchInterceptionFrameLayout;->a(Landroid/view/MotionEvent;[Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
