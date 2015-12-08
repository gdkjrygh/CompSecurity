.class Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;
.super Ljava/lang/Object;
.source "ChildProcessConnectionImpl.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/ChildProcessConnectionImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ChildServiceConnection"
.end annotation


# instance fields
.field private final mBindFlags:I

.field private mBound:Z

.field final synthetic this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;


# direct methods
.method public constructor <init>(Lorg/chromium/content/browser/ChildProcessConnectionImpl;I)V
    .locals 1
    .param p2, "bindFlags"    # I

    .prologue
    .line 110
    iput-object p1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBound:Z

    .line 111
    iput p2, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBindFlags:I

    .line 112
    return-void
.end method

.method private createServiceBindIntent()Landroid/content/Intent;
    .locals 4

    .prologue
    .line 104
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 105
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$000(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mServiceClass:Ljava/lang/Class;
    invoke-static {v3}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$100(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mServiceNumber:I
    invoke-static {v3}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$200(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$000(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    return-object v0
.end method


# virtual methods
.method bind([Ljava/lang/String;)Z
    .locals 3
    .param p1, "commandLine"    # [Ljava/lang/String;

    .prologue
    .line 115
    iget-boolean v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBound:Z

    if-nez v1, :cond_2

    .line 116
    invoke-static {}, Lorg/chromium/base/TraceEvent;->begin()V

    .line 117
    invoke-direct {p0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->createServiceBindIntent()Landroid/content/Intent;

    move-result-object v0

    .line 118
    .local v0, "intent":Landroid/content/Intent;
    if-eqz p1, :cond_0

    .line 119
    const-string v1, "com.google.android.apps.chrome.extra.command_line"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    :cond_0
    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mLinkerParams:Lorg/chromium/content/app/ChromiumLinkerParams;
    invoke-static {v1}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$300(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/app/ChromiumLinkerParams;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 122
    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mLinkerParams:Lorg/chromium/content/app/ChromiumLinkerParams;
    invoke-static {v1}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$300(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/app/ChromiumLinkerParams;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/chromium/content/app/ChromiumLinkerParams;->addIntentExtras(Landroid/content/Intent;)V

    .line 123
    :cond_1
    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$000(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBindFlags:I

    invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    iput-boolean v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBound:Z

    .line 124
    invoke-static {}, Lorg/chromium/base/TraceEvent;->end()V

    .line 126
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_2
    iget-boolean v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBound:Z

    return v1
.end method

.method isBound()Z
    .locals 1

    .prologue
    .line 137
    iget-boolean v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBound:Z

    return v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3
    .param p1, "className"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .prologue
    .line 142
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mLock:Ljava/lang/Object;
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$400(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 145
    :try_start_0
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mServiceConnectComplete:Z
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$500(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    monitor-exit v1

    .line 158
    :goto_0
    return-void

    .line 148
    :cond_0
    invoke-static {}, Lorg/chromium/base/TraceEvent;->begin()V

    .line 149
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    const/4 v2, 0x1

    # setter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mServiceConnectComplete:Z
    invoke-static {v0, v2}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$502(Lorg/chromium/content/browser/ChildProcessConnectionImpl;Z)Z

    .line 150
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    invoke-static {p2}, Lorg/chromium/content/common/IChildProcessService$Stub;->asInterface(Landroid/os/IBinder;)Lorg/chromium/content/common/IChildProcessService;

    move-result-object v2

    # setter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mService:Lorg/chromium/content/common/IChildProcessService;
    invoke-static {v0, v2}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$602(Lorg/chromium/content/browser/ChildProcessConnectionImpl;Lorg/chromium/content/common/IChildProcessService;)Lorg/chromium/content/common/IChildProcessService;

    .line 153
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mConnectionParams:Lorg/chromium/content/browser/ChildProcessConnectionImpl$ConnectionParams;
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$700(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/browser/ChildProcessConnectionImpl$ConnectionParams;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 154
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # invokes: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->doConnectionSetupLocked()V
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$800(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)V

    .line 156
    :cond_1
    invoke-static {}, Lorg/chromium/base/TraceEvent;->end()V

    .line 157
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5
    .param p1, "className"    # Landroid/content/ComponentName;

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 164
    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mLock:Ljava/lang/Object;
    invoke-static {v2}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$400(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 167
    :try_start_0
    iget-object v3, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mServiceDisconnected:Z
    invoke-static {v3}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$900(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 168
    monitor-exit v2

    .line 183
    :goto_0
    return-void

    .line 170
    :cond_0
    iget-object v3, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    const/4 v4, 0x1

    # setter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mServiceDisconnected:Z
    invoke-static {v3, v4}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$902(Lorg/chromium/content/browser/ChildProcessConnectionImpl;Z)Z

    .line 172
    iget-object v3, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    iget-object v4, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mInitialBinding:Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;
    invoke-static {v4}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1100(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;

    move-result-object v4

    invoke-virtual {v4}, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->isBound()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mStrongBinding:Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;
    invoke-static {v4}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1200(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;

    move-result-object v4

    invoke-virtual {v4}, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->isBound()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    move v0, v1

    :cond_2
    # setter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mWasOomProtected:Z
    invoke-static {v3, v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1002(Lorg/chromium/content/browser/ChildProcessConnectionImpl;Z)Z

    .line 173
    const-string v0, "ChildProcessConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onServiceDisconnected (crash or killed by oom): pid="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mPid:I
    invoke-static {v3}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1300(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->stop()V

    .line 175
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mDeathCallback:Lorg/chromium/content/browser/ChildProcessConnection$DeathCallback;
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1400(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/browser/ChildProcessConnection$DeathCallback;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    invoke-interface {v0, v1}, Lorg/chromium/content/browser/ChildProcessConnection$DeathCallback;->onChildProcessDied(Lorg/chromium/content/browser/ChildProcessConnection;)V

    .line 178
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mConnectionCallback:Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1500(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 179
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mConnectionCallback:Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1500(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;->onConnected(I)V

    .line 181
    :cond_3
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    const/4 v1, 0x0

    # setter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mConnectionCallback:Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;
    invoke-static {v0, v1}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$1502(Lorg/chromium/content/browser/ChildProcessConnectionImpl;Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;)Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;

    .line 182
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method unbind()V
    .locals 1

    .prologue
    .line 130
    iget-boolean v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBound:Z

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->this$0:Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    # getter for: Lorg/chromium/content/browser/ChildProcessConnectionImpl;->mContext:Landroid/content/Context;
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->access$000(Lorg/chromium/content/browser/ChildProcessConnectionImpl;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/ChildProcessConnectionImpl$ChildServiceConnection;->mBound:Z

    .line 134
    :cond_0
    return-void
.end method
