.class public Lcom/crittercism/app/Crittercism;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 165
    const-string v0, "Crittercism"

    const-string v1, "Crittercism cannot be initialized"

    new-instance v2, Ljava/lang/NullPointerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " was null"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    return-void
.end method

.method private static b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 776
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Must initialize Crittercism before calling "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/crittercism/app/Crittercism;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "().  Request is being ignored..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 777
    const-string v1, "Crittercism"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v1, v0, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 778
    return-void
.end method

.method public static beginTransaction(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 676
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v1

    iget-boolean v0, v1, Lcrittercism/android/az;->u:Z

    if-eqz v0, :cond_1

    const-string v0, "CrittercismInstance"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transactions are not supported for services. Ignoring Crittercism.beginTransaction() call for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 682
    :cond_0
    :goto_0
    return-void

    .line 676
    :cond_1
    invoke-static {p0}, Lcom/crittercism/app/Transaction;->a(Ljava/lang/String;)Lcom/crittercism/app/Transaction;

    move-result-object v2

    instance-of v0, v2, Lcrittercism/android/bg;

    if-eqz v0, :cond_0

    iget-object v3, v1, Lcrittercism/android/az;->A:Ljava/util/Map;

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, v1, Lcrittercism/android/az;->A:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crittercism/app/Transaction;

    if-eqz v0, :cond_2

    check-cast v0, Lcrittercism/android/bg;

    invoke-virtual {v0}, Lcrittercism/android/bg;->h()V

    :cond_2
    iget-object v0, v1, Lcrittercism/android/az;->A:Ljava/util/Map;

    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/crittercism/app/Transaction;->a()V

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v3

    throw v0
    :try_end_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    .line 677
    :catch_0
    move-exception v0

    throw v0

    .line 679
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static didCrashOnLastLoad()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 414
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v1

    iget-boolean v2, v1, Lcrittercism/android/az;->b:Z

    if-nez v2, :cond_1

    const-string v1, "didCrashOnLoad"

    invoke-static {v1}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 420
    :cond_0
    :goto_0
    return v0

    .line 414
    :cond_1
    invoke-virtual {v1}, Lcrittercism/android/az;->B()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lcrittercism/android/az;->e:Landroid/os/ConditionVariable;

    invoke-virtual {v1}, Landroid/os/ConditionVariable;->block()V

    sget-boolean v0, Lcrittercism/android/dq;->a:Z
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 415
    :catch_0
    move-exception v0

    throw v0

    .line 417
    :catch_1
    move-exception v1

    invoke-static {v1}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static endTransaction(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 691
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v1, v0, Lcrittercism/android/az;->u:Z

    if-eqz v1, :cond_1

    const-string v0, "CrittercismInstance"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transactions are not supported for services. Ignoring Crittercism.endTransaction() call for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 697
    :cond_0
    :goto_0
    return-void

    .line 691
    :cond_1
    iget-object v1, v0, Lcrittercism/android/az;->A:Ljava/util/Map;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, v0, Lcrittercism/android/az;->A:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crittercism/app/Transaction;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Lcom/crittercism/app/Transaction;->b()V
    :try_end_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 692
    :catch_0
    move-exception v0

    throw v0

    .line 691
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1

    throw v0
    :try_end_3
    .catch Ljava/lang/ThreadDeath; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    .line 694
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static failTransaction(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 705
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v1, v0, Lcrittercism/android/az;->u:Z

    if-eqz v1, :cond_1

    const-string v0, "CrittercismInstance"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transactions are not supported for services. Ignoring Crittercism.failTransaction() call for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    :cond_0
    :goto_0
    return-void

    .line 705
    :cond_1
    iget-object v1, v0, Lcrittercism/android/az;->A:Ljava/util/Map;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, v0, Lcrittercism/android/az;->A:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crittercism/app/Transaction;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Lcom/crittercism/app/Transaction;->c()V
    :try_end_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 706
    :catch_0
    move-exception v0

    throw v0

    .line 705
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1

    throw v0
    :try_end_3
    .catch Ljava/lang/ThreadDeath; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    .line 708
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static generateRateMyAppAlertDialog(Landroid/content/Context;)Landroid/app/AlertDialog;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 126
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v3

    iget-object v1, v3, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    iget-object v1, v3, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    if-eqz v1, :cond_0

    iget-object v1, v3, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    invoke-virtual {v1}, Lcrittercism/android/dt;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v1, v3, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    invoke-virtual {v1}, Lcrittercism/android/dt;->c()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v3, p0, v1, v2}, Lcrittercism/android/az;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 133
    :goto_1
    return-object v0

    .line 127
    :catch_0
    move-exception v0

    throw v0

    .line 129
    :catch_1
    move-exception v1

    invoke-static {v1}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    move-object v1, v0

    move-object v2, v0

    goto :goto_0
.end method

.method public static generateRateMyAppAlertDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 83
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcrittercism/android/az;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 90
    :goto_0
    return-object v0

    .line 84
    :catch_0
    move-exception v0

    throw v0

    .line 86
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    .line 90
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getOptOutStatus()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 545
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v1

    iget-boolean v2, v1, Lcrittercism/android/az;->b:Z

    if-nez v2, :cond_0

    const-string v1, "getOptOutStatus"

    invoke-static {v1}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 551
    :goto_0
    return v0

    .line 545
    :cond_0
    invoke-virtual {v1}, Lcrittercism/android/az;->B()Z
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    goto :goto_0

    .line 546
    :catch_0
    move-exception v0

    throw v0

    .line 548
    :catch_1
    move-exception v1

    invoke-static {v1}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static getTransactionValue(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 733
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcrittercism/android/az;->b(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    .line 738
    :goto_0
    return v0

    .line 734
    :catch_0
    move-exception v0

    throw v0

    .line 736
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    .line 738
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static declared-synchronized initialize(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "appID"    # Ljava/lang/String;

    .prologue
    .line 161
    const-class v1, Lcom/crittercism/app/Crittercism;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/crittercism/app/CrittercismConfig;

    invoke-direct {v0}, Lcom/crittercism/app/CrittercismConfig;-><init>()V

    invoke-static {p0, p1, v0}, Lcom/crittercism/app/Crittercism;->initialize(Landroid/content/Context;Ljava/lang/String;Lcom/crittercism/app/CrittercismConfig;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    monitor-exit v1

    return-void

    .line 161
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized initialize(Landroid/content/Context;Ljava/lang/String;Lcom/crittercism/app/CrittercismConfig;)V
    .locals 6

    .prologue
    .line 152
    const-class v1, Lcom/crittercism/app/Crittercism;

    monitor-enter v1

    if-nez p1, :cond_1

    :try_start_0
    const-class v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 152
    :cond_1
    if-nez p0, :cond_2

    :try_start_1
    const-class v0, Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 153
    :catch_0
    move-exception v0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_2
    if-nez p2, :cond_3

    :try_start_3
    const-class v0, Lcom/crittercism/app/CrittercismConfig;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ThreadDeath; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 155
    :catch_1
    move-exception v0

    :try_start_4
    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 152
    :cond_3
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x18

    if-ge v0, v2, :cond_4

    const-string v0, "Given an invalid appID. The appID should be 24 characters in length."

    const-string v2, "Crittercism"

    const-string v3, "Crittercism cannot be initialized"

    new-instance v4, Ljava/security/InvalidParameterException;

    invoke-direct {v4, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3, v4}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z
    :try_end_5
    .catch Ljava/lang/ThreadDeath; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v0, :cond_0

    :try_start_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcrittercism/android/az;->a(Landroid/content/Context;Ljava/lang/String;Lcom/crittercism/app/CrittercismConfig;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v2, v4, v2

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Crittercism finished initializing in "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "ms"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/ThreadDeath; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    :catch_2
    move-exception v0

    :try_start_7
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception in init > getInstance().initialize(..): "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V
    :try_end_7
    .catch Ljava/lang/ThreadDeath; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_0
.end method

.method public static leaveBreadcrumb(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 652
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z

    if-nez v0, :cond_1

    const-string v0, "leaveBreadcrumb"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 658
    :cond_0
    :goto_0
    return-void

    .line 652
    :cond_1
    if-nez p0, :cond_2

    const-string v0, "Crittercism"

    const-string v1, "Cannot leave null breadcrumb"

    new-instance v2, Ljava/lang/NullPointerException;

    invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 653
    :catch_0
    move-exception v0

    throw v0

    .line 652
    :cond_2
    :try_start_1
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-object v1, v0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v1}, Lcrittercism/android/dw;->b()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lcrittercism/android/ce;

    sget-object v2, Lcrittercism/android/ce$a;->a:Lcrittercism/android/ce$a;

    invoke-direct {v1, p0, v2}, Lcrittercism/android/ce;-><init>(Ljava/lang/String;Lcrittercism/android/ce$a;)V

    new-instance v2, Lcrittercism/android/az$7;

    invoke-direct {v2, v0, v1}, Lcrittercism/android/az$7;-><init>(Lcrittercism/android/az;Lcrittercism/android/ce;)V

    iget-object v1, v0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v1, v2}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "SENDING "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " TO EXECUTOR"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    iget-object v0, v0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 655
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static logHandledException(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 239
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z

    if-nez v0, :cond_1

    const-string v0, "logHandledException"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 245
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-object v0, v0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcrittercism/android/az;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 240
    :catch_0
    move-exception v0

    throw v0

    .line 242
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static logNetworkRequest(Ljava/lang/String;Ljava/net/URL;JJJILjava/lang/Exception;)V
    .locals 13
    .param p0, "method"    # Ljava/lang/String;
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "responseTime"    # J
    .param p4, "bytesRead"    # J
    .param p6, "bytesSent"    # J
    .param p8, "responseCode"    # I
    .param p9, "error"    # Ljava/lang/Exception;

    .prologue
    .line 328
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v11, v0, p2

    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z

    if-nez v0, :cond_1

    const-string v0, "logEndpoint"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 336
    :cond_0
    :goto_0
    return-void

    .line 328
    :cond_1
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-object v0, v0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-virtual/range {v0 .. v12}, Lcrittercism/android/az;->a(Ljava/lang/String;Ljava/net/URL;JJJILjava/lang/Exception;J)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 331
    :catch_0
    move-exception v0

    throw v0

    .line 333
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static performRateMyAppButtonAction(Lcom/crittercism/app/CritterRateMyAppButtons;)V
    .locals 4

    .prologue
    .line 38
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-object v0, v0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Crittercism"

    const-string v1, "User has opted out of crittercism.  performRateMyAppButtonAction exiting."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :goto_0
    return-void

    .line 38
    :cond_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x5

    if-ge v1, v2, :cond_1

    const-string v0, "Crittercism"

    const-string v1, "Rate my app not supported below api level 5"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    throw v0

    .line 38
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lcrittercism/android/az;->D()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v0, "Crittercism"

    const-string v1, "Cannot create proper URI to open app market.  Returning null."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 41
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 38
    :cond_2
    :try_start_2
    sget-object v2, Lcrittercism/android/az$4;->a:[I

    invoke-virtual {p0}, Lcom/crittercism/app/CritterRateMyAppButtons;->ordinal()I

    move-result v3

    aget v2, v2, v3
    :try_end_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    :try_start_3
    invoke-virtual {v0, v1}, Lcrittercism/android/az;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/ThreadDeath; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_2
    move-exception v0

    :try_start_4
    const-string v0, "Crittercism"

    const-string v1, "performRateMyAppButtonAction(CritterRateMyAppButtons.YES) failed.  Email support@crittercism.com."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcrittercism/android/dx;->c()V
    :try_end_4
    .catch Ljava/lang/ThreadDeath; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    :pswitch_1
    :try_start_5
    invoke-virtual {v0}, Lcrittercism/android/az;->C()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/ThreadDeath; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_0

    :catch_3
    move-exception v0

    :try_start_6
    const-string v0, "Crittercism"

    const-string v1, "performRateMyAppButtonAction(CritterRateMyAppButtons.NO) failed.  Email support@crittercism.com."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/ThreadDeath; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static sendAppLoadData()V
    .locals 3

    .prologue
    .line 203
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-object v0, v0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    if-nez v0, :cond_1

    const-string v0, "sendAppLoadData"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 209
    :cond_0
    :goto_0
    return-void

    .line 203
    :cond_1
    invoke-virtual {v0}, Lcom/crittercism/app/CrittercismConfig;->delaySendingAppLoad()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-object v0, v0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-object v1, v0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v1}, Lcrittercism/android/bb;->delaySendingAppLoad()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v0, "CrittercismInstance"

    const-string v1, "CrittercismConfig instance not set to delay sending app loads."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 204
    :catch_0
    move-exception v0

    throw v0

    .line 203
    :cond_2
    :try_start_1
    iget-boolean v1, v0, Lcrittercism/android/az;->u:Z

    if-nez v1, :cond_0

    new-instance v1, Lcrittercism/android/az$1;

    invoke-direct {v1, v0}, Lcrittercism/android/az$1;-><init>(Lcrittercism/android/az;)V

    iget-object v2, v0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v2, v1}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, v0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 206
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 203
    :cond_3
    :try_start_2
    const-string v0, "Crittercism"

    const-string v1, "sendAppLoadData() will only send data to Crittercism if \"delaySendingAppLoad\" is set to true in the configuration settings you include in the init call."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0
.end method

.method public static setMetadata(Lorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 593
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z

    if-nez v0, :cond_0

    const-string v0, "setMetadata"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 599
    :goto_0
    return-void

    .line 593
    :cond_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcrittercism/android/az;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 594
    :catch_0
    move-exception v0

    throw v0

    .line 596
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static setOptOutStatus(Z)V
    .locals 3

    .prologue
    .line 573
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z

    if-nez v0, :cond_1

    const-string v0, "setOptOutStatus"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 579
    :cond_0
    :goto_0
    return-void

    .line 573
    :cond_1
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    new-instance v1, Lcrittercism/android/dk;

    iget-object v2, v0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-direct {v1, v2, v0, p0}, Lcrittercism/android/dk;-><init>(Landroid/content/Context;Lcrittercism/android/ax;Z)V

    iget-object v2, v0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v2, v1}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, v0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 574
    :catch_0
    move-exception v0

    throw v0

    .line 576
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static setTransactionValue(Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 719
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v1, v0, Lcrittercism/android/az;->u:Z

    if-eqz v1, :cond_0

    const-string v0, "CrittercismInstance"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transactions are not supported for services. Ignoring Crittercism.setTransactionValue() call for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 725
    :goto_0
    return-void

    .line 719
    :cond_0
    iget-object v1, v0, Lcrittercism/android/az;->A:Ljava/util/Map;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, v0, Lcrittercism/android/az;->A:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crittercism/app/Transaction;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/crittercism/app/Transaction;->a(I)V

    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1

    throw v0
    :try_end_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    .line 724
    :catch_0
    move-exception v0

    throw v0

    .line 722
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static setUsername(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 612
    :try_start_0
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z

    if-nez v0, :cond_0

    const-string v0, "setUsername"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 618
    :goto_0
    return-void

    .line 612
    :cond_0
    if-nez p0, :cond_1

    const-string v0, "Crittercism"

    const-string v1, "Crittercism.setUsername() given invalid parameter: null"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 613
    :catch_0
    move-exception v0

    throw v0

    .line 612
    :cond_1
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    const-string v1, "username"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcrittercism/android/az;->a(Lorg/json/JSONObject;)V
    :try_end_3
    .catch Ljava/lang/ThreadDeath; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    .line 615
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 612
    :catch_2
    move-exception v0

    :try_start_4
    const-string v1, "Crittercism"

    const-string v2, "Crittercism.setUsername()"

    invoke-static {v1, v2, v0}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/ThreadDeath; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0
.end method

.method public static updateLocation(Landroid/location/Location;)V
    .locals 3
    .param p0, "curLocation"    # Landroid/location/Location;

    .prologue
    .line 755
    invoke-static {}, Lcrittercism/android/az;->A()Lcrittercism/android/az;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/az;->b:Z

    if-nez v0, :cond_0

    .line 756
    const-string v0, "updateLocation"

    invoke-static {v0}, Lcom/crittercism/app/Crittercism;->b(Ljava/lang/String;)V

    .line 766
    :goto_0
    return-void

    .line 760
    :cond_0
    if-nez p0, :cond_1

    .line 761
    const-string v0, "Crittercism"

    const-string v1, "Cannot leave null location"

    new-instance v2, Ljava/lang/NullPointerException;

    invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 765
    :cond_1
    invoke-static {p0}, Lcrittercism/android/bc;->a(Landroid/location/Location;)V

    goto :goto_0
.end method
