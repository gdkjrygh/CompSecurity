.class public final Lcom/roidapp/baselib/b/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/b/b;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:[Ljava/io/InputStream;


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/b/b;Ljava/lang/String;J[Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 747
    iput-object p1, p0, Lcom/roidapp/baselib/b/g;->a:Lcom/roidapp/baselib/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 748
    iput-object p2, p0, Lcom/roidapp/baselib/b/g;->b:Ljava/lang/String;

    .line 749
    iput-wide p3, p0, Lcom/roidapp/baselib/b/g;->c:J

    .line 750
    iput-object p5, p0, Lcom/roidapp/baselib/b/g;->d:[Ljava/io/InputStream;

    .line 751
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/b/b;Ljava/lang/String;J[Ljava/io/InputStream;B)V
    .locals 1

    .prologue
    .line 742
    invoke-direct/range {p0 .. p5}, Lcom/roidapp/baselib/b/g;-><init>(Lcom/roidapp/baselib/b/b;Ljava/lang/String;J[Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 766
    iget-object v0, p0, Lcom/roidapp/baselib/b/g;->d:[Ljava/io/InputStream;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final close()V
    .locals 4

    .prologue
    .line 777
    iget-object v1, p0, Lcom/roidapp/baselib/b/g;->d:[Ljava/io/InputStream;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 778
    invoke-static {v3}, Lcom/roidapp/baselib/b/b;->a(Ljava/io/Closeable;)V

    .line 777
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 780
    :cond_0
    return-void
.end method
