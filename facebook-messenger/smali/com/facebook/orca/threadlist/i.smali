.class public Lcom/facebook/orca/threadlist/i;
.super Ljava/lang/Object;
.source "PublisherController.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/res/Resources;

.field private c:Lcom/facebook/widget/listview/BetterListView;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;

.field private f:Landroid/view/VelocityTracker;

.field private g:I

.field private h:I

.field private i:I

.field private j:F

.field private k:I

.field private l:Lcom/facebook/orca/threadlist/k;

.field private m:I

.field private n:I

.field private o:Lcom/a/a/q;

.field private p:Lcom/facebook/widget/listview/k;

.field private q:Lcom/facebook/widget/listview/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/Resources;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput v1, p0, Lcom/facebook/orca/threadlist/i;->k:I

    .line 67
    sget-object v0, Lcom/facebook/orca/threadlist/k;->VISIBLE:Lcom/facebook/orca/threadlist/k;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    .line 71
    iput v1, p0, Lcom/facebook/orca/threadlist/i;->n:I

    .line 85
    iput-object p1, p0, Lcom/facebook/orca/threadlist/i;->a:Landroid/content/Context;

    .line 86
    iput-object p2, p0, Lcom/facebook/orca/threadlist/i;->b:Landroid/content/res/Resources;

    .line 87
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/i;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->m:I

    return v0
.end method

.method private a(II)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 162
    if-ltz p1, :cond_1

    .line 163
    sget-object v1, Lcom/facebook/orca/threadlist/k;->VISIBLE:Lcom/facebook/orca/threadlist/k;

    iput-object v1, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    move p1, v0

    .line 170
    :cond_0
    :goto_0
    iget v1, p0, Lcom/facebook/orca/threadlist/i;->m:I

    if-ne v1, p1, :cond_2

    .line 191
    :goto_1
    return-void

    .line 165
    :cond_1
    iget v1, p0, Lcom/facebook/orca/threadlist/i;->g:I

    if-gt p1, v1, :cond_0

    .line 166
    sget-object v1, Lcom/facebook/orca/threadlist/k;->HIDDEN:Lcom/facebook/orca/threadlist/k;

    iput-object v1, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    .line 167
    iget p1, p0, Lcom/facebook/orca/threadlist/i;->g:I

    goto :goto_0

    .line 175
    :cond_2
    iput p1, p0, Lcom/facebook/orca/threadlist/i;->m:I

    .line 177
    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->o:Lcom/a/a/q;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->o:Lcom/a/a/q;

    invoke-virtual {v1}, Lcom/a/a/q;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 178
    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->o:Lcom/a/a/q;

    invoke-virtual {v1}, Lcom/a/a/q;->b()V

    .line 181
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->d:Landroid/view/View;

    const-string v2, "translationY"

    const/4 v3, 0x1

    new-array v3, v3, [F

    int-to-float v4, p1

    aput v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/i;->o:Lcom/a/a/q;

    .line 186
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_4

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->o:Lcom/a/a/q;

    invoke-direct {p0}, Lcom/facebook/orca/threadlist/i;->d()Lcom/a/a/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/a/a/q;->a(Lcom/a/a/b;)V

    .line 190
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->o:Lcom/a/a/q;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Lcom/a/a/q;->b(J)Lcom/a/a/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/q;->a()V

    goto :goto_1
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/i;)I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->g:I

    return v0
.end method

.method static synthetic c(Lcom/facebook/orca/threadlist/i;)Landroid/view/View;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->e:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/threadlist/i;)Landroid/view/View;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->d:Landroid/view/View;

    return-object v0
.end method

.method private d()Lcom/a/a/c;
    .locals 1

    .prologue
    .line 202
    new-instance v0, Lcom/facebook/orca/threadlist/j;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/j;-><init>(Lcom/facebook/orca/threadlist/i;)V

    return-object v0
.end method

.method private e()Z
    .locals 2

    .prologue
    .line 324
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->k:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    sget-object v1, Lcom/facebook/orca/threadlist/k;->VISIBLE:Lcom/facebook/orca/threadlist/k;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/facebook/orca/threadlist/i;->j:F

    iget v1, p0, Lcom/facebook/orca/threadlist/i;->h:I

    neg-int v1, v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    sget-object v1, Lcom/facebook/orca/threadlist/k;->HIDDEN:Lcom/facebook/orca/threadlist/k;

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/facebook/orca/threadlist/i;->j:F

    iget v1, p0, Lcom/facebook/orca/threadlist/i;->h:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->b:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/g;->publisher_height_with_offset:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    neg-int v0, v0

    iput v0, p0, Lcom/facebook/orca/threadlist/i;->g:I

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    sget-object v1, Lcom/facebook/orca/threadlist/k;->HIDDEN:Lcom/facebook/orca/threadlist/k;

    if-ne v0, v1, :cond_0

    .line 134
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/i;->a(Z)V

    .line 136
    :cond_0
    return-void
.end method

.method public a(FFZ)V
    .locals 2

    .prologue
    .line 301
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    sget-object v1, Lcom/facebook/orca/threadlist/k;->VISIBLE:Lcom/facebook/orca/threadlist/k;

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/facebook/orca/threadlist/i;->g:I

    neg-int v0, v0

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    if-eqz p3, :cond_2

    neg-float v0, p2

    iget v1, p0, Lcom/facebook/orca/threadlist/i;->h:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 304
    :cond_0
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->g:I

    neg-int v0, v0

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_3

    .line 306
    float-to-int v0, p1

    neg-int v0, v0

    .line 307
    iget v1, p0, Lcom/facebook/orca/threadlist/i;->n:I

    int-to-float v1, v1

    cmpg-float v1, p1, v1

    if-gez v1, :cond_1

    .line 308
    iget v1, p0, Lcom/facebook/orca/threadlist/i;->m:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 314
    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadlist/i;->a(II)V

    .line 316
    :cond_2
    float-to-int v0, p1

    iput v0, p0, Lcom/facebook/orca/threadlist/i;->n:I

    .line 317
    return-void

    .line 312
    :cond_3
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->m:I

    iget v1, p0, Lcom/facebook/orca/threadlist/i;->n:I

    int-to-float v1, v1

    sub-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v0, v1

    goto :goto_0
