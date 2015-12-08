.class final Lb/a/dc;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/dc;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/cz;

    check-cast p1, Lb/a/gt;

    iget-wide v0, p2, Lb/a/cz;->a:D

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(D)V

    iget-wide v0, p2, Lb/a/cz;->b:D

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(D)V

    iget-wide v0, p2, Lb/a/cz;->c:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/cz;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->o()D

    move-result-wide v0

    iput-wide v0, p2, Lb/a/cz;->a:D

    invoke-virtual {p2}, Lb/a/cz;->b()V

    invoke-virtual {p1}, Lb/a/gt;->o()D

    move-result-wide v0

    iput-wide v0, p2, Lb/a/cz;->b:D

    invoke-virtual {p2}, Lb/a/cz;->d()V

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v0

    iput-wide v0, p2, Lb/a/cz;->c:J

    invoke-virtual {p2}, Lb/a/cz;->f()V

    return-void
.end method
