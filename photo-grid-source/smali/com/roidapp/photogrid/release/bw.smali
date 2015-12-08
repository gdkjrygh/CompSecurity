.class final Lcom/roidapp/photogrid/release/bw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/bu;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/bu;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 66
    :goto_0
    return-void

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 63
    new-instance v0, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 64
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->b(Lcom/roidapp/photogrid/release/bu;)Z

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/bu;->c(Lcom/roidapp/photogrid/release/bu;)Z

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/bu;->d(Lcom/roidapp/photogrid/release/bu;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 65
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bw;->a:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const v2, 0x7f0d03ec

    const-string v3, "FragmentBgList"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0
.end method
