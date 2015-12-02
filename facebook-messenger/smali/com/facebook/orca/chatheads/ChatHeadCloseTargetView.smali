.class public Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;
.super Lcom/facebook/widget/d;
.source "ChatHeadCloseTargetView.java"


# static fields
.field private static final a:Lcom/facebook/n/g;

.field private static final b:Lcom/facebook/n/g;


# instance fields
.field private final c:Landroid/view/View;

.field private final d:Landroid/view/View;

.field private final e:Landroid/view/View;

.field private final f:Lcom/facebook/n/c;

.field private final g:Lcom/facebook/n/c;

.field private final h:Lcom/facebook/n/c;

.field private final i:Lcom/facebook/n/c;

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private q:Z

.field private r:Z

.field private s:F

.field private t:F

.field private u:Lcom/facebook/orca/chatheads/l;

.field private v:Lcom/facebook/orca/chatheads/m;

.field private w:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private x:Landroid/graphics/Rect;

.field private y:Landroid/graphics/PointF;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 52
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a:Lcom/facebook/n/g;

    .line 54
    const-wide v0, 0x4062c00000000000L    # 150.0

    const-wide/high16 v2, 0x4022000000000000L    # 9.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b:Lcom/facebook/n/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 88
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 91
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 92
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .prologue
    const-wide/high16 v6, 0x3fe4000000000000L    # 0.625

    const-wide v4, 0x3f747ae140000000L    # 0.004999999888241291

    .line 95
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 83
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->x:Landroid/graphics/Rect;

    .line 84
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->y:Landroid/graphics/PointF;

    .line 97
    sget v0, Lcom/facebook/k;->orca_chat_close_target:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->setContentView(I)V

    .line 98
    sget v0, Lcom/facebook/i;->background:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c:Landroid/view/View;

    .line 99
    sget v0, Lcom/facebook/i;->close_bauble:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d:Landroid/view/View;

    .line 100
    sget v0, Lcom/facebook/i;->close_bauble_base:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->e:Landroid/view/View;

    .line 102
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 103
    const-class v1, Lcom/facebook/n/j;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/ForChatHeads;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    .line 105
    new-instance v1, Lcom/facebook/orca/chatheads/k;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/k;-><init>(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;Lcom/facebook/orca/chatheads/j;)V

    .line 106
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a:Lcom/facebook/n/g;

    invoke-virtual {v2, v3}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    .line 109
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a:Lcom/facebook/n/g;

    invoke-virtual {v2, v3}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    .line 112
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b:Lcom/facebook/n/g;

    invoke-virtual {v2, v3}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    .line 119
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a:Lcom/facebook/n/g;

    invoke-virtual {v0, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    .line 126
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->chat_close_unstashed_y:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->j:I

    .line 127
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->chat_close_stashed_y:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->k:I

    .line 128
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->chat_close_area_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->l:I

    .line 129
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->chat_close_area_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->m:I

    .line 131
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->chat_close_fling_area_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->n:I

    .line 133
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->chat_close_min_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->o:I

    .line 134
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/g;->chat_close_max_attract_y:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->p:I

    .line 136
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b()Lcom/google/common/d/a/s;

    .line 137
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g()V

    .line 138
    return-void
.end method

.method private a(F)F
    .locals 3

    .prologue
    .line 419
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 420
    iget v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->j:I

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float v2, p1, v2

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)F
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->s:F

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;F)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->setBaubleX(F)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;FF)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d(FF)V

    return-void
.end method

.method private b(F)F
    .locals 3

    .prologue
    .line 435
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(F)F

    move-result v0

    .line 436
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 438
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)F
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->t:F

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;F)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->setBaubleY(F)V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    return-object v0
.end method

