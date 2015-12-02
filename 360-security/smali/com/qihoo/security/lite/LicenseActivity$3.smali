.class Lcom/qihoo/security/lite/LicenseActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 117
    iput-object p1, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->c(Lcom/qihoo/security/lite/LicenseActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    :try_start_0
    const-string/jumbo v0, "http://www.360safe.com/m/privacy.html#ceip"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 124
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/lite/LicenseActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0, v3}, Lcom/qihoo/security/lite/LicenseActivity;->a(Lcom/qihoo/security/lite/LicenseActivity;Z)Z

    .line 133
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->f(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 135
    :cond_0
    return-void

    .line 126
    :catch_0
    move-exception v0

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0, v3}, Lcom/qihoo/security/lite/LicenseActivity;->b(Lcom/qihoo/security/lite/LicenseActivity;Z)Z

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->d(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->e(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$3;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->b(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const-string/jumbo v1, "http://www.360safe.com/m/privacy.html#ceip"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method
