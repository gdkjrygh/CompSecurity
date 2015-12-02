.class public Lcom/facebook/user/UserKey;
.super Ljava/lang/Object;
.source "UserKey.java"

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
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/n;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 160
    new-instance v0, Lcom/facebook/user/w;

    invoke-direct {v0}, Lcom/facebook/user/w;-><init>()V

    sput-object v0, Lcom/facebook/user/UserKey;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/n;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/u;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/user/UserKey;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/user/n;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/facebook/user/n;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "id"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/user/UserKey;->a:Lcom/facebook/user/n;

    .line 35
    iput-object p2, p0, Lcom/facebook/user/UserKey;->b:Ljava/lang/String;

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/UserKey;->c:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public static a(Lcom/facebook/user/UserIdentifier;)Lcom/facebook/user/UserKey;
    .locals 3

    .prologue
    .line 57
    instance-of v0, p0, Lcom/facebook/user/UserFbidIdentifier;

    if-eqz v0, :cond_0

    .line 58
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {p0}, Lcom/facebook/user/UserIdentifier;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 64
    :goto_0
    return-object v0

    .line 59
    :cond_0
    instance-of v0, p0, Lcom/facebook/user/UserPhoneNumber;

    if-eqz v0, :cond_1

    .line 60
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v1, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    invoke-virtual {p0}, Lcom/facebook/user/UserIdentifier;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0

    .line 61
    :cond_1
    instance-of v0, p0, Lcom/facebook/user/UserEmailAddress;

    if-eqz v0, :cond_2

    .line 62
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v1, Lcom/facebook/user/n;->EMAIL:Lcom/facebook/user/n;

    invoke-virtual {p0}, Lcom/facebook/user/UserIdentifier;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0

    .line 64
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/user/UserKey;
    .locals 4

    .prologue
    const/4 v2, 0x2

    .line 44
    if-nez p0, :cond_0

    .line 45
    const/4 v0, 0x0

    .line 52
    :goto_0
    return-object v0

    .line 47
    :cond_0
    const-string v0, ":"

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    .line 48
    array-length v0, v1

    if-eq v0, v2, :cond_1

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot parse user key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v1, v0

    invoke-static {v0}, Lcom/facebook/user/n;->valueOf(Ljava/lang/String;)Lcom/facebook/user/n;

    move-result-object v2

    .line 52
    new-instance v0, Lcom/facebook/user/UserKey;

    const/4 v3, 0x1

    aget-object v1, v1, v3

    invoke-direct {v0, v2, v1}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 130
    new-instance v0, Lcom/facebook/user/u;

    invoke-direct {v0}, Lcom/facebook/user/u;-><init>()V

    invoke-static {p0, v0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 149
    new-instance v0, Lcom/facebook/user/v;

    invoke-direct {v0}, Lcom/facebook/user/v;-><init>()V

    invoke-static {p0, v0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/user/n;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/user/UserKey;->a:Lcom/facebook/user/n;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/user/UserKey;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/user/UserKey;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/user/UserKey;->a:Lcom/facebook/user/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/user/UserKey;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 172
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 82
    if-ne p0, p1, :cond_1

    .line 98
    :cond_0
    :goto_0
    return v0

    .line 85
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 86
    goto :goto_0

    .line 89
    :cond_3
    check-cast p1, Lcom/facebook/user/UserKey;

    .line 91
    iget-object v2, p0, Lcom/facebook/user/UserKey;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/user/UserKey;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    .line 92
    goto :goto_0

    .line 94
    :cond_4
    iget-object v2, p0, Lcom/facebook/user/UserKey;->a:Lcom/facebook/user/n;

    iget-object v3, p1, Lcom/facebook/user/UserKey;->a:Lcom/facebook/user/n;

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 95
    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/user/UserKey;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 104
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/user/UserKey;->a:Lcom/facebook/user/n;

    invoke-virtual {v1}, Lcom/facebook/user/n;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 105
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/user/UserKey;->c:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/user/UserKey;->a:Lcom/facebook/user/n;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 178
    iget-object v0, p0, Lcom/facebook/user/UserKey;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 179
    return-void
.end method
