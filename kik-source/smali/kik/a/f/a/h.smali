.class final Lkik/a/f/a/h;
.super Lkik/a/f/a/g;
.source "SourceFile"


# static fields
.field private static f:[Ljava/lang/String;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 28
    const/16 v0, 0x14

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "cabeiri"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "armoire"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "enghien"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "obeliskoid"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "cherubically"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "enormity"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "laundrywoman"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "seward"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "backcloth"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "nonentreating"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "macron"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "asteroidean"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "nondissolving"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "appositely"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "transonic"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "kozuka"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "untranscribed"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "unquietable"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "unconformed"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "organicism"

    aput-object v2, v0, v1

    sput-object v0, Lkik/a/f/a/h;->f:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lkik/a/f/a/g;-><init>(Ljava/lang/String;)V

    .line 26
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 66
    iget-boolean v0, p0, Lkik/a/f/a/h;->d:Z

    if-eqz v0, :cond_0

    .line 67
    new-instance v0, Lkik/a/f/a/a;

    invoke-direct {v0}, Lkik/a/f/a/a;-><init>()V

    throw v0

    .line 69
    :cond_0
    iget v0, p0, Lkik/a/f/a/h;->a:I

    .line 70
    if-ltz v0, :cond_1

    sget-object v1, Lkik/a/f/a/h;->f:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 71
    sget-object v1, Lkik/a/f/a/h;->f:[Ljava/lang/String;

    aget-object v0, v1, v0

    .line 72
    :try_start_0
    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lkik/a/f/a/h;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "UTF-8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/a/h;->e:Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 82
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 78
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 80
    :catch_1
    move-exception v0

    .line 81
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 84
    :cond_1
    new-instance v0, Lkik/a/f/a/f;

    invoke-direct {v0}, Lkik/a/f/a/f;-><init>()V

    throw v0
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 60
    const-string v0, "index"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v1

    iput v0, p0, Lkik/a/f/a/h;->a:I

    iput-object v1, p0, Lkik/a/f/a/h;->b:Ljava/lang/String;

    .line 61
    return-void
.end method
