.class final Lcom/roidapp/photogrid/release/mf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PhotoGridActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V
    .locals 0

    .prologue
    .line 4735
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mf;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 4738
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mf;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4739
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mf;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l()V

    .line 4740
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 4742
    :cond_0
    return-void
.end method
