.class Lcom/qihoo/security/appbox/core/a$8;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a;->a(ZLandroid/content/Context;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;JLcom/qihoo/security/appbox/b/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/ref/WeakReference;

.field final synthetic d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field final synthetic e:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Ljava/lang/ref/WeakReference;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 0

    .prologue
    .line 646
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$8;->e:Lcom/qihoo/security/appbox/core/a;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$8;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lcom/qihoo/security/appbox/core/a$8;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/qihoo/security/appbox/core/a$8;->c:Ljava/lang/ref/WeakReference;

    iput-object p5, p0, Lcom/qihoo/security/appbox/core/a$8;->d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 6

    .prologue
    .line 650
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$8;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 654
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$8;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/b/c;

    .line 655
    if-nez v0, :cond_0

    .line 663
    :goto_0
    return-void

    .line 658
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$8;->d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-wide v2, v1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 659
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$8;->d:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-interface {v0, v1}, Lcom/qihoo/security/appbox/b/c;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    goto :goto_0

    .line 661
    :cond_1
    invoke-interface {v0}, Lcom/qihoo/security/appbox/b/c;->b()V

    goto :goto_0
.end method
