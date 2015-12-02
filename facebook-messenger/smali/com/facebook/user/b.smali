.class final Lcom/facebook/user/b;
.super Ljava/lang/Object;
.source "ChatContext.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/ChatContext;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/ChatContext;
    .locals 2

    .prologue
    .line 94
    new-instance v0, Lcom/facebook/user/ChatContext;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/ChatContext;-><init>(Landroid/os/Parcel;Lcom/facebook/user/b;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/ChatContext;
    .locals 1

    .prologue
    .line 98
    new-array v0, p1, [Lcom/facebook/user/ChatContext;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0, p1}, Lcom/facebook/user/b;->a(Landroid/os/Parcel;)Lcom/facebook/user/ChatContext;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0, p1}, Lcom/facebook/user/b;->a(I)[Lcom/facebook/user/ChatContext;

    move-result-object v0

    return-object v0
.end method
