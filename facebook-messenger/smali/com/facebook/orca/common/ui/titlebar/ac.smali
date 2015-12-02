.class public Lcom/facebook/orca/common/ui/titlebar/ac;
.super Lcom/facebook/widget/d;
.source "TitleBarDivebarButtonOverlay.java"


# static fields
.field private static final a:Z

.field private static final b:Lcom/facebook/n/g;

.field private static final c:Lcom/facebook/n/g;


# instance fields
.field private final d:Lcom/facebook/widget/MaskedFrameLayout;

.field private final e:Lcom/facebook/user/tiles/UserTileView;

.field private final f:Landroid/widget/ImageView;

.field private final g:Landroid/widget/TextView;

.field private final h:Landroid/os/Handler;

.field private final i:Lcom/facebook/n/c;

.field private final j:Lcom/facebook/n/c;

.field private final k:Lcom/facebook/n/c;

.field private final l:Lcom/facebook/n/b;

.field private final m:Lcom/facebook/n/b;

.field private final n:Lcom/facebook/n/b;

.field private final o:Ljava/lang/Runnable;

.field private p:I

.field private q:Z

.field private r:Ljava/lang/String;

.field private s:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private t:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private u:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/facebook/orca/common/ui/titlebar/ac;->a:Z

    .line 42
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/ac;->b:Lcom/facebook/n/g;

    .line 44
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/ac;->c:Lcom/facebook/n/g;

    return-void

    .line 39
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 79
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 80
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const-wide v3, 0x3f747ae140000000L    # 0.004999999888241291

    .line 87
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 89
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 90
    sget v0, Lcom/facebook/k;->orca_titlebar_animated_divebar_button_overlay:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->setContentView(I)V

    .line 91
    sget v0, Lcom/facebook/i;->masked_frame_layout:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/MaskedFrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->d:Lcom/facebook/widget/MaskedFrameLayout;

    .line 92
    sget v0, Lcom/facebook/i;->divebar_button_badge_count:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    .line 93
    sget v0, Lcom/facebook/i;->user_tile_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->e:Lcom/facebook/user/tiles/UserTileView;

    .line 94
    sget v0, Lcom/facebook/i;->green_dot:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    .line 95
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->h:Landroid/os/Handler;

    .line 97
    const-class v0, Lcom/facebook/n/j;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    .line 99
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ao;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/common/ui/titlebar/ao;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;Landroid/view/View;)V

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->l:Lcom/facebook/n/b;

    .line 100
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ao;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/common/ui/titlebar/ao;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;Landroid/view/View;)V

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->m:Lcom/facebook/n/b;

    .line 101
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/an;

    invoke-direct {v1, p0, v5}, Lcom/facebook/orca/common/ui/titlebar/an;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;Lcom/facebook/orca/common/ui/titlebar/ad;)V

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->n:Lcom/facebook/n/b;

    .line 103
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/common/ui/titlebar/ac;->b:Lcom/facebook/n/g;

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    .line 107
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/common/ui/titlebar/ac;->b:Lcom/facebook/n/g;

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    .line 111
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/ac;->c:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    .line 116
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->s:Lcom/google/common/d/a/ab;

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->s:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v5}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 118
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->t:Lcom/google/common/d/a/ab;

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->t:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v5}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 120
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->u:Lcom/google/common/d/a/ab;

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->u:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v5}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 123
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/ad;

    invoke-direct {v0, p0}, Lcom/facebook/orca/common/ui/titlebar/ad;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->o:Ljava/lang/Runnable;

    .line 129
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/ac;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    return v0
.end method

.method private a(F)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 402
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    .line 404
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->s:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 405
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->s:Lcom/google/common/d/a/ab;

    .line 406
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 408
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->s:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/ac;F)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(F)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/ac;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/ac;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/ac;Z)Z
    .locals 0

    .prologue
    .line 37
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->q:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/common/ui/titlebar/ac;I)I
    .locals 0

    .prologue
    .line 37
    iput p1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/common/ui/titlebar/ac;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method private b(F)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 412
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    .line 414
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->t:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 415
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->t:Lcom/google/common/d/a/ab;

    .line 416
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 418
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->t:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 254
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->f()V

    .line 258
    :goto_0
    return-void

    .line 256
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->e()V

    goto :goto_0
.end method

