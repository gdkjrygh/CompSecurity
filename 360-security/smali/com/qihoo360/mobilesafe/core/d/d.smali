.class public Lcom/qihoo360/mobilesafe/core/d/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:I

.field private static b:I

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 18
    sput v0, Lcom/qihoo360/mobilesafe/core/d/d;->b:I

    .line 20
    sput v0, Lcom/qihoo360/mobilesafe/core/d/d;->c:I

    .line 21
    sput v0, Lcom/qihoo360/mobilesafe/core/d/d;->a:I

    .line 117
    return-void
.end method

.method public static a()I
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 121
    const/4 v2, 0x0

    .line 123
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/FileReader;

    const-string/jumbo v4, "/proc/meminfo"

    invoke-direct {v0, v4}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 125
    const-string/jumbo v2, "\\s+"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 126
    const/4 v2, 0x1

    aget-object v0, v0, v2

    .line 127
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v4

    move v2, v3

    .line 128
    :goto_0
    if-lt v3, v4, :cond_2

    .line 137
    :cond_0
    if-eqz v1, :cond_4

    .line 138
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move v0, v2

    .line 147
    :goto_1
    if-nez v0, :cond_1

    .line 148
    const/high16 v0, 0x100000

    .line 151
    :cond_1
    return v0

    .line 129
    :cond_2
    :try_start_3
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 130
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result v6

    if-eqz v6, :cond_0

    .line 131
    mul-int/lit8 v2, v2, 0xa

    add-int/lit8 v5, v5, -0x30

    add-int/2addr v2, v5

    .line 128
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    move-object v1, v2

    move v2, v3

    .line 137
    :goto_2
    if-eqz v1, :cond_3

    .line 138
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 140
    :cond_3
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 142
    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_1

    .line 136
    :catchall_1
    move-exception v0

    move v2, v3

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_2

    :cond_4
    move v0, v2

    goto :goto_1
.end method

.method public static a(I)I
    .locals 6

    .prologue
    .line 32
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/FileReader;

    .line 33
    const-string/jumbo v2, "/proc/%d/oom_adj"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    .line 32
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 34
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 40
    :goto_0
    return v0

    .line 37
    :catch_0
    move-exception v0

    .line 40
    const v0, 0x7fffffff

    goto :goto_0
.end method
