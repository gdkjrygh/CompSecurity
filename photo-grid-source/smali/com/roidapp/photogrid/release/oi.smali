.class public abstract Lcom/roidapp/photogrid/release/oi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Landroid/app/Activity;

.field public c:[Lcom/roidapp/photogrid/release/ig;

.field public d:Lcom/roidapp/photogrid/release/ml;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Lcom/roidapp/photogrid/release/PhotoView;

.field public h:Lcom/roidapp/photogrid/release/az;

.field i:Lcom/roidapp/photogrid/release/ok;

.field j:Lcom/roidapp/photogrid/release/hx;

.field k:I

.field l:F

.field protected m:I

.field protected n:Ljava/lang/String;

.field protected o:I

.field protected p:Ljava/lang/String;

.field public q:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/oi;->a:I

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 40
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/oi;->l:F

    .line 50
    new-instance v0, Lcom/roidapp/photogrid/release/oj;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/oj;-><init>(Lcom/roidapp/photogrid/release/oi;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oi;->q:Landroid/os/Handler;

    .line 129
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 204
    if-eqz p0, :cond_0

    .line 205
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 206
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 207
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :cond_0
    :goto_0
    return-void

    .line 211
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private h()V
    .locals 5

    .prologue
    .line 304
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ap;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 305
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 306
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 308
    if-eqz v1, :cond_1

    .line 309
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 310
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 311
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 309
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 316
    :cond_1
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract a(I)V
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 153
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    .line 154
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 157
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->p:Ljava/lang/String;

    return-object v0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 320
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 321
    const/4 v1, 0x0

    iput v1, v0, Landroid/os/Message;->what:I

    .line 322
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 323
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oi;->q:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 324
    return-void
.end method

.method public c()I
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;)Z

    move-result v0

    .line 178
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 179
    :goto_0
    return v0

    .line 178
    :cond_0
    const/4 v0, 0x2

    .line 179
    goto :goto_0
.end method

.method public final d()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 187
    const-string v1, "WATER_MARK"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final e()V
    .locals 5

    .prologue
    const/4 v1, 0x5

    const/4 v2, 0x0

    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    const-string v3, "DebugMode"

    invoke-virtual {v0, v3, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1332
    const-string v3, "DebugMode"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 237
    if-eqz v0, :cond_5

    .line 238
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    if-nez v0, :cond_1

    .line 239
    new-instance v0, Lcom/roidapp/photogrid/release/hx;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-direct {v0, v3}, Lcom/roidapp/photogrid/release/hx;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    .line 242
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oi;->h()V

    .line 243
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/hx;->a()V

    .line 244
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;)Z

    move-result v3

    .line 245
    if-eqz v3, :cond_2

    move v0, v1

    :goto_0
    iput v0, p0, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 246
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/oi;->l:F

    .line 248
    if-eqz v3, :cond_3

    move v0, v2

    .line 249
    :goto_1
    if-ltz v1, :cond_4

    .line 250
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3, v2, v1, v2}, Lcom/roidapp/photogrid/release/hx;->a(Landroid/content/Context;IIZ)I

    move-result v0

    .line 251
    iput v1, p0, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 252
    if-nez v0, :cond_4

    .line 249
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_2
    move v0, v2

    .line 245
    goto :goto_0

    :cond_3
    move v0, v2

    move v3, v2

    .line 257
    :goto_2
    if-gt v3, v1, :cond_4

    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-virtual {v0, v4, v2, v3, v2}, Lcom/roidapp/photogrid/release/hx;->a(Landroid/content/Context;IIZ)I

    move-result v0

    .line 259
    iput v3, p0, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 260
    if-nez v0, :cond_4

    .line 257
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 265
    :cond_4
    if-eqz v0, :cond_6

    .line 266
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/oi;->a(I)V

    .line 271
    :cond_5
    :goto_3
    return-void

    .line 268
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/oi;->f()V

    goto :goto_3
.end method

.method protected final f()V
    .locals 2

    .prologue
    .line 283
    const/4 v0, 0x6

    iput v0, p0, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 284
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/hx;->b:Z

    .line 285
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/oi;->l:F

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 286
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/hx;->b()V

    .line 287
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    if-eqz v0, :cond_0

    .line 288
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->p:Z

    .line 294
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 295
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->g(Landroid/content/Context;)V

    .line 297
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oi;->h()V

    .line 298
    return-void
.end method

.method public g()V
    .locals 0

    .prologue
    .line 337
    return-void
.end method
