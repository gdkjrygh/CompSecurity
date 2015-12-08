.class final Lorg/chromium/base/library_loader/Linker$LibInfo$1;
.super Ljava/lang/Object;
.source "Linker.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/library_loader/Linker$LibInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lorg/chromium/base/library_loader/Linker$LibInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Landroid/os/Parcel;

    .prologue
    .line 1000
    invoke-virtual {p0, p1}, Lorg/chromium/base/library_loader/Linker$LibInfo$1;->createFromParcel(Landroid/os/Parcel;)Lorg/chromium/base/library_loader/Linker$LibInfo;

    move-result-object v0

    return-object v0
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/chromium/base/library_loader/Linker$LibInfo;
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 1003
    new-instance v0, Lorg/chromium/base/library_loader/Linker$LibInfo;

    invoke-direct {v0, p1}, Lorg/chromium/base/library_loader/Linker$LibInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    .line 1000
    invoke-virtual {p0, p1}, Lorg/chromium/base/library_loader/Linker$LibInfo$1;->newArray(I)[Lorg/chromium/base/library_loader/Linker$LibInfo;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lorg/chromium/base/library_loader/Linker$LibInfo;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 1008
    new-array v0, p1, [Lorg/chromium/base/library_loader/Linker$LibInfo;

    return-object v0
.end method
