.class Lcom/qihoo/security/services/DeepScanService$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/services/DeepScanService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/services/DeepScanService;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/qihoo/security/services/DeepScanService;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/services/DeepScanService;Lcom/qihoo/security/services/DeepScanService;)V
    .locals 1

    iput-object p1, p0, Lcom/qihoo/security/services/DeepScanService$a;->b:Lcom/qihoo/security/services/DeepScanService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/services/DeepScanService$a;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/DeepScanService;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-boolean v0, Lcom/qihoo/security/services/DeepScanService;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$a;->b:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$a;->b:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->c()V

    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    goto :goto_0

    :pswitch_1
    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->a()Z

    goto :goto_0

    :pswitch_2
    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->c()V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$a;->b:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$a;->b:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->b()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
