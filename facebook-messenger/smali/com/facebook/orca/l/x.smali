.class final Lcom/facebook/orca/l/x;
.super Ljava/lang/Object;
.source "MergingUtil.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/common/a/jr",
        "<TT;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Comparator;


# direct methods
.method constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/orca/l/x;->a:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/jr;Lcom/google/common/a/jr;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jr",
            "<TT;>;",
            "Lcom/google/common/a/jr",
            "<TT;>;)I"
        }
    .end annotation

    .prologue
    .line 131
    invoke-interface {p1}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    const/4 v0, 0x0

    .line 138
    :goto_0
    return v0

    .line 133
    :cond_0
    invoke-interface {p1}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 134
    const/4 v0, 0x1

    goto :goto_0

    .line 135
    :cond_1
    invoke-interface {p2}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 136
    const/4 v0, -0x1

    goto :goto_0

    .line 138
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/l/x;->a:Ljava/util/Comparator;

    invoke-interface {p1}, Lcom/google/common/a/jr;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2}, Lcom/google/common/a/jr;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 128
    check-cast p1, Lcom/google/common/a/jr;

    check-cast p2, Lcom/google/common/a/jr;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/l/x;->a(Lcom/google/common/a/jr;Lcom/google/common/a/jr;)I

    move-result v0

    return v0
.end method
