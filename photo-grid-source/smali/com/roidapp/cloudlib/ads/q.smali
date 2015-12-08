.class public final Lcom/roidapp/cloudlib/ads/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/b;
.implements Lcom/roidapp/cloudlib/a/b;


# static fields
.field private static a:Lcom/roidapp/cloudlib/ads/q;


# instance fields
.field private b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/roidapp/baselib/c/x",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    return-void
.end method

.method public static a(Lcom/roidapp/cloudlib/ads/r;)Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 115
    if-nez p0, :cond_0

    const/4 v0, 0x0

    .line 122
    :goto_0
    return-object v0

    .line 116
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 117
    const-string v1, "adType"

    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->a(Lcom/roidapp/cloudlib/ads/r;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 118
    const-string v1, "playUrl"

    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->b(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v1, "resUrl"

    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->c(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v1, "package"

    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->d(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const-string v1, "url"

    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->e(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/roidapp/cloudlib/ads/q;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/ads/q;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/ads/q;->a:Lcom/roidapp/cloudlib/ads/q;

    .line 33
    return-void
.end method

.method public static b()Lcom/roidapp/cloudlib/ads/q;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/roidapp/cloudlib/ads/q;->a:Lcom/roidapp/cloudlib/ads/q;

    return-object v0
.end method

.method public static b(Lcom/roidapp/cloudlib/ads/r;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 126
    if-nez p0, :cond_1

    .line 132
    :cond_0
    :goto_0
    return v0

    .line 127
    :cond_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->a(Lcom/roidapp/cloudlib/ads/r;)I

    move-result v2

    if-ne v2, v1, :cond_0

    .line 128
    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->c(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v2

    .line 2040
    invoke-static {v2}, Lcom/roidapp/cloudlib/ads/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 128
    invoke-static {v2, v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 130
    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->d(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/r;->d(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    .line 132
    goto :goto_0
.end method

.method private d()V
    .locals 5

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/q;->b:Ljava/util/Queue;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/q;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/x;

    .line 86
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 87
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v2

    new-instance v3, Lcom/roidapp/baselib/e/a;

    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ".tmp"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0, p0}, Lcom/roidapp/baselib/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/b;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 90
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Lcom/roidapp/cloudlib/ads/r;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 94
    new-instance v0, Lcom/roidapp/cloudlib/ads/r;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/ads/r;-><init>(Lcom/roidapp/cloudlib/ads/q;)V

    .line 95
    const-string v1, "adType"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->a(Lcom/roidapp/cloudlib/ads/r;I)I

    .line 96
    const-string v1, "playUrl"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->a(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    const-string v1, "resUrl"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->b(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    const-string v1, "package"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->c(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    const-string v1, "url"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->d(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 63
    return-void
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/roidapp/cloudlib/ads/q;->d()V

    .line 79
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 25
    check-cast p1, Ljava/lang/String;

    .line 2067
    if-eqz p1, :cond_0

    .line 2068
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2069
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ".tmp"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2070
    new-instance v1, Ljava/io/File;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x4

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 2073
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/ads/q;->d()V

    .line 25
    return-void
.end method

.method public final c()V
    .locals 5

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/q;->b:Ljava/util/Queue;

    if-eqz v0, :cond_1

    .line 59
    :cond_0
    :goto_0
    return-void

    .line 48
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "ad"

    const-string v2, "pushAdRes"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 49
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 50
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/roidapp/cloudlib/ads/q;->b:Ljava/util/Queue;

    .line 51
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1040
    invoke-static {v0}, Lcom/roidapp/cloudlib/ads/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 53
    if-eqz v2, :cond_2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_2

    .line 54
    iget-object v3, p0, Lcom/roidapp/cloudlib/ads/q;->b:Ljava/util/Queue;

    new-instance v4, Lcom/roidapp/baselib/c/x;

    invoke-direct {v4, v0, v2}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 57
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/cloudlib/ads/q;->d()V

    goto :goto_0
.end method