.method private c(F)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 422
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->u:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 424
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->u:Lcom/google/common/d/a/ab;

    .line 425
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 427
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->u:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 262
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->g()V

    .line 264
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->g()V

    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 447
    const/16 v0, 0x63

    if-le p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/o;->divebar_overlay_ninety_nine_plus:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private d()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 267
    iput-boolean v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->q:Z

    .line 268
    invoke-static {p0, v2}, Lcom/a/c/a;->d(Landroid/view/View;F)V

    .line 269
    invoke-static {p0, v2}, Lcom/a/c/a;->g(Landroid/view/View;F)V

    .line 270
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->d:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v2, v0}, Lcom/facebook/widget/MaskedFrameLayout;->setVisibility(I)V

    .line 271
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->e:Lcom/facebook/user/tiles/UserTileView;

    invoke-virtual {v2, v0}, Lcom/facebook/user/tiles/UserTileView;->setVisibility(I)V

    .line 273
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->clearAnimation()V

    .line 274
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 275
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    iget v3, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    if-lez v3, :cond_0

    move v0, v1

    :cond_0
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 276
    invoke-virtual {p0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setClickable(Z)V

    .line 277
    invoke-virtual {p0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setFocusable(Z)V

    .line 278
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->i()V

    return-void
.end method

.method private e()V
    .locals 3

    .prologue
    .line 284
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 285
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 287
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(F)Lcom/google/common/d/a/s;

    .line 288
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->j()V

    return-void
.end method

.method private f()V
    .locals 4

    .prologue
    .line 294
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 295
    const v0, 0x3f933333    # 1.15f

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(F)Lcom/google/common/d/a/s;

    .line 296
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->h:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->o:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 297
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ag;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/ag;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 306
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->k()V

    return-void
.end method

.method private g()V
    .locals 3

    .prologue
    .line 312
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 313
    const v0, 0x3f933333    # 1.15f

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(F)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ah;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/ah;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 331
    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->d()V

    return-void
.end method

.method private h()V
    .locals 3

    .prologue
    .line 338
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 339
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c(F)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/aj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/aj;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 348
    return-void
.end method

.method static synthetic h(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->o()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    return-object v0
.end method

.method private i()V
    .locals 4

    .prologue
    .line 351
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ak;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/ak;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 360
    return-void
.end method

.method static synthetic j(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->s:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 367
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 368
    const v0, -0x42b33333    # -0.05f

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c(F)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/al;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/al;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 377
    return-void
.end method

.method static synthetic k(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    return-object v0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 380
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 381
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c(F)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/am;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/am;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 390
    return-void
.end method

.method static synthetic l(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->t:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private l()V
    .locals 3

    .prologue
    .line 396
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 397
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 398
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->b(F)Lcom/google/common/d/a/s;

    .line 399
    return-void
.end method

.method static synthetic m(Lcom/facebook/orca/common/ui/titlebar/ac;)Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->q:Z

    return v0
.end method

.method static synthetic n(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->l()V

    return-void
.end method

.method static synthetic o(Lcom/facebook/orca/common/ui/titlebar/ac;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->u:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private o()V
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->setViewCachingEnabled(Z)V

    .line 444
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 230
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 231
    const/16 v1, 0x53

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 232
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 233
    return-void
.end method

.method public a(I)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 160
    if-lez p1, :cond_0

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 164
    iput p1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    invoke-direct {p0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 4

    .prologue
    .line 190
    invoke-virtual {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setBadgeCount(I)V

    .line 191
    iput p2, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    .line 192
    if-eq p1, p2, :cond_0

    .line 193
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->h:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->o:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/af;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/af;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 204
    return-void
.end method

.method public a(Lcom/facebook/user/User;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 215
    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->setClickable(Z)V

    .line 216
    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->setFocusable(Z)V

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->e:Lcom/facebook/user/tiles/UserTileView;

    invoke-static {p1}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/User;)Lcom/facebook/user/tiles/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 218
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->d:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/MaskedFrameLayout;->setVisibility(I)V

    .line 219
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->e:Lcom/facebook/user/tiles/UserTileView;

    invoke-virtual {v0, v2}, Lcom/facebook/user/tiles/UserTileView;->setVisibility(I)V

    .line 220
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 221
    const/16 v1, 0x55

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 222
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 223
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 225
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->h()V

    .line 226
    return-void
.end method

.method public b(I)V
    .locals 4

    .prologue
    .line 174
    if-lez p1, :cond_0

    .line 175
    invoke-virtual {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(I)V

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ae;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/ae;-><init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 183
    :cond_0
    return-void
.end method

.method public getBadgeCount()I
    .locals 1

    .prologue
    .line 132
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 237
    invoke-super {p0}, Lcom/facebook/widget/d;->onAttachedToWindow()V

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->l:Lcom/facebook/n/b;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    .line 239
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->m:Lcom/facebook/n/b;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->n:Lcom/facebook/n/b;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    .line 241
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 245
    invoke-super {p0}, Lcom/facebook/widget/d;->onDetachedFromWindow()V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->i:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->j()Lcom/facebook/n/c;

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->j:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->j()Lcom/facebook/n/c;

    .line 248
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->k:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->j()Lcom/facebook/n/c;

    .line 249
    return-void
.end method

.method public setBadgeCount(I)V
    .locals 1

    .prologue
    .line 142
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    if-ne v0, p1, :cond_0

    .line 153
    :goto_0
    return-void

    .line 146
    :cond_0
    iput p1, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->p:I

    .line 147
    if-lez p1, :cond_1

    .line 148
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/ac;->d(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ac;->r:Ljava/lang/String;

    .line 149
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->b()V

    goto :goto_0

    .line 151
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ac;->c()V

    goto :goto_0
.end method

.method protected setViewCachingEnabled(Z)V
    .locals 2

    .prologue
    .line 431
    sget-boolean v0, Lcom/facebook/orca/common/ui/titlebar/ac;->a:Z

    if-eqz v0, :cond_1

    .line 432
    if-eqz p1, :cond_0

    const/4 v0, 0x2

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setLayerType(ILandroid/graphics/Paint;)V

    .line 436
    :goto_1
    return-void

    .line 432
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 434
    :cond_1
    invoke-virtual {p0, p1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setDrawingCacheEnabled(Z)V

    goto :goto_1
.end method
