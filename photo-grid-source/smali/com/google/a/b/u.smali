.class public final Lcom/google/a/b/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/a/d/a;)Lcom/google/a/x;
    .locals 2

    .prologue
    .line 40
    const/4 v1, 0x1

    .line 42
    :try_start_0
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 43
    const/4 v1, 0x0

    .line 44
    sget-object v0, Lcom/google/a/b/a/y;->P:Lcom/google/a/am;

    invoke-virtual {v0, p0}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/x;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/a/d/h; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3

    .line 51
    :goto_0
    return-object v0

    .line 45
    :catch_0
    move-exception v0

    .line 50
    if-eqz v1, :cond_0

    .line 51
    sget-object v0, Lcom/google/a/z;->a:Lcom/google/a/z;

    goto :goto_0

    .line 54
    :cond_0
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 55
    :catch_1
    move-exception v0

    .line 56
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 57
    :catch_2
    move-exception v0

    .line 58
    new-instance v1, Lcom/google/a/y;

    invoke-direct {v1, v0}, Lcom/google/a/y;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 59
    :catch_3
    move-exception v0

    .line 60
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Lcom/google/a/x;Lcom/google/a/d/f;)V
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lcom/google/a/b/a/y;->P:Lcom/google/a/am;

    invoke-virtual {v0, p1, p0}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    .line 69
    return-void
.end method
