.class final Lcom/kik/cards/browser/PopupWindowActivity$b;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/browser/PopupWindowActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cards/browser/PopupWindowActivity;


# direct methods
.method private constructor <init>(Lcom/kik/cards/browser/PopupWindowActivity;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/kik/cards/browser/PopupWindowActivity$b;->a:Lcom/kik/cards/browser/PopupWindowActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/cards/browser/PopupWindowActivity;B)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0, p1}, Lcom/kik/cards/browser/PopupWindowActivity$b;-><init>(Lcom/kik/cards/browser/PopupWindowActivity;)V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/kik/cards/browser/PopupWindowActivity$b;->a:Lcom/kik/cards/browser/PopupWindowActivity;

    invoke-static {v0, p2}, Lcom/kik/cards/browser/PopupWindowActivity;->a(Lcom/kik/cards/browser/PopupWindowActivity;Ljava/lang/String;)V

    .line 118
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 119
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/kik/cards/browser/PopupWindowActivity$b;->a:Lcom/kik/cards/browser/PopupWindowActivity;

    invoke-static {v0, p2}, Lcom/kik/cards/browser/PopupWindowActivity;->a(Lcom/kik/cards/browser/PopupWindowActivity;Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/kik/cards/browser/PopupWindowActivity$b;->a:Lcom/kik/cards/browser/PopupWindowActivity;

    invoke-static {v0, p2}, Lcom/kik/cards/browser/PopupWindowActivity;->b(Lcom/kik/cards/browser/PopupWindowActivity;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 132
    :goto_0
    return-void

    .line 130
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    goto :goto_0
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/kik/cards/browser/PopupWindowActivity$b;->a:Lcom/kik/cards/browser/PopupWindowActivity;

    invoke-static {v0}, Lcom/kik/cards/browser/PopupWindowActivity;->b(Lcom/kik/cards/browser/PopupWindowActivity;)V

    .line 138
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 139
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 140
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 145
    if-nez p2, :cond_1

    .line 155
    :cond_0
    :goto_0
    return v0

    .line 150
    :cond_1
    iget-object v1, p0, Lcom/kik/cards/browser/PopupWindowActivity$b;->a:Lcom/kik/cards/browser/PopupWindowActivity;

    invoke-static {v1, p2}, Lcom/kik/cards/browser/PopupWindowActivity;->b(Lcom/kik/cards/browser/PopupWindowActivity;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 151
    iget-object v0, p0, Lcom/kik/cards/browser/PopupWindowActivity$b;->a:Lcom/kik/cards/browser/PopupWindowActivity;

    invoke-static {v0, p2}, Lcom/kik/cards/browser/PopupWindowActivity;->a(Lcom/kik/cards/browser/PopupWindowActivity;Ljava/lang/String;)V

    .line 152
    const/4 v0, 0x0

    goto :goto_0
.end method
