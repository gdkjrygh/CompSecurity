.class public Lcom/roidapp/photogrid/release/StickerInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/roidapp/photogrid/release/StickerInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:I

.field public i:Ljava/lang/String;

.field public j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public k:[Ljava/lang/String;

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:I

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 169
    new-instance v0, Lcom/roidapp/photogrid/release/qy;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/qy;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/StickerInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const v0, 0xffffff

    iput v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const v0, 0xffffff

    iput v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 24
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    .line 107
    iput-object p1, p0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 108
    iput-object p2, p0, Lcom/roidapp/photogrid/release/StickerInfo;->c:Ljava/lang/String;

    .line 109
    iput p4, p0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 110
    iput-object p3, p0, Lcom/roidapp/photogrid/release/StickerInfo;->i:Ljava/lang/String;

    .line 111
    iput p5, p0, Lcom/roidapp/photogrid/release/StickerInfo;->d:I

    .line 112
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 113
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 114
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/StickerInfo;->g:Z

    .line 115
    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 7

    .prologue
    const v4, 0xffffff

    const/4 v1, 0x1

    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput v4, p0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 24
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    .line 43
    const-string v0, "packageName"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 44
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->l:I

    .line 45
    const-string v0, "version"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->h:I

    .line 47
    const-string v0, "backgroundColor"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 49
    :try_start_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :goto_0
    const-string v0, "packageName"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->i:Ljava/lang/String;

    .line 54
    const-string v0, "isNew"

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->g:Z

    .line 55
    const-string v0, "isLocal"

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_2

    :goto_2
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 56
    const-string v0, "logo"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->m:Ljava/lang/String;

    .line 57
    const-string v0, "zip"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->n:Ljava/lang/String;

    .line 58
    const-string v0, "order"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->o:I

    .line 59
    const-string v0, "createTime"

    const-wide/16 v4, -0x1

    invoke-virtual {p1, v0, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->p:J

    .line 61
    const-string v0, "displayName"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 64
    :try_start_1
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move v0, v2

    .line 66
    :goto_3
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 67
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 68
    if-eqz v3, :cond_0

    const-string v4, "lang"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 69
    iget-object v4, p0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    const-string v5, "lang"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "name"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 66
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 51
    :catch_0
    move-exception v0

    iput v4, p0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    goto :goto_0

    :cond_1
    move v0, v2

    .line 54
    goto :goto_1

    :cond_2
    move v1, v2

    .line 55
    goto :goto_2

    .line 74
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 76
    :cond_3
    const-string v0, "elements"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    :try_start_2
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 82
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->k:[Ljava/lang/String;

    .line 83
    :goto_4
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 84
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    iget-object v3, p0, Lcom/roidapp/photogrid/release/StickerInfo;->k:[Ljava/lang/String;

    const-string v4, "name"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v2
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 83
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 91
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 93
    :cond_5
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 208
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 213
    iget-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 215
    iget v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 216
    iget v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 217
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 218
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 219
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->g:Z

    if-eqz v0, :cond_2

    :goto_2
    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 220
    iget v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->j:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 223
    iget-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 225
    iget v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->o:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 226
    iget-wide v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->p:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 229
    return-void

    :cond_0
    move v0, v2

    .line 217
    goto :goto_0

    :cond_1
    move v0, v2

    .line 218
    goto :goto_1

    :cond_2
    move v1, v2

    .line 219
    goto :goto_2
.end method
