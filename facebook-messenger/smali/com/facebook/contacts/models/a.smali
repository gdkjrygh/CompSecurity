.class final Lcom/facebook/contacts/models/a;
.super Ljava/lang/Object;
.source "Contact.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/models/Contact;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/Contact;
    .locals 2

    .prologue
    .line 241
    new-instance v0, Lcom/facebook/contacts/models/Contact;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/models/Contact;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/models/a;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/models/Contact;
    .locals 1

    .prologue
    .line 244
    new-array v0, p1, [Lcom/facebook/contacts/models/Contact;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 239
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/a;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 239
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/a;->a(I)[Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    return-object v0
.end method
