.class public Lcom/qihoo/security/c/a;
.super Lcom/qihoo/security/c/b;
.source "360Security"


# static fields
.field public static c:I

.field public static d:I

.field public static e:I

.field private static j:I

.field private static k:I

.field private static l:I

.field private static m:I

.field private static n:I

.field private static o:I

.field private static p:Z


# instance fields
.field public a:Landroid/content/pm/ApplicationInfo;

.field public b:I

.field f:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x2

    const/4 v1, 0x0

    .line 56
    const/high16 v0, 0x20000000

    sput v0, Lcom/qihoo/security/c/a;->j:I

    .line 57
    const/high16 v0, 0x40000

    sput v0, Lcom/qihoo/security/c/a;->k:I

    .line 59
    sput v4, Lcom/qihoo/security/c/a;->l:I

    .line 60
    sput v1, Lcom/qihoo/security/c/a;->m:I

    .line 61
    const/4 v0, -0x1

    sput v0, Lcom/qihoo/security/c/a;->n:I

    .line 63
    sput v4, Lcom/qihoo/security/c/a;->o:I

    .line 65
    sput-boolean v1, Lcom/qihoo/security/c/a;->p:Z

    .line 70
    :try_start_0
    const-string/jumbo v0, "android.content.pm.ApplicationInfo"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 71
    const-string/jumbo v1, "FLAG_FORWARD_LOCK"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v1

    sput v1, Lcom/qihoo/security/c/a;->j:I

    .line 73
    const-string/jumbo v1, "FLAG_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    sput v0, Lcom/qihoo/security/c/a;->k:I

    .line 76
    const-string/jumbo v0, "android.content.pm.PackageInfo"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 77
    const-string/jumbo v1, "INSTALL_LOCATION_PREFER_EXTERNAL"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v1

    sput v1, Lcom/qihoo/security/c/a;->l:I

    .line 79
    const-string/jumbo v1, "INSTALL_LOCATION_AUTO"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v1

    sput v1, Lcom/qihoo/security/c/a;->m:I

    .line 81
    const-string/jumbo v1, "INSTALL_LOCATION_UNSPECIFIED"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    sput v0, Lcom/qihoo/security/c/a;->n:I

    .line 84
    const-string/jumbo v0, "com.android.internal.content.PackageHelper"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 85
    const-string/jumbo v1, "APP_INSTALL_EXTERNAL"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    sput v0, Lcom/qihoo/security/c/a;->o:I

    .line 89
    const-string/jumbo v0, "android.app.ActivityThread"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 90
    const-string/jumbo v1, "android.content.pm.IPackageManager"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 92
    const-string/jumbo v2, "getPackageManager"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 95
    const-string/jumbo v2, "getInstallLocation"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 96
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 97
    sget v1, Lcom/qihoo/security/c/a;->o:I

    if-ne v0, v1, :cond_0

    .line 98
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/c/a;->p:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :cond_0
    :goto_0
    sput v5, Lcom/qihoo/security/c/a;->c:I

    .line 106
    sput v4, Lcom/qihoo/security/c/a;->d:I

    .line 107
    const/4 v0, 0x3

    sput v0, Lcom/qihoo/security/c/a;->e:I

    return-void

    .line 101
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/pm/ApplicationInfo;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/qihoo/security/c/b;-><init>()V

    .line 48
    const/4 v0, 0x7

    iput v0, p0, Lcom/qihoo/security/c/a;->b:I

    .line 109
    sget v0, Lcom/qihoo/security/c/a;->c:I

    iput v0, p0, Lcom/qihoo/security/c/a;->f:I

    .line 53
    iput-object p1, p0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    .line 54
    return-void
.end method
