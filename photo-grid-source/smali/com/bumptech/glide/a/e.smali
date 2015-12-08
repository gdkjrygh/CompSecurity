.class public final Lcom/bumptech/glide/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/bumptech/glide/a/a;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:[J

.field private final e:[Ljava/io/File;


# direct methods
.method private constructor <init>(Lcom/bumptech/glide/a/a;Ljava/lang/String;J[Ljava/io/File;[J)V
    .locals 1

    .prologue
    .line 672
    iput-object p1, p0, Lcom/bumptech/glide/a/e;->a:Lcom/bumptech/glide/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 673
    iput-object p2, p0, Lcom/bumptech/glide/a/e;->b:Ljava/lang/String;

    .line 674
    iput-wide p3, p0, Lcom/bumptech/glide/a/e;->c:J

    .line 675
    iput-object p5, p0, Lcom/bumptech/glide/a/e;->e:[Ljava/io/File;

    .line 676
    iput-object p6, p0, Lcom/bumptech/glide/a/e;->d:[J

    .line 677
    return-void
.end method

.method synthetic constructor <init>(Lcom/bumptech/glide/a/a;Ljava/lang/String;J[Ljava/io/File;[JB)V
    .locals 1

    .prologue
    .line 666
    invoke-direct/range {p0 .. p6}, Lcom/bumptech/glide/a/e;-><init>(Lcom/bumptech/glide/a/a;Ljava/lang/String;J[Ljava/io/File;[J)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 2

    .prologue
    .line 689
    iget-object v0, p0, Lcom/bumptech/glide/a/e;->e:[Ljava/io/File;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method
