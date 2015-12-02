.class final Lcom/facebook/bugreporter/activity/categorylist/a;
.super Ljava/lang/Object;
.source "CategoryInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;
    .locals 2

    .prologue
    .line 47
    new-instance v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;-><init>(Landroid/os/Parcel;Lcom/facebook/bugreporter/activity/categorylist/a;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;
    .locals 1

    .prologue
    .line 52
    new-array v0, p1, [Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/categorylist/a;->a(Landroid/os/Parcel;)Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/activity/categorylist/a;->a(I)[Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    move-result-object v0

    return-object v0
.end method
