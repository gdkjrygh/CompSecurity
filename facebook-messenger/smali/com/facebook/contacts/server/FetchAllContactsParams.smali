.class public Lcom/facebook/contacts/server/FetchAllContactsParams;
.super Ljava/lang/Object;
.source "FetchAllContactsParams.java"

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
            "Lcom/facebook/contacts/server/FetchAllContactsParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/contacts/server/g;

    invoke-direct {v0}, Lcom/facebook/contacts/server/g;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/FetchAllContactsParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;J)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput p1, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->a:I

    .line 25
    iput-object p2, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->b:Ljava/lang/String;

    .line 26
    iput-wide p3, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->c:J

    .line 27
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->a:I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->b:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->c:J

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/g;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/FetchAllContactsParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static a(ILjava/lang/String;)Lcom/facebook/contacts/server/FetchAllContactsParams;
    .locals 3

    .prologue
    .line 38
    new-instance v0, Lcom/facebook/contacts/server/FetchAllContactsParams;

    const-wide/16 v1, -0x1

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/facebook/contacts/server/FetchAllContactsParams;-><init>(ILjava/lang/String;J)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 70
    iget v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 72
    iget-wide v0, p0, Lcom/facebook/contacts/server/FetchAllContactsParams;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 73
    return-void
.end method
