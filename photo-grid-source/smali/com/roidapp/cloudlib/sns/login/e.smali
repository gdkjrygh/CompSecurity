.class public final Lcom/roidapp/cloudlib/sns/login/e;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Landroid/widget/TextView;

.field private c:Lcom/roidapp/cloudlib/sns/b/x;

.field private d:Lcom/roidapp/cloudlib/sns/b/p;

.field private e:Z

.field private f:Lcom/roidapp/cloudlib/sns/login/a;

.field private g:J

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Lcom/roidapp/cloudlib/sns/b/a/b;

.field private l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 57
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/login/e;Lcom/roidapp/cloudlib/sns/b/a/b;)Lcom/roidapp/cloudlib/sns/b/a/b;
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/login/e;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->i()V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/login/e;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->g()V

    return-void
.end method

.method private g()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 175
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 176
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/login/e;->i:Z

    .line 177
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 181
    :cond_0
    return-void
.end method

.method private declared-synchronized h()V
    .locals 2

    .prologue
    .line 196
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 197
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->getCount()I

    move-result v0

    iget v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->n:I

    if-ne v0, v1, :cond_0

    .line 198
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->i:Z

    if-nez v0, :cond_0

    .line 199
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->i:Z

    .line 200
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 201
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 202
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->p:I

    .line 203
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    .line 204
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->h:Z

    if-eqz v0, :cond_2

    .line 205
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_1

    .line 206
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 208
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->m()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 196
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 211
    :cond_2
    :try_start_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_3

    .line 212
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->n()V

    goto :goto_0

    .line 214
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->o()V

    goto :goto_0

    .line 220
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 221
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 223
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->aq:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method private i()V
    .locals 7

    .prologue
    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-nez v0, :cond_4

    .line 229
    const-wide/16 v4, 0x0

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    .line 233
    :cond_0
    new-instance v1, Lcom/roidapp/cloudlib/sns/login/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_3

    const-string v6, "Following_Page"

    :goto_0
    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/login/a;-><init>(Landroid/support/v4/app/Fragment;Ljava/util/List;JLjava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    .line 234
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 244
    :goto_1
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 245
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->getCount()I

    move-result v0

    if-gtz v0, :cond_6

    .line 246
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->j()V

    .line 251
    :cond_2
    :goto_2
    return-void

    .line 233
    :cond_3
    const-string v6, "Followers_Page"

    goto :goto_0

    .line 236
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    if-eqz v0, :cond_5

    .line 237
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/util/List;)V

    .line 241
    :goto_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    goto :goto_1

    .line 239
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/util/List;)V

    goto :goto_3

    .line 248
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->k()V

    goto :goto_2
.end method

.method private j()V
    .locals 2

    .prologue
    .line 254
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->q:Z

    if-eqz v0, :cond_1

    .line 255
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->b:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->ar:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 259
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 262
    :cond_0
    return-void

    .line 257
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->b:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->Z:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method private k()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 265
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 266
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 268
    :cond_0
    return-void
.end method

.method private l()V
    .locals 8

    .prologue
    .line 271
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/login/e;->g:J

    iget v6, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    new-instance v7, Lcom/roidapp/cloudlib/sns/login/f;

    invoke-direct {v7, p0}, Lcom/roidapp/cloudlib/sns/login/f;-><init>(Lcom/roidapp/cloudlib/sns/login/e;)V

    invoke-static/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 297
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 298
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 299
    return-void
.end method

