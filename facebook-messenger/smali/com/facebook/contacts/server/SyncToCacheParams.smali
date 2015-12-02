.class public Lcom/facebook/contacts/server/SyncToCacheParams;
.super Ljava/lang/Object;
.source "SyncToCacheParams.java"

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
            "Lcom/facebook/contacts/server/SyncToCacheParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/fbservice/service/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/facebook/contacts/server/aa;

    invoke-direct {v0}, Lcom/facebook/contacts/server/aa;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/SyncToCacheParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/s;->valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/SyncToCacheParams;->a:Lcom/facebook/fbservice/service/s;

    .line 26
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/aa;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/SyncToCacheParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/service/s;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/contacts/server/SyncToCacheParams;->a:Lcom/facebook/fbservice/service/s;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/contacts/server/SyncToCacheParams;->a:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/contacts/server/SyncToCacheParams;->a:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 51
    return-void
.end method
