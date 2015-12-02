.class public Lorg/acra/reporter/BaseCrashReporter;
.super Ljava/lang/Object;
.source "BaseCrashReporter.java"

# interfaces
.implements Lorg/acra/reporter/ReportsCrashes;


# instance fields
.field protected mApplication:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 2

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    if-nez p1, :cond_0

    .line 17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Application cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_0
    iput-object p1, p0, Lorg/acra/reporter/BaseCrashReporter;->mApplication:Landroid/app/Application;

    .line 20
    return-void
.end method


# virtual methods
.method public additionalDropBoxTags()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 30
    return-object v0
.end method

.method public checkSSLCertsOnCrashReport()Z
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x1

    return v0
.end method

.method public dropboxCollectionMinutes()I
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x5

    return v0
.end method

.method public formPostFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    const-string v0, "ACRA-NULL-STRING"

    return-object v0
.end method

.method public getApplication()Landroid/app/Application;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lorg/acra/reporter/BaseCrashReporter;->mApplication:Landroid/app/Application;

    return-object v0
.end method

.method public includeDropBoxSystemTags()Z
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    return v0
.end method

.method public logcatArguments()[Ljava/lang/String;
    .locals 3

    .prologue
    .line 40
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "-t"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "200"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "-v"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "time"

    aput-object v2, v0, v1

    .line 41
    return-object v0
.end method

.method public socketTimeout()I
    .locals 1

    .prologue
    .line 51
    const/16 v0, 0xbb8

    return v0
.end method
