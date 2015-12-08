.class public Lcom/roidapp/cloudlib/google/SearchPhotoFragment;
.super Lcom/roidapp/cloudlib/t;
.source "SourceFile"


# instance fields
.field public o:I

.field private p:Landroid/widget/RelativeLayout;

.field private q:Ljava/lang/String;

.field private r:Lcom/roidapp/cloudlib/google/j;

.field private s:Landroid/widget/EditText;

.field private t:Landroid/widget/TextView$OnEditorActionListener;

.field private u:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/roidapp/cloudlib/t;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->o:I

    .line 63
    new-instance v0, Lcom/roidapp/cloudlib/google/k;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/google/k;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->t:Landroid/widget/TextView$OnEditorActionListener;

    .line 94
    new-instance v0, Lcom/roidapp/cloudlib/google/l;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/google/l;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->u:Landroid/content/DialogInterface$OnClickListener;

    .line 324
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 41
    .line 3075
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3076
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->o:I

    if-nez v1, :cond_4

    .line 3077
    :cond_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v1, :cond_2

    .line 3079
    new-instance v1, Lcom/roidapp/cloudlib/google/p;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/roidapp/cloudlib/google/p;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 3080
    iget-object v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->c:Landroid/widget/GridView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 3081
    iput v3, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->o:I

    .line 3083
    :cond_2
    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->q:Ljava/lang/String;

    .line 3084
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3085
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d()V

    .line 3087
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 3089
    iget-object v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 41
    :cond_4
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 156
    if-eqz p1, :cond_0

    .line 157
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 161
    :goto_0
    return-void

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V
    .locals 3

    .prologue
    .line 3102
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3103
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->startActivity(Landroid/content/Intent;)V

    .line 3104
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 41
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ad;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->e:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ad;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->e:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ad;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Z
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->h:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->f:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->f:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ae;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->j:Lcom/roidapp/cloudlib/ae;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ae;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->j:Lcom/roidapp/cloudlib/ae;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->m:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method protected final a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 277
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    iget v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->e:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ad;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 278
    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 279
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 280
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 281
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    move-object p1, v0

    .line 284
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/t;->a(Ljava/lang/String;)V

    .line 285
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/google/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 180
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 199
    :cond_0
    :goto_0
    return-void

    .line 183
    :cond_1
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Z)V

    .line 184
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/google/p;

    .line 1334
    iget-object v1, v0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    .line 1335
    iget-object v1, v0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1336
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/p;->notifyDataSetChanged()V

    .line 187
    :cond_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/i;->b()I

    move-result v1

    .line 188
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/google/p;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/p;->d(I)V

    .line 190
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ad;->getCount()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->o:I

    .line 191
    const-string v0, "SearchPhotoFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPhotoListDownload, get photo size="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", showcount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 195
    :cond_3
    const-string v0, "SearchPhotoFragment"

    const-string v1, "onPhotoListDownload failed, get result is null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->T:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method protected final c()Lcom/roidapp/baselib/b/p;
    .locals 1

    .prologue
    .line 203
    new-instance v0, Lcom/roidapp/cloudlib/google/o;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/google/o;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V

    return-object v0
.end method

.method public final d()V
    .locals 5

    .prologue
    .line 312
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->o:I

    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/google/p;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/p;->b()I

    move-result v0

    if-le v1, v0, :cond_1

    .line 2175
    :cond_0
    :goto_0
    return-void

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 318
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Z)V

    .line 319
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->q:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->o:I

    .line 2165
    :try_start_0
    const-string v2, "SearchPhotoFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "loadPhotos, from count="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",keyword="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2168
    new-instance v2, Lcom/roidapp/cloudlib/google/j;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/cloudlib/google/j;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->r:Lcom/roidapp/cloudlib/google/j;

    .line 2169
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->r:Lcom/roidapp/cloudlib/google/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/j;->a(I)V

    .line 2170
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->r:Lcom/roidapp/cloudlib/google/j;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/j;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2171
    :catch_0
    move-exception v0

    .line 2172
    const-string v1, "SearchPhotoFragment"

    const-string v2, "Caught RejectedExecutionException Exception - loadInteresting"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2174
    invoke-virtual {v0}, Ljava/util/concurrent/RejectedExecutionException;->printStackTrace()V

    goto :goto_0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 109
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 58
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/t;->onCreate(Landroid/os/Bundle;)V

    .line 59
    new-instance v0, Lcom/roidapp/cloudlib/ah;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/ah;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Lcom/roidapp/cloudlib/ah;)V

    .line 60
    new-instance v0, Lcom/roidapp/cloudlib/google/p;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/google/p;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 61
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 114
    sget v0, Lcom/roidapp/cloudlib/as;->f:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 116
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Landroid/view/View;)V

    .line 117
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->b(Landroid/view/View;)V

    .line 119
    sget v0, Lcom/roidapp/cloudlib/ar;->bo:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->s:Landroid/widget/EditText;

    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->s:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->t:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 121
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->t(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->q:Ljava/lang/String;

    .line 122
    sget v0, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->p:Landroid/widget/RelativeLayout;

    .line 125
    sget v0, Lcom/roidapp/cloudlib/ar;->bX:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 126
    new-instance v2, Lcom/roidapp/cloudlib/google/m;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/google/m;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->u:Landroid/content/DialogInterface$OnClickListener;

    new-instance v3, Lcom/roidapp/cloudlib/google/n;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/google/n;-><init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    move-object v0, v1

    .line 152
    :goto_0
    return-object v0

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 148
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d()V

    .line 149
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->s:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->q:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    move-object v0, v1

    .line 152
    goto :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 299
    .line 2050
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->r:Lcom/roidapp/cloudlib/google/j;

    if-eqz v0, :cond_0

    .line 2051
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->r:Lcom/roidapp/cloudlib/google/j;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/j;->cancel(Z)Z

    .line 2052
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->r:Lcom/roidapp/cloudlib/google/j;

    .line 300
    :cond_0
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onDestroy()V

    .line 301
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 302
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 294
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onPause()V

    .line 295
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 289
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onResume()V

    .line 290
    return-void
.end method
