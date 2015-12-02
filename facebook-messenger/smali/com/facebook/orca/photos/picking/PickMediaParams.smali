.class public Lcom/facebook/orca/photos/picking/PickMediaParams;
.super Ljava/lang/Object;
.source "PickMediaParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/photos/picking/PickMediaParams;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/orca/photos/picking/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/lang/String;

.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/orca/photos/picking/b;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/orca/photos/picking/b;->CAMERA:Lcom/facebook/orca/photos/picking/b;

    sget-object v1, Lcom/facebook/orca/photos/picking/b;->GALLERY:Lcom/facebook/orca/photos/picking/b;

    sget-object v2, Lcom/facebook/orca/photos/picking/b;->IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/b;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/photos/picking/PickMediaParams;->a:Ljava/util/EnumSet;

    .line 135
    new-instance v0, Lcom/facebook/orca/photos/picking/j;

    invoke-direct {v0}, Lcom/facebook/orca/photos/picking/j;-><init>()V

    sput-object v0, Lcom/facebook/orca/photos/picking/PickMediaParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->b:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->c:Z

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->d:I

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->e:I

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->f:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->g:I

    .line 50
    const-class v0, Lcom/facebook/orca/photos/picking/b;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->h:Ljava/util/EnumSet;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 52
    :goto_1
    if-ge v1, v0, :cond_1

    .line 53
    iget-object v2, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->h:Ljava/util/EnumSet;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/orca/photos/picking/b;->valueOf(Ljava/lang/String;)Lcom/facebook/orca/photos/picking/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/EnumSet;->add(Ljava/lang/Object;)Z

    .line 52
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    move v0, v1

    .line 44
    goto :goto_0

    .line 55
    :cond_1
    const-class v0, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->i:Ljava/util/List;

    .line 56
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/photos/picking/j;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/picking/PickMediaParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->b:Ljava/lang/String;

    .line 37
    if-eqz p1, :cond_0

    sget-object v0, Lcom/facebook/orca/photos/picking/PickMediaParams;->a:Ljava/util/EnumSet;

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->h:Ljava/util/EnumSet;

    .line 40
    return-void

    .line 37
    :cond_0
    const-class v0, Lcom/facebook/orca/photos/picking/b;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 0

    .prologue
    .line 77
    iput p1, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->d:I

    .line 78
    return-object p0
.end method

.method public a(Lcom/facebook/orca/photos/picking/b;)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->h:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/EnumSet;->add(Ljava/lang/Object;)Z

    .line 118
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->b:Ljava/lang/String;

    .line 60
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;)",
            "Lcom/facebook/orca/photos/picking/PickMediaParams;"
        }
    .end annotation

    .prologue
    .line 131
    iput-object p1, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->i:Ljava/util/List;

    .line 132
    return-object p0
.end method

.method public a(Z)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 0

    .prologue
    .line 68
    iput-boolean p1, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->c:Z

    .line 69
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 0

    .prologue
    .line 86
    iput p1, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->e:I

    .line 87
    return-object p0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 73
    iget-boolean v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->c:Z

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->d:I

    return v0
.end method

.method public c(I)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 0

    .prologue
    .line 95
    iput p1, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->f:I

    .line 96
    return-object p0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->e:I

    return v0
.end method

.method public d(I)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 0

    .prologue
    .line 104
    iput p1, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->g:I

    .line 105
    return-object p0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 148
    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->f:I

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 109
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->g:I

    return v0
.end method

.method public g()Ljava/util/EnumSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/orca/photos/picking/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->h:Ljava/util/EnumSet;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 154
    iget-boolean v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 155
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 157
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 158
    iget v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->g:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->h:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/EnumSet;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->h:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/EnumSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/b;

    .line 162
    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/b;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 154
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaParams;->i:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 165
    return-void
.end method
