.class Lcom/qihoo/security/enginehelper/clean/a$3$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a$3;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/a$3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a$3;)V
    .locals 0

    .prologue
    .line 409
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3$2;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 413
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$2;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v1, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 414
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$2;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$2;->a:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$a;

    .line 416
    if-eqz v0, :cond_0

    .line 417
    invoke-interface {v0}, Lcom/qihoo/security/enginehelper/clean/a$a;->a()V

    .line 420
    :cond_0
    monitor-exit v1

    .line 422
    return-void

    .line 420
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
