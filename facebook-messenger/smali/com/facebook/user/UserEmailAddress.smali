.class public Lcom/facebook/user/UserEmailAddress;
.super Lcom/facebook/user/UserIdentifier;
.source "UserEmailAddress.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/user/UserEmailAddress;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/UserIdentifierKey;

.field private final b:Ljava/lang/String;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/user/q;

    invoke-direct {v0}, Lcom/facebook/user/q;-><init>()V

    sput-object v0, Lcom/facebook/user/UserEmailAddress;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/user/UserIdentifier;-><init>()V

    .line 29
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v1, Lcom/facebook/user/s;->EMAIL:Lcom/facebook/user/s;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/UserEmailAddress;->a:Lcom/facebook/user/UserIdentifierKey;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/UserEmailAddress;->b:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/user/UserEmailAddress;->c:I

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/q;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/user/UserEmailAddress;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/user/UserIdentifier;-><init>()V

    .line 22
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    sget-object v1, Lcom/facebook/user/s;->EMAIL:Lcom/facebook/user/s;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserIdentifierKey;-><init>(Lcom/facebook/user/s;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/user/UserEmailAddress;->a:Lcom/facebook/user/UserIdentifierKey;

    .line 24
    iput-object p1, p0, Lcom/facebook/user/UserEmailAddress;->b:Ljava/lang/String;

    .line 25
    iput p2, p0, Lcom/facebook/user/UserEmailAddress;->c:I

    .line 26
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/user/UserEmailAddress;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/user/UserEmailAddress;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lcom/facebook/user/UserEmailAddress;->c:I

    return v0
.end method

.method public c()Lcom/facebook/user/UserIdentifierKey;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/user/UserEmailAddress;->a:Lcom/facebook/user/UserIdentifierKey;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/user/UserEmailAddress;->a:Lcom/facebook/user/UserIdentifierKey;

    iget-object v0, v0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/facebook/user/s;
    .locals 1

    .prologue
    .line 60
    sget-object v0, Lcom/facebook/user/s;->EMAIL:Lcom/facebook/user/s;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Lcom/facebook/user/UserEmailAddress;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/facebook/user/UserEmailAddress;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget v0, p0, Lcom/facebook/user/UserEmailAddress;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    return-void
.end method
