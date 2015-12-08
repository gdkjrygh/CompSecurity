.class final Lcom/google/android/gms/tagmanager/bg;
.super Ljava/lang/Object;


# direct methods
.method private static a(Lcom/google/android/gms/tagmanager/ai;)Lcom/google/android/gms/tagmanager/ai;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/ai",
            "<",
            "Lcom/google/android/gms/internal/g;",
            ">;)",
            "Lcom/google/android/gms/tagmanager/ai",
            "<",
            "Lcom/google/android/gms/internal/g;",
            ">;"
        }
    .end annotation

    .prologue
    .line 0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/ai;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/g;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/be;->a(Lcom/google/android/gms/internal/g;)Ljava/lang/String;

    move-result-object v0

    .line 3000
    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\+"

    const-string v2, "%20"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 0
    new-instance v0, Lcom/google/android/gms/tagmanager/ai;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/be;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/g;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/ai;->b()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/ai;-><init>(Ljava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    :goto_0
    return-object p0

    :catch_0
    move-exception v0

    const-string v1, "Escape URI: unsupported encoding"

    invoke-static {v1, v0}, Lcom/google/android/gms/tagmanager/y;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static varargs a(Lcom/google/android/gms/tagmanager/ai;[I)Lcom/google/android/gms/tagmanager/ai;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/ai",
            "<",
            "Lcom/google/android/gms/internal/g;",
            ">;[I)",
            "Lcom/google/android/gms/tagmanager/ai",
            "<",
            "Lcom/google/android/gms/internal/g;",
            ">;"
        }
    .end annotation

    .prologue
    .line 0
    array-length v3, p1

    const/4 v0, 0x0

    move v2, v0

    move-object v1, p0

    :goto_0
    if-ge v2, v3, :cond_1

    aget v4, p1, v2

    .line 1000
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ai;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/g;

    .line 2000
    invoke-static {v0}, Lcom/google/android/gms/tagmanager/be;->c(Lcom/google/android/gms/internal/g;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    .line 1000
    if-nez v0, :cond_0

    const-string v0, "Escaping can only be applied to strings."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/y;->a(Ljava/lang/String;)V

    move-object v0, v1

    .line 0
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_0

    .line 1000
    :cond_0
    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Unsupported Value Escaping: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/y;->a(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_1

    :pswitch_0
    invoke-static {v1}, Lcom/google/android/gms/tagmanager/bg;->a(Lcom/google/android/gms/tagmanager/ai;)Lcom/google/android/gms/tagmanager/ai;

    move-result-object v0

    goto :goto_1

    .line 0
    :cond_1
    return-object v1

    .line 1000
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method
