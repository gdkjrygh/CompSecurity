.class final Lb/a/fw;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/fw;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/ft;

    invoke-virtual {p2}, Lb/a/ft;->b()Lb/a/fr;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lb/a/ft;->c()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lb/a/go;

    const-string v1, "Cannot write a TUnion with no set value!"

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p2, Lb/a/ft;->c:Lb/a/fr;

    invoke-interface {v0}, Lb/a/fr;->a()S

    move-result v0

    invoke-virtual {p1, v0}, Lb/a/gn;->a(S)V

    invoke-virtual {p2, p1}, Lb/a/ft;->d(Lb/a/gn;)V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    const/4 v0, 0x0

    check-cast p2, Lb/a/ft;

    iput-object v0, p2, Lb/a/ft;->c:Lb/a/fr;

    iput-object v0, p2, Lb/a/ft;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Lb/a/gn;->l()S

    move-result v0

    invoke-virtual {p2, p1, v0}, Lb/a/ft;->a(Lb/a/gn;S)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p2, Lb/a/ft;->b:Ljava/lang/Object;

    iget-object v1, p2, Lb/a/ft;->b:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lb/a/ft;->a(S)Lb/a/fr;

    move-result-object v0

    iput-object v0, p2, Lb/a/ft;->c:Lb/a/fr;

    :cond_0
    return-void
.end method
