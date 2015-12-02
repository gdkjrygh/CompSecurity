.class public Lcom/facebook/orca/chatheads/ek;
.super Ljava/lang/Object;
.source "ViewDragDismissHelper.java"


# static fields
.field private static final a:Lcom/facebook/n/g;


# instance fields
.field private final b:Lcom/facebook/n/j;

.field private final c:Lcom/facebook/n/c;

.field private final d:Landroid/view/View;

.field private final e:Landroid/view/View;

.field private final f:Lcom/facebook/orca/chatheads/en;

.field private final g:Landroid/view/VelocityTracker;

.field private final h:F

.field private final i:I

.field private j:Lcom/facebook/orca/chatheads/em;

.field private k:Z

.field private l:Z

.field private m:F

.field private n:Z

.field private o:I

.field private p:I

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 50
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/ek;->a:Lcom/facebook/n/g;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/view/View;Lcom/facebook/orca/chatheads/en;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 96
    invoke-static {v1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 97
    const-class v2, Lcom/facebook/n/j;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ek;->b:Lcom/facebook/n/j;

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->b:Lcom/facebook/n/j;

    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/chatheads/ek;->a:Lcom/facebook/n/g;

    invoke-virtual {v0, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    new-instance v2, Lcom/facebook/orca/chatheads/eo;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/facebook/orca/chatheads/eo;-><init>(Lcom/facebook/orca/chatheads/ek;Lcom/facebook/orca/chatheads/el;)V

    invoke-virtual {v0, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ek;->c:Lcom/facebook/n/c;

    .line 102
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    .line 103
    iput-object p2, p0, Lcom/facebook/orca/chatheads/ek;->e:Landroid/view/View;

    .line 104
    iput-object p3, p0, Lcom/facebook/orca/chatheads/ek;->f:Lcom/facebook/orca/chatheads/en;

    .line 106
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ek;->c()V

    .line 108
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ek;->g:Landroid/view/VelocityTracker;

    .line 110
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 111
    sget v2, Lcom/facebook/g;->view_swipe_min_dismiss_velocity:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ek;->h:F

    .line 113
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ek;->i:I

    .line 115
    iput-boolean v4, p0, Lcom/facebook/orca/chatheads/ek;->k:Z

    .line 116
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ek;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->f:Lcom/facebook/orca/chatheads/en;

    sget-object v1, Lcom/facebook/orca/chatheads/en;->UP:Lcom/facebook/orca/chatheads/en;

    if-ne v0, v1, :cond_0

    .line 152
    neg-int p1, p1

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    int-to-float v1, p1

    invoke-static {v0, v1}, Lcom/a/c/a;->h(Landroid/view/View;F)V

    .line 155
    return-void
.end method

.method private a(F)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 288
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ek;->f:Lcom/facebook/orca/chatheads/en;

    sget-object v3, Lcom/facebook/orca/chatheads/en;->DOWN:Lcom/facebook/orca/chatheads/en;

    if-ne v2, v3, :cond_2

    .line 289
    iget v2, p0, Lcom/facebook/orca/chatheads/ek;->p:I

    int-to-float v2, v2

    cmpl-float v2, p1, v2

    if-lez v2, :cond_1

    .line 291
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 289
    goto :goto_0

    .line 291
    :cond_2
    iget v2, p0, Lcom/facebook/orca/chatheads/ek;->p:I

    int-to-float v2, v2

    cmpg-float v2, p1, v2

    if-ltz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 179
    .line 181
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ek;->k:Z

    if-eqz v0, :cond_1

    .line 183
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 184
    iput-boolean v1, p0, Lcom/facebook/orca/chatheads/ek;->n:Z

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    invoke-interface {v0, p1}, Lcom/facebook/orca/chatheads/em;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ek;->n:Z

    .line 190
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ek;->n:Z

    if-nez v0, :cond_1

    .line 191
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ek;->b(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 197
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ek;->e()I

    move-result v0

    if-nez v0, :cond_2

    .line 198
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ek;->d(Landroid/view/MotionEvent;)V

    .line 201
    :cond_2
    return v1

    :cond_3
    move v0, v1

    .line 186
    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ek;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ek;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ek;)Lcom/facebook/orca/chatheads/em;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    return-object v0
.end method

.method private b(F)V
    .locals 3

    .prologue
    .line 307
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ek;->e()I

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->f:Lcom/facebook/orca/chatheads/en;

    sget-object v1, Lcom/facebook/orca/chatheads/en;->UP:Lcom/facebook/orca/chatheads/en;

    if-ne v0, v1, :cond_0

    .line 309
    neg-float p1, p1

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->c:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    invoke-static {v1}, Lcom/a/c/a;->a(Landroid/view/View;)F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 312
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->c:Lcom/facebook/n/c;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->c(D)Lcom/facebook/n/c;

    .line 313
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->c:Lcom/facebook/n/c;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 315
    :cond_1
    return-void
.end method

.method private b(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/high16 v5, 0x7fc00000    # NaNf

    const/4 v1, 0x0

    .line 205
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    move v0, v2

    .line 284
    :goto_1
    return v0

    .line 207
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ek;->c(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 211
    :pswitch_1
    iget v0, p0, Lcom/facebook/orca/chatheads/ek;->m:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 214
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iget v3, p0, Lcom/facebook/orca/chatheads/ek;->m:F

    sub-float/2addr v0, v3

    float-to-int v0, v0

    .line 215
    iget-object v3, p0, Lcom/facebook/orca/chatheads/ek;->f:Lcom/facebook/orca/chatheads/en;

    sget-object v4, Lcom/facebook/orca/chatheads/en;->UP:Lcom/facebook/orca/chatheads/en;

    if-ne v3, v4, :cond_1

    .line 216
    neg-int v0, v0

    .line 218
    :cond_1
    iget-boolean v3, p0, Lcom/facebook/orca/chatheads/ek;->l:Z

    if-nez v3, :cond_2

    .line 219
    iget v3, p0, Lcom/facebook/orca/chatheads/ek;->i:I

    if-lt v0, v3, :cond_0

    .line 222
    iput-boolean v2, p0, Lcom/facebook/orca/chatheads/ek;->l:Z

    .line 227
    :cond_2
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 229
    iget v3, p0, Lcom/facebook/orca/chatheads/ek;->q:I

    if-lt v0, v3, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget-object v4, p0, Lcom/facebook/orca/chatheads/ek;->e:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-direct {p0, v3}, Lcom/facebook/orca/chatheads/ek;->a(F)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 232
    iput v5, p0, Lcom/facebook/orca/chatheads/ek;->m:F

    .line 233
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ek;->f()V

    move v0, v1

    .line 234
    goto :goto_1

    .line 237
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ek;->e()I

    move-result v1

    .line 240
    if-lez v0, :cond_5

    if-nez v1, :cond_5

    .line 241
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    if-eqz v1, :cond_4

    .line 243
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    invoke-interface {v1, p0}, Lcom/facebook/orca/chatheads/em;->a(Lcom/facebook/orca/chatheads/ek;)V

    .line 249
    :cond_4
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ek;->d(Landroid/view/MotionEvent;)V

    .line 251
    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->setAction(I)V

    .line 252
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ek;->d(Landroid/view/MotionEvent;)V

    .line 255
    :cond_5
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ek;->a(I)V

    .line 257
    :cond_6
    iget v0, p0, Lcom/facebook/orca/chatheads/ek;->m:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ek;->c(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 266
    :pswitch_2
    iput-boolean v1, p0, Lcom/facebook/orca/chatheads/ek;->l:Z

    .line 267
    iput v5, p0, Lcom/facebook/orca/chatheads/ek;->m:F

    .line 270
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->g:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 271
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    .line 272
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ek;->f:Lcom/facebook/orca/chatheads/en;

    sget-object v3, Lcom/facebook/orca/chatheads/en;->UP:Lcom/facebook/orca/chatheads/en;

    if-ne v1, v3, :cond_7

    .line 273
    neg-float v0, v0

    .line 275
    :cond_7
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ek;->e()I

    move-result v1

    .line 276
    iget v3, p0, Lcom/facebook/orca/chatheads/ek;->o:I

    if-lt v1, v3, :cond_8

    iget v1, p0, Lcom/facebook/orca/chatheads/ek;->h:F

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_8

    .line 278
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ek;->f()V

    goto/16 :goto_0

    .line 280
    :cond_8
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ek;->b(F)V

    goto/16 :goto_0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c(Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 296
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ek;->l:Z

    .line 297
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ek;->m:F

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 300
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 301
    return-void
.end method

.method private d(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 322
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    .line 323
    int-to-float v1, v0

    invoke-virtual {p1, v2, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 324
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 325
    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1, v2, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 326
    return-void
.end method

.method private e()I
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    invoke-static {v0}, Lcom/a/c/a;->a(Landroid/view/View;)F

    move-result v0

    float-to-int v0, v0

    .line 162
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    invoke-interface {v0, p0}, Lcom/facebook/orca/chatheads/em;->c(Lcom/facebook/orca/chatheads/ek;)V

    .line 332
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ek;->c()V

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->e:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/chatheads/el;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/el;-><init>(Lcom/facebook/orca/chatheads/ek;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 131
    return-void
.end method

.method public a(Lcom/facebook/orca/chatheads/em;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ek;->j:Lcom/facebook/orca/chatheads/em;

    .line 120
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 134
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/ek;->k:Z

    .line 135
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 141
    iput-boolean v1, p0, Lcom/facebook/orca/chatheads/ek;->l:Z

    .line 142
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ek;->n:Z

    .line 143
    invoke-direct {p0, v1}, Lcom/facebook/orca/chatheads/ek;->a(I)V

    .line 144
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 169
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/facebook/orca/chatheads/ek;->o:I

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->f:Lcom/facebook/orca/chatheads/en;

    sget-object v1, Lcom/facebook/orca/chatheads/en;->DOWN:Lcom/facebook/orca/chatheads/en;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    :goto_0
    iput v0, p0, Lcom/facebook/orca/chatheads/ek;->p:I

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/facebook/orca/chatheads/ek;->q:I

    .line 172
    return-void

    .line 170
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 335
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 336
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ek;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 337
    return-void
.end method
