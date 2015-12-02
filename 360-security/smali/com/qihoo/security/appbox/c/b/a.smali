.class public Lcom/qihoo/security/appbox/c/b/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/android/volley/e;

.field private static b:Lcom/android/volley/toolbox/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    invoke-static {}, Lcom/qihoo/security/appbox/c/b/a;->b()Lcom/android/volley/e;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/appbox/c/b/a;->a:Lcom/android/volley/e;

    .line 29
    sget-object v0, Lcom/qihoo/security/appbox/c/b/a;->a:Lcom/android/volley/e;

    invoke-virtual {v0}, Lcom/android/volley/e;->d()Lcom/android/volley/a;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/c;

    sput-object v0, Lcom/qihoo/security/appbox/c/b/a;->b:Lcom/android/volley/toolbox/c;

    return-void
.end method

.method public static a()Lcom/android/volley/e;
    .locals 1

    .prologue
    .line 72
    sget-object v0, Lcom/qihoo/security/appbox/c/b/a;->a:Lcom/android/volley/e;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .prologue
    .line 59
    const-string/jumbo v0, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    .line 68
    :goto_0
    return-object v0

    .line 65
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "/360/security/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 66
    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .prologue
    .line 87
    sget-object v0, Lcom/qihoo/security/appbox/c/b/a;->b:Lcom/android/volley/toolbox/c;

    invoke-virtual {v0, p0}, Lcom/android/volley/toolbox/c;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/android/volley/Request;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 76
    if-eqz p1, :cond_0

    .line 77
    invoke-virtual {p0, p1}, Lcom/android/volley/Request;->a(Ljava/lang/Object;)Lcom/android/volley/Request;

    .line 79
    :cond_0
    sget-object v0, Lcom/qihoo/security/appbox/c/b/a;->a:Lcom/android/volley/e;

    invoke-virtual {v0, p0}, Lcom/android/volley/e;->a(Lcom/android/volley/Request;)Lcom/android/volley/Request;

    .line 80
    return-void
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 83
    sget-object v0, Lcom/qihoo/security/appbox/c/b/a;->a:Lcom/android/volley/e;

    invoke-virtual {v0, p0}, Lcom/android/volley/e;->a(Ljava/lang/Object;)V

    .line 84
    return-void
.end method

.method private static b()Lcom/android/volley/e;
    .locals 4

    .prologue
    .line 35
    new-instance v0, Lcom/android/volley/e;

    invoke-static {}, Lcom/qihoo/security/appbox/c/b/a;->c()Lcom/android/volley/a;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/appbox/c/a;

    new-instance v3, Lcom/android/volley/toolbox/f;

    invoke-direct {v3}, Lcom/android/volley/toolbox/f;-><init>()V

    invoke-direct {v2, v3}, Lcom/qihoo/security/appbox/c/a;-><init>(Lcom/android/volley/toolbox/e;)V

    invoke-direct {v0, v1, v2}, Lcom/android/volley/e;-><init>(Lcom/android/volley/a;Lcom/android/volley/g;)V

    .line 37
    invoke-virtual {v0}, Lcom/android/volley/e;->a()V

    .line 38
    return-object v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 91
    invoke-static {p0}, Lcom/qihoo/security/appbox/c/b/a;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 92
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_0
.end method

.method private static c()Lcom/android/volley/a;
    .locals 3

    .prologue
    .line 42
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "cache"

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/c/b/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 46
    new-instance v1, Lcom/android/volley/toolbox/c;

    const/high16 v2, 0xa00000

    invoke-direct {v1, v0, v2}, Lcom/android/volley/toolbox/c;-><init>(Ljava/io/File;I)V

    return-object v1
.end method
