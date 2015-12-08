.class public final Lcom/roidapp/photogrid/social/d;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Lcom/roidapp/cloudlib/sns/g/c;


# instance fields
.field private a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

.field private b:Landroid/widget/ListView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/view/View;

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private i:Landroid/widget/TextView;

.field private j:Lcom/roidapp/cloudlib/sns/login/a;

.field private k:I

.field private l:Lcom/roidapp/cloudlib/sns/b/a/d;

.field private m:J

.field private n:Z

.field private o:Z

.field private p:Lcom/facebook/GraphRequest;

.field private q:Lcom/facebook/GraphRequest;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lcom/roidapp/cloudlib/sns/o;

.field private t:Z

.field private u:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 244
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/social/d;Lcom/roidapp/cloudlib/sns/b/a/d;)Lcom/roidapp/cloudlib/sns/b/a/d;
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    return-object p1
.end method

.method public static a(I)Lcom/roidapp/photogrid/social/d;
    .locals 3

    .prologue
    .line 80
    new-instance v0, Lcom/roidapp/photogrid/social/d;

    invoke-direct {v0}, Lcom/roidapp/photogrid/social/d;-><init>()V

    .line 81
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 82
    const-string v2, "page_type"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 83
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/social/d;->setArguments(Landroid/os/Bundle;)V

    .line 84
    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/social/d;Lcom/facebook/GraphResponse;)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 60
    .line 3436
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3437
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getRequest()Lcom/facebook/GraphRequest;

    move-result-object v0

    .line 3438
    iget-object v4, p0, Lcom/roidapp/photogrid/social/d;->p:Lcom/facebook/GraphRequest;

    if-ne v0, v4, :cond_1

    .line 3441
    iput-object v1, p0, Lcom/roidapp/photogrid/social/d;->p:Lcom/facebook/GraphRequest;

    .line 3443
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    .line 3444
    if-nez v0, :cond_2

    move-object v0, v1

    .line 3445
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_0

    if-nez v0, :cond_0

    .line 3446
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v4, "GraphObjectPagingLoader received neither a result nor an error."

    invoke-direct {v0, v4}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 3449
    :cond_0
    if-eqz v0, :cond_3

    .line 3450
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->d()V

    .line 3481
    :cond_1
    :goto_1
    return-void

    .line 3444
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v0

    goto :goto_0

    .line 3459
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    const-string v4, "data"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 3461
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 3462
    if-lez v5, :cond_4

    move v0, v3

    .line 3464
    :goto_2
    if-eqz v0, :cond_7

    .line 3465
    sget-object v0, Lcom/facebook/GraphResponse$PagingDirection;->NEXT:Lcom/facebook/GraphResponse$PagingDirection;

    invoke-virtual {p1, v0}, Lcom/facebook/GraphResponse;->getRequestForPagedResults(Lcom/facebook/GraphResponse$PagingDirection;)Lcom/facebook/GraphRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->q:Lcom/facebook/GraphRequest;

    .line 3467
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->r:Ljava/util/List;

    if-nez v0, :cond_5

    .line 3468
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->r:Ljava/util/List;

    :goto_3
    move v0, v2

    .line 3473
    :goto_4
    if-ge v0, v5, :cond_6

    .line 3474
    :try_start_0
    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 3475
    iget-object v2, p0, Lcom/roidapp/photogrid/social/d;->r:Ljava/util/List;

    const-string v3, "id"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3473
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    move v0, v2

    .line 3462
    goto :goto_2

    .line 3470
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_3

    .line 3477
    :cond_6
    :try_start_1
    const-string v0, ","

    iget-object v1, p0, Lcom/roidapp/photogrid/social/d;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3500
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 3501
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    .line 3502
    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-wide v2, p0, Lcom/roidapp/photogrid/social/d;->m:J

    new-instance v4, Lcom/roidapp/photogrid/social/g;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/roidapp/photogrid/social/g;-><init>(Lcom/roidapp/photogrid/social/d;B)V

    invoke-static {v1, v2, v3, v0, v4}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->s:Lcom/roidapp/cloudlib/sns/o;

    .line 3503
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->s:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 3479
    :catch_0
    move-exception v0

    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->d()V

    goto/16 :goto_1

    .line 3482
    :cond_7
    iput-object v1, p0, Lcom/roidapp/photogrid/social/d;->q:Lcom/facebook/GraphRequest;

    .line 4332
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4335
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->a()V

    .line 4336
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_1

    .line 4337
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 4338
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    const v1, 0x7f07035c

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-virtual {p0, v1, v3}, Lcom/roidapp/photogrid/social/d;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4339
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4345
    :cond_8
    :goto_5
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/util/List;)V

    .line 4346
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    goto/16 :goto_1

    .line 4341
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_8

    .line 4342
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5
.end method

