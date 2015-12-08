.class final Lcom/roidapp/photogrid/cloud/bu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/upload/i;

.field final synthetic c:Lcom/roidapp/photogrid/cloud/br;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/br;Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 0

    .prologue
    .line 1114
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/bu;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/bu;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 1118
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 1119
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 1120
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Save/Share/CancelUpload"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1121
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Save/Share/CancelUpload"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1122
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bu;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 1123
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bu;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 1135
    :cond_0
    :goto_0
    return-void

    .line 1124
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->c()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1125
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1126
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    .line 1129
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Save/Share/RetryUpload"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1130
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "Save/Share/RetryUpload"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1131
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->a:Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a()V

    .line 1132
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bu;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 1133
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bu;->c:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bu;->b:Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Context;Lcom/roidapp/cloudlib/sns/upload/i;)V

    goto :goto_0
.end method
