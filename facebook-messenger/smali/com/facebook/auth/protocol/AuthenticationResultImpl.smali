.class public Lcom/facebook/auth/protocol/AuthenticationResultImpl;
.super Ljava/lang/Object;
.source "AuthenticationResultImpl.java"

# interfaces
.implements Lcom/facebook/auth/protocol/AuthenticationResult;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/auth/protocol/AuthenticationResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/auth/credentials/FacebookCredentials;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/auth/protocol/g;

    invoke-direct {v0}, Lcom/facebook/auth/protocol/g;-><init>()V

    sput-object v0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->a:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/credentials/FacebookCredentials;

    iput-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->b:Lcom/facebook/auth/credentials/FacebookCredentials;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->c:Ljava/lang/String;

    .line 31
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/auth/protocol/g;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/auth/protocol/AuthenticationResultImpl;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/auth/credentials/FacebookCredentials;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->a:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->b:Lcom/facebook/auth/credentials/FacebookCredentials;

    .line 24
    iput-object p3, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->c:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/credentials/FacebookCredentials;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->b:Lcom/facebook/auth/credentials/FacebookCredentials;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->c:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->b:Lcom/facebook/auth/credentials/FacebookCredentials;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 70
    iget-object v0, p0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 71
    return-void
.end method
