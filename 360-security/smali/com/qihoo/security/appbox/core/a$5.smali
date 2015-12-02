.class Lcom/qihoo/security/appbox/core/a$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .prologue
    .line 457
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$5;->b:Lcom/qihoo/security/appbox/core/a;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$5;->a:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 6

    .prologue
    .line 464
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$5;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/b/c;

    .line 465
    if-nez v0, :cond_0

    .line 473
    :goto_0
    return-void

    .line 468
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$5;->b:Lcom/qihoo/security/appbox/core/a;

    invoke-static {v1}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v1

    iget-wide v2, v1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 469
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$5;->b:Lcom/qihoo/security/appbox/core/a;

    invoke-static {v1}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/appbox/b/c;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    goto :goto_0

    .line 471
    :cond_1
    invoke-interface {v0}, Lcom/qihoo/security/appbox/b/c;->b()V

    goto :goto_0
.end method