.method private m()V
    .locals 8

    .prologue
    .line 302
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/login/e;->g:J

    iget v6, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    new-instance v7, Lcom/roidapp/cloudlib/sns/login/g;

    invoke-direct {v7, p0}, Lcom/roidapp/cloudlib/sns/login/g;-><init>(Lcom/roidapp/cloudlib/sns/login/e;)V

    invoke-static/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/q;->c(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 328
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 329
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 330
    return-void
.end method

.method private n()V
    .locals 5

    .prologue
    .line 333
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    new-instance v4, Lcom/roidapp/cloudlib/sns/login/h;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/sns/login/h;-><init>(Lcom/roidapp/cloudlib/sns/login/e;)V

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 371
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 372
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 374
    return-void
.end method

.method private o()V
    .locals 5

    .prologue
    .line 377
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    new-instance v4, Lcom/roidapp/cloudlib/sns/login/i;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/sns/login/i;-><init>(Lcom/roidapp/cloudlib/sns/login/e;)V

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 402
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 403
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 404
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .prologue
    .line 473
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 474
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 475
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v1, :cond_0

    .line 476
    sget v1, Lcom/roidapp/cloudlib/at;->bi:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(I)V

    .line 480
    :goto_0
    return-object v0

    .line 478
    :cond_0
    sget v1, Lcom/roidapp/cloudlib/at;->O:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(I)V

    goto :goto_0
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 123
    iput-wide p1, p0, Lcom/roidapp/cloudlib/sns/login/e;->g:J

    .line 124
    return-void
.end method

.method public final declared-synchronized a(Lcom/roidapp/cloudlib/sns/b/a/b;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 408
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    mul-int/lit8 v0, v0, 0x14

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->n:I

    .line 409
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    if-ne v0, v1, :cond_2

    .line 410
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    .line 411
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->q:Z

    .line 417
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 418
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->i()V

    .line 420
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 421
    monitor-exit p0

    return-void

    .line 413
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 414
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/a/b;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 408
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 517
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    .line 518
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    .line 520
    :cond_0
    return-void
.end method

.method protected final a(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 80
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->a(Z)V

    .line 81
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_0

    .line 82
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    const-string v1, "Following_Page"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 83
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "Following page"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 84
    const-string v0, "Following page"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 90
    :goto_0
    return-void

    .line 86
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    const-string v1, "Followers_Page"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 87
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "Followers page"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 88
    const-string v0, "Followers page"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final b()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 95
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->b()V

    .line 96
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_2

    const-string v0, "Following page"

    .line 97
    :goto_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v1, :cond_1

    .line 98
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/login/a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 99
    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;)V

    .line 1424
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/login/a;->getCount()I

    move-result v1

    if-nez v1, :cond_3

    move v1, v2

    .line 102
    :goto_1
    if-eq v1, v2, :cond_1

    .line 103
    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;I)V

    .line 106
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 109
    return-void

    .line 96
    :cond_2
    const-string v0, "Followers page"

    goto :goto_0

    .line 1427
    :cond_3
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->a:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    goto :goto_1
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 119
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    .line 120
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->h:Z

    .line 128
    return-void
.end method

.method public final declared-synchronized f()V
    .locals 2

    .prologue
    .line 432
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 433
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->q:Z

    .line 434
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 435
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->getCount()I

    move-result v0

    if-gtz v0, :cond_2

    .line 436
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->j()V

    .line 442
    :cond_1
    :goto_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->p:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    .line 443
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->at:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/login/e;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;)V

    .line 445
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 446
    monitor-exit p0

    return-void

    .line 438
    :cond_2
    :try_start_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 432
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 64
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 65
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->j:Z

    .line 66
    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    const/4 v1, 0x0

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/e;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    .line 67
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 71
    sget v0, Lcom/roidapp/cloudlib/as;->D:I

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    .line 1132
    sget v0, Lcom/roidapp/cloudlib/ar;->u:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->b:Landroid/widget/TextView;

    .line 1133
    sget v0, Lcom/roidapp/cloudlib/ar;->aS:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->a:Landroid/widget/ListView;

    .line 1134
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1135
    sget v0, Lcom/roidapp/cloudlib/ar;->cm:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 1136
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {p0, v0, v3, v3}, Lcom/roidapp/cloudlib/sns/login/e;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V

    .line 1137
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 1138
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v1}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v3, v2, p0}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/widget/AbsListView;Landroid/view/View;ZLjava/lang/Object;Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1142
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1143
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    .line 1144
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->c:Lcom/roidapp/cloudlib/sns/b/x;

    .line 1145
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->j:Z

    if-eqz v0, :cond_4

    .line 1146
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/login/e;->j:Z

    .line 1147
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 1149
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->h:Z

    if-eqz v0, :cond_2

    .line 1150
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_1

    .line 1151
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->l()V

    .line 74
    :cond_0
    :goto_0
    return-object v7

    .line 1153
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->m()V

    goto :goto_0

    .line 1156
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_3

    .line 1157
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->n()V

    goto :goto_0

    .line 1159
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->o()V

    goto :goto_0

    .line 1163
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-nez v0, :cond_5

    .line 1164
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_5

    .line 1165
    new-instance v1, Lcom/roidapp/cloudlib/sns/login/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/login/e;->k:Lcom/roidapp/cloudlib/sns/b/a/b;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->d:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_6

    const-string v6, "Following_Page"

    :goto_1
    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/login/a;-><init>(Landroid/support/v4/app/Fragment;Ljava/util/List;JLjava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    .line 1168
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1169
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->i()V

    goto :goto_0

    .line 1165
    :cond_6
    const-string v6, "Followers_Page"

    goto :goto_1
.end method

.method public final onDestroy()V
    .locals 1

    .prologue
    .line 112
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroy()V

    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->f:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->a()V

    .line 116
    :cond_0
    return-void
.end method

.method public final declared-synchronized onRefresh()V
    .locals 2

    .prologue
    .line 485
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 486
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->i:Z

    if-nez v0, :cond_0

    .line 487
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->i:Z

    .line 489
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 490
    iget v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->p:I

    .line 491
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->o:I

    .line 492
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->h:Z

    if-eqz v0, :cond_2

    .line 493
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_1

    .line 494
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 512
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 496
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->m()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 485
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 499
    :cond_2
    :try_start_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->e:Z

    if-eqz v0, :cond_3

    .line 500
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->n()V

    goto :goto_0

    .line 502
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->o()V

    goto :goto_0

    .line 507
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 508
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->l:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 510
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->aq:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 192
    add-int v0, p2, p3

    if-ne p4, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->m:Z

    .line 193
    return-void

    .line 192
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 185
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/e;->i:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    .line 186
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/e;->h()V

    .line 188
    :cond_0
    return-void
.end method
