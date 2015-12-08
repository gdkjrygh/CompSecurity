.class public Lcom/b/a/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic g:Z


# instance fields
.field public final a:Lcom/b/a/m;

.field protected b:Lcom/b/a/m;

.field protected c:I

.field public final d:I

.field public final e:Ljava/io/OutputStream;

.field public final f:Lcom/b/a/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/b/a/z;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/b/a/z;->g:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/b/a/m;)V
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/b/a/z;-><init>(Lcom/b/a/m;B)V

    .line 63
    return-void
.end method

.method private constructor <init>(Lcom/b/a/m;B)V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lcom/b/a/z;->c:I

    .line 67
    iput-object p1, p0, Lcom/b/a/z;->b:Lcom/b/a/m;

    .line 68
    iput-object p1, p0, Lcom/b/a/z;->a:Lcom/b/a/m;

    .line 69
    const/16 v0, 0x200

    iput v0, p0, Lcom/b/a/z;->d:I

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/b/a/z;->e:Ljava/io/OutputStream;

    .line 71
    sget-object v0, Lcom/b/a/aa;->a:Lcom/b/a/aa;

    iput-object v0, p0, Lcom/b/a/z;->f:Lcom/b/a/aa;

    .line 72
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 6

    .prologue
    .line 109
    iget-object v1, p0, Lcom/b/a/z;->a:Lcom/b/a/m;

    .line 110
    const/4 v0, 0x0

    .line 111
    iget v2, p0, Lcom/b/a/z;->c:I

    new-array v2, v2, [B

    .line 114
    :cond_0
    iget v3, v1, Lcom/b/a/m;->c:I

    iget v4, v1, Lcom/b/a/m;->b:I

    sub-int/2addr v3, v4

    if-lez v3, :cond_1

    .line 116
    iget-object v4, v1, Lcom/b/a/m;->a:[B

    iget v5, v1, Lcom/b/a/m;->b:I

    invoke-static {v4, v5, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 117
    add-int/2addr v0, v3

    .line 120
    :cond_1
    iget-object v1, v1, Lcom/b/a/m;->d:Lcom/b/a/m;

    if-nez v1, :cond_0

    .line 122
    return-object v2
.end method
