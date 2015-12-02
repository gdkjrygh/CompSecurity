.class Lcom/qihoo360/mobilesafe/core/c$1$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1;->a(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c$1;

.field private final synthetic b:Z

.field private final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c$1;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->b:Z

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->c:Ljava/lang/String;

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 255
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->b:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v1, v0

    .line 257
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->b:Z

    if-eqz v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->h(Lcom/qihoo360/mobilesafe/core/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 265
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->g(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Ljava/lang/String;I)V

    .line 266
    return-void

    .line 255
    :cond_2
    const/4 v0, 0x1

    move v1, v0

    goto :goto_0

    .line 258
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 259
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->c:Ljava/lang/String;

    iget-object v4, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 260
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/c$1$7;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/c;->h(Lcom/qihoo360/mobilesafe/core/c;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1
.end method
