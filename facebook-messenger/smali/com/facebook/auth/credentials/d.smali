.class final Lcom/facebook/auth/credentials/d;
.super Ljava/lang/Object;
.source "SessionCookie.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/auth/credentials/SessionCookie;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/auth/credentials/SessionCookie;
    .locals 1

    .prologue
    .line 118
    new-instance v0, Lcom/facebook/auth/credentials/SessionCookie;

    invoke-direct {v0, p1}, Lcom/facebook/auth/credentials/SessionCookie;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/auth/credentials/SessionCookie;
    .locals 1

    .prologue
    .line 123
    new-array v0, p1, [Lcom/facebook/auth/credentials/SessionCookie;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 114
    invoke-virtual {p0, p1}, Lcom/facebook/auth/credentials/d;->a(Landroid/os/Parcel;)Lcom/facebook/auth/credentials/SessionCookie;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 114
    invoke-virtual {p0, p1}, Lcom/facebook/auth/credentials/d;->a(I)[Lcom/facebook/auth/credentials/SessionCookie;

    move-result-object v0

    return-object v0
.end method
