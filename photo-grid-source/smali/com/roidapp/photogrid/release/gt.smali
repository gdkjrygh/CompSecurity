.class final Lcom/roidapp/photogrid/release/gt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 997
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gt;->d:Lcom/roidapp/photogrid/release/ge;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/gt;->a:Ljava/io/File;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/gt;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roidapp/photogrid/release/gt;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1001
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gt;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1002
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gt;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 1005
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gt;->d:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1006
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gt;->d:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    const v1, 0x7f0d0046

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1007
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gt;->d:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    const v1, 0x7f0d0045

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    .line 1008
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1009
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1010
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gt;->d:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    const v1, 0x7f0d0043

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1011
    const v1, 0x7f070039

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1013
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gt;->d:Lcom/roidapp/photogrid/release/ge;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gt;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/gt;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V

    .line 1014
    return-void
.end method
