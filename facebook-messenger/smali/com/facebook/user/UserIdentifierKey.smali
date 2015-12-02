.class public Lcom/facebook/user/UserIdentifierKey;
.super Ljava/lang/Object;
.source "UserIdentifierKey.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/facebook/user/s;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    new-instance v0, Lcom/facebook/user/t;

    invoke-direct {v0}, Lcom/facebook/user/t;-><init>()V

    sput-object v0, Lcom/facebook/user/UserIdentifierKey;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/s;

    iput-object v0, p0, Lcom/facebook/user/UserIdentifierKey;->a:Lcom/facebook/user/s;

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    .line 25
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/t;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/user/UserIdentifierKey;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/user/s;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/user/UserIdentifierKey;->a:Lcom/facebook/user/s;

    .line 19
    iput-object p2, p0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 29
    if-ne p0, p1, :cond_1

    .line 39
    :cond_0
    :goto_0
    return v0

    .line 30
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 32
    :cond_3
    check-cast p1, Lcom/facebook/user/UserIdentifierKey;

    .line 34
    iget-object v2, p0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    .line 36
    goto :goto_0

    .line 34
    :cond_5
    iget-object v2, p1, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 37
    :cond_6
    iget-object v2, p0, Lcom/facebook/user/UserIdentifierKey;->a:Lcom/facebook/user/s;

    iget-object v3, p1, Lcom/facebook/user/UserIdentifierKey;->a:Lcom/facebook/user/s;

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 44
    iget-object v0, p0, Lcom/facebook/user/UserIdentifierKey;->a:Lcom/facebook/user/s;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/user/UserIdentifierKey;->a:Lcom/facebook/user/s;

    invoke-virtual {v0}, Lcom/facebook/user/s;->hashCode()I

    move-result v0

    .line 45
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 46
    return v0

    :cond_1
    move v0, v1

    .line 44
    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/user/UserIdentifierKey;->a:Lcom/facebook/user/s;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 68
    iget-object v0, p0, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 69
    return-void
.end method
