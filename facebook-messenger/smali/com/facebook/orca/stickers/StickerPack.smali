.class public Lcom/facebook/orca/stickers/StickerPack;
.super Ljava/lang/Object;
.source "StickerPack.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Landroid/net/Uri;

.field private final e:Landroid/net/Uri;

.field private final f:Landroid/net/Uri;

.field private final g:I

.field private final h:Z

.field private final i:Z

.field private final j:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 123
    new-instance v0, Lcom/facebook/orca/stickers/j;

    invoke-direct {v0}, Lcom/facebook/orca/stickers/j;-><init>()V

    sput-object v0, Lcom/facebook/orca/stickers/StickerPack;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->a:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->b:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->c:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->d:Landroid/net/Uri;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->e:Landroid/net/Uri;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->f:Landroid/net/Uri;

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/stickers/StickerPack;->g:I

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/stickers/StickerPack;->h:Z

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/facebook/orca/stickers/StickerPack;->i:Z

    .line 62
    const-class v0, Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->j:Lcom/google/common/a/es;

    .line 63
    return-void

    :cond_0
    move v0, v2

    .line 60
    goto :goto_0

    :cond_1
    move v1, v2

    .line 61
    goto :goto_1
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/stickers/j;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/StickerPack;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;IZZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Landroid/net/Uri;",
            "Landroid/net/Uri;",
            "IZZ",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/orca/stickers/StickerPack;->a:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/facebook/orca/stickers/StickerPack;->b:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lcom/facebook/orca/stickers/StickerPack;->c:Ljava/lang/String;

    .line 43
    iput-object p4, p0, Lcom/facebook/orca/stickers/StickerPack;->d:Landroid/net/Uri;

    .line 44
    iput-object p5, p0, Lcom/facebook/orca/stickers/StickerPack;->e:Landroid/net/Uri;

    .line 45
    iput-object p6, p0, Lcom/facebook/orca/stickers/StickerPack;->f:Landroid/net/Uri;

    .line 46
    iput p7, p0, Lcom/facebook/orca/stickers/StickerPack;->g:I

    .line 47
    iput-boolean p8, p0, Lcom/facebook/orca/stickers/StickerPack;->h:Z

    .line 48
    iput-boolean p9, p0, Lcom/facebook/orca/stickers/StickerPack;->i:Z

    .line 49
    invoke-static {p10}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->j:Lcom/google/common/a/es;

    .line 50
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->d:Landroid/net/Uri;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 138
    const/4 v0, 0x0

    return v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->e:Landroid/net/Uri;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 162
    if-nez p1, :cond_1

    .line 170
    :cond_0
    :goto_0
    return v0

    .line 165
    :cond_1
    instance-of v1, p1, Lcom/facebook/orca/stickers/StickerPack;

    if-eqz v1, :cond_0

    .line 169
    check-cast p1, Lcom/facebook/orca/stickers/StickerPack;

    .line 170
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->f:Landroid/net/Uri;

    return-object v0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 102
    iget v0, p0, Lcom/facebook/orca/stickers/StickerPack;->g:I

    return v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 109
    iget-boolean v0, p0, Lcom/facebook/orca/stickers/StickerPack;->h:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 116
    iget-boolean v0, p0, Lcom/facebook/orca/stickers/StickerPack;->i:Z

    return v0
.end method

.method public j()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->j:Lcom/google/common/a/es;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->d:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->e:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->f:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 149
    iget v0, p0, Lcom/facebook/orca/stickers/StickerPack;->g:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 150
    iget-boolean v0, p0, Lcom/facebook/orca/stickers/StickerPack;->h:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    iget-boolean v0, p0, Lcom/facebook/orca/stickers/StickerPack;->i:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerPack;->j:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 153
    return-void

    :cond_0
    move v0, v2

    .line 150
    goto :goto_0

    :cond_1
    move v1, v2

    .line 151
    goto :goto_1
.end method
