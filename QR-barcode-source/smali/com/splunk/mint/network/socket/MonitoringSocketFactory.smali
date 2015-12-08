.class public Lcom/splunk/mint/network/socket/MonitoringSocketFactory;
.super Ljava/lang/Object;
.source "MonitoringSocketFactory.java"

# interfaces
.implements Ljava/net/SocketImplFactory;


# instance fields
.field private final registry:Lcom/splunk/mint/network/MonitorRegistry;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/network/MonitorRegistry;)V
    .locals 0
    .param p1, "registry"    # Lcom/splunk/mint/network/MonitorRegistry;

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketFactory;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    .line 14
    return-void
.end method


# virtual methods
.method public createSocketImpl()Ljava/net/SocketImpl;
    .locals 3

    .prologue
    .line 18
    :try_start_0
    new-instance v1, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;

    iget-object v2, p0, Lcom/splunk/mint/network/socket/MonitoringSocketFactory;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v1, v2}, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;-><init>(Lcom/splunk/mint/network/MonitorRegistry;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 19
    :catch_0
    move-exception v0

    .line 20
    .local v0, "e":Ljava/lang/Exception;
    const-string v1, "Could not create the Network Monitoring implementation, Network monitoring will be disabled."

    invoke-static {v1}, Lcom/splunk/mint/Logger;->logError(Ljava/lang/String;)V

    .line 21
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Could not create the Network Monitoring implementation, Network monitoring will be disabled."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
