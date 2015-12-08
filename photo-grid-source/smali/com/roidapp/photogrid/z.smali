.class final Lcom/roidapp/photogrid/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 1490
    iput-object p1, p0, Lcom/roidapp/photogrid/z;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 1493
    iget-object v0, p0, Lcom/roidapp/photogrid/z;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1496
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1497
    iget-object v0, p0, Lcom/roidapp/photogrid/z;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->p()Z

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/z;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bq;->a(ZLandroid/app/Activity;)Lcom/roidapp/photogrid/common/bq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->c()V

    .line 1499
    :cond_0
    return-void
.end method
