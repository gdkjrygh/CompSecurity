.class final Lcom/facebook/contacts/models/c;
.super Ljava/lang/Object;
.source "ContactDetails.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/models/ContactDetails;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/ContactDetails;
    .locals 2

    .prologue
    .line 68
    new-instance v0, Lcom/facebook/contacts/models/ContactDetails;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/models/ContactDetails;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/models/c;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/models/ContactDetails;
    .locals 1

    .prologue
    .line 72
    new-array v0, p1, [Lcom/facebook/contacts/models/ContactDetails;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/c;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/c;->a(I)[Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v0

    return-object v0
.end method
