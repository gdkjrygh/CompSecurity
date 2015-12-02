.class final Lcom/facebook/contacts/server/n;
.super Ljava/lang/Object;
.source "FetchContactsResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/FetchContactsResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchContactsResult;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/contacts/server/FetchContactsResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/server/FetchContactsResult;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/n;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/FetchContactsResult;
    .locals 1

    .prologue
    .line 50
    new-array v0, p1, [Lcom/facebook/contacts/server/FetchContactsResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/n;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchContactsResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/n;->a(I)[Lcom/facebook/contacts/server/FetchContactsResult;

    move-result-object v0

    return-object v0
.end method
