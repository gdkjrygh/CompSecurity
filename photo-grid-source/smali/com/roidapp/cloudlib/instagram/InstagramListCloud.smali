.class public Lcom/roidapp/cloudlib/instagram/InstagramListCloud;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Lcom/roidapp/cloudlib/instagram/l;

.field private c:Lcom/roidapp/cloudlib/ads/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 57
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a:Landroid/os/Handler;

    .line 332
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->d()V

    .line 117
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;Z)V
    .locals 2

    .prologue
    .line 1157
    if-eqz p1, :cond_1

    .line 1158
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1159
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1160
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1164
    :goto_0
    return-void

    .line 1162
    :cond_0
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a(Z)V

    goto :goto_0

    .line 1165
    :cond_1
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a(Z)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 170
    invoke-direct {p0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a()V

    .line 171
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Instagram"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    .line 172
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 173
    iget-object v0, v0, Lcom/roidapp/cloudlib/ak;->b:Ljava/lang/Class;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 174
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->a(I)V

    .line 175
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->startActivity(Landroid/content/Intent;)V

    .line 176
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->finish()V

    .line 177
    return-void

    .line 174
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/io/OutputStream;)Z
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 291
    invoke-static {}, Lcom/roidapp/baselib/e/l;->a()V

    .line 299
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 300
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    const/16 v1, 0x2710

    :try_start_1
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 302
    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 303
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const/16 v4, 0x2000

    invoke-direct {v2, v1, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 305
    :try_start_2
    new-instance v4, Ljava/io/BufferedOutputStream;

    const/16 v1, 0x2000

    invoke-direct {v4, p1, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 308
    :goto_0
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->read()I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_3

    .line 309
    invoke-virtual {v4, v1}, Ljava/io/BufferedOutputStream;->write(I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_0

    .line 312
    :catch_0
    move-exception v1

    move-object v3, v4

    move-object v7, v2

    move-object v2, v0

    move-object v0, v1

    move-object v1, v7

    .line 313
    :goto_1
    :try_start_4
    const-string v4, "InstragramListCloud"

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

    .line 315
    if-eqz v2, :cond_0

    .line 316
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 319
    :cond_0
    if-eqz v3, :cond_1

    .line 320
    :try_start_5
    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V

    .line 322
    :cond_1
    if-eqz v1, :cond_2

    .line 323
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 328
    :cond_2
    :goto_2
    const/4 v0, 0x0

    :goto_3
    return v0

    .line 315
    :cond_3
    if-eqz v0, :cond_4

    .line 316
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 320
    :cond_4
    :try_start_6
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 323
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 326
    :goto_4
    const/4 v0, 0x1

    goto :goto_3

    .line 315
    :catchall_0
    move-exception v0

    move-object v4, v3

    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_5

    .line 316
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 319
    :cond_5
    if-eqz v4, :cond_6

    .line 320
    :try_start_7
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 322
    :cond_6
    if-eqz v3, :cond_7

    .line 323
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 326
    :cond_7
    :goto_6
    throw v0

    :catch_1
    move-exception v1

    goto :goto_6

    .line 315
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

    .line 327
    :catch_2
    move-exception v0

    goto :goto_2

    .line 312
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

.method private b()V
    .locals 3

    .prologue
    .line 136
    invoke-direct {p0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a()V

    .line 137
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 138
    const-string v1, "fromCloud"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 139
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->startActivity(Landroid/content/Intent;)V

    .line 140
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->finish()V

    .line 141
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 181
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 182
    packed-switch p1, :pswitch_data_0

    .line 202
    :cond_0
    :goto_0
    return-void

    .line 184
    :pswitch_0
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 186
    sget v0, Lcom/roidapp/cloudlib/at;->i:I

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 188
    :cond_1
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a(Z)V

    .line 190
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 191
    const-string v2, "KEY_INSTAGRAM_TOKEN"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/cloudlib/al;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 197
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->b:Lcom/roidapp/cloudlib/instagram/l;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->b:Lcom/roidapp/cloudlib/instagram/l;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/l;->notifyDataSetChanged()V

    goto :goto_0

    .line 182
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cH:I

    if-ne v0, v1, :cond_1

    .line 99
    invoke-direct {p0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->b()V

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 100
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->f:I

    if-ne v0, v1, :cond_0

    .line 101
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 64
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 65
    sget v0, Lcom/roidapp/cloudlib/as;->J:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->setContentView(I)V

    .line 67
    sget v0, Lcom/roidapp/cloudlib/ar;->cH:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 68
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    sget v0, Lcom/roidapp/cloudlib/ar;->f:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 71
    const/16 v1, 0xa0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 72
    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    sget v0, Lcom/roidapp/cloudlib/ar;->aN:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 75
    new-instance v1, Lcom/roidapp/cloudlib/instagram/l;

    invoke-direct {v1, p0, p0}, Lcom/roidapp/cloudlib/instagram/l;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->b:Lcom/roidapp/cloudlib/instagram/l;

    .line 76
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->b:Lcom/roidapp/cloudlib/instagram/l;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 77
    new-instance v1, Lcom/roidapp/cloudlib/instagram/i;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/instagram/i;-><init>(Lcom/roidapp/cloudlib/instagram/InstagramListCloud;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1106
    sget v0, Lcom/roidapp/cloudlib/ar;->br:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 1107
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    if-nez v1, :cond_0

    .line 1108
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    const-string v2, "cloud_list"

    invoke-virtual {v1, p0, v2}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    .line 1109
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v1, :cond_1

    .line 1110
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    const-string v2, "ca-app-pub-7109791911060569/9716033936"

    invoke-interface {v1, p0, v0, v2}, Lcom/roidapp/cloudlib/ads/l;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;)V

    .line 94
    :cond_1
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 217
    invoke-direct {p0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->a()V

    .line 1130
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->c()V

    .line 1131
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    .line 219
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 220
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 145
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 146
    invoke-direct {p0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->b()V

    .line 147
    const/4 v0, 0x1

    .line 149
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
    .line 211
    .line 1125
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->a()V

    .line 212
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 213
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 206
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 1120
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->c:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->b()V

    .line 208
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 224
    const-string v0, "Instagram/LoginList"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->c(Ljava/lang/String;)V

    .line 225
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 226
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 229
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 230
    return-void
.end method
