.class final Lcom/facebook/contacts/server/v;
.super Ljava/lang/Object;
.source "FetchVoipInfoResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/FetchVoipInfoResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchVoipInfoResult;
    .locals 2

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/contacts/server/FetchVoipInfoResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/server/FetchVoipInfoResult;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/v;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/FetchVoipInfoResult;
    .locals 1

    .prologue
    .line 52
    new-array v0, p1, [Lcom/facebook/contacts/server/FetchVoipInfoResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/v;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchVoipInfoResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/v;->a(I)[Lcom/facebook/contacts/server/FetchVoipInfoResult;

    move-result-object v0

    return-object v0
.end method
