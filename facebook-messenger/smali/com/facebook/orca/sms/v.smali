.class Lcom/facebook/orca/sms/v;
.super Landroid/content/BroadcastReceiver;
.source "MmsSendMessageHandler.java"


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/facebook/orca/sms/w;

.field final synthetic c:Ljava/util/concurrent/Semaphore;

.field final synthetic d:Lcom/facebook/orca/sms/u;


# direct methods
.method constructor <init>(Lcom/facebook/orca/sms/u;JLcom/facebook/orca/sms/w;Ljava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/facebook/orca/sms/v;->d:Lcom/facebook/orca/sms/u;

    iput-wide p2, p0, Lcom/facebook/orca/sms/v;->a:J

    iput-object p4, p0, Lcom/facebook/orca/sms/v;->b:Lcom/facebook/orca/sms/w;

    iput-object p5, p0, Lcom/facebook/orca/sms/v;->c:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 69
    const-string v0, "uri"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 70
    const-string v1, "state"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 71
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    iget-wide v2, p0, Lcom/facebook/orca/sms/v;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/sms/v;->b:Lcom/facebook/orca/sms/w;

    invoke-static {v0, v1}, Lcom/facebook/orca/sms/w;->a(Lcom/facebook/orca/sms/w;I)I

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/sms/v;->c:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 76
    :cond_0
    return-void
.end method
