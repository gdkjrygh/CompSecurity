.class public Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;
.super Lcom/roidapp/cloudlib/t;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$Callback;


# instance fields
.field private o:Landroid/widget/RelativeLayout;

.field private p:Z

.field private q:I

.field private r:I

.field private s:Lcom/facebook/GraphRequest;

.field private t:Lcom/facebook/GraphRequestAsyncTask;

.field private u:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/roidapp/cloudlib/t;-><init>()V

    .line 65
    new-instance v0, Lcom/roidapp/cloudlib/facebook/ag;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/ag;-><init>(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->u:Landroid/content/DialogInterface$OnClickListener;

    .line 307
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 121
    if-eqz p1, :cond_0

    .line 122
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 126
    :goto_0
    return-void

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;)Z
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->j()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;Z)Z
    .locals 0

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->p:Z

    return p1
.end method

.method private b(Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 250
    if-nez p1, :cond_0

    .line 258
    :goto_0
    return-void

    .line 252
    :cond_0
    const-string v0, "FbPhotoFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 253
    sget v0, Lcom/roidapp/cloudlib/at;->T:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method private i()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 48
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->s:Lcom/facebook/GraphRequest;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->s:Lcom/facebook/GraphRequest;

    invoke-virtual {v0, v2}, Lcom/facebook/GraphRequest;->setCallback(Lcom/facebook/GraphRequest$Callback;)V

    .line 50
    iput-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->s:Lcom/facebook/GraphRequest;

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->t:Lcom/facebook/GraphRequestAsyncTask;

    if-eqz v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->t:Lcom/facebook/GraphRequestAsyncTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequestAsyncTask;->cancel(Z)Z

    .line 54
    iput-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->t:Lcom/facebook/GraphRequestAsyncTask;

    .line 56
    :cond_1
    return-void
.end method

.method private j()Z
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final a()Landroid/widget/AbsListView$OnScrollListener;
    .locals 1

    .prologue
    .line 133
    new-instance v0, Lcom/roidapp/cloudlib/facebook/ai;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/ai;-><init>(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;)V

    return-object v0
.end method

.method public final d()V
    .locals 5

    .prologue
    .line 165
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    :cond_0
    :goto_0
    return-void

    .line 169
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/common/a;->a()Lcom/roidapp/cloudlib/common/b;

    move-result-object v0

    .line 171
    iget-object v1, v0, Lcom/roidapp/cloudlib/common/b;->a:Ljava/lang/String;

    .line 172
    iget v0, v0, Lcom/roidapp/cloudlib/common/b;->b:I

    .line 174
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->p:Z

    if-eqz v2, :cond_3

    .line 175
    iget v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    if-ge v2, v0, :cond_0

    .line 186
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onLoadPhotoMore, albumid="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",begin="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",end="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",photoCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Z)V

    .line 192
    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 193
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->i()V

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/photos"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 195
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 196
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->p:Z

    if-eqz v0, :cond_4

    .line 197
    const-string v0, "offset"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string v0, "limit"

    const-string v1, "100"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    :goto_1
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-static {v0, v2, p0}, Lcom/facebook/GraphRequest;->newGraphPathRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->s:Lcom/facebook/GraphRequest;

    .line 212
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->s:Lcom/facebook/GraphRequest;

    invoke-virtual {v0, v3}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 213
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->s:Lcom/facebook/GraphRequest;

    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->t:Lcom/facebook/GraphRequestAsyncTask;

    goto/16 :goto_0

    .line 180
    :cond_3
    iget v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    if-gtz v2, :cond_2

    goto/16 :goto_0

    .line 200
    :cond_4
    const/16 v1, 0x64

    .line 201
    iget v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    add-int/lit8 v0, v0, -0x64

    .line 202
    if-gez v0, :cond_5

    .line 203
    const/4 v0, 0x0

    .line 204
    iget v1, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    add-int/lit8 v1, v1, 0x0

    .line 206
    :cond_5
    const-string v4, "offset"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string v0, "limit"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 108
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    :goto_0
    return-void

    .line 111
    :cond_0
    const-string v0, "FbPhotoFragment"

    const-string v1, "refreshPhotos."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    new-instance v0, Lcom/roidapp/cloudlib/facebook/aj;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/facebook/aj;-><init>(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->c:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 114
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->n(Landroid/content/Context;)V

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->p:Z

    .line 117
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d()V

    goto :goto_0
.end method

.method public final h()V
    .locals 4

    .prologue
    .line 218
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Z)V

    .line 219
    const-string v0, "FbPhotoFragment"

    const-string v1, "doBack"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    invoke-static {}, Lcom/roidapp/cloudlib/common/a;->a()Lcom/roidapp/cloudlib/common/b;

    move-result-object v0

    .line 221
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const-class v3, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 222
    const-string v2, "user_id"

    iget-object v3, v0, Lcom/roidapp/cloudlib/common/b;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 223
    const-string v2, "user_name"

    iget-object v0, v0, Lcom/roidapp/cloudlib/common/b;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 224
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->startActivity(Landroid/content/Intent;)V

    .line 225
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 226
    invoke-static {}, Lcom/roidapp/cloudlib/common/a;->b()V

    .line 227
    return-void
