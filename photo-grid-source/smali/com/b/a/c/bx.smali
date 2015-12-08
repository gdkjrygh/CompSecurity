.class final Lcom/b/a/c/bx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/File;Ljava/io/FilenameFilter;ILjava/util/Comparator;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/io/FilenameFilter;",
            "I",
            "Ljava/util/Comparator",
            "<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    array-length v0, v2

    if-le v0, p2, :cond_0

    .line 23
    invoke-static {v2, p3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 24
    array-length v1, v2

    .line 25
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 27
    if-gt v1, p2, :cond_1

    .line 34
    :cond_0
    return-void

    .line 30
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 31
    add-int/lit8 v1, v1, -0x1

    .line 25
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
