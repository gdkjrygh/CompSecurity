.class public Lcom/roidapp/cloudlib/flickr/FlickrListCloud;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Lcom/roidapp/cloudlib/ads/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 58
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a:Landroid/os/Handler;

    .line 403
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 160
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b()V

    .line 161
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 163
    const-string v1, "fromCloud"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 164
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->startActivity(Landroid/content/Intent;)V

    .line 165
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->finish()V

    .line 166
    return-void
.end method

.method private a(Lcom/googlecode/flickrjandroid/oauth/OAuth;)V
    .locals 2

    .prologue
    .line 234
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b()V

    .line 235
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Flickr"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    .line 236
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 237
    iget-object v0, v0, Lcom/roidapp/cloudlib/ak;->b:Ljava/lang/Class;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 238
    if-eqz p1, :cond_0

    .line 239
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;I)V

    .line 243
    :goto_0
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->startActivity(Landroid/content/Intent;)V

    .line 244
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->finish()V

    .line 245
    return-void

    .line 241
    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)V
    .locals 0

    .prologue
    .line 4265
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->a()Lcom/roidapp/cloudlib/flickr/k;

    invoke-static {p0}, Lcom/roidapp/cloudlib/flickr/k;->a(Landroid/content/Context;)V

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;Z)V
    .locals 3

    .prologue
    .line 4184
    if-eqz p1, :cond_3

    .line 4186
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->h(Landroid/content/Context;)Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v0

    .line 4187
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getUser()Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v1

    if-nez v1, :cond_2

    .line 4188
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->startActivityForResult(Landroid/content/Intent;I)V

    .line 4196
    :cond_1
    :goto_0
    return-void

    .line 4190
    :cond_2
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 4191
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 4193
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a(Lcom/googlecode/flickrjandroid/oauth/OAuth;)V

    goto :goto_0

    .line 4199
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a(Lcom/googlecode/flickrjandroid/oauth/OAuth;)V

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/io/OutputStream;)Z
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 363
    invoke-static {}, Lcom/roidapp/baselib/e/l;->a()V

    .line 371
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 372
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 373
    const/16 v1, 0x2710

    :try_start_1
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 374
    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 375
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const/16 v4, 0x2000

    invoke-direct {v2, v1, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 377
    :try_start_2
    new-instance v4, Ljava/io/BufferedOutputStream;

    const/16 v1, 0x2000

    invoke-direct {v4, p1, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 380
    :goto_0
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->read()I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_3

    .line 381
    invoke-virtual {v4, v1}, Ljava/io/BufferedOutputStream;->write(I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_0

    .line 384
    :catch_0
    move-exception v1

    move-object v3, v4

    move-object v7, v2

    move-object v2, v0

    move-object v0, v1

    move-object v1, v7

    .line 385
    :goto_1
    :try_start_4
    const-string v4, "FlickrListCloud"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error in downloadBitmap - "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 387
    if-eqz v2, :cond_0

    .line 388
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 391
    :cond_0
    if-eqz v3, :cond_1

    .line 392
    :try_start_5
    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V

    .line 394
    :cond_1
    if-eqz v1, :cond_2

    .line 395
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 400
    :cond_2
    :goto_2
    const/4 v0, 0x0

    :goto_3
    return v0

    .line 387
    :cond_3
    if-eqz v0, :cond_4

    .line 388
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 392
    :cond_4
    :try_start_6
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 395
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 398
    :goto_4
    const/4 v0, 0x1

    goto :goto_3

    .line 387
    :catchall_0
    move-exception v0

    move-object v4, v3

    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_5

    .line 388
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 391
    :cond_5
    if-eqz v4, :cond_6

    .line 392
    :try_start_7
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 394
    :cond_6
    if-eqz v3, :cond_7

    .line 395
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 398
    :cond_7
    :goto_6
    throw v0

    :catch_1
    move-exception v1

    goto :goto_6

    .line 387
    :catchall_1
    move-exception v1

    move-object v4, v3

    move-object v2, v0

    move-object v0, v1

    goto :goto_5

    :catchall_2
    move-exception v1

    move-object v4, v3

    move-object v3, v2

    move-object v2, v0

    move-object v0, v1

    goto :goto_5

    :catchall_3
    move-exception v1

    move-object v3, v2

    move-object v2, v0

    move-object v0, v1

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v4, v3

    move-object v3, v1

    goto :goto_5

    .line 399
    :catch_2
    move-exception v0

    goto :goto_2

    .line 384
    :catch_3
    move-exception v0

    move-object v1, v3

    move-object v2, v3

    goto :goto_1

    :catch_4
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    move-object v1, v3

    goto :goto_1

    :catch_5
    move-exception v1

    move-object v7, v1

    move-object v1, v2

    move-object v2, v0

    move-object v0, v7

    goto :goto_1

    :catch_6
    move-exception v0

    goto :goto_4
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->d()V

    .line 215
    :cond_0
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 270
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 272
    sparse-switch p1, :sswitch_data_0

    .line 295
    :cond_0
    :goto_0
    return-void

    .line 274
    :sswitch_0
    const/4 v0, 0x0

    .line 275
    if-eqz p3, :cond_1

    const-string v1, "oauth"

    invoke-virtual {p3, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 276
    const-string v0, "oauth"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/oauth/OAuth;

    .line 277
    :cond_1
    if-nez v0, :cond_2

    .line 278
    sget v0, Lcom/roidapp/cloudlib/at;->i:I

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 281
    :cond_2
    const-string v1, "FlickrListCloud"

    const-string v2, "onOAuthDone startFlickMainActivity"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 282
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a(Lcom/googlecode/flickrjandroid/oauth/OAuth;)V

    goto :goto_0

    .line 287
    :sswitch_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->h(Landroid/content/Context;)Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v0

    .line 288
    if-nez v0, :cond_0

    .line 289
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b()V

    .line 290
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->startActivity(Landroid/content/Intent;)V

    .line 291
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->finish()V

    goto :goto_0

    .line 272
    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x64 -> :sswitch_0
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cH:I

    if-ne v0, v1, :cond_1

    .line 98
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a()V

    .line 102
    :cond_0
    :goto_0
    return-void

    .line 99
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->f:I

    if-ne v0, v1, :cond_0

    .line 100
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 64
    sget v0, Lcom/roidapp/cloudlib/as;->B:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->setContentView(I)V

    .line 66
    sget v0, Lcom/roidapp/cloudlib/ar;->cH:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 67
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    sget v0, Lcom/roidapp/cloudlib/ar;->f:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 70
    const/16 v1, 0xa0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 71
    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    sget v0, Lcom/roidapp/cloudlib/ar;->aN:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 74
    new-instance v1, Lcom/roidapp/cloudlib/flickr/q;

    invoke-direct {v1, p0, p0}, Lcom/roidapp/cloudlib/flickr/q;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 75
    new-instance v1, Lcom/roidapp/cloudlib/flickr/l;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/flickr/l;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1204
    sget v0, Lcom/roidapp/cloudlib/ar;->br:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 1205
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    if-nez v1, :cond_0

    .line 1206
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    const-string v2, "cloud_list"

    invoke-virtual {v1, p0, v2}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    .line 1207
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v1, :cond_1

    .line 1208
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    const-string v2, "ca-app-pub-7109791911060569/9716033936"

    invoke-interface {v1, p0, v0, v2}, Lcom/roidapp/cloudlib/ads/l;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;)V

    .line 92
    :cond_1
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 106
    packed-switch p1, :pswitch_data_0

    .line 127
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 108
    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 109
    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    new-instance v2, Lcom/roidapp/cloudlib/flickr/m;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/flickr/m;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 116
    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    new-instance v2, Lcom/roidapp/cloudlib/flickr/n;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/flickr/n;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrListCloud;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 123
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->aE:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 125
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 106
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 132
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b()V

    .line 1228
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->c()V

    .line 1229
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    .line 134
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 135
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 170
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 171
    invoke-direct {p0}, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->a()V

    .line 172
    const/4 v0, 0x1

    .line 174
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
    .line 139
    .line 2223
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->a()V

    .line 140
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 141
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 299
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 300
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 145
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 3218
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;->b:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->b()V

    .line 147
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 304
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 305
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 151
    const-string v0, "Flickr/FlickrList"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->c(Ljava/lang/String;)V

    .line 152
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 153
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 156
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 157
    return-void
.end method
