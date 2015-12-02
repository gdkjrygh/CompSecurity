.class public Lcom/facebook/orca/chatheads/v;
.super Lcom/facebook/widget/d;
.source "ChatHeadTextBubbleView.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/n/g;


# instance fields
.field private final c:Lcom/facebook/orca/common/ui/a/b;

.field private final d:Landroid/os/Handler;

.field private final e:Lcom/facebook/n/c;

.field private final f:Lcom/facebook/n/c;

.field private final g:Lcom/facebook/widget/MaskedFrameLayout;

.field private final h:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

.field private final i:Lcom/facebook/widget/MaskedFrameLayout;

.field private final j:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

.field private final k:Ljava/lang/Runnable;

.field private l:Lcom/facebook/orca/chatheads/ac;

.field private m:Landroid/view/GestureDetector;

.field private n:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/facebook/orca/chatheads/ab;

.field private q:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 55
    const-class v0, Lcom/facebook/orca/chatheads/v;

    sput-object v0, Lcom/facebook/orca/chatheads/v;->a:Ljava/lang/Class;

    .line 57
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/v;->b:Lcom/facebook/n/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 96
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/chatheads/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 100
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const-wide v3, 0x3f50624de0000000L    # 0.0010000000474974513

    .line 103
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 76
    new-instance v0, Lcom/facebook/orca/chatheads/w;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/w;-><init>(Lcom/facebook/orca/chatheads/v;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/v;->k:Ljava/lang/Runnable;

    .line 105
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v2

    .line 106
    const-class v0, Lcom/facebook/n/j;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    .line 107
    const-class v1, Lcom/facebook/orca/common/ui/a/b;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/ui/a/b;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->c:Lcom/facebook/orca/common/ui/a/b;

    .line 108
    const-class v1, Landroid/os/Handler;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->d:Landroid/os/Handler;

    .line 110
    sget v1, Lcom/facebook/k;->orca_chat_head_text_bubble:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/v;->setContentView(I)V

    .line 111
    sget v1, Lcom/facebook/i;->left_origin_mask:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/v;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/MaskedFrameLayout;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->g:Lcom/facebook/widget/MaskedFrameLayout;

    .line 112
    sget v1, Lcom/facebook/i;->left_origin_text_view:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/v;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->h:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    .line 113
    sget v1, Lcom/facebook/i;->right_origin_mask:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/v;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/MaskedFrameLayout;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->i:Lcom/facebook/widget/MaskedFrameLayout;

    .line 114
    sget v1, Lcom/facebook/i;->right_origin_text_view:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/v;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->j:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    .line 115
    sget-object v1, Lcom/facebook/orca/chatheads/ac;->LEFT:Lcom/facebook/orca/chatheads/ac;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/v;->setOrigin(Lcom/facebook/orca/chatheads/ac;)V

    .line 116
    sget-boolean v1, Lcom/a/c/a/a;->a:Z

    if-eqz v1, :cond_0

    .line 117
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->g:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v1, v6}, Lcom/facebook/widget/MaskedFrameLayout;->setDrawingCacheEnabled(Z)V

    .line 118
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->i:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v1, v6}, Lcom/facebook/widget/MaskedFrameLayout;->setDrawingCacheEnabled(Z)V

    .line 122
    :cond_0
    new-instance v1, Lcom/facebook/orca/chatheads/x;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/x;-><init>(Lcom/facebook/orca/chatheads/v;)V

    invoke-super {p0, v1}, Lcom/facebook/widget/d;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    new-instance v1, Landroid/view/GestureDetector;

    new-instance v2, Lcom/facebook/orca/chatheads/aa;

    invoke-direct {v2, p0, v5}, Lcom/facebook/orca/chatheads/aa;-><init>(Lcom/facebook/orca/chatheads/v;Lcom/facebook/orca/chatheads/w;)V

    invoke-direct {v1, p1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->m:Landroid/view/GestureDetector;

    .line 131
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/chatheads/v;->b:Lcom/facebook/n/g;

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/chatheads/ad;

    invoke-direct {v2, p0, v5}, Lcom/facebook/orca/chatheads/ad;-><init>(Lcom/facebook/orca/chatheads/v;Lcom/facebook/orca/chatheads/w;)V

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->e:Lcom/facebook/n/c;

    .line 136
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/chatheads/v;->b:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/z;

    invoke-direct {v1, p0, v5}, Lcom/facebook/orca/chatheads/z;-><init>(Lcom/facebook/orca/chatheads/v;Lcom/facebook/orca/chatheads/w;)V

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/v;->f:Lcom/facebook/n/c;

    .line 141
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/v;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/orca/chatheads/v;->o:Lcom/google/common/d/a/ab;

    return-object p1
.end method

.method private a(D)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 265
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->e:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->d()D

    move-result-wide v1

    cmpl-double v1, v1, p1

    if-nez v1, :cond_1

    .line 266
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    .line 279
    :goto_0
    return-object v0

    .line 269
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0

    .line 272
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    if-eqz v1, :cond_2

    .line 273
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    invoke-virtual {v1, v0}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 276
    :cond_2
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    .line 277
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->e:Lcom/facebook/n/c;

    const-wide/16 v2, 0x0

    cmpl-double v2, p1, v2

    if-eqz v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    invoke-virtual {v1, v0}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 278
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->e:Lcom/facebook/n/c;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 279
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/v;D)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/v;->b(D)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 231
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/v;->b(D)Lcom/google/common/d/a/s;

    .line 232
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->q:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->q:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 235
    :cond_0
    return-void
