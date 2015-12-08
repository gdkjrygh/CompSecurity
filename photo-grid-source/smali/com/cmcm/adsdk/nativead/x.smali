.class public final Lcom/cmcm/adsdk/nativead/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;
    .locals 3

    .prologue
    .line 13
    :try_start_0
    const-string v0, "fb"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    const-string v0, "CMCMADSDK"

    const-string v1, "create FBNativeAdLoader"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    new-instance v0, Lcom/cmcm/adsdk/nativead/s;

    invoke-direct {v0, p1, p2, p3}, Lcom/cmcm/adsdk/nativead/s;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :goto_0
    return-object v0

    .line 16
    :cond_0
    const-string v0, "cm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    const-string v0, "CMCMADSDK"

    const-string v1, "create PicksNativeAdLoader"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lcom/cmcm/adsdk/nativead/y;

    invoke-direct {v0, p1, p2}, Lcom/cmcm/adsdk/nativead/y;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 32
    :catch_0
    move-exception v0

    .line 33
    const-string v1, "CMCMADSDK"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/cmcm/adsdk/b/c/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 19
    :cond_1
    :try_start_1
    const-string v0, "mp"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 20
    const-string v0, "CMCMADSDK"

    const-string v1, "create MopubNativeAdLoader"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    const-string v0, "com.cmcm.adsdk.nativead.MopubNativeAdLoader"

    .line 22
    invoke-static {v0, p1, p2, p3}, Lcom/cmcm/adsdk/nativead/x;->b(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;

    move-result-object v0

    goto :goto_0

    .line 24
    :cond_2
    const-string v0, "ab"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 25
    const-string v0, "CMCMADSDK"

    const-string v1, "create AdmobNativeLoader"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    const-string v0, "com.cmcm.adsdk.nativead.AdmobNativeLoader"

    .line 27
    invoke-static {v0, p1, p2, p3}, Lcom/cmcm/adsdk/nativead/x;->b(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;

    move-result-object v0

    goto :goto_0

    .line 30
    :cond_3
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unmatched adtype:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method private static b(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;
    .locals 5

    .prologue
    .line 39
    const/4 v1, 0x0

    .line 41
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 42
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Landroid/content/Context;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v3

    .line 43
    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    const/4 v4, 0x2

    aput-object p3, v3, v4

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/w;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :goto_0
    return-object v0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    const-string v2, "CMCMADSDK"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/c/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0
.end method
