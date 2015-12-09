.class Lorg/apache/cordova/NetworkManager$1;
.super Landroid/content/BroadcastReceiver;
.source "NetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/NetworkManager;->initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/NetworkManager;


# direct methods
.method constructor <init>(Lorg/apache/cordova/NetworkManager;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lorg/apache/cordova/NetworkManager$1;->this$0:Lorg/apache/cordova/NetworkManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 106
    iget-object v0, p0, Lorg/apache/cordova/NetworkManager$1;->this$0:Lorg/apache/cordova/NetworkManager;

    iget-object v0, v0, Lorg/apache/cordova/NetworkManager;->webView:Lorg/apache/cordova/CordovaWebView;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lorg/apache/cordova/NetworkManager$1;->this$0:Lorg/apache/cordova/NetworkManager;

    iget-object v1, p0, Lorg/apache/cordova/NetworkManager$1;->this$0:Lorg/apache/cordova/NetworkManager;

    iget-object v1, v1, Lorg/apache/cordova/NetworkManager;->sockMan:Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    # invokes: Lorg/apache/cordova/NetworkManager;->updateConnectionInfo(Landroid/net/NetworkInfo;)V
    invoke-static {v0, v1}, Lorg/apache/cordova/NetworkManager;->access$000(Lorg/apache/cordova/NetworkManager;Landroid/net/NetworkInfo;)V

    .line 108
    :cond_0
    return-void
.end method
