.class Lorg/apache/cordova/Device$1;
.super Landroid/content/BroadcastReceiver;
.source "Device.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/Device;->initTelephonyReceiver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/Device;


# direct methods
.method constructor <init>(Lorg/apache/cordova/Device;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lorg/apache/cordova/Device$1;->this$0:Lorg/apache/cordova/Device;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 118
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.action.PHONE_STATE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 119
    const-string v1, "state"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 120
    const-string v1, "state"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 121
    .local v0, "extraData":Ljava/lang/String;
    sget-object v1, Landroid/telephony/TelephonyManager;->EXTRA_STATE_RINGING:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 122
    const-string v1, "Device"

    const-string v2, "Telephone RINGING"

    invoke-static {v1, v2}, Lorg/apache/cordova/api/LOG;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    iget-object v1, p0, Lorg/apache/cordova/Device$1;->this$0:Lorg/apache/cordova/Device;

    iget-object v1, v1, Lorg/apache/cordova/Device;->webView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "telephone"

    const-string v3, "ringing"

    invoke-virtual {v1, v2, v3}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .end local v0    # "extraData":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 125
    .restart local v0    # "extraData":Ljava/lang/String;
    :cond_1
    sget-object v1, Landroid/telephony/TelephonyManager;->EXTRA_STATE_OFFHOOK:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 126
    const-string v1, "Device"

    const-string v2, "Telephone OFFHOOK"

    invoke-static {v1, v2}, Lorg/apache/cordova/api/LOG;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget-object v1, p0, Lorg/apache/cordova/Device$1;->this$0:Lorg/apache/cordova/Device;

    iget-object v1, v1, Lorg/apache/cordova/Device;->webView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "telephone"

    const-string v3, "offhook"

    invoke-virtual {v1, v2, v3}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 129
    :cond_2
    sget-object v1, Landroid/telephony/TelephonyManager;->EXTRA_STATE_IDLE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 130
    const-string v1, "Device"

    const-string v2, "Telephone IDLE"

    invoke-static {v1, v2}, Lorg/apache/cordova/api/LOG;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iget-object v1, p0, Lorg/apache/cordova/Device$1;->this$0:Lorg/apache/cordova/Device;

    iget-object v1, v1, Lorg/apache/cordova/Device;->webView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "telephone"

    const-string v3, "idle"

    invoke-virtual {v1, v2, v3}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method
