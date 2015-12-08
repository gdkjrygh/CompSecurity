.class public Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    new-instance v0, Lcom/roidapp/imagelib/filter/filterinfo/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/filterinfo/b;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->a:I

    .line 21
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;I)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput p4, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->d:I

    .line 25
    iput p1, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->a:I

    .line 26
    iput p2, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->b:I

    .line 27
    iput-object p3, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->c:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->a:I

    return v0
.end method

.method public final a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 78
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->d:I

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
    .locals 1

    .prologue
    .line 70
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    iget v0, p0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    return-void
.end method
