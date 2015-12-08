.class final Lb/a/am;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/aj;

    check-cast p1, Lb/a/gt;

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {p2}, Lb/a/aj;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(Ljava/util/BitSet;I)V

    invoke-virtual {p2}, Lb/a/aj;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p2, Lb/a/aj;->a:Lb/a/ct;

    invoke-virtual {v0, p1}, Lb/a/ct;->b(Lb/a/gn;)V

    :cond_1
    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/aj;

    check-cast p1, Lb/a/gt;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb/a/gt;->b(I)Ljava/util/BitSet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lb/a/ct;

    invoke-direct {v0}, Lb/a/ct;-><init>()V

    iput-object v0, p2, Lb/a/aj;->a:Lb/a/ct;

    iget-object v0, p2, Lb/a/aj;->a:Lb/a/ct;

    invoke-virtual {v0, p1}, Lb/a/ct;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/aj;->b()V

    :cond_0
    return-void
.end method
