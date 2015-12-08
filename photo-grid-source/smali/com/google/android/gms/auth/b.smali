.class public final Lcom/google/android/gms/auth/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field private static final c:Landroid/content/ComponentName;

.field private static final d:Landroid/content/ComponentName;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v0, "callerUid"

    sput-object v0, Lcom/google/android/gms/auth/b;->a:Ljava/lang/String;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v0, "androidPackageName"

    sput-object v0, Lcom/google/android/gms/auth/b;->b:Ljava/lang/String;

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.google.android.gms"

    const-string v2, "com.google.android.gms.auth.GetToken"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/auth/b;->c:Landroid/content/ComponentName;

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.google.android.gms"

    const-string v2, "com.google.android.gms.recovery.RecoveryService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/auth/b;->d:Landroid/content/ComponentName;

    return-void
.end method

.method private static a(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/auth/TokenData;
    .locals 6

    .prologue
    .line 0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Calling this from your main thread can lead to deadlock"

    invoke-static {v1}, Lcom/google/android/gms/common/internal/bl;->c(Ljava/lang/String;)V

    .line 3000
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->zzaa(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/google/android/gms/common/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/common/c; {:try_start_0 .. :try_end_0} :catch_2

    .line 0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string v3, "clientPackageName"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v3, Lcom/google/android/gms/auth/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/google/android/gms/auth/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v2, "service_connection_start_time_millis"

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v2, Lcom/google/android/gms/common/h;

    invoke-direct {v2}, Lcom/google/android/gms/common/h;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/common/internal/am;->a(Landroid/content/Context;)Lcom/google/android/gms/common/internal/am;

    move-result-object v3

    sget-object v0, Lcom/google/android/gms/auth/b;->c:Landroid/content/ComponentName;

    const-string v4, "GoogleAuthUtil"

    invoke-virtual {v3, v0, v2, v4}, Lcom/google/android/gms/common/internal/am;->a(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :try_start_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/h;->a()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/al;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ak;

    move-result-object v0

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ak;->a(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "GoogleAuthUtil"

    const-string v1, "Binder call returned null."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/google/android/gms/auth/a;

    const-string v1, "ServiceUnavailable"

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v1, "GoogleAuthUtil"

    const-string v4, "GMS remote exception "

    invoke-static {v1, v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Ljava/io/IOException;

    const-string v1, "remote exception"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/auth/b;->c:Landroid/content/ComponentName;

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/common/internal/am;->a(Landroid/content/ComponentName;Landroid/content/ServiceConnection;)V

    throw v0

    .line 3000
    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/auth/c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/d;->a()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/common/d;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/common/d;->b()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/auth/c;-><init>(ILjava/lang/String;Landroid/content/Intent;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lcom/google/android/gms/auth/a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/c;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/auth/a;-><init>(Ljava/lang/String;)V

    throw v1

    .line 0
    :cond_1
    :try_start_3
    const-string v1, "tokenDetails"

    invoke-static {v0, v1}, Lcom/google/android/gms/auth/TokenData;->a(Landroid/os/Bundle;Ljava/lang/String;)Lcom/google/android/gms/auth/TokenData;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v0, Lcom/google/android/gms/auth/b;->c:Landroid/content/ComponentName;

    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/common/internal/am;->a(Landroid/content/ComponentName;Landroid/content/ServiceConnection;)V

    return-object v1

    :cond_2
    :try_start_4
    const-string v1, "Error"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "userRecoveryIntent"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    invoke-static {v1}, Lcom/google/android/gms/auth/firstparty/shared/d;->a(Ljava/lang/String;)Lcom/google/android/gms/auth/firstparty/shared/d;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/auth/firstparty/shared/d;->a(Lcom/google/android/gms/auth/firstparty/shared/d;)Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v4, Lcom/google/android/gms/auth/d;

    invoke-direct {v4, v1, v0}, Lcom/google/android/gms/auth/d;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    throw v4
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_3
    move-exception v0

    :try_start_5
    new-instance v0, Lcom/google/android/gms/auth/a;

    const-string v1, "Interrupted"

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_3
    :try_start_6
    invoke-static {v4}, Lcom/google/android/gms/auth/firstparty/shared/d;->b(Lcom/google/android/gms/auth/firstparty/shared/d;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lcom/google/android/gms/auth/a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Could not bind to service with the given context."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 0
    new-instance v0, Landroid/accounts/Account;

    const-string v1, "com.google"

    invoke-direct {v0, p1, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1000
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 2000
    invoke-static {p0, v0, p2, v1}, Lcom/google/android/gms/auth/b;->a(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/auth/TokenData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/TokenData;->a()Ljava/lang/String;

    move-result-object v0

    .line 0
    return-object v0
.end method
