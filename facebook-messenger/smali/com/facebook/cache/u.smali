.class public Lcom/facebook/cache/u;
.super Landroid/support/v4/c/c;
.source "TrackedLruCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v4/c/c",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/analytics/cache/e;

.field private final b:Lcom/facebook/common/e/h;


# virtual methods
.method protected a(I)V
    .locals 3

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cache/e;->a(J)V

    .line 110
    return-void
.end method

.method protected b(I)V
    .locals 3

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cache/e;->b(J)V

    .line 115
    return-void
.end method

.method protected c(I)V
    .locals 4

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    sget-object v1, Lcom/facebook/analytics/cache/g;->CACHE_FULL:Lcom/facebook/analytics/cache/g;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/g;IJ)V

    .line 121
    return-void
.end method

.method protected d(I)V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cache/e;->c(J)V

    .line 128
    iget-object v0, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    invoke-virtual {p0}, Lcom/facebook/cache/u;->b()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cache/e;->d(J)V

    .line 129
    invoke-virtual {p0}, Lcom/facebook/cache/u;->b()I

    move-result v0

    if-lez v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/facebook/cache/u;->b:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    sget-object v2, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lcom/facebook/cache/u;->b:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    sget-object v2, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/cache/u;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    :goto_0
    return-void

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/facebook/cache/u;->b:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    sget-object v2, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/facebook/cache/u;->b:Lcom/facebook/common/e/h;

    iget-object v1, p0, Lcom/facebook/cache/u;->a:Lcom/facebook/analytics/cache/e;

    sget-object v2, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
