.class final Lb/a/ak;
.super Lb/a/gw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gw;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/ak;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 1

    check-cast p2, Lb/a/aj;

    invoke-virtual {p2}, Lb/a/aj;->c()V

    invoke-static {}, Lb/a/aj;->d()Lb/a/gs;

    invoke-virtual {p1}, Lb/a/gn;->a()V

    iget-object v0, p2, Lb/a/aj;->a:Lb/a/ct;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lb/a/aj;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb/a/aj;->e()Lb/a/gk;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Lb/a/gk;)V

    iget-object v0, p2, Lb/a/aj;->a:Lb/a/ct;

    invoke-virtual {v0, p1}, Lb/a/ct;->b(Lb/a/gn;)V

    :cond_0
    invoke-virtual {p1}, Lb/a/gn;->c()V

    invoke-virtual {p1}, Lb/a/gn;->b()V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 3

    check-cast p2, Lb/a/aj;

    invoke-virtual {p1}, Lb/a/gn;->d()Lb/a/gs;

    :goto_0
    invoke-virtual {p1}, Lb/a/gn;->f()Lb/a/gk;

    move-result-object v0

    iget-byte v1, v0, Lb/a/gk;->b:B

    if-eqz v1, :cond_1

    iget-short v1, v0, Lb/a/gk;->c:S

    packed-switch v1, :pswitch_data_0

    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_0
    iget-byte v1, v0, Lb/a/gk;->b:B

    const/16 v2, 0xc

    if-ne v1, v2, :cond_0

    new-instance v0, Lb/a/ct;

    invoke-direct {v0}, Lb/a/ct;-><init>()V

    iput-object v0, p2, Lb/a/aj;->a:Lb/a/ct;

    iget-object v0, p2, Lb/a/aj;->a:Lb/a/ct;

    invoke-virtual {v0, p1}, Lb/a/ct;->a(Lb/a/gn;)V

    invoke-static {}, Lb/a/aj;->b()V

    goto :goto_0

    :cond_0
    iget-byte v0, v0, Lb/a/gk;->b:B

    invoke-static {p1, v0}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lb/a/gn;->e()V

    invoke-virtual {p2}, Lb/a/aj;->c()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
