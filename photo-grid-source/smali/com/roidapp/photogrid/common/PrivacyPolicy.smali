.class public Lcom/roidapp/photogrid/common/PrivacyPolicy;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 15
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    const v0, 0x7f030104

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/common/PrivacyPolicy;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/PrivacyPolicy;->v:Z

    if-nez v0, :cond_0

    .line 24
    const v0, 0x7f0d040c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/common/PrivacyPolicy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/PrivacyPolicy;->a:Landroid/webkit/WebView;

    .line 26
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/PrivacyPolicy;->a:Landroid/webkit/WebView;

    const-string v1, "file:///android_asset/privacy.html"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    :cond_0
    :goto_1
    return-void

    .line 19
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/PrivacyPolicy;->v:Z

    .line 21
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 35
    return-void
.end method
