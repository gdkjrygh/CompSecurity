.class public final Lb/a/fp;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lb/a/gn;

.field private final b:Lb/a/gz;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lb/a/gj;

    invoke-direct {v0}, Lb/a/gj;-><init>()V

    invoke-direct {p0, v0}, Lb/a/fp;-><init>(Lb/a/gp;)V

    return-void
.end method

.method public constructor <init>(Lb/a/gp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb/a/gz;

    invoke-direct {v0}, Lb/a/gz;-><init>()V

    iput-object v0, p0, Lb/a/fp;->b:Lb/a/gz;

    iget-object v0, p0, Lb/a/fp;->b:Lb/a/gz;

    invoke-interface {p1, v0}, Lb/a/gp;->a(Lb/a/ha;)Lb/a/gn;

    move-result-object v0

    iput-object v0, p0, Lb/a/fp;->a:Lb/a/gn;

    return-void
.end method


# virtual methods
.method public final a(Lb/a/fm;[B)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lb/a/fp;->b:Lb/a/gz;

    array-length v1, p2

    invoke-virtual {v0, p2, v1}, Lb/a/gz;->a([BI)V

    iget-object v0, p0, Lb/a/fp;->a:Lb/a/gn;

    invoke-interface {p1, v0}, Lb/a/fm;->a(Lb/a/gn;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lb/a/fp;->b:Lb/a/gz;

    invoke-virtual {v0}, Lb/a/gz;->a()V

    iget-object v0, p0, Lb/a/fp;->a:Lb/a/gn;

    invoke-virtual {v0}, Lb/a/gn;->r()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lb/a/fp;->b:Lb/a/gz;

    invoke-virtual {v1}, Lb/a/gz;->a()V

    iget-object v1, p0, Lb/a/fp;->a:Lb/a/gn;

    invoke-virtual {v1}, Lb/a/gn;->r()V

    throw v0
.end method
