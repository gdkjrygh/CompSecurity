.class Lcom/facebook/push/mqtt/y;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Ljava/util/concurrent/Semaphore;

.field final synthetic c:Lcom/facebook/push/mqtt/v;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/v;Ljava/lang/Runnable;Ljava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 648
    iput-object p1, p0, Lcom/facebook/push/mqtt/y;->c:Lcom/facebook/push/mqtt/v;

    iput-object p2, p0, Lcom/facebook/push/mqtt/y;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/facebook/push/mqtt/y;->b:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 651
    iget-object v0, p0, Lcom/facebook/push/mqtt/y;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 652
    iget-object v0, p0, Lcom/facebook/push/mqtt/y;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 653
    return-void
.end method
