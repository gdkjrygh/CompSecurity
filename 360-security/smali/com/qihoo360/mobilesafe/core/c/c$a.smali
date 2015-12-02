.class public abstract Lcom/qihoo360/mobilesafe/core/c/c$a;
.super Landroid/os/Binder;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/core/c/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/core/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/core/c/c$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p0, p0, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/c;
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
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v1, :cond_1

    .line 28
    check-cast v0, Lcom/qihoo360/mobilesafe/core/c/c;

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/qihoo360/mobilesafe/core/c/c$a$a;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/core/c/c$a$a;-><init>(Landroid/os/IBinder;)V

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

    .line 179
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    :goto_0
    return v1

    .line 42
    :sswitch_0
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :sswitch_1
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/a;

    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Lcom/qihoo360/mobilesafe/core/c/a;)V

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 56
    :sswitch_2
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/a;

    move-result-object v0

    .line 59
    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->b(Lcom/qihoo360/mobilesafe/core/c/a;)V

    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 65
    :sswitch_3
    const-string/jumbo v2, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 68
    :cond_0
    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Z)V

    goto :goto_0

    .line 73
    :sswitch_4
    const-string/jumbo v2, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    .line 76
    :cond_1
    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->b(Z)V

    .line 77
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 82
    :sswitch_5
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->e()V

    .line 84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 89
    :sswitch_6
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 91
    sget-object v0, Lcom/qihoo360/mobilesafe/service/KillBean;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    .line 92
    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->b(Ljava/util/List;)V

    .line 93
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 98
    :sswitch_7
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 100
    sget-object v0, Lcom/qihoo360/mobilesafe/service/KillBean;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    .line 101
    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Ljava/util/List;)V

    .line 102
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    .line 107
    :sswitch_8
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a()Ljava/util/List;

    move-result-object v0

    .line 109
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 110
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    goto/16 :goto_0

    .line 115
    :sswitch_9
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 116
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->b()Ljava/util/List;

    move-result-object v0

    .line 117
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 118
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    goto/16 :goto_0

    .line 123
    :sswitch_a
    const-string/jumbo v2, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 127
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_2

    move v0, v1

    .line 128
    :cond_2
    invoke-virtual {p0, v2, v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Ljava/lang/String;Z)V

    .line 129
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    .line 134
    :sswitch_b
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->d()V

    .line 136
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    .line 141
    :sswitch_c
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 142
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->c()V

    .line 143
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    .line 148
    :sswitch_d
    const-string/jumbo v2, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 149
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->f()Z

    move-result v2

    .line 150
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 151
    if-eqz v2, :cond_3

    move v0, v1

    :cond_3
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto/16 :goto_0

    .line 156
    :sswitch_e
    const-string/jumbo v2, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 157
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->g()Z

    move-result v2

    .line 158
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 159
    if-eqz v2, :cond_4

    move v0, v1

    :cond_4
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto/16 :goto_0

    .line 164
    :sswitch_f
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->h()Ljava/util/List;

    move-result-object v0

    .line 166
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 167
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    goto/16 :goto_0

    .line 172
    :sswitch_10
    const-string/jumbo v0, "com.qihoo360.mobilesafe.core.service.ISysProcessClear"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 173
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->i()J

    move-result-wide v2

    .line 174
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 175
    invoke-virtual {p3, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

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
        0xe -> :sswitch_e
        0xf -> :sswitch_f
        0x10 -> :sswitch_10
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
