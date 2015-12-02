.class public Lcom/facebook/widget/tiles/d;
.super Ljava/lang/Object;
.source "DefaultTilesCache.java"


# instance fields
.field private final a:Lcom/facebook/widget/tiles/a;

.field private final b:I

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Lcom/facebook/widget/tiles/a;III)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/widget/tiles/d;->a:Lcom/facebook/widget/tiles/a;

    .line 27
    iput p2, p0, Lcom/facebook/widget/tiles/d;->b:I

    .line 28
    iput p3, p0, Lcom/facebook/widget/tiles/d;->c:I

    .line 29
    iput p4, p0, Lcom/facebook/widget/tiles/d;->d:I

    .line 30
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 34
    if-ne p0, p1, :cond_1

    .line 44
    :cond_0
    :goto_0
    return v0

    .line 35
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

    .line 37
    :cond_3
    check-cast p1, Lcom/facebook/widget/tiles/d;

    .line 39
    iget v2, p0, Lcom/facebook/widget/tiles/d;->b:I

    iget v3, p1, Lcom/facebook/widget/tiles/d;->b:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 40
    :cond_4
    iget v2, p0, Lcom/facebook/widget/tiles/d;->c:I

    iget v3, p1, Lcom/facebook/widget/tiles/d;->c:I

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    .line 41
    :cond_5
    iget v2, p0, Lcom/facebook/widget/tiles/d;->d:I

    iget v3, p1, Lcom/facebook/widget/tiles/d;->d:I

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    .line 42
    :cond_6
    iget-object v2, p0, Lcom/facebook/widget/tiles/d;->a:Lcom/facebook/widget/tiles/a;

    iget-object v3, p1, Lcom/facebook/widget/tiles/d;->a:Lcom/facebook/widget/tiles/a;

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/widget/tiles/d;->a:Lcom/facebook/widget/tiles/a;

    invoke-virtual {v0}, Lcom/facebook/widget/tiles/a;->hashCode()I

    move-result v0

    .line 50
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/facebook/widget/tiles/d;->b:I

    add-int/2addr v0, v1

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/facebook/widget/tiles/d;->c:I

    add-int/2addr v0, v1

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/facebook/widget/tiles/d;->d:I

    add-int/2addr v0, v1

    .line 53
    return v0
.end method
