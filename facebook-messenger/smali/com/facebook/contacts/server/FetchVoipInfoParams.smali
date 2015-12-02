.class public Lcom/facebook/contacts/server/FetchVoipInfoParams;
.super Ljava/lang/Object;
.source "FetchVoipInfoParams.java"

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
            "Lcom/facebook/contacts/server/FetchVoipInfoParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/facebook/contacts/server/u;

    invoke-direct {v0}, Lcom/facebook/contacts/server/u;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/FetchVoipInfoParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-wide p1, p0, Lcom/facebook/contacts/server/FetchVoipInfoParams;->a:J

    .line 21
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoParams;->a:J

    .line 25
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/u;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/FetchVoipInfoParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 28
    iget-wide v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoParams;->a:J

    return-wide v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 49
    iget-wide v0, p0, Lcom/facebook/contacts/server/FetchVoipInfoParams;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 50
    return-void
.end method
