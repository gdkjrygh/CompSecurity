.class public Lcom/facebook/contacts/server/FetchContactParams;
.super Ljava/lang/Object;
.source "FetchContactParams.java"

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
            "Lcom/facebook/contacts/server/FetchContactParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/user/UserKey;

.field private final b:Lcom/facebook/fbservice/service/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Lcom/facebook/contacts/server/k;

    invoke-direct {v0}, Lcom/facebook/contacts/server/k;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/FetchContactParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchContactParams;->a:Lcom/facebook/user/UserKey;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/s;->valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchContactParams;->b:Lcom/facebook/fbservice/service/s;

    .line 32
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/k;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/FetchContactParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/user/UserKey;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Lcom/facebook/contacts/server/FetchContactParams;->a:Lcom/facebook/user/UserKey;

    .line 26
    iput-object p1, p0, Lcom/facebook/contacts/server/FetchContactParams;->b:Lcom/facebook/fbservice/service/s;

    .line 27
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactParams;->a:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public b()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactParams;->b:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactParams;->a:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactParams;->b:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    return-void
.end method
