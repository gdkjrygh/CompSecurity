.class final Lcom/mobvista/sdk/m/core/loader/q;
.super Landroid/webkit/WebChromeClient;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/loader/n;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 221
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/q;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 3

    .prologue
    .line 224
    const/16 v0, 0x64

    if-ne p2, v0, :cond_1

    .line 225
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "\u52a0\u8f7d\u9875\u9762-\u8fdb\u5ea6\u5b8c\u6210\uff1a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/q;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->b(Lcom/mobvista/sdk/m/core/loader/n;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/q;->a:Lcom/mobvista/sdk/m/core/loader/n;

    iget-boolean v0, v0, Lcom/mobvista/sdk/m/core/loader/n;->b:Z

    if-nez v0, :cond_0

    .line 228
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/q;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->j(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 231
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/q;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->d(Lcom/mobvista/sdk/m/core/loader/n;)Lcom/mobvista/sdk/m/core/loader/t;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 232
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/q;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->d(Lcom/mobvista/sdk/m/core/loader/n;)Lcom/mobvista/sdk/m/core/loader/t;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 235
    :cond_1
    return-void
.end method