.end method

.method private a(Landroid/view/View;FF)V
    .locals 2

    .prologue
    .line 305
    const v0, -0x4247ae14    # -0.09f

    mul-float/2addr v0, p3

    add-float/2addr v0, p2

    .line 306
    invoke-static {p1, v0}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 307
    invoke-static {p1, v0}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    .line 308
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p1, v0}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 309
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/v;->f()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/v;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/v;->a(Landroid/view/View;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/v;)Lcom/facebook/orca/chatheads/ab;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->p:Lcom/facebook/orca/chatheads/ab;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/v;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    return-object p1
.end method

.method private b(D)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 283
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    cmpl-double v0, p1, v0

    if-nez v0, :cond_1

    .line 284
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->o:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->o:Lcom/google/common/d/a/ab;

    .line 293
    :goto_0
    return-object v0

    .line 287
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0

    .line 290
    :cond_1
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/v;->o:Lcom/google/common/d/a/ab;

    .line 291
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->f:Lcom/facebook/n/c;

    const-wide/16 v2, 0x0

    cmpl-double v0, p1, v2

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v1, v0}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 292
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->f:Lcom/facebook/n/c;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 293
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->o:Lcom/google/common/d/a/ab;

    goto :goto_0

    .line 291
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic c()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/facebook/orca/chatheads/v;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/v;->e()V

    return-void
.end method

.method private d()V
    .locals 4

    .prologue
    .line 238
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/v;->e()V

    .line 239
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->k:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 240
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/v;->g()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/chatheads/v;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->o:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 244
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/chatheads/v;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->n:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 247
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/v;->b()Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/y;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/y;-><init>(Lcom/facebook/orca/chatheads/v;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 262
    return-void
.end method

.method private g()V
    .locals 3

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->e:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    double-to-float v0, v0

    .line 298
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->f:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    .line 300
    iget-object v2, p0, Lcom/facebook/orca/chatheads/v;->g:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/orca/chatheads/v;->a(Landroid/view/View;FF)V

    .line 301
    iget-object v2, p0, Lcom/facebook/orca/chatheads/v;->i:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/orca/chatheads/v;->a(Landroid/view/View;FF)V

    .line 302
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/d/a/s;
    .locals 2
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
    .line 193
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/v;->d()V

    .line 194
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/v;->a(D)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/common/d/a/s;
    .locals 2
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
    .line 202
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/v;->e()V

    .line 203
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/v;->a(D)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public getOrigin()Lcom/facebook/orca/chatheads/ac;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->l:Lcom/facebook/orca/chatheads/ac;

    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .prologue
    .line 208
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/widget/d;->onSizeChanged(IIII)V

    .line 210
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->g:Lcom/facebook/widget/MaskedFrameLayout;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/a/c/a;->b(Landroid/view/View;F)V

    .line 211
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->g:Lcom/facebook/widget/MaskedFrameLayout;

    div-int/lit8 v1, p2, 0x2

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->c(Landroid/view/View;F)V

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->i:Lcom/facebook/widget/MaskedFrameLayout;

    int-to-float v1, p1

    invoke-static {v0, v1}, Lcom/a/c/a;->b(Landroid/view/View;F)V

    .line 213
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->i:Lcom/facebook/widget/MaskedFrameLayout;

    div-int/lit8 v1, p2, 0x2

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->c(Landroid/view/View;F)V

    .line 214
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 218
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 220
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/v;->d()V

    .line 223
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->m:Landroid/view/GestureDetector;

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-super {p0, p1}, Lcom/facebook/widget/d;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    :goto_0
    return v0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setMessage(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->c:Lcom/facebook/orca/common/ui/a/b;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/messages/model/threads/Message;)Landroid/text/Spanned;

    move-result-object v0

    .line 183
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->h:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    iget-object v1, p0, Lcom/facebook/orca/chatheads/v;->j:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lcom/facebook/orca/chatheads/v;->q:Landroid/view/View$OnClickListener;

    .line 173
    return-void
.end method

.method public setOnTextBubbleAutoHideListener(Lcom/facebook/orca/chatheads/ab;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/facebook/orca/chatheads/v;->p:Lcom/facebook/orca/chatheads/ab;

    .line 165
    return-void
.end method

.method public setOrigin(Lcom/facebook/orca/chatheads/ac;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 151
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->l:Lcom/facebook/orca/chatheads/ac;

    if-eq v0, p1, :cond_0

    .line 152
    iput-object p1, p0, Lcom/facebook/orca/chatheads/v;->l:Lcom/facebook/orca/chatheads/ac;

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->l:Lcom/facebook/orca/chatheads/ac;

    sget-object v1, Lcom/facebook/orca/chatheads/ac;->LEFT:Lcom/facebook/orca/chatheads/ac;

    if-ne v0, v1, :cond_1

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->g:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/MaskedFrameLayout;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->i:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v0, v3}, Lcom/facebook/widget/MaskedFrameLayout;->setVisibility(I)V

    .line 161
    :cond_0
    :goto_0
    return-void

    .line 157
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->g:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v0, v3}, Lcom/facebook/widget/MaskedFrameLayout;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/chatheads/v;->i:Lcom/facebook/widget/MaskedFrameLayout;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/MaskedFrameLayout;->setVisibility(I)V

    goto :goto_0
.end method
