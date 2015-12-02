.class public Lcom/facebook/orca/server/FetchStickerPacksResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchStickerPacksResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/FetchStickerPacksResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/a/es;
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
    .line 62
    new-instance v0, Lcom/facebook/orca/server/w;

    invoke-direct {v0}, Lcom/facebook/orca/server/w;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchStickerPacksResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 47
    const-class v0, Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->a:Lcom/google/common/a/es;

    .line 48
    const-class v0, Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->b:Lcom/google/common/a/es;

    .line 49
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/w;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/c/b;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 31
    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;Ljava/util/List;J)V

    .line 32
    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/c/b;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0, p1, p4, p5}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 40
    invoke-static {p2}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->a:Lcom/google/common/a/es;

    .line 41
    if-eqz p3, :cond_0

    :goto_0
    invoke-static {p3}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->b:Lcom/google/common/a/es;

    .line 43
    return-void

    .line 41
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;"
        }
    .end annotation

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->a:Lcom/google/common/a/es;

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
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
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->b:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 82
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->a:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/server/FetchStickerPacksResult;->b:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 85
    return-void
.end method
