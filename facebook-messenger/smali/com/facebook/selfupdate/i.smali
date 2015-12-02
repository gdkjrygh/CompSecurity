.class public Lcom/facebook/selfupdate/i;
.super Ljava/lang/Object;
.source "SelfUpdateChecker.java"


# static fields
.field static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/common/process/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-string v0, "fbandroid_self_update"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/selfupdate/i;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/process/d;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/selfupdate/i;->b:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lcom/facebook/selfupdate/i;->c:Lcom/facebook/prefs/shared/d;

    .line 36
    iput-object p3, p0, Lcom/facebook/selfupdate/i;->d:Lcom/facebook/common/process/d;

    .line 37
    return-void
.end method

.method private a(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 86
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 88
    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 89
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 91
    :cond_0
    :goto_0
    return v0

    .line 90
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private c()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 74
    invoke-virtual {p0}, Lcom/facebook/selfupdate/i;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/selfupdate/i;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/i;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/selfupdate/i;->b:Landroid/content/Context;

    invoke-direct {p0, v1}, Lcom/facebook/selfupdate/i;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/selfupdate/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/selfupdate/i;->d:Lcom/facebook/common/process/d;

    iget-object v1, p0, Lcom/facebook/selfupdate/i;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/process/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 65
    :try_start_0
    iget-object v2, p0, Lcom/facebook/selfupdate/i;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "install_non_market_apps"

    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 70
    if-ne v2, v0, :cond_0

    :goto_0
    return v0

    .line 67
    :catch_0
    move-exception v0

    move v0, v1

    .line 68
    goto :goto_0

    :cond_0
    move v0, v1

    .line 70
    goto :goto_0
.end method
