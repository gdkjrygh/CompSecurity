.class public Lcom/facebook/common/n/a;
.super Ljava/lang/Object;
.source "FileSizeUtil.java"


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/facebook/common/n/a;->a:Landroid/content/res/Resources;

    .line 17
    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v1, 0x800

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 20
    if-ge p1, v1, :cond_0

    .line 21
    iget-object v0, p0, Lcom/facebook/common/n/a;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->byte_size_bytes:I

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 29
    :goto_0
    return-object v0

    .line 23
    :cond_0
    div-int/lit16 v0, p1, 0x400

    .line 24
    if-ge v0, v1, :cond_1

    .line 25
    iget-object v1, p0, Lcom/facebook/common/n/a;->a:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->byte_size_kb:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 28
    :cond_1
    div-int/lit16 v0, v0, 0x400

    .line 29
    iget-object v1, p0, Lcom/facebook/common/n/a;->a:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->byte_size_mb:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
