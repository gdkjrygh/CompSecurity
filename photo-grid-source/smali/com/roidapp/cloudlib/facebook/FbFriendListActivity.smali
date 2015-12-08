.class public Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/facebook/GraphRequest$Callback;
.implements Lcom/roidapp/cloudlib/ai;


# instance fields
.field protected a:Lcom/roidapp/cloudlib/ah;

.field protected b:Landroid/widget/ProgressBar;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/FbFriend;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/widget/ListView;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageButton;

.field private h:Lcom/facebook/GraphRequestAsyncTask;

.field private i:Lcom/facebook/GraphRequest;

.field private j:Ljava/lang/String;

.field private k:Landroid/widget/ImageView;

.field private l:Lcom/roidapp/cloudlib/ads/l;

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/bumptech/glide/g/c;",
            ">;"
        }
    .end annotation
.end field

.field private n:Landroid/widget/AdapterView$OnItemClickListener;

.field private o:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->m:Ljava/util/List;

    .line 218
    new-instance v0, Lcom/roidapp/cloudlib/facebook/r;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/r;-><init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->n:Landroid/widget/AdapterView$OnItemClickListener;

    .line 235
    new-instance v0, Lcom/roidapp/cloudlib/facebook/s;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/s;-><init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->o:Landroid/content/DialogInterface$OnClickListener;

    .line 386
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->k:Landroid/widget/ImageView;

    return-object v0
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 290
    if-eqz p1, :cond_0

    .line 291
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->j:Ljava/lang/String;

    .line 292
    :cond_0
    const-string v0, "FbFriendListActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "get friend list failed, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->showDialog(I)V

    .line 294
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 301
    if-eqz p1, :cond_0

    .line 302
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->e:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 306
    :goto_0
    return-void

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->c:Ljava/util/List;

    return-object v0
.end method

.method private b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 80
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->i:Lcom/facebook/GraphRequest;

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->i:Lcom/facebook/GraphRequest;

    invoke-virtual {v0, v2}, Lcom/facebook/GraphRequest;->setCallback(Lcom/facebook/GraphRequest$Callback;)V

    .line 82
    iput-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->i:Lcom/facebook/GraphRequest;

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    if-eqz v0, :cond_1

    .line 85
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequestAsyncTask;->cancel(Z)Z

    .line 86
    iput-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    .line 88
    :cond_1
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 244
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->b()V

    .line 245
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 247
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Z)V

    .line 249
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    const-string v1, "me/friends"

    invoke-static {v0, v1, p0}, Lcom/facebook/GraphRequest;->newGraphPathRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->i:Lcom/facebook/GraphRequest;

    .line 251
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->i:Lcom/facebook/GraphRequest;

    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    .line 255
    :goto_0
    return-void

    .line 253
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->o:Landroid/content/DialogInterface$OnClickListener;

    invoke-static {p0, v0}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d()V

    return-void
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->m:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 309
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a()V

    .line 310
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 311
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->startActivity(Landroid/content/Intent;)V

    .line 312
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->finish()V

    .line 313
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->d()V

    .line 333
    :cond_0
    return-void
.end method

