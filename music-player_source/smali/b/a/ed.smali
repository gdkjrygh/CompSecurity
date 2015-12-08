.class final Lb/a/ed;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/ed;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/ea;

    check-cast p1, Lb/a/gt;

    iget v0, p2, Lb/a/ea;->a:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/ea;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    invoke-virtual {p2}, Lb/a/ea;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/ea;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p2, Lb/a/ea;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p2}, Lb/a/ea;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lb/a/ea;->c:Lb/a/cb;

    invoke-virtual {v0, p1}, Lb/a/cb;->b(Lb/a/gn;)V

    :cond_3
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/ea;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    iput v0, p2, Lb/a/ea;->a:I

    invoke-virtual {p2}, Lb/a/ea;->b()V

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/ea;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/ea;->e()V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lb/a/cb;

    invoke-direct {v0}, Lb/a/cb;-><init>()V

    iput-object v0, p2, Lb/a/ea;->c:Lb/a/cb;

    iget-object v0, p2, Lb/a/ea;->c:Lb/a/cb;

    invoke-virtual {v0, p1}, Lb/a/cb;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/ea;->h()V

    :cond_1
    return-void
.end method
