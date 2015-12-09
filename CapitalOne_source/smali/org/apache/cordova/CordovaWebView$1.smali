.class Lorg/apache/cordova/CordovaWebView$1;
.super Landroid/content/BroadcastReceiver;
.source "CordovaWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaWebView;->setup()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CordovaWebView;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaWebView;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView$1;->this$0:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 274
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView$1;->this$0:Lorg/apache/cordova/CordovaWebView;

    # invokes: Lorg/apache/cordova/CordovaWebView;->updateUserAgentString()V
    invoke-static {v0}, Lorg/apache/cordova/CordovaWebView;->access$000(Lorg/apache/cordova/CordovaWebView;)V

    .line 275
    return-void
.end method
