.class final Lcom/facebook/auth/login/u;
.super Ljava/lang/Object;
.source "AuthStateMachineConfig.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;
    .locals 2

    .prologue
    .line 65
    new-instance v0, Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;-><init>(Landroid/os/Parcel;Lcom/facebook/auth/login/t;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;
    .locals 1

    .prologue
    .line 70
    new-array v0, p1, [Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0, p1}, Lcom/facebook/auth/login/u;->a(Landroid/os/Parcel;)Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0, p1}, Lcom/facebook/auth/login/u;->a(I)[Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;

    move-result-object v0

    return-object v0
.end method
