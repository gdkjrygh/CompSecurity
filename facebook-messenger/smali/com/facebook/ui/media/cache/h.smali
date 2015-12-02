.class Lcom/facebook/ui/media/cache/h;
.super Ljava/lang/Object;
.source "MediaCache.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/ui/media/cache/g",
        "<TKEY;TVA",
        "LUE;",
        ">.com/facebook/ui/media/cache/i<TKEY;TVA",
        "LUE;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/cache/g;

.field private b:J


# direct methods
.method public constructor <init>(Lcom/facebook/ui/media/cache/g;)V
    .locals 4

    .prologue
    .line 599
    iput-object p1, p0, Lcom/facebook/ui/media/cache/h;->a:Lcom/facebook/ui/media/cache/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 600
    invoke-static {p1}, Lcom/facebook/ui/media/cache/g;->a(Lcom/facebook/ui/media/cache/g;)Lcom/facebook/common/time/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    const-wide/32 v2, 0x1d4c0

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/h;->b:J

    .line 601
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ui/media/cache/i;Lcom/facebook/ui/media/cache/i;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/ui/media/cache/g",
            "<TKEY;TVA",
            "LUE;",
            ">.com/facebook/ui/media/cache/i<TKEY;TVA",
            "LUE;",
            ">;",
            "Lcom/facebook/ui/media/cache/g",
            "<TKEY;TVA",
            "LUE;",
            ">.com/facebook/ui/media/cache/i<TKEY;TVA",
            "LUE;",
            ">;)I"
        }
    .end annotation

    .prologue
    const-wide/32 v6, 0x1d4c0

    const/4 v1, 0x1

    const/4 v0, -0x1

    .line 605
    invoke-static {p1}, Lcom/facebook/ui/media/cache/i;->e(Lcom/facebook/ui/media/cache/i;)J

    move-result-wide v2

    div-long/2addr v2, v6

    .line 606
    invoke-static {p2}, Lcom/facebook/ui/media/cache/i;->e(Lcom/facebook/ui/media/cache/i;)J

    move-result-wide v4

    div-long/2addr v4, v6

    .line 608
    invoke-static {p1}, Lcom/facebook/ui/media/cache/i;->e(Lcom/facebook/ui/media/cache/i;)J

    move-result-wide v6

    .line 609
    invoke-static {p2}, Lcom/facebook/ui/media/cache/i;->e(Lcom/facebook/ui/media/cache/i;)J

    move-result-wide v8

    .line 611
    cmp-long v10, v2, v4

    if-gez v10, :cond_1

    .line 628
    :cond_0
    :goto_0
    return v0

    .line 613
    :cond_1
    cmp-long v4, v2, v4

    if-lez v4, :cond_2

    move v0, v1

    .line 614
    goto :goto_0

    .line 617
    :cond_2
    iget-wide v4, p0, Lcom/facebook/ui/media/cache/h;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    .line 619
    cmp-long v2, v6, v8

    if-ltz v2, :cond_0

    .line 621
    cmp-long v0, v6, v8

    if-lez v0, :cond_3

    move v0, v1

    .line 622
    goto :goto_0

    .line 624
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 628
    :cond_4
    invoke-static {p2}, Lcom/facebook/ui/media/cache/i;->b(Lcom/facebook/ui/media/cache/i;)I

    move-result v0

    invoke-static {p1}, Lcom/facebook/ui/media/cache/i;->b(Lcom/facebook/ui/media/cache/i;)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 594
    check-cast p1, Lcom/facebook/ui/media/cache/i;

    check-cast p2, Lcom/facebook/ui/media/cache/i;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/ui/media/cache/h;->a(Lcom/facebook/ui/media/cache/i;Lcom/facebook/ui/media/cache/i;)I

    move-result v0

    return v0
.end method
