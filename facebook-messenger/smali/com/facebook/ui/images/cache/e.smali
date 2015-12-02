.class public Lcom/facebook/ui/images/cache/e;
.super Ljava/lang/Object;
.source "ImageCacheKey.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final a:Lcom/facebook/ui/images/cache/f;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Lcom/facebook/ui/images/cache/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    sget-object v0, Lcom/facebook/ui/images/cache/f;->MemoryUsagePowerOfTwo:Lcom/facebook/ui/images/cache/f;

    sput-object v0, Lcom/facebook/ui/images/cache/e;->a:Lcom/facebook/ui/images/cache/f;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/ui/images/cache/g;)V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-virtual {p1}, Lcom/facebook/ui/images/cache/g;->c()Lcom/facebook/ui/images/cache/f;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    invoke-virtual {p1}, Lcom/facebook/ui/images/cache/g;->a()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/cache/e;->b:I

    .line 70
    invoke-virtual {p1}, Lcom/facebook/ui/images/cache/g;->b()I

    move-result v0

    iput v0, p0, Lcom/facebook/ui/images/cache/e;->c:I

    .line 71
    invoke-virtual {p1}, Lcom/facebook/ui/images/cache/g;->c()Lcom/facebook/ui/images/cache/f;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/cache/e;->d:Lcom/facebook/ui/images/cache/f;

    .line 72
    return-void
.end method

.method public static newBuilder()Lcom/facebook/ui/images/cache/g;
    .locals 1

    .prologue
    .line 75
    new-instance v0, Lcom/facebook/ui/images/cache/g;

    invoke-direct {v0}, Lcom/facebook/ui/images/cache/g;-><init>()V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 80
    if-ne p0, p1, :cond_1

    .line 89
    :cond_0
    :goto_0
    return v0

    .line 81
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 83
    :cond_3
    check-cast p1, Lcom/facebook/ui/images/cache/e;

    .line 85
    iget v2, p0, Lcom/facebook/ui/images/cache/e;->c:I

    iget v3, p1, Lcom/facebook/ui/images/cache/e;->c:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 86
    :cond_4
    iget v2, p0, Lcom/facebook/ui/images/cache/e;->b:I

    iget v3, p1, Lcom/facebook/ui/images/cache/e;->b:I

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    .line 87
    :cond_5
    iget-object v2, p0, Lcom/facebook/ui/images/cache/e;->d:Lcom/facebook/ui/images/cache/f;

    iget-object v3, p1, Lcom/facebook/ui/images/cache/e;->d:Lcom/facebook/ui/images/cache/f;

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 94
    iget v0, p0, Lcom/facebook/ui/images/cache/e;->b:I

    .line 95
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/facebook/ui/images/cache/e;->c:I

    add-int/2addr v0, v1

    .line 96
    mul-int/lit8 v0, v0, 0x11

    iget-object v1, p0, Lcom/facebook/ui/images/cache/e;->d:Lcom/facebook/ui/images/cache/f;

    invoke-virtual {v1}, Lcom/facebook/ui/images/cache/f;->ordinal()I

    move-result v1

    add-int/2addr v0, v1

    .line 97
    return v0
.end method
