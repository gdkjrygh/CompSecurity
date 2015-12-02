.class final Lcom/facebook/contacts/models/h;
.super Ljava/lang/Object;
.source "EntrySection.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/models/EntrySection;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/EntrySection;
    .locals 2

    .prologue
    .line 80
    new-instance v0, Lcom/facebook/contacts/models/EntrySection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/contacts/models/EntrySection;-><init>(Landroid/os/Parcel;Lcom/facebook/contacts/models/h;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/models/EntrySection;
    .locals 1

    .prologue
    .line 84
    new-array v0, p1, [Lcom/facebook/contacts/models/EntrySection;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/h;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/models/h;->a(I)[Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    return-object v0
.end method
