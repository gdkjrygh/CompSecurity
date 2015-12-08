.class public Lcom/cleanmaster/func/process/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:J

.field private static b:Ljava/lang/reflect/Method;

.field private static c:Ljava/lang/reflect/Method;

.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 83
    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/cleanmaster/func/process/b;->a:J

    .line 138
    sput-object v2, Lcom/cleanmaster/func/process/b;->b:Ljava/lang/reflect/Method;

    .line 158
    sput-object v2, Lcom/cleanmaster/func/process/b;->c:Ljava/lang/reflect/Method;

    .line 202
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cleanmaster/func/process/b;->d:Z

    return-void
.end method

.method public static a()J
    .locals 4

    .prologue
    .line 35
    sget-wide v0, Lcom/cleanmaster/func/process/b;->a:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 36
    sget-wide v0, Lcom/cleanmaster/func/process/b;->a:J

    .line 40
    :goto_0
    return-wide v0

    .line 39
    :cond_0
    invoke-static {}, Lcom/cleanmaster/func/process/b;->b()Lcom/cleanmaster/func/process/IPhoneMemoryInfo;

    move-result-object v0

    invoke-interface {v0}, Lcom/cleanmaster/func/process/IPhoneMemoryInfo;->a()J

    move-result-wide v0

    .line 40
    sput-wide v0, Lcom/cleanmaster/func/process/b;->a:J

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .prologue
    .line 179
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 180
    const/4 v0, 0x0

    .line 182
    :try_start_0
    invoke-virtual {v1, p0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 186
    :goto_0
    return-object v0

    .line 184
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public static b()Lcom/cleanmaster/func/process/IPhoneMemoryInfo;
    .locals 6

    .prologue
    .line 57
    new-instance v0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;

    invoke-static {}, Lcom/cleanmaster/func/process/c;->a()J

    move-result-wide v2

    invoke-static {}, Lcom/cleanmaster/func/process/c;->b()J

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/cleanmaster/func/process/PhoneMemoryInfo;-><init>(JJ)V

    .line 60
    sget-wide v2, Lcom/cleanmaster/func/process/b;->a:J

    invoke-interface {v0}, Lcom/cleanmaster/func/process/IPhoneMemoryInfo;->a()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    const-wide/16 v2, 0x0

    invoke-interface {v0}, Lcom/cleanmaster/func/process/IPhoneMemoryInfo;->a()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    .line 61
    invoke-interface {v0}, Lcom/cleanmaster/func/process/IPhoneMemoryInfo;->a()J

    move-result-wide v2

    sput-wide v2, Lcom/cleanmaster/func/process/b;->a:J

    .line 64
    :cond_0
    return-object v0
.end method
