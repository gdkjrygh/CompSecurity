.class final Lcom/facebook/user/l;
.super Ljava/lang/Object;
.source "RecipientInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/RecipientInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/RecipientInfo;
    .locals 2

    .prologue
    .line 59
    new-instance v0, Lcom/facebook/user/RecipientInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/RecipientInfo;-><init>(Landroid/os/Parcel;Lcom/facebook/user/l;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/RecipientInfo;
    .locals 1

    .prologue
    .line 63
    new-array v0, p1, [Lcom/facebook/user/RecipientInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/facebook/user/l;->a(Landroid/os/Parcel;)Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/facebook/user/l;->a(I)[Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    return-object v0
.end method
