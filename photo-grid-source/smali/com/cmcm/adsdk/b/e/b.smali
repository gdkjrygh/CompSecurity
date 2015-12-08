.class public final Lcom/cmcm/adsdk/b/e/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;


# direct methods
.method public static declared-synchronized a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 23
    const-class v1, Lcom/cmcm/adsdk/b/e/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/cmcm/adsdk/b/e/b;->a:Landroid/content/Context;

    const-string v2, "cm_ad_cache"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 24
    const-string v2, "config_cache"

    invoke-interface {v0, v2, p0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 28
    :goto_0
    monitor-exit v1

    return-object v0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "get cache json error..."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    const-string v0, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    sput-object p0, Lcom/cmcm/adsdk/b/e/b;->a:Landroid/content/Context;

    .line 19
    return-void
.end method

.method public static declared-synchronized b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 35
    const-class v1, Lcom/cmcm/adsdk/b/e/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/cmcm/adsdk/b/e/b;->a:Landroid/content/Context;

    const-string v2, "cm_ad_cache"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 36
    const-string v2, "config_cache"

    invoke-interface {v0, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 37
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v2, v3, :cond_0

    .line 38
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :goto_0
    monitor-exit v1

    return-void

    .line 40
    :cond_0
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "save cache json error..."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
