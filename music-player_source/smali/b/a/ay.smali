.class final Lb/a/ay;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/ay;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/av;

    check-cast p1, Lb/a/gt;

    iget-wide v0, p2, Lb/a/av;->a:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    iget-object v0, p2, Lb/a/av;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/av;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/av;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p2, Lb/a/av;->c:Lb/a/bb;

    invoke-virtual {v0}, Lb/a/bb;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    :cond_1
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/av;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v0

    iput-wide v0, p2, Lb/a/av;->a:J

    invoke-virtual {p2}, Lb/a/av;->b()V

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/av;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/av;->c()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    invoke-static {v0}, Lb/a/bb;->a(I)Lb/a/bb;

    move-result-object v0

    iput-object v0, p2, Lb/a/av;->c:Lb/a/bb;

    invoke-static {}, Lb/a/av;->e()V

    :cond_0
    return-void
.end method
