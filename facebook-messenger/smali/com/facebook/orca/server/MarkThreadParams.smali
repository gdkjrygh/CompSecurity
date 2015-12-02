.class public Lcom/facebook/orca/server/MarkThreadParams;
.super Ljava/lang/Object;
.source "MarkThreadParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/MarkThreadParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/orca/server/ai;

.field private final c:Z

.field private final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 64
    new-instance v0, Lcom/facebook/orca/server/ah;

    invoke-direct {v0}, Lcom/facebook/orca/server/ah;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/MarkThreadParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->a:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/server/ai;->valueOf(Ljava/lang/String;)Lcom/facebook/orca/server/ai;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->b:Lcom/facebook/orca/server/ai;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->c:Z

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->d:J

    .line 46
    return-void

    .line 44
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/ah;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/MarkThreadParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/orca/server/ai;ZJ)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/facebook/orca/server/MarkThreadParams;->a:Ljava/lang/String;

    .line 36
    iput-object p2, p0, Lcom/facebook/orca/server/MarkThreadParams;->b:Lcom/facebook/orca/server/ai;

    .line 37
    iput-boolean p3, p0, Lcom/facebook/orca/server/MarkThreadParams;->c:Z

    .line 38
    iput-wide p4, p0, Lcom/facebook/orca/server/MarkThreadParams;->d:J

    .line 39
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/server/ai;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->b:Lcom/facebook/orca/server/ai;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->c:Z

    return v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 61
    iget-wide v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->d:J

    return-wide v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->b:Lcom/facebook/orca/server/ai;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ai;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-boolean v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    iget-wide v0, p0, Lcom/facebook/orca/server/MarkThreadParams;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 86
    return-void

    .line 84
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