.end method

.method public a(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 231
    iput p2, p0, Lcom/facebook/orca/threadlist/i;->k:I

    .line 233
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->k:I

    if-nez v0, :cond_1

    .line 234
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/threadlist/i;->j:F

    .line 237
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->m:I

    iget v1, p0, Lcom/facebook/orca/threadlist/i;->g:I

    div-int/lit8 v1, v1, 0x2

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->c:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->getFirstVisiblePosition()I

    move-result v0

    if-nez v0, :cond_2

    .line 239
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/i;->a(Z)V

    .line 244
    :cond_1
    :goto_0
    return-void

    .line 241
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/i;->a(Z)V

    goto :goto_0
.end method

.method public a(Landroid/widget/AbsListView;III)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 249
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/k;->a()V

    .line 253
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->k:I

    if-nez v0, :cond_0

    .line 298
    :goto_0
    return-void

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->l:Lcom/facebook/orca/threadlist/k;

    sget-object v1, Lcom/facebook/orca/threadlist/k;->VISIBLE:Lcom/facebook/orca/threadlist/k;

    if-eq v0, v1, :cond_1

    invoke-direct {p0}, Lcom/facebook/orca/threadlist/i;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 258
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/k;->b()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->p:Lcom/facebook/widget/listview/k;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/k;->b()I

    move-result v1

    sub-int v1, v0, v1

    .line 275
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_5

    .line 276
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->m:I

    .line 277
    iget-object v2, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    invoke-virtual {v2}, Lcom/facebook/widget/listview/k;->d()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/orca/threadlist/i;->p:Lcom/facebook/widget/listview/k;

    invoke-virtual {v3}, Lcom/facebook/widget/listview/k;->d()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    .line 279
    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 280
    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->p:Lcom/facebook/widget/listview/k;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/k;->c()I

    move-result v1

    sub-int/2addr v0, v1

    .line 284
    :cond_2
    :goto_1
    invoke-direct {p0, v0, v4}, Lcom/facebook/orca/threadlist/i;->a(II)V

    .line 297
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->p:Lcom/facebook/widget/listview/k;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/k;->a(Lcom/facebook/widget/listview/k;)V

    goto :goto_0

    .line 281
    :cond_4
    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 282
    iget-object v1, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/k;->c()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1

    .line 285
    :cond_5
    if-lez v1, :cond_3

    .line 287
    invoke-virtual {p0, v4}, Lcom/facebook/orca/threadlist/i;->a(Z)V

    goto :goto_2

    .line 289
    :cond_6
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->m:I

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/k;->b()I

    move-result v0

    if-nez v0, :cond_3

    .line 294
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/k;->d()I

    move-result v0

    neg-int v0, v0

    invoke-direct {p0, v0, v4}, Lcom/facebook/orca/threadlist/i;->a(II)V

    goto :goto_2
.end method

.method public a(Lcom/facebook/widget/listview/BetterListView;Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .prologue
    .line 100
    iput-object p1, p0, Lcom/facebook/orca/threadlist/i;->c:Lcom/facebook/widget/listview/BetterListView;

    .line 101
    iput-object p2, p0, Lcom/facebook/orca/threadlist/i;->d:Landroid/view/View;

    .line 102
    iput-object p3, p0, Lcom/facebook/orca/threadlist/i;->e:Landroid/view/View;

    .line 105
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/i;->a()V

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 111
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    .line 112
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadlist/i;->i:I

    .line 117
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->i:I

    int-to-double v2, v0

    const-wide v4, 0x3fa999999999999aL    # 0.05

    mul-double/2addr v2, v4

    int-to-double v0, v1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lcom/facebook/orca/threadlist/i;->h:I

    .line 120
    new-instance v0, Lcom/facebook/widget/listview/k;

    invoke-direct {v0, p1}, Lcom/facebook/widget/listview/k;-><init>(Lcom/facebook/widget/listview/BetterListView;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/i;->p:Lcom/facebook/widget/listview/k;

    .line 121
    new-instance v0, Lcom/facebook/widget/listview/k;

    invoke-direct {v0, p1}, Lcom/facebook/widget/listview/k;-><init>(Lcom/facebook/widget/listview/BetterListView;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/i;->q:Lcom/facebook/widget/listview/k;

    .line 122
    return-void
.end method

.method public a(Z)V
    .locals 2

    .prologue
    .line 226
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 227
    :goto_0
    const/16 v1, 0x64

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadlist/i;->a(II)V

    .line 228
    return-void

    .line 226
    :cond_0
    iget v0, p0, Lcom/facebook/orca/threadlist/i;->g:I

    goto :goto_0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 335
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 347
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 338
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 342
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 343
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadlist/i;->j:F

    goto :goto_0

    .line 335
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b()V
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 141
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    .line 143
    :cond_0
    return-void
.end method

.method public b(Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 351
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->p:Lcom/facebook/widget/listview/k;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/k;->a()V

    .line 356
    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 148
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/i;->f:Landroid/view/VelocityTracker;

    .line 150
    :cond_0
    return-void
.end method
