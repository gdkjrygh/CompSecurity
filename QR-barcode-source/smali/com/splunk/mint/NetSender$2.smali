.class Lcom/splunk/mint/NetSender$2;
.super Ljava/util/zip/GZIPOutputStream;
.source "NetSender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/splunk/mint/NetSender;->sendBlocking(Ljava/lang/String;Ljava/lang/String;Z)Lcom/splunk/mint/NetSenderResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/splunk/mint/NetSender;


# direct methods
.method constructor <init>(Lcom/splunk/mint/NetSender;Ljava/io/OutputStream;)V
    .locals 2
    .param p2, "x0"    # Ljava/io/OutputStream;

    .prologue
    .line 109
    iput-object p1, p0, Lcom/splunk/mint/NetSender$2;->this$0:Lcom/splunk/mint/NetSender;

    invoke-direct {p0, p2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 111
    iget-object v0, p0, Lcom/splunk/mint/NetSender$2;->def:Ljava/util/zip/Deflater;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/util/zip/Deflater;->setLevel(I)V

    .line 112
    return-void
.end method
