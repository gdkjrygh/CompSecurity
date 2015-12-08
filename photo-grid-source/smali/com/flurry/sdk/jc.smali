.class public Lcom/flurry/sdk/jc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/flurry/sdk/jc;


# instance fields
.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/flurry/sdk/jk;",
            "[B>;"
        }
    .end annotation
.end field

.field private final e:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/lc;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/flurry/sdk/jc$a;

.field private g:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

.field private h:Ljava/lang/String;

.field private i:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/flurry/sdk/jc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->v()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/flurry/sdk/jc;->c:Ljava/util/Set;

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/jc;->d:Ljava/util/Map;

    .line 76
    new-instance v0, Lcom/flurry/sdk/jc$1;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/jc$1;-><init>(Lcom/flurry/sdk/jc;)V

    iput-object v0, p0, Lcom/flurry/sdk/jc;->e:Lcom/flurry/sdk/jx;

    .line 95
    sget-object v0, Lcom/flurry/sdk/jc$a;->a:Lcom/flurry/sdk/jc$a;

    iput-object v0, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    .line 101
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.FlurrySessionEvent"

    iget-object v2, p0, Lcom/flurry/sdk/jc;->e:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 102
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/jc$2;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/jc$2;-><init>(Lcom/flurry/sdk/jc;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 108
    return-void
.end method

.method public static declared-synchronized a()Lcom/flurry/sdk/jc;
    .locals 2

    .prologue
    .line 48
    const-class v1, Lcom/flurry/sdk/jc;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/flurry/sdk/jc;->b:Lcom/flurry/sdk/jc;

    if-nez v0, :cond_0

    .line 49
    new-instance v0, Lcom/flurry/sdk/jc;

    invoke-direct {v0}, Lcom/flurry/sdk/jc;-><init>()V

    sput-object v0, Lcom/flurry/sdk/jc;->b:Lcom/flurry/sdk/jc;

    .line 51
    :cond_0
    sget-object v0, Lcom/flurry/sdk/jc;->b:Lcom/flurry/sdk/jc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 48
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Ljava/io/DataInput;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 421
    const/4 v0, 0x1

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 422
    const/4 v0, 0x0

    .line 424
    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p1}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/flurry/sdk/jc;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->j()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/io/DataOutput;)V
    .locals 1

    .prologue
    .line 416
    const/4 v0, 0x1

    invoke-interface {p2, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 417
    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 418
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/io/File;)V
    .locals 5

    .prologue
    .line 347
    const/4 v2, 0x0

    .line 349
    :try_start_0
    new-instance v1, Ljava/io/DataOutputStream;

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    :try_start_1
    invoke-direct {p0, p1, v1}, Lcom/flurry/sdk/jc;->a(Ljava/lang/String;Ljava/io/DataOutput;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 354
    invoke-static {v1}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    .line 355
    :goto_0
    return-void

    .line 351
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 352
    :goto_1
    const/4 v2, 0x6

    :try_start_2
    sget-object v3, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v4, "Error when saving deviceId"

    invoke-static {v2, v3, v4, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 354
    invoke-static {v1}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    invoke-static {v1}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 351
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 315
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 323
    :cond_0
    :goto_0
    return v0

    .line 319
    :cond_1
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/flurry/sdk/jc;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 323
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b(Ljava/io/DataInput;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 428
    const v1, 0xb5fa

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedShort()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 438
    :cond_0
    :goto_0
    return-object v0

    .line 432
    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedShort()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 436
    invoke-interface {p1}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 438
    invoke-interface {p1}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static b()V
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    sput-object v0, Lcom/flurry/sdk/jc;->b:Lcom/flurry/sdk/jc;

    .line 56
    return-void
.end method

.method static synthetic b(Lcom/flurry/sdk/jc;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->i()V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 333
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    :cond_0
    :goto_0
    return-void

    .line 337
    :cond_1
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0}, Lcom/flurry/sdk/jc;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 339
    invoke-static {v0}, Lcom/flurry/sdk/lo;->a(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 343
    invoke-direct {p0, p1, v0}, Lcom/flurry/sdk/jc;->a(Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 446
    iget-object v0, p0, Lcom/flurry/sdk/jc;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private i()V
    .locals 5

    .prologue
    .line 144
    :goto_0
    sget-object v0, Lcom/flurry/sdk/jc$a;->f:Lcom/flurry/sdk/jc$a;

    iget-object v1, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jc$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    sget-object v0, Lcom/flurry/sdk/jc$4;->b:[I

    iget-object v1, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/jc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 174
    :goto_1
    :try_start_0
    sget-object v0, Lcom/flurry/sdk/jc$4;->b:[I

    iget-object v1, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/jc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 176
    :pswitch_0
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->j()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 195
    :catch_0
    move-exception v0

    .line 196
    const/4 v1, 0x4

    sget-object v2, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception during id fetch:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 148
    :pswitch_1
    sget-object v0, Lcom/flurry/sdk/jc$a;->b:Lcom/flurry/sdk/jc$a;

    iput-object v0, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    goto :goto_1

    .line 152
    :pswitch_2
    sget-object v0, Lcom/flurry/sdk/jc$a;->c:Lcom/flurry/sdk/jc$a;

    iput-object v0, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    goto :goto_1

    .line 156
    :pswitch_3
    sget-object v0, Lcom/flurry/sdk/jc$a;->d:Lcom/flurry/sdk/jc$a;

    iput-object v0, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    goto :goto_1

    .line 160
    :pswitch_4
    sget-object v0, Lcom/flurry/sdk/jc$a;->e:Lcom/flurry/sdk/jc$a;

    iput-object v0, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    goto :goto_1

    .line 164
    :pswitch_5
    sget-object v0, Lcom/flurry/sdk/jc$a;->f:Lcom/flurry/sdk/jc$a;

    iput-object v0, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    goto :goto_1

    .line 180
    :pswitch_6
    :try_start_1
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->k()V

    goto :goto_0

    .line 184
    :pswitch_7
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->l()V

    goto :goto_0

    .line 188
    :pswitch_8
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->x()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 201
    :cond_0
    new-instance v0, Lcom/flurry/sdk/jd;

    invoke-direct {v0}, Lcom/flurry/sdk/jd;-><init>()V

    .line 202
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/jy;->a(Lcom/flurry/sdk/jw;)V

    .line 203
    return-void

    .line 146
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    .line 174
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_0
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private j()V
    .locals 2

    .prologue
    .line 207
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 209
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->m()Z

    move-result v0

    if-nez v0, :cond_1

    .line 226
    :cond_0
    :goto_0
    return-void

    .line 213
    :cond_1
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->n()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    iput-object v0, p0, Lcom/flurry/sdk/jc;->g:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 216
    invoke-virtual {p0}, Lcom/flurry/sdk/jc;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->x()V

    .line 223
    new-instance v0, Lcom/flurry/sdk/je;

    invoke-direct {v0}, Lcom/flurry/sdk/je;-><init>()V

    .line 224
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/jy;->a(Lcom/flurry/sdk/jw;)V

    goto :goto_0
.end method

.method private k()V
    .locals 1

    .prologue
    .line 237
    invoke-static {}, Lcom/flurry/sdk/lp;->b()V

    .line 239
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/flurry/sdk/jc;->h:Ljava/lang/String;

    .line 240
    return-void
.end method

.method private l()V
    .locals 2

    .prologue
    .line 243
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    :goto_0
    return-void

    .line 247
    :cond_0
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->w()V

    goto :goto_0
.end method

.method private m()Z
    .locals 5

    .prologue
    .line 251
    const/4 v0, 0x0

    .line 253
    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    .line 254
    if-nez v1, :cond_0

    .line 255
    const/4 v0, 0x1

    .line 267
    :goto_0
    return v0

    .line 257
    :cond_0
    sget-object v2, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Google Play Services not available - connection result: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 260
    :catch_0
    move-exception v1

    sget-object v1, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v2, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising."

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 261
    :catch_1
    move-exception v1

    .line 263
    sget-object v2, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "GOOGLE PLAY SERVICES EXCEPTION: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    sget-object v1, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v2, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising."

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private n()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    .locals 5

    .prologue
    .line 271
    const/4 v0, 0x0

    .line 273
    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 280
    :goto_0
    return-object v0

    .line 274
    :catch_0
    move-exception v1

    .line 276
    sget-object v2, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "GOOGLE PLAY SERVICES ERROR: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    sget-object v1, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v2, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising."

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private o()Ljava/lang/String;
    .locals 2

    .prologue
    .line 284
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->p()Ljava/lang/String;

    move-result-object v0

    .line 285
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 289
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->q()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private p()Ljava/lang/String;
    .locals 3

    .prologue
    .line 293
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 294
    invoke-direct {p0, v0}, Lcom/flurry/sdk/jc;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 295
    const/4 v0, 0x0

    .line 298
    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AND"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private q()Ljava/lang/String;
    .locals 2

    .prologue
    .line 302
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->s()Ljava/lang/String;

    move-result-object v0

    .line 303
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 305
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->t()Ljava/lang/String;

    move-result-object v0

    .line 306
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 307
    invoke-direct {p0}, Lcom/flurry/sdk/jc;->r()Ljava/lang/String;

    move-result-object v0

    .line 309
    :cond_0
    invoke-direct {p0, v0}, Lcom/flurry/sdk/jc;->b(Ljava/lang/String;)V

    .line 311
    :cond_1
    return-object v0
.end method

.method private r()Ljava/lang/String;
    .locals 8

    .prologue
    const-wide/16 v6, 0x25

    .line 327
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/flurry/sdk/lm;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/flurry/sdk/lp;->i(Ljava/lang/String;)J

    move-result-wide v4

    mul-long/2addr v4, v6

    add-long/2addr v2, v4

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    .line 329
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ID"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x10

    invoke-static {v0, v1, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private s()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 360
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/flurry/sdk/jc;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 361
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    .line 375
    :cond_0
    :goto_0
    return-object v0

    .line 368
    :cond_1
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    :try_start_1
    invoke-direct {p0, v2}, Lcom/flurry/sdk/jc;->a(Ljava/io/DataInput;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 373
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    goto :goto_0

    .line 370
    :catch_0
    move-exception v1

    move-object v2, v0

    .line 371
    :goto_1
    const/4 v3, 0x6

    :try_start_2
    sget-object v4, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v5, "Error when loading deviceId"

    invoke-static {v3, v4, v5, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 373
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 370
    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private t()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 379
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    .line 380
    if-nez v1, :cond_1

    .line 412
    :cond_0
    :goto_0
    return-object v0

    .line 384
    :cond_1
    new-instance v2, Lcom/flurry/sdk/jc$3;

    invoke-direct {v2, p0}, Lcom/flurry/sdk/jc$3;-><init>(Lcom/flurry/sdk/jc;)V

    invoke-virtual {v1, v2}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v1

    .line 391
    if-eqz v1, :cond_0

    array-length v2, v1

    if-eqz v2, :cond_0

    .line 395
    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 397
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 398
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 405
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 406
    :try_start_1
    invoke-direct {p0, v2}, Lcom/flurry/sdk/jc;->b(Ljava/io/DataInput;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 410
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    goto :goto_0

    .line 407
    :catch_0
    move-exception v1

    move-object v2, v0

    .line 408
    :goto_1
    const/4 v3, 0x6

    :try_start_2
    sget-object v4, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v5, "Error when loading deviceId"

    invoke-static {v3, v4, v5, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 410
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 407
    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private u()Ljava/lang/String;
    .locals 1

    .prologue
    .line 442
    const-string v0, ".flurryb."

    return-object v0
.end method

.method private v()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 450
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 451
    const-string v1, "null"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 452
    const-string v1, "9774d56d682e549c"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 453
    const-string v1, "dead00beef"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 454
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private w()V
    .locals 6

    .prologue
    const/4 v5, 0x6

    .line 458
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 459
    if-nez v0, :cond_1

    .line 480
    :cond_0
    :goto_0
    return-void

    .line 463
    :cond_1
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    .line 465
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 467
    :try_start_0
    invoke-static {v0}, Lcom/flurry/sdk/lp;->f(Ljava/lang/String;)[B

    move-result-object v0

    .line 470
    if-eqz v0, :cond_2

    array-length v1, v0

    const/16 v2, 0x14

    if-ne v1, v2, :cond_2

    .line 471
    iput-object v0, p0, Lcom/flurry/sdk/jc;->i:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 477
    :catch_0
    move-exception v0

    sget-object v0, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v1, "Exception in generateHashedImei()"

    invoke-static {v5, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 473
    :cond_2
    const/4 v1, 0x6

    :try_start_1
    sget-object v2, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "sha1 is not 20 bytes long: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method private x()V
    .locals 4

    .prologue
    const/4 v3, 0x3

    .line 483
    invoke-virtual {p0}, Lcom/flurry/sdk/jc;->d()Ljava/lang/String;

    move-result-object v0

    .line 484
    if-eqz v0, :cond_0

    .line 485
    sget-object v1, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v2, "Fetched advertising id"

    invoke-static {v3, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 486
    iget-object v1, p0, Lcom/flurry/sdk/jc;->d:Ljava/util/Map;

    sget-object v2, Lcom/flurry/sdk/jk;->c:Lcom/flurry/sdk/jk;

    invoke-static {v0}, Lcom/flurry/sdk/lp;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    :cond_0
    invoke-virtual {p0}, Lcom/flurry/sdk/jc;->f()Ljava/lang/String;

    move-result-object v0

    .line 490
    if-eqz v0, :cond_1

    .line 491
    sget-object v1, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v2, "Fetched device id"

    invoke-static {v3, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 492
    iget-object v1, p0, Lcom/flurry/sdk/jc;->d:Ljava/util/Map;

    sget-object v2, Lcom/flurry/sdk/jk;->a:Lcom/flurry/sdk/jk;

    invoke-static {v0}, Lcom/flurry/sdk/lp;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    :cond_1
    invoke-virtual {p0}, Lcom/flurry/sdk/jc;->g()[B

    move-result-object v0

    .line 496
    if-eqz v0, :cond_2

    .line 497
    sget-object v1, Lcom/flurry/sdk/jc;->a:Ljava/lang/String;

    const-string v2, "Fetched hashed IMEI"

    invoke-static {v3, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 498
    iget-object v1, p0, Lcom/flurry/sdk/jc;->d:Ljava/util/Map;

    sget-object v2, Lcom/flurry/sdk/jk;->b:Lcom/flurry/sdk/jk;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    :cond_2
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 2

    .prologue
    .line 111
    sget-object v0, Lcom/flurry/sdk/jc$a;->f:Lcom/flurry/sdk/jc$a;

    iget-object v1, p0, Lcom/flurry/sdk/jc;->f:Lcom/flurry/sdk/jc$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jc$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/flurry/sdk/jc;->g:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v0, :cond_0

    .line 116
    const/4 v0, 0x0

    .line 119
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/flurry/sdk/jc;->g:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 123
    iget-object v1, p0, Lcom/flurry/sdk/jc;->g:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v1, :cond_1

    .line 127
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/flurry/sdk/jc;->g:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/flurry/sdk/jc;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g()[B
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/flurry/sdk/jc;->i:[B

    return-object v0
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/flurry/sdk/jk;",
            "[B>;"
        }
    .end annotation

    .prologue
    .line 139
    iget-object v0, p0, Lcom/flurry/sdk/jc;->d:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
