.class final Lcom/facebook/user/f;
.super Ljava/lang/Object;
.source "LastActive.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/LastActive;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/LastActive;
    .locals 1

    .prologue
    .line 37
    new-instance v0, Lcom/facebook/user/LastActive;

    invoke-direct {v0, p1}, Lcom/facebook/user/LastActive;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/LastActive;
    .locals 1

    .prologue
    .line 41
    new-array v0, p1, [Lcom/facebook/user/LastActive;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lcom/facebook/user/f;->a(Landroid/os/Parcel;)Lcom/facebook/user/LastActive;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lcom/facebook/user/f;->a(I)[Lcom/facebook/user/LastActive;

    move-result-object v0

    return-object v0
.end method
