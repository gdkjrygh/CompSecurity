.class final Lcom/facebook/contacts/models/entry/e;
.super Ljava/lang/Object;
.source "PhoneEntry.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/models/entry/PhoneEntry;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/entry/PhoneEntry;
    .locals 1

    .prologue
    .line 121
    new-instance v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    invoke-direct {v0, p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/models/entry/PhoneEntry;
    .locals 1

    .prologue
    .line 125
    new-array v0, p1, [Lcom/facebook/contacts/models/entry/PhoneEntry;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 119
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/entry/e;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/entry/PhoneEntry;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 119
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/entry/e;->a(I)[Lcom/facebook/contacts/models/entry/PhoneEntry;

    move-result-object v0

    return-object v0
.end method
