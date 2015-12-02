.class final Lcom/facebook/contacts/picker/k;
.super Ljava/lang/Object;
.source "ContactPickerColorScheme.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/picker/ContactPickerColorScheme;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/picker/ContactPickerColorScheme;
    .locals 2

    .prologue
    .line 26
    invoke-static {}, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->values()[Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/picker/ContactPickerColorScheme;
    .locals 1

    .prologue
    .line 31
    new-array v0, p1, [Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/picker/k;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/picker/k;->a(I)[Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    move-result-object v0

    return-object v0
.end method
