.class final La/a/a/a/a/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/b/i;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/b/f;->a:Landroid/content/Context;

    .line 46
    return-void
.end method


# virtual methods
.method public final a()La/a/a/a/a/b/b;
    .locals 6

    .prologue
    const/4 v4, 0x0

    const/4 v0, 0x0

    .line 49
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 50
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 98
    :goto_0
    return-object v0

    .line 56
    :cond_0
    :try_start_0
    iget-object v1, p0, La/a/a/a/a/b/f;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 57
    const-string v2, "com.android.vending"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    new-instance v2, La/a/a/a/a/b/g;

    invoke-direct {v2, v4}, La/a/a/a/a/b/g;-><init>(B)V

    .line 73
    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.google.android.gms.ads.identifier.service.START"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 74
    const-string v3, "com.google.android.gms"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    :try_start_1
    iget-object v3, p0, La/a/a/a/a/b/f;->a:Landroid/content/Context;

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v2, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    move-result v1

    if-eqz v1, :cond_1

    .line 78
    :try_start_2
    new-instance v3, La/a/a/a/a/b/h;

    invoke-virtual {v2}, La/a/a/a/a/b/g;->a()Landroid/os/IBinder;

    move-result-object v1

    invoke-direct {v3, v1}, La/a/a/a/a/b/h;-><init>(Landroid/os/IBinder;)V

    .line 80
    new-instance v1, La/a/a/a/a/b/b;

    invoke-virtual {v3}, La/a/a/a/a/b/h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, La/a/a/a/a/b/h;->b()Z

    move-result v3

    invoke-direct {v1, v4, v3}, La/a/a/a/a/b/b;-><init>(Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    :try_start_3
    iget-object v3, p0, La/a/a/a/a/b/f;->a:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3

    move-object v0, v1

    goto :goto_0

    .line 61
    :catch_0
    move-exception v1

    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_0

    .line 67
    :catch_1
    move-exception v1

    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_0

    .line 82
    :catch_2
    move-exception v1

    .line 83
    :try_start_4
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Exception in binding to Google Play Service to capture AdvertisingId"

    invoke-interface {v3, v4, v5, v1}, La/a/a/a/s;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 87
    :try_start_5
    iget-object v1, p0, La/a/a/a/a/b/f;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_0

    .line 94
    :catch_3
    move-exception v1

    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_0

    .line 87
    :catchall_0
    move-exception v1

    :try_start_6
    iget-object v3, p0, La/a/a/a/a/b/f;->a:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    throw v1

    .line 90
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_0
.end method
