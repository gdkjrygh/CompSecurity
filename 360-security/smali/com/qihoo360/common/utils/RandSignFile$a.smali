.class Lcom/qihoo360/common/utils/RandSignFile$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/RandSignFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:S

.field public e:S

.field public f:S

.field public g:[B

.field public h:[B

.field public i:I

.field public j:I

.field public k:[B

.field final synthetic l:Lcom/qihoo360/common/utils/RandSignFile;


# direct methods
.method private constructor <init>(Lcom/qihoo360/common/utils/RandSignFile;)V
    .locals 2

    .prologue
    const/16 v1, 0x20

    .line 190
    iput-object p1, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->g:[B

    .line 206
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->h:[B

    .line 212
    const/16 v0, 0x80

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->k:[B

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo360/common/utils/RandSignFile;Lcom/qihoo360/common/utils/RandSignFile$a;)V
    .locals 0

    .prologue
    .line 190
    invoke-direct {p0, p1}, Lcom/qihoo360/common/utils/RandSignFile$a;-><init>(Lcom/qihoo360/common/utils/RandSignFile;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    .prologue
    const/16 v2, 0x20

    .line 218
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_int(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->a:I

    .line 219
    iget v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->a:I

    invoke-static {}, Lcom/qihoo360/common/utils/RandSignFile;->a()I

    move-result v1

    if-eq v0, v1, :cond_0

    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILETYPE:I

    .line 246
    :goto_0
    return v0

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_int(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->b:I

    .line 221
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_int(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->c:I

    .line 222
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readShort()S

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_short(S)S

    move-result v0

    iput-short v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->d:S

    .line 223
    iget-short v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->d:S

    invoke-static {}, Lcom/qihoo360/common/utils/RandSignFile;->b()I

    move-result v1

    if-eq v0, v1, :cond_1

    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_NOT_SUPPORT:I

    goto :goto_0

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readShort()S

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_short(S)S

    move-result v0

    iput-short v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->e:S

    .line 225
    iget-short v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->e:S

    if-eqz v0, :cond_2

    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_NOT_SUPPORT:I

    goto :goto_0

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readShort()S

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_short(S)S

    move-result v0

    iput-short v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->f:S

    .line 227
    iget-short v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->f:S

    const v1, 0xffff

    if-eq v0, v1, :cond_3

    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_NOT_SUPPORT:I

    goto :goto_0

    .line 228
    :cond_3
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->g:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v0

    .line 229
    if-eq v0, v2, :cond_4

    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILETYPE:I

    goto :goto_0

    .line 230
    :cond_4
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->h:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v0

    .line 231
    if-eq v0, v2, :cond_5

    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILETYPE:I

    goto :goto_0

    .line 232
    :cond_5
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_int(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->i:I

    .line 233
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/RandSignFile;->L2B_int(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->j:I

    .line 234
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->l:Lcom/qihoo360/common/utils/RandSignFile;

    iget-object v0, v0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile$a;->k:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v0

    .line 235
    const/16 v1, 0x80

    if-eq v0, v1, :cond_6

    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILETYPE:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 241
    :catch_0
    move-exception v0

    .line 243
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILEOP:I

    goto/16 :goto_0

    .line 246
    :cond_6
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_OK:I

    goto/16 :goto_0
.end method
