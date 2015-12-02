.class public Lcom/qihoo/a/a/a/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/qihoo/a/a/a/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/a/a/a/c;->a:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 51
    const-class v4, Lcom/qihoo/a/a/a/c;

    monitor-enter v4

    .line 53
    :try_start_0
    const-string/jumbo v5, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    const/4 v1, 0x0

    move-object v2, v0

    .line 59
    :goto_0
    :try_start_1
    sget-object v3, Lcom/qihoo/a/a/a/c;->c:Ljava/lang/String;

    sget-object v6, Lcom/qihoo/a/a/a/c;->b:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    invoke-static {p0, v3, v6}, Lcom/qihoo/a/a/a/b;->a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)Lcom/qihoo/a/a/a/b;

    move-result-object v3

    invoke-virtual {v3, p0}, Lcom/qihoo/a/a/a/b;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v3

    move-object v2, v0

    .line 68
    :goto_1
    if-nez v3, :cond_3

    add-int/lit8 v0, v1, 0x1

    const/4 v1, 0x3

    .line 57
    if-lt v0, v1, :cond_2

    .line 70
    :goto_2
    if-nez v3, :cond_1

    .line 71
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "clear module load fail..."

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v3, " retryCount:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 72
    const-string/jumbo v1, "oclt.jar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "oclt.jar"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 73
    const-string/jumbo v1, "oclt.dex"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "oclt.dex"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 74
    const-string/jumbo v1, " isMD5Equals: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "oclt.jar"

    .line 75
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    .line 76
    const-string/jumbo v5, "oclt.jar"

    .line 74
    invoke-static {p0, v1, v3, v5}, Lcom/qihoo/a/a/a/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 77
    if-nez v2, :cond_0

    .line 78
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 51
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 60
    :catch_0
    move-exception v0

    .line 62
    const-wide/16 v6, 0x64

    :try_start_3
    invoke-static {v6, v7}, Landroid/os/SystemClock;->sleep(J)V

    move-object v3, v2

    move-object v2, v0

    goto/16 :goto_1

    .line 80
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 83
    :cond_1
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-object v3

    :cond_2
    move v1, v0

    move-object v0, v2

    move-object v2, v3

    goto/16 :goto_0

    :cond_3
    move v0, v1

    goto/16 :goto_2
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x1

    .line 158
    .line 159
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 162
    :try_start_0
    const-string/jumbo v2, "xml"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 163
    :goto_0
    :try_start_1
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->getEventType()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v2

    if-ne v2, v4, :cond_1

    .line 184
    :goto_1
    if-eqz v1, :cond_0

    .line 185
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 188
    :cond_0
    :goto_2
    return-object v0

    .line 164
    :cond_1
    :try_start_2
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    .line 165
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 166
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 167
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    .line 168
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 169
    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/content/res/XmlResourceParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 177
    :cond_2
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->next()I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 179
    :catch_0
    move-exception v2

    .line 184
    :goto_3
    if-eqz v1, :cond_0

    .line 185
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    goto :goto_2

    .line 183
    :catchall_0
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    .line 184
    :goto_4
    if-eqz v1, :cond_3

    .line 185
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 187
    :cond_3
    throw v0

    .line 183
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 179
    :catch_1
    move-exception v1

    move-object v1, v0

    goto :goto_3
.end method

.method public static a(Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)V
    .locals 0

    .prologue
    .line 41
    sput-object p0, Lcom/qihoo/a/a/a/c;->c:Ljava/lang/String;

    .line 42
    sput-object p1, Lcom/qihoo/a/a/a/c;->b:Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;

    .line 43
    return-void
.end method

.method public static b(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;
    .locals 2

    .prologue
    .line 89
    invoke-static {p0}, Lcom/qihoo/a/a/a/c;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    move-result-object v0

    .line 90
    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/IClearModule;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;
    .locals 3

    .prologue
    .line 95
    const/4 v1, 0x0

    .line 98
    :try_start_0
    invoke-static {p0}, Lcom/qihoo/a/a/a/c;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    move-result-object v0

    .line 99
    const-class v2, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;

    invoke-interface {v0, v2}, Lcom/qihoo360/mobilesafe/opti/i/IClearModule;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :goto_0
    return-object v0

    .line 101
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method public static d(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;
    .locals 2

    .prologue
    .line 128
    invoke-static {p0}, Lcom/qihoo/a/a/a/c;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    move-result-object v0

    .line 130
    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/IClearModule;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;

    .line 131
    if-eqz v0, :cond_0

    .line 132
    invoke-interface {v0, p0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;->init(Landroid/content/Context;)V

    .line 134
    :cond_0
    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;
    .locals 2

    .prologue
    .line 153
    invoke-static {p0}, Lcom/qihoo/a/a/a/c;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    move-result-object v0

    .line 154
    const-class v1, Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/IClearModule;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;

    return-object v0
.end method
