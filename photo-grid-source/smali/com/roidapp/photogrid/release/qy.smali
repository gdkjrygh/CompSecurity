.class final Lcom/roidapp/photogrid/release/qy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/roidapp/photogrid/release/StickerInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2173
    new-instance v3, Lcom/roidapp/photogrid/release/StickerInfo;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/StickerInfo;-><init>()V

    .line 2174
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 2175
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->c:Ljava/lang/String;

    .line 2176
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 2177
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->d:I

    .line 2178
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 2179
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 2180
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    :goto_2
    iput-boolean v1, v3, Lcom/roidapp/photogrid/release/StickerInfo;->g:Z

    .line 2181
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->h:I

    .line 2182
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->i:Ljava/lang/String;

    .line 2183
    const-class v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    .line 2184
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->m:Ljava/lang/String;

    .line 2185
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->n:Ljava/lang/String;

    .line 2186
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->o:I

    .line 2187
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, v3, Lcom/roidapp/photogrid/release/StickerInfo;->p:J

    .line 169
    return-object v3

    :cond_0
    move v0, v2

    .line 2178
    goto :goto_0

    :cond_1
    move v0, v2

    .line 2179
    goto :goto_1

    :cond_2
    move v1, v2

    .line 2180
    goto :goto_2
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 169
    .line 1193
    new-array v0, p1, [Lcom/roidapp/photogrid/release/StickerInfo;

    .line 169
    return-object v0
.end method
