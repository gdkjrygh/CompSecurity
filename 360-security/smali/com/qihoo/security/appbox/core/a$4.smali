.class Lcom/qihoo/security/appbox/core/a$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/appbox/b/d;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Ljava/lang/ref/WeakReference;

.field final synthetic e:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a;Ljava/lang/String;Lcom/qihoo/security/appbox/b/d;Landroid/content/Context;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .prologue
    .line 441
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$4;->e:Lcom/qihoo/security/appbox/core/a;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$4;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/qihoo/security/appbox/core/a$4;->b:Lcom/qihoo/security/appbox/b/d;

    iput-object p4, p0, Lcom/qihoo/security/appbox/core/a$4;->c:Landroid/content/Context;

    iput-object p5, p0, Lcom/qihoo/security/appbox/core/a$4;->d:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 441
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/appbox/core/a$4;->a(Lorg/json/JSONObject;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 5

    .prologue
    .line 448
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$4;->b:Lcom/qihoo/security/appbox/b/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/appbox/b/d;->a(Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v1

    .line 449
    if-eqz v1, :cond_0

    .line 450
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    .line 451
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$4;->e:Lcom/qihoo/security/appbox/core/a;

    const-string/jumbo v2, "0"

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V

    .line 452
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$4;->e:Lcom/qihoo/security/appbox/core/a;

    const-string/jumbo v2, "0"

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/appbox/core/a;->b(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V

    .line 454
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$4;->e:Lcom/qihoo/security/appbox/core/a;

    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$4;->c:Landroid/content/Context;

    const-string/jumbo v4, "0"

    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$4;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/b/c;

    invoke-static {v2, v3, v1, v4, v0}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V

    .line 456
    return-void
.end method
