.class final Lcom/google/a/b/a/ai;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/net/URL;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 431
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 431
    .line 1434
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v1

    sget-object v2, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v1, v2, :cond_1

    .line 1435
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1439
    :cond_0
    :goto_0
    return-object v0

    .line 1438
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v1

    .line 1439
    const-string v2, "null"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 431
    check-cast p2, Ljava/net/URL;

    .line 1443
    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->b(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 431
    return-void

    .line 1443
    :cond_0
    invoke-virtual {p2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
