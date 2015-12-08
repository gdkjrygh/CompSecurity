.class public final Lorg/a/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:C

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 97
    sget-char v0, Ljava/io/File;->separatorChar:C

    sput-char v0, Lorg/a/a/a/c;->a:C

    .line 112
    new-instance v0, Ljava/io/StringWriter;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 113
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 114
    invoke-virtual {v1}, Ljava/io/PrintWriter;->println()V

    .line 115
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/a/a/a/c;->b:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 6

    .prologue
    const/4 v2, -0x1

    .line 999
    const/16 v0, 0x1000

    new-array v3, v0, [B

    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-eq v2, v4, :cond_0

    const/4 v5, 0x0

    invoke-virtual {p1, v3, v5, v4}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v4, v4

    add-long/2addr v0, v4

    goto :goto_0

    .line 1000
    :cond_0
    const-wide/32 v4, 0x7fffffff

    cmp-long v3, v0, v4

    if-lez v3, :cond_1

    move v0, v2

    .line 1003
    :goto_1
    return v0

    :cond_1
    long-to-int v0, v0

    goto :goto_1
.end method

.method private static a(Ljava/io/Reader;Ljava/io/Writer;)J
    .locals 6

    .prologue
    .line 1125
    const/16 v0, 0x1000

    new-array v2, v0, [C

    .line 1126
    const-wide/16 v0, 0x0

    .line 1127
    :goto_0
    const/4 v3, -0x1

    invoke-virtual {p0, v2}, Ljava/io/Reader;->read([C)I

    move-result v4

    if-eq v3, v4, :cond_0

    .line 1129
    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v4}, Ljava/io/Writer;->write([CII)V

    .line 1130
    int-to-long v4, v4

    add-long/2addr v0, v4

    goto :goto_0

    .line 1132
    :cond_0
    return-wide v0
.end method

.method public static a(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 177
    if-eqz p0, :cond_0

    .line 178
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 195
    if-eqz p0, :cond_0

    .line 196
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static b(Ljava/io/InputStream;)[B
    .locals 1

    .prologue
    .line 217
    new-instance v0, Lorg/a/a/a/a/a;

    invoke-direct {v0}, Lorg/a/a/a/a/a;-><init>()V

    .line 218
    invoke-static {p0, v0}, Lorg/a/a/a/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 219
    invoke-virtual {v0}, Lorg/a/a/a/a/a;->a()[B

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 358
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 359
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v1, v0}, Lorg/a/a/a/c;->a(Ljava/io/Reader;Ljava/io/Writer;)J

    .line 360
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
