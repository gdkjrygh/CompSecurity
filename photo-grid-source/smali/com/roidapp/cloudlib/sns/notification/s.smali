.class public final Lcom/roidapp/cloudlib/sns/notification/s;
.super Lcom/roidapp/cloudlib/sns/basepost/h;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/basepost/u;


# instance fields
.field private v:Lcom/roidapp/cloudlib/sns/b/n;

.field private w:I

.field private x:Ljava/lang/String;

.field private final y:Lcom/roidapp/cloudlib/sns/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;-><init>()V

    .line 44
    new-instance v0, Lcom/roidapp/cloudlib/sns/notification/t;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/notification/t;-><init>(Lcom/roidapp/cloudlib/sns/notification/s;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->y:Lcom/roidapp/cloudlib/sns/w;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/s;Lcom/roidapp/cloudlib/sns/b/n;)Lcom/roidapp/cloudlib/sns/b/n;
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/s;)Z
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->e:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/notification/s;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/notification/s;)Z
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->e:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/notification/s;)Z
    .locals 1

    .prologue
    .line 34
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/notification/s;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 34
    .line 3082
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    if-eqz v0, :cond_0

    .line 3083
    sget v0, Lcom/roidapp/cloudlib/at;->X:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/notification/s;->a(I)V

    :goto_0
    return-void

    .line 3085
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 3086
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->x:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3087
    sget v1, Lcom/roidapp/cloudlib/ar;->aG:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 3088
    sget v2, Lcom/roidapp/cloudlib/ar;->aH:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 3089
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 3090
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->e:I

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3091
    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/u;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/notification/u;-><init>(Lcom/roidapp/cloudlib/sns/notification/s;)V

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3102
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3108
    :goto_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 3109
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v5}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    .line 3104
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->X:I

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3105
    const/16 v1, 0x8

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/notification/s;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .prologue
    .line 200
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 201
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 202
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 203
    return-object v0
.end method

.method public final a(ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 213
    iput p1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->w:I

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    .line 215
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/notification/s;->x:Ljava/lang/String;

    .line 217
    return-void
.end method

.method protected final a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 141
    invoke-super {p0, p1, p2, p3, p4}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    if-eqz v0, :cond_1

    .line 143
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;-><init>()V

    .line 144
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->add(Ljava/lang/Object;)Z

    .line 1208
    const/4 v1, 0x1

    invoke-super {p0, v0, v1, v5}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 151
    :cond_0
    :goto_0
    return-void

    .line 2114
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 2115
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->x:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 2116
    sget v1, Lcom/roidapp/cloudlib/ar;->aG:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 2117
    sget v2, Lcom/roidapp/cloudlib/ar;->aH:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 2118
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 2119
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->e:I

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2120
    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/v;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/notification/v;-><init>(Lcom/roidapp/cloudlib/sns/notification/s;)V

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2131
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2132
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 2133
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v5}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V
    .locals 0

    .prologue
    .line 208
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 209
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 284
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_1

    .line 285
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 286
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->h_()Z

    .line 292
    :cond_0
    :goto_0
    return-void

    .line 290
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected final a(Z)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 167
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Z)V

    .line 168
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "PostDetail"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;)V

    .line 169
    if-eqz p1, :cond_1

    .line 170
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->w:I

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/notification/s;->y:Lcom/roidapp/cloudlib/sns/w;

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/sns/q;->d(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 180
    :cond_0
    :goto_0
    return-void

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 2208
    const/4 v1, 0x1

    invoke-super {p0, v0, v1, v2}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    goto :goto_0
.end method

.method protected final b()V
    .locals 0

    .prologue
    .line 184
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->b()V

    .line 185
    return-void
.end method

.method public final b(Z)V
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x0

    .line 246
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 280
    :cond_0
    :goto_0
    return-void

    .line 249
    :cond_1
    if-eqz p1, :cond_3

    .line 250
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 251
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->x:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 252
    sget v1, Lcom/roidapp/cloudlib/ar;->aG:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 253
    sget v2, Lcom/roidapp/cloudlib/ar;->aH:I

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 254
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 255
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/w;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/notification/w;-><init>(Lcom/roidapp/cloudlib/sns/notification/s;)V

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 272
    :goto_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 273
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v5}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    .line 269
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->X:I

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 275
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 277
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v6}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final f()V
    .locals 1

    .prologue
    .line 189
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->f()V

    .line 190
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->r:Z

    .line 191
    return-void
.end method

.method public final onDestroyView()V
    .locals 0

    .prologue
    .line 195
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->onDestroyView()V

    .line 196
    return-void
.end method

.method public final onRefresh()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 221
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->onRefresh()V

    .line 222
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 223
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->e:Z

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->d()V

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    .line 232
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 234
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->w:I

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/notification/s;->y:Lcom/roidapp/cloudlib/sns/w;

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/sns/q;->d(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 235
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 236
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 242
    :cond_2
    :goto_0
    return-void

    .line 238
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 239
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    goto :goto_0
.end method

.method public final setUserVisibleHint(Z)V
    .locals 2

    .prologue
    .line 155
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->setUserVisibleHint(Z)V

    .line 156
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 157
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v0

    .line 158
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/s;->v:Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v1, v1, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v0

    .line 159
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/g/a;->a(Lcom/roidapp/cloudlib/sns/g/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/s;->h_()Z

    .line 163
    :cond_0
    return-void
.end method
