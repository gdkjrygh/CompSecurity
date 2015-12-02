.class final Lcom/facebook/fbservice/service/ae;
.super Ljava/lang/Object;
.source "OperationResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 318
    new-instance v0, Lcom/facebook/fbservice/service/OperationResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/fbservice/service/OperationResult;-><init>(Landroid/os/Parcel;Lcom/facebook/fbservice/service/ae;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 322
    new-array v0, p1, [Lcom/facebook/fbservice/service/OperationResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 316
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/ae;->a(Landroid/os/Parcel;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 316
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/ae;->a(I)[Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
