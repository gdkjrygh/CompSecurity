.class public abstract Lcom/roidapp/cloudlib/sns/topic/b;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/roidapp/cloudlib/sns/main/b;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;",
        "Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;"
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

.field protected d:Lcom/roidapp/baselib/c/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/baselib/c/y",
            "<",
            "Lcom/roidapp/cloudlib/sns/topic/a",
            "<TT;",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;>;"
        }
    .end annotation
.end field

.field protected e:Landroid/support/v7/widget/RecyclerView;

.field protected f:Lcom/roidapp/cloudlib/sns/b/x;

.field protected g:Lcom/roidapp/cloudlib/sns/b/p;

.field protected h:Lcom/roidapp/cloudlib/sns/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/o",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected i:Z

.field protected j:Z

.field protected k:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected l:Z

.field private m:Landroid/widget/FrameLayout;

.field private n:Z

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 47
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/b;)Z
    .locals 1

    .prologue
    .line 25
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->n:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/b;)Z
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->n:Z

    return v0
.end method


# virtual methods
.method protected final a(II)V
    .locals 2

    .prologue
    .line 181
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->getUserVisibleHint()Z

    move-result v0

    if-nez v0, :cond_1

    .line 187
    :cond_0
    :goto_0
    return-void

    .line 184
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method protected abstract a(Lcom/roidapp/cloudlib/sns/b/n;)V
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->a:Ljava/lang/String;

    .line 97
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/topic/b;->b:Ljava/lang/String;

    .line 98
    return-void
.end method

.method protected abstract a(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method

.method protected final b(Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 130
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->z()Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    :goto_0
    return-void

    .line 133
    :cond_0
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->k:Ljava/lang/Object;

    .line 134
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/b;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v2

    .line 1160
    :goto_1
    if-eqz v0, :cond_5

    .line 1161
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 1162
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v3, v6}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 1163
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/as;->ah:I

    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v4, v5, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 1164
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v4, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1165
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 137
    :cond_1
    :goto_2
    if-nez v0, :cond_3

    .line 138
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    if-nez v0, :cond_2

    .line 140
    new-instance v0, Lcom/roidapp/baselib/c/y;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->g()Lcom/roidapp/cloudlib/sns/topic/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/y;-><init>(Landroid/support/v7/widget/al;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    .line 142
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->e()V

    .line 143
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v3}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->hashCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v6, v1, v3, v4}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/ax;Lcom/roidapp/baselib/c/y;Landroid/view/View;Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/a;->f(I)V

    .line 145
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/topic/a;->b(Ljava/lang/Object;)V

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    if-nez v0, :cond_6

    .line 148
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 149
    new-instance v3, Lcom/roidapp/baselib/c/ad;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/k;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/l;

    invoke-direct {v3, v0, v1}, Lcom/roidapp/baselib/c/ad;-><init>(Lcom/bumptech/glide/k;Lcom/bumptech/glide/l;)V

    .line 151
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/ax;)V

    .line 156
    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 134
    goto/16 :goto_1

    .line 1168
    :cond_5
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    .line 1169
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 1170
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto/16 :goto_2

    .line 153
    :cond_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    goto :goto_3
.end method

.method protected abstract d()V
.end method

.method protected abstract f()Landroid/support/v7/widget/au;
.end method

.method protected abstract g()Lcom/roidapp/cloudlib/sns/topic/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/roidapp/cloudlib/sns/topic/a",
            "<TT;",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation
.end method

.method public final h()V
    .locals 2

    .prologue
    .line 226
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->i:Z

    if-nez v0, :cond_0

    .line 227
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ae:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 230
    :cond_0
    return-void
.end method

.method protected i()V
    .locals 0

    .prologue
    .line 195
    return-void
.end method

.method public final i_()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a_(I)V

    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->l_()V

    .line 93
    :cond_0
    return-void
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/a;->a()I

    move-result v0

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->o:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final k()I
    .locals 3

    .prologue
    .line 217
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/a;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 218
    const/4 v0, -0x1

    .line 221
    :goto_0
    return v0

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    .line 221
    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->c()Landroid/support/v7/widget/t;

    move-result-object v1

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->l()I

    move-result v2

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->d()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/widget/t;->c(II)I

    move-result v0

    goto :goto_0
.end method

.method protected l()Z
    .locals 1

    .prologue
    .line 233
    const/4 v0, 0x0

    return v0
.end method

.method protected final m()Z
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->h:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->h:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 239
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->h:Lcom/roidapp/cloudlib/sns/o;

    .line 240
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 241
    const/4 v0, 0x1

    .line 243
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 199
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/b/n;

    if-eqz v0, :cond_0

    .line 200
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->o:Z

    .line 201
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/topic/b;->a(Lcom/roidapp/cloudlib/sns/b/n;)V

    .line 203
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 79
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 80
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->g:Lcom/roidapp/cloudlib/sns/b/p;

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->g:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->f:Lcom/roidapp/cloudlib/sns/b/x;

    .line 84
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 102
    sget v0, Lcom/roidapp/cloudlib/as;->af:I

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 103
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->d()V

    .line 1109
    sget v0, Lcom/roidapp/cloudlib/ar;->cX:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 1110
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/topic/b;->l:Z

    invoke-virtual {p0, v0, v3, v2}, Lcom/roidapp/cloudlib/sns/topic/b;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V

    .line 1111
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 1112
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->l:Z

    if-eqz v0, :cond_0

    .line 1113
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;)V

    .line 1115
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->cW:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    .line 1116
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Lcom/roidapp/cloudlib/sns/topic/c;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/topic/c;-><init>(Lcom/roidapp/cloudlib/sns/topic/b;)V

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/ax;)V

    .line 1117
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->f()Landroid/support/v7/widget/au;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/au;)V

    .line 1118
    sget v0, Lcom/roidapp/cloudlib/ar;->cY:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/b;->m:Landroid/widget/FrameLayout;

    .line 105
    return-object v1
.end method
