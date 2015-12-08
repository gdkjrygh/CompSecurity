.class public abstract Lcom/roidapp/baselib/hlistview/AbsHListView;
.super Lcom/roidapp/baselib/hlistview/AdapterView;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/hlistview/AdapterView",
        "<",
        "Landroid/widget/ListAdapter;",
        ">;",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;"
    }
.end annotation


# static fields
.field static final T:Landroid/view/animation/Interpolator;

.field public static final U:[I


# instance fields
.field protected A:I

.field B:I

.field C:I

.field D:I

.field E:I

.field protected F:I

.field G:I

.field H:I

.field protected I:Lcom/roidapp/baselib/hlistview/l;

.field protected J:I

.field protected K:Z

.field L:Z

.field protected M:I

.field protected N:I

.field protected O:Ljava/lang/Runnable;

.field protected final P:[Z

.field Q:I

.field R:I

.field protected S:Z

.field a:Lcom/roidapp/baselib/hlistview/ag;

.field private aA:I

.field private aB:Lcom/roidapp/baselib/hlistview/e;

.field private aC:Ljava/lang/Runnable;

.field private aD:Lcom/roidapp/baselib/hlistview/d;

.field private aE:Lcom/roidapp/baselib/hlistview/k;

.field private aF:Ljava/lang/Runnable;

.field private aG:I

.field private aH:I

.field private aI:Z

.field private aJ:I

.field private aK:I

.field private aL:Ljava/lang/Runnable;

.field private aM:I

.field private aN:I

.field private aO:F

.field private aP:I

.field private aQ:Lcom/roidapp/baselib/hlistview/w;

.field private aR:Lcom/roidapp/baselib/hlistview/w;

.field private aS:I

.field private aT:I

.field private aU:I

.field private aV:Z

.field private aW:I

.field private aX:I

.field private aY:Lcom/roidapp/baselib/hlistview/i;

.field private aZ:I

.field private au:Landroid/view/VelocityTracker;

.field private av:Lcom/roidapp/baselib/hlistview/g;

.field private aw:Lcom/roidapp/baselib/hlistview/j;

.field private ax:Z

.field private ay:Landroid/graphics/Rect;

.field private az:Landroid/view/ContextMenu$ContextMenuInfo;

.field protected b:I

.field private ba:I

.field private bb:I

.field private bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

.field private bd:F

.field public c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:I

.field protected f:Landroid/support/v4/util/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SparseArrayCompat",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field g:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected h:I

.field protected i:Lcom/roidapp/baselib/hlistview/c;

.field protected j:Landroid/widget/ListAdapter;

.field k:Z

.field l:Z

.field m:Landroid/graphics/drawable/Drawable;

.field n:I

.field protected o:Landroid/graphics/Rect;

.field protected final p:Lcom/roidapp/baselib/hlistview/n;

.field q:I

.field r:I

.field s:I

.field t:I

.field protected u:Landroid/graphics/Rect;

.field protected v:I

.field w:Landroid/view/View;

.field x:Landroid/view/View;

.field protected y:Z

.field protected z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 539
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->T:Landroid/view/animation/Interpolator;

    .line 2282
    const/4 v0, 0x1

    new-array v0, v0, [I

    aput v1, v0, v1

    sput-object v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->U:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 615
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;-><init>(Landroid/content/Context;)V

    .line 160
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    .line 194
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 214
    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->l:Z

    .line 224
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    .line 229
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    .line 234
    new-instance v0, Lcom/roidapp/baselib/hlistview/n;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/n;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    .line 239
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->q:I

    .line 244
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->r:I

    .line 249
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->s:I

    .line 254
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->t:I

    .line 259
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    .line 264
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->v:I

    .line 310
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 341
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->J:I

    .line 366
    iput-boolean v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ax:Z

    .line 376
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->az:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 403
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aA:I

    .line 448
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aJ:I

    .line 456
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aO:F

    .line 458
    new-array v0, v3, [Z

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->P:[Z

    .line 463
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 508
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aU:I

    .line 616
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->z()V

    .line 617
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 620
    sget v0, Lcom/roidapp/baselib/b;->a:I

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 621
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .prologue
    .line 624
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/baselib/hlistview/AdapterView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 160
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    .line 194
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 214
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->l:Z

    .line 224
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    .line 229
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    .line 234
    new-instance v0, Lcom/roidapp/baselib/hlistview/n;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/n;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    .line 239
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->q:I

    .line 244
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->r:I

    .line 249
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->s:I

    .line 254
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->t:I

    .line 259
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    .line 264
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->v:I

    .line 310
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 341
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->J:I

    .line 366
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ax:Z

    .line 376
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->az:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 403
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aA:I

    .line 448
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aJ:I

    .line 456
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aO:F

    .line 458
    const/4 v0, 0x1

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->P:[Z

    .line 463
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 508
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aU:I

    .line 630
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->z()V

    .line 632
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 634
    sget-object v1, Lcom/roidapp/baselib/i;->a:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, p3, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    .line 636
    const/4 v7, 0x0

    .line 637
    const/4 v6, 0x0

    .line 638
    const/4 v5, 0x0

    .line 639
    const/4 v4, 0x1

    .line 640
    const/4 v3, 0x0

    .line 641
    const/4 v2, 0x0

    .line 642
    const/4 v1, 0x1

    .line 643
    const/4 v0, 0x0

    .line 645
    if-eqz v8, :cond_0

    .line 646
    sget v0, Lcom/roidapp/baselib/i;->e:I

    invoke-virtual {v8, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 647
    sget v0, Lcom/roidapp/baselib/i;->d:I

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    .line 648
    sget v0, Lcom/roidapp/baselib/i;->h:I

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    .line 649
    sget v0, Lcom/roidapp/baselib/i;->f:I

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 650
    sget v0, Lcom/roidapp/baselib/i;->i:I

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 651
    sget v0, Lcom/roidapp/baselib/i;->b:I

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 652
    sget v0, Lcom/roidapp/baselib/i;->g:I

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 653
    sget v0, Lcom/roidapp/baselib/i;->c:I

    const/4 v9, 0x0

    invoke-virtual {v8, v0, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 654
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 668
    :cond_0
    if-eqz v7, :cond_1

    .line 669
    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 672
    :cond_1
    iput-boolean v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->l:Z

    .line 6271
    iget-boolean v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->K:Z

    if-eq v6, v5, :cond_2

    .line 6272
    iput-boolean v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->K:Z

    .line 6278
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v5

    if-lez v5, :cond_2

    .line 6279
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c()V

    .line 6280
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->requestLayout()V

    .line 6281
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 674
    :cond_2
    invoke-direct {p0, v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Z)V

    .line 7246
    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aG:I

    .line 676
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->h(I)V

    .line 8097
    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ax:Z

    .line 9013
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    .line 9015
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    .line 9016
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 9018
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_3

    .line 9019
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode;

    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 9021
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    .line 9025
    :cond_4
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-eqz v0, :cond_7

    .line 9026
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    if-nez v0, :cond_5

    .line 9027
    new-instance v0, Landroid/support/v4/util/SparseArrayCompat;

    invoke-direct {v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    .line 9029
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 9030
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    .line 9033
    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_7

    .line 9034
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 9035
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a()V

    .line 9036
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setLongClickable(Z)V

    .line 679
    :cond_7
    return-void
.end method

.method private A()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1067
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v2

    .line 1068
    if-nez v2, :cond_1

    .line 1071
    :cond_0
    :goto_0
    return v0

    .line 1069
    :cond_1
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-eq v2, v3, :cond_2

    move v0, v1

    goto :goto_0

    .line 1071
    :cond_2
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    if-lt v3, v4, :cond_3

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    sub-int/2addr v3, v4

    if-le v2, v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method private B()Z
    .locals 1

    .prologue
    .line 2160
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    packed-switch v0, :pswitch_data_0

    .line 2165
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 2163
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 2160
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private C()V
    .locals 2

    .prologue
    .line 2285
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2286
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2287
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 2292
    :cond_0
    :goto_0
    return-void

    .line 2289
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    sget-object v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->U:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0
.end method

.method private D()V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 2955
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ag;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2956
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 2958
    :cond_0
    return-void
.end method

.method private E()V
    .locals 1

    .prologue
    .line 3503
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 3504
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    .line 3506
    :cond_0
    return-void
.end method

.method private F()V
    .locals 1

    .prologue
    .line 3509
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 3510
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 3511
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    .line 3513
    :cond_0
    return-void
.end method

.method private G()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 4511
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->L:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ag;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4512
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setChildrenDrawnWithCacheEnabled(Z)V

    .line 4513
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setChildrenDrawingCacheEnabled(Z)V

    .line 4514
    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->z:Z

    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->y:Z

    .line 4516
    :cond_0
    return-void
.end method

.method private H()V
    .locals 1

    .prologue
    .line 4519
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ag;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4520
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aL:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 4521
    new-instance v0, Lcom/roidapp/baselib/hlistview/b;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/b;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aL:Ljava/lang/Runnable;

    .line 4538
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aL:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->post(Ljava/lang/Runnable;)Z

    .line 4540
    :cond_1
    return-void
.end method

.method private I()Z
    .locals 14

    .prologue
    const/4 v1, 0x1

    const/4 v6, -0x1

    const/4 v2, 0x0

    .line 4843
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v9

    .line 4845
    if-gtz v9, :cond_1

    .line 4940
    :cond_0
    :goto_0
    return v2

    .line 4851
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v5, v0, Landroid/graphics/Rect;->left:I

    .line 4852
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getRight()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getLeft()I

    move-result v3

    sub-int/2addr v0, v3

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    sub-int v7, v0, v3

    .line 4853
    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 4854
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 4857
    if-lt v3, v4, :cond_5

    add-int v0, v4, v9

    if-ge v3, v0, :cond_5

    .line 4860
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 4861
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 4862
    invoke-virtual {v8}, Landroid/view/View;->getRight()I

    move-result v9

    .line 4865
    if-ge v0, v5, :cond_3

    .line 4866
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHorizontalFadingEdgeLength()I

    move-result v0

    add-int/2addr v0, v5

    move v5, v0

    move v0, v1

    .line 4921
    :goto_1
    iput v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 4922
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4923
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v7, :cond_2

    .line 4924
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v7}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 4926
    :cond_2
    iput v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 4927
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->H()V

    .line 4928
    iput v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->W:I

    .line 4929
    invoke-virtual {p0, v3, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IZ)I

    move-result v0

    .line 4930
    if-lt v0, v4, :cond_c

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->u()I

    move-result v3

    if-gt v0, v3, :cond_c

    .line 4931
    const/4 v3, 0x4

    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 4932
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->C()V

    .line 4933
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->g(I)V

    .line 4934
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b()V

    .line 4938
    :goto_2
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    .line 4940
    if-ltz v0, :cond_0

    move v2, v1

    goto :goto_0

    .line 4867
    :cond_3
    if-le v9, v7, :cond_4

    .line 4868
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int v0, v7, v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHorizontalFadingEdgeLength()I

    move-result v5

    sub-int/2addr v0, v5

    :cond_4
    move v5, v0

    move v0, v1

    .line 4870
    goto :goto_1

    .line 4871
    :cond_5
    if-ge v3, v4, :cond_9

    move v7, v2

    move v0, v2

    .line 4874
    :goto_3
    if-ge v7, v9, :cond_8

    .line 4875
    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 4876
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 4878
    if-nez v7, :cond_11

    .line 4882
    if-gtz v4, :cond_6

    if-ge v3, v5, :cond_10

    .line 4885
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHorizontalFadingEdgeLength()I

    move-result v0

    add-int/2addr v0, v5

    move v5, v3

    .line 4888
    :goto_4
    if-lt v3, v0, :cond_7

    .line 4890
    add-int v0, v4, v7

    move v5, v3

    move v3, v0

    move v0, v1

    .line 4892
    goto :goto_1

    .line 4874
    :cond_7
    add-int/lit8 v3, v7, 0x1

    move v7, v3

    move v13, v0

    move v0, v5

    move v5, v13

    goto :goto_3

    :cond_8
    move v3, v4

    move v5, v0

    move v0, v1

    goto :goto_1

    .line 4896
    :cond_9
    iget v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    .line 4898
    add-int v0, v4, v9

    add-int/lit8 v0, v0, -0x1

    .line 4900
    add-int/lit8 v3, v9, -0x1

    move v8, v3

    move v5, v2

    :goto_5
    if-ltz v8, :cond_f

    .line 4901
    invoke-virtual {p0, v8}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 4902
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 4903
    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v11

    .line 4905
    add-int/lit8 v12, v9, -0x1

    if-ne v8, v12, :cond_e

    .line 4907
    add-int v5, v4, v9

    if-lt v5, v10, :cond_a

    if-le v11, v7, :cond_d

    .line 4908
    :cond_a
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHorizontalFadingEdgeLength()I

    move-result v5

    sub-int v5, v7, v5

    move v7, v3

    .line 4912
    :goto_6
    if-gt v11, v5, :cond_b

    .line 4913
    add-int v0, v4, v8

    move v5, v3

    move v3, v0

    move v0, v2

    .line 4915
    goto/16 :goto_1

    .line 4900
    :cond_b
    add-int/lit8 v3, v8, -0x1

    move v8, v3

    move v13, v5

    move v5, v7

    move v7, v13

    goto :goto_5

    :cond_c
    move v0, v6

    .line 4936
    goto :goto_2

    :cond_d
    move v5, v7

    move v7, v3

    goto :goto_6

    :cond_e
    move v13, v7

    move v7, v5

    move v5, v13

    goto :goto_6

    :cond_f
    move v3, v0

    move v0, v2

    goto/16 :goto_1

    :cond_10
    move v0, v5

    move v5, v3

    goto :goto_4

    :cond_11
    move v13, v5

    move v5, v0

    move v0, v13

    goto :goto_4
.end method

.method private J()V
    .locals 1

    .prologue
    .line 5330
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    if-eqz v0, :cond_0

    .line 5331
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->b()V

    .line 5332
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->b()V

    .line 5334
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/hlistview/AbsHListView;)I
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWindowAttachCount()I

    move-result v0

    return v0
.end method

.method static a(Ljava/util/ArrayList;I)Landroid/view/View;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;I)",
            "Landroid/view/View;"
        }
    .end annotation

    .prologue
    .line 5840
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 5841
    if-lez v3, :cond_2

    .line 5843
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v3, :cond_1

    .line 5844
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 5845
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    iget v1, v1, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->d:I

    if-ne v1, p1, :cond_0

    .line 5846
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 5852
    :goto_1
    return-object v0

    .line 5843
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 5850
    :cond_1
    add-int/lit8 v0, v3, -0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_1

    .line 5852
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/baselib/hlistview/AbsHListView;Lcom/roidapp/baselib/hlistview/e;)Lcom/roidapp/baselib/hlistview/e;
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aB:Lcom/roidapp/baselib/hlistview/e;

    return-object p1
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 2180
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2181
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    .line 2182
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 2183
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 2185
    :cond_0
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 3611
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const v2, 0xff00

    and-int/2addr v0, v2

    shr-int/lit8 v0, v0, 0x8

    .line 3613
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 3614
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    if-ne v2, v3, :cond_0

    .line 3618
    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3619
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 3620
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->E:I

    .line 3621
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    .line 3622
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 3624
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 3618
    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/hlistview/AbsHListView;III)Z
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 54
    move-object v0, p0

    move v1, p1

    move v3, p2

    move v4, v2

    move v5, v2

    move v6, v2

    move v7, p3

    move v8, v2

    move v9, v2

    invoke-virtual/range {v0 .. v9}, Lcom/roidapp/baselib/hlistview/AbsHListView;->overScrollBy(IIIIIIIIZ)Z

    move-result v0

    return v0
.end method

.method private b(II)I
    .locals 4

    .prologue
    .line 2680
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ay:Landroid/graphics/Rect;

    .line 2681
    if-nez v0, :cond_0

    .line 2682
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ay:Landroid/graphics/Rect;

    .line 2683
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ay:Landroid/graphics/Rect;

    .line 2686
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 2687
    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    .line 2688
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2689
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 2690
    invoke-virtual {v2, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 2691
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2692
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v0, v1

    .line 2696
    :goto_1
    return v0

    .line 2687
    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 2696
    :cond_2
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static synthetic b(Lcom/roidapp/baselib/hlistview/AbsHListView;)I
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWindowAttachCount()I

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method private b(Z)V
    .locals 1

    .prologue
    .line 1231
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->L:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 1232
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->H()V

    .line 1234
    :cond_0
    iput-boolean p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->L:Z

    .line 1235
    return-void
.end method

.method static synthetic b(Lcom/roidapp/baselib/hlistview/AbsHListView;III)Z
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 54
    move-object v0, p0

    move v1, p1

    move v3, p2

    move v4, v2

    move v5, v2

    move v6, v2

    move v7, p3

    move v8, v2

    move v9, v2

    invoke-virtual/range {v0 .. v9}, Lcom/roidapp/baselib/hlistview/AbsHListView;->overScrollBy(IIIIIIIIZ)Z

    move-result v0

    return v0
.end method

.method private static c(Landroid/view/View;IJ)Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 2

    .prologue
    .line 2467
    new-instance v0, Lcom/roidapp/baselib/hlistview/q;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/roidapp/baselib/hlistview/q;-><init>(Landroid/view/View;IJ)V

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/e;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aB:Lcom/roidapp/baselib/hlistview/e;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method static synthetic d(Lcom/roidapp/baselib/hlistview/AbsHListView;)I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/baselib/hlistview/AbsHListView;)Landroid/view/VelocityTracker;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method static synthetic f(Lcom/roidapp/baselib/hlistview/AbsHListView;)I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aN:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/baselib/hlistview/AbsHListView;)I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aM:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/baselib/hlistview/AbsHListView;)Z
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->A()Z

    move-result v0

    return v0
.end method

.method static synthetic i(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/w;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/w;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->H()V

    return-void
.end method

.method static synthetic l(Lcom/roidapp/baselib/hlistview/AbsHListView;)Z
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 54
    move-object v0, p0

    move v2, v1

    move v3, v1

    move v4, v1

    move v5, v1

    move v6, v1

    move v7, v1

    move v8, v1

    move v9, v1

    invoke-virtual/range {v0 .. v9}, Lcom/roidapp/baselib/hlistview/AbsHListView;->overScrollBy(IIIIIIIIZ)Z

    move-result v0

    return v0
.end method

.method static synthetic m(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setChildrenDrawnWithCacheEnabled(Z)V

    return-void
.end method

.method static synthetic n(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setChildrenDrawingCacheEnabled(Z)V

    return-void
.end method

.method private n(I)Z
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 2768
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    sub-int v2, p1, v0

    .line 2769
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 2770
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v0

    if-eqz v0, :cond_5

    move v0, v3

    .line 2771
    :goto_0
    if-nez v0, :cond_0

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aK:I

    if-le v4, v5, :cond_4

    .line 2772
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->G()V

    .line 2773
    if-eqz v0, :cond_6

    .line 2774
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    move v0, v1

    move-object v2, p0

    .line 2778
    :goto_1
    iput v0, v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    .line 2780
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    .line 2784
    if-eqz v0, :cond_1

    .line 2785
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aB:Lcom/roidapp/baselib/hlistview/e;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2787
    :cond_1
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 2788
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2789
    if-eqz v0, :cond_2

    .line 2790
    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 2792
    :cond_2
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    .line 2795
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2796
    if-eqz v0, :cond_3

    .line 2797
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2799
    :cond_3
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->o(I)V

    move v1, v3

    .line 2803
    :cond_4
    return v1

    :cond_5
    move v0, v1

    .line 2770
    goto :goto_0

    .line 2777
    :cond_6
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 2778
    if-lez v2, :cond_7

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aK:I

    move-object v2, p0

    goto :goto_1

    :cond_7
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aK:I

    neg-int v0, v0

    move-object v2, p0

    goto :goto_1
.end method

.method private o(I)V
    .locals 13

    .prologue
    .line 2807
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    sub-int v12, p1, v0

    .line 2808
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    sub-int v1, v12, v0

    .line 2809
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    const/high16 v2, -0x80000000

    if-eq v0, v2, :cond_7

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    sub-int v0, p1, v0

    .line 2811
    :goto_0
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_b

    .line 2813
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    if-eq p1, v2, :cond_6

    .line 2817
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aK:I

    if-le v2, v3, :cond_0

    .line 2818
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    .line 2819
    if-eqz v2, :cond_0

    .line 2820
    const/4 v3, 0x1

    invoke-interface {v2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2825
    :cond_0
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    if-ltz v2, :cond_8

    .line 2826
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v2, v3

    .line 2833
    :goto_1
    const/4 v3, 0x0

    .line 2834
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 2835
    if-eqz v4, :cond_1c

    .line 2836
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v3

    move v4, v3

    .line 2840
    :goto_2
    const/4 v3, 0x0

    .line 2841
    if-eqz v0, :cond_1b

    .line 2842
    invoke-virtual {p0, v1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(II)Z

    move-result v1

    .line 2846
    :goto_3
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2847
    if-eqz v2, :cond_5

    .line 2850
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 2851
    if-eqz v1, :cond_4

    .line 2854
    neg-int v0, v0

    sub-int v1, v2, v4

    sub-int v1, v0, v1

    .line 2855
    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->Q:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v9}, Lcom/roidapp/baselib/hlistview/AbsHListView;->overScrollBy(IIIIIIIIZ)Z

    .line 2856
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->Q:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-ne v0, v2, :cond_1

    .line 2858
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_1

    .line 2859
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 2863
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getOverScrollMode()I

    move-result v0

    .line 2865
    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->A()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2867
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aU:I

    .line 2868
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 2869
    if-lez v12, :cond_9

    .line 2870
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(F)V

    .line 2871
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2872
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 2874
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(Z)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate(Landroid/graphics/Rect;)V

    .line 2884
    :cond_4
    :goto_4
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 2886
    :cond_5
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    .line 2951
    :cond_6
    :goto_5
    return-void

    :cond_7
    move v0, v1

    .line 2809
    goto/16 :goto_0

    .line 2830
    :cond_8
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    goto/16 :goto_1

    .line 2875
    :cond_9
    if-gez v12, :cond_4

    .line 2876
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(F)V

    .line 2877
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->a()Z

    move-result v0

    if-nez v0, :cond_a

    .line 2878
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 2880
    :cond_a
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(Z)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_4

    .line 2888
    :cond_b
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_6

    .line 2889
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    if-eq p1, v1, :cond_6

    .line 2890
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v2

    .line 2891
    sub-int v3, v2, v0

    .line 2892
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    if-le p1, v1, :cond_15

    const/4 v1, 0x1

    move v10, v1

    .line 2894
    :goto_6
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aU:I

    if-nez v1, :cond_c

    .line 2895
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aU:I

    .line 2898
    :cond_c
    neg-int v1, v0

    .line 2899
    if-gez v3, :cond_d

    if-gez v2, :cond_e

    :cond_d
    if-lez v3, :cond_16

    if-gtz v2, :cond_16

    .line 2900
    :cond_e
    neg-int v1, v2

    .line 2901
    add-int/2addr v0, v1

    move v11, v0

    .line 2906
    :goto_7
    if-eqz v1, :cond_11

    .line 2907
    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->Q:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v9}, Lcom/roidapp/baselib/hlistview/AbsHListView;->overScrollBy(IIIIIIIIZ)Z

    .line 2908
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getOverScrollMode()I

    move-result v0

    .line 2909
    if-eqz v0, :cond_f

    const/4 v2, 0x1

    if-ne v0, v2, :cond_11

    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->A()Z

    move-result v0

    if-nez v0, :cond_11

    .line 2910
    :cond_f
    if-lez v12, :cond_17

    .line 2911
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(F)V

    .line 2912
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->a()Z

    move-result v0

    if-nez v0, :cond_10

    .line 2913
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 2915
    :cond_10
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(Z)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate(Landroid/graphics/Rect;)V

    .line 2926
    :cond_11
    :goto_8
    if-eqz v11, :cond_14

    .line 2928
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v0

    if-eqz v0, :cond_12

    .line 2929
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/ag;->a(I)V

    .line 2930
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->D()V

    .line 2933
    :cond_12
    invoke-virtual {p0, v11, v11}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(II)Z

    .line 2935
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 14799
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 14800
    if-nez v1, :cond_19

    .line 14801
    const/4 v0, -0x1

    .line 2941
    :cond_13
    :goto_9
    const/4 v1, 0x0

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    .line 2942
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v1, v0, v1

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2943
    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    :goto_a
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    .line 2944
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 2945
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 2947
    :cond_14
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    .line 2948
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aU:I

    goto/16 :goto_5

    .line 2892
    :cond_15
    const/4 v1, -0x1

    move v10, v1

    goto/16 :goto_6

    .line 2903
    :cond_16
    const/4 v0, 0x0

    move v11, v0

    goto/16 :goto_7

    .line 2916
    :cond_17
    if-gez v12, :cond_11

    .line 2917
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(F)V

    .line 2918
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->a()Z

    move-result v0

    if-nez v0, :cond_18

    .line 2919
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 2921
    :cond_18
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(Z)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_8

    .line 14804
    :cond_19
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->f(I)I

    move-result v0

    .line 14805
    const/4 v2, -0x1

    if-ne v0, v2, :cond_13

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    .line 2943
    :cond_1a
    const/4 v1, 0x0

    goto :goto_a

    :cond_1b
    move v1, v3

    goto/16 :goto_3

    :cond_1c
    move v4, v3

    goto/16 :goto_2
.end method

.method private z()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 682
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setClickable(Z)V

    .line 683
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setFocusableInTouchMode(Z)V

    .line 684
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setWillNotDraw(Z)V

    .line 685
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setAlwaysDrawnWithCacheEnabled(Z)V

    .line 686
    invoke-direct {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Z)V

    .line 688
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 689
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aK:I

    .line 690
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aM:I

    .line 691
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aN:I

    .line 692
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledOverscrollDistance()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->Q:I

    .line 693
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledOverflingDistance()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->R:I

    .line 9082
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9084
    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 9086
    new-instance v0, Lcom/roidapp/baselib/hlistview/ai;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/ai;-><init>(Landroid/view/View;)V

    .line 694
    :goto_0
    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    .line 695
    return-void

    .line 9087
    :cond_0
    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    .line 9089
    new-instance v0, Lcom/roidapp/baselib/hlistview/ah;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/ah;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 9092
    :cond_1
    new-instance v0, Lcom/roidapp/baselib/hlistview/aj;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/aj;-><init>(Landroid/view/View;)V

    goto :goto_0
.end method


# virtual methods
.method protected final a(I[Z)Landroid/view/View;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/16 v5, 0x10

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1916
    aput-boolean v3, p2, v3

    .line 1919
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/n;->c(I)Landroid/view/View;

    move-result-object v1

    .line 1920
    if-eqz v1, :cond_1

    .line 1984
    :cond_0
    :goto_0
    return-object v1

    .line 1924
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/n;->d(I)Landroid/view/View;

    move-result-object v1

    .line 1927
    if-eqz v1, :cond_5

    .line 1928
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1, v1, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 1930
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v5, :cond_2

    .line 1931
    invoke-virtual {v0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v2

    if-nez v2, :cond_2

    .line 1932
    invoke-virtual {v0, v4}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1936
    :cond_2
    if-eq v0, v1, :cond_4

    .line 1937
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v2, v1, p1}, Lcom/roidapp/baselib/hlistview/n;->a(Landroid/view/View;I)V

    .line 1938
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    if-eqz v1, :cond_7

    .line 1939
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    move-object v1, v0

    .line 1959
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->k:Z

    if-eqz v0, :cond_3

    .line 1960
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1962
    if-nez v0, :cond_8

    .line 1963
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    .line 1969
    :goto_2
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v2, p1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->e:J

    .line 1970
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1973
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aq:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1974
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aY:Lcom/roidapp/baselib/hlistview/i;

    if-nez v0, :cond_0

    .line 1975
    new-instance v0, Lcom/roidapp/baselib/hlistview/i;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/i;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aY:Lcom/roidapp/baselib/hlistview/i;

    goto :goto_0

    .line 1942
    :cond_4
    aput-boolean v4, p2, v3

    .line 1943
    invoke-virtual {v0}, Landroid/view/View;->onFinishTemporaryDetach()V

    move-object v1, v0

    goto :goto_1

    .line 1946
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 1948
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v5, :cond_6

    .line 1949
    invoke-virtual {v0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v1

    if-nez v1, :cond_6

    .line 1950
    invoke-virtual {v0, v4}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1954
    :cond_6
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    if-eqz v1, :cond_7

    .line 1955
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    :cond_7
    move-object v1, v0

    goto :goto_1

    .line 1964
    :cond_8
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 1965
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    goto :goto_2

    .line 1967
    :cond_9
    check-cast v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    goto :goto_2
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 825
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_0

    .line 826
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->clear()V

    .line 828
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-eqz v0, :cond_1

    .line 829
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->clear()V

    .line 831
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    .line 832
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 2208
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 2209
    return-void
.end method

.method public final a(IIZ)V
    .locals 6

    .prologue
    .line 4449
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-nez v0, :cond_0

    .line 4450
    new-instance v0, Lcom/roidapp/baselib/hlistview/g;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/g;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    .line 4454
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 4455
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 4456
    add-int v2, v0, v1

    .line 4457
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingLeft()I

    move-result v3

    .line 4458
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v5

    sub-int/2addr v4, v5

    .line 4460
    if-eqz p1, :cond_2

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-eqz v5, :cond_2

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    if-ne v0, v3, :cond_1

    if-ltz p1, :cond_2

    :cond_1
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-ne v2, v0, :cond_4

    add-int/lit8 v0, v1, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    if-ne v0, v4, :cond_4

    if-lez p1, :cond_4

    .line 4464
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    .line 4465
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v0, :cond_3

    .line 4466
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 4472
    :cond_3
    :goto_0
    return-void

    .line 4469
    :cond_4
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    .line 4470
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/baselib/hlistview/g;->a(IIZ)V

    goto :goto_0
.end method

.method protected final a(ILandroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, -0x1

    .line 2079
    if-eq p1, v6, :cond_0

    .line 2080
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    .line 2083
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    .line 2084
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 2088
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 13101
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->q:I

    sub-int/2addr v1, v5

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->r:I

    sub-int/2addr v2, v5

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->s:I

    add-int/2addr v3, v5

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->t:I

    add-int/2addr v0, v5

    invoke-virtual {v4, v1, v2, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 2091
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aI:Z

    .line 2092
    invoke-virtual {p2}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eq v1, v0, :cond_1

    .line 2093
    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aI:Z

    .line 2094
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->q()I

    move-result v0

    if-eq v0, v6, :cond_1

    .line 2095
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->refreshDrawableState()V

    .line 2098
    :cond_1
    return-void

    .line 2093
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 2212
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2213
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 2214
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2216
    :cond_0
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    .line 2217
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2218
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 2219
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->q:I

    .line 2220
    iget v1, v0, Landroid/graphics/Rect;->top:I

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->r:I

    .line 2221
    iget v1, v0, Landroid/graphics/Rect;->right:I

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->s:I

    .line 2222
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->t:I

    .line 2223
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 2224
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->C()V

    .line 2225
    return-void
.end method

.method public a(Landroid/widget/ListAdapter;)V
    .locals 1

    .prologue
    .line 718
    if-eqz p1, :cond_0

    .line 719
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->k:Z

    .line 720
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-nez v0, :cond_0

    .line 722
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    .line 726
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_1

    .line 727
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->clear()V

    .line 730
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-eqz v0, :cond_2

    .line 731
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->clear()V

    .line 733
    :cond_2
    return-void
.end method

.method protected abstract a(Z)V
.end method

.method final a(II)Z
    .locals 20

    .prologue
    .line 4553
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v9

    .line 4554
    if-nez v9, :cond_0

    .line 4555
    const/4 v2, 0x1

    .line 4710
    :goto_0
    return v2

    .line 4558
    :cond_0
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 4559
    add-int/lit8 v2, v9, -0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v4

    .line 4561
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    .line 4575
    rsub-int/lit8 v10, v3, 0x0

    .line 4576
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    add-int/lit8 v2, v2, 0x0

    .line 4577
    sub-int v11, v4, v2

    .line 4579
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v6

    sub-int/2addr v2, v6

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingLeft()I

    move-result v6

    sub-int v6, v2, v6

    .line 4580
    if-gez p1, :cond_2

    .line 4581
    add-int/lit8 v2, v6, -0x1

    neg-int v2, v2

    move/from16 v0, p1

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v8, v2

    .line 4586
    :goto_1
    if-gez p2, :cond_3

    .line 4587
    add-int/lit8 v2, v6, -0x1

    neg-int v2, v2

    move/from16 v0, p2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 4592
    :goto_2
    move-object/from16 v0, p0

    iget v12, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 4595
    if-nez v12, :cond_4

    .line 4596
    iget v6, v5, Landroid/graphics/Rect;->left:I

    sub-int v6, v3, v6

    move-object/from16 v0, p0

    iput v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aS:I

    .line 4600
    :goto_3
    add-int v6, v12, v9

    move-object/from16 v0, p0

    iget v7, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-ne v6, v7, :cond_5

    .line 4601
    iget v6, v5, Landroid/graphics/Rect;->right:I

    add-int/2addr v6, v4

    move-object/from16 v0, p0

    iput v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aT:I

    .line 4606
    :goto_4
    if-nez v12, :cond_6

    iget v6, v5, Landroid/graphics/Rect;->left:I

    if-lt v3, v6, :cond_6

    if-ltz v2, :cond_6

    const/4 v3, 0x1

    .line 4607
    :goto_5
    add-int v6, v12, v9

    move-object/from16 v0, p0

    iget v7, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-ne v6, v7, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v6

    iget v5, v5, Landroid/graphics/Rect;->right:I

    sub-int v5, v6, v5

    if-gt v4, v5, :cond_7

    if-gtz v2, :cond_7

    const/4 v4, 0x1

    .line 4609
    :goto_6
    if-nez v3, :cond_1

    if-eqz v4, :cond_9

    .line 4610
    :cond_1
    if-eqz v2, :cond_8

    const/4 v2, 0x1

    goto/16 :goto_0

    .line 4583
    :cond_2
    add-int/lit8 v2, v6, -0x1

    move/from16 v0, p1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    move v8, v2

    goto :goto_1

    .line 4589
    :cond_3
    add-int/lit8 v2, v6, -0x1

    move/from16 v0, p2

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_2

    .line 4598
    :cond_4
    move-object/from16 v0, p0

    iget v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aS:I

    add-int/2addr v6, v2

    move-object/from16 v0, p0

    iput v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aS:I

    goto :goto_3

    .line 4603
    :cond_5
    move-object/from16 v0, p0

    iget v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aT:I

    add-int/2addr v6, v2

    move-object/from16 v0, p0

    iput v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aT:I

    goto :goto_4

    .line 4606
    :cond_6
    const/4 v3, 0x0

    goto :goto_5

    .line 4607
    :cond_7
    const/4 v4, 0x0

    goto :goto_6

    .line 4610
    :cond_8
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 4613
    :cond_9
    if-gez v2, :cond_c

    const/4 v3, 0x1

    .line 4615
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isInTouchMode()Z

    move-result v13

    .line 4616
    if-eqz v13, :cond_a

    .line 4617
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->k()V

    .line 4620
    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->i()I

    move-result v14

    .line 4621
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->j()I

    move-result v5

    sub-int v15, v4, v5

    .line 4623
    const/4 v5, 0x0

    .line 4624
    const/4 v6, 0x0

    .line 4626
    if-eqz v3, :cond_d

    .line 4627
    neg-int v0, v2

    move/from16 v16, v0

    .line 4633
    const/4 v4, 0x0

    move/from16 v19, v4

    move v4, v6

    move/from16 v6, v19

    :goto_8
    if-ge v6, v9, :cond_f

    .line 4634
    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v17

    .line 4635
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getRight()I

    move-result v7

    move/from16 v0, v16

    if-ge v7, v0, :cond_f

    .line 4638
    add-int/lit8 v7, v4, 0x1

    .line 4639
    add-int v4, v12, v6

    .line 4640
    if-lt v4, v14, :cond_b

    if-ge v4, v15, :cond_b

    .line 4641
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1, v4}, Lcom/roidapp/baselib/hlistview/n;->a(Landroid/view/View;I)V

    .line 4633
    :cond_b
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    move v4, v7

    goto :goto_8

    .line 4613
    :cond_c
    const/4 v3, 0x0

    goto :goto_7

    .line 4646
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v4

    sub-int v7, v4, v2

    .line 4651
    add-int/lit8 v4, v9, -0x1

    move/from16 v19, v4

    move v4, v6

    move/from16 v6, v19

    :goto_9
    if-ltz v6, :cond_f

    .line 4652
    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 4653
    invoke-virtual {v9}, Landroid/view/View;->getLeft()I

    move-result v16

    move/from16 v0, v16

    if-le v0, v7, :cond_f

    .line 4657
    add-int/lit8 v5, v4, 0x1

    .line 4658
    add-int v4, v12, v6

    .line 4659
    if-lt v4, v14, :cond_e

    if-ge v4, v15, :cond_e

    .line 4660
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v9, v4}, Lcom/roidapp/baselib/hlistview/n;->a(Landroid/view/View;I)V

    .line 4651
    :cond_e
    add-int/lit8 v4, v6, -0x1

    move/from16 v19, v4

    move v4, v5

    move v5, v6

    move/from16 v6, v19

    goto :goto_9

    .line 4666
    :cond_f
    move-object/from16 v0, p0

    iget v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    add-int/2addr v6, v8

    move-object/from16 v0, p0

    iput v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->C:I

    .line 4668
    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput-boolean v6, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->at:Z

    .line 4670
    if-lez v4, :cond_10

    .line 4671
    move-object/from16 v0, p0

    invoke-virtual {v0, v5, v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->detachViewsFromParent(II)V

    .line 4672
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v5}, Lcom/roidapp/baselib/hlistview/n;->d()V

    .line 4677
    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->awakenScrollBars()Z

    move-result v5

    if-nez v5, :cond_11

    .line 4678
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 4681
    :cond_11
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->e(I)V

    .line 4683
    if-eqz v3, :cond_12

    .line 4684
    move-object/from16 v0, p0

    iget v5, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v4, v5

    move-object/from16 v0, p0

    iput v4, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 4687
    :cond_12
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    .line 4688
    if-lt v10, v2, :cond_13

    if-ge v11, v2, :cond_14

    .line 4689
    :cond_13
    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Z)V

    .line 4692
    :cond_14
    if-nez v13, :cond_16

    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_16

    .line 4693
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v2, v3

    .line 4694
    if-ltz v2, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_15

    .line 4695
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(ILandroid/view/View;)V

    .line 4706
    :cond_15
    :goto_a
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->at:Z

    .line 4708
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b()V

    .line 4710
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 4697
    :cond_16
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_17

    .line 4698
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v2, v3

    .line 4699
    if-ltz v2, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_15

    .line 4700
    const/4 v3, -0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(ILandroid/view/View;)V

    goto :goto_a

    .line 4703
    :cond_17
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    goto :goto_a
.end method

.method public final a(Landroid/view/View;IJ)Z
    .locals 11

    .prologue
    const/16 v9, 0xb

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 916
    .line 919
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-eqz v0, :cond_12

    .line 923
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v9, :cond_6

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v0, :cond_6

    .line 925
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    move v6, v7

    .line 926
    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 927
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 928
    if-eqz v6, :cond_4

    .line 929
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v1, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 934
    :cond_1
    :goto_1
    if-eqz v6, :cond_5

    .line 935
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    .line 940
    :goto_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v0, :cond_11

    .line 941
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    check-cast v1, Lcom/roidapp/baselib/hlistview/ac;

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    check-cast v2, Landroid/view/ActionMode;

    move v3, p2

    move-wide v4, p3

    invoke-virtual/range {v1 .. v6}, Lcom/roidapp/baselib/hlistview/ac;->a(Landroid/view/ActionMode;IJZ)V

    move v0, v8

    :goto_3
    move v3, v0

    move v0, v7

    .line 962
    :goto_4
    if-eqz v0, :cond_e

    .line 9979
    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 9980
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v6

    .line 9981
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v9, :cond_c

    move v2, v7

    :goto_5
    move v4, v8

    .line 9982
    :goto_6
    if-ge v4, v6, :cond_e

    .line 9983
    invoke-virtual {p0, v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 9984
    add-int v1, v5, v4

    .line 9986
    instance-of v9, v0, Landroid/widget/Checkable;

    if-eqz v9, :cond_d

    .line 9987
    check-cast v0, Landroid/widget/Checkable;

    iget-object v9, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v9, v1, v10}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 9982
    :cond_2
    :goto_7
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_6

    :cond_3
    move v6, v8

    .line 925
    goto :goto_0

    .line 931
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v1, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/util/LongSparseArray;->delete(J)V

    goto :goto_1

    .line 937
    :cond_5
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    goto :goto_2

    .line 946
    :cond_6
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-ne v0, v7, :cond_10

    .line 947
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    move v0, v7

    .line 948
    :goto_8
    if-eqz v0, :cond_a

    .line 949
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->clear()V

    .line 950
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 951
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 952
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->clear()V

    .line 953
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v1, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 955
    :cond_7
    iput v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    :cond_8
    :goto_9
    move v0, v7

    move v3, v7

    .line 959
    goto/16 :goto_4

    :cond_9
    move v0, v8

    .line 947
    goto :goto_8

    .line 956
    :cond_a
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->size()I

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, v8}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_8

    .line 957
    :cond_b
    iput v8, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    goto :goto_9

    :cond_c
    move v2, v8

    .line 9981
    goto/16 :goto_5

    .line 9988
    :cond_d
    if-eqz v2, :cond_2

    .line 9989
    iget-object v9, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v9, v1, v10}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setActivated(Z)V

    goto/16 :goto_7

    :cond_e
    move v0, v7

    move v7, v3

    .line 967
    :goto_a
    if-eqz v7, :cond_f

    .line 968
    invoke-super {p0, p1, p2, p3, p4}, Lcom/roidapp/baselib/hlistview/AdapterView;->a(Landroid/view/View;IJ)Z

    move-result v1

    or-int/2addr v0, v1

    .line 971
    :cond_f
    return v0

    :cond_10
    move v0, v8

    move v3, v7

    goto/16 :goto_4

    :cond_11
    move v0, v7

    goto/16 :goto_3

    :cond_12
    move v0, v8

    goto :goto_a
.end method

.method public addTouchables(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3631
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 3632
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 3633
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    .line 3635
    if-nez v3, :cond_1

    .line 3646
    :cond_0
    return-void

    .line 3639
    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 3640
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 3641
    add-int v5, v2, v0

    invoke-interface {v3, v5}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 3642
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3644
    :cond_2
    invoke-virtual {v4, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V

    .line 3639
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected final b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1127
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aw:Lcom/roidapp/baselib/hlistview/j;

    if-eqz v0, :cond_0

    .line 1128
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    .line 1130
    :cond_0
    invoke-virtual {p0, v1, v1, v1, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->onScrollChanged(IIII)V

    .line 1131
    return-void
.end method

.method final b(I)V
    .locals 1

    .prologue
    .line 3656
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aJ:I

    if-eq p1, v0, :cond_0

    .line 3657
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aw:Lcom/roidapp/baselib/hlistview/j;

    if-eqz v0, :cond_0

    .line 3658
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aJ:I

    .line 3662
    :cond_0
    return-void
.end method

.method final b(Landroid/view/View;IJ)Z
    .locals 9

    .prologue
    const/16 v3, 0xb

    const/4 v2, 0x3

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 2566
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_d

    .line 2567
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-ne v0, v2, :cond_d

    .line 2568
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/hlistview/ac;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->startActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v0, :cond_8

    .line 13844
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-eqz v0, :cond_7

    .line 13849
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_2

    .line 13850
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-nez v0, :cond_2

    .line 13851
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/hlistview/ac;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ac;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 13853
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AbsListView: attempted to start selection mode for CHOICE_MODE_MULTIPLE_MODAL but no choice mode callback was supplied. Call setMultiChoiceModeListener to set a callback."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 13857
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/hlistview/ac;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->startActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    .line 13861
    :cond_2
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_9

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-ne v0, v2, :cond_9

    .line 13863
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 13864
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 13865
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 13867
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v2, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 13872
    :cond_4
    if-eq v0, v6, :cond_5

    .line 13874
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    .line 13879
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v0, :cond_6

    .line 13880
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    .line 13881
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    check-cast v1, Lcom/roidapp/baselib/hlistview/ac;

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    check-cast v2, Landroid/view/ActionMode;

    move v3, p2

    invoke-virtual/range {v1 .. v6}, Lcom/roidapp/baselib/hlistview/ac;->a(Landroid/view/ActionMode;IJZ)V

    .line 13907
    :cond_6
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->af:Z

    if-nez v0, :cond_7

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->at:Z

    if-nez v0, :cond_7

    .line 13908
    iput-boolean v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    .line 13909
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->y()V

    .line 13910
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->requestLayout()V

    .line 2571
    :cond_7
    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->performHapticFeedback(I)Z

    .line 2589
    :cond_8
    :goto_1
    return v6

    .line 13884
    :cond_9
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_c

    move v0, v6

    .line 13888
    :goto_2
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->clear()V

    .line 13889
    if-eqz v0, :cond_a

    .line 13890
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/support/v4/util/LongSparseArray;->clear()V

    .line 13896
    :cond_a
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 13897
    if-eqz v0, :cond_b

    .line 13898
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v1, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 13900
    :cond_b
    iput v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    goto :goto_0

    :cond_c
    move v0, v7

    .line 13884
    goto :goto_2

    .line 2578
    :cond_d
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ai:Lcom/roidapp/baselib/hlistview/t;

    if-eqz v0, :cond_f

    .line 2579
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ai:Lcom/roidapp/baselib/hlistview/t;

    invoke-interface {v0}, Lcom/roidapp/baselib/hlistview/t;->a()Z

    move-result v6

    .line 2582
    :goto_3
    if-nez v6, :cond_e

    .line 2583
    invoke-static {p1, p2, p3, p4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c(Landroid/view/View;IJ)Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->az:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 2584
    invoke-super {p0, p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->showContextMenuForChild(Landroid/view/View;)Z

    move-result v6

    .line 2586
    :cond_e
    if-eqz v6, :cond_8

    .line 2587
    invoke-virtual {p0, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->performHapticFeedback(I)Z

    goto :goto_1

    :cond_f
    move v6, v7

    goto :goto_3
.end method

.method protected c()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 1626
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeAllViewsInLayout()V

    .line 1627
    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 1628
    iput-boolean v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    .line 1629
    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->O:Ljava/lang/Runnable;

    .line 1630
    iput-boolean v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ad:Z

    .line 1631
    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    .line 1632
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ar:I

    .line 1633
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->as:J

    .line 1634
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->l(I)V

    .line 1635
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->m(I)V

    .line 1636
    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->J:I

    .line 1637
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    .line 1638
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 1639
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 1640
    return-void
.end method

.method public c(I)V
    .locals 1

    .prologue
    .line 4377
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-nez v0, :cond_0

    .line 4378
    new-instance v0, Lcom/roidapp/baselib/hlistview/l;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/l;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    .line 4380
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/l;->a(I)V

    .line 4381
    return-void
.end method

.method public checkInputConnectionProxy(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 5211
    const/4 v0, 0x0

    return v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 5232
    instance-of v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    return v0
.end method

.method protected computeHorizontalScrollExtent()I
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1644
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v2

    .line 1645
    if-lez v2, :cond_3

    .line 1646
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ax:Z

    if-eqz v0, :cond_2

    .line 1647
    mul-int/lit8 v0, v2, 0x64

    .line 1649
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1650
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 1651
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 1652
    if-lez v1, :cond_0

    .line 1653
    mul-int/lit8 v3, v3, 0x64

    div-int v1, v3, v1

    add-int/2addr v0, v1

    .line 1656
    :cond_0
    add-int/lit8 v1, v2, -0x1

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1657
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v2

    .line 1658
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 1659
    if-lez v1, :cond_1

    .line 1660
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x64

    div-int v1, v2, v1

    sub-int/2addr v0, v1

    .line 1668
    :cond_1
    :goto_0
    return v0

    .line 1665
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 1668
    goto :goto_0
.end method

.method protected computeHorizontalScrollOffset()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1673
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 1674
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v3

    .line 1675
    if-ltz v2, :cond_0

    if-lez v3, :cond_0

    .line 1676
    iget-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ax:Z

    if-eqz v1, :cond_1

    .line 1677
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1678
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 1679
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 1680
    if-lez v1, :cond_0

    .line 1681
    mul-int/lit8 v2, v2, 0x64

    mul-int/lit8 v3, v3, 0x64

    div-int v1, v3, v1

    sub-int v1, v2, v1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    add-int/2addr v1, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1697
    :cond_0
    :goto_0
    return v0

    .line 1686
    :cond_1
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    .line 1687
    if-nez v2, :cond_2

    .line 1694
    :goto_1
    int-to-float v2, v2

    int-to-float v3, v3

    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    mul-float/2addr v0, v3

    add-float/2addr v0, v2

    float-to-int v0, v0

    goto :goto_0

    .line 1689
    :cond_2
    add-int v0, v2, v3

    if-ne v0, v1, :cond_3

    move v0, v1

    .line 1690
    goto :goto_1

    .line 1692
    :cond_3
    div-int/lit8 v0, v3, 0x2

    add-int/2addr v0, v2

    goto :goto_1
.end method

.method protected computeHorizontalScrollRange()I
    .locals 3

    .prologue
    .line 1703
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ax:Z

    if-eqz v0, :cond_1

    .line 1704
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    mul-int/lit8 v0, v0, 0x64

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1705
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v1

    if-eqz v1, :cond_0

    .line 1707
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 1712
    :cond_0
    :goto_0
    return v0

    .line 1710
    :cond_1
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    goto :goto_0
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 1807
    return-void
.end method

.method public final d(I)V
    .locals 2

    .prologue
    .line 4445
    const/16 v0, 0xc8

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    .line 4446
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 2114
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->l:Z

    .line 2115
    if-nez v0, :cond_0

    .line 2116
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/graphics/Canvas;)V

    .line 2119
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2121
    if-eqz v0, :cond_1

    .line 2122
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/graphics/Canvas;)V

    .line 2128
    :cond_1
    return-void
.end method

.method protected dispatchSetPressed(Z)V
    .locals 0

    .prologue
    .line 2667
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    .line 3440
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->draw(Landroid/graphics/Canvas;)V

    .line 3441
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    if-eqz v0, :cond_3

    .line 3442
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v0

    .line 3443
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/w;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3444
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 3445
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aW:I

    add-int/2addr v2, v3

    .line 3446
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aX:I

    add-int/2addr v3, v4

    .line 3447
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHeight()I

    move-result v4

    sub-int/2addr v4, v2

    sub-int v3, v4, v3

    .line 3450
    const/4 v4, 0x0

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aS:I

    add-int/2addr v5, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 3454
    const/high16 v5, -0x3d4c0000    # -90.0f

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3455
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHeight()I

    move-result v5

    neg-int v5, v5

    add-int/2addr v5, v2

    int-to-float v5, v5

    int-to-float v6, v4

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3456
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v5, v3, v3}, Lcom/roidapp/baselib/hlistview/w;->a(II)V

    .line 3458
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v3, p1}, Lcom/roidapp/baselib/hlistview/w;->a(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3459
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v3, v4, v2}, Lcom/roidapp/baselib/hlistview/w;->b(II)V

    .line 3461
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 3463
    :cond_0
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3465
    :cond_1
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/w;->a()Z

    move-result v1

    if-nez v1, :cond_3

    .line 3466
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 3467
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aW:I

    add-int/2addr v2, v3

    .line 3468
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aX:I

    add-int/2addr v3, v4

    .line 3469
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHeight()I

    move-result v4

    sub-int/2addr v4, v2

    sub-int v3, v4, v3

    .line 3470
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v4

    .line 3472
    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aT:I

    add-int/2addr v0, v5

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 3473
    const/high16 v4, 0x42b40000    # 90.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 3474
    neg-int v2, v2

    int-to-float v2, v2

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3476
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0, v3, v3}, Lcom/roidapp/baselib/hlistview/w;->a(II)V

    .line 3478
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/w;->a(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3482
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 3484
    :cond_2
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 3487
    :cond_3
    return-void
.end method

.method protected drawableStateChanged()V
    .locals 0

    .prologue
    .line 2296
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->drawableStateChanged()V

    .line 2297
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->C()V

    .line 2298
    return-void
.end method

.method protected final e()V
    .locals 6

    .prologue
    const/4 v3, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1810
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->w:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 1813
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    if-lez v0, :cond_3

    move v0, v1

    .line 1816
    :goto_0
    if-nez v0, :cond_0

    .line 1817
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v4

    if-lez v4, :cond_0

    .line 1818
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1819
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    if-ge v0, v4, :cond_4

    move v0, v1

    .line 1823
    :cond_0
    :goto_1
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->w:Landroid/view/View;

    if-eqz v0, :cond_5

    move v0, v2

    :goto_2
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1826
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->x:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 1828
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v4

    .line 1831
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v0, v4

    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-ge v0, v5, :cond_6

    move v0, v1

    .line 1834
    :goto_3
    if-nez v0, :cond_9

    if-lez v4, :cond_9

    .line 1835
    add-int/lit8 v0, v4, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1836
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getRight()I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr v4, v5

    if-le v0, v4, :cond_7

    .line 1839
    :goto_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->x:Landroid/view/View;

    if-eqz v1, :cond_8

    :goto_5
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1841
    :cond_2
    return-void

    :cond_3
    move v0, v2

    .line 1813
    goto :goto_0

    :cond_4
    move v0, v2

    .line 1819
    goto :goto_1

    :cond_5
    move v0, v3

    .line 1823
    goto :goto_2

    :cond_6
    move v0, v2

    .line 1831
    goto :goto_3

    :cond_7
    move v1, v2

    .line 1836
    goto :goto_4

    :cond_8
    move v2, v3

    .line 1839
    goto :goto_5

    :cond_9
    move v1, v0

    goto :goto_4
.end method

.method public final e(I)V
    .locals 3

    .prologue
    .line 4717
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 4719
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 4720
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 4721
    invoke-virtual {v2, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 4719
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4723
    :cond_0
    return-void
.end method

.method protected abstract f(I)I
.end method

.method public final f()Landroid/view/View;
    .locals 2
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation

    .prologue
    .line 1846
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    if-ltz v0, :cond_0

    .line 1847
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1849
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract g(I)V
.end method

.method protected final g()Z
    .locals 1

    .prologue
    .line 2176
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 5216
    new-instance v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    invoke-direct {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;-><init>()V

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 53
    .line 17227
    new-instance v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 5222
    new-instance v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected getContextMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .prologue
    .line 2594
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->az:Landroid/view/ContextMenu$ContextMenuInfo;

    return-object v0
.end method

.method public getFocusedRect(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    .line 1239
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->f()Landroid/view/View;

    move-result-object v0

    .line 1240
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-ne v1, p0, :cond_0

    .line 1243
    invoke-virtual {v0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 1244
    invoke-virtual {p0, v0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1249
    :goto_0
    return-void

    .line 1247
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->getFocusedRect(Landroid/graphics/Rect;)V

    goto :goto_0
.end method

.method protected getHorizontalScrollbarHeight()I
    .locals 1

    .prologue
    .line 1077
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getHorizontalScrollbarHeight()I

    move-result v0

    return v0
.end method

.method protected getLeftFadingEdgeStrength()F
    .locals 4

    .prologue
    .line 1717
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 1718
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getLeftFadingEdgeStrength()F

    move-result v0

    .line 1719
    if-nez v1, :cond_1

    .line 1728
    :cond_0
    :goto_0
    return v0

    .line 1722
    :cond_1
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    if-lez v1, :cond_2

    .line 1723
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    .line 1726
    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    .line 1727
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHorizontalFadingEdgeLength()I

    move-result v2

    int-to-float v2, v2

    .line 1728
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingLeft()I

    move-result v3

    if-ge v1, v3, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingLeft()I

    move-result v0

    sub-int v0, v1, v0

    neg-int v0, v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    goto :goto_0
.end method

.method protected getRightFadingEdgeStrength()F
    .locals 5

    .prologue
    .line 1734
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 1735
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getRightFadingEdgeStrength()F

    move-result v0

    .line 1736
    if-nez v1, :cond_1

    .line 1746
    :cond_0
    :goto_0
    return v0

    .line 1739
    :cond_1
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, -0x1

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_2

    .line 1740
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    .line 1743
    :cond_2
    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    .line 1744
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    .line 1745
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHorizontalFadingEdgeLength()I

    move-result v3

    int-to-float v3, v3

    .line 1746
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v4

    sub-int v4, v2, v4

    if-le v1, v4, :cond_0

    sub-int v0, v1, v2

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    div-float/2addr v0, v3

    goto :goto_0
.end method

.method public getSolidColor()I
    .locals 1

    .prologue
    .line 5260
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    return v0
.end method

.method protected final h()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 2240
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isClickable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2275
    :cond_0
    :goto_0
    return-void

    .line 2244
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    .line 2245
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->o:Landroid/graphics/Rect;

    .line 2246
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isFocused()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->B()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2249
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2251
    if-eqz v1, :cond_3

    .line 2252
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2253
    invoke-virtual {v1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 2255
    :cond_3
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 2257
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isLongClickable()Z

    move-result v1

    .line 2258
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2259
    if-eqz v0, :cond_4

    instance-of v2, v0, Landroid/graphics/drawable/TransitionDrawable;

    if-eqz v2, :cond_4

    .line 2260
    if-eqz v1, :cond_6

    .line 2261
    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 2267
    :cond_4
    :goto_1
    if-eqz v1, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v0, :cond_0

    .line 2268
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aD:Lcom/roidapp/baselib/hlistview/d;

    if-nez v0, :cond_5

    .line 2269
    new-instance v0, Lcom/roidapp/baselib/hlistview/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/roidapp/baselib/hlistview/d;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aD:Lcom/roidapp/baselib/hlistview/d;

    .line 2271
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aD:Lcom/roidapp/baselib/hlistview/d;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/d;->a()V

    .line 2272
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aD:Lcom/roidapp/baselib/hlistview/d;

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {p0, v0, v2, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 2264
    :cond_6
    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/TransitionDrawable;->resetTransition()V

    goto :goto_1
.end method

.method public h(I)V
    .locals 3

    .prologue
    .line 5274
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    if-eq p1, v0, :cond_1

    .line 5275
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    .line 5276
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    .line 5277
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 5278
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    .line 5277
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 5280
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/n;->e(I)V

    .line 5282
    :cond_1
    return-void
.end method

.method protected i()I
    .locals 1

    .prologue
    .line 4732
    const/4 v0, 0x0

    return v0
.end method

.method protected j()I
    .locals 1

    .prologue
    .line 4742
    const/4 v0, 0x0

    return v0
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 2343
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->jumpDrawablesToCurrentState()V

    .line 2344
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 2345
    :cond_0
    return-void
.end method

.method protected final k()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 4755
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    if-eq v0, v2, :cond_2

    .line 4756
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 4757
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 4759
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ak:I

    if-ltz v0, :cond_1

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ak:I

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    if-eq v0, v1, :cond_1

    .line 4760
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ak:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 4762
    :cond_1
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->l(I)V

    .line 4763
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->m(I)V

    .line 4764
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->J:I

    .line 4766
    :cond_2
    return-void
.end method

.method protected final l()I
    .locals 2

    .prologue
    .line 4773
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    .line 4774
    if-gez v0, :cond_0

    .line 4775
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 4777
    :cond_0
    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 4778
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 4779
    return v0
.end method

.method protected final m()Z
    .locals 1

    .prologue
    .line 4822
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    if-gez v0, :cond_0

    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4823
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->C()V

    .line 4824
    const/4 v0, 0x1

    .line 4826
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final n()V
    .locals 12

    .prologue
    .line 4998
    iget v8, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    .line 4999
    iget v9, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bb:I

    .line 5000
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bb:I

    .line 5002
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16948
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->clear()V

    .line 16950
    const/4 v1, 0x0

    .line 16951
    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 16952
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LongSparseArray;->keyAt(I)J

    move-result-wide v4

    .line 16953
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 16955
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v6

    .line 16956
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    .line 16958
    const/4 v0, 0x0

    add-int/lit8 v6, v3, -0x14

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 16959
    add-int/lit8 v0, v3, 0x14

    iget v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 16960
    const/4 v0, 0x0

    .line 16961
    :goto_1
    if-ge v6, v7, :cond_0

    .line 16962
    iget-object v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v10, v6}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v10

    .line 16963
    cmp-long v10, v4, v10

    if-nez v10, :cond_3

    .line 16964
    const/4 v0, 0x1

    .line 16965
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    const/4 v10, 0x1

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v7, v6, v10}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 16966
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v1, v6}, Landroid/support/v4/util/LongSparseArray;->setValueAt(ILjava/lang/Object;)V

    .line 16971
    :cond_0
    if-nez v0, :cond_2

    .line 16972
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, v4, v5}, Landroid/support/v4/util/LongSparseArray;->delete(J)V

    .line 16973
    add-int/lit8 v0, v1, -0x1

    .line 16974
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    .line 16975
    const/4 v7, 0x1

    .line 16977
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-le v1, v2, :cond_1

    .line 16978
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 16979
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    check-cast v1, Lcom/roidapp/baselib/hlistview/ac;

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    check-cast v2, Landroid/view/ActionMode;

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/roidapp/baselib/hlistview/ac;->a(Landroid/view/ActionMode;IJZ)V

    :cond_1
    move v1, v0

    move v2, v7

    :cond_2
    move v0, v1

    move v1, v2

    .line 16951
    :goto_2
    add-int/lit8 v0, v0, 0x1

    move v2, v1

    move v1, v0

    goto/16 :goto_0

    .line 16961
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 16984
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    move v0, v1

    move v1, v2

    goto :goto_2

    .line 16988
    :cond_5
    if-eqz v2, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v0, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-le v0, v1, :cond_6

    .line 16989
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode;

    invoke-virtual {v0}, Landroid/view/ActionMode;->invalidate()V

    .line 5007
    :cond_6
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/n;->c()V

    .line 5009
    if-lez v8, :cond_14

    .line 5014
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ad:Z

    if-eqz v0, :cond_d

    .line 5016
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ad:Z

    .line 5017
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    .line 5019
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aG:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    .line 5020
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 5136
    :cond_7
    :goto_3
    return-void

    .line 5022
    :cond_8
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aG:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    .line 5023
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aV:Z

    if-eqz v0, :cond_9

    .line 5024
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aV:Z

    .line 5025
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    goto :goto_3

    .line 5028
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v2

    .line 5029
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    .line 5030
    add-int/lit8 v0, v2, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 5031
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 5032
    :goto_4
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v2, v3

    if-lt v2, v9, :cond_b

    if-gt v0, v1, :cond_b

    .line 5034
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    goto :goto_3

    :cond_a
    move v0, v1

    .line 5031
    goto :goto_4

    .line 5039
    :cond_b
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->awakenScrollBars()Z

    .line 5042
    :cond_c
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ae:I

    packed-switch v0, :pswitch_data_0

    .line 5090
    :cond_d
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isInTouchMode()Z

    move-result v0

    if-nez v0, :cond_13

    .line 5092
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->q()I

    move-result v0

    .line 5095
    if-lt v0, v8, :cond_e

    .line 5096
    add-int/lit8 v0, v8, -0x1

    .line 5098
    :cond_e
    if-gez v0, :cond_f

    .line 5099
    const/4 v0, 0x0

    .line 5103
    :cond_f
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IZ)I

    move-result v1

    .line 5105
    if-ltz v1, :cond_12

    .line 5106
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->m(I)V

    goto :goto_3

    .line 5044
    :pswitch_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 5049
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 5050
    const/4 v0, 0x0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aa:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v1, v8, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aa:I

    goto :goto_3

    .line 5056
    :cond_10
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->x()I

    move-result v0

    .line 5057
    if-ltz v0, :cond_d

    .line 5059
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IZ)I

    move-result v1

    .line 5060
    if-ne v1, v0, :cond_d

    .line 5062
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aa:I

    .line 5064
    iget-wide v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ac:J

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v1

    int-to-long v4, v1

    cmp-long v1, v2, v4

    if-nez v1, :cond_11

    .line 5067
    const/4 v1, 0x5

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 5075
    :goto_5
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->m(I)V

    goto/16 :goto_3

    .line 5071
    :cond_11
    const/4 v1, 0x2

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    goto :goto_5

    .line 5083
    :pswitch_1
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 5084
    const/4 v0, 0x0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aa:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v1, v8, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aa:I

    goto/16 :goto_3

    .line 5110
    :cond_12
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IZ)I

    move-result v0

    .line 5111
    if-ltz v0, :cond_14

    .line 5112
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->m(I)V

    goto/16 :goto_3

    .line 5119
    :cond_13
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    if-gez v0, :cond_7

    .line 5127
    :cond_14
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->K:Z

    if-eqz v0, :cond_15

    const/4 v0, 0x3

    :goto_6
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 5128
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    .line 5129
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->an:J

    .line 5130
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ak:I

    .line 5131
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->al:J

    .line 5132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ad:Z

    .line 5133
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    .line 5134
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    .line 5135
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->w()V

    goto/16 :goto_3

    .line 5127
    :cond_15
    const/4 v0, 0x1

    goto :goto_6

    .line 5042
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final o()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "drawing"
    .end annotation

    .prologue
    .line 5292
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aH:I

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2349
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->onAttachedToWindow()V

    .line 2351
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 2352
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 2354
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->i:Lcom/roidapp/baselib/hlistview/c;

    if-nez v0, :cond_0

    .line 2355
    new-instance v0, Lcom/roidapp/baselib/hlistview/c;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/c;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->i:Lcom/roidapp/baselib/hlistview/c;

    .line 2356
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->i:Lcom/roidapp/baselib/hlistview/c;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 2359
    iput-boolean v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    .line 2360
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ap:I

    .line 2361
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    .line 2363
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->S:Z

    .line 2364
    return-void
.end method

.method protected onCreateDrawableState(I)[I
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Override"
        }
    .end annotation

    .prologue
    .line 2304
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aI:Z

    if-eqz v0, :cond_1

    .line 2306
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 2332
    :cond_0
    :goto_0
    return-object v0

    .line 2312
    :cond_1
    sget-object v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ENABLED_STATE_SET:[I

    const/4 v1, 0x0

    aget v3, v0, v1

    .line 2317
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 2318
    const/4 v2, -0x1

    .line 2319
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-ltz v1, :cond_3

    .line 2320
    aget v4, v0, v1

    if-ne v4, v3, :cond_2

    .line 2327
    :goto_2
    if-ltz v1, :cond_0

    .line 2328
    add-int/lit8 v2, v1, 0x1

    array-length v3, v0

    sub-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-static {v0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 2319
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .prologue
    .line 5203
    const/4 v0, 0x0

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2368
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->onDetachedFromWindow()V

    .line 2373
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/n;->b()V

    .line 2375
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 2376
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 2378
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->i:Lcom/roidapp/baselib/hlistview/c;

    if-eqz v0, :cond_0

    .line 2379
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->i:Lcom/roidapp/baselib/hlistview/c;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 2380
    iput-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->i:Lcom/roidapp/baselib/hlistview/c;

    .line 2383
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-eqz v0, :cond_1

    .line 2384
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2387
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v0, :cond_2

    .line 2388
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 2391
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aL:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    .line 2392
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aL:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2395
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aE:Lcom/roidapp/baselib/hlistview/k;

    if-eqz v0, :cond_4

    .line 2396
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aE:Lcom/roidapp/baselib/hlistview/k;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2399
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aF:Ljava/lang/Runnable;

    if-eqz v0, :cond_5

    .line 2400
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aF:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2401
    iput-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aF:Ljava/lang/Runnable;

    .line 2403
    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->S:Z

    .line 2404
    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 1602
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/baselib/hlistview/AdapterView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 1603
    if-eqz p1, :cond_1

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isInTouchMode()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1604
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->S:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 1607
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    .line 1608
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ap:I

    .line 1609
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    .line 1611
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->I()Z

    .line 1613
    :cond_1
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xc
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v3, 0x0

    .line 3393
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v1

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    .line 3394
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 3408
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    return v0

    .line 3396
    :pswitch_0
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 3397
    const/16 v1, 0xa

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    .line 3398
    cmpl-float v2, v1, v3

    if-eqz v2, :cond_0

    .line 16420
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bd:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_1

    .line 16422
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 16423
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Lcom/roidapp/baselib/b;->b:I

    invoke-virtual {v3, v4, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    .line 16425
    if-eqz v3, :cond_2

    .line 16426
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v2

    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bd:F

    .line 16432
    :cond_1
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bd:F

    .line 3399
    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 3400
    invoke-virtual {p0, v1, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 16429
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected theme to define hlv_listPreferredItemWidth."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3394
    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 1155
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1156
    const-class v0, Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 1157
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Override"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 1163
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 1165
    const-class v0, Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1166
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1167
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->t()I

    move-result v0

    if-lez v0, :cond_0

    .line 1168
    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1170
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->u()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->s()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    .line 1171
    const/16 v0, 0x1000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1174
    :cond_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v2, 0x1

    const/4 v4, -0x1

    const/4 v1, 0x0

    .line 3525
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 3528
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v3, :cond_0

    .line 3529
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v3}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 3532
    :cond_0
    iget-boolean v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->S:Z

    if-nez v3, :cond_2

    .line 3607
    :cond_1
    :goto_0
    return v1

    .line 3540
    :cond_2
    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 3542
    :pswitch_1
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3543
    const/4 v3, 0x6

    if-eq v0, v3, :cond_3

    const/4 v3, 0x5

    if-ne v0, v3, :cond_4

    .line 3544
    :cond_3
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    move v1, v2

    .line 3545
    goto :goto_0

    .line 3548
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    .line 3549
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    .line 3550
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v5

    iput v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 3552
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->f(I)I

    move-result v5

    .line 3553
    if-eq v0, v7, :cond_5

    if-ltz v5, :cond_5

    .line 3556
    iget v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v6, v5, v6

    invoke-virtual {p0, v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 3557
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v6

    iput v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    .line 3558
    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 3559
    iput v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->E:I

    .line 3560
    iput v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 3561
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3562
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->H()V

    .line 3564
    :cond_5
    const/high16 v3, -0x80000000

    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    .line 16495
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    if-nez v3, :cond_6

    .line 16496
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    .line 3566
    :goto_1
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    invoke-virtual {v3, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 3567
    if-ne v0, v7, :cond_1

    move v1, v2

    .line 3568
    goto :goto_0

    .line 16498
    :cond_6
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_1

    .line 3574
    :pswitch_2
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 3576
    :pswitch_3
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 3577
    if-ne v0, v4, :cond_7

    .line 3579
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    move v0, v1

    .line 3581
    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    float-to-int v0, v0

    .line 3582
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->E()V

    .line 3583
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    invoke-virtual {v3, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 3584
    invoke-direct {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->n(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move v1, v2

    .line 3585
    goto/16 :goto_0

    .line 3594
    :pswitch_4
    iput v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3595
    iput v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 3596
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->F()V

    .line 3597
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    goto/16 :goto_0

    .line 3602
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    .line 3540
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch

    .line 3574
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 2635
    const/4 v0, 0x0

    return v0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v3, 0x0

    .line 2640
    sparse-switch p1, :sswitch_data_0

    .line 2660
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/baselib/hlistview/AdapterView;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    :cond_1
    :goto_0
    return v0

    .line 2643
    :sswitch_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2646
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isClickable()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isPressed()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    if-ltz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 2650
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2651
    if-eqz v1, :cond_2

    .line 2652
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iget-wide v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->an:J

    invoke-virtual {p0, v1, v2, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/View;IJ)Z

    .line 2653
    invoke-virtual {v1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 2655
    :cond_2
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    goto :goto_0

    .line 2640
    nop

    :sswitch_data_0
    .sparse-switch
        0x17 -> :sswitch_0
        0x42 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1777
    invoke-super/range {p0 .. p5}, Lcom/roidapp/baselib/hlistview/AdapterView;->onLayout(ZIIII)V

    .line 1778
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->af:Z

    .line 1779
    if-eqz p1, :cond_1

    .line 1780
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v2

    move v0, v1

    .line 1781
    :goto_0
    if-ge v0, v2, :cond_0

    .line 1782
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->forceLayout()V

    .line 1781
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1784
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->p:Lcom/roidapp/baselib/hlistview/n;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/n;->a()V

    .line 1787
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d()V

    .line 1788
    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->af:Z

    .line 1790
    sub-int v0, p4, p2

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->N:I

    .line 1791
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 1753
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 12252
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x1080062

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 1756
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    .line 1757
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->q:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingLeft()I

    move-result v3

    add-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 1758
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->r:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingTop()I

    move-result v3

    add-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 1759
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->s:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v3

    add-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 1760
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->t:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingBottom()I

    move-result v3

    add-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 1763
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aG:I

    if-ne v0, v2, :cond_1

    .line 1764
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v3

    .line 1765
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    .line 1766
    add-int/lit8 v0, v3, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1767
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    .line 1768
    :goto_0
    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v3, v4

    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bb:I

    if-lt v3, v4, :cond_3

    if-gt v0, v1, :cond_3

    move v0, v2

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aV:Z

    .line 1770
    :cond_1
    return-void

    :cond_2
    move v0, v1

    .line 1767
    goto :goto_0

    .line 1768
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method protected onOverScrolled(IIZZ)V
    .locals 3

    .prologue
    .line 3381
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 3382
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollY()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollY()I

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->onScrollChanged(IIII)V

    .line 3383
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/ag;->a(I)V

    .line 3384
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->D()V

    .line 3386
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->awakenScrollBars()Z

    .line 3388
    :cond_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x1

    .line 1549
    check-cast p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    .line 1551
    invoke-virtual {p1}, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1552
    iput-boolean v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    .line 1554
    iget v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->e:I

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ac:J

    .line 1556
    iget-wide v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    cmp-long v0, v0, v4

    if-ltz v0, :cond_4

    .line 1557
    iput-boolean v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ad:Z

    .line 1558
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    .line 1559
    iget-wide v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ab:J

    .line 1560
    iget v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aa:I

    .line 1561
    iget v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->W:I

    .line 1562
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ae:I

    .line 1581
    :cond_0
    :goto_0
    iget-object v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_1

    .line 1582
    iget-object v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    .line 1585
    :cond_1
    iget-object v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->j:Landroid/support/v4/util/LongSparseArray;

    if-eqz v0, :cond_2

    .line 1586
    iget-object v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->j:Landroid/support/v4/util/LongSparseArray;

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    .line 1589
    :cond_2
    iget v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->h:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    .line 1591
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_3

    .line 1592
    iget-boolean v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->g:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 1593
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->d:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/hlistview/ac;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->startActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    .line 1597
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->requestLayout()V

    .line 1598
    return-void

    .line 1563
    :cond_4
    iget-wide v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    cmp-long v0, v0, v4

    if-ltz v0, :cond_0

    .line 1564
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->l(I)V

    .line 1566
    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->m(I)V

    .line 1567
    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->n:I

    .line 1568
    iput-boolean v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ad:Z

    .line 1569
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    .line 1570
    iget-wide v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ab:J

    .line 1571
    iget v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aa:I

    .line 1572
    iget v0, p1, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->W:I

    .line 1573
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ae:I

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 10

    .prologue
    const-wide/16 v8, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1463
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1465
    new-instance v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    invoke-direct {v3, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1468
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    if-eqz v0, :cond_0

    .line 1470
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget-wide v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    iput-wide v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    .line 1471
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget-wide v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    iput-wide v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    .line 1472
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    .line 1473
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    .line 1474
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->e:I

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->e:I

    .line 1475
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->f:Ljava/lang/String;

    iput-object v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->f:Ljava/lang/String;

    .line 1476
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->g:Z

    iput-boolean v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->g:Z

    .line 1477
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->h:I

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->h:I

    .line 1478
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    iput-object v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    .line 1479
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->bc:Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->j:Landroid/support/v4/util/LongSparseArray;

    iput-object v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->j:Landroid/support/v4/util/LongSparseArray;

    move-object v0, v3

    .line 1541
    :goto_0
    return-object v0

    .line 1483
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-lez v0, :cond_2

    move v0, v1

    .line 1484
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->r()J

    move-result-wide v4

    .line 1485
    iput-wide v4, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    .line 1486
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v6

    iput v6, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->e:I

    .line 1488
    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-ltz v4, :cond_3

    .line 1490
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->J:I

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    .line 1491
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->q()I

    move-result v0

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    .line 1492
    iput-wide v8, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    .line 1519
    :goto_2
    const/4 v0, 0x0

    iput-object v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->f:Ljava/lang/String;

    .line 1520
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-lt v0, v4, :cond_6

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->b:I

    const/4 v4, 0x3

    if-ne v0, v4, :cond_6

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->c:Ljava/lang/Object;

    if-eqz v0, :cond_6

    :goto_3
    iput-boolean v1, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->g:Z

    .line 1523
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_1

    .line 1525
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->f:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->clone()Landroid/support/v4/util/SparseArrayCompat;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1531
    :cond_1
    :goto_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    if-eqz v0, :cond_8

    .line 1532
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 1533
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v1

    .line 1534
    :goto_5
    if-ge v2, v1, :cond_7

    .line 1535
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v4, v2}, Landroid/support/v4/util/LongSparseArray;->keyAt(I)J

    move-result-wide v4

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->g:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v6, v2}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v4, v5, v6}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 1534
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_2
    move v0, v2

    .line 1483
    goto :goto_1

    .line 1494
    :cond_3
    if-eqz v0, :cond_5

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    if-lez v0, :cond_5

    .line 1504
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1505
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    .line 1506
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    .line 1507
    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-lt v0, v4, :cond_4

    .line 1508
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    add-int/lit8 v0, v0, -0x1

    .line 1510
    :cond_4
    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    .line 1511
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v4, v0}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    iput-wide v4, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    goto :goto_2

    .line 1513
    :cond_5
    iput v2, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    .line 1514
    iput-wide v8, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    .line 1515
    iput v2, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    goto :goto_2

    :cond_6
    move v1, v2

    .line 1520
    goto :goto_3

    .line 1527
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NoSuchMethodError;->printStackTrace()V

    .line 1528
    new-instance v0, Landroid/support/v4/util/SparseArrayCompat;

    invoke-direct {v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>()V

    iput-object v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    goto :goto_4

    .line 1537
    :cond_7
    iput-object v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->j:Landroid/support/v4/util/LongSparseArray;

    .line 1539
    :cond_8
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->e:I

    iput v0, v3, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->h:I

    move-object v0, v3

    .line 1541
    goto/16 :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 2149
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 2150
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    .line 2151
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->y()V

    .line 2153
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Override"
        }
    .end annotation

    .prologue
    const/4 v6, 0x4

    const/4 v11, 0x2

    const/4 v2, 0x1

    const/4 v10, -0x1

    const/4 v1, 0x0

    .line 3016
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3019
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isClickable()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isLongClickable()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v1, v2

    .line 3376
    :cond_1
    :goto_0
    return v1

    .line 3022
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v0, :cond_3

    .line 3023
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 3026
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->S:Z

    if-eqz v0, :cond_1

    .line 3034
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 3038
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->E()V

    .line 3039
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    invoke-virtual {v3, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 3041
    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    :cond_4
    :goto_1
    :pswitch_0
    move v1, v2

    .line 3376
    goto :goto_0

    .line 3043
    :pswitch_1
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    packed-switch v0, :pswitch_data_1

    .line 3059
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 3060
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v4, v0

    .line 3061
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v5, v0

    .line 3062
    invoke-direct {p0, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(II)I

    move-result v3

    .line 3063
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v0, :cond_2a

    .line 3064
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-eq v0, v6, :cond_a

    if-ltz v3, :cond_a

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->p()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 3069
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3071
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aC:Ljava/lang/Runnable;

    if-nez v0, :cond_5

    .line 3072
    new-instance v0, Lcom/roidapp/baselib/hlistview/f;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/f;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aC:Ljava/lang/Runnable;

    .line 3074
    :cond_5
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aC:Ljava/lang/Runnable;

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {p0, v0, v6, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->postDelayed(Ljava/lang/Runnable;J)Z

    move v0, v3

    .line 3087
    :goto_2
    if-ltz v0, :cond_6

    .line 3089
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v3, v0, v3

    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3090
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    .line 3092
    :cond_6
    iput v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 3093
    iput v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->E:I

    .line 3094
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 3095
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    .line 15003
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v0, v3, :cond_8

    .line 15004
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_8

    .line 15005
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 15598
    :cond_7
    float-to-int v4, v0

    float-to-int v5, v3

    invoke-direct {p0, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(II)I

    move-result v4

    .line 15599
    if-eq v4, v10, :cond_7

    .line 15600
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v5, v4}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v6

    .line 15601
    iget v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v5, v4, v5

    invoke-virtual {p0, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 15602
    if-eqz v5, :cond_7

    .line 15603
    invoke-static {v5, v4, v6, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c(Landroid/view/View;IJ)Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->az:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 15604
    invoke-super {p0, p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->showContextMenuForChild(Landroid/view/View;)Z

    move-result v0

    .line 15005
    if-eqz v0, :cond_8

    move v1, v2

    .line 3100
    :cond_8
    if-eqz v1, :cond_4

    .line 3101
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-nez v0, :cond_4

    .line 3102
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aC:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    goto/16 :goto_1

    .line 3045
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    .line 3046
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v0, :cond_9

    .line 3047
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 3049
    :cond_9
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3050
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->E:I

    .line 3051
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 3052
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    .line 3053
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 3054
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aU:I

    goto :goto_3

    .line 3076
    :cond_a
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-ne v0, v6, :cond_2a

    .line 3078
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->G()V

    .line 3079
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3080
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    .line 3081
    invoke-virtual {p0, v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->f(I)I

    move-result v0

    .line 3082
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v3}, Lcom/roidapp/baselib/hlistview/g;->c()V

    goto/16 :goto_2

    .line 3109
    :pswitch_3
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 3110
    if-ne v0, v10, :cond_b

    .line 3112
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    move v0, v1

    .line 3114
    :cond_b
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    float-to-int v0, v0

    .line 3116
    iget-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-eqz v1, :cond_c

    .line 3119
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d()V

    .line 3122
    :cond_c
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    packed-switch v1, :pswitch_data_2

    :pswitch_4
    goto/16 :goto_1

    .line 3128
    :pswitch_5
    invoke-direct {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->n(I)Z

    goto/16 :goto_1

    .line 3132
    :pswitch_6
    invoke-direct {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->o(I)V

    goto/16 :goto_1

    .line 3139
    :pswitch_7
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    packed-switch v0, :pswitch_data_3

    .line 3280
    :cond_d
    :goto_4
    :pswitch_8
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 3282
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    if-eqz v0, :cond_e

    .line 3283
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 3284
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 3288
    :cond_e
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 3290
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    .line 3291
    if-eqz v0, :cond_f

    .line 3292
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aB:Lcom/roidapp/baselib/hlistview/e;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3295
    :cond_f
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->F()V

    .line 3297
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    goto/16 :goto_1

    .line 3143
    :pswitch_9
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 3144
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 3146
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 3147
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    cmpl-float v5, v0, v5

    if-lez v5, :cond_16

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    sub-int/2addr v5, v6

    int-to-float v5, v5

    cmpg-float v0, v0, v5

    if-gez v0, :cond_16

    move v0, v2

    .line 3149
    :goto_5
    if-eqz v4, :cond_1a

    invoke-virtual {v4}, Landroid/view/View;->hasFocusable()Z

    move-result v5

    if-nez v5, :cond_1a

    if-eqz v0, :cond_1a

    .line 3150
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-eqz v0, :cond_10

    .line 3151
    invoke-virtual {v4, v1}, Landroid/view/View;->setPressed(Z)V

    .line 3154
    :cond_10
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aE:Lcom/roidapp/baselib/hlistview/k;

    if-nez v0, :cond_11

    .line 3155
    new-instance v0, Lcom/roidapp/baselib/hlistview/k;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/baselib/hlistview/k;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aE:Lcom/roidapp/baselib/hlistview/k;

    .line 3158
    :cond_11
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aE:Lcom/roidapp/baselib/hlistview/k;

    .line 3159
    iput v3, v5, Lcom/roidapp/baselib/hlistview/k;->a:I

    .line 3160
    invoke-virtual {v5}, Lcom/roidapp/baselib/hlistview/k;->a()V

    .line 3162
    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 3164
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-eqz v0, :cond_12

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-ne v0, v2, :cond_19

    .line 3165
    :cond_12
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHandler()Landroid/os/Handler;

    move-result-object v6

    .line 3166
    if-eqz v6, :cond_13

    .line 3167
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aC:Ljava/lang/Runnable;

    :goto_6
    invoke-virtual {v6, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3170
    :cond_13
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 3172
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v0, :cond_18

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 3173
    iput v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3174
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->l(I)V

    .line 3175
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d()V

    .line 3176
    invoke-virtual {v4, v2}, Landroid/view/View;->setPressed(Z)V

    .line 3177
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    invoke-virtual {p0, v0, v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(ILandroid/view/View;)V

    .line 3178
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 3179
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_14

    .line 3180
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 3181
    if-eqz v0, :cond_14

    instance-of v1, v0, Landroid/graphics/drawable/TransitionDrawable;

    if-eqz v1, :cond_14

    .line 3182
    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/TransitionDrawable;->resetTransition()V

    .line 3185
    :cond_14
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aF:Ljava/lang/Runnable;

    if-eqz v0, :cond_15

    .line 3186
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aF:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3188
    :cond_15
    new-instance v0, Lcom/roidapp/baselib/hlistview/a;

    invoke-direct {v0, p0, v4, v5}, Lcom/roidapp/baselib/hlistview/a;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;Lcom/roidapp/baselib/hlistview/k;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aF:Ljava/lang/Runnable;

    .line 3200
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aF:Ljava/lang/Runnable;

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v1

    int-to-long v4, v1

    invoke-virtual {p0, v0, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_7
    move v1, v2

    .line 3206
    goto/16 :goto_0

    :cond_16
    move v0, v1

    .line 3147
    goto/16 :goto_5

    .line 3167
    :cond_17
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aB:Lcom/roidapp/baselib/hlistview/e;

    goto :goto_6

    .line 3203
    :cond_18
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3204
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->C()V

    goto :goto_7

    .line 3207
    :cond_19
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v0, :cond_1a

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 3208
    invoke-virtual {v5}, Lcom/roidapp/baselib/hlistview/k;->run()V

    .line 3211
    :cond_1a
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3212
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->C()V

    goto/16 :goto_4

    .line 3215
    :pswitch_a
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v0

    .line 3216
    if-lez v0, :cond_21

    .line 3217
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 3218
    add-int/lit8 v4, v0, -0x1

    invoke-virtual {p0, v4}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    .line 3219
    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 3220
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v6

    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v7, v7, Landroid/graphics/Rect;->right:I

    sub-int/2addr v6, v7

    .line 3221
    iget v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    if-nez v7, :cond_1b

    if-lt v3, v5, :cond_1b

    iget v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v7, v0

    iget v8, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-ge v7, v8, :cond_1b

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v7

    sub-int/2addr v7, v6

    if-gt v4, v7, :cond_1b

    .line 3223
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3224
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    goto/16 :goto_4

    .line 3226
    :cond_1b
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    .line 3227
    const/16 v8, 0x3e8

    iget v9, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aN:I

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 3229
    iget v8, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    invoke-virtual {v7, v8}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v7

    iget v8, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aO:F

    mul-float/2addr v7, v8

    float-to-int v7, v7

    .line 3234
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v8

    iget v9, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aM:I

    if-le v8, v9, :cond_1f

    iget v8, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    if-nez v8, :cond_1c

    iget v8, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->Q:I

    sub-int/2addr v5, v8

    if-eq v3, v5, :cond_1f

    :cond_1c
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v0, v3

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-ne v0, v3, :cond_1d

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->Q:I

    add-int/2addr v0, v6

    if-eq v4, v0, :cond_1f

    .line 3239
    :cond_1d
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-nez v0, :cond_1e

    .line 3240
    new-instance v0, Lcom/roidapp/baselib/hlistview/g;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/g;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    .line 3242
    :cond_1e
    invoke-virtual {p0, v11}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    .line 3244
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    neg-int v3, v7

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/hlistview/g;->a(I)V

    goto/16 :goto_4

    .line 3246
    :cond_1f
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3247
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    .line 3248
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-eqz v0, :cond_20

    .line 3249
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    .line 3251
    :cond_20
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v0, :cond_d

    .line 3252
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    goto/16 :goto_4

    .line 3257
    :cond_21
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3258
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    goto/16 :goto_4

    .line 3263
    :pswitch_b
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-nez v0, :cond_22

    .line 3264
    new-instance v0, Lcom/roidapp/baselib/hlistview/g;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/g;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    .line 3266
    :cond_22
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->au:Landroid/view/VelocityTracker;

    .line 3267
    const/16 v3, 0x3e8

    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aN:I

    int-to-float v4, v4

    invoke-virtual {v0, v3, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 3268
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    invoke-virtual {v0, v3}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    float-to-int v0, v0

    .line 3270
    invoke-virtual {p0, v11}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    .line 3271
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aM:I

    if-le v3, v4, :cond_23

    .line 3272
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    neg-int v0, v0

    invoke-virtual {v3, v0}, Lcom/roidapp/baselib/hlistview/g;->b(I)V

    goto/16 :goto_4

    .line 3274
    :cond_23
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/g;->a()V

    goto/16 :goto_4

    .line 3302
    :pswitch_c
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    packed-switch v0, :pswitch_data_4

    .line 3315
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3316
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 3317
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v0, v3

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 3318
    if-eqz v0, :cond_24

    .line 3319
    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 3321
    :cond_24
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->H()V

    .line 3323
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    .line 3324
    if-eqz v0, :cond_25

    .line 3325
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aB:Lcom/roidapp/baselib/hlistview/e;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3328
    :cond_25
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->F()V

    .line 3331
    :goto_8
    :pswitch_d
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    if-eqz v0, :cond_26

    .line 3332
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 3333
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/w;->c()V

    .line 3335
    :cond_26
    iput v10, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    goto/16 :goto_1

    .line 3304
    :pswitch_e
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-nez v0, :cond_27

    .line 3305
    new-instance v0, Lcom/roidapp/baselib/hlistview/g;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/g;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    .line 3307
    :cond_27
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/g;->a()V

    goto :goto_8

    .line 3340
    :pswitch_f
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/MotionEvent;)V

    .line 3341
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 3342
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->E:I

    .line 3343
    invoke-direct {p0, v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(II)I

    move-result v1

    .line 3344
    if-ltz v1, :cond_28

    .line 3346
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v3, v1, v3

    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3347
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    .line 3348
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 3350
    :cond_28
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    goto/16 :goto_1

    .line 3356
    :pswitch_10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 3357
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 3358
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    .line 3359
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    .line 3360
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->H:I

    .line 3361
    iput v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aP:I

    .line 3362
    iput v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->D:I

    .line 3363
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->E:I

    .line 3364
    invoke-direct {p0, v4, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(II)I

    move-result v0

    .line 3365
    if-ltz v0, :cond_29

    .line 3367
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v1, v0, v1

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 3368
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    .line 3369
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 3371
    :cond_29
    iput v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->G:I

    goto/16 :goto_1

    :cond_2a
    move v0, v3

    goto/16 :goto_2

    .line 3041
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_7
        :pswitch_3
        :pswitch_c
        :pswitch_0
        :pswitch_10
        :pswitch_f
    .end packed-switch

    .line 3043
    :pswitch_data_1
    .packed-switch 0x6
        :pswitch_2
    .end packed-switch

    .line 3122
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_6
    .end packed-switch

    .line 3139
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_8
        :pswitch_b
    .end packed-switch

    .line 3302
    :pswitch_data_4
    .packed-switch 0x5
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method public onTouchModeChanged(Z)V
    .locals 2

    .prologue
    .line 2962
    if-eqz p1, :cond_2

    .line 2964
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->k()V

    .line 2968
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 2971
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d()V

    .line 2973
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->C()V

    .line 2991
    :cond_1
    :goto_0
    return-void

    .line 2975
    :cond_2
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 2976
    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 2977
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-eqz v0, :cond_4

    .line 2978
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    .line 2980
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v0, :cond_5

    .line 2981
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 2984
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2985
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/ag;->a(I)V

    .line 2986
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->J()V

    .line 2987
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    goto :goto_0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 2408
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->onWindowFocusChanged(Z)V

    .line 2410
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    .line 2412
    :goto_0
    if-nez p1, :cond_4

    .line 2413
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setChildrenDrawingCacheEnabled(Z)V

    .line 2414
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    if-eqz v3, :cond_1

    .line 2415
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {p0, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2418
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->av:Lcom/roidapp/baselib/hlistview/g;

    invoke-virtual {v3}, Lcom/roidapp/baselib/hlistview/g;->b()V

    .line 2419
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v3, :cond_0

    .line 2420
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v3}, Lcom/roidapp/baselib/hlistview/l;->a()V

    .line 2422
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v3

    if-eqz v3, :cond_1

    .line 2423
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v3, v1}, Lcom/roidapp/baselib/hlistview/ag;->a(I)V

    .line 2424
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->J()V

    .line 2425
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 2430
    :cond_1
    if-ne v0, v2, :cond_2

    .line 2432
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->M:I

    .line 2451
    :cond_2
    :goto_1
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aA:I

    .line 2452
    return-void

    :cond_3
    move v0, v2

    .line 2410
    goto :goto_0

    .line 2436
    :cond_4
    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aA:I

    if-eq v0, v3, :cond_2

    iget v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aA:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    .line 2438
    if-ne v0, v2, :cond_5

    .line 2440
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->I()Z

    goto :goto_1

    .line 2444
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->k()V

    .line 2445
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->h:I

    .line 2446
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d()V

    goto :goto_1
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    const/16 v4, 0xc8

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1179
    invoke-super {p0, p1, p2}, Lcom/roidapp/baselib/hlistview/AdapterView;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1200
    :goto_0
    return v0

    .line 1182
    :cond_0
    sparse-switch p1, :sswitch_data_0

    move v0, v1

    .line 1200
    goto :goto_0

    .line 1184
    :sswitch_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->u()I

    move-result v2

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->s()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_1

    .line 1185
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v3

    .line 10445
    invoke-virtual {p0, v2, v4, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 1190
    goto :goto_0

    .line 1192
    :sswitch_1
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    if-lez v2, :cond_2

    .line 1193
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->u:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v3

    .line 1194
    neg-int v2, v2

    .line 11445
    invoke-virtual {p0, v2, v4, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(IIZ)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 1198
    goto :goto_0

    .line 1182
    nop

    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_1
    .end sparse-switch
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .prologue
    .line 3517
    if-eqz p1, :cond_0

    .line 3518
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->F()V

    .line 3520
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->requestDisallowInterceptTouchEvent(Z)V

    .line 3521
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 1617
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->at:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->af:Z

    if-nez v0, :cond_0

    .line 1618
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->requestLayout()V

    .line 1620
    :cond_0
    return-void
.end method

.method public sendAccessibilityEvent(I)V
    .locals 3

    .prologue
    .line 1138
    const/16 v0, 0x1000

    if-ne p1, v0, :cond_1

    .line 1139
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->t()I

    move-result v0

    .line 1140
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->u()I

    move-result v1

    .line 1141
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aZ:I

    if-ne v2, v0, :cond_0

    iget v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ba:I

    if-ne v2, v1, :cond_0

    .line 1150
    :goto_0
    return-void

    .line 1145
    :cond_0
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aZ:I

    .line 1146
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ba:I

    .line 1149
    :cond_1
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->sendAccessibilityEvent(I)V

    goto :goto_0
.end method

.method public setOverScrollMode(I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x2

    .line 699
    if-eqz p1, :cond_0

    move p1, v0

    .line 700
    :cond_0
    if-eq p1, v0, :cond_2

    .line 701
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    if-nez v0, :cond_1

    .line 702
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 703
    new-instance v1, Lcom/roidapp/baselib/hlistview/w;

    invoke-direct {v1, v0}, Lcom/roidapp/baselib/hlistview/w;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    .line 704
    new-instance v1, Lcom/roidapp/baselib/hlistview/w;

    invoke-direct {v1, v0}, Lcom/roidapp/baselib/hlistview/w;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    .line 710
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->setOverScrollMode(I)V

    .line 711
    return-void

    .line 707
    :cond_2
    iput-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aQ:Lcom/roidapp/baselib/hlistview/w;

    .line 708
    iput-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aR:Lcom/roidapp/baselib/hlistview/w;

    goto :goto_0
.end method

.method public showContextMenuForChild(Landroid/view/View;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 2612
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/View;)I

    move-result v1

    .line 2613
    if-ltz v1, :cond_1

    .line 2614
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v2, v1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v2

    .line 2617
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ai:Lcom/roidapp/baselib/hlistview/t;

    if-eqz v4, :cond_0

    .line 2618
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ai:Lcom/roidapp/baselib/hlistview/t;

    invoke-interface {v0}, Lcom/roidapp/baselib/hlistview/t;->a()Z

    move-result v0

    .line 2621
    :cond_0
    if-nez v0, :cond_1

    .line 2622
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c(Landroid/view/View;IJ)Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->az:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 2625
    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->showContextMenuForChild(Landroid/view/View;)Z

    move-result v0

    .line 2630
    :cond_1
    return v0
.end method

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 2337
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView;->m:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_0

    invoke-super {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
