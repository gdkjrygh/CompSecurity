.class public Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/facebook/GraphRequest$Callback;


# instance fields
.field private A:Landroid/content/DialogInterface$OnClickListener;

.field private B:Landroid/widget/AdapterView$OnItemClickListener;

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field protected h:Landroid/widget/ProgressBar;

.field private final i:Ljava/lang/String;

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:Ljava/lang/String;

.field private n:Lcom/facebook/GraphRequest;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/b;",
            ">;"
        }
    .end annotation
.end field

.field private r:Landroid/widget/ListView;

.field private s:Lcom/facebook/GraphRequestAsyncTask;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Landroid/widget/ImageButton;

.field private v:Landroid/widget/ImageButton;

.field private w:Landroid/widget/TextView;

.field private x:I

.field private y:Lcom/roidapp/cloudlib/ads/l;

.field private final z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/bumptech/glide/g/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 59
    const-string v0, "FbAlbumListActivity"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->i:Ljava/lang/String;

    .line 60
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->j:I

    .line 61
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->k:I

    .line 62
    const-string v0, "album_id"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a:Ljava/lang/String;

    .line 63
    const-string v0, "album_name"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->b:Ljava/lang/String;

    .line 64
    const-string v0, "caption"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->c:Ljava/lang/String;

    .line 65
    const-string v0, "purpose"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->d:Ljava/lang/String;

    .line 66
    const-string v0, "user_id"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->e:Ljava/lang/String;

    .line 67
    const-string v0, "user_name"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->f:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->l:I

    .line 69
    const-string v0, "me"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->m:Ljava/lang/String;

    .line 71
    const-string v0, "<friends_albums>"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->g:Ljava/lang/String;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->z:Ljava/util/List;

    .line 350
    new-instance v0, Lcom/roidapp/cloudlib/facebook/e;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/e;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->A:Landroid/content/DialogInterface$OnClickListener;

    .line 563
    new-instance v0, Lcom/roidapp/cloudlib/facebook/j;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/j;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->B:Landroid/widget/AdapterView$OnItemClickListener;

    .line 590
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->z:Ljava/util/List;

    return-object v0
.end method

