.class final Lcom/google/zxing/client/android/HelpActivity$HelpClient;
.super Landroid/webkit/WebViewClient;
.source "HelpActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/zxing/client/android/HelpActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "HelpClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/zxing/client/android/HelpActivity;


# direct methods
.method private constructor <init>(Lcom/google/zxing/client/android/HelpActivity;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/google/zxing/client/android/HelpActivity$HelpClient;->this$0:Lcom/google/zxing/client/android/HelpActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/zxing/client/android/HelpActivity;Lcom/google/zxing/client/android/HelpActivity$HelpClient;)V
    .locals 0

    .prologue
    .line 114
    invoke-direct {p0, p1}, Lcom/google/zxing/client/android/HelpActivity$HelpClient;-><init>(Lcom/google/zxing/client/android/HelpActivity;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 117
    iget-object v0, p0, Lcom/google/zxing/client/android/HelpActivity$HelpClient;->this$0:Lcom/google/zxing/client/android/HelpActivity;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/zxing/client/android/HelpActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 118
    iget-object v0, p0, Lcom/google/zxing/client/android/HelpActivity$HelpClient;->this$0:Lcom/google/zxing/client/android/HelpActivity;

    # getter for: Lcom/google/zxing/client/android/HelpActivity;->backButton:Landroid/widget/Button;
    invoke-static {v0}, Lcom/google/zxing/client/android/HelpActivity;->access$1(Lcom/google/zxing/client/android/HelpActivity;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 119
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 123
    const-string v0, "file"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    const/4 v0, 0x0

    .line 129
    :goto_0
    return v0

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/google/zxing/client/android/HelpActivity$HelpClient;->this$0:Lcom/google/zxing/client/android/HelpActivity;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/google/zxing/client/android/HelpActivity;->startActivity(Landroid/content/Intent;)V

    .line 129
    const/4 v0, 0x1

    goto :goto_0
.end method
