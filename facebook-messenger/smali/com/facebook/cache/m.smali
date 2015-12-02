.class public Lcom/facebook/cache/m;
.super Ljava/lang/Object;
.source "CompareMemoryCachesByPriorityAndLastUsed.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/cache/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/cache/a;Lcom/facebook/cache/a;)I
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 16
    invoke-interface {p1}, Lcom/facebook/cache/a;->a()Lcom/facebook/cache/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/cache/i;->getPriorityValue()I

    move-result v2

    .line 17
    invoke-interface {p2}, Lcom/facebook/cache/a;->a()Lcom/facebook/cache/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/cache/i;->getPriorityValue()I

    move-result v3

    .line 18
    if-le v2, v3, :cond_1

    .line 33
    :cond_0
    :goto_0
    return v0

    .line 21
    :cond_1
    if-ge v2, v3, :cond_2

    move v0, v1

    .line 23
    goto :goto_0

    .line 25
    :cond_2
    invoke-interface {p1}, Lcom/facebook/cache/a;->f()J

    move-result-wide v2

    invoke-interface {p2}, Lcom/facebook/cache/a;->f()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    .line 28
    invoke-interface {p1}, Lcom/facebook/cache/a;->f()J

    move-result-wide v2

    invoke-interface {p2}, Lcom/facebook/cache/a;->f()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_3

    move v0, v1

    .line 30
    goto :goto_0

    .line 33
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 12
    check-cast p1, Lcom/facebook/cache/a;

    check-cast p2, Lcom/facebook/cache/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/cache/m;->a(Lcom/facebook/cache/a;Lcom/facebook/cache/a;)I

    move-result v0

    return v0
.end method
