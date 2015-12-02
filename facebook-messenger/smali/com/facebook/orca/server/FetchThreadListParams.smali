.class public Lcom/facebook/orca/server/FetchThreadListParams;
.super Ljava/lang/Object;
.source "FetchThreadListParams.java"

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
            "Lcom/facebook/orca/server/FetchThreadListParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/fbservice/service/s;

.field private final b:Lcom/facebook/orca/threads/FolderName;

.field private final c:J

.field private final d:I

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 91
    new-instance v0, Lcom/facebook/orca/server/x;

    invoke-direct {v0}, Lcom/facebook/orca/server/x;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchThreadListParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/s;->valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->a:Lcom/facebook/fbservice/service/s;

    .line 39
    const-class v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->b:Lcom/facebook/orca/threads/FolderName;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->c:J

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->d:I

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->e:Z

    .line 43
    return-void

    .line 42
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/x;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchThreadListParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/server/y;)V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p1}, Lcom/facebook/orca/server/y;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->a:Lcom/facebook/fbservice/service/s;

    .line 27
    invoke-virtual {p1}, Lcom/facebook/orca/server/y;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->b:Lcom/facebook/orca/threads/FolderName;

    .line 28
    invoke-virtual {p1}, Lcom/facebook/orca/server/y;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->c:J

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/server/y;->d()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->d:I

    .line 30
    invoke-virtual {p1}, Lcom/facebook/orca/server/y;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->e:Z

    .line 31
    return-void
.end method

.method public static newBuilder()Lcom/facebook/orca/server/y;
    .locals 1

    .prologue
    .line 34
    new-instance v0, Lcom/facebook/orca/server/y;

    invoke-direct {v0}, Lcom/facebook/orca/server/y;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->a:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->b:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 70
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->c:J

    return-wide v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 79
    iget v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->d:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 88
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->e:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->a:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 111
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 112
    iget v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 113
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListParams;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 114
    return-void

    .line 113
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
