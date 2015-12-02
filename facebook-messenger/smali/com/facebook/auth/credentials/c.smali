.class final Lcom/facebook/auth/credentials/c;
.super Ljava/lang/Object;
.source "PasswordCredentials.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/auth/credentials/PasswordCredentials;",
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
.method public a(Landroid/os/Parcel;)Lcom/facebook/auth/credentials/PasswordCredentials;
    .locals 2

    .prologue
    .line 37
    new-instance v0, Lcom/facebook/auth/credentials/PasswordCredentials;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/auth/credentials/PasswordCredentials;-><init>(Landroid/os/Parcel;Lcom/facebook/auth/credentials/c;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/auth/credentials/PasswordCredentials;
    .locals 1

    .prologue
    .line 41
    new-array v0, p1, [Lcom/facebook/auth/credentials/PasswordCredentials;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lcom/facebook/auth/credentials/c;->a(Landroid/os/Parcel;)Lcom/facebook/auth/credentials/PasswordCredentials;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lcom/facebook/auth/credentials/c;->a(I)[Lcom/facebook/auth/credentials/PasswordCredentials;

    move-result-object v0

    return-object v0
.end method