.method static synthetic b(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/login/a;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    return-object v0
.end method

.method private b()V
    .locals 6

    .prologue
    const/16 v1, 0x8

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 199
    iput-boolean v5, p0, Lcom/roidapp/photogrid/social/d;->o:Z

    .line 200
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    if-nez v0, :cond_1

    .line 227
    :cond_0
    :goto_0
    return-void

    .line 203
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_2

    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 206
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 207
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 208
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iput-wide v2, p0, Lcom/roidapp/photogrid/social/d;->m:J

    .line 209
    iget-object v1, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    iget-wide v2, p0, Lcom/roidapp/photogrid/social/d;->m:J

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/login/a;->a(J)V

    .line 210
    iget v1, p0, Lcom/roidapp/photogrid/social/d;->k:I

    if-ne v1, v4, :cond_3

    .line 211
    iget-object v1, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 212
    iput-boolean v4, p0, Lcom/roidapp/photogrid/social/d;->u:Z

    .line 213
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v0, Lcom/roidapp/photogrid/social/g;

    invoke-direct {v0, p0, v5}, Lcom/roidapp/photogrid/social/g;-><init>(Lcom/roidapp/photogrid/social/d;B)V

    invoke-static {v1, v2, v3, v4, v0}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JZLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 214
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 216
    :cond_3
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 218
    iput-boolean v4, p0, Lcom/roidapp/photogrid/social/d;->u:Z

    .line 219
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->e()V

    goto :goto_0

    .line 2232
    :cond_4
    iput-boolean v4, p0, Lcom/roidapp/photogrid/social/d;->n:Z

    .line 2233
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2234
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->g:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 226
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/social/d;)I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/roidapp/photogrid/social/d;->k:I

    return v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 320
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->o:Z

    .line 322
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->d:Landroid/widget/TextView;

    const v1, 0x7f07006b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 326
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 329
    :cond_0
    return-void

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->d:Landroid/widget/TextView;

    const v1, 0x7f0700db

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    return-object v0
.end method

