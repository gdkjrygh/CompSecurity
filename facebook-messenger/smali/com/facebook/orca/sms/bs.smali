.class Lcom/facebook/orca/sms/bs;
.super Landroid/content/BroadcastReceiver;
.source "SmsSendMessageHandler.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/bu;

.field final synthetic b:Ljava/util/concurrent/Semaphore;

.field final synthetic c:Lcom/facebook/orca/sms/br;


# direct methods
.method constructor <init>(Lcom/facebook/orca/sms/br;Lcom/facebook/orca/sms/bu;Ljava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/orca/sms/bs;->c:Lcom/facebook/orca/sms/br;

    iput-object p2, p0, Lcom/facebook/orca/sms/bs;->a:Lcom/facebook/orca/sms/bu;

    iput-object p3, p0, Lcom/facebook/orca/sms/bs;->b:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/sms/bs;->a:Lcom/facebook/orca/sms/bu;

    invoke-virtual {p0}, Lcom/facebook/orca/sms/bs;->getResultCode()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/sms/bu;->a(Lcom/facebook/orca/sms/bu;I)I

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/sms/bs;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 81
    return-void
.end method
