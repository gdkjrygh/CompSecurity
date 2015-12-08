.class final Lcom/a/a/c/ar;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/io/File;

.field private c:Lb/a/a/a/a/b/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/a/a/c/ar;-><init>(Landroid/content/Context;Ljava/io/File;B)V

    .line 30
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/io/File;B)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/a/a/c/ar;->a:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lcom/a/a/c/ar;->b:Ljava/io/File;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    .line 37
    return-void
.end method

.method private c()Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 63
    iget-object v2, p0, Lcom/a/a/c/ar;->a:Landroid/content/Context;

    const-string v3, "com.crashlytics.CollectCustomLogs"

    invoke-static {v2, v3, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    .line 67
    if-nez v2, :cond_0

    .line 68
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 96
    :goto_0
    return v0

    .line 74
    :cond_0
    iget-object v2, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not close log file: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 76
    const/4 v3, 0x0

    .line 87
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "crashlytics-userlog-"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ".temp"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 88
    new-instance v2, Ljava/io/File;

    iget-object v5, p0, Lcom/a/a/c/ar;->b:Ljava/io/File;

    invoke-direct {v2, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    :try_start_1
    new-instance v3, Lb/a/a/a/a/b/w;

    invoke-direct {v3, v2}, Lb/a/a/a/a/b/w;-><init>(Ljava/io/File;)V

    iput-object v3, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    .line 90
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v1

    .line 96
    goto :goto_0

    .line 91
    :catch_0
    move-exception v1

    move-object v2, v3

    .line 92
    :goto_1
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Fabric"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Could not create log file: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v4, v2, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 91
    :catch_1
    move-exception v1

    goto :goto_1
.end method


# virtual methods
.method final a()Lcom/a/a/c/b;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 152
    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    if-nez v0, :cond_0

    .line 153
    const/4 v0, 0x0

    .line 180
    :goto_0
    return-object v0

    .line 159
    :cond_0
    const/4 v0, 0x1

    new-array v1, v0, [I

    aput v6, v1, v6

    .line 161
    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->a()I

    move-result v0

    new-array v2, v0, [B

    .line 164
    :try_start_0
    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    new-instance v3, Lcom/a/a/c/as;

    invoke-direct {v3, p0, v2, v1}, Lcom/a/a/c/as;-><init>(Lcom/a/a/c/ar;[B[I)V

    invoke-virtual {v0, v3}, Lb/a/a/a/a/b/w;->a(Lb/a/a/a/a/b/w$c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    :goto_1
    aget v0, v1, v6

    invoke-static {v2, v0}, Lcom/a/a/c/b;->a([BI)Lcom/a/a/c/b;

    move-result-object v0

    goto :goto_0

    .line 175
    :catch_0
    move-exception v0

    .line 176
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "A problem occurred while reading the Crashlytics log file."

    invoke-interface {v3, v4, v5, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(JLjava/lang/String;)V
    .locals 7

    .prologue
    .line 43
    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    if-nez v0, :cond_0

    .line 44
    invoke-direct {p0}, Lcom/a/a/c/ar;->c()Z

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    if-eqz v0, :cond_2

    if-nez p3, :cond_3

    const-string v0, "null"

    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x4000

    if-le v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "..."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit16 v2, v2, -0x4000

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    const-string v1, "\r"

    const-string v2, " "

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    const-string v2, " "

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "%d %s%n"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    invoke-virtual {v1, v0}, Lb/a/a/a/a/b/w;->a([B)V

    :goto_1
    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->a()I

    move-result v0

    const/high16 v1, 0x10000

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    invoke-virtual {v0}, Lb/a/a/a/a/b/w;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "There was a problem writing to the Crashlytics log."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    :cond_2
    return-void

    :cond_3
    move-object v0, p3

    goto :goto_0
.end method

.method final b()V
    .locals 2

    .prologue
    .line 184
    iget-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    const-string v1, "There was a problem closing the Crashlytics log file."

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/c/ar;->c:Lb/a/a/a/a/b/w;

    .line 186
    return-void
.end method
