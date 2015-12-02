.class public Lcom/facebook/nux/status/UpdateNuxStatusParams;
.super Ljava/lang/Object;
.source "UpdateNuxStatusParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/nux/status/UpdateNuxStatusParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/nux/status/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/nux/status/m;

    invoke-direct {v0}, Lcom/facebook/nux/status/m;-><init>()V

    sput-object v0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->a:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->b:Ljava/lang/String;

    .line 26
    invoke-static {}, Lcom/facebook/nux/status/n;->values()[Lcom/facebook/nux/status/n;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->c:Lcom/facebook/nux/status/n;

    .line 27
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/nux/status/m;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/nux/status/UpdateNuxStatusParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/nux/status/n;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->c:Lcom/facebook/nux/status/n;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/facebook/nux/status/UpdateNuxStatusParams;->c:Lcom/facebook/nux/status/n;

    invoke-virtual {v0}, Lcom/facebook/nux/status/n;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    return-void
.end method
