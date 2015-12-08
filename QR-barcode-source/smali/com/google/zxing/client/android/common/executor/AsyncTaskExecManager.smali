.class public final Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;
.super Lcom/google/zxing/client/android/common/PlatformSupportManager;
.source "AsyncTaskExecManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/zxing/client/android/common/PlatformSupportManager",
        "<",
        "Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 24
    const-class v0, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

    new-instance v1, Lcom/google/zxing/client/android/common/executor/DefaultAsyncTaskExecInterface;

    invoke-direct {v1}, Lcom/google/zxing/client/android/common/executor/DefaultAsyncTaskExecInterface;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/google/zxing/client/android/common/PlatformSupportManager;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 25
    const/16 v0, 0xb

    const-string v1, "com.google.zxing.client.android.common.executor.HoneycombAsyncTaskExecInterface"

    invoke-virtual {p0, v0, v1}, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;->addImplementationClass(ILjava/lang/String;)V

    .line 26
    return-void
.end method
