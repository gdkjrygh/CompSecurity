.class final Lcom/facebook/contacts/server/g;
.super Ljava/lang/Object;
.source "FetchAllContactsParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/FetchAllContactsParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchAllContactsParams;
    .locals 2

    .prologue
    .line 55
    new-instance v0, Lcom/facebook/contacts/server/FetchAllContactsParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/server/FetchAllContactsParams;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/g;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/FetchAllContactsParams;
    .locals 1

    .prologue
    .line 59
    new-array v0, p1, [Lcom/facebook/contacts/server/FetchAllContactsParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/g;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchAllContactsParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/g;->a(I)[Lcom/facebook/contacts/server/FetchAllContactsParams;

    move-result-object v0

    return-object v0
.end method
