.class final Lcom/roidapp/cloudlib/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/widget/ProgressBar;

.field final synthetic c:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;Ljava/lang/String;Landroid/widget/ProgressBar;)V
    .locals 0

    .prologue
    .line 379
    iput-object p1, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iput-object p2, p0, Lcom/roidapp/cloudlib/z;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/cloudlib/z;->b:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 383
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "retry to download "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/cloudlib/z;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    iget-object v0, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 388
    iget-object v0, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->r:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 389
    iget-object v0, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->q:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    .line 390
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 391
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 392
    iget-object v0, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->s:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 393
    sget v1, Lcom/roidapp/cloudlib/at;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 394
    iget-object v0, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->t:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 395
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 397
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->g:Lcom/roidapp/baselib/b/k;

    if-eqz v0, :cond_1

    .line 398
    iget-object v0, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->g:Lcom/roidapp/baselib/b/k;

    iget-object v1, p0, Lcom/roidapp/cloudlib/z;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    invoke-static {v2}, Lcom/roidapp/cloudlib/t;->a(Lcom/roidapp/cloudlib/t;)Landroid/widget/ImageView;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/z;->b:Landroid/widget/ProgressBar;

    iget-object v4, p0, Lcom/roidapp/cloudlib/z;->c:Lcom/roidapp/cloudlib/t;

    iget-object v4, v4, Lcom/roidapp/cloudlib/t;->i:Lcom/roidapp/baselib/b/p;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/baselib/b/k;->a(Ljava/lang/Object;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Lcom/roidapp/baselib/b/p;)V

    .line 400
    :cond_1
    return-void
.end method
