.class final Lcom/roidapp/photogrid/cloud/ba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/upload/i;

.field final synthetic c:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 0

    .prologue
    .line 640
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/ba;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/ba;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    const/4 v5, 0x0

    .line 644
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 645
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 646
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Save/Save/CancelUpload"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Save/Save/CancelUpload"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 648
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ba;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 649
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ba;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 650
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ScrollView;

    move-result-object v0

    invoke-virtual {v0, v5, v5}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 651
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ScrollView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ScrollView;->requestLayout()V

    .line 665
    :cond_0
    :goto_0
    return-void

    .line 652
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->c()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 653
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 654
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    .line 657
    :cond_2
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Save/Save/RetryUpload"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Save/Save/RetryUpload"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 659
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a()V

    .line 660
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ba;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 661
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ba;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Context;Lcom/roidapp/cloudlib/sns/upload/i;)V

    .line 662
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ScrollView;

    move-result-object v0

    invoke-virtual {v0, v5, v5}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 663
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ba;->c:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ScrollView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ScrollView;->requestLayout()V

    goto :goto_0
.end method
