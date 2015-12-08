.class final Lcom/roidapp/photogrid/cloud/bt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/upload/j;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/br;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 0

    .prologue
    .line 1044
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1048
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    .line 1049
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/br;->a(Ljava/util/Collection;)V

    .line 1050
    return-void
.end method

.method public final a(JI)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 1059
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->k(Lcom/roidapp/photogrid/cloud/br;)J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    .line 1060
    if-nez p3, :cond_0

    .line 1061
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->l(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1062
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->m(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1063
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->n(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1064
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->n(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1065
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->m(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 1066
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->o(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v1

    const v2, 0x7f0700fa

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1067
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->o(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, v3, v3, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1088
    :goto_0
    return-void

    .line 1070
    :cond_0
    const/16 v0, 0x64

    if-ge p3, v0, :cond_1

    .line 1071
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->n(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_0

    .line 1074
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v1

    const v2, 0x7f0700c1

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1075
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->o(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v1

    const v2, 0x7f070060

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1076
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->o(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f020370

    invoke-static {v0, v1, v3, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 1077
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    sget v1, Lcom/roidapp/cloudlib/sns/upload/b;->c:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;I)I

    .line 1078
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->l(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1079
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->m(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1080
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->n(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1081
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->m(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x7f0200c9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_0

    .line 1085
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/roidapp/photogrid/cloud/br;JI)Z

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 1054
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bt;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/br;->a(Ljava/util/Collection;)V

    .line 1055
    return-void
.end method
