.class final Lcom/facebook/orca/attachments/h;
.super Ljava/lang/Object;
.source "OtherAttachmentData.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/attachments/OtherAttachmentData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/attachments/OtherAttachmentData;
    .locals 2

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/orca/attachments/OtherAttachmentData;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/attachments/OtherAttachmentData;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/attachments/h;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/attachments/OtherAttachmentData;
    .locals 1

    .prologue
    .line 76
    new-array v0, p1, [Lcom/facebook/orca/attachments/OtherAttachmentData;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 70
    invoke-virtual {p0, p1}, Lcom/facebook/orca/attachments/h;->a(Landroid/os/Parcel;)Lcom/facebook/orca/attachments/OtherAttachmentData;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 70
    invoke-virtual {p0, p1}, Lcom/facebook/orca/attachments/h;->a(I)[Lcom/facebook/orca/attachments/OtherAttachmentData;

    move-result-object v0

    return-object v0
.end method
