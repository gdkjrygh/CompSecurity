.class final Lcom/roidapp/photogrid/release/np;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/nn;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/nn;)V
    .locals 0

    .prologue
    .line 296
    iput-object p1, p0, Lcom/roidapp/photogrid/release/np;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 300
    iget-object v0, p0, Lcom/roidapp/photogrid/release/np;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->d(Lcom/roidapp/photogrid/release/nn;)Z

    .line 301
    iget-object v0, p0, Lcom/roidapp/photogrid/release/np;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->e(Lcom/roidapp/photogrid/release/nn;)V

    .line 302
    iget-object v0, p0, Lcom/roidapp/photogrid/release/np;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/nn;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/np;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/nn;->f(Lcom/roidapp/photogrid/release/nn;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/np;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/nn;->g(Lcom/roidapp/photogrid/release/nn;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/common/e;->a(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/roidapp/photogrid/common/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/e;->a()V

    .line 303
    return-void
.end method
