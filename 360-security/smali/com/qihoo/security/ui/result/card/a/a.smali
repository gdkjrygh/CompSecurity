.class public Lcom/qihoo/security/ui/result/card/a/a;
.super Lcom/qihoo360/common/utils/IniProperties;
.source "360Security"


# static fields
.field public static a:Lcom/qihoo/security/ui/result/card/a/a;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/result/card/a/a;->a:Lcom/qihoo/security/ui/result/card/a/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/qihoo360/common/utils/IniProperties;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/a/a;->b:Landroid/content/Context;

    .line 34
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/a/a;->b:Landroid/content/Context;

    .line 35
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/card/a/a;->b()V

    .line 36
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/ui/result/card/a/a;
    .locals 2

    .prologue
    .line 27
    const-class v1, Lcom/qihoo/security/ui/result/card/a/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/card/a/a;->a:Lcom/qihoo/security/ui/result/card/a/a;

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Lcom/qihoo/security/ui/result/card/a/a;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/card/a/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/card/a/a;->a:Lcom/qihoo/security/ui/result/card/a/a;

    .line 30
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/card/a/a;->a:Lcom/qihoo/security/ui/result/card/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 27
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/card/a/a;->sections()Ljava/util/Iterator;

    move-result-object v1

    .line 65
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 67
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 68
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/result/card/a/a;->properties(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v3

    .line 69
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 70
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 71
    invoke-static {v1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 72
    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/card/a/a;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 73
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    move-object v0, v2

    .line 84
    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 42
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/a/a;->b:Landroid/content/Context;

    const-string/jumbo v1, "adv_p.dat"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->openLatestInputFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    sget-object v1, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->getDESDecryptInputStream(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 47
    :cond_0
    if-eqz v0, :cond_1

    .line 49
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/a/a;->load(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 61
    :cond_1
    :goto_0
    return-void

    .line 50
    :catch_0
    move-exception v1

    .line 53
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 54
    :catch_1
    move-exception v0

    goto :goto_0

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 55
    :goto_1
    throw v1

    .line 54
    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_1
.end method