.method private d()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 350
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 360
    :goto_0
    return-void

    .line 353
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->a()V

    .line 354
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 355
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    const v1, 0x7f07035c

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/photogrid/social/d;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 356
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 358
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->c()V

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method private e()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 2418
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 2419
    const-string v1, "me/friends"

    invoke-static {v0, v1, v7}, Lcom/facebook/GraphRequest;->newGraphPathRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v0

    .line 2422
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2423
    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "id"

    aput-object v3, v2, v5

    .line 2426
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 2428
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->getParameters()Landroid/os/Bundle;

    move-result-object v2

    .line 2429
    const-string v3, "fields"

    const-string v4, ","

    invoke-static {v4, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2430
    invoke-virtual {v0, v2}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 391
    new-instance v1, Lcom/roidapp/photogrid/social/e;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/social/e;-><init>(Lcom/roidapp/photogrid/social/d;)V

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequest;->setCallback(Lcom/facebook/GraphRequest$Callback;)V

    .line 397
    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->p:Lcom/facebook/GraphRequest;

    .line 398
    iput-object v7, p0, Lcom/roidapp/photogrid/social/d;->q:Lcom/facebook/GraphRequest;

    .line 399
    new-instance v1, Lcom/facebook/GraphRequestBatch;

    new-array v2, v6, [Lcom/facebook/GraphRequest;

    aput-object v0, v2, v5

    invoke-direct {v1, v2}, Lcom/facebook/GraphRequestBatch;-><init>([Lcom/facebook/GraphRequest;)V

    .line 400
    invoke-static {v1}, Lcom/facebook/GraphRequest;->executeBatchAsync(Lcom/facebook/GraphRequestBatch;)Lcom/facebook/GraphRequestAsyncTask;

    .line 401
    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->e:Landroid/view/View;

    return-object v0
.end method

.method private declared-synchronized f()V
    .locals 4

    .prologue
    .line 521
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 522
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->q:Lcom/facebook/GraphRequest;

    if-eqz v0, :cond_0

    .line 523
    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->u:Z

    if-nez v0, :cond_0

    .line 524
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->u:Z

    .line 525
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 526
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 3404
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->q:Lcom/facebook/GraphRequest;

    if-eqz v0, :cond_0

    .line 3405
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->q:Lcom/facebook/GraphRequest;

    new-instance v1, Lcom/roidapp/photogrid/social/f;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/social/f;-><init>(Lcom/roidapp/photogrid/social/d;)V

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequest;->setCallback(Lcom/facebook/GraphRequest$Callback;)V

    .line 3411
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->q:Lcom/facebook/GraphRequest;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->p:Lcom/facebook/GraphRequest;

    .line 3412
    new-instance v0, Lcom/facebook/GraphRequestBatch;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/facebook/GraphRequest;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/social/d;->p:Lcom/facebook/GraphRequest;

    aput-object v3, v1, v2

    invoke-direct {v0, v1}, Lcom/facebook/GraphRequestBatch;-><init>([Lcom/facebook/GraphRequest;)V

    .line 3413
    invoke-static {v0}, Lcom/facebook/GraphRequest;->executeBatchAsync(Lcom/facebook/GraphRequestBatch;)Lcom/facebook/GraphRequestAsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 536
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 531
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 532
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 534
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0700c4

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 521
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/social/d;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->c()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 239
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 240
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 241
    iput-boolean v1, p0, Lcom/roidapp/photogrid/social/d;->u:Z

    .line 242
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 382
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    .line 385
    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    .line 142
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    if-nez v0, :cond_0

    .line 144
    new-instance v1, Lcom/roidapp/cloudlib/sns/login/a;

    iget-object v3, p0, Lcom/roidapp/photogrid/social/d;->l:Lcom/roidapp/cloudlib/sns/b/a/d;

    iget-wide v4, p0, Lcom/roidapp/photogrid/social/d;->m:J

    const/4 v6, 0x1

    const-string v7, "SuggestFriend"

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/login/a;-><init>(Landroid/support/v4/app/Fragment;Ljava/util/List;JZLjava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 147
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->b()V

    .line 148
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x4

    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d0073

    if-ne v0, v1, :cond_1

    .line 176
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/q;->a(Landroid/app/Activity;)V

    .line 194
    :cond_0
    :goto_0
    return-void

    .line 177
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d0074

    if-ne v0, v1, :cond_2

    .line 178
    new-instance v0, Lcom/roidapp/photogrid/common/o;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/o;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->a()V

    goto :goto_0

    .line 179
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d0077

    if-ne v0, v1, :cond_3

    .line 180
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 181
    const-string v1, "page_name"

    const-string v2, "suggest_fb_friends"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    const-string v1, "need_load_user_info"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 183
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/16 v2, 0x33d7

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 184
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d0070

    if-ne v0, v1, :cond_0

    .line 185
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v2, :cond_4

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 189
    :cond_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->b()V

    goto :goto_0

    .line 191
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 89
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 90
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 91
    const-string v1, "page_type"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/social/d;->k:I

    .line 92
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    invoke-virtual {v0, v1, p0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/g/e;Lcom/roidapp/cloudlib/sns/g/c;)V

    .line 93
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/high16 v9, 0x40000000    # 2.0f

    const v8, 0x7f090009

    const/16 v7, 0x8

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 98
    const v0, 0x7f030011

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 99
    const v0, 0x7f0d006e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 100
    const v0, 0x7f0d006f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->b:Landroid/widget/ListView;

    .line 101
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 1371
    if-eqz v0, :cond_0

    .line 1372
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090167

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    .line 1373
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0900dd

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    int-to-float v3, v3

    div-float v4, v2, v9

    sub-float/2addr v3, v4

    float-to-int v3, v3

    .line 1374
    int-to-float v4, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    .line 1375
    invoke-virtual {v0, v3, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(II)V

    .line 1376
    const/4 v2, 0x4

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a([I)V

    .line 102
    :cond_0
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    .line 103
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 104
    iget-object v2, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    invoke-virtual {v0, v5, v2, v5, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 106
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v5, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 107
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-static {v6}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x106000b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0025

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 112
    iget v0, p0, Lcom/roidapp/photogrid/social/d;->k:I

    if-ne v0, v6, :cond_1

    .line 113
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    const v2, 0x7f070373

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 117
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->b:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 120
    const v0, 0x7f0d0070

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    .line 121
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    const v0, 0x7f0d0071

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->d:Landroid/widget/TextView;

    .line 124
    const v0, 0x7f0d0072

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->e:Landroid/view/View;

    .line 125
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->e:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 126
    const v0, 0x7f0d0075

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->g:Landroid/view/View;

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->g:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 128
    const v0, 0x7f0d0077

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->h:Landroid/view/View;

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->h:Landroid/view/View;

    const v2, -0xc5a86a

    const v3, -0xd5bd89

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v4, v9}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v4

    invoke-static {v2, v3, v4}, Lcom/roidapp/baselib/c/n;->a(III)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->h:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    const v0, 0x7f0d0078

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/d;->i:Landroid/widget/TextView;

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->i:Landroid/widget/TextView;

    const v2, 0x7f02038a

    invoke-static {v0, v2, v5, v5}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 133
    const v0, 0x7f0d0073

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    const v0, 0x7f0d0074

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->b:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 137
    return-object v1

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    const v2, 0x7f07035c

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/roidapp/photogrid/social/d;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1376
    :array_0
    .array-data 4
        -0xff8000
        -0x10000
        -0x5b00
        -0x100
    .end array-data
.end method

.method public final onDestroy()V
    .locals 1

    .prologue
    .line 364
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 365
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->j:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->a()V

    .line 368
    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x1

    const/4 v1, 0x4

    .line 152
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 153
    iget v0, p0, Lcom/roidapp/photogrid/social/d;->k:I

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->n:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v3, :cond_0

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->g:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 158
    iput-boolean v2, p0, Lcom/roidapp/photogrid/social/d;->u:Z

    .line 159
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 160
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 162
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->e()V

    .line 171
    :cond_2
    :goto_0
    return-void

    .line 163
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 164
    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->o:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_4

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/social/d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 168
    :cond_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->b()V

    goto :goto_0
.end method

.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 517
    add-int v0, p2, p3

    if-ne p4, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->t:Z

    .line 518
    return-void

    .line 517
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 510
    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->t:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/d;->u:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    .line 511
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/d;->f()V

    .line 513
    :cond_0
    return-void
.end method
