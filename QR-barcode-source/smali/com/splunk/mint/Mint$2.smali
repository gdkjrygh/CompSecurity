.class final Lcom/splunk/mint/Mint$2;
.super Ljava/lang/Object;
.source "Mint.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/splunk/mint/Mint;->startSession(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lcom/splunk/mint/Mint$2;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 187
    iget-object v1, p0, Lcom/splunk/mint/Mint$2;->val$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/splunk/mint/Utils;->shouldSendPing(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 188
    invoke-static {}, Lcom/splunk/mint/ActionEvent;->createPing()Lcom/splunk/mint/ActionEvent;

    move-result-object v0

    .line 189
    .local v0, "eve":Lcom/splunk/mint/ActionEvent;
    iget-object v1, p0, Lcom/splunk/mint/Mint$2;->val$context:Landroid/content/Context;

    new-instance v2, Lcom/splunk/mint/NetSender;

    invoke-direct {v2}, Lcom/splunk/mint/NetSender;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/splunk/mint/ActionEvent;->send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V

    .line 191
    .end local v0    # "eve":Lcom/splunk/mint/ActionEvent;
    :cond_0
    return-void
.end method
