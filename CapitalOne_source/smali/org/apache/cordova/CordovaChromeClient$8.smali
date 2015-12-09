.class Lorg/apache/cordova/CordovaChromeClient$8;
.super Ljava/lang/Object;
.source "CordovaChromeClient.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CordovaChromeClient;

.field final synthetic val$input:Landroid/widget/EditText;

.field final synthetic val$res:Landroid/webkit/JsPromptResult;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaChromeClient;Landroid/widget/EditText;Landroid/webkit/JsPromptResult;)V
    .locals 0

    .prologue
    .line 249
    iput-object p1, p0, Lorg/apache/cordova/CordovaChromeClient$8;->this$0:Lorg/apache/cordova/CordovaChromeClient;

    iput-object p2, p0, Lorg/apache/cordova/CordovaChromeClient$8;->val$input:Landroid/widget/EditText;

    iput-object p3, p0, Lorg/apache/cordova/CordovaChromeClient$8;->val$res:Landroid/webkit/JsPromptResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 251
    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient$8;->val$input:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 252
    .local v0, "usertext":Ljava/lang/String;
    iget-object v1, p0, Lorg/apache/cordova/CordovaChromeClient$8;->val$res:Landroid/webkit/JsPromptResult;

    invoke-virtual {v1, v0}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 253
    return-void
.end method
