.class public abstract Lcom/qihoo/security/profile/e$a;
.super Landroid/os/Binder;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/profile/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/profile/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/profile/e$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string/jumbo v0, "com.qihoo.security.profile.IProfileManager"

    invoke-virtual {p0, p0, v0}, Lcom/qihoo/security/profile/e$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/qihoo/security/profile/e;
    .locals 2

    .prologue
    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    .line 30
    :goto_0
    return-object v0

    .line 26
    :cond_0
    const-string/jumbo v0, "com.qihoo.security.profile.IProfileManager"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/qihoo/security/profile/e;

    if-eqz v1, :cond_1

    .line 28
    check-cast v0, Lcom/qihoo/security/profile/e;

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/qihoo/security/profile/e$a$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/profile/e$a$a;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .prologue
    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 38
    sparse-switch p1, :sswitch_data_0

    .line 88
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    .line 42
    :sswitch_0
    const-string/jumbo v1, "com.qihoo.security.profile.IProfileManager"

    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :sswitch_1
    const-string/jumbo v1, "com.qihoo.security.profile.IProfileManager"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/profile/d$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/profile/d;

    move-result-object v1

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 52
    invoke-virtual {p0, v1, v2}, Lcom/qihoo/security/profile/e$a;->a(Lcom/qihoo/security/profile/d;Ljava/lang/String;)V

    goto :goto_0

    .line 57
    :sswitch_2
    const-string/jumbo v1, "com.qihoo.security.profile.IProfileManager"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/profile/d$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/profile/d;

    move-result-object v1

    .line 60
    invoke-virtual {p0, v1}, Lcom/qihoo/security/profile/e$a;->a(Lcom/qihoo/security/profile/d;)V

    goto :goto_0

    .line 65
    :sswitch_3
    const-string/jumbo v1, "com.qihoo.security.profile.IProfileManager"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/profile/d$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/profile/d;

    move-result-object v1

    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 71
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 73
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 74
    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/qihoo/security/profile/e$a;->a(Lcom/qihoo/security/profile/d;IILjava/lang/String;)V

    goto :goto_0

    .line 79
    :sswitch_4
    const-string/jumbo v1, "com.qihoo.security.profile.IProfileManager"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 83
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 84
    invoke-virtual {p0, v1, v2}, Lcom/qihoo/security/profile/e$a;->a(II)V

    goto :goto_0

    .line 38
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
