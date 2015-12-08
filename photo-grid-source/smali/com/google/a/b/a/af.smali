.class final Lcom/google/a/b/a/af;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/math/BigInteger;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 375
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method

.method private static b(Lcom/google/a/d/a;)Ljava/math/BigInteger;
    .locals 2

    .prologue
    .line 377
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 378
    invoke-virtual {p0}, Lcom/google/a/d/a;->j()V

    .line 379
    const/4 v0, 0x0

    .line 382
    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    new-instance v0, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 383
    :catch_0
    move-exception v0

    .line 384
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 375
    invoke-static {p1}, Lcom/google/a/b/a/af;->b(Lcom/google/a/d/a;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 375
    check-cast p2, Ljava/math/BigInteger;

    .line 1389
    invoke-virtual {p1, p2}, Lcom/google/a/d/f;->a(Ljava/lang/Number;)Lcom/google/a/d/f;

    .line 375
    return-void
.end method
