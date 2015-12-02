.class public Lcom/qihoo/security/clearengine/d/a;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Lcom/qihoo/security/clearengine/TrashType;Ljava/util/List;)Lcom/qihoo/security/clearengine/surface/b;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)",
            "Lcom/qihoo/security/clearengine/surface/b;"
        }
    .end annotation

    .prologue
    const-wide/16 v4, 0x0

    .line 34
    new-instance v8, Lcom/qihoo/security/clearengine/surface/b;

    invoke-direct {v8, p0}, Lcom/qihoo/security/clearengine/surface/b;-><init>(Lcom/qihoo/security/clearengine/TrashType;)V

    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    return-object v8

    .line 36
    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 40
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 41
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "subList"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-wide v2, v4

    move-wide v6, v4

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    :goto_2
    iget-wide v0, v8, Lcom/qihoo/security/clearengine/surface/b;->a:J

    add-long/2addr v0, v6

    iput-wide v0, v8, Lcom/qihoo/security/clearengine/surface/b;->a:J

    .line 57
    iget-wide v0, v8, Lcom/qihoo/security/clearengine/surface/b;->b:J

    add-long/2addr v0, v2

    iput-wide v0, v8, Lcom/qihoo/security/clearengine/surface/b;->b:J

    goto :goto_0

    .line 44
    :cond_1
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 45
    iget-boolean v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v1, :cond_2

    .line 46
    iget-wide v12, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v6, v12

    .line 48
    :cond_2
    iget-wide v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_1

    .line 51
    :cond_3
    iget-boolean v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v1, :cond_4

    .line 52
    iget-wide v2, v8, Lcom/qihoo/security/clearengine/surface/b;->a:J

    iget-wide v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v2, v6

    iput-wide v2, v8, Lcom/qihoo/security/clearengine/surface/b;->a:J

    .line 54
    :cond_4
    iget-wide v2, v8, Lcom/qihoo/security/clearengine/surface/b;->b:J

    iget-wide v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v0, v2

    iput-wide v0, v8, Lcom/qihoo/security/clearengine/surface/b;->b:J

    move-wide v2, v4

    move-wide v6, v4

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 106
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 107
    const-string/jumbo v1, "string"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    .line 109
    :goto_0
    return-object p2

    .line 108
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Ljava/util/List;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 115
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 116
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 141
    return-object v2

    .line 116
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 117
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 118
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v5, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 119
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v5, "subList"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 120
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v1, "subList"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 121
    if-eqz v0, :cond_2

    .line 122
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 123
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 124
    if-nez v1, :cond_3

    .line 125
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 126
    iget-object v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-interface {v2, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    :cond_3
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 132
    :cond_4
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 133
    if-nez v1, :cond_5

    .line 134
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    iget-object v5, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-interface {v2, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    :cond_5
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public static a(Ljava/util/Map;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;)",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 70
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    return-object v2

    .line 70
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/TrashType;

    .line 71
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 72
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 73
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 76
    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 73
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 74
    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clone()Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public static a(I)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 181
    const/16 v1, 0xe

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    .line 198
    array-length v3, v2

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 204
    :goto_1
    return v0

    .line 198
    :cond_0
    aget v4, v2, v1

    .line 199
    if-ne v4, p0, :cond_1

    .line 200
    const/4 v0, 0x1

    goto :goto_1

    .line 198
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 181
    :array_0
    .array-data 4
        0x22
        0x23
        0x21
        0x141
        0x20
        0x141
        0x143
        0x142
        0x24
        0x169
        0x16a
        0x16b
        0x16c
        0x16d
    .end array-data
.end method

.method public static b(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 91
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 92
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    return-object v2

    .line 92
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/TrashType;

    .line 93
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/clearengine/surface/b;

    invoke-virtual {v1}, Lcom/qihoo/security/clearengine/surface/b;->a()Lcom/qihoo/security/clearengine/surface/b;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public static b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 149
    if-nez p0, :cond_1

    .line 178
    :cond_0
    return-void

    .line 153
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 154
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    .line 155
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 158
    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v4, 0x141

    if-eq v1, v4, :cond_4

    iget v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v4, 0x21

    if-ne v1, v4, :cond_3

    .line 162
    :cond_4
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 163
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v4, "subList"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 164
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v4, "subList"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 165
    if-eqz v1, :cond_3

    .line 166
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 167
    iget-object v5, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-nez v5, :cond_5

    .line 168
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iput-object v5, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    .line 170
    :cond_5
    iget-object v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v5, "app_name"

    iget-object v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    invoke-virtual {v1, v5, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
