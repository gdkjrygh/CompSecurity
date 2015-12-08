.class final Lcom/roidapp/cloudlib/instagram/d;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/d;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .prologue
    .line 138
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/d;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->a(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/d;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->a(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 142
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 143
    return-void
.end method
