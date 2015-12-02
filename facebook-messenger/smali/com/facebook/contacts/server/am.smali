.class final Lcom/facebook/contacts/server/am;
.super Ljava/lang/Object;
.source "UsersInviteParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/contacts/server/UsersInviteParams;",
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
.method public a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/UsersInviteParams;
    .locals 1

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/contacts/server/UsersInviteParams;

    invoke-direct {v0, p1}, Lcom/facebook/contacts/server/UsersInviteParams;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/contacts/server/UsersInviteParams;
    .locals 1

    .prologue
    .line 52
    new-array v0, p1, [Lcom/facebook/contacts/server/UsersInviteParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/am;->a(Landroid/os/Parcel;)Lcom/facebook/contacts/server/UsersInviteParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0, p1}, Lcom/facebook/contacts/server/am;->a(I)[Lcom/facebook/contacts/server/UsersInviteParams;

    move-result-object v0

    return-object v0
.end method
