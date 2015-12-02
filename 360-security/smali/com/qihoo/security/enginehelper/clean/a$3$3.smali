.class Lcom/qihoo/security/enginehelper/clean/a$3$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a$3;->a(IILcom/qihoo/security/clearengine/TrashType;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/qihoo/security/enginehelper/clean/a$3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a$3;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 436
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$3$3;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iput-object p2, p0, Lcom/qihoo/security/enginehelper/clean/a$3$3;->a:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 440
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$3;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v1, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    monitor-enter v1

    .line 442
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$3;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$3$3;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    iget-object v0, v0, Lcom/qihoo/security/enginehelper/clean/a$3;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->p(Lcom/qihoo/security/enginehelper/clean/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/a$a;

    .line 444
    if-eqz v0, :cond_0

    .line 445
    iget-object v2, p0, Lcom/qihoo/security/enginehelper/clean/a$3$3;->b:Lcom/qihoo/security/enginehelper/clean/a$3;

    invoke-static {v2}, Lcom/qihoo/security/enginehelper/clean/a$3;->a(Lcom/qihoo/security/enginehelper/clean/a$3;)I

    move-result v2

    iget-object v3, p0, Lcom/qihoo/security/enginehelper/clean/a$3$3;->a:Ljava/util/Map;

    invoke-interface {v0, v2, v3}, Lcom/qihoo/security/enginehelper/clean/a$a;->a(ILjava/util/Map;)V

    .line 448
    :cond_0
    monitor-exit v1

    .line 449
    return-void

    .line 448
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
