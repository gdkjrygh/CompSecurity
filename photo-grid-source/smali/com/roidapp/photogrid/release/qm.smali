.class final Lcom/roidapp/photogrid/release/qm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/qi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/qi;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qm;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qm;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qm;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qm;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    :cond_0
    :goto_0
    return-void

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qm;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->dismissAllowingStateLoss()V

    goto :goto_0
.end method
