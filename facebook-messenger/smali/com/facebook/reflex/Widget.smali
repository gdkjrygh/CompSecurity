.class public Lcom/facebook/reflex/Widget;
.super Lcom/facebook/reflex/Countable;
.source "Widget.java"


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# static fields
.field private static p:I

.field private static q:I


# instance fields
.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:I

.field private g:I

.field private h:Lcom/facebook/reflex/d;

.field private i:Z

.field private j:Lcom/facebook/reflex/ak;

.field private k:Lcom/facebook/reflex/x;

.field private l:Lcom/facebook/reflex/w;

.field private m:Lcom/facebook/reflex/q;

.field private n:Lcom/facebook/reflex/am;

.field private o:Lcom/facebook/reflex/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/reflex/Countable;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/Widget;->i:Z

    .line 338
    return-void
.end method

.method public static b(II)V
    .locals 1

    .prologue
    .line 427
    sget v0, Lcom/facebook/reflex/Widget;->p:I

    if-ne v0, p0, :cond_0

    sget v0, Lcom/facebook/reflex/Widget;->q:I

    if-eq v0, p1, :cond_1

    .line 428
    :cond_0
    sput p0, Lcom/facebook/reflex/Widget;->p:I

    .line 429
    sput p1, Lcom/facebook/reflex/Widget;->q:I

    .line 430
    invoke-static {p0, p1}, Lcom/facebook/reflex/Widget;->nativeSetTouchOffset(II)V

    .line 432
    :cond_1
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 135
    iget v0, p0, Lcom/facebook/reflex/Widget;->b:F

    iget v1, p0, Lcom/facebook/reflex/Widget;->d:F

    add-float/2addr v0, v1

    iget v1, p0, Lcom/facebook/reflex/Widget;->c:F

    iget v2, p0, Lcom/facebook/reflex/Widget;->e:F

    add-float/2addr v1, v2

    invoke-direct {p0, v0, v1}, Lcom/facebook/reflex/Widget;->nativeSetPosition(FF)V

    .line 136
    return-void
.end method

