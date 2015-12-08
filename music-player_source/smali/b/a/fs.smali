.class public final Lb/a/fs;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/io/ByteArrayOutputStream;

.field private final b:Lb/a/gy;

.field private c:Lb/a/gn;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lb/a/gj;

    invoke-direct {v0}, Lb/a/gj;-><init>()V

    invoke-direct {p0, v0}, Lb/a/fs;-><init>(Lb/a/gp;)V

    return-void
.end method

.method private constructor <init>(Lb/a/gp;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lb/a/fs;->a:Ljava/io/ByteArrayOutputStream;

    new-instance v0, Lb/a/gy;

    iget-object v1, p0, Lb/a/fs;->a:Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Lb/a/gy;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Lb/a/fs;->b:Lb/a/gy;

    iget-object v0, p0, Lb/a/fs;->b:Lb/a/gy;

    invoke-interface {p1, v0}, Lb/a/gp;->a(Lb/a/ha;)Lb/a/gn;

    move-result-object v0

    iput-object v0, p0, Lb/a/fs;->c:Lb/a/gn;

    return-void
.end method


# virtual methods
.method public final a(Lb/a/fm;)[B
    .locals 1

    iget-object v0, p0, Lb/a/fs;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v0, p0, Lb/a/fs;->c:Lb/a/gn;

    invoke-interface {p1, v0}, Lb/a/fm;->b(Lb/a/gn;)V

    iget-object v0, p0, Lb/a/fs;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method
