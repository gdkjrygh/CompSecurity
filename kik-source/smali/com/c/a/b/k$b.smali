.class public abstract Lcom/c/a/b/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 235
    return-void
.end method

.method static a(II)I
    .locals 2

    .prologue
    .line 219
    if-gez p1, :cond_0

    .line 220
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "cannot store more than MAX_VALUE elements"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 223
    :cond_0
    shr-int/lit8 v0, p0, 0x1

    add-int/2addr v0, p0

    add-int/lit8 v0, v0, 0x1

    .line 224
    if-ge v0, p1, :cond_1

    .line 225
    add-int/lit8 v0, p1, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    .line 227
    :cond_1
    if-gez v0, :cond_2

    .line 228
    const v0, 0x7fffffff

    .line 231
    :cond_2
    return v0
.end method


# virtual methods
.method public a(Ljava/util/Iterator;)Lcom/c/a/b/k$b;
    .locals 1

    .prologue
    .line 300
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 301
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/c/a/b/k$b;->b(Ljava/lang/Object;)Lcom/c/a/b/k$b;

    goto :goto_0

    .line 303
    :cond_0
    return-object p0
.end method

.method public abstract b(Ljava/lang/Object;)Lcom/c/a/b/k$b;
.end method