.method private fireGestureEvent(IIJJFFFF)V
    .locals 11
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 223
    packed-switch p1, :pswitch_data_0

    .line 282
    :cond_0
    :goto_0
    return-void

    .line 225
    :pswitch_0
    sget-object v1, Lcom/facebook/reflex/s;->Tap:Lcom/facebook/reflex/s;

    .line 239
    :goto_1
    packed-switch p2, :pswitch_data_1

    goto :goto_0

    .line 241
    :pswitch_1
    sget-object v2, Lcom/facebook/reflex/t;->Started:Lcom/facebook/reflex/t;

    .line 257
    :goto_2
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->o:Lcom/facebook/reflex/r;

    if-nez v0, :cond_1

    .line 258
    new-instance v0, Lcom/facebook/reflex/r;

    invoke-direct {v0}, Lcom/facebook/reflex/r;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/Widget;->o:Lcom/facebook/reflex/r;

    .line 262
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->o:Lcom/facebook/reflex/r;

    sget v3, Lcom/facebook/reflex/Widget;->p:I

    int-to-float v3, v3

    sub-float v9, p9, v3

    sget v3, Lcom/facebook/reflex/Widget;->q:I

    int-to-float v3, v3

    sub-float v10, p10, v3

    move-wide v3, p3

    move-wide/from16 v5, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v10}, Lcom/facebook/reflex/r;->a(Lcom/facebook/reflex/s;Lcom/facebook/reflex/t;JJFFFF)V

    .line 265
    sget-object v0, Lcom/facebook/reflex/al;->a:[I

    invoke-virtual {v1}, Lcom/facebook/reflex/s;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_2

    goto :goto_0

    .line 267
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->j:Lcom/facebook/reflex/ak;

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->j:Lcom/facebook/reflex/ak;

    iget-object v1, p0, Lcom/facebook/reflex/Widget;->o:Lcom/facebook/reflex/r;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/ak;->b(Lcom/facebook/reflex/r;)V

    goto :goto_0

    .line 228
    :pswitch_3
    sget-object v1, Lcom/facebook/reflex/s;->Pan:Lcom/facebook/reflex/s;

    goto :goto_1

    .line 231
    :pswitch_4
    sget-object v1, Lcom/facebook/reflex/s;->Longpress:Lcom/facebook/reflex/s;

    goto :goto_1

    .line 244
    :pswitch_5
    sget-object v2, Lcom/facebook/reflex/t;->Changed:Lcom/facebook/reflex/t;

    goto :goto_2

    .line 247
    :pswitch_6
    sget-object v2, Lcom/facebook/reflex/t;->Ended:Lcom/facebook/reflex/t;

    goto :goto_2

    .line 250
    :pswitch_7
    sget-object v2, Lcom/facebook/reflex/t;->Cancelled:Lcom/facebook/reflex/t;

    goto :goto_2

    .line 272
    :pswitch_8
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->k:Lcom/facebook/reflex/x;

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->k:Lcom/facebook/reflex/x;

    iget-object v1, p0, Lcom/facebook/reflex/Widget;->o:Lcom/facebook/reflex/r;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/x;->a(Lcom/facebook/reflex/r;)V

    goto :goto_0

    .line 277
    :pswitch_9
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->l:Lcom/facebook/reflex/w;

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->l:Lcom/facebook/reflex/w;

    iget-object v1, p0, Lcom/facebook/reflex/Widget;->o:Lcom/facebook/reflex/r;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/w;->a(Lcom/facebook/reflex/r;)V

    goto :goto_0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 239
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    .line 265
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method static synthetic m()I
    .locals 1

    .prologue
    .line 17
    sget v0, Lcom/facebook/reflex/Widget;->p:I

    return v0
.end method

.method static synthetic n()I
    .locals 1

    .prologue
    .line 17
    sget v0, Lcom/facebook/reflex/Widget;->q:I

    return v0
.end method

.method private native nativeSetPosition(FF)V
.end method

.method private static native nativeSetTouchOffset(II)V
.end method

.method private native registerForGenericGesture(Z)V
.end method

.method private native registerForLongpress(ZI)V
.end method

.method private native registerForPans(ZI)V
.end method

.method private native registerForTaps(Z)V
.end method

.method private native resize(II)V
.end method

.method public static native updateRootWidgetBounds(IIII)V
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/facebook/reflex/Widget;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/Widget;->i:Z

    .line 77
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->h:Lcom/facebook/reflex/d;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->h:Lcom/facebook/reflex/d;

    invoke-virtual {v0}, Lcom/facebook/reflex/d;->d()V

    .line 81
    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/facebook/reflex/Widget;->f:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/Widget;->g:I

    if-eq p2, v0, :cond_1

    .line 57
    :cond_0
    iput p1, p0, Lcom/facebook/reflex/Widget;->f:I

    .line 58
    iput p2, p0, Lcom/facebook/reflex/Widget;->g:I

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/facebook/reflex/Widget;->resize(II)V

    .line 61
    :cond_1
    return-void
.end method

.method public a(Lcom/facebook/reflex/ak;)V
    .locals 1

    .prologue
    .line 163
    iput-object p1, p0, Lcom/facebook/reflex/Widget;->j:Lcom/facebook/reflex/ak;

    .line 164
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/reflex/Widget;->registerForTaps(Z)V

    .line 165
    return-void

    .line 164
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/reflex/d;)V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->h:Lcom/facebook/reflex/d;

    if-ne v0, p1, :cond_1

    .line 159
    :cond_0
    :goto_0
    return-void

    .line 148
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->h:Lcom/facebook/reflex/d;

    .line 149
    invoke-virtual {p0}, Lcom/facebook/reflex/Widget;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    .line 150
    invoke-virtual {p1}, Lcom/facebook/reflex/d;->d()V

    .line 153
    :cond_2
    iput-object p1, p0, Lcom/facebook/reflex/Widget;->h:Lcom/facebook/reflex/d;

    .line 154
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/Widget;->nativeSetBackground(Lcom/facebook/reflex/d;)V

    .line 155
    invoke-virtual {p0}, Lcom/facebook/reflex/Widget;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 156
    invoke-virtual {v0}, Lcom/facebook/reflex/d;->g()V

    goto :goto_0
.end method

.method public a(Lcom/facebook/reflex/q;)V
    .locals 1

    .prologue
    .line 199
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/Widget;->b(Lcom/facebook/reflex/q;)V

    .line 200
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/reflex/Widget;->registerForGenericGesture(Z)V

    .line 201
    return-void

    .line 200
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/reflex/w;)V
    .locals 1

    .prologue
    .line 190
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/w;I)V

    .line 191
    return-void
.end method

.method public a(Lcom/facebook/reflex/w;I)V
    .locals 1

    .prologue
    .line 194
    iput-object p1, p0, Lcom/facebook/reflex/Widget;->l:Lcom/facebook/reflex/w;

    .line 195
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/facebook/reflex/Widget;->registerForLongpress(ZI)V

    .line 196
    return-void

    .line 195
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/reflex/x;)V
    .locals 1

    .prologue
    .line 172
    sget-object v0, Lcom/facebook/reflex/y;->PanUnconstrained:Lcom/facebook/reflex/y;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/reflex/Widget;->a(Lcom/facebook/reflex/x;Lcom/facebook/reflex/y;)V

    .line 173
    return-void
.end method

