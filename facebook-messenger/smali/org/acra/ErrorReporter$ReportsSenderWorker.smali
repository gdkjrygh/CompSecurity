.class final Lorg/acra/ErrorReporter$ReportsSenderWorker;
.super Ljava/lang/Thread;
.source "ErrorReporter.java"


# instance fields
.field private mSendInMemoryReport:Z

.field final synthetic this$0:Lorg/acra/ErrorReporter;


# direct methods
.method public constructor <init>(Lorg/acra/ErrorReporter;)V
    .locals 1

    .prologue
    .line 120
    iput-object p1, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->mSendInMemoryReport:Z

    .line 121
    return-void
.end method

.method public constructor <init>(Lorg/acra/ErrorReporter;Z)V
    .locals 1

    .prologue
    .line 113
    iput-object p1, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->mSendInMemoryReport:Z

    .line 114
    iput-boolean p2, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->mSendInMemoryReport:Z

    .line 115
    return-void
.end method

.method private acquireWakeLock()Landroid/os/PowerManager$WakeLock;
    .locals 3

    .prologue
    .line 147
    new-instance v0, Lorg/acra/util/PackageManagerWrapper;

    iget-object v1, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    # getter for: Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lorg/acra/ErrorReporter;->access$000(Lorg/acra/ErrorReporter;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/acra/util/PackageManagerWrapper;-><init>(Landroid/content/Context;)V

    .line 148
    const-string v1, "android.permission.WAKE_LOCK"

    invoke-virtual {v0, v1}, Lorg/acra/util/PackageManagerWrapper;->hasPermission(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 149
    const/4 v0, 0x0

    .line 155
    :goto_0
    return-object v0

    .line 152
    :cond_0
    iget-object v0, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    # getter for: Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;
    invoke-static {v0}, Lorg/acra/ErrorReporter;->access$000(Lorg/acra/ErrorReporter;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 153
    const/4 v1, 0x1

    const-string v2, "ACRA wakelock"

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 130
    invoke-direct {p0}, Lorg/acra/ErrorReporter$ReportsSenderWorker;->acquireWakeLock()Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    .line 132
    :try_start_0
    iget-boolean v0, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->mSendInMemoryReport:Z

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    iget-object v2, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    # getter for: Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;
    invoke-static {v2}, Lorg/acra/ErrorReporter;->access$000(Lorg/acra/ErrorReporter;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->sendInMemoryReport(Landroid/content/Context;)V

    .line 135
    :cond_0
    iget-object v0, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    iget-object v2, p0, Lorg/acra/ErrorReporter$ReportsSenderWorker;->this$0:Lorg/acra/ErrorReporter;

    # getter for: Lorg/acra/ErrorReporter;->mContext:Landroid/content/Context;
    invoke-static {v2}, Lorg/acra/ErrorReporter;->access$000(Lorg/acra/ErrorReporter;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/acra/ErrorReporter;->checkAndSendReports(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    if-eqz v1, :cond_1

    .line 138
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 141
    :cond_1
    return-void

    .line 137
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_2

    .line 138
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_2
    throw v0
.end method
