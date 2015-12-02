.class public Lcom/facebook/orca/j/c;
.super Ljava/lang/Object;
.source "TempFileManager.java"


# static fields
.field private static b:Ljava/io/File;

.field private static c:Ljava/io/File;


# instance fields
.field private a:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const-wide/32 v0, 0x5265c00

    iput-wide v0, p0, Lcom/facebook/orca/j/c;->a:J

    .line 34
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "/orcatemp"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/j/c;->b:Ljava/io/File;

    .line 35
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "/orcatemp"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/j/c;->c:Ljava/io/File;

    .line 36
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 171
    invoke-direct {p0, p2}, Lcom/facebook/orca/j/c;->a(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 190
    :goto_0
    return-object v0

    .line 175
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 176
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v1

    .line 177
    goto :goto_0

    .line 182
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v1

    .line 183
    goto :goto_0

    .line 184
    :catch_0
    move-exception v1

    .line 185
    const-string v2, "Orca:TempFileManager"

    const-string v3, "Error occurred when creating the file %s in temporary directory %s."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 138
    invoke-direct {p0, p3}, Lcom/facebook/orca/j/c;->a(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 166
    :goto_0
    return-object v0

    .line 142
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 143
    :cond_1
    const-string p1, ""

    .line 146
    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_4

    .line 147
    :cond_3
    const-string p2, ".tmp"

    .line 151
    :cond_4
    const-string v2, ""

    .line 156
    :cond_5
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/common/time/c;->a()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "_tmp"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 157
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 158
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eqz v3, :cond_5

    move-object v0, v1

    .line 159
    goto :goto_0

    .line 160
    :catch_0
    move-exception v1

    .line 161
    const-string v3, "Orca:TempFileManager"

    const-string v4, "Error occurred when creating the temporary file %s in directory %s."

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-static {v4, v5}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a(Ljava/io/File;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 124
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 126
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    :goto_1
    return v1

    :cond_0
    move v0, v2

    .line 124
    goto :goto_0

    :cond_1
    move v1, v2

    .line 130
    goto :goto_1

    .line 134
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    goto :goto_1
.end method

.method private b(Ljava/io/File;)V
    .locals 10

    .prologue
    .line 200
    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/time/c;->a()J

    move-result-wide v1

    .line 204
    new-instance v0, Lcom/facebook/orca/j/d;

    invoke-direct {v0}, Lcom/facebook/orca/j/d;-><init>()V

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v3

    .line 205
    if-nez v3, :cond_1

    .line 214
    :cond_0
    return-void

    .line 209
    :cond_1
    array-length v4, v3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v3, v0

    .line 210
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    sub-long v6, v1, v6

    iget-wide v8, p0, Lcom/facebook/orca/j/c;->a:J

    cmp-long v6, v6, v8

    if-lez v6, :cond_2

    .line 211
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 209
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static b()Z
    .locals 2

    .prologue
    .line 195
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/File;
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/orca/j/c;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 87
    :cond_0
    sget-object v0, Lcom/facebook/orca/j/c;->b:Ljava/io/File;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    .line 89
    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/facebook/orca/j/c;->c:Ljava/io/File;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Z)Ljava/io/File;
    .locals 1

    .prologue
    .line 93
    if-nez p2, :cond_0

    invoke-static {}, Lcom/facebook/orca/j/c;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 94
    :cond_0
    sget-object v0, Lcom/facebook/orca/j/c;->b:Ljava/io/File;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    .line 96
    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/facebook/orca/j/c;->c:Ljava/io/File;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 117
    sget-object v0, Lcom/facebook/orca/j/c;->c:Ljava/io/File;

    invoke-direct {p0, v0}, Lcom/facebook/orca/j/c;->b(Ljava/io/File;)V

    .line 118
    sget-object v0, Lcom/facebook/orca/j/c;->b:Ljava/io/File;

    invoke-direct {p0, v0}, Lcom/facebook/orca/j/c;->b(Ljava/io/File;)V

    .line 119
    return-void
.end method

.method public b(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .prologue
    .line 100
    if-eqz p2, :cond_0

    sget-object v0, Lcom/facebook/orca/j/c;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 102
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 100
    :cond_0
    sget-object v0, Lcom/facebook/orca/j/c;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public c(Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 106
    if-eqz p2, :cond_0

    .line 107
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/facebook/orca/j/c;->b:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    .line 109
    :goto_0
    return v0

    :cond_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/facebook/orca/j/c;->c:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_0
.end method
