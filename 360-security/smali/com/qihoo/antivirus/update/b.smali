.class public Lcom/qihoo/antivirus/update/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;ILjava/lang/String;Ljava/util/HashMap;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 26
    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 27
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 28
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 32
    const/4 v0, -0x3

    .line 114
    :goto_0
    return v0

    .line 35
    :cond_0
    if-nez p2, :cond_1

    .line 39
    const/4 v0, -0x3

    goto :goto_0

    .line 42
    :cond_1
    if-nez p3, :cond_2

    .line 46
    const/4 v0, -0x3

    goto :goto_0

    .line 49
    :cond_2
    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    .line 50
    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 54
    const/4 v0, -0x1

    goto :goto_0

    .line 58
    :cond_3
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/qihoo/antivirus/update/UpdateService;

    invoke-direct {v7, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 59
    const-string/jumbo v0, "com.qihoo.action.BEGIN_UPDATE"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_UPDATE_TYPE"

    invoke-virtual {v7, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 61
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_LOCAL_VERSION"

    invoke-virtual {v7, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 64
    invoke-virtual {p3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v2, 0x0

    .line 68
    const/4 v1, 0x0

    .line 69
    const/4 v0, 0x0

    .line 70
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v5, v3

    move v6, v4

    move-object v4, v2

    move-object v3, v1

    move-object v2, v0

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 92
    if-nez v6, :cond_8

    .line 96
    const/4 v0, -0x3

    goto :goto_0

    .line 70
    :cond_4
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 71
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 72
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 73
    const-string/jumbo v10, "server"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    move-object v3, v0

    .line 75
    goto :goto_1

    .line 77
    :cond_5
    const-string/jumbo v10, "permission"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 79
    const/4 v1, 0x1

    move-object v2, v0

    move v5, v1

    .line 80
    goto :goto_1

    .line 82
    :cond_6
    const-string/jumbo v10, "product"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 83
    const/4 v6, 0x1

    move-object v4, v0

    .line 87
    :cond_7
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    const-string/jumbo v1, "="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 99
    :cond_8
    if-nez v5, :cond_9

    .line 103
    const/4 v0, -0x3

    goto/16 :goto_0

    .line 106
    :cond_9
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_REQ_PARAM"

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_PRODUCT"

    invoke-virtual {v7, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_PERMISSION"

    invoke-virtual {v7, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    if-eqz v3, :cond_a

    .line 111
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_SERVER"

    invoke-virtual {v7, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    :cond_a
    invoke-virtual {p0, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 114
    const/4 v0, 0x0

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;I)I
    .locals 2

    .prologue
    const/4 v0, -0x3

    .line 118
    if-nez p1, :cond_1

    .line 137
    :cond_0
    :goto_0
    return v0

    .line 125
    :cond_1
    if-eqz p2, :cond_2

    .line 126
    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    .line 133
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.broadcast.UPDATE_STOP"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 134
    const-string/jumbo v1, "com.qihoo.action.INTENT_EXTRA_PRODUCT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 135
    const-string/jumbo v1, "com.qihoo.action.INTENT_EXTRA_UPDATE_STOP_TYPE"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 136
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 137
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 3

    .prologue
    .line 18
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/antivirus/update/UpdateService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 19
    const-string/jumbo v1, "com.qihoo.action.BEGIN_UPGRADE_APP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    const-string/jumbo v1, "com.qihoo.action.INTENT_EXTRA_UPDATE_TYPE"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 21
    const-string/jumbo v1, "extra_apk_merge"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 23
    return-void
.end method
