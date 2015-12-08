.class final Lcom/cleanmaster/gaid/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/gaid/AdvertisingIdInterface;


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/cleanmaster/gaid/b;->a:Landroid/os/IBinder;

    .line 43
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/cleanmaster/gaid/b;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 5

    .prologue
    .line 50
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 51
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    .line 54
    :try_start_0
    const-string v0, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/cleanmaster/gaid/b;->a:Landroid/os/IBinder;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 57
    invoke-virtual {v2}, Landroid/os/Parcel;->readException()V

    .line 58
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 60
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 61
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 63
    return-object v0

    .line 60
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 61
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw v0
.end method

.method public final isLimitAdTrackingEnabled(Z)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 67
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 68
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 71
    :try_start_0
    const-string v2, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 72
    if-eqz p1, :cond_0

    move v2, v0

    :goto_0
    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 73
    iget-object v2, p0, Lcom/cleanmaster/gaid/b;->a:Landroid/os/IBinder;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-interface {v2, v5, v3, v4, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 74
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 75
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-eqz v2, :cond_1

    .line 79
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 80
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 82
    :goto_2
    return v0

    :cond_0
    move v2, v1

    .line 72
    goto :goto_0

    :cond_1
    move v0, v1

    .line 75
    goto :goto_1

    .line 79
    :catch_0
    move-exception v0

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 80
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    move v0, v1

    .line 81
    goto :goto_2

    .line 79
    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 80
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v0
.end method
