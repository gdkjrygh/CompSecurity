.class Lcom/qihoo/security/appbox/core/a$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a;->a(ZLandroid/content/Context;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;JLcom/qihoo/security/appbox/b/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/volley/k$b",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic b:Lcom/qihoo/security/appbox/b/b;

.field final synthetic c:Z

.field final synthetic d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Landroid/content/Context;

.field final synthetic g:Ljava/lang/ref/WeakReference;

.field final synthetic h:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/qihoo/security/appbox/b/b;ZLcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;Landroid/content/Context;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .prologue
    .line 611
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$7;->h:Lcom/qihoo/security/appbox/core/a;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$7;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lcom/qihoo/security/appbox/core/a$7;->b:Lcom/qihoo/security/appbox/b/b;

    iput-boolean p4, p0, Lcom/qihoo/security/appbox/core/a$7;->c:Z

    iput-object p5, p0, Lcom/qihoo/security/appbox/core/a$7;->d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iput-object p6, p0, Lcom/qihoo/security/appbox/core/a$7;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/qihoo/security/appbox/core/a$7;->f:Landroid/content/Context;

    iput-object p8, p0, Lcom/qihoo/security/appbox/core/a$7;->g:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 611
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/appbox/core/a$7;->a(Lorg/json/JSONObject;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 5

    .prologue
    .line 615
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$7;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 620
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$7;->b:Lcom/qihoo/security/appbox/b/b;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/appbox/b/b;->a(Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v1

    .line 621
    if-eqz v1, :cond_0

    .line 622
    iget-boolean v0, p0, Lcom/qihoo/security/appbox/core/a$7;->c:Z

    if-eqz v0, :cond_1

    .line 623
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 624
    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$7;->d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-object v2, v2, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 625
    iget-object v2, v1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 626
    iput-object v0, v1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    .line 627
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$7;->d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-wide v2, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    iput-wide v2, v1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    .line 634
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$7;->h:Lcom/qihoo/security/appbox/core/a;

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$7;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V

    .line 636
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$7;->h:Lcom/qihoo/security/appbox/core/a;

    new-instance v2, Lcom/qihoo/security/appbox/core/a$7$1;

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/appbox/core/a$7$1;-><init>(Lcom/qihoo/security/appbox/core/a$7;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    invoke-virtual {v0, v2}, Lcom/qihoo/security/appbox/core/a;->a(Ljava/lang/Runnable;)V

    .line 643
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$7;->h:Lcom/qihoo/security/appbox/core/a;

    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$7;->f:Landroid/content/Context;

    iget-object v4, p0, Lcom/qihoo/security/appbox/core/a$7;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$7;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/b/c;

    invoke-static {v2, v3, v1, v4, v0}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V

    .line 644
    return-void

    .line 632
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    goto :goto_0
.end method
