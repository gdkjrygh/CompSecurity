.class public Lcom/roidapp/photogrid/common/Eula;
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
    .line 16
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 18
    const v0, 0x7f030096

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/common/Eula;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/Eula;->v:Z

    if-nez v0, :cond_0

    .line 25
    const v0, 0x7f0d0266

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/common/Eula;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/Eula;->a:Landroid/webkit/WebView;

    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/common/Eula;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 28
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/Eula;->a:Landroid/webkit/WebView;

    const-string v1, "file:///android_asset/eula.html"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 32
    :cond_0
    :goto_1
    return-void

    .line 20
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/Eula;->v:Z

    .line 22
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
    .line 37
    return-void
.end method
