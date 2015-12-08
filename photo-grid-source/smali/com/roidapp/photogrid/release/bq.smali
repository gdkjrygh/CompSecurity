.class final Lcom/roidapp/photogrid/release/bq;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/widget/ProgressBar;

.field final synthetic b:Lcom/roidapp/photogrid/release/bo;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/bo;Landroid/widget/ProgressBar;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bq;->b:Lcom/roidapp/photogrid/release/bo;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/bq;->a:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .prologue
    .line 60
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bq;->a:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 63
    :cond_0
    return-void
.end method
