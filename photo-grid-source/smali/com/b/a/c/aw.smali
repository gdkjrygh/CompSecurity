.class final Lcom/b/a/c/aw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/b/a/c/ax;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/io/File;

.field private d:Lcom/b/a/c/av;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 20
    new-instance v0, Lcom/b/a/c/ax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/b/a/c/ax;-><init>(B)V

    sput-object v0, Lcom/b/a/c/aw;->a:Lcom/b/a/c/ax;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/b/a/c/aw;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/b/a/c/aw;->b:Landroid/content/Context;

    .line 35
    new-instance v0, Ljava/io/File;

    const-string v1, "log-files"

    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/b/a/c/aw;->c:Ljava/io/File;

    .line 36
    sget-object v0, Lcom/b/a/c/aw;->a:Lcom/b/a/c/ax;

    iput-object v0, p0, Lcom/b/a/c/aw;->d:Lcom/b/a/c/av;

    .line 37
    invoke-virtual {p0, p3}, Lcom/b/a/c/aw;->a(Ljava/lang/String;)V

    .line 38
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/c/b;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/b/a/c/aw;->d:Lcom/b/a/c/av;

    invoke-interface {v0}, Lcom/b/a/c/av;->a()Lcom/b/a/c/b;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 45
    iget-object v0, p0, Lcom/b/a/c/aw;->d:Lcom/b/a/c/av;

    invoke-interface {v0}, Lcom/b/a/c/av;->b()V

    .line 46
    sget-object v0, Lcom/b/a/c/aw;->a:Lcom/b/a/c/ax;

    iput-object v0, p0, Lcom/b/a/c/aw;->d:Lcom/b/a/c/av;

    .line 48
    if-nez p1, :cond_0

    .line 59
    :goto_0
    return-void

    .line 1126
    :cond_0
    iget-object v0, p0, Lcom/b/a/c/aw;->b:Landroid/content/Context;

    const-string v1, "com.crashlytics.CollectCustomLogs"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_0

    .line 2120
    :cond_1
    iget-object v0, p0, Lcom/b/a/c/aw;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2121
    iget-object v0, p0, Lcom/b/a/c/aw;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 2106
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "crashlytics-userlog-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2107
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/b/a/c/aw;->c:Ljava/io/File;

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 3101
    new-instance v0, Lcom/b/a/c/bo;

    invoke-direct {v0, v1}, Lcom/b/a/c/bo;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lcom/b/a/c/aw;->d:Lcom/b/a/c/av;

    goto :goto_0
.end method

.method public final a(Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lcom/b/a/c/aw;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_2

    aget-object v4, v2, v1

    .line 3111
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 3112
    const-string v5, ".temp"

    invoke-virtual {v0, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v5

    .line 3113
    const/4 v6, -0x1

    if-ne v5, v6, :cond_1

    .line 90
    :goto_1
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 89
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 3116
    :cond_1
    const/16 v6, 0x14

    invoke-virtual {v0, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 95
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/b/a/c/aw;->d:Lcom/b/a/c/av;

    invoke-interface {v0}, Lcom/b/a/c/av;->c()V

    .line 80
    return-void
.end method
