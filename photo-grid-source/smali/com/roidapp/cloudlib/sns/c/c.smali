.class public final Lcom/roidapp/cloudlib/sns/c/c;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;


# instance fields
.field private a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

.field private b:Landroid/widget/ListView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/view/View;

.field private e:Lcom/roidapp/cloudlib/sns/login/a;

.field private f:Lcom/roidapp/cloudlib/sns/c/e;

.field private g:I

.field private h:I

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 229
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/c/c;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/c/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 213
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    .line 220
    :goto_0
    return-void

    .line 214
    :cond_0
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/c/c;->j:Ljava/lang/String;

    .line 215
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/c/c;)Z
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/c/c;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/c/c;)V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 189
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    if-nez v0, :cond_0

    .line 204
    :goto_0
    return-void

    .line 192
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 193
    new-instance v0, Lcom/roidapp/cloudlib/sns/c/e;

    invoke-direct {v0, p0, v4}, Lcom/roidapp/cloudlib/sns/c/e;-><init>(Lcom/roidapp/cloudlib/sns/c/c;B)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->f:Lcom/roidapp/cloudlib/sns/c/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/q;->c(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 199
    :goto_1
    if-eqz p1, :cond_1

    .line 200
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 202
    :cond_1
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/c/c;->c(Z)V

    .line 203
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 195
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 196
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/login/a;->a(J)V

    .line 197
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v0, Lcom/roidapp/cloudlib/sns/c/e;

    invoke-direct {v0, p0, v4}, Lcom/roidapp/cloudlib/sns/c/e;-><init>(Lcom/roidapp/cloudlib/sns/c/c;B)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->f:Lcom/roidapp/cloudlib/sns/c/e;

    invoke-static {v1, v2, v3, v4, v0}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JZLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_1
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    return-object v0
.end method

.method private c(Z)V
    .locals 1

    .prologue
    .line 207
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/c/c;->i:Z

    .line 208
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    if-eqz v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 210
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/c/c;)V
    .locals 2

    .prologue
    .line 40
    .line 1183
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1184
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 40
    :cond_0
    return-void

    .line 1184
    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/c/c;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/c/c;)Z
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->k:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/c/c;)Landroid/view/View;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/c/c;)Z
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/c/c;->z()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .prologue
    .line 116
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 117
    sget v1, Lcom/roidapp/cloudlib/at;->B:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(I)V

    .line 118
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/c/c;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 119
    return-object v0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 224
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    .line 227
    :cond_0
    return-void
.end method

.method protected final a(Z)V
    .locals 3

    .prologue
    .line 127
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/c/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS/PopularUserPage"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 128
    const-string v0, "PopularUserPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 129
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 133
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->b()V

    .line 134
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    const-string v0, "PopularUserPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;)V

    .line 1147
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->getCount()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 139
    :goto_0
    if-eq v0, v1, :cond_1

    .line 140
    const-string v1, "PopularUserPage"

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;I)V

    .line 143
    :cond_1
    const-string v0, "PopularUserPage"

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/c/c;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 144
    return-void

    .line 1150
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 57
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 58
    new-instance v0, Lcom/roidapp/cloudlib/sns/login/a;

    const-string v1, "Explore_Leaderboard_Page"

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/sns/login/a;-><init>(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->b()V

    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    const-string v1, "PopularUser"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/c/c;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    .line 62
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/sns/c/c;->b(Z)V

    .line 63
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 68
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    const-string v1, "Explore_Leaderboard_Page"

    invoke-virtual {v0, v1, v5}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 70
    sget v0, Lcom/roidapp/cloudlib/as;->V:I

    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 72
    sget v0, Lcom/roidapp/cloudlib/ar;->cm:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {p0, v0, v4, v4}, Lcom/roidapp/cloudlib/sns/c/c;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    sget v2, Lcom/roidapp/cloudlib/ar;->dp:I

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    .line 75
    sget v0, Lcom/roidapp/cloudlib/ar;->v:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    .line 76
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/c/c;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v2}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/c/c;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/widget/AbsListView;Landroid/view/View;Ljava/lang/Object;)V

    .line 78
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/c/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->g:I

    .line 79
    iget v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->g:I

    int-to-float v0, v0

    const/high16 v2, 0x3ea00000    # 0.3125f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->h:I

    .line 80
    sget v0, Lcom/roidapp/cloudlib/as;->W:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/c/c;->g:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/c/c;->h:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 84
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 86
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->i:Z

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v5}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 92
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 94
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->j:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/c/c;->a(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 98
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->k:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    new-instance v2, Lcom/roidapp/cloudlib/sns/c/d;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/c/d;-><init>(Lcom/roidapp/cloudlib/sns/c/c;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    return-object v1
.end method

.method public final onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 163
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->a()V

    .line 165
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/c/c;->e:Lcom/roidapp/cloudlib/sns/login/a;

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->f:Lcom/roidapp/cloudlib/sns/c/e;

    if-eqz v0, :cond_1

    .line 168
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/c/c;->f:Lcom/roidapp/cloudlib/sns/c/e;

    .line 169
    :cond_1
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroy()V

    .line 170
    return-void
.end method

.method public final onDestroyView()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 155
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroyView()V

    .line 156
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 157
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->b:Landroid/widget/ListView;

    .line 158
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->c:Landroid/widget/ImageView;

    .line 159
    return-void
.end method

.method public final onRefresh()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 174
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->i:Z

    if-nez v0, :cond_1

    .line 175
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 176
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/c/c;->k:Z

    .line 178
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/c/c;->b(Z)V

    .line 180
    :cond_1
    return-void
.end method
