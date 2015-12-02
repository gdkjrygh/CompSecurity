.class public Lcom/facebook/widget/listview/BetterListView;
.super Landroid/widget/ListView;
.source "BetterListView.java"

# interfaces
.implements Lcom/facebook/widget/r;


# static fields
.field private static final k:Z


# instance fields
.field private a:Lcom/facebook/widget/b/b;

.field private b:Lcom/facebook/widget/f/a;

.field private c:Landroid/view/MotionEvent;

.field private d:Z

.field private e:Lcom/facebook/common/v/f;

.field private f:Landroid/widget/AbsListView$OnScrollListener;

.field private g:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field private h:Lcom/facebook/common/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/b/a",
            "<",
            "Lcom/facebook/widget/listview/c;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/facebook/widget/listview/BetterListView;->k:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 65
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 41
    iput v0, p0, Lcom/facebook/widget/listview/BetterListView;->i:I

    .line 42
    iput v0, p0, Lcom/facebook/widget/listview/BetterListView;->j:I

    .line 66
    invoke-direct {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->a(Landroid/content/Context;)V

    .line 67
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 70
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    iput v0, p0, Lcom/facebook/widget/listview/BetterListView;->i:I

    .line 42
    iput v0, p0, Lcom/facebook/widget/listview/BetterListView;->j:I

    .line 71
    invoke-direct {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->a(Landroid/content/Context;)V

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 75
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    iput v0, p0, Lcom/facebook/widget/listview/BetterListView;->i:I

    .line 42
    iput v0, p0, Lcom/facebook/widget/listview/BetterListView;->j:I

    .line 76
    invoke-direct {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->a(Landroid/content/Context;)V

    .line 77
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 80
    new-instance v0, Lcom/facebook/widget/b/b;

    invoke-direct {v0}, Lcom/facebook/widget/b/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->a:Lcom/facebook/widget/b/b;

    .line 81
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->a:Lcom/facebook/widget/b/b;

    invoke-virtual {v0}, Lcom/facebook/widget/b/b;->a()Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 83
    iput-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    .line 84
    iput-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->b:Lcom/facebook/widget/f/a;

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/widget/listview/BetterListView;->d:Z

    .line 86
    iput-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->e:Lcom/facebook/common/v/f;

    .line 87
    new-instance v0, Lcom/facebook/widget/listview/a;

    invoke-direct {v0, p0}, Lcom/facebook/widget/listview/a;-><init>(Lcom/facebook/widget/listview/BetterListView;)V

    iput-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->f:Landroid/widget/AbsListView$OnScrollListener;

    .line 99
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 100
    const-class v1, Lcom/facebook/common/v/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/v/f;

    iput-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->e:Lcom/facebook/common/v/f;

    .line 101
    new-instance v0, Lcom/facebook/common/b/a;

    invoke-direct {v0}, Lcom/facebook/common/b/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->h:Lcom/facebook/common/b/a;

    .line 103
    new-instance v0, Lcom/facebook/widget/listview/b;

    invoke-direct {v0, p0}, Lcom/facebook/widget/listview/b;-><init>(Lcom/facebook/widget/listview/BetterListView;)V

    iput-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->g:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 110
    return-void
.end method

.method private d()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 162
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getChildCount()I

    move-result v1

    .line 164
    if-lez v1, :cond_2

    .line 165
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getFirstVisiblePosition()I

    move-result v2

    .line 167
    add-int v3, v2, v1

    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getCount()I

    move-result v4

    if-ne v3, v4, :cond_0

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/facebook/widget/listview/BetterListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getHeight()I

    move-result v3

    if-le v1, v3, :cond_1

    :cond_0
    if-nez v2, :cond_2

    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/BetterListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    if-ltz v1, :cond_2

    .line 170
    :cond_1
    const/4 v0, 0x1

    .line 173
    :cond_2
    return v0
.end method


# virtual methods
.method protected a()V
    .locals 5

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->b:Lcom/facebook/widget/f/a;

    iget-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    const/4 v2, 0x2

    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getNextEstimatedDrawTime()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/widget/f/a;->a(Landroid/view/MotionEvent;IJ)Landroid/view/MotionEvent;

    move-result-object v0

    .line 261
    invoke-super {p0, v0}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 263
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 264
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    .line 267
    :cond_0
    return-void
.end method

.method public a(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->a:Lcom/facebook/widget/b/b;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/b/b;->b(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 120
    return-void
.end method

.method public b(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->a:Lcom/facebook/widget/b/b;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/b/b;->c(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 125
    return-void
.end method

.method public b()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 368
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 369
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getChildCount()I

    move-result v2

    .line 370
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getLastVisiblePosition()I

    move-result v3

    .line 371
    if-lez v2, :cond_1

    add-int/lit8 v1, v1, -0x1

    if-ne v3, v1, :cond_1

    .line 372
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/facebook/widget/listview/BetterListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 373
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    .line 374
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getHeight()I

    move-result v2

    .line 375
    if-ne v1, v2, :cond_2

    .line 382
    :cond_0
    :goto_0
    return v0

    .line 378
    :cond_1
    if-eqz v2, :cond_0

    .line 382
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 387
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    .line 392
    :goto_0
    return-void

    .line 391
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/BetterListView;->setOverScrollMode(I)V

    goto :goto_0
.end method

.method protected c(I)V
    .locals 1

    .prologue
    .line 145
    sget-boolean v0, Lcom/facebook/widget/listview/BetterListView;->k:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/widget/listview/BetterListView;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    const/4 p1, 0x0

    .line 151
    :cond_0
    iget v0, p0, Lcom/facebook/widget/listview/BetterListView;->j:I

    if-eq p1, v0, :cond_1

    .line 152
    iput p1, p0, Lcom/facebook/widget/listview/BetterListView;->j:I

    .line 153
    if-nez p1, :cond_2

    .line 154
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->e:Lcom/facebook/common/v/f;

    invoke-virtual {v0, p0}, Lcom/facebook/common/v/f;->b(Landroid/view/View;)V

    .line 159
    :cond_1
    :goto_0
    return-void

    .line 156
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->e:Lcom/facebook/common/v/f;

    invoke-virtual {v0, p0}, Lcom/facebook/common/v/f;->a(Landroid/view/View;)V

    goto :goto_0
.end method

.method protected getNextEstimatedDrawTime()J
    .locals 2

    .prologue
    .line 253
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->g:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 179
    invoke-super {p0}, Landroid/widget/ListView;->onAttachedToWindow()V

    .line 180
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 184
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->g:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 185
    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    .line 189
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->e:Lcom/facebook/common/v/f;

    invoke-virtual {v0, p0}, Lcom/facebook/common/v/f;->b(Landroid/view/View;)V

    .line 190
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .prologue
    .line 194
    iput p1, p0, Lcom/facebook/widget/listview/BetterListView;->i:I

    .line 195
    invoke-super {p0, p1, p2}, Landroid/widget/ListView;->onMeasure(II)V

    .line 196
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 201
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v1, v2, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xf

    if-le v1, v2, :cond_2

    .line 208
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 247
    :cond_1
    :goto_0
    return v0

    .line 211
    :cond_2
    iget-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->b:Lcom/facebook/widget/f/a;

    if-nez v1, :cond_3

    .line 213
    new-instance v1, Lcom/facebook/widget/f/a;

    invoke-direct {v1}, Lcom/facebook/widget/f/a;-><init>()V

    iput-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->b:Lcom/facebook/widget/f/a;

    .line 218
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_4

    .line 219
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->isClickable()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->isLongClickable()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 223
    :cond_4
    iget-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->b:Lcom/facebook/widget/f/a;

    invoke-virtual {v1, p1}, Lcom/facebook/widget/f/a;->a(Landroid/view/MotionEvent;)V

    .line 229
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 243
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    if-eqz v0, :cond_5

    .line 244
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 245
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    .line 247
    :cond_5
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 234
    :pswitch_0
    iget-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    if-eqz v1, :cond_6

    .line 235
    iget-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 237
    :cond_6
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/widget/listview/BetterListView;->c:Landroid/view/MotionEvent;

    .line 238
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->invalidate()V

    goto :goto_0

    .line 229
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method protected removeDetachedView(Landroid/view/View;Z)V
    .locals 3

    .prologue
    .line 358
    const/4 v1, 0x1

    .line 359
    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->h:Lcom/facebook/common/b/a;

    invoke-virtual {v0}, Lcom/facebook/common/b/a;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 360
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->h:Lcom/facebook/common/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/common/b/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/widget/listview/c;->a(Lcom/facebook/widget/listview/BetterListView;Landroid/view/View;)Z

    move-result v0

    and-int/2addr v2, v0

    .line 359
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 362
    :cond_0
    if-eqz v2, :cond_1

    .line 363
    invoke-super {p0, p1, p2}, Landroid/widget/ListView;->removeDetachedView(Landroid/view/View;Z)V

    .line 365
    :cond_1
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .prologue
    .line 30
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1

    .prologue
    .line 271
    invoke-virtual {p0}, Lcom/facebook/widget/listview/BetterListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 272
    if-eq v0, p1, :cond_0

    instance-of v0, v0, Lcom/facebook/widget/listview/m;

    if-eqz v0, :cond_0

    .line 274
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/BetterListView;->setRecyclerListener(Landroid/widget/AbsListView$RecyclerListener;)V

    .line 277
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 278
    return-void
.end method

.method public setBroadcastInteractionChanges(Z)V
    .locals 1

    .prologue
    .line 136
    iput-boolean p1, p0, Lcom/facebook/widget/listview/BetterListView;->d:Z

    .line 137
    iget-boolean v0, p0, Lcom/facebook/widget/listview/BetterListView;->d:Z

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->f:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/BetterListView;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 142
    :goto_0
    return-void

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->f:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/BetterListView;->b(Landroid/widget/AbsListView$OnScrollListener;)V

    goto :goto_0
.end method

.method public setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/widget/listview/BetterListView;->a:Lcom/facebook/widget/b/b;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/b/b;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 115
    return-void
.end method
