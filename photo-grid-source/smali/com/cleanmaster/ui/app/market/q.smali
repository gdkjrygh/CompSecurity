.class Lcom/cleanmaster/ui/app/market/q;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/o;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/o;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 150
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->b(Lcom/cleanmaster/ui/app/market/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    :goto_0
    return-void

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 154
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 155
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v1}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0xfa0

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 156
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 99
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->b(Lcom/cleanmaster/ui/app/market/o;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    if-eqz p1, :cond_0

    .line 102
    :try_start_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 109
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 113
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 114
    if-eqz p1, :cond_2

    .line 115
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 117
    :cond_2
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/o;Z)Z

    .line 118
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 119
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v1}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 121
    :cond_3
    invoke-static {p2}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 122
    if-eqz p1, :cond_4

    .line 123
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 125
    :cond_4
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/o;Z)Z

    .line 126
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 127
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v1}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 130
    :cond_5
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 131
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v1}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x2710

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 133
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 138
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->b(Lcom/cleanmaster/ui/app/market/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    :goto_0
    return-void

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0, v2}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/o;Z)Z

    .line 142
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 143
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2, p4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 144
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/q;->a:Lcom/cleanmaster/ui/app/market/o;

    invoke-static {v1}, Lcom/cleanmaster/ui/app/market/o;->c(Lcom/cleanmaster/ui/app/market/o;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 145
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 90
    if-eqz p1, :cond_0

    .line 91
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 92
    const/4 v0, 0x1

    .line 94
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method
