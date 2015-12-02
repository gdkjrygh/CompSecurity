.class public Lcom/qihoo/security/clearengine/sdk/a/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanProcess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/clearengine/sdk/a/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/clearengine/sdk/a/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/qihoo/security/clearengine/sdk/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/clearengine/sdk/a/a;->a:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    .line 231
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/a/a$1;-><init>(Lcom/qihoo/security/clearengine/sdk/a/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->e:Landroid/content/ServiceConnection;

    .line 43
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    .line 44
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a/a;->a()V

    .line 45
    return-void
.end method

.method private a()V
    .locals 6

    .prologue
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "o_c_s_h_df"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 54
    invoke-virtual {p0, v1}, Lcom/qihoo/security/clearengine/sdk/a/a;->b(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_apkpath_filter"

    const-string/jumbo v3, "null"

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/clearengine/d/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 58
    const-string/jumbo v0, "null"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 59
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;

    .line 62
    if-eqz v0, :cond_0

    .line 63
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcom/qihoo/security/clearengine/sdk/a/a$a;-><init>(Lcom/qihoo/security/clearengine/sdk/a/a;Lcom/qihoo/security/clearengine/sdk/a/a$a;)V

    .line 64
    iput-object v2, v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;->a:Ljava/lang/String;

    .line 65
    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    iput-wide v4, v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;->b:J

    .line 66
    iget-object v3, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    invoke-virtual {p0, v1}, Lcom/qihoo/security/clearengine/sdk/a/a;->a(Ljava/lang/String;)V

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    const-string/jumbo v1, "clear_apkpath_filter"

    const-string/jumbo v2, "null"

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/clearengine/d/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/sdk/a/a;Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    .line 95
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/clearengine/sdk/ApkScanService;

    const-string/jumbo v2, "ACTION_CLEAR_SERVICE"

    iget-object v3, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->e:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo/security/clearengine/sdk/c;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 96
    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    .line 213
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a/a;->b()V

    .line 214
    const/4 v0, 0x0

    .line 215
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    if-eqz v1, :cond_1

    .line 229
    :goto_0
    return-void

    .line 216
    :cond_1
    const-wide/16 v2, 0x64

    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    .line 217
    add-int/lit8 v0, v0, 0x64

    .line 219
    const/16 v1, 0x2710

    if-le v0, v1, :cond_0

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 123
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;

    .line 124
    if-eqz v0, :cond_0

    .line 125
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 127
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;->b:J

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    .line 128
    const/4 v0, 0x0

    .line 131
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 271
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 272
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 273
    new-instance v1, Lcom/qihoo/security/clearengine/sdk/a/a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/qihoo/security/clearengine/sdk/a/a$a;-><init>(Lcom/qihoo/security/clearengine/sdk/a/a;Lcom/qihoo/security/clearengine/sdk/a/a$a;)V

    .line 274
    iput-object p1, v1, Lcom/qihoo/security/clearengine/sdk/a/a$a;->a:Ljava/lang/String;

    .line 275
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/clearengine/sdk/a/a$a;->b:J

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "o_c_s_h_df"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 279
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/sdk/a/a;->a(Ljava/lang/String;)V

    .line 281
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 288
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 315
    :cond_0
    :goto_0
    return-void

    .line 292
    :cond_1
    const/4 v2, 0x0

    .line 294
    :try_start_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/FileWriter;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 296
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 304
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 308
    if-eqz v1, :cond_0

    .line 310
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 311
    :catch_0
    move-exception v0

    goto :goto_0

    .line 296
    :cond_2
    :try_start_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 297
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;

    .line 298
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;->a:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v4, v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;->b:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 299
    invoke-virtual {v1, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 305
    :catch_1
    move-exception v0

    .line 306
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 308
    if-eqz v1, :cond_0

    .line 310
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_0

    .line 311
    :catch_2
    move-exception v0

    goto :goto_0

    .line 307
    :catchall_0
    move-exception v0

    move-object v1, v2

    .line 308
    :goto_3
    if-eqz v1, :cond_3

    .line 310
    :try_start_6
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 314
    :cond_3
    :goto_4
    throw v0

    .line 311
    :catch_3
    move-exception v1

    goto :goto_4

    .line 307
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 305
    :catch_4
    move-exception v0

    move-object v1, v2

    goto :goto_2
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 321
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 322
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 360
    :cond_0
    :goto_0
    return-void

    .line 328
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/FileReader;

    invoke-direct {v3, v2}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    const/16 v2, 0x400

    invoke-direct {v1, v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    :cond_2
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v2

    if-eqz v2, :cond_3

    .line 351
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 357
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/16 v1, 0x32

    if-le v0, v1, :cond_0

    .line 358
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    goto :goto_0

    .line 334
    :cond_3
    :try_start_3
    const-string/jumbo v2, "\\|"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 335
    array-length v0, v2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_2

    .line 336
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;

    .line 337
    if-nez v0, :cond_2

    .line 338
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Lcom/qihoo/security/clearengine/sdk/a/a$a;-><init>(Lcom/qihoo/security/clearengine/sdk/a/a;Lcom/qihoo/security/clearengine/sdk/a/a$a;)V

    .line 339
    const/4 v3, 0x0

    aget-object v3, v2, v3

    iput-object v3, v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;->a:Ljava/lang/String;

    .line 340
    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/qihoo/security/clearengine/sdk/a/a$a;->b:J

    .line 341
    iget-object v3, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->d:Ljava/util/Map;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 345
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 351
    :goto_3
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    .line 352
    :catch_1
    move-exception v0

    goto :goto_2

    .line 349
    :catchall_0
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 351
    :goto_4
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 354
    :goto_5
    throw v0

    .line 352
    :catch_2
    move-exception v1

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_2

    .line 349
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 345
    :catch_4
    move-exception v1

    goto :goto_3
.end method

.method public create()I
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    if-nez v0, :cond_0

    .line 81
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a/a;->b()V

    .line 91
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 84
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;->create()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 85
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public destroy()I
    .locals 3

    .prologue
    .line 103
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    if-eqz v0, :cond_0

    .line 105
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;->destroy()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :cond_0
    :goto_0
    sget-object v0, Lcom/qihoo/security/clearengine/sdk/a/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->e:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    .line 113
    const/4 v0, 0x1

    return v0

    .line 106
    :catch_0
    move-exception v0

    .line 107
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method public declared-synchronized scanApk(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;
    .locals 4

    .prologue
    .line 139
    monitor-enter p0

    const/4 v0, 0x0

    .line 140
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    if-nez v1, :cond_0

    .line 141
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a/a;->c()V

    .line 145
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_apkpath_filter"

    invoke-static {v1, v2, p1}, Lcom/qihoo/security/clearengine/d/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    if-eqz v1, :cond_3

    .line 149
    invoke-direct {p0, p1}, Lcom/qihoo/security/clearengine/sdk/a/a;->c(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-eqz v1, :cond_1

    .line 151
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->c:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    invoke-interface {v1, p1}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;->scanApk(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 181
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 182
    :try_start_2
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;-><init>()V

    .line 183
    iput-object p1, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    .line 184
    new-instance v1, Ljava/io/File;

    iget-object v2, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->size:J

    .line 186
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->modifyTime:J

    .line 187
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;

    .line 188
    const/4 v1, 0x2

    iput v1, v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->dataType:I

    .line 204
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    const-string/jumbo v2, "clear_apkpath_filter"

    const-string/jumbo v3, "null"

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/clearengine/d/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 206
    monitor-exit p0

    return-object v0

    .line 152
    :catch_0
    move-exception v1

    .line 153
    const-wide/16 v2, 0x3e8

    :try_start_3
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    .line 158
    invoke-direct {p0, p1}, Lcom/qihoo/security/clearengine/sdk/a/a;->d(Ljava/lang/String;)V

    .line 160
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/a/a;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 139
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 194
    :cond_3
    :try_start_4
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    goto :goto_1

    .line 164
    :catch_1
    move-exception v1

    goto :goto_0
.end method
