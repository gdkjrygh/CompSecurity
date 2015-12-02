.class public Lcom/facebook/contacts/server/FetchMobileAppDataResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchMobileAppDataResult.java"

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
            "Lcom/facebook/contacts/server/FetchMobileAppDataResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Lcom/facebook/contacts/server/t;

    invoke-direct {v0}, Lcom/facebook/contacts/server/t;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 35
    const-class v0, Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;->a:Lcom/google/common/a/es;

    .line 36
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/t;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/FetchMobileAppDataResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/c/b;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0, p1, p3, p4}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 30
    iput-object p2, p0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;->a:Lcom/google/common/a/es;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;->a:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 63
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;->a:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 64
    return-void
.end method
