.class final Lcom/google/a/b/a/ad;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 337
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 337
    .line 1340
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    .line 1341
    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 1342
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1343
    const/4 v0, 0x0

    .line 1347
    :goto_0
    return-object v0

    .line 1346
    :cond_0
    sget-object v1, Lcom/google/a/d/e;->h:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_1

    .line 1347
    invoke-virtual {p1}, Lcom/google/a/d/a;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1349
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 337
    check-cast p2, Ljava/lang/String;

    .line 1353
    invoke-virtual {p1, p2}, Lcom/google/a/d/f;->b(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 337
    return-void
.end method
