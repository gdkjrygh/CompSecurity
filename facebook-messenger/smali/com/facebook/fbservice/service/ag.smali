.class final Lcom/facebook/fbservice/service/ag;
.super Ljava/lang/Object;
.source "OperationType.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/fbservice/service/OperationType;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/fbservice/service/OperationType;
    .locals 2

    .prologue
    .line 118
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Landroid/os/Parcel;Lcom/facebook/fbservice/service/ag;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/fbservice/service/OperationType;
    .locals 1

    .prologue
    .line 122
    new-array v0, p1, [Lcom/facebook/fbservice/service/OperationType;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 116
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/ag;->a(Landroid/os/Parcel;)Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 116
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/ag;->a(I)[Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    return-object v0
.end method
