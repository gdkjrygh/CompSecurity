.class final Lcom/facebook/orca/server/ax;
.super Ljava/lang/Object;
.source "SetSettingsParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/SetSettingsParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/SetSettingsParams;
    .locals 2

    .prologue
    .line 41
    new-instance v0, Lcom/facebook/orca/server/SetSettingsParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/server/SetSettingsParams;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/server/ax;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/SetSettingsParams;
    .locals 1

    .prologue
    .line 45
    new-array v0, p1, [Lcom/facebook/orca/server/SetSettingsParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/ax;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/SetSettingsParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/ax;->a(I)[Lcom/facebook/orca/server/SetSettingsParams;

    move-result-object v0

    return-object v0
.end method
