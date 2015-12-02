.class Lcom/facebook/orca/sms/bt;
.super Landroid/content/BroadcastReceiver;
.source "SmsSendMessageHandler.java"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/sms/br;


# direct methods
.method constructor <init>(Lcom/facebook/orca/sms/br;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/orca/sms/bt;->b:Lcom/facebook/orca/sms/br;

    iput-object p2, p0, Lcom/facebook/orca/sms/bt;->a:Ljava/lang/String;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 89
    invoke-virtual {p0}, Lcom/facebook/orca/sms/bt;->getResultCode()I

    move-result v0

    .line 90
    iget-object v1, p0, Lcom/facebook/orca/sms/bt;->b:Lcom/facebook/orca/sms/br;

    invoke-static {v1}, Lcom/facebook/orca/sms/br;->a(Lcom/facebook/orca/sms/br;)Lcom/facebook/orca/sms/af;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/sms/bt;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;I)V

    .line 91
    return-void
.end method
