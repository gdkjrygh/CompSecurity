.class Lcom/cleanmaster/util/m;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cleanmaster/util/l;


# direct methods
.method constructor <init>(Lcom/cleanmaster/util/l;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/cleanmaster/util/m;->a:Lcom/cleanmaster/util/l;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lcom/cleanmaster/util/m;->a:Lcom/cleanmaster/util/l;

    invoke-static {v0}, Lcom/cleanmaster/util/l;->b(Lcom/cleanmaster/util/l;)Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:try{"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/util/m;->a:Lcom/cleanmaster/util/l;

    invoke-static {v2}, Lcom/cleanmaster/util/l;->a(Lcom/cleanmaster/util/l;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "recordEvent(8)}catch(e){alert(e)}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 48
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 49
    return-void
.end method