.end method

.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 3

    .prologue
    .line 262
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 299
    :cond_0
    :goto_0
    return-void

    .line 268
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Z)V

    .line 270
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    .line 271
    if-eqz v0, :cond_2

    .line 272
    invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->b(Ljava/lang/Exception;)V

    goto :goto_0

    .line 276
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 277
    if-eqz v0, :cond_0

    .line 278
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 280
    :try_start_0
    new-instance v1, Lcom/roidapp/cloudlib/facebook/w;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/facebook/w;-><init>()V

    .line 281
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/facebook/w;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 283
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->p:Z

    if-eqz v0, :cond_4

    .line 284
    iget v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    .line 288
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_3

    .line 289
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/facebook/aj;

    iget-boolean v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->p:Z

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/facebook/aj;->a(Ljava/util/List;Z)V

    .line 292
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Load photo, begin="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ",end="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ",get size="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 294
    :catch_0
    move-exception v0

    .line 296
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->b(Ljava/lang/Exception;)V

    goto :goto_0

    .line 286
    :cond_4
    :try_start_1
    iget v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 60
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/t;->onCreate(Landroid/os/Bundle;)V

    .line 61
    new-instance v0, Lcom/roidapp/cloudlib/ah;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/ah;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Lcom/roidapp/cloudlib/ah;)V

    .line 62
    new-instance v0, Lcom/roidapp/cloudlib/facebook/aj;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/facebook/aj;-><init>(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 63
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 75
    sget v0, Lcom/roidapp/cloudlib/as;->p:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 77
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Landroid/view/View;)V

    .line 78
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->b(Landroid/view/View;)V

    .line 79
    sget v0, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->o:Landroid/widget/RelativeLayout;

    .line 80
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->m(Landroid/content/Context;)I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    mul-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->r:I

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->q:I

    .line 82
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->p:Z

    .line 84
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d()V

    move-object v0, v1

    .line 97
    :goto_0
    return-object v0

    .line 86
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->u:Landroid/content/DialogInterface$OnClickListener;

    new-instance v3, Lcom/roidapp/cloudlib/facebook/ah;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/facebook/ah;-><init>(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;)V

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    move-object v0, v1

    .line 95
    goto :goto_0
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 231
    const-string v0, "FbPhotoFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onDestroy. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onDestroy()V

    .line 233
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->i()V

    .line 234
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 235
    return-void
.end method

.method public onPause()V
    .locals 3

    .prologue
    .line 245
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onPause()V

    .line 246
    const-string v0, "FbPhotoFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPause, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 247
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 239
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onResume()V

    .line 240
    const-string v0, "FbPhotoFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onResume, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    return-void
.end method
