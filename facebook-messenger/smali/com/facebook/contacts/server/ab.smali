.class final Lcom/facebook/contacts/server/ab;
.super Ljava/lang/Object;
.source "UpdateFavoriteContactsParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;",
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
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;
    .locals 1

    .prologue
    .line 37
    new-instance v0, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    invoke-direct {v0, p1}, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;
    .locals 1

    .prologue
    .line 41
    new-array v0, p1, [Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/ab;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/ab;->a(I)[Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    move-result-object v0

    return-object v0
.end method
