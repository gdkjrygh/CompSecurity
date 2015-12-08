.class public Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;
.super Lcom/roidapp/cloudlib/t;
.source "SourceFile"


# instance fields
.field public o:I

.field private p:Landroid/widget/RelativeLayout;

.field private q:Lcom/googlecode/flickrjandroid/oauth/OAuth;

.field private r:I

.field private s:Landroid/widget/EditText;

.field private t:Landroid/content/DialogInterface$OnClickListener;

.field private u:Landroid/view/View$OnClickListener;

.field private v:Landroid/widget/TextView$OnEditorActionListener;

.field private w:Lcom/roidapp/cloudlib/flickr/x;

.field private x:Lcom/roidapp/cloudlib/flickr/y;

.field private y:Lcom/roidapp/cloudlib/flickr/z;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/roidapp/cloudlib/t;-><init>()V

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->r:I

    .line 78
    new-instance v0, Lcom/roidapp/cloudlib/flickr/r;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/flickr/r;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->t:Landroid/content/DialogInterface$OnClickListener;

    .line 85
    new-instance v0, Lcom/roidapp/cloudlib/flickr/s;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/flickr/s;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->u:Landroid/view/View$OnClickListener;

    .line 92
    new-instance v0, Lcom/roidapp/cloudlib/flickr/t;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/flickr/t;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->v:Landroid/widget/TextView$OnEditorActionListener;

    .line 232
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->z:Ljava/lang/String;

    .line 321
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;I)I
    .locals 0

    .prologue
    .line 40
    iput p1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->r:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V
    .locals 3

    .prologue
    .line 2205
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2206
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->startActivity(Landroid/content/Intent;)V

    .line 2207
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 40
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 180
    if-eqz p1, :cond_0

    .line 181
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 185
    :goto_0
    return-void

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V
    .locals 3

    .prologue
    .line 40
    .line 3161
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3162
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "count:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->r:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3163
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->r:I

    if-nez v0, :cond_2

    .line 3164
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_1

    .line 3165
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/flickr/w;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/w;->b()V

    .line 3166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 3167
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 3169
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->z:Ljava/lang/String;

    .line 3170
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    .line 3171
    new-instance v0, Lcom/roidapp/cloudlib/flickr/w;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/flickr/w;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 3172
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->c:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 3173
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d()V

    .line 3174
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 3175
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 40
    :cond_2
    return-void
.end method

.method public static h()V
    .locals 0

    .prologue
    .line 317
    return-void
.end method


