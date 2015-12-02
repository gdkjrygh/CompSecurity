.class public Lcom/facebook/orca/threads/FolderCounts;
.super Ljava/lang/Object;
.source "FolderCounts.java"

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
            "Lcom/facebook/orca/threads/FolderCounts;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:J

.field private final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/orca/threads/d;

    invoke-direct {v0}, Lcom/facebook/orca/threads/d;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/FolderCounts;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIJJ)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lcom/facebook/orca/threads/FolderCounts;->a:I

    .line 24
    iput p2, p0, Lcom/facebook/orca/threads/FolderCounts;->b:I

    .line 25
    iput-wide p3, p0, Lcom/facebook/orca/threads/FolderCounts;->c:J

    .line 26
    iput-wide p5, p0, Lcom/facebook/orca/threads/FolderCounts;->d:J

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

    iput v0, p0, Lcom/facebook/orca/threads/FolderCounts;->a:I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threads/FolderCounts;->b:I

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/FolderCounts;->c:J

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/FolderCounts;->d:J

    .line 34
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/d;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/orca/threads/FolderCounts;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/facebook/orca/threads/FolderCounts;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/facebook/orca/threads/FolderCounts;->b:I

    return v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 45
    iget-wide v0, p0, Lcom/facebook/orca/threads/FolderCounts;->c:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 49
    iget-wide v0, p0, Lcom/facebook/orca/threads/FolderCounts;->d:J

    return-wide v0
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
    iget v0, p0, Lcom/facebook/orca/threads/FolderCounts;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    iget v0, p0, Lcom/facebook/orca/threads/FolderCounts;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    iget-wide v0, p0, Lcom/facebook/orca/threads/FolderCounts;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 73
    iget-wide v0, p0, Lcom/facebook/orca/threads/FolderCounts;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 74
    return-void
.end method
