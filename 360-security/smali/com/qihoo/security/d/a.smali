.class public Lcom/qihoo/security/d/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/qihoo360/common/utils/IniProperties;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    iput-object v0, p0, Lcom/qihoo/security/d/a;->a:Ljava/lang/String;

    .line 191
    new-instance v1, Lcom/qihoo360/common/utils/IniProperties;

    invoke-direct {v1}, Lcom/qihoo360/common/utils/IniProperties;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/d/a;->c:Lcom/qihoo360/common/utils/IniProperties;

    .line 50
    iput-object p1, p0, Lcom/qihoo/security/d/a;->b:Landroid/content/Context;

    .line 83
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/d/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string/jumbo v2, "config.ini"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 89
    :goto_0
    if-eqz v1, :cond_0

    .line 91
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/d/a;->c:Lcom/qihoo360/common/utils/IniProperties;

    invoke-virtual {v0, v1}, Lcom/qihoo360/common/utils/IniProperties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 101
    :cond_0
    :goto_1
    return-void

    .line 84
    :catch_0
    move-exception v1

    move-object v1, v0

    goto :goto_0

    .line 92
    :catch_1
    move-exception v0

    .line 95
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 96
    :catch_2
    move-exception v0

    goto :goto_1

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 97
    :goto_2
    throw v0

    .line 96
    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v1

    goto :goto_2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/qihoo/security/d/a;->c:Lcom/qihoo360/common/utils/IniProperties;

    invoke-virtual {v0, p1, p2}, Lcom/qihoo360/common/utils/IniProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
