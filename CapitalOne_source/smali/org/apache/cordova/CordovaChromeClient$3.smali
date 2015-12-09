.class Lorg/apache/cordova/CordovaChromeClient$3;
.super Ljava/lang/Object;
.source "CordovaChromeClient.java"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CordovaChromeClient;

.field final synthetic val$result:Landroid/webkit/JsResult;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaChromeClient;Landroid/webkit/JsResult;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lorg/apache/cordova/CordovaChromeClient$3;->this$0:Lorg/apache/cordova/CordovaChromeClient;

    iput-object p2, p0, Lorg/apache/cordova/CordovaChromeClient$3;->val$result:Landroid/webkit/JsResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "keyCode"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 117
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 119
    iget-object v0, p0, Lorg/apache/cordova/CordovaChromeClient$3;->val$result:Landroid/webkit/JsResult;

    invoke-virtual {v0}, Landroid/webkit/JsResult;->confirm()V

    .line 120
    const/4 v0, 0x0

    .line 123
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
