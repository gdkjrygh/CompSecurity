.class final Lcom/roidapp/photogrid/release/lk;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/More;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/More;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lk;->a:Lcom/roidapp/photogrid/release/More;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 3

    .prologue
    .line 57
    const-string v0, "More"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "progress:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    const/16 v0, 0x64

    if-ne p2, v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lk;->a:Lcom/roidapp/photogrid/release/More;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/More;->a(Lcom/roidapp/photogrid/release/More;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lk;->a:Lcom/roidapp/photogrid/release/More;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/More;->b(Lcom/roidapp/photogrid/release/More;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lk;->a:Lcom/roidapp/photogrid/release/More;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/More;->c(Lcom/roidapp/photogrid/release/More;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "javascript:show()"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lk;->a:Lcom/roidapp/photogrid/release/More;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/More;->c(Lcom/roidapp/photogrid/release/More;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "javascript:showNewer()"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 67
    :cond_1
    return-void
.end method
