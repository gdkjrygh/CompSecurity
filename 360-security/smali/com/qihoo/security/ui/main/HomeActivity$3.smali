.class Lcom/qihoo/security/ui/main/HomeActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/HomeActivity;->f(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/ui/main/HomeActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/HomeActivity;I)V
    .locals 0

    .prologue
    .line 1343
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$3;->b:Lcom/qihoo/security/ui/main/HomeActivity;

    iput p2, p0, Lcom/qihoo/security/ui/main/HomeActivity$3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 1347
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity$3;->b:Lcom/qihoo/security/ui/main/HomeActivity;

    monitor-enter v1

    .line 1348
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$3;->b:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->h(Lcom/qihoo/security/ui/main/HomeActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1351
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1352
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/main/c$a;

    .line 1353
    if-eqz v0, :cond_0

    .line 1354
    iget v3, p0, Lcom/qihoo/security/ui/main/HomeActivity$3;->a:I

    invoke-interface {v0, v3}, Lcom/qihoo/security/ui/main/c$a;->a(I)V

    goto :goto_0

    .line 1357
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1358
    return-void
.end method
