.class Lcom/qihoo/security/lite/LicenseActivity$2;
.super Landroid/webkit/WebViewClient;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/lite/LicenseActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/lite/LicenseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/lite/LicenseActivity;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/qihoo/security/lite/LicenseActivity$2;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$2;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->a(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$2;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->b(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 103
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 104
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$2;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->a(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$2;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->b(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 96
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 97
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 108
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 109
    const/4 v0, 0x1

    return v0
.end method
