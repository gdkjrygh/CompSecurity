.class Landroid_src/mms/transaction/u;
.super Landroid/content/BroadcastReceiver;
.source "TransactionService.java"


# instance fields
.field final synthetic a:Landroid_src/mms/transaction/TransactionService;


# direct methods
.method private constructor <init>(Landroid_src/mms/transaction/TransactionService;)V
    .locals 0

    .prologue
    .line 842
    iput-object p1, p0, Landroid_src/mms/transaction/u;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid_src/mms/transaction/TransactionService;Landroid_src/mms/transaction/t;)V
    .locals 0

    .prologue
    .line 842
    invoke-direct {p0, p1}, Landroid_src/mms/transaction/u;-><init>(Landroid_src/mms/transaction/TransactionService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    .line 845
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 846
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 847
    const-string v1, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ConnectivityBroadcastReceiver.onReceive() action: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 850
    :cond_0
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 908
    :cond_1
    :goto_0
    return-void

    .line 854
    :cond_2
    const-string v0, "noConnectivity"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 857
    const-string v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/NetworkInfo;

    .line 866
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 867
    const-string v1, "fb-mms:TransactionService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Handle ConnectivityBroadcastReceiver.onReceive(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 871
    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    if-eq v1, v4, :cond_7

    .line 873
    :cond_4
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 874
    const-string v1, "fb-mms:TransactionService"

    const-string v2, "   type is not TYPE_MOBILE_MMS, bail"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 879
    :cond_5
    if-eqz v0, :cond_1

    const-string v1, "2GVoiceCallEnded"

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getReason()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 881
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 882
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "   reason is 2GVoiceCallEnded, retrying mms connectivity"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 885
    :cond_6
    iget-object v0, p0, Landroid_src/mms/transaction/u;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->b(Landroid_src/mms/transaction/TransactionService;)V

    goto :goto_0

    .line 890
    :cond_7
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-nez v1, :cond_8

    .line 891
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 892
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "   TYPE_MOBILE_MMS not connected, bail"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 897
    :cond_8
    new-instance v1, Landroid_src/mms/transaction/w;

    iget-object v2, p0, Landroid_src/mms/transaction/u;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid_src/mms/transaction/w;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 901
    invoke-virtual {v1}, Landroid_src/mms/transaction/w;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 902
    const-string v0, "fb-mms:TransactionService"

    const-string v1, "   empty MMSC url, bail"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 906
    :cond_9
    iget-object v0, p0, Landroid_src/mms/transaction/u;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->b(Landroid_src/mms/transaction/TransactionService;)V

    .line 907
    iget-object v0, p0, Landroid_src/mms/transaction/u;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v0}, Landroid_src/mms/transaction/TransactionService;->d(Landroid_src/mms/transaction/TransactionService;)Landroid_src/mms/transaction/v;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid_src/mms/transaction/v;->a(Landroid_src/mms/transaction/r;Landroid_src/mms/transaction/w;)V

    goto/16 :goto_0
.end method
