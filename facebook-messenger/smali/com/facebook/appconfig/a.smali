.class final Lcom/facebook/appconfig/a;
.super Ljava/lang/Object;
.source "AppConfig.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/appconfig/AppConfig;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/appconfig/AppConfig;
    .locals 1

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/appconfig/AppConfig;

    invoke-direct {v0, p1}, Lcom/facebook/appconfig/AppConfig;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/appconfig/AppConfig;
    .locals 1

    .prologue
    .line 77
    new-array v0, p1, [Lcom/facebook/appconfig/AppConfig;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0, p1}, Lcom/facebook/appconfig/a;->a(Landroid/os/Parcel;)Lcom/facebook/appconfig/AppConfig;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0, p1}, Lcom/facebook/appconfig/a;->a(I)[Lcom/facebook/appconfig/AppConfig;

    move-result-object v0

    return-object v0
.end method
