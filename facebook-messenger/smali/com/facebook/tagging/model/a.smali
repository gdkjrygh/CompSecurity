.class final Lcom/facebook/tagging/model/a;
.super Ljava/lang/Object;
.source "TagProfile.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/tagging/model/TagProfile;",
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
.method public a(Landroid/os/Parcel;)Lcom/facebook/tagging/model/TagProfile;
    .locals 1

    .prologue
    .line 50
    new-instance v0, Lcom/facebook/tagging/model/TagProfile;

    invoke-direct {v0, p1}, Lcom/facebook/tagging/model/TagProfile;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/tagging/model/TagProfile;
    .locals 1

    .prologue
    .line 55
    new-array v0, p1, [Lcom/facebook/tagging/model/TagProfile;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0, p1}, Lcom/facebook/tagging/model/a;->a(Landroid/os/Parcel;)Lcom/facebook/tagging/model/TagProfile;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-virtual {p0, p1}, Lcom/facebook/tagging/model/a;->a(I)[Lcom/facebook/tagging/model/TagProfile;

    move-result-object v0

    return-object v0
.end method
