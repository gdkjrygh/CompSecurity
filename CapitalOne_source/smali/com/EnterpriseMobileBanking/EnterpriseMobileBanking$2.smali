.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$2;
.super Lorg/apache/cordova/CordovaChromeClient;
.source "EnterpriseMobileBanking.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->configureWebView(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaWebViewClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 0
    .param p2, "x0"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 223
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$2;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0, p2}, Lorg/apache/cordova/CordovaChromeClient;-><init>(Lorg/apache/cordova/api/CordovaInterface;)V

    return-void
.end method


# virtual methods
.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "defaultValue"    # Ljava/lang/String;
    .param p5, "result"    # Landroid/webkit/JsPromptResult;

    .prologue
    .line 234
    const-string v0, "gap_poll:"

    invoke-static {p4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    const-string p2, "file:///"

    .line 237
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "URL FIX APPLIED in onJsPrompt with defaultValue:  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " and url:  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " and message:  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    :cond_0
    invoke-super/range {p0 .. p5}, Lorg/apache/cordova/CordovaChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z

    move-result v0

    return v0
.end method
