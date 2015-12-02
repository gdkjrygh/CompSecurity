.class public Lcom/facebook/orca/server/FetchMoreMessagesParams;
.super Ljava/lang/Object;
.source "FetchMoreMessagesParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/FetchMoreMessagesParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/server/ThreadCriteria;

.field private final b:J

.field private final c:J

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/orca/server/o;

    invoke-direct {v0}, Lcom/facebook/orca/server/o;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-class v0, Lcom/facebook/orca/server/ThreadCriteria;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ThreadCriteria;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b:J

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c:J

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d:I

    .line 34
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/o;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/server/ThreadCriteria;JJI)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    .line 24
    iput-wide p2, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b:J

    .line 25
    iput-wide p4, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c:J

    .line 26
    iput p6, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d:I

    .line 27
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/server/ThreadCriteria;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    return-object v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 41
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 45
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c:J

    return-wide v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d:I

    return v0
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
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 71
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 72
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 73
    iget v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    return-void
.end method
