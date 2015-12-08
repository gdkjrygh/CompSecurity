.class public Lcom/hmobile/biblekjv/TwitterClass;
.super Landroid/app/Activity;
.source "TwitterClass.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field url:Ljava/lang/String;

.field webview:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 34
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 18
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    const v2, 0x7f030035

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/TwitterClass;->setContentView(I)V

    .line 20
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TwitterClass;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 21
    .local v1, "b":Landroid/os/Bundle;
    if-eqz v1, :cond_0

    .line 22
    const-string v2, "url"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/TwitterClass;->url:Ljava/lang/String;

    .line 24
    :cond_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 25
    .local v0, "Dialog":Landroid/app/ProgressDialog;
    const v2, 0x7f0e0135

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/TwitterClass;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/TwitterClass;->webview:Landroid/webkit/WebView;

    .line 26
    iget-object v2, p0, Lcom/hmobile/biblekjv/TwitterClass;->webview:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 28
    iget-object v2, p0, Lcom/hmobile/biblekjv/TwitterClass;->webview:Landroid/webkit/WebView;

    iget-object v3, p0, Lcom/hmobile/biblekjv/TwitterClass;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 29
    return-void
.end method
