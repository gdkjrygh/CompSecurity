.class public Lcom/facebook/orca/chatheads/ef;
.super Ljava/lang/Object;
.source "SpringyPositioner.java"


# static fields
.field private static a:Lcom/facebook/n/g;

.field private static b:Lcom/facebook/n/g;

.field private static c:D

.field private static d:D


# instance fields
.field private final e:Lcom/facebook/widget/l;

.field private final f:Lcom/facebook/n/c;

.field private final g:Lcom/facebook/n/c;

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/chatheads/ej;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/facebook/orca/chatheads/ej;

.field private j:Lcom/facebook/orca/chatheads/ef;

.field private k:Lcom/google/common/d/a/ab;
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
    .locals 6

    .prologue
    const-wide v4, 0x3fd3333333333333L    # 0.3

    .line 35
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/ef;->a:Lcom/facebook/n/g;

    .line 37
    const-wide v0, 0x406b800000000000L    # 220.0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/ef;->b:Lcom/facebook/n/g;

    .line 39
    sput-wide v4, Lcom/facebook/orca/chatheads/ef;->c:D

    .line 40
    sput-wide v4, Lcom/facebook/orca/chatheads/ef;->d:D

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/widget/l;)V
    .locals 5

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ef;->h:Ljava/util/Set;

    .line 52
    iput-object p2, p0, Lcom/facebook/orca/chatheads/ef;->e:Lcom/facebook/widget/l;

    .line 54
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 55
    const-class v1, Lcom/facebook/n/j;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/ForChatHeads;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    .line 57
    new-instance v1, Lcom/facebook/orca/chatheads/ei;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/ei;-><init>(Lcom/facebook/orca/chatheads/ef;Lcom/facebook/orca/chatheads/eg;)V

    .line 59
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/chatheads/ef;->a:Lcom/facebook/n/g;

    invoke-virtual {v2, v3}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v2

    sget-wide v3, Lcom/facebook/orca/chatheads/ef;->c:D

    invoke-virtual {v2, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v2

    sget-wide v3, Lcom/facebook/orca/chatheads/ef;->d:D

    invoke-virtual {v2, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    .line 64
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/chatheads/ef;->a:Lcom/facebook/n/g;

    invoke-virtual {v0, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    sget-wide v2, Lcom/facebook/orca/chatheads/ef;->c:D

    invoke-virtual {v0, v2, v3}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v0

    sget-wide v2, Lcom/facebook/orca/chatheads/ef;->d:D

    invoke-virtual {v0, v2, v3}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    .line 69
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ef;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    return-object p1
.end method

.method private a(D)V
    .locals 2

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->e:Lcom/facebook/widget/l;

    double-to-float v1, p1

    invoke-interface {v0, v1}, Lcom/facebook/widget/l;->setX(F)V

    .line 247
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->e()V

    .line 248
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ef;D)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/ef;->a(D)V

    return-void
.end method

.method private a(Lcom/facebook/orca/chatheads/ej;)V
    .locals 4

    .prologue
    .line 230
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 231
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v2}, Lcom/facebook/n/c;->c()D

    move-result-wide v2

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/facebook/orca/chatheads/ej;->a(DD)V

    .line 232
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    return-object v0
.end method

.method private b(D)V
    .locals 2

    .prologue
    .line 251
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->e:Lcom/facebook/widget/l;

    double-to-float v1, p1

    invoke-interface {v0, v1}, Lcom/facebook/widget/l;->setY(F)V

    .line 252
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->e()V

    .line 253
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ef;D)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/ef;->b(D)V

    return-void
.end method

.method private b(Lcom/facebook/orca/chatheads/ej;)V
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 236
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/ef;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private d(Landroid/graphics/PointF;)Lcom/google/common/d/a/ab;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/PointF;",
            ")",
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 97
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->d()V

    .line 98
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ef;->b()V

    .line 100
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    sget-object v1, Lcom/facebook/orca/chatheads/ef;->a:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    iget v1, p1, Landroid/graphics/PointF;->x:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    sget-object v1, Lcom/facebook/orca/chatheads/ef;->a:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    iget v1, p1, Landroid/graphics/PointF;->y:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 241
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    .line 243
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/ef;)Z
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->f()Z

    move-result v0

    return v0
.end method

.method private e()V
    .locals 6

    .prologue
    .line 256
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ej;

    .line 257
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v2}, Lcom/facebook/n/c;->c()D

    move-result-wide v2

    iget-object v4, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v4}, Lcom/facebook/n/c;->c()D

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/facebook/orca/chatheads/ej;->a(DD)V

    goto :goto_0

    .line 259
    :cond_0
    return-void
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->j:Lcom/facebook/orca/chatheads/ef;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/graphics/PointF;)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/PointF;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ef;->d(Landroid/graphics/PointF;)Lcom/google/common/d/a/ab;

    .line 89
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method public a(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/PointF;",
            "FF)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 162
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ef;->d(Landroid/graphics/PointF;)Lcom/google/common/d/a/ab;

    move-result-object v0

    .line 163
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    float-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/facebook/n/c;->c(D)Lcom/facebook/n/c;

    .line 164
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    float-to-double v2, p3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/n/c;->c(D)Lcom/facebook/n/c;

    .line 166
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v1}, Lcom/facebook/n/c;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 167
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 170
    :cond_0
    return-object v0
.end method

.method public a(Lcom/facebook/orca/chatheads/ef;Landroid/graphics/PointF;)Lcom/google/common/d/a/s;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/chatheads/ef;",
            "Landroid/graphics/PointF;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 126
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ef;->b()V

    .line 127
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->d()V

    .line 129
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    sget-object v1, Lcom/facebook/orca/chatheads/ef;->b:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    .line 132
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    sget-object v1, Lcom/facebook/orca/chatheads/ef;->b:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    .line 134
    new-instance v0, Lcom/facebook/orca/chatheads/eh;

    iget v1, p2, Landroid/graphics/PointF;->x:F

    float-to-double v2, v1

    iget v1, p2, Landroid/graphics/PointF;->y:F

    float-to-double v4, v1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/chatheads/eh;-><init>(Lcom/facebook/orca/chatheads/ef;DD)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ef;->i:Lcom/facebook/orca/chatheads/ej;

    .line 135
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ef;->j:Lcom/facebook/orca/chatheads/ef;

    .line 136
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->j:Lcom/facebook/orca/chatheads/ef;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->i:Lcom/facebook/orca/chatheads/ej;

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ej;)V

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->k:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->d()V

    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ef;->b()V

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 78
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 79
    return-void
.end method

.method public b(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/PointF;",
            "FF)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 185
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/orca/chatheads/ef;->a(Landroid/graphics/PointF;FF)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 187
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 188
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    .line 189
    return-object v0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 145
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->j:Lcom/facebook/orca/chatheads/ef;

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->j:Lcom/facebook/orca/chatheads/ef;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ef;->i:Lcom/facebook/orca/chatheads/ej;

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/ef;->b(Lcom/facebook/orca/chatheads/ej;)V

    .line 147
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ef;->j:Lcom/facebook/orca/chatheads/ef;

    .line 149
    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/PointF;)V
    .locals 3

    .prologue
    .line 197
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->d()V

    .line 198
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ef;->b()V

    .line 200
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    .line 206
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 223
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ef;->d()V

    .line 225
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    .line 226
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    .line 227
    return-void
.end method

.method public c(Landroid/graphics/PointF;)V
    .locals 2

    .prologue
    .line 213
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 215
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ef;->g:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 216
    return-void
.end method