.method public a(Lcom/facebook/reflex/x;Lcom/facebook/reflex/y;)V
    .locals 2

    .prologue
    .line 176
    iput-object p1, p0, Lcom/facebook/reflex/Widget;->k:Lcom/facebook/reflex/x;

    .line 177
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p2}, Lcom/facebook/reflex/y;->ordinal()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/reflex/Widget;->registerForPans(ZI)V

    .line 178
    return-void

    .line 177
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method addPointer(IFF)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 304
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    if-nez v0, :cond_0

    .line 309
    :goto_0
    return-void

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/reflex/am;->a(IFF)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 100
    iget-boolean v0, p0, Lcom/facebook/reflex/Widget;->i:Z

    if-eqz v0, :cond_0

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/Widget;->i:Z

    .line 102
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->h:Lcom/facebook/reflex/d;

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->h:Lcom/facebook/reflex/d;

    invoke-virtual {v0}, Lcom/facebook/reflex/d;->g()V

    .line 106
    :cond_0
    return-void
.end method

.method public b(F)V
    .locals 1

    .prologue
    .line 113
    iget v0, p0, Lcom/facebook/reflex/Widget;->d:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 114
    iput p1, p0, Lcom/facebook/reflex/Widget;->d:F

    .line 115
    invoke-direct {p0}, Lcom/facebook/reflex/Widget;->c()V

    .line 117
    :cond_0
    return-void
.end method

.method public b(FF)V
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/facebook/reflex/Widget;->b:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/Widget;->c:F

    cmpl-float v0, v0, p2

    if-eqz v0, :cond_1

    .line 49
    :cond_0
    iput p1, p0, Lcom/facebook/reflex/Widget;->b:F

    .line 50
    iput p2, p0, Lcom/facebook/reflex/Widget;->c:F

    .line 51
    invoke-direct {p0}, Lcom/facebook/reflex/Widget;->c()V

    .line 53
    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 64
    return-void
.end method

.method b(Lcom/facebook/reflex/q;)V
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 205
    if-eqz p1, :cond_0

    .line 206
    new-instance v0, Lcom/facebook/reflex/am;

    invoke-direct {v0, p0}, Lcom/facebook/reflex/am;-><init>(Lcom/facebook/reflex/Widget;)V

    iput-object v0, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    .line 210
    :goto_0
    iput-object p1, p0, Lcom/facebook/reflex/Widget;->m:Lcom/facebook/reflex/q;

    .line 211
    return-void

    .line 208
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    goto :goto_0
.end method

.method beginMotionEvent(JJIIIFFIFF)V
    .locals 13
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 291
    iget-object v3, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    if-nez v3, :cond_0

    .line 298
    :goto_0
    return-void

    .line 295
    :cond_0
    iget-object v3, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    move-wide v4, p1

    move-wide/from16 v6, p3

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    invoke-virtual/range {v3 .. v12}, Lcom/facebook/reflex/am;->a(JJIIIFF)V

    .line 297
    iget-object v3, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    move/from16 v0, p10

    move/from16 v1, p11

    move/from16 v2, p12

    invoke-virtual {v3, v0, v1, v2}, Lcom/facebook/reflex/am;->a(IFF)V

    goto :goto_0
.end method

.method public c(F)V
    .locals 1

    .prologue
    .line 120
    iget v0, p0, Lcom/facebook/reflex/Widget;->e:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 121
    iput p1, p0, Lcom/facebook/reflex/Widget;->e:F

    .line 122
    invoke-direct {p0}, Lcom/facebook/reflex/Widget;->c()V

    .line 124
    :cond_0
    return-void
.end method

.method dispatchMotionEvent()V
    .locals 2
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 315
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    if-nez v0, :cond_0

    .line 323
    :goto_0
    return-void

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->m:Lcom/facebook/reflex/q;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 320
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->n:Lcom/facebook/reflex/am;

    invoke-virtual {v0}, Lcom/facebook/reflex/am;->a()Landroid/view/MotionEvent;

    move-result-object v0

    .line 321
    iget-object v1, p0, Lcom/facebook/reflex/Widget;->m:Lcom/facebook/reflex/q;

    invoke-interface {v1, v0}, Lcom/facebook/reflex/q;->a(Landroid/view/MotionEvent;)V

    .line 322
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_0

    .line 319
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public e()F
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/facebook/reflex/Widget;->c:F

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/facebook/reflex/Widget;->f:I

    return v0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/facebook/reflex/Widget;->g:I

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lcom/facebook/reflex/Widget;->i:Z

    return v0
.end method

.method public j()F
    .locals 1

    .prologue
    .line 127
    iget v0, p0, Lcom/facebook/reflex/Widget;->d:F

    return v0
.end method

.method public k()F
    .locals 1

    .prologue
    .line 131
    iget v0, p0, Lcom/facebook/reflex/Widget;->e:F

    return v0
.end method

.method public l()Lcom/facebook/reflex/ak;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/reflex/Widget;->j:Lcom/facebook/reflex/ak;

    return-object v0
.end method

.method public native nativeSetBackground(Lcom/facebook/reflex/d;)V
.end method
