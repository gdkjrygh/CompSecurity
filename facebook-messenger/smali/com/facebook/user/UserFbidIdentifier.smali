.class public Lcom/facebook/user/UserFbidIdentifier;
.super Lcom/facebook/user/UserIdentifier;
.source "UserFbidIdentifier.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/user/UserFbidIdentifier;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/UserIdentifierKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    new-instance v0, Lcom/facebook/user/r;

    invoke-direct {v0}, Lcom/facebook/user/r;-><init>()V

    sput-object v0, Lcom/facebook/user/UserFbidIdentifier;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/user/UserIdentifier;-><init>()V

    .line 22
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v1, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/UserFbidIdentifier;->a:Lcom/facebook/user/UserIdentifierKey;

    .line 24
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/r;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/user/UserFbidIdentifier;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/facebook/user/UserIdentifier;-><init>()V

    .line 17
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v1, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    invoke-direct {v0, v1, p1}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/UserFbidIdentifier;->a:Lcom/facebook/user/UserIdentifierKey;

    .line 19
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/user/UserFbidIdentifier;->a:Lcom/facebook/user/UserIdentifierKey;

    iget-object v0, v0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/user/UserFbidIdentifier;->a:Lcom/facebook/user/UserIdentifierKey;

    iget-object v0, v0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/user/UserIdentifierKey;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/user/UserFbidIdentifier;->a:Lcom/facebook/user/UserIdentifierKey;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/user/UserFbidIdentifier;->a:Lcom/facebook/user/UserIdentifierKey;

    iget-object v0, v0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/facebook/user/s;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 68
    invoke-virtual {p0}, Lcom/facebook/user/UserFbidIdentifier;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 69
    return-void
.end method
