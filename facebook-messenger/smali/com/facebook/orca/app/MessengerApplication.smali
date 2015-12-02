.class public Lcom/facebook/orca/app/MessengerApplication;
.super Lcom/facebook/base/a/j;
.source "MessengerApplication.java"

# interfaces
.implements Lcom/facebook/inject/aa;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/base/a/j",
        "<",
        "Lcom/facebook/orca/app/fa;",
        ">;",
        "Lcom/facebook/inject/aa;"
    }
.end annotation


# instance fields
.field private a:Lcom/facebook/config/a/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/base/a/j;-><init>()V

    return-void
.end method

.method private e()Lcom/facebook/config/a/a;
    .locals 7

    .prologue
    .line 62
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/orca/app/MessengerApplication;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 63
    const-string v1, "com.facebook.orca"

    const/16 v2, 0x40

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 65
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 66
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    aget-object v3, v1, v0

    .line 67
    invoke-virtual {v3}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/i;->b([B)Ljava/lang/String;

    move-result-object v3

    .line 68
    const-string v4, "OrcaGuiceModule"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Sig: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    sget-object v4, Lcom/facebook/orca/app/ff;->a:Lcom/facebook/config/a/a;

    invoke-virtual {v4}, Lcom/facebook/config/a/a;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 70
    sget-object v0, Lcom/facebook/orca/app/ff;->a:Lcom/facebook/config/a/a;

    .line 78
    :goto_1
    return-object v0

    .line 71
    :cond_0
    sget-object v4, Lcom/facebook/orca/app/ff;->b:Lcom/facebook/config/a/a;

    invoke-virtual {v4}, Lcom/facebook/config/a/a;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 72
    sget-object v0, Lcom/facebook/orca/app/ff;->b:Lcom/facebook/config/a/a;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 66
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 75
    :catch_0
    move-exception v0

    .line 78
    :cond_2
    sget-object v0, Lcom/facebook/orca/app/ff;->c:Lcom/facebook/config/a/a;

    goto :goto_1
.end method


# virtual methods
.method protected synthetic a()Lcom/facebook/base/a/i;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/facebook/orca/app/MessengerApplication;->d()Lcom/facebook/orca/app/fa;

    move-result-object v0

    return-object v0
.end method

.method protected b()V
    .locals 3

    .prologue
    .line 37
    new-instance v0, Lcom/facebook/common/e/g;

    invoke-direct {v0, p0}, Lcom/facebook/common/e/g;-><init>(Landroid/app/Application;)V

    invoke-static {v0}, Lorg/acra/ACRA;->init(Lorg/acra/reporter/ReportsCrashes;)V

    .line 38
    const-string v0, "https://www.facebook.com/mobile/orca_android_crash_logs/"

    .line 39
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v1

    .line 40
    new-instance v2, Lorg/acra/sender/HttpPostSender;

    invoke-direct {v2, v0}, Lorg/acra/sender/HttpPostSender;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lorg/acra/ErrorReporter;->setReportSender(Lorg/acra/sender/ReportSender;)V

    .line 41
    invoke-direct {p0}, Lcom/facebook/orca/app/MessengerApplication;->e()Lcom/facebook/config/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/app/MessengerApplication;->a:Lcom/facebook/config/a/a;

    .line 42
    const-string v0, "app"

    iget-object v2, p0, Lcom/facebook/orca/app/MessengerApplication;->a:Lcom/facebook/config/a/a;

    invoke-virtual {v2}, Lcom/facebook/config/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    const-string v0, "fb_app_id"

    iget-object v2, p0, Lcom/facebook/orca/app/MessengerApplication;->a:Lcom/facebook/config/a/a;

    invoke-virtual {v2}, Lcom/facebook/config/a/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    return-void
.end method

.method protected d()Lcom/facebook/orca/app/fa;
    .locals 2

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/orca/app/fa;

    iget-object v1, p0, Lcom/facebook/orca/app/MessengerApplication;->a:Lcom/facebook/config/a/a;

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/app/fa;-><init>(Landroid/app/Application;Lcom/facebook/config/a/a;)V

    return-object v0
.end method

.method public declared-synchronized f()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 57
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/orca/app/MessengerApplication;->c()Lcom/facebook/base/a/i;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/app/fa;

    invoke-virtual {v0}, Lcom/facebook/orca/app/fa;->f()Lcom/facebook/inject/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
