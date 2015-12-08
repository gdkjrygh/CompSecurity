.class Lcom/splunk/mint/NetSender$1;
.super Ljava/lang/Object;
.source "NetSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/splunk/mint/NetSender;

.field final synthetic val$data:Ljava/lang/String;

.field final synthetic val$saveOnFail:Z


# direct methods
.method constructor <init>(Lcom/splunk/mint/NetSender;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/splunk/mint/NetSender$1;->this$0:Lcom/splunk/mint/NetSender;

    iput-object p2, p0, Lcom/splunk/mint/NetSender$1;->val$data:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/splunk/mint/NetSender$1;->val$saveOnFail:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 35
    iget-object v0, p0, Lcom/splunk/mint/NetSender$1;->this$0:Lcom/splunk/mint/NetSender;

    iget-object v1, p0, Lcom/splunk/mint/NetSender$1;->val$data:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/splunk/mint/NetSender$1;->val$saveOnFail:Z

    invoke-virtual {v0, v1, v2}, Lcom/splunk/mint/NetSender;->sendBlocking(Ljava/lang/String;Z)Lcom/splunk/mint/NetSenderResponse;

    .line 36
    return-void
.end method
