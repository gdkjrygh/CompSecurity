.class public Lcom/facebook/common/e/g;
.super Lorg/acra/reporter/BaseCrashReporter;
.source "FbCrashReporter.java"


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lorg/acra/reporter/BaseCrashReporter;-><init>(Landroid/app/Application;)V

    .line 15
    return-void
.end method


# virtual methods
.method public checkSSLCertsOnCrashReport()Z
    .locals 1

    .prologue
    .line 19
    const/4 v0, 0x1

    return v0
.end method

.method public logcatArguments()[Ljava/lang/String;
    .locals 3

    .prologue
    .line 24
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "-t"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "500"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "-v"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "threadtime"

    aput-object v2, v0, v1

    .line 25
    return-object v0
.end method
