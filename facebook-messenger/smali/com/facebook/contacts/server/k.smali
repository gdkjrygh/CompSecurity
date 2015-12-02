.class final Lcom/facebook/contacts/server/k;
.super Ljava/lang/Object;
.source "FetchContactParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/FetchContactParams;",
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
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchContactParams;
    .locals 2

    .prologue
    .line 45
    new-instance v0, Lcom/facebook/contacts/server/FetchContactParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/server/FetchContactParams;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/k;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/FetchContactParams;
    .locals 1

    .prologue
    .line 49
    new-array v0, p1, [Lcom/facebook/contacts/server/FetchContactParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/k;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/FetchContactParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/k;->a(I)[Lcom/facebook/contacts/server/FetchContactParams;

    move-result-object v0

    return-object v0
.end method
