.class public Lcom/facebook/orca/server/FetchThreadParams;
.super Ljava/lang/Object;
.source "FetchThreadParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/server/ThreadCriteria;

.field private final b:Lcom/facebook/fbservice/service/s;

.field private final c:Lcom/facebook/fbservice/service/s;

.field private final d:Z

.field private final e:J

.field private final f:I

.field private final g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 74
    new-instance v0, Lcom/facebook/orca/server/ab;

    invoke-direct {v0}, Lcom/facebook/orca/server/ab;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchThreadParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-class v0, Lcom/facebook/orca/server/ThreadCriteria;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ThreadCriteria;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/s;->valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->b:Lcom/facebook/fbservice/service/s;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/s;->valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->c:Lcom/facebook/fbservice/service/s;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->d:Z

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->e:J

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->f:I

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->g:J

    .line 40
    return-void

    .line 36
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/ab;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchThreadParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/server/ac;)V
    .locals 2

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Lcom/facebook/orca/server/ac;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    .line 24
    invoke-virtual {p1}, Lcom/facebook/orca/server/ac;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->b:Lcom/facebook/fbservice/service/s;

    .line 25
    invoke-virtual {p1}, Lcom/facebook/orca/server/ac;->c()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->c:Lcom/facebook/fbservice/service/s;

    .line 26
    invoke-virtual {p1}, Lcom/facebook/orca/server/ac;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->d:Z

    .line 27
    invoke-virtual {p1}, Lcom/facebook/orca/server/ac;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->e:J

    .line 28
    invoke-virtual {p1}, Lcom/facebook/orca/server/ac;->f()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->f:I

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/server/ac;->g()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->g:J

    .line 30
    return-void
.end method

.method public static newBuilder()Lcom/facebook/orca/server/ac;
    .locals 1

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/orca/server/ac;

    invoke-direct {v0}, Lcom/facebook/orca/server/ac;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/server/ThreadCriteria;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    return-object v0
.end method

.method public b()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->b:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public c()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->c:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 59
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->d:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    return v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->e:J

    return-wide v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->f:I

    return v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 71
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->g:J

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->a:Lcom/facebook/orca/server/ThreadCriteria;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->b:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->c:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 95
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->e:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 97
    iget v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchThreadParams;->g:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 99
    return-void

    .line 95
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
