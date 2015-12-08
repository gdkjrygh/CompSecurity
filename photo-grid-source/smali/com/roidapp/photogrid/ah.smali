.class final Lcom/roidapp/photogrid/ah;
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
    .line 2711
    iput-object p1, p0, Lcom/roidapp/photogrid/ah;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 2714
    iget-object v0, p0, Lcom/roidapp/photogrid/ah;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2718
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2719
    iget-object v0, p0, Lcom/roidapp/photogrid/ah;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->N(Lcom/roidapp/photogrid/MainPage;)Z

    .line 2720
    iget-object v0, p0, Lcom/roidapp/photogrid/ah;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    .line 2722
    :cond_0
    return-void
.end method
