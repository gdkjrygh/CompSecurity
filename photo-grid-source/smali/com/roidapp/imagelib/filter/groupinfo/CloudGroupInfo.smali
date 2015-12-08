.class public Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;
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
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Z

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/a;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/groupinfo/a;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;-><init>(J)V

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->f:Z

    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;-><init>(Landroid/os/Parcel;)V

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->f:Z

    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Landroid/content/Context;)I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->g:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->f:Z

    return v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 65
    invoke-super {p0, p1, p2}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 66
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 69
    iget v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->g:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    iget v0, p0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    return-void
.end method
