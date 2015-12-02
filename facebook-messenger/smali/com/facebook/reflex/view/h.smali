.class public Lcom/facebook/reflex/view/h;
.super Lcom/facebook/widget/listview/BetterListView;
.source "ListView.java"

# interfaces
.implements Lcom/facebook/reflex/view/b/r;


# instance fields
.field private final a:Lcom/facebook/reflex/Scroller;

.field private final b:Lcom/facebook/reflex/Container;

.field private final c:Lcom/facebook/reflex/view/c/f;

.field private final d:Lcom/facebook/reflex/view/b/m;

.field private final e:Lcom/facebook/widget/b/b;

.field private final f:Lcom/facebook/common/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/b/a",
            "<",
            "Lcom/facebook/reflex/ah;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/reflex/a/c;

.field private final h:Lcom/facebook/reflex/view/c/o;

.field private final i:Lcom/facebook/reflex/Transaction;

.field private j:Lcom/facebook/reflex/view/c/l;

.field private k:Lcom/facebook/reflex/view/c/d;

.field private l:Landroid/widget/ListAdapter;

.field private m:Lcom/facebook/reflex/view/c/s;

.field private n:F

.field private o:Z

.field private p:I

.field private q:I

.field private r:I

.field private s:Landroid/view/ContextMenu$ContextMenuInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 89
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/reflex/view/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 90
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 93
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/listview/BetterListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    new-instance v0, Lcom/facebook/common/b/a;

    invoke-direct {v0}, Lcom/facebook/common/b/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->f:Lcom/facebook/common/b/a;

    .line 78
    iput v2, p0, Lcom/facebook/reflex/view/h;->p:I

    .line 79
    iput v2, p0, Lcom/facebook/reflex/view/h;->q:I

    .line 80
    iput v2, p0, Lcom/facebook/reflex/view/h;->r:I

    .line 94
    invoke-virtual {p0, v2}, Lcom/facebook/reflex/view/h;->setWillNotDraw(Z)V

    .line 95
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 96
    const-class v0, Lcom/facebook/reflex/Transaction;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/Transaction;

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->i:Lcom/facebook/reflex/Transaction;

    .line 97
    const-class v0, Lcom/facebook/reflex/a/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/a/c;

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->g:Lcom/facebook/reflex/a/c;

    .line 98
    new-instance v0, Lcom/facebook/reflex/Scroller;

    invoke-direct {v0}, Lcom/facebook/reflex/Scroller;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    .line 99
    new-instance v0, Lcom/facebook/reflex/Container;

    invoke-direct {v0}, Lcom/facebook/reflex/Container;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->b:Lcom/facebook/reflex/Container;

    .line 100
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->b:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, v2}, Lcom/facebook/reflex/Container;->a(Z)V

    .line 101
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    iget-object v1, p0, Lcom/facebook/reflex/view/h;->b:Lcom/facebook/reflex/Container;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Scroller;->a(Lcom/facebook/reflex/Widget;)V

    .line 102
    new-instance v0, Lcom/facebook/reflex/view/m;

    invoke-direct {v0, p0, v3}, Lcom/facebook/reflex/view/m;-><init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/view/i;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->c:Lcom/facebook/reflex/view/c/f;

    .line 103
    new-instance v0, Lcom/facebook/reflex/view/c/o;

    iget-object v1, p0, Lcom/facebook/reflex/view/h;->b:Lcom/facebook/reflex/Container;

    invoke-direct {v0, p0, v1}, Lcom/facebook/reflex/view/c/o;-><init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/Container;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->h:Lcom/facebook/reflex/view/c/o;

    .line 104
    new-instance v0, Lcom/facebook/reflex/view/i;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/i;-><init>(Lcom/facebook/reflex/view/h;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->d:Lcom/facebook/reflex/view/b/m;

    .line 112
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->g()V

    .line 114
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    new-instance v1, Lcom/facebook/reflex/view/l;

    invoke-direct {v1, p0, v3}, Lcom/facebook/reflex/view/l;-><init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/view/i;)V

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Scroller;->a(Lcom/facebook/reflex/ah;)V

    .line 115
    new-instance v0, Lcom/facebook/widget/b/b;

    invoke-direct {v0}, Lcom/facebook/widget/b/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->e:Lcom/facebook/widget/b/b;

    .line 117
    sget-object v0, Lcom/facebook/q;->ListView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 118
    iget-object v1, p0, Lcom/facebook/reflex/view/h;->h:Lcom/facebook/reflex/view/c/o;

    sget v2, Lcom/facebook/q;->ListView_selectorColor:I

    const v3, -0xa06f01

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/reflex/view/c/o;->a(I)V

    .line 122
    iget-object v1, p0, Lcom/facebook/reflex/view/h;->h:Lcom/facebook/reflex/view/c/o;

    sget v2, Lcom/facebook/q;->ListView_longpressSelectorColor:I

    const v3, -0xc19a4d

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/reflex/view/c/o;->b(I)V

    .line 126
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 127
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/h;F)F
    .locals 0

    .prologue
    .line 59
    iput p1, p0, Lcom/facebook/reflex/view/h;->n:F

    return p1
