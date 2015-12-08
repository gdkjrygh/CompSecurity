.class final La/a/a/a/a/b/d;
.super La/a/a/a/a/b/k;
.source "SourceFile"


# instance fields
.field final synthetic a:La/a/a/a/a/b/b;

.field final synthetic b:La/a/a/a/a/b/c;


# direct methods
.method constructor <init>(La/a/a/a/a/b/c;La/a/a/a/a/b/b;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, La/a/a/a/a/b/d;->b:La/a/a/a/a/b/c;

    iput-object p2, p0, La/a/a/a/a/b/d;->a:La/a/a/a/a/b/b;

    invoke-direct {p0}, La/a/a/a/a/b/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, La/a/a/a/a/b/d;->b:La/a/a/a/a/b/c;

    invoke-static {v0}, La/a/a/a/a/b/c;->a(La/a/a/a/a/b/c;)La/a/a/a/a/b/b;

    move-result-object v0

    .line 71
    iget-object v1, p0, La/a/a/a/a/b/d;->a:La/a/a/a/a/b/b;

    invoke-virtual {v1, v0}, La/a/a/a/a/b/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 72
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 74
    iget-object v1, p0, La/a/a/a/a/b/d;->b:La/a/a/a/a/b/c;

    invoke-static {v1, v0}, La/a/a/a/a/b/c;->a(La/a/a/a/a/b/c;La/a/a/a/a/b/b;)V

    .line 76
    :cond_0
    return-void
.end method