.method private d(FF)V
    .locals 9

    .prologue
    const v7, 0x3dcccccd    # 0.1f

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const/4 v8, 0x0

    .line 297
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f()V

    .line 299
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    if-nez v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->v:Lcom/facebook/orca/chatheads/m;

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->v:Lcom/facebook/orca/chatheads/m;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/m;->a()V

    .line 304
    :cond_0
    iput-boolean v8, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->q:Z

    .line 305
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    .line 307
    invoke-direct {p0, p2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(F)F

    move-result v0

    .line 309
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getCloseBaubleCenterXInScreen()I

    move-result v1

    int-to-float v1, v1

    sub-float v1, p1, v1

    .line 310
    invoke-direct {p0, p2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b(F)F

    move-result v4

    sub-float v4, p2, v4

    .line 314
    mul-float/2addr v1, v7

    .line 315
    iget v5, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->p:I

    neg-int v5, v5

    int-to-float v5, v5

    const/4 v6, 0x0

    mul-float/2addr v4, v7

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 317
    iget-object v5, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    float-to-double v6, v1

    invoke-virtual {v5, v6, v7}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 320
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    add-float/2addr v0, v4

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 324
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    invoke-virtual {v0, v8}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v4

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    move-wide v0, v2

    :goto_0
    invoke-virtual {v4, v0, v1}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 328
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    invoke-virtual {v0, v8}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 331
    return-void

    .line 324
    :cond_1
    const-wide/high16 v0, 0x3fe4000000000000L    # 0.625

    goto :goto_0
.end method

.method static synthetic e(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Landroid/view/View;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->e:Landroid/view/View;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 442
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 444
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    .line 446
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    return-object v0
.end method

.method private g()V
    .locals 3

    .prologue
    .line 449
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->d()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 450
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->d()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 451
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->d()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 452
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->d()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 453
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f()V

    .line 454
    return-void
.end method

.method private getCloseBaubleCenterXInScreen()I
    .locals 1

    .prologue
    .line 427
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method static synthetic h(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Landroid/view/View;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->c:Landroid/view/View;

    return-object v0
.end method

.method private h()Z
    .locals 1

    .prologue
    .line 479
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic i(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)Z
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h()Z

    move-result v0

    return v0
.end method

.method private setBaubleX(F)V
    .locals 1

    .prologue
    .line 460
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d:Landroid/view/View;

    invoke-static {v0, p1}, Lcom/a/c/a;->g(Landroid/view/View;F)V

    .line 462
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->u:Lcom/facebook/orca/chatheads/l;

    if-eqz v0, :cond_0

    .line 463
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->u:Lcom/facebook/orca/chatheads/l;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/l;->a()V

    .line 465
    :cond_0
    return-void
.end method

.method private setBaubleY(F)V
    .locals 1

    .prologue
    .line 471
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d:Landroid/view/View;

    invoke-static {v0, p1}, Lcom/a/c/a;->h(Landroid/view/View;F)V

    .line 473
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->u:Lcom/facebook/orca/chatheads/l;

    if-eqz v0, :cond_0

    .line 474
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->u:Lcom/facebook/orca/chatheads/l;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/l;->a()V

    .line 476
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 142
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 148
    :cond_0
    return-void
.end method

.method public a(FF)V
    .locals 3

    .prologue
    .line 221
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->q:Z

    if-eqz v0, :cond_0

    .line 222
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f()V

    .line 225
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->q:Z

    .line 230
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 231
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d(FF)V

    .line 234
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    if-nez v0, :cond_3

    .line 236
    iput p1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->s:F

    .line 237
    iput p2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->t:F

    .line 239
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    if-nez v0, :cond_3

    .line 240
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    new-instance v1, Lcom/facebook/orca/chatheads/j;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/j;-><init>(Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 251
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 256
    :cond_3
    return-void
.end method

.method public a(Landroid/graphics/PointF;)V
    .locals 2

    .prologue
    .line 337
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d:Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->x:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 342
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 343
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iput v1, p1, Landroid/graphics/PointF;->x:F

    .line 344
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 349
    :goto_0
    return-void

    .line 346
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->x:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 347
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->x:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/PointF;->y:F

    goto :goto_0
.end method

.method public a(FFFF)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 394
    const/4 v1, 0x0

    cmpg-float v1, p4, v1

    if-gtz v1, :cond_1

    .line 409
    :cond_0
    :goto_0
    return v0

    .line 399
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 400
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v1, v1

    sub-float/2addr v1, p2

    div-float/2addr v1, p4

    .line 403
    mul-float/2addr v1, p3

    add-float/2addr v1, p1

    .line 406
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getCloseBaubleCenterXInScreen()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    .line 409
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->n:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()Lcom/google/common/d/a/s;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const-wide/16 v4, 0x0

    const/4 v3, 0x1

    .line 169
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->q:Z

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    .line 203
    :goto_0
    return-object v0

    .line 173
    :cond_0
    invoke-static {v6}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0

    .line 176
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f()V

    .line 178
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    if-eqz v0, :cond_2

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->v:Lcom/facebook/orca/chatheads/m;

    if-eqz v0, :cond_2

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->v:Lcom/facebook/orca/chatheads/m;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/m;->b()V

    .line 183
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    .line 184
    iput-boolean v3, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->q:Z

    .line 186
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f:Lcom/facebook/n/c;

    invoke-virtual {v0, v4, v5}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 190
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->g:Lcom/facebook/n/c;

    iget v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->k:I

    int-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 193
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h:Lcom/facebook/n/c;

    invoke-virtual {v0, v3}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    const-wide/high16 v1, 0x3fe4000000000000L    # 0.625

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 196
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->i:Lcom/facebook/n/c;

    invoke-virtual {v0, v3}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 200
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v6}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 203
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->w:Lcom/google/common/d/a/ab;

    goto :goto_0
.end method

.method public b(FF)Z
    .locals 3

    .prologue
    .line 355
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getCloseBaubleCenterXInScreen()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, p1, v0

    .line 356
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->m:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    sub-float v1, p2, v1

    .line 358
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->l:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x0

    cmpl-float v0, v1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 207
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->q:Z

    return v0
.end method

.method public c(FF)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 365
    iget-boolean v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->q:Z

    if-eqz v1, :cond_1

    .line 375
    :cond_0
    :goto_0
    return v0

    .line 369
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->y:Landroid/graphics/PointF;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a(Landroid/graphics/PointF;)V

    .line 371
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->y:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float v1, p1, v1

    .line 372
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->y:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float v2, p2, v2

    .line 373
    mul-float/2addr v1, v1

    mul-float/2addr v2, v2

    add-float/2addr v1, v2

    .line 375
    iget v2, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->o:I

    iget v3, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->o:I

    mul-int/2addr v2, v3

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 263
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    if-nez v0, :cond_0

    .line 264
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f()V

    .line 266
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getCloseBaubleCenterXInScreen()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d(FF)V

    .line 267
    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    .line 275
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->r:Z

    if-nez v0, :cond_0

    .line 276
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->f()V

    .line 278
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->getCloseBaubleCenterXInScreen()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->b(F)F

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->d(FF)V

    .line 282
    return-void
.end method

.method public setOnCloseBaublePositionListener(Lcom/facebook/orca/chatheads/l;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->u:Lcom/facebook/orca/chatheads/l;

    .line 155
    return-void
.end method

.method public setOnCloseBaubleStateChangeListener(Lcom/facebook/orca/chatheads/m;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->v:Lcom/facebook/orca/chatheads/m;

    .line 162
    return-void
.end method
