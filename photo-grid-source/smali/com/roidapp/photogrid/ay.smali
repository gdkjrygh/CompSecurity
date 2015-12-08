.class final Lcom/roidapp/photogrid/ay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/ax;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/ax;)V
    .locals 0

    .prologue
    .line 3093
    iput-object p1, p0, Lcom/roidapp/photogrid/ay;->a:Lcom/roidapp/photogrid/ax;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 3096
    iget-object v0, p0, Lcom/roidapp/photogrid/ay;->a:Lcom/roidapp/photogrid/ax;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ax;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/ay;->a:Lcom/roidapp/photogrid/ax;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ax;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/MainPage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/ay;->a:Lcom/roidapp/photogrid/ax;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ax;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3097
    iget-object v0, p0, Lcom/roidapp/photogrid/ay;->a:Lcom/roidapp/photogrid/ax;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ax;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/MainPage;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/MainPage;->b(Lcom/roidapp/photogrid/MainPage;Z)Z

    .line 3099
    iget-object v0, p0, Lcom/roidapp/photogrid/ay;->a:Lcom/roidapp/photogrid/ax;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ax;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "QuickPic"

    const v2, 0x7f0d0117

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    .line 3100
    iget-object v0, p0, Lcom/roidapp/photogrid/ay;->a:Lcom/roidapp/photogrid/ax;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ax;->dismissAllowingStateLoss()V

    .line 3102
    :cond_0
    return-void
.end method
