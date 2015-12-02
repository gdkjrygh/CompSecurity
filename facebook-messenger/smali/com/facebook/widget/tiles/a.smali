.class public Lcom/facebook/widget/tiles/a;
.super Ljava/lang/Object;
.source "DefaultTileType.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/widget/tiles/a;->a:Ljava/lang/String;

    .line 23
    iput p2, p0, Lcom/facebook/widget/tiles/a;->b:I

    .line 24
    iput p3, p0, Lcom/facebook/widget/tiles/a;->c:I

    .line 25
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/facebook/widget/tiles/a;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/facebook/widget/tiles/a;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 41
    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    .line 46
    :goto_0
    return v0

    .line 42
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 44
    :cond_2
    check-cast p1, Lcom/facebook/widget/tiles/a;

    .line 46
    iget-object v0, p0, Lcom/facebook/widget/tiles/a;->a:Ljava/lang/String;

    iget-object v1, p1, Lcom/facebook/widget/tiles/a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/widget/tiles/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
