.class public Lorg/chromium/content/app/ChromiumLinkerParams;
.super Ljava/lang/Object;
.source "ChromiumLinkerParams.java"


# static fields
.field private static final EXTRA_LINKER_PARAMS_BASE_LOAD_ADDRESS:Ljava/lang/String; = "org.chromium.content.common.linker_params.base_load_address"

.field private static final EXTRA_LINKER_PARAMS_TEST_RUNNER_CLASS_NAME:Ljava/lang/String; = "org.chromium.content.common.linker_params.test_runner_class_name"

.field private static final EXTRA_LINKER_PARAMS_WAIT_FOR_SHARED_RELRO:Ljava/lang/String; = "org.chromium.content.common.linker_params.wait_for_shared_relro"


# instance fields
.field public final mBaseLoadAddress:J

.field public final mTestRunnerClassName:Ljava/lang/String;

.field public final mWaitForSharedRelro:Z


# direct methods
.method public constructor <init>(JZLjava/lang/String;)V
    .locals 1
    .param p1, "baseLoadAddress"    # J
    .param p3, "waitForSharedRelro"    # Z
    .param p4, "testRunnerClassName"    # Ljava/lang/String;

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-wide p1, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mBaseLoadAddress:J

    .line 38
    iput-boolean p3, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mWaitForSharedRelro:Z

    .line 39
    iput-object p4, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mTestRunnerClassName:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-string v0, "org.chromium.content.common.linker_params.base_load_address"

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mBaseLoadAddress:J

    .line 49
    const-string v0, "org.chromium.content.common.linker_params.wait_for_shared_relro"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mWaitForSharedRelro:Z

    .line 51
    const-string v0, "org.chromium.content.common.linker_params.test_runner_class_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mTestRunnerClassName:Ljava/lang/String;

    .line 53
    return-void
.end method


# virtual methods
.method public addIntentExtras(Landroid/content/Intent;)V
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 61
    const-string v0, "org.chromium.content.common.linker_params.base_load_address"

    iget-wide v2, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mBaseLoadAddress:J

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 62
    const-string v0, "org.chromium.content.common.linker_params.wait_for_shared_relro"

    iget-boolean v1, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mWaitForSharedRelro:Z

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 63
    const-string v0, "org.chromium.content.common.linker_params.test_runner_class_name"

    iget-object v1, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mTestRunnerClassName:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 68
    const-string v1, "LinkerParams(baseLoadAddress:0x%x, waitForSharedRelro:%s, testRunnerClassName:%s"

    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-wide v4, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mBaseLoadAddress:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v3, 0x1

    iget-boolean v0, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mWaitForSharedRelro:Z

    if-eqz v0, :cond_0

    const-string v0, "true"

    :goto_0
    aput-object v0, v2, v3

    const/4 v0, 0x2

    iget-object v3, p0, Lorg/chromium/content/app/ChromiumLinkerParams;->mTestRunnerClassName:Ljava/lang/String;

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "false"

    goto :goto_0
.end method
