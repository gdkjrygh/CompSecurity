.class public abstract Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;


# instance fields
.field protected a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field private b:J

.field private c:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-wide p1, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->b:J

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->b:J

    .line 23
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->c:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 25
    const-class v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    array-length v1, v0

    const-class v2, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 28
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->c:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    return-object v0
.end method

.method public final a(I)Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->c:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 40
    return-void
.end method

.method public final a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 90
    return-void
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 49
    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->c:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v0, :cond_1

    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    array-length v2, v0

    move v0, v1

    :goto_0
    if-ge v0, v2, :cond_1

    .line 52
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    aget-object v3, v3, v0

    .line 53
    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->c:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v4

    if-ne v3, v4, :cond_0

    .line 59
    :goto_1
    return v0

    .line 51
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 69
    iget-wide v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->b:J

    return-wide v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 74
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 77
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    array-length v0, v0

    .line 85
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 32
    iget-wide v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 33
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->c:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 34
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 35
    return-void
.end method
