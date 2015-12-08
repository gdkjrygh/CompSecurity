.class public Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;
.super Lcom/roidapp/cloudlib/t;
.source "SourceFile"


# instance fields
.field public o:I

.field protected p:Ljava/lang/String;

.field private q:Lcom/dropbox/client2/DropboxAPI;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/dropbox/client2/DropboxAPI",
            "<",
            "Lcom/dropbox/client2/android/AndroidAuthSession;",
            ">;"
        }
    .end annotation
.end field

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/LinearLayout;

.field private t:Ljava/lang/Runnable;

.field private u:Landroid/view/View$OnClickListener;

.field private v:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private w:Landroid/content/DialogInterface$OnClickListener;

.field private x:Ljava/lang/Runnable;

.field private y:Lcom/roidapp/cloudlib/dropbox/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/roidapp/cloudlib/t;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->o:I

    .line 52
    const-string v0, "/"

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    .line 130
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/f;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/dropbox/f;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->t:Ljava/lang/Runnable;

    .line 143
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/g;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/dropbox/g;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->u:Landroid/view/View$OnClickListener;

    .line 155
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/h;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/dropbox/h;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->v:Landroid/os/Handler;

    .line 162
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/i;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/dropbox/i;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->w:Landroid/content/DialogInterface$OnClickListener;

    .line 244
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/k;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/dropbox/k;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->x:Ljava/lang/Runnable;

    .line 347
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->e:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/e;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/e;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/dropbox/client2/android/AndroidAuthSession;
    .locals 5

    .prologue
    .line 259
    new-instance v1, Lcom/dropbox/client2/session/AppKeyPair;

    sget-object v0, Lcom/roidapp/cloudlib/dropbox/a;->f:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/cloudlib/dropbox/a;->g:Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Lcom/dropbox/client2/session/AppKeyPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->w(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    .line 263
    if-eqz v0, :cond_0

    .line 264
    new-instance v2, Lcom/dropbox/client2/session/AccessTokenPair;

    const/4 v3, 0x0

    aget-object v3, v0, v3

    const/4 v4, 0x1

    aget-object v0, v0, v4

    invoke-direct {v2, v3, v0}, Lcom/dropbox/client2/session/AccessTokenPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    new-instance v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    sget-object v3, Lcom/roidapp/cloudlib/dropbox/a;->h:Lcom/dropbox/client2/session/Session$AccessType;

    invoke-direct {v0, v1, v3, v2}, Lcom/dropbox/client2/android/AndroidAuthSession;-><init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/Session$AccessType;Lcom/dropbox/client2/session/AccessTokenPair;)V

    .line 272
    :goto_0
    return-object v0

    .line 269
    :cond_0
    new-instance v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    sget-object v2, Lcom/roidapp/cloudlib/dropbox/a;->h:Lcom/dropbox/client2/session/Session$AccessType;

    invoke-direct {v0, v1, v2}, Lcom/dropbox/client2/android/AndroidAuthSession;-><init>(Lcom/dropbox/client2/session/AppKeyPair;Lcom/dropbox/client2/session/Session$AccessType;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ad;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 47
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 304
    if-eqz p1, :cond_0

    .line 305
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 309
    :goto_0
    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->e:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ad;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/af;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->l:Lcom/roidapp/cloudlib/af;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/af;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->l:Lcom/roidapp/cloudlib/af;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 316
    :try_start_0
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/n;

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/dropbox/n;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Lcom/dropbox/client2/DropboxAPI;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->y:Lcom/roidapp/cloudlib/dropbox/n;

    .line 318
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->y:Lcom/roidapp/cloudlib/dropbox/n;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/dropbox/n;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 323
    :goto_0
    return-void

    .line 320
    :catch_0
    move-exception v0

    const-string v0, "DropBoxPhotoFragment"

    const-string v1, "Caught RejectedExecutionException Exception - loadInteresting"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->t:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->e:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ad;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->v:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/dropbox/client2/DropboxAPI;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a:I

    return v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a:I

    return v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)Lcom/roidapp/cloudlib/ah;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/dropbox/c;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 327
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Z)V

    .line 329
    if-eqz p1, :cond_2

    .line 330
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/dropbox/l;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/dropbox/l;->a(Lcom/roidapp/cloudlib/dropbox/c;)V

    .line 333
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->o:I

    iget-object v1, p1, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->o:I

    .line 335
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 336
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 344
    :goto_0
    return-void

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 341
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->T:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method protected final b()Landroid/widget/AdapterView$OnItemClickListener;
    .locals 1

    .prologue
    .line 103
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/e;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/dropbox/e;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 94
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/l;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/dropbox/l;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 95
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->c:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 96
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    .line 97
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Z)V

    .line 98
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d(Ljava/lang/String;)V

    .line 99
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->o:I

    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/dropbox/l;

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/l;->a(Lcom/roidapp/cloudlib/dropbox/l;)Lcom/roidapp/cloudlib/dropbox/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/c;->a()I

    move-result v0

    if-le v1, v0, :cond_1

    .line 91
    :cond_0
    :goto_0
    return-void

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 88
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Z)V

    .line 89
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final g()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 208
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->isLinked()Z

    move-result v0

    if-nez v0, :cond_1

    .line 209
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/dropbox/client2/android/AndroidAuthSession;->startAuthentication(Landroid/content/Context;)V

    .line 219
    :cond_0
    :goto_0
    return-void

    .line 1203
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 212
    :goto_1
    if-nez v0, :cond_0

    .line 215
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/l;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lcom/roidapp/cloudlib/dropbox/l;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 216
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->c:Landroid/widget/GridView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 217
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Z)V

    .line 218
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 1203
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final h()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 286
    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 287
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 289
    const-string v2, "fromCloud"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 290
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->startActivity(Landroid/content/Intent;)V

    .line 291
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 299
    :goto_0
    return v0

    .line 294
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 295
    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 296
    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 297
    const-string v0, "/"

    .line 298
    :cond_1
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->c(Ljava/lang/String;)V

    move v0, v1

    .line 299
    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a:I

    .line 63
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/t;->onCreate(Landroid/os/Bundle;)V

    .line 65
    new-instance v0, Lcom/roidapp/cloudlib/ah;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/ah;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    .line 66
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/l;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/dropbox/l;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 68
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Landroid/content/Context;)Lcom/dropbox/client2/android/AndroidAuthSession;

    move-result-object v0

    .line 69
    new-instance v1, Lcom/dropbox/client2/DropboxAPI;

    invoke-direct {v1, v0}, Lcom/dropbox/client2/DropboxAPI;-><init>(Lcom/dropbox/client2/session/Session;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    .line 71
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 172
    sget v0, Lcom/roidapp/cloudlib/as;->i:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 174
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Landroid/view/View;)V

    .line 175
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->b(Landroid/view/View;)V

    .line 176
    sget v0, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->r:Landroid/widget/RelativeLayout;

    .line 177
    sget v0, Lcom/roidapp/cloudlib/ar;->bs:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->s:Landroid/widget/LinearLayout;

    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->s:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    sget v0, Lcom/roidapp/cloudlib/ar;->g:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 180
    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 182
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->w:Landroid/content/DialogInterface$OnClickListener;

    new-instance v3, Lcom/roidapp/cloudlib/dropbox/j;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/dropbox/j;-><init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    move-object v0, v1

    .line 199
    :goto_0
    return-object v0

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->isLinked()Z

    move-result v0

    if-nez v0, :cond_1

    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/dropbox/client2/android/AndroidAuthSession;->startAuthentication(Landroid/content/Context;)V

    :goto_1
    move-object v0, v1

    .line 199
    goto :goto_0

    .line 196
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d()V

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 277
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onDestroy()V

    .line 278
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 282
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onPause()V

    .line 283
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 223
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onResume()V

    .line 224
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->authenticationSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->finishAuthentication()Ljava/lang/String;

    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->getAccessTokenPair()Lcom/dropbox/client2/session/AccessTokenPair;

    move-result-object v1

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->q:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->isLinked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->d()V

    .line 236
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v2, v1, Lcom/dropbox/client2/session/AccessTokenPair;->key:Ljava/lang/String;

    iget-object v1, v1, Lcom/dropbox/client2/session/AccessTokenPair;->secret:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->x:Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    :cond_1
    :goto_0
    return-void

    .line 239
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_0
.end method
