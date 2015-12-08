.class final Lcom/google/a/b/a/aj;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/net/URI;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 449
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method

.method private static b(Lcom/google/a/d/a;)Ljava/net/URI;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 452
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v1

    sget-object v2, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v1, v2, :cond_1

    .line 453
    invoke-virtual {p0}, Lcom/google/a/d/a;->j()V

    .line 458
    :cond_0
    :goto_0
    return-object v0

    .line 457
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v1

    .line 458
    const-string v2, "null"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 459
    :catch_0
    move-exception v0

    .line 460
    new-instance v1, Lcom/google/a/y;

    invoke-direct {v1, v0}, Lcom/google/a/y;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 449
    invoke-static {p1}, Lcom/google/a/b/a/aj;->b(Lcom/google/a/d/a;)Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 449
    check-cast p2, Ljava/net/URI;

    .line 1465
    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->b(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 449
    return-void

    .line 1465
    :cond_0
    invoke-virtual {p2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
