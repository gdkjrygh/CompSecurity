.class final Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;
.super Landroid/os/AsyncTask;
.source "AutoFocusManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/zxing/client/android/camera/AutoFocusManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "AutoFocusTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/zxing/client/android/camera/AutoFocusManager;


# direct methods
.method private constructor <init>(Lcom/google/zxing/client/android/camera/AutoFocusManager;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/google/zxing/client/android/camera/AutoFocusManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/zxing/client/android/camera/AutoFocusManager;Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;)V
    .locals 0

    .prologue
    .line 99
    invoke-direct {p0, p1}, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;-><init>(Lcom/google/zxing/client/android/camera/AutoFocusManager;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "voids"    # [Ljava/lang/Object;

    .prologue
    .line 103
    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :goto_0
    iget-object v1, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/google/zxing/client/android/camera/AutoFocusManager;

    monitor-enter v1

    .line 108
    :try_start_1
    iget-object v0, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/google/zxing/client/android/camera/AutoFocusManager;

    # getter for: Lcom/google/zxing/client/android/camera/AutoFocusManager;->active:Z
    invoke-static {v0}, Lcom/google/zxing/client/android/camera/AutoFocusManager;->access$0(Lcom/google/zxing/client/android/camera/AutoFocusManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/google/zxing/client/android/camera/AutoFocusManager$AutoFocusTask;->this$0:Lcom/google/zxing/client/android/camera/AutoFocusManager;

    invoke-virtual {v0}, Lcom/google/zxing/client/android/camera/AutoFocusManager;->start()V

    .line 107
    :cond_0
    monitor-exit v1

    .line 112
    const/4 v0, 0x0

    return-object v0

    .line 107
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 104
    :catch_0
    move-exception v0

    goto :goto_0
.end method
