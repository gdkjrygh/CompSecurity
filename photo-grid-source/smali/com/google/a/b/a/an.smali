.class final Lcom/google/a/b/a/an;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/a/an;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/k;Lcom/google/a/c/a;)Lcom/google/a/am;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/k;",
            "Lcom/google/a/c/a",
            "<TT;>;)",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 510
    invoke-virtual {p2}, Lcom/google/a/c/a;->a()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/sql/Timestamp;

    if-eq v0, v1, :cond_0

    .line 511
    const/4 v0, 0x0

    .line 515
    :goto_0
    return-object v0

    .line 514
    :cond_0
    const-class v0, Ljava/util/Date;

    invoke-virtual {p1, v0}, Lcom/google/a/k;->a(Ljava/lang/Class;)Lcom/google/a/am;

    move-result-object v1

    .line 515
    new-instance v0, Lcom/google/a/b/a/ao;

    invoke-direct {v0, p0, v1}, Lcom/google/a/b/a/ao;-><init>(Lcom/google/a/b/a/an;Lcom/google/a/am;)V

    goto :goto_0
.end method
