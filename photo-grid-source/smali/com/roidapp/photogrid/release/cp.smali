.class final Lcom/roidapp/photogrid/release/cp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ck;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ck;)V
    .locals 0

    .prologue
    .line 269
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cp;->a:Lcom/roidapp/photogrid/release/ck;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cp;->a:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_0

    .line 274
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->q(Z)V

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cp;->a:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->l(Lcom/roidapp/photogrid/release/ck;)V

    .line 277
    :cond_0
    return-void
.end method
