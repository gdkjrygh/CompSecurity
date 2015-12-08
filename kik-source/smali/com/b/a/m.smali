.class public final Lcom/b/a/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic e:Z


# instance fields
.field final a:[B

.field final b:I

.field c:I

.field d:Lcom/b/a/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/b/a/m;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/b/a/m;->e:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(I)V
    .locals 2

    .prologue
    .line 146
    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/b/a/m;-><init>([BI)V

    .line 147
    return-void
.end method

.method constructor <init>(ILcom/b/a/m;)V
    .locals 2

    .prologue
    .line 155
    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p2}, Lcom/b/a/m;-><init>([BILcom/b/a/m;)V

    .line 156
    return-void
.end method

.method constructor <init>(Lcom/b/a/m;Lcom/b/a/m;)V
    .locals 1

    .prologue
    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iget-object v0, p1, Lcom/b/a/m;->a:[B

    iput-object v0, p0, Lcom/b/a/m;->a:[B

    .line 196
    iget v0, p1, Lcom/b/a/m;->c:I

    iput v0, p0, Lcom/b/a/m;->b:I

    iput v0, p0, Lcom/b/a/m;->c:I

    .line 197
    iput-object p0, p2, Lcom/b/a/m;->d:Lcom/b/a/m;

    .line 198
    return-void
.end method

.method private constructor <init>([BI)V
    .locals 1

    .prologue
    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    iput-object p1, p0, Lcom/b/a/m;->a:[B

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lcom/b/a/m;->b:I

    .line 170
    iput p2, p0, Lcom/b/a/m;->c:I

    .line 171
    return-void
.end method

.method constructor <init>([BILcom/b/a/m;)V
    .locals 0

    .prologue
    .line 185
    invoke-direct {p0, p1, p2}, Lcom/b/a/m;-><init>([BI)V

    .line 186
    iput-object p0, p3, Lcom/b/a/m;->d:Lcom/b/a/m;

    .line 187
    return-void
.end method

.method constructor <init>([BLcom/b/a/m;)V
    .locals 1

    .prologue
    .line 179
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/b/a/m;-><init>([BI)V

    .line 180
    iput-object p0, p2, Lcom/b/a/m;->d:Lcom/b/a/m;

    .line 181
    return-void
.end method

.method public static a(Ljava/io/DataOutput;Lcom/b/a/m;)I
    .locals 4

    .prologue
    .line 119
    const/4 v0, 0x0

    .line 122
    :cond_0
    iget v1, p1, Lcom/b/a/m;->c:I

    iget v2, p1, Lcom/b/a/m;->b:I

    sub-int/2addr v1, v2

    if-lez v1, :cond_1

    .line 124
    iget-object v2, p1, Lcom/b/a/m;->a:[B

    iget v3, p1, Lcom/b/a/m;->b:I

    invoke-interface {p0, v2, v3, v1}, Ljava/io/DataOutput;->write([BII)V

    .line 125
    add-int/2addr v0, v1

    .line 128
    :cond_1
    iget-object p1, p1, Lcom/b/a/m;->d:Lcom/b/a/m;

    if-nez p1, :cond_0

    .line 130
    return v0
.end method

.method public static a()Lcom/b/a/m;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Lcom/b/a/m;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Lcom/b/a/m;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/b/a/m;
    .locals 1

    .prologue
    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/b/a/m;->d:Lcom/b/a/m;

    .line 207
    iget v0, p0, Lcom/b/a/m;->b:I

    iput v0, p0, Lcom/b/a/m;->c:I

    .line 208
    return-object p0
.end method
