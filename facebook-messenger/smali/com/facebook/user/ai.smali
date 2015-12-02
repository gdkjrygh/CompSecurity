.class final Lcom/facebook/user/ai;
.super Ljava/lang/Object;
.source "UserWithIdentifier.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/UserWithIdentifier;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/UserWithIdentifier;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Lcom/facebook/user/UserWithIdentifier;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/UserWithIdentifier;-><init>(Landroid/os/Parcel;Lcom/facebook/user/ai;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/UserWithIdentifier;
    .locals 1

    .prologue
    .line 60
    new-array v0, p1, [Lcom/facebook/user/UserWithIdentifier;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0, p1}, Lcom/facebook/user/ai;->a(Landroid/os/Parcel;)Lcom/facebook/user/UserWithIdentifier;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0, p1}, Lcom/facebook/user/ai;->a(I)[Lcom/facebook/user/UserWithIdentifier;

    move-result-object v0

    return-object v0
.end method
