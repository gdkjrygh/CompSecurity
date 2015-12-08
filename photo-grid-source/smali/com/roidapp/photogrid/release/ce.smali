.class final Lcom/roidapp/photogrid/release/ce;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/cd;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cd;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const v4, 0x7f0d03ec

    .line 82
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 101
    :cond_0
    :goto_0
    return-void

    .line 86
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->b(Lcom/roidapp/photogrid/release/cd;)I

    move-result v0

    if-nez v0, :cond_2

    .line 87
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v1, "FragmentBorder"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 89
    new-instance v0, Lcom/roidapp/photogrid/release/ck;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ck;-><init>()V

    .line 90
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const-string v2, "FragmentBorder"

    invoke-virtual {v1, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 93
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v1, "FragmentBgList"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 95
    new-instance v0, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 96
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->c(Lcom/roidapp/photogrid/release/cd;)Z

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cd;->d(Lcom/roidapp/photogrid/release/cd;)Z

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/cd;->e(Lcom/roidapp/photogrid/release/cd;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 97
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ce;->a:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const-string v2, "FragmentBgList"

    invoke-virtual {v1, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0
.end method
