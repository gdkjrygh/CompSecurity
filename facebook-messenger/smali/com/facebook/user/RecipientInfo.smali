.class public Lcom/facebook/user/RecipientInfo;
.super Ljava/lang/Object;
.source "RecipientInfo.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/user/RecipientInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/UserIdentifier;

.field private final b:Lcom/facebook/user/Name;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    new-instance v0, Lcom/facebook/user/l;

    invoke-direct {v0}, Lcom/facebook/user/l;-><init>()V

    sput-object v0, Lcom/facebook/user/RecipientInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-class v0, Lcom/facebook/user/UserIdentifier;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserIdentifier;

    iput-object v0, p0, Lcom/facebook/user/RecipientInfo;->a:Lcom/facebook/user/UserIdentifier;

    .line 25
    const-class v0, Lcom/facebook/user/Name;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/Name;

    iput-object v0, p0, Lcom/facebook/user/RecipientInfo;->b:Lcom/facebook/user/Name;

    .line 26
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/l;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/user/RecipientInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/user/UserIdentifier;Lcom/facebook/user/Name;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/user/RecipientInfo;->a:Lcom/facebook/user/UserIdentifier;

    .line 20
    iput-object p2, p0, Lcom/facebook/user/RecipientInfo;->b:Lcom/facebook/user/Name;

    .line 21
    return-void
.end method

.method public static a(Lcom/facebook/user/UserWithIdentifier;)Lcom/facebook/user/RecipientInfo;
    .locals 3

    .prologue
    .line 38
    new-instance v0, Lcom/facebook/user/RecipientInfo;

    invoke-virtual {p0}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/RecipientInfo;-><init>(Lcom/facebook/user/UserIdentifier;Lcom/facebook/user/Name;)V

    return-object v0
.end method

.method public static a(Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserWithIdentifier;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/RecipientInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 29
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 30
    invoke-virtual {p0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserWithIdentifier;

    .line 31
    invoke-static {v0}, Lcom/facebook/user/RecipientInfo;->a(Lcom/facebook/user/UserWithIdentifier;)Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    .line 32
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/user/UserIdentifier;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/user/RecipientInfo;->a:Lcom/facebook/user/UserIdentifier;

    return-object v0
.end method

.method public b()Lcom/facebook/user/Name;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/user/RecipientInfo;->b:Lcom/facebook/user/Name;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/user/RecipientInfo;->b:Lcom/facebook/user/Name;

    invoke-virtual {v0}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/user/RecipientInfo;->a:Lcom/facebook/user/UserIdentifier;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 75
    iget-object v0, p0, Lcom/facebook/user/RecipientInfo;->b:Lcom/facebook/user/Name;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 76
    return-void
.end method
