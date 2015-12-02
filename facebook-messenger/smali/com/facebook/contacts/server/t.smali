.class final Lcom/facebook/contacts/server/t;
.super Ljava/lang/Object;
.source "FetchMobileAppDataResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/FetchMobileAppDataResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchMobileAppDataResult;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/server/FetchMobileAppDataResult;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/t;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/FetchMobileAppDataResult;
    .locals 1

    .prologue
    .line 51
    new-array v0, p1, [Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/t;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/t;->a(I)[Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    move-result-object v0

    return-object v0
.end method
