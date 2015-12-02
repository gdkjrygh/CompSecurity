.class public Lcom/facebook/orca/threads/w;
.super Ljava/lang/Object;
.source "ThreadSummaryByDateComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/orca/threads/ThreadSummary;",
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
.method public a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)I
    .locals 4

    .prologue
    .line 15
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 16
    const/4 v0, -0x1

    .line 20
    :goto_0
    return v0

    .line 17
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 18
    const/4 v0, 0x1

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Strings;->nullToEmpty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/common/base/Strings;->nullToEmpty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 12
    check-cast p1, Lcom/facebook/orca/threads/ThreadSummary;

    check-cast p2, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/threads/w;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)I

    move-result v0

    return v0
.end method
