.class final Lcom/facebook/contacts/server/p;
.super Ljava/lang/Object;
.source "FetchDeltaContactsResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/FetchDeltaContactsResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchDeltaContactsResult;
    .locals 2

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/contacts/server/FetchDeltaContactsResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/server/FetchDeltaContactsResult;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/p;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/FetchDeltaContactsResult;
    .locals 1

    .prologue
    .line 76
    new-array v0, p1, [Lcom/facebook/contacts/server/FetchDeltaContactsResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 70
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/p;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchDeltaContactsResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 70
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/p;->a(I)[Lcom/facebook/contacts/server/FetchDeltaContactsResult;

    move-result-object v0

    return-object v0
.end method
