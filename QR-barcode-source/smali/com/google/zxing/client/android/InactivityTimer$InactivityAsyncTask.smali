.class final Lcom/google/zxing/client/android/InactivityTimer$InactivityAsyncTask;
.super Landroid/os/AsyncTask;
.source "InactivityTimer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/zxing/client/android/InactivityTimer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "InactivityAsyncTask"
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
.field final synthetic this$0:Lcom/google/zxing/client/android/InactivityTimer;


# direct methods
.method private constructor <init>(Lcom/google/zxing/client/android/InactivityTimer;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/google/zxing/client/android/InactivityTimer$InactivityAsyncTask;->this$0:Lcom/google/zxing/client/android/InactivityTimer;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/zxing/client/android/InactivityTimer;Lcom/google/zxing/client/android/InactivityTimer$InactivityAsyncTask;)V
    .locals 0

    .prologue
    .line 95
    invoke-direct {p0, p1}, Lcom/google/zxing/client/android/InactivityTimer$InactivityAsyncTask;-><init>(Lcom/google/zxing/client/android/InactivityTimer;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "objects"    # [Ljava/lang/Object;

    .prologue
    .line 99
    const-wide/32 v0, 0x493e0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 100
    # getter for: Lcom/google/zxing/client/android/InactivityTimer;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/google/zxing/client/android/InactivityTimer;->access$1()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Finishing activity due to inactivity"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    iget-object v0, p0, Lcom/google/zxing/client/android/InactivityTimer$InactivityAsyncTask;->this$0:Lcom/google/zxing/client/android/InactivityTimer;

    # getter for: Lcom/google/zxing/client/android/InactivityTimer;->activity:Landroid/app/Activity;
    invoke-static {v0}, Lcom/google/zxing/client/android/InactivityTimer;->access$2(Lcom/google/zxing/client/android/InactivityTimer;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 102
    :catch_0
    move-exception v0

    goto :goto_0
.end method
