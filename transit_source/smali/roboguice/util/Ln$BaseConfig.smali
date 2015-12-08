.class public Lroboguice/util/Ln$BaseConfig;
.super Ljava/lang/Object;
.source "Ln.java"

# interfaces
.implements Lroboguice/util/Ln$Config;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/util/Ln;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BaseConfig"
.end annotation


# instance fields
.field protected minimumLogLevel:I

.field protected packageName:Ljava/lang/String;

.field protected scope:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    const/4 v0, 0x2

    iput v0, p0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    .line 204
    const-string v0, ""

    iput-object v0, p0, Lroboguice/util/Ln$BaseConfig;->packageName:Ljava/lang/String;

    .line 205
    const-string v0, ""

    iput-object v0, p0, Lroboguice/util/Ln$BaseConfig;->scope:Ljava/lang/String;

    .line 208
    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 6
    .param p1, "context"    # Landroid/app/Application;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .prologue
    const/4 v2, 0x2

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput v2, p0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    .line 204
    const-string v3, ""

    iput-object v3, p0, Lroboguice/util/Ln$BaseConfig;->packageName:Ljava/lang/String;

    .line 205
    const-string v3, ""

    iput-object v3, p0, Lroboguice/util/Ln$BaseConfig;->scope:Ljava/lang/String;

    .line 213
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lroboguice/util/Ln$BaseConfig;->packageName:Ljava/lang/String;

    .line 214
    invoke-virtual {p1}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, p0, Lroboguice/util/Ln$BaseConfig;->packageName:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget v1, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 215
    .local v1, "flags":I
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_0

    :goto_0
    iput v2, p0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    .line 216
    iget-object v2, p0, Lroboguice/util/Ln$BaseConfig;->packageName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lroboguice/util/Ln$BaseConfig;->scope:Ljava/lang/String;

    .line 218
    const-string v2, "Configuring Logging, minimum log level is %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget v5, p0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    invoke-static {v5}, Lroboguice/util/Ln;->logLevelToString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lroboguice/util/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 223
    .end local v1    # "flags":I
    :goto_1
    return-void

    .line 215
    .restart local v1    # "flags":I
    :cond_0
    const/4 v2, 0x4

    goto :goto_0

    .line 220
    .end local v1    # "flags":I
    :catch_0
    move-exception v0

    .line 221
    .local v0, "e":Ljava/lang/Exception;
    iget-object v2, p0, Lroboguice/util/Ln$BaseConfig;->packageName:Ljava/lang/String;

    const-string v3, "Error configuring logger"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method


# virtual methods
.method public getLoggingLevel()I
    .locals 1

    .prologue
    .line 226
    iget v0, p0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    return v0
.end method

.method public setLoggingLevel(I)V
    .locals 0
    .param p1, "level"    # I

    .prologue
    .line 230
    iput p1, p0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    .line 231
    return-void
.end method
