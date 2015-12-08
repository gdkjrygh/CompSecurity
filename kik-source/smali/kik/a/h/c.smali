.class public Lkik/a/h/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/File;ZLorg/c/b;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 35
    .line 37
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 38
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    .line 39
    if-eqz p2, :cond_0

    .line 40
    const-string v1, "deleting {}, success: {}"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p2, v1, p0, v2}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    :cond_0
    :goto_0
    return v0

    .line 44
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 45
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    array-length v5, v4

    move v2, v1

    move v1, v0

    :goto_1
    if-ge v2, v5, :cond_2

    aget-object v3, v4, v2

    .line 47
    invoke-static {v3, v0, p2}, Lkik/a/h/c;->a(Ljava/io/File;ZLorg/c/b;)Z

    move-result v3

    and-int/2addr v3, v1

    .line 45
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v3

    goto :goto_1

    .line 49
    :cond_2
    if-eqz p1, :cond_5

    .line 50
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    .line 51
    if-eqz p2, :cond_3

    .line 52
    const-string v2, "deleting {}, success: {}"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {p2, v2, p0, v3}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    :cond_3
    and-int/2addr v0, v1

    .line 55
    goto :goto_0

    .line 59
    :cond_4
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_0
.end method
