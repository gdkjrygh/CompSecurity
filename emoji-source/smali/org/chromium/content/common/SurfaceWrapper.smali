.class public Lorg/chromium/content/common/SurfaceWrapper;
.super Ljava/lang/Object;
.source "SurfaceWrapper.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lorg/chromium/content/common/SurfaceWrapper;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mSurface:Landroid/view/Surface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lorg/chromium/content/common/SurfaceWrapper$1;

    invoke-direct {v0}, Lorg/chromium/content/common/SurfaceWrapper$1;-><init>()V

    sput-object v0, Lorg/chromium/content/common/SurfaceWrapper;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;)V
    .locals 0
    .param p1, "surface"    # Landroid/view/Surface;

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lorg/chromium/content/common/SurfaceWrapper;->mSurface:Landroid/view/Surface;

    .line 19
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    return v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lorg/chromium/content/common/SurfaceWrapper;->mSurface:Landroid/view/Surface;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 33
    iget-object v0, p0, Lorg/chromium/content/common/SurfaceWrapper;->mSurface:Landroid/view/Surface;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/Surface;->writeToParcel(Landroid/os/Parcel;I)V

    .line 34
    return-void
.end method
