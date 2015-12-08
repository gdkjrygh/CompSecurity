.class public abstract Lcom/google/android/gms/internal/eq$a;
.super Landroid/os/Binder;

# interfaces
.implements Lcom/google/android/gms/internal/eq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/eq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/eq$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p0, p0, v0}, Lcom/google/android/gms/internal/eq$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static B(Landroid/os/IBinder;)Lcom/google/android/gms/internal/eq;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/google/android/gms/internal/eq;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/eq;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/eq$a$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/eq$a$a;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
    .param p1, "code"    # I
    .param p2, "data"    # Landroid/os/Parcel;
    .param p3, "reply"    # Landroid/os/Parcel;
    .param p4, "flags"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x1

    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v2

    :goto_0
    return v2

    :sswitch_0
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->c(ILjava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    :sswitch_2
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->b(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    :sswitch_3
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->onAchievementUpdated(ILjava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    :sswitch_4
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_1
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->c(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    :sswitch_5
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v1

    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_2

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_2
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/eq$a;->a(Lcom/google/android/gms/common/data/d;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :cond_3
    move-object v1, v0

    goto :goto_1

    :sswitch_6
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_4
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->d(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_5
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->e(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_6

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_6
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->f(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_7
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->g(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_8
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->h(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_9

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_9
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->i(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_a

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_a
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->l(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->M(I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_b

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_b
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->m(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->N(I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/eq$a;->onSignOutComplete()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_c

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_c
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->j(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_d

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_d
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->k(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_e

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_e
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->n(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_f

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_f
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->o(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->onLeftRoom(ILjava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_10

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->p(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_11

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_11
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->q(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_12

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_12
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->r(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_13

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_13
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->s(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_1a
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_14

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_14
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->t(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_1b
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_15

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_15
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->a(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_1c
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_16

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_16
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->b(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_1d
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_17

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_17
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->c(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_1e
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_18

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_18
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->d(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_1f
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_19

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_19
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->e(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_20
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1a

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_1a
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/eq$a;->f(Lcom/google/android/gms/common/data/d;[Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_21
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1b

    sget-object v0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    :cond_1b
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->onRealTimeMessageReceived(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_22
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v3}, Lcom/google/android/gms/internal/eq$a;->a(IILjava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_23
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1c

    move v0, v2

    :goto_2
    invoke-virtual {p0, v1, v3, v0}, Lcom/google/android/gms/internal/eq$a;->a(ILjava/lang/String;Z)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :cond_1c
    const/4 v0, 0x0

    goto :goto_2

    :sswitch_24
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1d

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_1d
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->u(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_25
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1e

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_1e
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->v(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_26
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->O(I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_27
    const-string v1, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1f

    sget-object v0, Lcom/google/android/gms/common/data/d;->CREATOR:Lcom/google/android/gms/common/data/e;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/e;->h(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;

    move-result-object v0

    :cond_1f
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->w(Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_28
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->P(I)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_29
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->onP2PConnected(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    :sswitch_2a
    const-string v0, "com.google.android.gms.games.internal.IGamesCallbacks"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/eq$a;->onP2PDisconnected(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1389 -> :sswitch_1
        0x138a -> :sswitch_2
        0x138b -> :sswitch_3
        0x138c -> :sswitch_4
        0x138d -> :sswitch_5
        0x138e -> :sswitch_6
        0x138f -> :sswitch_7
        0x1390 -> :sswitch_8
        0x1391 -> :sswitch_9
        0x1392 -> :sswitch_a
        0x1393 -> :sswitch_b
        0x1394 -> :sswitch_c
        0x1395 -> :sswitch_d
        0x1396 -> :sswitch_e
        0x1397 -> :sswitch_f
        0x1398 -> :sswitch_10
        0x1399 -> :sswitch_11
        0x139a -> :sswitch_13
        0x139b -> :sswitch_14
        0x139c -> :sswitch_15
        0x139d -> :sswitch_16
        0x139e -> :sswitch_17
        0x139f -> :sswitch_18
        0x13a0 -> :sswitch_19
        0x13a1 -> :sswitch_1a
        0x13a2 -> :sswitch_1b
        0x13a3 -> :sswitch_1c
        0x13a4 -> :sswitch_1d
        0x13a5 -> :sswitch_1e
        0x13a6 -> :sswitch_1f
        0x13a7 -> :sswitch_20
        0x13a8 -> :sswitch_21
        0x13a9 -> :sswitch_22
        0x13aa -> :sswitch_23
        0x13ab -> :sswitch_25
        0x13ac -> :sswitch_26
        0x13ad -> :sswitch_12
        0x13ae -> :sswitch_24
        0x13af -> :sswitch_27
        0x13b0 -> :sswitch_28
        0x1771 -> :sswitch_29
        0x1772 -> :sswitch_2a
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
