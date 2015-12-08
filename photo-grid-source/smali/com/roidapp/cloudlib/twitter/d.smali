.class final Lcom/roidapp/cloudlib/twitter/d;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/d;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .prologue
    .line 98
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/d;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/d;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 100
    :cond_0
    return-void
.end method
