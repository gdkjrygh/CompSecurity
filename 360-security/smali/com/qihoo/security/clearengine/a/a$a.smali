.class public abstract Lcom/qihoo/security/clearengine/a/a$a;
.super Landroid/os/Binder;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/clearengine/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/clearengine/a/a$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p0, p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/qihoo/security/clearengine/a/a;
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
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/qihoo/security/clearengine/a/a;

    if-eqz v1, :cond_1

    .line 28
    check-cast v0, Lcom/qihoo/security/clearengine/a/a;

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/qihoo/security/clearengine/a/a$a$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/a/a$a$a;-><init>(Landroid/os/IBinder;)V

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
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 38
    sparse-switch p1, :sswitch_data_0

    .line 170
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    .line 42
    :sswitch_0
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    move v0, v1

    .line 43
    goto :goto_0

    .line 47
    :sswitch_1
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v2

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    .line 54
    invoke-virtual {p0, v0, v2, v3}, Lcom/qihoo/security/clearengine/a/a$a;->a(I[ILjava/util/List;)V

    .line 55
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 56
    goto :goto_0

    .line 60
    :sswitch_2
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/a/a$a;->a()V

    .line 62
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 63
    goto :goto_0

    .line 67
    :sswitch_3
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/a/a$a;->b()V

    .line 69
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 70
    goto :goto_0

    .line 74
    :sswitch_4
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 76
    sget-object v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    .line 77
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->a(Ljava/util/List;)V

    .line 78
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 79
    goto :goto_0

    .line 83
    :sswitch_5
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/a/a$a;->c()V

    .line 85
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 86
    goto :goto_0

    .line 90
    :sswitch_6
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/a/c$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/clearengine/a/c;

    move-result-object v0

    .line 93
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->a(Lcom/qihoo/security/clearengine/a/c;)V

    .line 94
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 95
    goto :goto_0

    .line 99
    :sswitch_7
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/a/c$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/clearengine/a/c;

    move-result-object v0

    .line 102
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->b(Lcom/qihoo/security/clearengine/a/c;)V

    .line 103
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 104
    goto/16 :goto_0

    .line 108
    :sswitch_8
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/clearengine/a/b;

    move-result-object v0

    .line 111
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->a(Lcom/qihoo/security/clearengine/a/b;)V

    .line 112
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 113
    goto/16 :goto_0

    .line 117
    :sswitch_9
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 119
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/clearengine/a/b;

    move-result-object v0

    .line 120
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->b(Lcom/qihoo/security/clearengine/a/b;)V

    .line 121
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 122
    goto/16 :goto_0

    .line 126
    :sswitch_a
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/a/a$a;->d()V

    .line 128
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 129
    goto/16 :goto_0

    .line 133
    :sswitch_b
    const-string/jumbo v0, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 136
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->a(I)Ljava/util/List;

    move-result-object v0

    .line 137
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 138
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    move v0, v1

    .line 139
    goto/16 :goto_0

    .line 143
    :sswitch_c
    const-string/jumbo v2, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 145
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_0

    .line 146
    sget-object v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 151
    :cond_0
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->a(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 152
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 153
    goto/16 :goto_0

    .line 157
    :sswitch_d
    const-string/jumbo v2, "com.qihoo.security.clearengine.aidl.ITrashCleanService"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 159
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_1

    .line 160
    sget-object v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 165
    :cond_1
    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/a/a$a;->b(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 166
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    .line 167
    goto/16 :goto_0

    .line 38
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0xb -> :sswitch_b
        0xc -> :sswitch_c
        0xd -> :sswitch_d
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
