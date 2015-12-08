.class final Lb/a/aa;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/x;

    check-cast p1, Lb/a/gt;

    iget-object v0, p2, Lb/a/x;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    iget-object v0, p2, Lb/a/x;->e:Lb/a/eg;

    invoke-virtual {v0}, Lb/a/eg;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-object v0, p2, Lb/a/x;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    iget-object v0, p2, Lb/a/x;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/x;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    invoke-virtual {p2}, Lb/a/x;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    invoke-virtual {p2}, Lb/a/x;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_2
    invoke-virtual {p2}, Lb/a/x;->k()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_3
    invoke-virtual {p2}, Lb/a/x;->m()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_4
    invoke-virtual {p2}, Lb/a/x;->o()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_5
    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/x;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p2, Lb/a/x;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {p2}, Lb/a/x;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, p2, Lb/a/x;->c:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    :cond_7
    invoke-virtual {p2}, Lb/a/x;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p2, Lb/a/x;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_8
    invoke-virtual {p2}, Lb/a/x;->k()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p2, Lb/a/x;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_9
    invoke-virtual {p2}, Lb/a/x;->m()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p2, Lb/a/x;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {p2}, Lb/a/x;->o()Z

    move-result v0

    if-eqz v0, :cond_b

    iget v0, p2, Lb/a/x;->j:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    :cond_b
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/x;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->a()V

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    invoke-static {v0}, Lb/a/eg;->a(I)Lb/a/eg;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->e:Lb/a/eg;

    invoke-static {}, Lb/a/x;->h()V

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->f:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->i()V

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/x;->g:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->j()V

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/x;->b:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->c()V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v1

    iput v1, p2, Lb/a/x;->c:I

    invoke-virtual {p2}, Lb/a/x;->e()V

    :cond_1
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/x;->d:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->g()V

    :cond_2
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/x;->h:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->l()V

    :cond_3
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lb/a/x;->i:Ljava/lang/String;

    invoke-static {}, Lb/a/x;->n()V

    :cond_4
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    iput v0, p2, Lb/a/x;->j:I

    invoke-virtual {p2}, Lb/a/x;->p()V

    :cond_5
    return-void
.end method
