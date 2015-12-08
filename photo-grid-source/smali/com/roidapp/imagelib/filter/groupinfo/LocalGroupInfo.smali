.class public Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;
.super Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field protected e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/c;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/groupinfo/c;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(III[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V
    .locals 2

    .prologue
    .line 22
    int-to-long v0, p5

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;-><init>(J)V

    .line 23
    iput p1, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->b:I

    .line 24
    iput p2, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->d:I

    .line 25
    iput p3, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->c:I

    .line 26
    iput-object p4, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->a:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 27
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;-><init>(Landroid/os/Parcel;)V

    .line 19
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)I
    .locals 2

    .prologue
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    const-string v0, ""

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 76
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->e:Z

    return v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 81
    iget v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 68
    invoke-super {p0, p1, p2}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 69
    iget v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    iget v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    iget v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    return-void
.end method
