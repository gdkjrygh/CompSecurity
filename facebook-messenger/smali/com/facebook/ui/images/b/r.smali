.class public Lcom/facebook/ui/images/b/r;
.super Ljava/lang/Object;
.source "FetchedImage.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Lcom/facebook/ui/images/cache/d;

.field private final b:Ljava/io/File;

.field private final c:Landroid/graphics/Bitmap;

.field private final d:Lcom/facebook/ui/images/b/v;

.field private final e:Lcom/facebook/ui/images/b/u;

.field private final f:J


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/b/t;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->b(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/b/v;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->b(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/b/v;

    move-result-object v0

    sget-object v3, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    if-ne v0, v3, :cond_2

    move v0, v1

    :goto_0
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->c(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/b/u;

    move-result-object v3

    if-nez v3, :cond_3

    move v3, v1

    :goto_1
    xor-int/2addr v0, v3

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 86
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->d(Lcom/facebook/ui/images/b/t;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->e(Lcom/facebook/ui/images/b/t;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 88
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/r;->a:Lcom/facebook/ui/images/cache/d;

    .line 89
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->e(Lcom/facebook/ui/images/b/t;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/r;->b:Ljava/io/File;

    .line 90
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->d(Lcom/facebook/ui/images/b/t;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/r;->c:Landroid/graphics/Bitmap;

    .line 91
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->b(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/b/v;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/r;->d:Lcom/facebook/ui/images/b/v;

    .line 92
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->c(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/b/u;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/r;->e:Lcom/facebook/ui/images/b/u;

    .line 93
    invoke-static {p1}, Lcom/facebook/ui/images/b/t;->f(Lcom/facebook/ui/images/b/t;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/images/b/r;->f:J

    .line 94
    return-void

    :cond_2
    move v0, v2

    .line 84
    goto :goto_0

    :cond_3
    move v3, v2

    goto :goto_1
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/b/t;Lcom/facebook/ui/images/b/s;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/r;-><init>(Lcom/facebook/ui/images/b/t;)V

    return-void
.end method

.method public static a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;
    .locals 2

    .prologue
    .line 165
    new-instance v0, Lcom/facebook/ui/images/b/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ui/images/b/t;-><init>(Lcom/facebook/ui/images/cache/d;Lcom/facebook/ui/images/b/s;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/ui/images/b/r;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public b()Lcom/facebook/ui/images/b/v;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/ui/images/b/r;->d:Lcom/facebook/ui/images/b/v;

    return-object v0
.end method

.method public c()Lcom/facebook/ui/images/b/u;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/facebook/ui/images/b/r;->e:Lcom/facebook/ui/images/b/u;

    return-object v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 155
    iget-wide v0, p0, Lcom/facebook/ui/images/b/r;->f:J

    return-wide v0
.end method
