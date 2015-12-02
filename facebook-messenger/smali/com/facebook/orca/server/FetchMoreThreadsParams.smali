.class public Lcom/facebook/orca/server/FetchMoreThreadsParams;
.super Ljava/lang/Object;
.source "FetchMoreThreadsParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/FetchMoreThreadsParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/threads/FolderName;

.field private final b:J

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Lcom/facebook/orca/server/q;

    invoke-direct {v0}, Lcom/facebook/orca/server/q;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-class v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b:J

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c:I

    .line 28
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/q;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/threads/FolderName;JI)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    .line 20
    iput-wide p2, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b:J

    .line 21
    iput p4, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c:I

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 35
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b:J

    return-wide v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 61
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 62
    iget v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    return-void
.end method
