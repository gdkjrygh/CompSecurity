.class public final Lkik/a/h/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([BLjava/lang/Class;)Lcom/b/a/n;
    .locals 2

    .prologue
    .line 16
    const/4 v1, 0x0

    .line 18
    if-eqz p0, :cond_0

    .line 21
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/n;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :try_start_1
    invoke-interface {v0}, Lcom/b/a/n;->a()Lcom/b/a/u;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/b/a/q;->a([BLjava/lang/Object;Lcom/b/a/u;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 28
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public static a(Lcom/b/a/n;)[B
    .locals 3

    .prologue
    .line 33
    const/4 v0, 0x0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    invoke-static {}, Lcom/b/a/m;->a()Lcom/b/a/m;

    move-result-object v1

    .line 39
    :try_start_0
    invoke-interface {p0}, Lcom/b/a/n;->a()Lcom/b/a/u;

    move-result-object v2

    invoke-static {p0, v2, v1}, Lcom/b/a/q;->a(Ljava/lang/Object;Lcom/b/a/u;Lcom/b/a/m;)[B
    :try_end_0
    .catch Lcom/b/a/x; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 44
    invoke-virtual {v1}, Lcom/b/a/m;->b()Lcom/b/a/m;

    .line 47
    :cond_0
    :goto_0
    return-object v0

    .line 44
    :catch_0
    move-exception v2

    invoke-virtual {v1}, Lcom/b/a/m;->b()Lcom/b/a/m;

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/b/a/m;->b()Lcom/b/a/m;

    throw v0
.end method
