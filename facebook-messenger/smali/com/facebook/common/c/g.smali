.class public Lcom/facebook/common/c/g;
.super Ljava/lang/Object;
.source "LogFileUtils.java"


# static fields
.field private static final a:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 18
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd-HHmmss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/common/c/g;->a:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/File;)Lcom/facebook/common/c/f;
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v0, 0x0

    .line 26
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 27
    const-string v2, "-"

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 28
    array-length v1, v3

    if-eq v1, v4, :cond_0

    .line 36
    :goto_0
    return-object v0

    .line 32
    :cond_0
    :try_start_0
    const-string v1, "UNKNOWN"

    const/4 v2, 0x1

    aget-object v2, v3, v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v2, v0

    .line 33
    :goto_1
    sget-object v1, Lcom/facebook/common/c/g;->a:Ljava/text/SimpleDateFormat;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 34
    new-instance v1, Lcom/facebook/common/c/f;

    invoke-direct {v1, p0, v3, v2}, Lcom/facebook/common/c/f;-><init>(Ljava/io/File;Ljava/util/Date;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x1

    aget-object v1, v3, v1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v1

    goto :goto_1

    .line 35
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Ljava/io/File;
    .locals 4

    .prologue
    .line 41
    if-eqz p2, :cond_0

    .line 42
    :goto_0
    invoke-static {p3}, Lcom/facebook/common/c/g;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 43
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1

    .line 41
    :cond_0
    const-string p2, "UNKNOWN"

    goto :goto_0
.end method

.method public static a(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/common/c/g;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/common/c/f;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    new-instance v0, Lcom/facebook/common/c/h;

    invoke-direct {v0}, Lcom/facebook/common/c/h;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 61
    return-void
.end method
