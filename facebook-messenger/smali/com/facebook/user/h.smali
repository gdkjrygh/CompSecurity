.class final Lcom/facebook/user/h;
.super Ljava/lang/Object;
.source "Name.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/Name;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/Name;
    .locals 2

    .prologue
    .line 177
    new-instance v0, Lcom/facebook/user/Name;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/Name;-><init>(Landroid/os/Parcel;Lcom/facebook/user/h;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/Name;
    .locals 1

    .prologue
    .line 181
    new-array v0, p1, [Lcom/facebook/user/Name;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 175
    invoke-virtual {p0, p1}, Lcom/facebook/user/h;->a(Landroid/os/Parcel;)Lcom/facebook/user/Name;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 175
    invoke-virtual {p0, p1}, Lcom/facebook/user/h;->a(I)[Lcom/facebook/user/Name;

    move-result-object v0

    return-object v0
.end method
