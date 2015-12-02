.class final Lcom/facebook/auth/credentials/f;
.super Ljava/lang/Object;
.source "UserTokenCredentials.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/auth/credentials/UserTokenCredentials;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/auth/credentials/UserTokenCredentials;
    .locals 3

    .prologue
    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 77
    new-instance v2, Lcom/facebook/auth/credentials/UserTokenCredentials;

    invoke-direct {v2, v0, v1}, Lcom/facebook/auth/credentials/UserTokenCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public a(I)[Lcom/facebook/auth/credentials/UserTokenCredentials;
    .locals 1

    .prologue
    .line 82
    new-array v0, p1, [Lcom/facebook/auth/credentials/UserTokenCredentials;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0, p1}, Lcom/facebook/auth/credentials/f;->a(Landroid/os/Parcel;)Lcom/facebook/auth/credentials/UserTokenCredentials;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0, p1}, Lcom/facebook/auth/credentials/f;->a(I)[Lcom/facebook/auth/credentials/UserTokenCredentials;

    move-result-object v0

    return-object v0
.end method
