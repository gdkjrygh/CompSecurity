.class public Lcom/qihoo/security/ui/result/card/a/b;
.super Lcom/qihoo360/common/utils/IniProperties;
.source "360Security"


# static fields
.field public static a:Lcom/qihoo/security/ui/result/card/a/b;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/result/card/a/b;->a:Lcom/qihoo/security/ui/result/card/a/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 38
    invoke-direct {p0}, Lcom/qihoo360/common/utils/IniProperties;-><init>()V

    .line 28
    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/a/b;->b:Ljava/lang/String;

    .line 29
    iput-object v0, p0, Lcom/qihoo/security/ui/result/card/a/b;->c:Landroid/content/Context;

    .line 39
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/result/card/a/b;->c:Landroid/content/Context;

    .line 71
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/a/b;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string/jumbo v2, "card_cfg.ini"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v0

    .line 76
    :goto_0
    if-eqz v0, :cond_0

    .line 78
    :try_start_1
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/card/a/b;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 87
    :cond_0
    :goto_1
    return-void

    .line 79
    :catch_0
    move-exception v1

    .line 82
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    .line 83
    :catch_1
    move-exception v0

    goto :goto_1

    .line 81
    :catchall_0
    move-exception v1

    .line 82
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 84
    :goto_2
    throw v1

    .line 83
    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_2

    .line 72
    :catch_4
    move-exception v1

    goto :goto_0
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/ui/result/card/a/b;
    .locals 2

    .prologue
    .line 32
    const-class v1, Lcom/qihoo/security/ui/result/card/a/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/card/a/b;->a:Lcom/qihoo/security/ui/result/card/a/b;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lcom/qihoo/security/ui/result/card/a/b;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/card/a/b;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/card/a/b;->a:Lcom/qihoo/security/ui/result/card/a/b;

    .line 35
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/card/a/b;->a:Lcom/qihoo/security/ui/result/card/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 32
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 90
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 92
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/card/a/b;->sections()Ljava/util/Iterator;

    move-result-object v1

    .line 93
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 95
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 96
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/result/card/a/b;->properties(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v3

    .line 97
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 98
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 99
    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/card/a/b;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 100
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 104
    invoke-virtual {v2, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 111
    :cond_2
    return-object v2
.end method
