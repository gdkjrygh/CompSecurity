.class final Lcom/google/zxing/client/android/camera/AutoFocusManager;
.super Ljava/lang/Object;
.source "AutoFocusManager.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;
    }
.end annotation


# static fields
.field private static final AUTO_FOCUS_INTERVAL_MS:J = 0x7d0L

.field private static final FOCUS_MODES_CALLING_AF:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private active:Z

.field private final camera:Landroid/hardware/Camera;

.field private outstandingTask:Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;

.field private final taskExec:Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

.field private final useAutoFocus:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 35
    const-class v0, Lcom/google/zxing/client/android/camera/AutoFocusManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    .line 41
    sget-object v0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    const-string v1, "auto"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    sget-object v0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    const-string v1, "macro"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/hardware/Camera;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "camera"    # Landroid/hardware/Camera;

    .prologue
    const/4 v3, 0x1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p2, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->camera:Landroid/hardware/Camera;

    .line 53
    new-instance v2, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;

    invoke-direct {v2}, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;-><init>()V

    invoke-virtual {v2}, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecManager;->build()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

    iput-object v2, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->taskExec:Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

    .line 54
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 55
    .local v1, "sharedPrefs":Landroid/content/SharedPreferences;
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v0

    .line 57
    .local v0, "currentFocusMode":Ljava/lang/String;
    const-string v2, "preferences_auto_focus"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 58
    sget-object v2, Lcom/google/zxing/client/android/camera/AutoFocusManager;->FOCUS_MODES_CALLING_AF:Ljava/util/Collection;

    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    .line 56
    :goto_0
    iput-boolean v2, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->useAutoFocus:Z

    .line 59
    sget-object v2, Lcom/google/zxing/client/android/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Current focus mode \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'; use auto focus? "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->useAutoFocus:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    invoke-virtual {p0}, Lcom/google/zxing/client/android/camera/AutoFocusManager;->start()V

    .line 61
    return-void

    .line 58
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method static synthetic access$0(Lcom/google/zxing/client/android/camera/AutoFocusManager;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->active:Z

    return v0
.end method


# virtual methods
.method public declared-synchronized onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 3
    .param p1, "success"    # Z
    .param p2, "theCamera"    # Landroid/hardware/Camera;

    .prologue
    .line 65
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->active:Z

    if-eqz v0, :cond_0

    .line 66
    new-instance v0, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;-><init>(Lcom/google/zxing/client/android/camera/AutoFocusManager;Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;)V

    iput-object v0, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->outstandingTask:Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;

    .line 67
    iget-object v0, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->taskExec:Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;

    iget-object v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->outstandingTask:Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/google/zxing/client/android/common/executor/AsyncTaskExecInterface;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_0
    monitor-exit p0

    return-void

    .line 65
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized start()V
    .locals 3

    .prologue
    .line 72
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->useAutoFocus:Z

    if-eqz v1, :cond_0

    .line 73
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->active:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :try_start_1
    iget-object v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v1, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 76
    :catch_0
    move-exception v0

    .line 78
    .local v0, "re":Ljava/lang/RuntimeException;
    :try_start_2
    sget-object v1, Lcom/google/zxing/client/android/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    const-string v2, "Unexpected exception while focusing"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 72
    .end local v0    # "re":Ljava/lang/RuntimeException;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method declared-synchronized stop()V
    .locals 3

    .prologue
    .line 84
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->useAutoFocus:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 86
    :try_start_1
    iget-object v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :cond_0
    :goto_0
    :try_start_2
    iget-object v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->outstandingTask:Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;

    if-eqz v1, :cond_1

    .line 93
    iget-object v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->outstandingTask:Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;->cancel(Z)Z

    .line 94
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->outstandingTask:Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;

    .line 96
    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager;->active:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    monitor-exit p0

    return-void

    .line 87
    :catch_0
    move-exception v0

    .line 89
    .local v0, "re":Ljava/lang/RuntimeException;
    :try_start_3
    sget-object v1, Lcom/google/zxing/client/android/camera/AutoFocusManager;->TAG:Ljava/lang/String;

    const-string v2, "Unexpected exception while cancelling focusing"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 84
    .end local v0    # "re":Ljava/lang/RuntimeException;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method
