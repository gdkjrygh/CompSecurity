.class final Lcom/roidapp/cloudlib/sns/notification/c;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/notification/b;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/b;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 123
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->j(Lcom/roidapp/cloudlib/sns/notification/b;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    :goto_0
    return-void

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->i(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->i(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->i(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->i(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->k(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/notification/f;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->k(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/notification/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->getCount()I

    move-result v0

    if-eqz v0, :cond_2

    .line 132
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->ak:I

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;)V

    .line 152
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->h(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 134
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->c(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 136
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->d(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->e:I

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->e(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 138
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->e(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/d;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/notification/d;-><init>(Lcom/roidapp/cloudlib/sns/notification/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 146
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->d(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->al:I

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->e(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 83
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/c;

    .line 1157
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->l(Lcom/roidapp/cloudlib/sns/notification/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1160
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/notification/b;Lcom/roidapp/cloudlib/sns/b/a/c;)Lcom/roidapp/cloudlib/sns/b/a/c;

    .line 1161
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->b(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/b/a/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->b(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/c;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1162
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->c(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1163
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->d(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->al:I

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1164
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->e(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1169
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/notification/b;->b(Lcom/roidapp/cloudlib/sns/notification/b;Lcom/roidapp/cloudlib/sns/b/a/c;)V

    .line 1170
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->h(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1175
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->b(Ljava/lang/Object;)V

    .line 83
    :cond_1
    return-void

    .line 1166
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->c(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 83
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/c;

    .line 2086
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/notification/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2089
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/notification/b;Lcom/roidapp/cloudlib/sns/b/a/c;)Lcom/roidapp/cloudlib/sns/b/a/c;

    .line 2090
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->b(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/b/a/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->b(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/c;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2091
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->c(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2092
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->d(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->al:I

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2093
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->e(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2098
    :goto_0
    if-eqz p1, :cond_1

    .line 2100
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/c;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2101
    const-wide/16 v0, 0x0

    .line 2105
    :goto_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/notification/b;->f(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 2106
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/notification/b;->g(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/roidapp/cloudlib/sns/main/a;->a(J)V

    .line 2110
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/notification/b;->b(Lcom/roidapp/cloudlib/sns/notification/b;Lcom/roidapp/cloudlib/sns/b/a/c;)V

    .line 2111
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->h(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2113
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->i(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2114
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->i(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 83
    :cond_2
    return-void

    .line 2095
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->c(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 2103
    :cond_4
    invoke-virtual {p1, v3}, Lcom/roidapp/cloudlib/sns/b/a/c;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    goto :goto_1
.end method
