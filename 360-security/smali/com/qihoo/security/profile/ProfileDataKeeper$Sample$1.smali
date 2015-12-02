.class final Lcom/qihoo/security/profile/ProfileDataKeeper$Sample$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;
    .locals 1

    .prologue
    .line 27
    new-instance v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    invoke-direct {v0, p1}, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;
    .locals 1

    .prologue
    .line 31
    new-array v0, p1, [Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0, p1}, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample$1;->a(Landroid/os/Parcel;)Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0, p1}, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample$1;->a(I)[Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    move-result-object v0

    return-object v0
.end method
