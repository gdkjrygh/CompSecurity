.class public Lcom/facebook/auth/protocol/GetLoggedInUserResult;
.super Lcom/facebook/fbservice/c/a;
.source "GetLoggedInUserResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/auth/protocol/GetLoggedInUserResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/User;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lcom/facebook/auth/protocol/i;

    invoke-direct {v0}, Lcom/facebook/auth/protocol/i;-><init>()V

    sput-object v0, Lcom/facebook/auth/protocol/GetLoggedInUserResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 28
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    iput-object v0, p0, Lcom/facebook/auth/protocol/GetLoggedInUserResult;->a:Lcom/facebook/user/User;

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/auth/protocol/i;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/auth/protocol/GetLoggedInUserResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/user/User;J)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p3, p4}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 23
    iput-object p2, p0, Lcom/facebook/auth/protocol/GetLoggedInUserResult;->a:Lcom/facebook/user/User;

    .line 24
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/auth/protocol/GetLoggedInUserResult;->a:Lcom/facebook/user/User;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/auth/protocol/GetLoggedInUserResult;->a:Lcom/facebook/user/User;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 55
    return-void
.end method
