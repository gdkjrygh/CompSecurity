.class public abstract Lcom/kik/cache/ai;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# instance fields
.field private final a:J

.field private b:Z


# direct methods
.method public constructor <init>(J)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 17
    const-wide/16 v0, 0x28

    const-wide/16 v2, 0xa

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x3ff6666666666666L    # 1.4

    mul-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {p0, v0, v1, v4}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 8
    iput-boolean v4, p0, Lcom/kik/cache/ai;->b:Z

    .line 18
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cache/ai;->b:Z

    .line 22
    :cond_0
    iput-wide p1, p0, Lcom/kik/cache/ai;->a:J

    .line 23
    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/lang/Object;)V
.end method

.method public clear()V
    .locals 0

    .prologue
    .line 44
    invoke-super {p0}, Ljava/util/LinkedHashMap;->clear()V

    .line 45
    return-void
.end method

.method protected removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 4

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/kik/cache/ai;->size()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/kik/cache/ai;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/kik/cache/ai;->b:Z

    if-nez v0, :cond_1

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 38
    :goto_0
    return v0

    .line 32
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/h;

    invoke-virtual {v0}, Lcom/kik/cache/h;->a()Ljava/lang/Object;

    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    invoke-virtual {p0, v0}, Lcom/kik/cache/ai;->a(Ljava/lang/Object;)V

    .line 38
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method
