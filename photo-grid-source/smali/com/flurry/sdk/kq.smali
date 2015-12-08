.class public Lcom/flurry/sdk/kq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field a:Ljava/lang/String;

.field private c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/flurry/sdk/kq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/kq;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object v0, p0, Lcom/flurry/sdk/kq;->a:Ljava/lang/String;

    .line 92
    iput-object v0, p0, Lcom/flurry/sdk/kq;->c:[B

    .line 94
    return-void
.end method

.method synthetic constructor <init>(Lcom/flurry/sdk/kq$1;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/flurry/sdk/kq;-><init>()V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object v0, p0, Lcom/flurry/sdk/kq;->a:Ljava/lang/String;

    .line 92
    iput-object v0, p0, Lcom/flurry/sdk/kq;->c:[B

    .line 97
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/flurry/sdk/kq;->a:Ljava/lang/String;

    .line 98
    iput-object p1, p0, Lcom/flurry/sdk/kq;->c:[B

    .line 99
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".yflurrydatasenderblock."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/flurry/sdk/kq;)[B
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/flurry/sdk/kq;->c:[B

    return-object v0
.end method

.method static synthetic a(Lcom/flurry/sdk/kq;[B)[B
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/flurry/sdk/kq;->c:[B

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/flurry/sdk/kq;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()[B
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/flurry/sdk/kq;->c:[B

    return-object v0
.end method
