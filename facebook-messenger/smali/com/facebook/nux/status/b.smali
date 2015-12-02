.class final Lcom/facebook/nux/status/b;
.super Ljava/lang/Object;
.source "FetchNuxStatusesParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/nux/status/FetchNuxStatusesParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/nux/status/FetchNuxStatusesParams;
    .locals 2

    .prologue
    .line 36
    new-instance v0, Lcom/facebook/nux/status/FetchNuxStatusesParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/nux/status/FetchNuxStatusesParams;-><init>(Landroid/os/Parcel;Lcom/facebook/nux/status/b;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/nux/status/FetchNuxStatusesParams;
    .locals 1

    .prologue
    .line 41
    new-array v0, p1, [Lcom/facebook/nux/status/FetchNuxStatusesParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Lcom/facebook/nux/status/b;->a(Landroid/os/Parcel;)Lcom/facebook/nux/status/FetchNuxStatusesParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Lcom/facebook/nux/status/b;->a(I)[Lcom/facebook/nux/status/FetchNuxStatusesParams;

    move-result-object v0

    return-object v0
.end method