# virtual methods
.method public final a(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 289
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Z)V

    .line 291
    if-eqz p1, :cond_1

    .line 292
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/flickr/w;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/flickr/w;->a(Lcom/googlecode/flickrjandroid/photos/PhotoList;)V

    .line 295
    :cond_0
    const-string v0, "FlickrPhotoFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onLoadMore, showPages="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",get size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",total pages="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->getPages()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",total photos="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->getTotal()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    iget v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    .line 303
    :goto_0
    return-void

    .line 300
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->T:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    if-nez v0, :cond_1

    .line 225
    :cond_0
    :goto_0
    return-void

    .line 214
    :cond_1
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/t;->a(Ljava/lang/Exception;)V

    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/googlecode/flickrjandroid/FlickrException;

    if-ne v0, v1, :cond_2

    .line 217
    check-cast p1, Lcom/googlecode/flickrjandroid/FlickrException;

    .line 218
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/FlickrException;->getErrorCode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "98"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2200

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 222
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    const/16 v1, 0x2201

    sget v2, Lcom/roidapp/cloudlib/at;->T:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 223
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->k:Lcom/roidapp/cloudlib/ah;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/ah;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public final d()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 149
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    check-cast v0, Lcom/roidapp/cloudlib/flickr/w;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/w;->c()I

    move-result v0

    if-le v1, v0, :cond_1

    .line 1254
    :cond_0
    :goto_0
    return-void

    .line 154
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 155
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Z)V

    .line 156
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->q:Lcom/googlecode/flickrjandroid/oauth/OAuth;

    .line 1238
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1239
    new-instance v0, Lcom/roidapp/cloudlib/flickr/z;

    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/flickr/z;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->y:Lcom/roidapp/cloudlib/flickr/z;

    .line 1240
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->y:Lcom/roidapp/cloudlib/flickr/z;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/flickr/z;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1252
    :catch_0
    move-exception v0

    const-string v0, "FlickrMain"

    const-string v1, "Caught RejectedExecutionException Exception - loadInteresting"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1242
    :cond_2
    if-eqz v0, :cond_3

    .line 1243
    :try_start_1
    new-instance v1, Lcom/roidapp/cloudlib/flickr/aa;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/flickr/aa;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/googlecode/flickrjandroid/oauth/OAuth;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/flickr/aa;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 1244
    new-instance v1, Lcom/roidapp/cloudlib/flickr/x;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/flickr/x;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->w:Lcom/roidapp/cloudlib/flickr/x;

    .line 1245
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->w:Lcom/roidapp/cloudlib/flickr/x;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/googlecode/flickrjandroid/oauth/OAuth;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/flickr/x;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_0

    .line 1247
    :cond_3
    new-instance v0, Lcom/roidapp/cloudlib/flickr/y;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/flickr/y;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->x:Lcom/roidapp/cloudlib/flickr/y;

    .line 1248
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->x:Lcom/roidapp/cloudlib/flickr/y;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/flickr/y;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public final g()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 195
    .line 2188
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 195
    :goto_0
    if-eqz v0, :cond_1

    .line 202
    :goto_1
    return-void

    .line 2188
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 198
    :cond_1
    iput v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->o:I

    .line 199
    new-instance v0, Lcom/roidapp/cloudlib/flickr/w;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/flickr/w;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 200
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->c:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 201
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d()V

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 72
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/t;->onCreate(Landroid/os/Bundle;)V

    .line 73
    const-string v0, "FlickrPhotoFragment"

    const-string v1, "FlickrPhotoFragment onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    new-instance v0, Lcom/roidapp/cloudlib/flickr/v;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/flickr/v;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Lcom/roidapp/cloudlib/ah;)V

    .line 75
    new-instance v0, Lcom/roidapp/cloudlib/flickr/w;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/flickr/w;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d:Lcom/roidapp/cloudlib/ad;

    .line 76
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 105
    sget v0, Lcom/roidapp/cloudlib/as;->A:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 107
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->a(Landroid/view/View;)V

    .line 108
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->b(Landroid/view/View;)V

    .line 109
    sget v0, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->p:Landroid/widget/RelativeLayout;

    .line 110
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->j(Landroid/content/Context;)I

    move-result v0

    .line 111
    if-nez v0, :cond_0

    .line 112
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->h(Landroid/content/Context;)Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->q:Lcom/googlecode/flickrjandroid/oauth/OAuth;

    .line 117
    :goto_0
    sget v0, Lcom/roidapp/cloudlib/ar;->bo:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->s:Landroid/widget/EditText;

    .line 118
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->s:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->v:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 119
    sget v0, Lcom/roidapp/cloudlib/ar;->bX:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 120
    iget-object v2, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 123
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->t:Landroid/content/DialogInterface$OnClickListener;

    new-instance v3, Lcom/roidapp/cloudlib/flickr/u;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/flickr/u;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;)V

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    move-object v0, v1

    .line 136
    :goto_1
    return-object v0

    .line 114
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->q:Lcom/googlecode/flickrjandroid/oauth/OAuth;

    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->d()V

    move-object v0, v1

    .line 136
    goto :goto_1
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 271
    const-string v0, "FlickrPhotoFragment"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->w:Lcom/roidapp/cloudlib/flickr/x;

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->w:Lcom/roidapp/cloudlib/flickr/x;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/flickr/x;->cancel(Z)Z

    .line 274
    iput-object v3, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->w:Lcom/roidapp/cloudlib/flickr/x;

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->x:Lcom/roidapp/cloudlib/flickr/y;

    if-eqz v0, :cond_1

    .line 277
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->x:Lcom/roidapp/cloudlib/flickr/y;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/flickr/y;->cancel(Z)Z

    .line 278
    iput-object v3, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->x:Lcom/roidapp/cloudlib/flickr/y;

    .line 280
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->y:Lcom/roidapp/cloudlib/flickr/z;

    if-eqz v0, :cond_2

    .line 281
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->y:Lcom/roidapp/cloudlib/flickr/z;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/flickr/z;->cancel(Z)Z

    .line 282
    iput-object v3, p0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;->y:Lcom/roidapp/cloudlib/flickr/z;

    .line 284
    :cond_2
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onDestroy()V

    .line 285
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 265
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onPause()V

    .line 266
    const-string v0, "FlickrPhotoFragment"

    const-string v1, "onPause"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 259
    invoke-super {p0}, Lcom/roidapp/cloudlib/t;->onResume()V

    .line 260
    const-string v0, "FlickrPhotoFragment"

    const-string v1, "onResume"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    return-void
.end method
