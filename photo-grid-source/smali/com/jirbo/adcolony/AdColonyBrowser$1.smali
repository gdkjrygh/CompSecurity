.class Lcom/jirbo/adcolony/AdColonyBrowser$1;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/AdColonyBrowser;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/AdColonyBrowser;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyBrowser$1;->a:Lcom/jirbo/adcolony/AdColonyBrowser;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 2

    .prologue
    .line 189
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p2, p1, v0, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 190
    return-void
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .prologue
    .line 185
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser$1;->a:Lcom/jirbo/adcolony/AdColonyBrowser;

    mul-int/lit16 v1, p2, 0x3e8

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/AdColonyBrowser;->setProgress(I)V

    .line 186
    return-void
.end method
