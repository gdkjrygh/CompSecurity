.class public Landroid_src/mms/transaction/m;
.super Lorg/apache/http/entity/ByteArrayEntity;
.source "ProgressCallbackEntity.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:[B

.field private final c:J


# direct methods
.method public constructor <init>(Landroid/content/Context;J[B)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p4}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 43
    iput-object p1, p0, Landroid_src/mms/transaction/m;->a:Landroid/content/Context;

    .line 44
    iput-object p4, p0, Landroid_src/mms/transaction/m;->b:[B

    .line 45
    iput-wide p2, p0, Landroid_src/mms/transaction/m;->c:J

    .line 46
    return-void
.end method

.method private a(I)V
    .locals 4

    .prologue
    .line 82
    iget-wide v0, p0, Landroid_src/mms/transaction/m;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 83
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.mms.PROGRESS_STATUS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 84
    const-string v1, "progress"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 85
    const-string v1, "token"

    iget-wide v2, p0, Landroid_src/mms/transaction/m;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 86
    iget-object v1, p0, Landroid_src/mms/transaction/m;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 88
    :cond_0
    return-void
.end method


# virtual methods
.method public writeTo(Ljava/io/OutputStream;)V
    .locals 5

    .prologue
    const/16 v1, 0x1000

    .line 50
    if-nez p1, :cond_0

    .line 51
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Output stream may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_0
    const/4 v0, -0x1

    :try_start_0
    invoke-direct {p0, v0}, Landroid_src/mms/transaction/m;->a(I)V

    .line 58
    const/4 v0, 0x0

    iget-object v2, p0, Landroid_src/mms/transaction/m;->b:[B

    array-length v3, v2

    move v2, v0

    .line 59
    :goto_0
    if-ge v2, v3, :cond_2

    .line 60
    sub-int v0, v3, v2

    .line 61
    if-le v0, v1, :cond_1

    move v0, v1

    .line 64
    :cond_1
    iget-object v4, p0, Landroid_src/mms/transaction/m;->b:[B

    invoke-virtual {p1, v4, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 65
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 67
    add-int/2addr v0, v2

    .line 69
    mul-int/lit8 v2, v0, 0x64

    div-int/2addr v2, v3

    invoke-direct {p0, v2}, Landroid_src/mms/transaction/m;->a(I)V

    move v2, v0

    .line 70
    goto :goto_0

    .line 72
    :cond_2
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Landroid_src/mms/transaction/m;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    const/4 v1, -0x2

    invoke-direct {p0, v1}, Landroid_src/mms/transaction/m;->a(I)V

    throw v0
.end method
