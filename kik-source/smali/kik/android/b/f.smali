.class final Lkik/android/b/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lkik/android/b/e;


# direct methods
.method constructor <init>(Lkik/android/b/e;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lkik/android/b/f;->b:Lkik/android/b/e;

    iput-object p2, p0, Lkik/android/b/f;->a:Ljava/util/Map;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    .line 158
    check-cast p1, Lcom/kik/n/a/c/i;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lkik/android/b/f;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/i/h$a;

    invoke-static {v0}, Lkik/android/b/a;->a(Lkik/a/i/h$a;)[B

    move-result-object v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-static {v4}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/kik/n/a/c/i;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/b;

    :try_start_1
    invoke-virtual {v0}, Lcom/b/a/b;->c()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/i/h$a;

    if-eqz v0, :cond_2

    add-int/lit8 v1, v1, 0x1

    int-to-long v8, v1

    sub-long v8, v4, v8

    invoke-virtual {v0, v8, v9}, Lkik/a/i/h$a;->a(J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    move v0, v1

    move v1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/i/h$a;

    iget-object v2, p0, Lkik/android/b/f;->b:Lkik/android/b/e;

    iget-object v2, v2, Lkik/android/b/e;->c:Lkik/android/b/a;

    invoke-static {v2}, Lkik/android/b/a;->c(Lkik/android/b/a;)Lkik/a/i/h;

    move-result-object v2

    invoke-interface {v2, v0}, Lkik/a/i/h;->a(Lkik/a/i/h$a;)Lcom/kik/g/p;

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lkik/android/b/f;->b:Lkik/android/b/e;

    iget-object v0, v0, Lkik/android/b/e;->b:Lcom/kik/g/p;

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/b/f;->b:Lkik/android/b/e;

    iget-object v0, v0, Lkik/android/b/e;->c:Lkik/android/b/a;

    invoke-static {v0}, Lkik/android/b/a;->b(Lkik/android/b/a;)Lkik/a/e/v;

    move-result-object v0

    const-string v1, "XDATA_CARD_HISTORY_MIGRATED"

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lkik/android/b/f;->b:Lkik/android/b/e;

    iget-object v0, v0, Lkik/android/b/e;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 227
    return-void
.end method
