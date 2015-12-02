.class public Lcom/facebook/orca/server/FetchGroupThreadsParams;
.super Ljava/lang/Object;
.source "FetchGroupThreadsParams.java"

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
            "Lcom/facebook/orca/server/FetchGroupThreadsParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/server/j;

.field private final b:I

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 73
    new-instance v0, Lcom/facebook/orca/server/i;

    invoke-direct {v0}, Lcom/facebook/orca/server/i;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/server/j;->valueOf(Ljava/lang/String;)Lcom/facebook/orca/server/j;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a:Lcom/facebook/orca/server/j;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->b:I

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->c:Ljava/lang/String;

    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->d()V

    .line 44
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/i;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchGroupThreadsParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/server/k;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/server/k;->a()Lcom/facebook/orca/server/j;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a:Lcom/facebook/orca/server/j;

    .line 30
    invoke-virtual {p1}, Lcom/facebook/orca/server/k;->b()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->b:I

    .line 31
    invoke-virtual {p1}, Lcom/facebook/orca/server/k;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->c:Ljava/lang/String;

    .line 32
    invoke-direct {p0}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->d()V

    .line 33
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a:Lcom/facebook/orca/server/j;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a:Lcom/facebook/orca/server/j;

    sget-object v1, Lcom/facebook/orca/server/j;->TOP_RANKED:Lcom/facebook/orca/server/j;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 100
    return-void

    .line 98
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static newBuilder()Lcom/facebook/orca/server/k;
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lcom/facebook/orca/server/k;

    invoke-direct {v0}, Lcom/facebook/orca/server/k;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/server/j;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a:Lcom/facebook/orca/server/j;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->b:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->c:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->a:Lcom/facebook/orca/server/j;

    invoke-virtual {v0}, Lcom/facebook/orca/server/j;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 92
    iget v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsParams;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 94
    return-void
.end method
