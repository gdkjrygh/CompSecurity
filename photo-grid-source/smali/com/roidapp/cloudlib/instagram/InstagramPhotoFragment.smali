.class public Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;
.super Lcom/roidapp/cloudlib/t;
.source "SourceFile"


# instance fields
.field private final o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:I

.field private r:Z

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/roidapp/cloudlib/t;-><init>()V

    .line 31
    const-string v0, "InstagramFragment"

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->o:Ljava/lang/String;

    .line 33
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->q:I

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->r:Z

    .line 67
    new-instance v0, Lcom/roidapp/cloudlib/instagram/n;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/instagram/n;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->t:Landroid/content/DialogInterface$OnClickListener;

    .line 196
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;)V
    .locals 3

    .prologue
    .line 3075
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3076
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->startActivity(Landroid/content/Intent;)V

    .line 3077
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 27
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 143
    if-eqz p1, :cond_0

    .line 144
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->s:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 148
    :goto_0
    return-void

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->s:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/instagram/r;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 130
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->a(Z)V

    .line 131
    if-eqz p1, :cond_1

    .line 132
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/instagram/p;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/p;->a(Lcom/roidapp/cloudlib/instagram/p;)Lcom/roidapp/cloudlib/instagram/r;

    move-result-object v0

    .line 2056
    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    .line 3029
    iget-object v1, p1, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    .line 2056
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 134
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ad;->notifyDataSetChanged()V

    .line 136
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->q:I

    .line 140
    :goto_0
    return-void

    .line 138
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    sget v0, Lcom/roidapp/cloudlib/at;->aZ:I

    :goto_1
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_2
    sget v0, Lcom/roidapp/cloudlib/at;->T:I

    goto :goto_1
.end method

.method public final d()V
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 103
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->r:Z

    if-nez v1, :cond_1

    iget v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->q:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 1125
    :cond_0
    :goto_0
    return-void

    .line 106
    :cond_1
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->r:Z

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->q:I

    if-eq v1, v0, :cond_2

    invoke-static {}, Lcom/roidapp/cloudlib/instagram/r;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 110
    :cond_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 111
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->a(Z)V

    .line 1118
    const/4 v1, 0x0

    .line 1119
    :try_start_0
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->r:Z

    if-eqz v2, :cond_3

    iget v2, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->q:I

    if-ne v2, v0, :cond_3

    .line 1120
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->p:Ljava/lang/String;

    .line 1122
    :cond_3
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/cloudlib/instagram/s;

    iget-object v4, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    iget-boolean v5, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->r:Z

    if-nez v5, :cond_4

    :goto_1
    invoke-direct {v3, p0, v4, v0, v1}, Lcom/roidapp/cloudlib/instagram/s;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;Landroid/os/Handler;ZLjava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 90
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->q:I

    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/instagram/p;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/p;->b()V

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 95
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/instagram/p;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/instagram/p;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 96
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->c:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 98
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d()V

    .line 99
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 152
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/t;->onCreate(Landroid/os/Bundle;)V

    .line 153
    new-instance v0, Lcom/roidapp/cloudlib/instagram/p;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/instagram/p;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 154
    new-instance v0, Lcom/roidapp/cloudlib/instagram/q;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/roidapp/cloudlib/instagram/q;-><init>(Landroid/content/Context;Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    .line 155
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->a(Lcom/roidapp/cloudlib/ah;)V

    .line 156
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v3, 0x1

    .line 160
    sget v0, Lcom/roidapp/cloudlib/as;->K:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 161
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->a(Landroid/view/View;)V

    .line 162
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->b(Landroid/view/View;)V

    .line 163
    sget v0, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->s:Landroid/widget/RelativeLayout;

    .line 164
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->f(Landroid/content/Context;)I

    move-result v0

    if-ne v0, v3, :cond_0

    .line 165
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 167
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/cloudlib/common/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 168
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->r:Z

    .line 169
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "https://api.instagram.com/v1/users/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/media/recent/?access_token="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->p:Ljava/lang/String;

    .line 172
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 173
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->t:Landroid/content/DialogInterface$OnClickListener;

    new-instance v3, Lcom/roidapp/cloudlib/instagram/o;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/instagram/o;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;)V

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    move-object v0, v1

    .line 185
    :goto_0
    return-object v0

    .line 184
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d()V

    move-object v0, v1

    .line 185
    goto :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 190
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->c:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 191
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/instagram/p;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/p;->b()V

    .line 192
    iput-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 193
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onDestroy()V

    .line 194
    return-void
.end method
