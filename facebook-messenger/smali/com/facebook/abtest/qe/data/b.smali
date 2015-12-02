.class final Lcom/facebook/abtest/qe/data/b;
.super Ljava/lang/Object;
.source "QuickExperimentInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 2

    .prologue
    .line 79
    new-instance v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;-><init>(Landroid/os/Parcel;Lcom/facebook/abtest/qe/data/b;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 1

    .prologue
    .line 84
    new-array v0, p1, [Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/data/b;->a(Landroid/os/Parcel;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/data/b;->a(I)[Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    return-object v0
.end method
