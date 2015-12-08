.class public final Lcom/roidapp/photogrid/release/ll;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Void;",
        "Landroid/util/SparseArray",
        "<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/roidapp/photogrid/release/lo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/release/lo;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ll;->a:Landroid/content/Context;

    .line 26
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ll;->b:Lcom/roidapp/photogrid/release/lo;

    .line 27
    return-void
.end method

.method private static a(Ljava/lang/String;)Landroid/util/SparseArray;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 89
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 91
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 92
    const-string v2, "data"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 93
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 94
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 95
    const-string v4, "id"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    const-string v5, "templateName"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 101
    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method private static a(Landroid/content/Context;I)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 53
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v4

    invoke-virtual {v4, p0, p1}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;I)Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 60
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 64
    :catch_0
    move-exception v1

    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    if-eqz v2, :cond_0

    .line 68
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 72
    :cond_0
    :goto_2
    return-object v0

    .line 62
    :cond_1
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result-object v0

    .line 68
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_2

    .line 66
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_3
    if-eqz v2, :cond_2

    .line 68
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 69
    :cond_2
    :goto_4
    throw v0

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_4

    .line 66
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 64
    :catch_4
    move-exception v1

    move-object v2, v0

    goto :goto_1
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 19
    check-cast p1, [Ljava/lang/Integer;

    .line 2032
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ll;->a:Landroid/content/Context;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 2081
    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ll;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ll;->a(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    .line 19
    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 19
    check-cast p1, Landroid/util/SparseArray;

    .line 1038
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onPostExecute(Ljava/lang/Object;)V

    .line 1039
    if-eqz p1, :cond_0

    .line 1040
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ln;->a(Landroid/util/SparseArray;)V

    .line 1041
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ll;->b:Lcom/roidapp/photogrid/release/lo;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/lo;->d()V

    :goto_0
    return-void

    .line 1043
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ll;->b:Lcom/roidapp/photogrid/release/lo;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/lo;->e()V

    goto :goto_0
.end method
