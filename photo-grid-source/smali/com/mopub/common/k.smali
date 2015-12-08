.class final Lcom/mopub/common/k;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/common/MoPubBrowser;


# direct methods
.method constructor <init>(Lcom/mopub/common/MoPubBrowser;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/mopub/common/k;->a:Lcom/mopub/common/MoPubBrowser;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .prologue
    .line 147
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/k;->a:Lcom/mopub/common/MoPubBrowser;

    const-string v1, "Loading..."

    invoke-virtual {v0, v1}, Lcom/mopub/common/MoPubBrowser;->setTitle(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, p0, Lcom/mopub/common/k;->a:Lcom/mopub/common/MoPubBrowser;

    mul-int/lit8 v1, p2, 0x64

    invoke-virtual {v0, v1}, Lcom/mopub/common/MoPubBrowser;->setProgress(I)V

    .line 149
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/mopub/common/k;->a:Lcom/mopub/common/MoPubBrowser;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/common/MoPubBrowser;->setTitle(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
