.class Lorg/chromium/content/app/ChildProcessService$2;
.super Ljava/lang/Object;
.source "ChildProcessService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/app/ChildProcessService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic this$0:Lorg/chromium/content/app/ChildProcessService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 129
    const-class v0, Lorg/chromium/content/app/ChildProcessService;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/app/ChildProcessService$2;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/app/ChildProcessService;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .prologue
    .line 135
    :try_start_0
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mMainThread:Ljava/lang/Thread;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$100(Lorg/chromium/content/app/ChildProcessService;)Ljava/lang/Thread;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_0 .. :try_end_0} :catch_1

    .line 136
    :goto_0
    :try_start_1
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mCommandLineParams:[Ljava/lang/String;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$200(Lorg/chromium/content/app/ChildProcessService;)[Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 137
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mMainThread:Ljava/lang/Thread;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$100(Lorg/chromium/content/app/ChildProcessService;)Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    .line 139
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_2 .. :try_end_2} :catch_1

    .line 208
    :catch_0
    move-exception v0

    .line 209
    .local v0, "e":Ljava/lang/InterruptedException;
    const-string v1, "ChildProcessService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ChildProcessMain startup failed: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :goto_1
    return-void

    .line 139
    :cond_0
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    :try_start_4
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mCommandLineParams:[Ljava/lang/String;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$200(Lorg/chromium/content/app/ChildProcessService;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/chromium/base/CommandLine;->init([Ljava/lang/String;)V

    .line 141
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->isUsed()Z

    move-result v11

    .line 142
    .local v11, "useLinker":Z
    const/4 v10, 0x0

    .line 143
    .local v10, "requestedSharedRelro":Z
    if-eqz v11, :cond_3

    .line 144
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mMainThread:Ljava/lang/Thread;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$100(Lorg/chromium/content/app/ChildProcessService;)Ljava/lang/Thread;

    move-result-object v2

    monitor-enter v2
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_4 .. :try_end_4} :catch_1

    .line 145
    :goto_2
    :try_start_5
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mIsBound:Z
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$700(Lorg/chromium/content/app/ChildProcessService;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 146
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mMainThread:Ljava/lang/Thread;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$100(Lorg/chromium/content/app/ChildProcessService;)Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_2

    .line 148
    :catchall_1
    move-exception v1

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v1
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_6 .. :try_end_6} :catch_1

    .line 210
    .end local v10    # "requestedSharedRelro":Z
    .end local v11    # "useLinker":Z
    :catch_1
    move-exception v0

    .line 211
    .local v0, "e":Lorg/chromium/base/library_loader/ProcessInitException;
    const-string v1, "ChildProcessService"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ChildProcessMain startup failed: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 148
    .end local v0    # "e":Lorg/chromium/base/library_loader/ProcessInitException;
    .restart local v10    # "requestedSharedRelro":Z
    .restart local v11    # "useLinker":Z
    :cond_1
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 149
    :try_start_8
    sget-boolean v1, Lorg/chromium/content/app/ChildProcessService$2;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mLinkerParams:Lorg/chromium/content/app/ChromiumLinkerParams;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$800(Lorg/chromium/content/app/ChildProcessService;)Lorg/chromium/content/app/ChromiumLinkerParams;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 150
    :cond_2
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mLinkerParams:Lorg/chromium/content/app/ChromiumLinkerParams;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$800(Lorg/chromium/content/app/ChildProcessService;)Lorg/chromium/content/app/ChromiumLinkerParams;

    move-result-object v1

    iget-boolean v1, v1, Lorg/chromium/content/app/ChromiumLinkerParams;->mWaitForSharedRelro:Z

    if-eqz v1, :cond_7

    .line 151
    const/4 v10, 0x1

    .line 152
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mLinkerParams:Lorg/chromium/content/app/ChromiumLinkerParams;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$800(Lorg/chromium/content/app/ChildProcessService;)Lorg/chromium/content/app/ChromiumLinkerParams;

    move-result-object v1

    iget-wide v6, v1, Lorg/chromium/content/app/ChromiumLinkerParams;->mBaseLoadAddress:J

    invoke-static {v6, v7}, Lorg/chromium/base/library_loader/Linker;->initServiceProcess(J)V

    .line 156
    :goto_3
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mLinkerParams:Lorg/chromium/content/app/ChromiumLinkerParams;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$800(Lorg/chromium/content/app/ChildProcessService;)Lorg/chromium/content/app/ChromiumLinkerParams;

    move-result-object v1

    iget-object v1, v1, Lorg/chromium/content/app/ChromiumLinkerParams;->mTestRunnerClassName:Ljava/lang/String;

    invoke-static {v1}, Lorg/chromium/base/library_loader/Linker;->setTestRunnerClassName(Ljava/lang/String;)V

    .line 158
    :cond_3
    const/4 v9, 0x0

    .line 159
    .local v9, "isLoaded":Z
    invoke-static {}, Lorg/chromium/base/CommandLine;->getInstance()Lorg/chromium/base/CommandLine;

    move-result-object v1

    const-string v2, "renderer-wait-for-java-debugger"

    invoke-virtual {v1, v2}, Lorg/chromium/base/CommandLine;->hasSwitch(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 161
    invoke-static {}, Landroid/os/Debug;->waitForDebugger()V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_8 .. :try_end_8} :catch_1

    .line 165
    :cond_4
    :try_start_9
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    invoke-virtual {v1}, Lorg/chromium/content/app/ChildProcessService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lorg/chromium/base/library_loader/LibraryLoader;->loadNow(Landroid/content/Context;Z)V
    :try_end_9
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_0

    .line 166
    const/4 v9, 0x1

    .line 175
    :goto_4
    if-nez v9, :cond_5

    if-eqz v10, :cond_5

    .line 176
    :try_start_a
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->disableSharedRelros()V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_a .. :try_end_a} :catch_1

    .line 178
    :try_start_b
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    invoke-virtual {v1}, Lorg/chromium/content/app/ChildProcessService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lorg/chromium/base/library_loader/LibraryLoader;->loadNow(Landroid/content/Context;Z)V
    :try_end_b
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_0

    .line 179
    const/4 v9, 0x1

    .line 184
    :cond_5
    :goto_5
    if-nez v9, :cond_6

    .line 185
    const/4 v1, -0x1

    :try_start_c
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    .line 187
    :cond_6
    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->initialize()V

    .line 188
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mMainThread:Ljava/lang/Thread;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$100(Lorg/chromium/content/app/ChildProcessService;)Ljava/lang/Thread;

    move-result-object v2

    monitor-enter v2
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_c .. :try_end_c} :catch_1

    .line 189
    :try_start_d
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    const/4 v5, 0x1

    # setter for: Lorg/chromium/content/app/ChildProcessService;->mLibraryInitialized:Z
    invoke-static {v1, v5}, Lorg/chromium/content/app/ChildProcessService;->access$902(Lorg/chromium/content/app/ChildProcessService;Z)Z

    .line 190
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mMainThread:Ljava/lang/Thread;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$100(Lorg/chromium/content/app/ChildProcessService;)Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 191
    :goto_6
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileIds:Ljava/util/ArrayList;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$500(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_9

    .line 192
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mMainThread:Ljava/lang/Thread;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$100(Lorg/chromium/content/app/ChildProcessService;)Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_6

    .line 194
    :catchall_2
    move-exception v1

    monitor-exit v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    :try_start_e
    throw v1

    .line 154
    .end local v9    # "isLoaded":Z
    :cond_7
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->disableSharedRelros()V

    goto :goto_3

    .line 167
    .restart local v9    # "isLoaded":Z
    :catch_2
    move-exception v0

    .line 168
    .restart local v0    # "e":Lorg/chromium/base/library_loader/ProcessInitException;
    if-eqz v10, :cond_8

    .line 169
    const-string v1, "ChildProcessService"

    const-string v2, "Failed to load native library with shared RELRO, retrying without"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    .line 172
    :cond_8
    const-string v1, "ChildProcessService"

    const-string v2, "Failed to load native library"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    .line 180
    .end local v0    # "e":Lorg/chromium/base/library_loader/ProcessInitException;
    :catch_3
    move-exception v0

    .line 181
    .restart local v0    # "e":Lorg/chromium/base/library_loader/ProcessInitException;
    const-string v1, "ChildProcessService"

    const-string v2, "Failed to load native library on retry"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_e
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_e .. :try_end_e} :catch_1

    goto :goto_5

    .line 194
    .end local v0    # "e":Lorg/chromium/base/library_loader/ProcessInitException;
    :cond_9
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 195
    :try_start_10
    sget-boolean v1, Lorg/chromium/content/app/ChildProcessService$2;->$assertionsDisabled:Z

    if-nez v1, :cond_a

    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileIds:Ljava/util/ArrayList;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$500(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileFds:Ljava/util/ArrayList;
    invoke-static {v2}, Lorg/chromium/content/app/ChildProcessService;->access$600(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eq v1, v2, :cond_a

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 196
    :cond_a
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileIds:Ljava/util/ArrayList;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$500(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v3, v1, [I

    .line 197
    .local v3, "fileIds":[I
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileFds:Ljava/util/ArrayList;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$600(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v4, v1, [I

    .line 198
    .local v4, "fileFds":[I
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_7
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileIds:Ljava/util/ArrayList;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$500(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v8, v1, :cond_b

    .line 199
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileIds:Ljava/util/ArrayList;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$500(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, v3, v8

    .line 200
    iget-object v1, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mFileFds:Ljava/util/ArrayList;
    invoke-static {v1}, Lorg/chromium/content/app/ChildProcessService;->access$600(Lorg/chromium/content/app/ChildProcessService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v1

    aput v1, v4, v8

    .line 198
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 202
    :cond_b
    # getter for: Lorg/chromium/content/app/ChildProcessService;->sContext:Ljava/util/concurrent/atomic/AtomicReference;
    invoke-static {}, Lorg/chromium/content/app/ChildProcessService;->access$1000()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lorg/chromium/content/app/ContentMain;->initApplicationContext(Landroid/content/Context;)V

    .line 203
    # getter for: Lorg/chromium/content/app/ChildProcessService;->sContext:Ljava/util/concurrent/atomic/AtomicReference;
    invoke-static {}, Lorg/chromium/content/app/ChildProcessService;->access$1000()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    iget-object v5, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mCpuCount:I
    invoke-static {v5}, Lorg/chromium/content/app/ChildProcessService;->access$300(Lorg/chromium/content/app/ChildProcessService;)I

    move-result v5

    iget-object v6, p0, Lorg/chromium/content/app/ChildProcessService$2;->this$0:Lorg/chromium/content/app/ChildProcessService;

    # getter for: Lorg/chromium/content/app/ChildProcessService;->mCpuFeatures:J
    invoke-static {v6}, Lorg/chromium/content/app/ChildProcessService;->access$400(Lorg/chromium/content/app/ChildProcessService;)J

    move-result-wide v6

    # invokes: Lorg/chromium/content/app/ChildProcessService;->nativeInitChildProcess(Landroid/content/Context;Lorg/chromium/content/app/ChildProcessService;[I[IIJ)V
    invoke-static/range {v1 .. v7}, Lorg/chromium/content/app/ChildProcessService;->access$1100(Landroid/content/Context;Lorg/chromium/content/app/ChildProcessService;[I[IIJ)V

    .line 206
    invoke-static {}, Lorg/chromium/content/app/ContentMain;->start()I

    .line 207
    # invokes: Lorg/chromium/content/app/ChildProcessService;->nativeExitChildProcess()V
    invoke-static {}, Lorg/chromium/content/app/ChildProcessService;->access$1200()V
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_10 .. :try_end_10} :catch_0
    .catch Lorg/chromium/base/library_loader/ProcessInitException; {:try_start_10 .. :try_end_10} :catch_1

    goto/16 :goto_1
.end method
