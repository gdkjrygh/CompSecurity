.class public Lcom/qihoo/antivirus/update/UpdatePatchInstall;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->a:Z

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 38
    sget-boolean v0, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->a:Z

    if-nez v0, :cond_1

    .line 39
    const-string/jumbo v0, "patch"

    invoke-static {p0, v0}, Lcom/qihoo/antivirus/update/ae;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 44
    const/4 v0, -0x2

    .line 77
    :goto_0
    return v0

    .line 46
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->a:Z

    .line 49
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 50
    if-nez v0, :cond_2

    .line 54
    const/4 v0, -0x3

    goto :goto_0

    .line 58
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 65
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 70
    invoke-static {v3, p1, v0, p2}, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->patch(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 76
    :cond_3
    invoke-static {p1}, Lcom/qihoo/antivirus/update/af;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 59
    :catch_0
    move-exception v0

    .line 63
    const/4 v0, -0x4

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 17
    sget-boolean v0, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->a:Z

    if-nez v0, :cond_2

    .line 18
    const-string/jumbo v0, "patch"

    invoke-static {p0, v0}, Lcom/qihoo/antivirus/update/ae;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 23
    const/4 v0, -0x2

    .line 34
    :cond_0
    :goto_0
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->a:Z

    .line 28
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p3}, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->patch(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 29
    if-eqz v0, :cond_0

    goto :goto_0
.end method

.method private static native patch(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method
