.class public Lcom/arist/util/LrcRead;
.super Ljava/lang/Object;
.source "LrcRead.java"


# instance fields
.field private LyricList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Lyric;",
            ">;"
        }
    .end annotation
.end field

.field private files:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private lyric:Lcom/arist/entity/Lyric;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public GetLyric()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/arist/entity/Lyric;",
            ">;"
        }
    .end annotation

    .prologue
    .line 57
    iget-object v0, p0, Lcom/arist/util/LrcRead;->LyricList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public Read(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8
    .param p1, "file"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Lyric;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    .line 23
    const-string v0, ""

    .line 24
    .local v0, "Lrc_data":Ljava/lang/String;
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .local v2, "mFile":Ljava/io/File;
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    .line 26
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const-string v6, "UTF-8"

    invoke-direct {v4, v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 25
    invoke-direct {v1, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 27
    .local v1, "in":Ljava/io/BufferedReader;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/arist/util/LrcRead;->LyricList:Ljava/util/ArrayList;

    .line 28
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 41
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 42
    iget-object v4, p0, Lcom/arist/util/LrcRead;->LyricList:Ljava/util/ArrayList;

    return-object v4

    .line 29
    :cond_1
    const-string v4, ""

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 31
    const-string v4, "["

    const-string v5, ""

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 32
    const-string v4, "]"

    const-string v5, "@"

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 33
    const-string v4, "@"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 34
    .local v3, "splitLrc_data":[Ljava/lang/String;
    array-length v4, v3

    if-le v4, v7, :cond_0

    .line 35
    new-instance v4, Lcom/arist/entity/Lyric;

    invoke-direct {v4}, Lcom/arist/entity/Lyric;-><init>()V

    iput-object v4, p0, Lcom/arist/util/LrcRead;->lyric:Lcom/arist/entity/Lyric;

    .line 36
    iget-object v4, p0, Lcom/arist/util/LrcRead;->lyric:Lcom/arist/entity/Lyric;

    aget-object v5, v3, v7

    invoke-virtual {v4, v5}, Lcom/arist/entity/Lyric;->setLyric(Ljava/lang/String;)V

    .line 37
    iget-object v4, p0, Lcom/arist/util/LrcRead;->lyric:Lcom/arist/entity/Lyric;

    const/4 v5, 0x0

    aget-object v5, v3, v5

    invoke-virtual {p0, v5}, Lcom/arist/util/LrcRead;->TimeStr(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/arist/entity/Lyric;->setLyricTime(I)V

    .line 38
    iget-object v4, p0, Lcom/arist/util/LrcRead;->LyricList:Ljava/util/ArrayList;

    iget-object v5, p0, Lcom/arist/util/LrcRead;->lyric:Lcom/arist/entity/Lyric;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public TimeStr(Ljava/lang/String;)I
    .locals 6
    .param p1, "timeStr"    # Ljava/lang/String;

    .prologue
    .line 46
    const-string v4, ":"

    const-string v5, "."

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 47
    const-string v4, "."

    const-string v5, "@"

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 48
    const-string v4, "@"

    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 50
    .local v3, "timeData":[Ljava/lang/String;
    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 51
    .local v1, "minute":I
    const/4 v4, 0x1

    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 52
    .local v2, "second":I
    const/4 v4, 0x2

    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 53
    .local v0, "millisecond":I
    mul-int/lit8 v4, v1, 0x3c

    add-int/2addr v4, v2

    mul-int/lit16 v4, v4, 0x3e8

    mul-int/lit8 v5, v0, 0xa

    add-int/2addr v4, v5

    return v4
.end method

.method public findLyric(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .param p1, "musicTitle"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 63
    :try_start_0
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/arist/util/Constant;->BASE_LYRIC_PATH:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    .local v2, "parentFile":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_1

    .line 65
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 68
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 70
    .local v1, "lyricFiles":[Ljava/io/File;
    array-length v3, v1

    if-lez v3, :cond_2

    .line 71
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/arist/util/LrcRead;->files:Ljava/util/ArrayList;

    .line 72
    array-length v4, v1

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v4, :cond_3

    .line 78
    :cond_2
    iget-object v3, p0, Lcom/arist/util/LrcRead;->files:Ljava/util/ArrayList;

    .line 80
    .end local v1    # "lyricFiles":[Ljava/io/File;
    .end local v2    # "parentFile":Ljava/io/File;
    :goto_1
    return-object v3

    .line 72
    .restart local v1    # "lyricFiles":[Ljava/io/File;
    .restart local v2    # "parentFile":Ljava/io/File;
    :cond_3
    aget-object v0, v1, v3

    .line 73
    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 74
    iget-object v5, p0, Lcom/arist/util/LrcRead;->files:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 79
    .end local v0    # "f":Ljava/io/File;
    .end local v1    # "lyricFiles":[Ljava/io/File;
    .end local v2    # "parentFile":Ljava/io/File;
    :catch_0
    move-exception v3

    .line 80
    const/4 v3, 0x0

    goto :goto_1
.end method
