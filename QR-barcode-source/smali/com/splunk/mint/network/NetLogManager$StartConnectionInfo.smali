.class Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
.super Ljava/lang/Object;
.source "NetLogManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/splunk/mint/network/NetLogManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "StartConnectionInfo"
.end annotation


# instance fields
.field public protocol:Ljava/lang/String;

.field public startTime:Ljava/lang/Long;

.field public statusCode:I

.field final synthetic this$0:Lcom/splunk/mint/network/NetLogManager;

.field public url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/splunk/mint/network/NetLogManager;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->this$0:Lcom/splunk/mint/network/NetLogManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