.end method

.method static synthetic a(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/view/c/d;)Lcom/facebook/reflex/view/c/d;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/o;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->h:Lcom/facebook/reflex/view/c/o;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/reflex/view/h;Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/widget/AbsListView;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/h;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 59
    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/h;->detachViewFromParent(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/h;Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 59
    invoke-virtual {p0, p1, p2}, Lcom/facebook/reflex/view/h;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/h;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/reflex/view/h;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/d;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/reflex/view/h;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 59
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/reflex/view/h;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic c(Lcom/facebook/reflex/view/h;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->i()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/Scroller;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/s;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/f;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->c:Lcom/facebook/reflex/view/c/f;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/Transaction;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->i:Lcom/facebook/reflex/Transaction;

    return-object v0
.end method

.method private g()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 136
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    if-nez v0, :cond_0

    .line 145
    :goto_0
    return-void

    .line 139
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 140
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    .line 141
    :goto_1
    if-eqz v3, :cond_4

    instance-of v4, v0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v4, :cond_4

    .line 142
    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getAlpha()I

    move-result v0

    if-lez v0, :cond_2

    move v0, v1

    .line 144
    :goto_2
    iget-object v1, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/reflex/view/h;->d:Lcom/facebook/reflex/view/b/m;

    :goto_3
    invoke-virtual {v1, v0}, Lcom/facebook/reflex/Scroller;->a(Lcom/facebook/reflex/d;)V

    goto :goto_0

    :cond_1
    move v3, v2

    .line 140
    goto :goto_1

    :cond_2
    move v0, v2

    .line 142
    goto :goto_2

    .line 144
    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    :cond_4
    move v0, v3

    goto :goto_2
.end method

.method static synthetic h(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/a/c;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->g:Lcom/facebook/reflex/a/c;

    return-object v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 241
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    if-eqz v0, :cond_0

    .line 242
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/h;->o:Z

    .line 243
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    iget v1, p0, Lcom/facebook/reflex/view/h;->n:F

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/d;->a(F)V

    .line 244
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/view/h;->o:Z

    .line 246
    :cond_0
    return-void
.end method

.method private i()V
    .locals 3

    .prologue
    .line 466
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    if-eqz v0, :cond_0

    .line 467
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    iget v1, p0, Lcom/facebook/reflex/view/h;->p:I

    iget v2, p0, Lcom/facebook/reflex/view/h;->r:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/d;->a(I)V

    .line 468
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    iget v1, p0, Lcom/facebook/reflex/view/h;->q:I

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/d;->b(I)V

    .line 470
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/facebook/reflex/view/h;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->h()V

    return-void
.end method

.method static synthetic j(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/Container;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->b:Lcom/facebook/reflex/Container;

    return-object v0
.end method

.method static synthetic k(Lcom/facebook/reflex/view/h;)Lcom/facebook/common/b/a;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->f:Lcom/facebook/common/b/a;

    return-object v0
.end method

.method static synthetic l(Lcom/facebook/reflex/view/h;)F
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/facebook/reflex/view/h;->n:F

    return v0
.end method

.method static synthetic m(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/l;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    return-object v0
.end method

.method static synthetic n(Lcom/facebook/reflex/view/h;)Lcom/facebook/widget/b/b;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->e:Lcom/facebook/widget/b/b;

    return-object v0
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .prologue
    .line 479
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/d;->d(I)I

    move-result v0

    return v0
.end method

.method public a(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->e:Lcom/facebook/widget/b/b;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/b/b;->b(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 388
    return-void
.end method

.method public a(Lcom/facebook/reflex/ah;)V
    .locals 1

    .prologue
    .line 396
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->f:Lcom/facebook/common/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/common/b/a;->add(Ljava/lang/Object;)Z

    .line 397
    return-void
.end method

.method public b(I)I
    .locals 1

    .prologue
    .line 484
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v0

    return v0
.end method

.method public b(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->e:Lcom/facebook/widget/b/b;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/b/b;->c(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 393
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 362
    const/4 v0, 0x1

    return v0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 373
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 150
    const/4 v0, 0x1

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 250
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/facebook/widget/listview/BetterListView;->draw(Landroid/graphics/Canvas;)V

    .line 251
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->d:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/m;->f()V

    .line 368
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 377
    return-object p0
.end method

.method public bridge synthetic getAdapter()Landroid/widget/Adapter;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    return-object v0
.end method

.method public getAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 474
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->l:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 357
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    return-object v0
.end method

.method protected getContextMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->s:Landroid/view/ContextMenu$ContextMenuInfo;

    return-object v0
.end method

.method public getFirstVisiblePosition()I
    .locals 2

    .prologue
    .line 415
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    if-nez v0, :cond_0

    .line 416
    const/4 v0, 0x0

    .line 418
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    iget v1, p0, Lcom/facebook/reflex/view/h;->n:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v0

    goto :goto_0
.end method

.method public getLastVisiblePosition()I
    .locals 4

    .prologue
    .line 423
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    if-nez v0, :cond_0

    .line 424
    const/4 v0, 0x0

    .line 426
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    iget v2, p0, Lcom/facebook/reflex/view/h;->n:F

    iget-object v3, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v3}, Lcom/facebook/reflex/Scroller;->g()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0
.end method

.method public getOverflowListOverlap()I
    .locals 1

    .prologue
    .line 457
    iget v0, p0, Lcom/facebook/reflex/view/h;->r:I

    return v0
.end method

.method public getPaddingBottom()I
    .locals 1

    .prologue
    .line 448
    iget v0, p0, Lcom/facebook/reflex/view/h;->q:I

    return v0
.end method

.method public getPaddingTop()I
    .locals 1

    .prologue
    .line 438
    iget v0, p0, Lcom/facebook/reflex/view/h;->p:I

    return v0
.end method

.method public getRefreshableInterface()Lcom/facebook/widget/refreshablelistview/b;
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 157
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Lcom/facebook/reflex/view/c/n;

    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/reflex/view/c/n;-><init>(Landroid/content/Context;)V

    .line 162
    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v3, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 163
    invoke-virtual {p0, v0, v3, v1}, Lcom/facebook/reflex/view/h;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 164
    iget-object v1, p0, Lcom/facebook/reflex/view/h;->b:Lcom/facebook/reflex/Container;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/n;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/Widget;)V

    .line 165
    new-instance v1, Lcom/facebook/reflex/view/c/l;

    iget-object v2, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    invoke-direct {v1, p0, v2, v0}, Lcom/facebook/reflex/view/c/l;-><init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/Scroller;Lcom/facebook/reflex/view/c/n;)V

    iput-object v1, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 185
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getScrollX()I

    move-result v0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 195
    iget v0, p0, Lcom/facebook/reflex/view/h;->n:F

    float-to-int v0, v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 265
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 266
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 260
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 261
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 255
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 256
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 270
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 271
    const/4 v0, 0x0

    return-object v0
.end method

.method protected layoutChildren()V
    .locals 0

    .prologue
    .line 238
    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .prologue
    .line 228
    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .prologue
    .line 233
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Scroller;->a(II)V

    .line 201
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/l;->c()V

    .line 204
    :cond_0
    sub-int v0, p4, p2

    iget-object v1, p0, Lcom/facebook/reflex/view/h;->d:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/b/m;->f_()I

    move-result v1

    if-ne v0, v1, :cond_1

    sub-int v0, p5, p3

    iget-object v1, p0, Lcom/facebook/reflex/view/h;->d:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/b/m;->b()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 205
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->d:Lcom/facebook/reflex/view/b/m;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/m;->a(II)V

    .line 207
    :cond_2
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->h()V

    .line 208
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 212
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lcom/facebook/reflex/view/h;->getDefaultSize(II)I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v1, p2}, Lcom/facebook/reflex/view/h;->getDefaultSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/reflex/view/h;->setMeasuredDimension(II)V

    .line 215
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->j:Lcom/facebook/reflex/view/c/l;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/l;->d()V

    .line 218
    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 223
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 276
    iget-boolean v0, p0, Lcom/facebook/reflex/view/h;->o:Z

    if-nez v0, :cond_0

    .line 277
    invoke-super {p0}, Lcom/facebook/widget/listview/BetterListView;->requestLayout()V

    .line 279
    :cond_0
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .prologue
    .line 59
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/facebook/reflex/view/h;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1

    .prologue
    .line 289
    if-nez p1, :cond_0

    .line 290
    const/4 v0, 0x0

    check-cast v0, Lcom/facebook/reflex/view/c/s;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/h;->setAdapter(Lcom/facebook/reflex/view/c/s;)V

    .line 294
    :goto_0
    iput-object p1, p0, Lcom/facebook/reflex/view/h;->l:Landroid/widget/ListAdapter;

    .line 295
    return-void

    .line 292
    :cond_0
    new-instance v0, Lcom/facebook/reflex/view/c/a;

    invoke-direct {v0, p1, p0}, Lcom/facebook/reflex/view/c/a;-><init>(Landroid/widget/Adapter;Landroid/view/ViewGroup;)V

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/h;->setAdapter(Lcom/facebook/reflex/view/c/i;)V

    goto :goto_0
.end method

.method public setAdapter(Lcom/facebook/reflex/view/c/i;)V
    .locals 1

    .prologue
    .line 298
    if-nez p1, :cond_0

    .line 299
    const/4 v0, 0x0

    check-cast v0, Lcom/facebook/reflex/view/c/s;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/h;->setAdapter(Lcom/facebook/reflex/view/c/s;)V

    .line 303
    :goto_0
    return-void

    .line 301
    :cond_0
    new-instance v0, Lcom/facebook/reflex/view/c/j;

    invoke-direct {v0, p1}, Lcom/facebook/reflex/view/c/j;-><init>(Lcom/facebook/reflex/view/c/i;)V

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/h;->setAdapter(Lcom/facebook/reflex/view/c/s;)V

    goto :goto_0
.end method

.method public setAdapter(Lcom/facebook/reflex/view/c/s;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 306
    iput-object v1, p0, Lcom/facebook/reflex/view/h;->l:Landroid/widget/ListAdapter;

    .line 307
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/d;->a()V

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    if-eqz v0, :cond_1

    .line 311
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/view/c/s;->a(Landroid/database/DataSetObserver;)V

    .line 312
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/s;->c()V

    .line 314
    :cond_1
    iput-object p1, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    .line 315
    iput-object v1, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    .line 316
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    if-eqz v0, :cond_2

    .line 317
    new-instance v0, Lcom/facebook/reflex/view/c/d;

    iget-object v1, p0, Lcom/facebook/reflex/view/h;->a:Lcom/facebook/reflex/Scroller;

    iget-object v2, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    iget-object v3, p0, Lcom/facebook/reflex/view/h;->c:Lcom/facebook/reflex/view/c/f;

    iget-object v4, p0, Lcom/facebook/reflex/view/h;->i:Lcom/facebook/reflex/Transaction;

    iget-object v5, p0, Lcom/facebook/reflex/view/h;->g:Lcom/facebook/reflex/a/c;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/reflex/view/c/d;-><init>(Lcom/facebook/reflex/Scroller;Lcom/facebook/reflex/view/c/s;Lcom/facebook/reflex/view/c/f;Lcom/facebook/reflex/Transaction;Lcom/facebook/reflex/a/c;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/h;->k:Lcom/facebook/reflex/view/c/d;

    .line 323
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->m:Lcom/facebook/reflex/view/c/s;

    new-instance v1, Lcom/facebook/reflex/view/j;

    invoke-direct {v1, p0}, Lcom/facebook/reflex/view/j;-><init>(Lcom/facebook/reflex/view/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/reflex/view/c/s;->a(Landroid/database/DataSetObserver;)V

    .line 347
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/reflex/view/h;->requestLayout()V

    .line 348
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 131
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->g()V

    .line 132
    invoke-super {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 133
    return-void
.end method

.method public setBroadcastInteractionChanges(Z)V
    .locals 0

    .prologue
    .line 406
    return-void
.end method

.method public setContextMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/reflex/view/h;->s:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 176
    return-void
.end method

.method public setLongClickable(Z)V
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->h:Lcom/facebook/reflex/view/c/o;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/o;->a(Z)V

    .line 284
    invoke-super {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->setLongClickable(Z)V

    .line 285
    return-void
.end method

.method public setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lcom/facebook/reflex/view/h;->e:Lcom/facebook/widget/b/b;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/b/b;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 383
    return-void
.end method

.method public setOverflowListOverlap(I)V
    .locals 0

    .prologue
    .line 461
    iput p1, p0, Lcom/facebook/reflex/view/h;->r:I

    .line 462
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->i()V

    .line 463
    return-void
.end method

.method public setPaddingBottom(I)V
    .locals 0

    .prologue
    .line 452
    iput p1, p0, Lcom/facebook/reflex/view/h;->q:I

    .line 453
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->i()V

    .line 454
    return-void
.end method

.method public setPaddingTop(I)V
    .locals 0

    .prologue
    .line 442
    iput p1, p0, Lcom/facebook/reflex/view/h;->p:I

    .line 443
    invoke-direct {p0}, Lcom/facebook/reflex/view/h;->i()V

    .line 444
    return-void
.end method

.method public setSelection(I)V
    .locals 0

    .prologue
    .line 434
    return-void
.end method

.method public smoothScrollBy(II)V
    .locals 0

    .prologue
    .line 411
    return-void
.end method
