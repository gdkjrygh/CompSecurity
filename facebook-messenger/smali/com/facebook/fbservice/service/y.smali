.class Lcom/facebook/fbservice/service/y;
.super Ljava/lang/Object;
.source "IBlueService.java"

# interfaces
.implements Lcom/facebook/fbservice/service/w;


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Lcom/facebook/fbservice/service/y;->a:Landroid/os/IBinder;

    .line 91
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 110
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 111
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    .line 114
    :try_start_0
    const-string v0, "com.facebook.fbservice.service.IBlueService"

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 115
    if-eqz p1, :cond_0

    .line 116
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    const/4 v0, 0x0

    invoke-virtual {p1, v1, v0}, Lcom/facebook/fbservice/service/OperationType;->writeToParcel(Landroid/os/Parcel;I)V

    .line 122
    :goto_0
    if-eqz p2, :cond_1

    .line 123
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 124
    const/4 v0, 0x0

    invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 129
    :goto_1
    iget-object v0, p0, Lcom/facebook/fbservice/service/y;->a:Landroid/os/IBinder;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 130
    invoke-virtual {v2}, Landroid/os/Parcel;->readException()V

    .line 131
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 134
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 135
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 137
    return-object v0

    .line 120
    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 134
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 135
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw v0

    .line 127
    :cond_1
    const/4 v0, 0x0

    :try_start_2
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 150
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    .line 151
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 154
    :try_start_0
    const-string v1, "com.facebook.fbservice.service.IBlueService"

    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 156
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/facebook/fbservice/service/z;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    :goto_0
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 157
    iget-object v1, p0, Lcom/facebook/fbservice/service/y;->a:Landroid/os/IBinder;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-interface {v1, v4, v2, v3, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 158
    invoke-virtual {v3}, Landroid/os/Parcel;->readException()V

    .line 159
    invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 162
    :cond_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 163
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 165
    return v0

    .line 156
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 162
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 163
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    throw v0
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/fbservice/service/y;->a:Landroid/os/IBinder;

    return-object v0
.end method
