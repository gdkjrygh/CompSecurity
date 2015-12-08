.class public Lcom/arist/util/DownloadMusicUtil;
.super Ljava/lang/Object;
.source "DownloadMusicUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDownloadMusicsCount()I
    .locals 1

    .prologue
    .line 27
    invoke-static {}, Lcom/arist/util/DownloadMusicUtil;->getDownloadMusicsTitle()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public static getDownloadMusicsTitle()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 11
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .local v3, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :try_start_0
    new-instance v2, Ljava/io/File;

    sget-object v5, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .local v2, "file":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_0

    .line 15
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 16
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v4

    .line 17
    .local v4, "path":[Ljava/lang/String;
    array-length v6, v4

    const/4 v5, 0x0

    :goto_0
    if-lt v5, v6, :cond_1

    .line 23
    .end local v2    # "file":Ljava/io/File;
    .end local v4    # "path":[Ljava/lang/String;
    :goto_1
    return-object v3

    .line 17
    .restart local v2    # "file":Ljava/io/File;
    .restart local v4    # "path":[Ljava/lang/String;
    :cond_1
    aget-object v1, v4, v5

    .line 18
    .local v1, "f":Ljava/lang/String;
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 20
    .end local v1    # "f":Ljava/lang/String;
    .end local v2    # "file":Ljava/io/File;
    .end local v4    # "path":[Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 21
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method