.method private a(Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 101
    if-nez p1, :cond_0

    .line 118
    :goto_0
    return-void

    .line 102
    :cond_0
    const-string v0, "FbAlbumListActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 105
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "validate certificate"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "time"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 108
    sget v0, Lcom/roidapp/cloudlib/at;->aZ:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1516
    :cond_1
    new-instance v1, Lcom/roidapp/cloudlib/facebook/h;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/facebook/h;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    new-instance v2, Lcom/roidapp/cloudlib/facebook/i;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/facebook/i;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    invoke-static {p0, v0, v1, v2}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 116
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 121
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    .line 123
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->c()V

    .line 124
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 125
    const-string v1, "limit"

    const-string v2, "1000"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v1, "%s/albums"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 127
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v2

    invoke-static {v2, v1, p0}, Lcom/facebook/GraphRequest;->newGraphPathRequest(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$Callback;)Lcom/facebook/GraphRequest;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->n:Lcom/facebook/GraphRequest;

    .line 129
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->n:Lcom/facebook/GraphRequest;

    invoke-virtual {v1, v0}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 131
    new-instance v0, Lcom/facebook/GraphRequestBatch;

    new-array v1, v4, [Lcom/facebook/GraphRequest;

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->n:Lcom/facebook/GraphRequest;

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/facebook/GraphRequestBatch;-><init>([Lcom/facebook/GraphRequest;)V

    .line 132
    const/16 v1, 0x1f40

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequestBatch;->setTimeout(I)V

    .line 134
    invoke-static {v0}, Lcom/facebook/GraphRequest;->executeBatchAsync(Lcom/facebook/GraphRequestBatch;)Lcom/facebook/GraphRequestAsyncTask;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->s:Lcom/facebook/GraphRequestAsyncTask;

    .line 137
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 507
    if-eqz p1, :cond_0

    .line 508
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 512
    :goto_0
    return-void

    .line 510
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->t:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V
    .locals 2

    .prologue
    .line 57
    .line 4494
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4497
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->v:Landroid/widget/ImageButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 4498
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->h:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 57
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 504
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->n:Lcom/facebook/GraphRequest;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->n:Lcom/facebook/GraphRequest;

    invoke-virtual {v0, v2}, Lcom/facebook/GraphRequest;->setCallback(Lcom/facebook/GraphRequest$Callback;)V

    .line 92
    iput-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->n:Lcom/facebook/GraphRequest;

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->s:Lcom/facebook/GraphRequestAsyncTask;

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->s:Lcom/facebook/GraphRequestAsyncTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequestAsyncTask;->cancel(Z)Z

    .line 96
    iput-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->s:Lcom/facebook/GraphRequestAsyncTask;

    .line 98
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V
    .locals 2

    .prologue
    .line 57
    .line 5484
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5487
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 5488
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->h:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 5489
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->v:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 57
    :cond_0
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 224
    :goto_0
    return-void

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->r:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 222
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Z)V

    .line 223
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->d()V

    return-void
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v2, -0x2

    .line 227
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    const-string v1, "me"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    :cond_0
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    .line 229
    sget v0, Lcom/roidapp/cloudlib/at;->ba:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->b(Ljava/lang/String;)V

    .line 238
    :goto_0
    return-void

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->u:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 233
    sget v0, Lcom/roidapp/cloudlib/ar;->bu:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 234
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 235
    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 236
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->x:I

    return v0
.end method


# virtual methods
.method protected final a()V
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->d()V

    .line 252
    :cond_0
    return-void
.end method

.method protected final b()V
    .locals 3

    .prologue
    .line 272
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a()V

    .line 273
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "me"

    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 274
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    .line 280
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->finish()V

    .line 281
    return-void

    .line 276
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 277
    const-string v1, "fromCloud"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 278
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 141
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 143
    packed-switch p1, :pswitch_data_0

    .line 164
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 145
    :pswitch_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 146
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a()V

    .line 147
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 148
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    .line 149
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->finish()V

    goto :goto_0

    .line 151
    :cond_1
    const-string v0, "me"

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Ljava/lang/String;)V

    .line 152
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->e()V

    .line 153
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/al;->a(Landroid/app/Activity;)V

    goto :goto_0

    .line 157
    :pswitch_2
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a()V

    .line 159
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    .line 160
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->finish()V

    goto :goto_0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 285
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->f:I

    if-ne v0, v1, :cond_1

    .line 286
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 292
    :cond_0
    :goto_0
    return-void

    .line 287
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cH:I

    if-ne v0, v1, :cond_2

    .line 288
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->b()V

    goto :goto_0

    .line 289
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->bU:I

    if-ne v0, v1, :cond_0

    .line 290
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->d()V

    goto :goto_0
.end method

.method public onCompleted(Lcom/facebook/GraphResponse;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 296
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    .line 348
    :cond_0
    :goto_0
    return-void

    .line 300
    :cond_1
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Z)V

    .line 302
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v0

    .line 303
    if-eqz v0, :cond_2

    .line 304
    invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Ljava/lang/Exception;)V

    goto :goto_0

    .line 308
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v2

    .line 309
    const-string v0, ""

    .line 310
    if-eqz v2, :cond_3

    .line 311
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 315
    :cond_3
    :try_start_0
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 320
    new-instance v2, Lcom/roidapp/cloudlib/facebook/w;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/facebook/w;-><init>()V

    .line 321
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/cloudlib/facebook/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "album list count = "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 325
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 326
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->a()I

    move-result v0

    if-nez v0, :cond_6

    .line 327
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 328
    add-int/lit8 v0, v1, -0x1

    .line 325
    :goto_2
    add-int/lit8 v1, v0, 0x1

    goto :goto_1

    .line 332
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "album list left count = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    const-string v1, "me"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 335
    new-instance v0, Lcom/roidapp/cloudlib/facebook/b;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/facebook/b;-><init>()V

    .line 336
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/b;->a(Ljava/lang/String;)V

    .line 337
    sget v1, Lcom/roidapp/cloudlib/at;->Q:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/b;->c(Ljava/lang/String;)V

    .line 338
    const-string v1, "<friends_albums>"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/b;->b(Ljava/lang/String;)V

    .line 339
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 342
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->r:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/cloudlib/facebook/k;

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->q:Ljava/util/List;

    invoke-direct {v1, p0, p0, v2}, Lcom/roidapp/cloudlib/facebook/k;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;Landroid/app/Activity;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 344
    :catch_0
    move-exception v0

    .line 346
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Ljava/lang/Exception;)V

    goto/16 :goto_0

    :cond_6
    move v0, v1

    goto :goto_2
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/16 v2, 0xa0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 360
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 361
    sget v0, Lcom/roidapp/cloudlib/as;->d:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->setContentView(I)V

    .line 363
    sget v0, Lcom/roidapp/cloudlib/ar;->bv:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->r:Landroid/widget/ListView;

    .line 364
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->r:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->B:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 366
    sget v0, Lcom/roidapp/cloudlib/ar;->bQ:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->h:Landroid/widget/ProgressBar;

    .line 367
    sget v0, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->t:Landroid/widget/RelativeLayout;

    .line 368
    sget v0, Lcom/roidapp/cloudlib/ar;->f:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->u:Landroid/widget/ImageButton;

    .line 369
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->u:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 370
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->u:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 371
    sget v0, Lcom/roidapp/cloudlib/ar;->cH:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->w:Landroid/widget/TextView;

    .line 372
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->w:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    sget v0, Lcom/roidapp/cloudlib/ar;->bU:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->v:Landroid/widget/ImageButton;

    .line 374
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->v:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 375
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->v:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 377
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->x:I

    .line 378
    invoke-static {}, Lcom/roidapp/cloudlib/common/a;->b()V

    .line 380
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/al;->a(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2434
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a()V

    .line 2435
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    .line 2436
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->finish()V

    .line 431
    :cond_0
    :goto_0
    return-void

    .line 386
    :cond_1
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 387
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 388
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "user_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 389
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "user_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    .line 390
    sget v0, Lcom/roidapp/cloudlib/at;->ba:I

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->b(Ljava/lang/String;)V

    .line 393
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 394
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    .line 395
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Ljava/lang/String;)V

    .line 401
    :goto_1
    invoke-direct {p0, v4}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Z)V

    .line 403
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    const-string v1, "me"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 404
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    .line 405
    sget v0, Lcom/roidapp/cloudlib/at;->ba:I

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->b(Ljava/lang/String;)V

    .line 409
    :cond_3
    const-string v0, "FbAlbumListActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "album, userid["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "],userName["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 428
    :goto_2
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->e()V

    .line 3241
    sget v0, Lcom/roidapp/cloudlib/ar;->br:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 3242
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    if-nez v1, :cond_4

    .line 3243
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    const-string v2, "cloud_list"

    invoke-virtual {v1, p0, v2}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    .line 3244
    :cond_4
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v1, :cond_0

    .line 3245
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    const-string v2, "ca-app-pub-7109791911060569/9716033936"

    invoke-interface {v1, p0, v0, v2}, Lcom/roidapp/cloudlib/ads/l;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 397
    :cond_5
    const-string v0, "me"

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a(Ljava/lang/String;)V

    .line 398
    const-string v0, "me"

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->o:Ljava/lang/String;

    goto :goto_1

    .line 412
    :cond_6
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0, v3}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_2

    .line 416
    :cond_7
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->A:Landroid/content/DialogInterface$OnClickListener;

    new-instance v1, Lcom/roidapp/cloudlib/facebook/f;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/facebook/f;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    invoke-static {p0, v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    goto/16 :goto_0
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 169
    packed-switch p1, :pswitch_data_0

    .line 195
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 171
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 172
    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    new-instance v2, Lcom/roidapp/cloudlib/facebook/c;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/facebook/c;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 184
    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    new-instance v2, Lcom/roidapp/cloudlib/facebook/d;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/facebook/d;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 191
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->aE:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 193
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 169
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 532
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a()V

    .line 3265
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->c()V

    .line 3266
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    .line 534
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->c()V

    .line 535
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 536
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 200
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 201
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->b()V

    .line 202
    const/4 v0, 0x1

    .line 204
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
    .line 546
    .line 4260
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->a()V

    .line 547
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 548
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 540
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 4255
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->y:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->b()V

    .line 542
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 553
    const-string v0, "Facebook/FacebookAlbumList"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->c(Ljava/lang/String;)V

    .line 554
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 555
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 559
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 560
    return-void
.end method