.method public final a(Landroid/os/Message;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x0

    .line 169
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2120

    if-ne v0, v1, :cond_1

    .line 170
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 178
    :cond_0
    :goto_0
    return-void

    .line 172
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2121

    if-ne v0, v1, :cond_0

    .line 173
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->bU:I

    if-ne v0, v1, :cond_1

    .line 1316
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1318
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->c()V

    .line 163
    :cond_0
    :goto_0
    return-void

    .line 159
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cH:I

    if-ne v0, v1, :cond_0

    .line 160
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d()V

    goto :goto_0
.end method

.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 4

    .prologue
    .line 259
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    .line 287
    :cond_0
    :goto_0
    return-void

    .line 264
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Z)V

    .line 266
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    .line 267
    if-eqz v0, :cond_2

    .line 268
    invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 272
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 273
    if-eqz v0, :cond_0

    .line 275
    :try_start_0
    new-instance v1, Lcom/roidapp/cloudlib/facebook/w;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/facebook/w;-><init>()V

    .line 276
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->a()Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/facebook/w;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 277
    if-nez v0, :cond_3

    .line 278
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "FB friend list is null"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 282
    :catch_0
    move-exception v0

    .line 283
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 284
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 4091
    :cond_3
    :try_start_1
    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->c:Ljava/util/List;

    .line 4092
    new-instance v1, Lcom/roidapp/cloudlib/facebook/t;

    invoke-direct {v1, p0, p0, v0}, Lcom/roidapp/cloudlib/facebook/t;-><init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;Landroid/app/Activity;Ljava/util/List;)V

    .line 4094
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "friend count "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4097
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 4099
    sget v0, Lcom/roidapp/cloudlib/ar;->bo:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 4101
    new-instance v2, Lcom/roidapp/cloudlib/facebook/o;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/cloudlib/facebook/o;-><init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;Lcom/roidapp/cloudlib/facebook/t;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 4118
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->k:Landroid/widget/ImageView;

    new-instance v2, Lcom/roidapp/cloudlib/facebook/p;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/cloudlib/facebook/p;-><init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;Landroid/widget/EditText;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 181
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 182
    sget v0, Lcom/roidapp/cloudlib/as;->e:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->setContentView(I)V

    .line 184
    sget v0, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->e:Landroid/widget/RelativeLayout;

    .line 185
    sget v0, Lcom/roidapp/cloudlib/ar;->cH:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->f:Landroid/widget/TextView;

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    sget v0, Lcom/roidapp/cloudlib/ar;->bw:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d:Landroid/widget/ListView;

    .line 191
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->n:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 193
    sget v0, Lcom/roidapp/cloudlib/ar;->bQ:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->b:Landroid/widget/ProgressBar;

    .line 194
    sget v0, Lcom/roidapp/cloudlib/ar;->bU:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->g:Landroid/widget/ImageButton;

    .line 195
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->g:Landroid/widget/ImageButton;

    const/16 v1, 0xa0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 196
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    sget v0, Lcom/roidapp/cloudlib/ar;->bV:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->k:Landroid/widget/ImageView;

    .line 199
    new-instance v0, Lcom/roidapp/cloudlib/ah;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/ah;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a:Lcom/roidapp/cloudlib/ah;

    .line 200
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a:Lcom/roidapp/cloudlib/ah;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/ah;->a(Lcom/roidapp/cloudlib/ai;)V

    .line 202
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/al;->a(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2213
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a()V

    .line 2214
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->startActivity(Landroid/content/Intent;)V

    .line 2215
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->finish()V

    .line 210
    :cond_0
    :goto_0
    return-void

    .line 208
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->c()V

    .line 2322
    sget v0, Lcom/roidapp/cloudlib/ar;->br:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 2323
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    if-nez v1, :cond_2

    .line 2324
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    const-string v2, "cloud_list"

    invoke-virtual {v1, p0, v2}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    .line 2325
    :cond_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v1, :cond_0

    .line 2326
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    const-string v2, "ca-app-pub-7109791911060569/9716033936"

    invoke-interface {v1, p0, v0, v2}, Lcom/roidapp/cloudlib/ads/l;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 128
    packed-switch p1, :pswitch_data_0

    .line 143
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 130
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    sget v0, Lcom/roidapp/cloudlib/at;->h:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/facebook/q;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/facebook/q;-><init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->j:Ljava/lang/String;

    goto :goto_1

    .line 128
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 353
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a()V

    .line 4346
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->c()V

    .line 4347
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    .line 355
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->b()V

    .line 356
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 357
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 148
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 149
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->d()V

    .line 150
    const/4 v0, 0x1

    .line 152
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 361
    .line 5341
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->a()V

    .line 362
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 363
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 367
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 6336
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->l:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->b()V

    .line 369
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 373
    const-string v0, "Facebook/FacebookFriendList"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->c(Ljava/lang/String;)V

    .line 374
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 375
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 378
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 379
    return-void
.end method
