.class final Lcom/roidapp/cloudlib/sns/h/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/upload/i;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/h/h;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 0

    .prologue
    .line 532
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/h/k;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/h/k;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 535
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 536
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 537
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/k;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 538
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->p(Lcom/roidapp/cloudlib/sns/h/h;)Landroid/widget/LinearLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/k;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 547
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->p(Lcom/roidapp/cloudlib/sns/h/h;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->p(Lcom/roidapp/cloudlib/sns/h/h;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 548
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->q(Lcom/roidapp/cloudlib/sns/h/h;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 552
    :goto_1
    return-void

    .line 539
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->c()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 540
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 541
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_1

    .line 544
    :cond_2
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/k;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 545
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/k;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Context;Lcom/roidapp/cloudlib/sns/upload/i;)V

    goto :goto_0

    .line 550
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/k;->c:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->q(Lcom/roidapp/cloudlib/sns/h/h;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method
