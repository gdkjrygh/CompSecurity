.class public Lcom/facebook/user/UserWithIdentifier;
.super Ljava/lang/Object;
.source "UserWithIdentifier.java"

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
            "Lcom/facebook/user/UserWithIdentifier;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/User;

.field private final b:Lcom/facebook/user/UserIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/user/ai;

    invoke-direct {v0}, Lcom/facebook/user/ai;-><init>()V

    sput-object v0, Lcom/facebook/user/UserWithIdentifier;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    iput-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->a:Lcom/facebook/user/User;

    .line 26
    const-class v0, Lcom/facebook/user/UserIdentifier;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserIdentifier;

    iput-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    .line 27
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/ai;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/user/UserWithIdentifier;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/user/UserWithIdentifier;->a:Lcom/facebook/user/User;

    .line 21
    iput-object p2, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->a:Lcom/facebook/user/User;

    return-object v0
.end method

.method public b()Lcom/facebook/user/UserKey;
    .locals 3

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    if-ne v0, v1, :cond_0

    .line 35
    invoke-virtual {p0}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 41
    :goto_0
    return-object v0

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    if-ne v0, v1, :cond_1

    .line 37
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v1, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    invoke-virtual {p0}, Lcom/facebook/user/UserWithIdentifier;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/s;->EMAIL:Lcom/facebook/user/s;

    if-ne v0, v1, :cond_2

    .line 39
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v1, Lcom/facebook/user/n;->EMAIL:Lcom/facebook/user/n;

    invoke-virtual {p0}, Lcom/facebook/user/UserWithIdentifier;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    goto :goto_0

    .line 41
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/facebook/user/UserIdentifier;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->a:Lcom/facebook/user/User;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 72
    iget-object v0, p0, Lcom/facebook/user/UserWithIdentifier;->b:Lcom/facebook/user/UserIdentifier;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 73
    return-void
.end method
