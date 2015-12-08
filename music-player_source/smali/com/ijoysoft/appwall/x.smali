.class public final Lcom/ijoysoft/appwall/x;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/util/Properties;


# direct methods
.method public static a()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/ijoysoft/appwall/x;->a:Ljava/util/Properties;

    const-string v1, "BASE_URL"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    new-instance v1, Ljava/util/Properties;

    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v2, "pop.properties"

    invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sput-object v1, Lcom/ijoysoft/appwall/x;->a:Ljava/util/Properties;

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/ijoysoft/appwall/x;->a:Ljava/util/Properties;

    const-string v1, "SECOND_BASE_URL"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/ijoysoft/appwall/x;->a:Ljava/util/Properties;

    const-string v1, "LIST_FILE_NAME"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/ijoysoft/appwall/x;->a:Ljava/util/Properties;

    const-string v1, "SECOND_LIST_FILE_NAME"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
