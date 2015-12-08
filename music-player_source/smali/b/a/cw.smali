.class final Lb/a/cw;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/cw;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/ct;

    check-cast p1, Lb/a/gt;

    iget v0, p2, Lb/a/ct;->a:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget-wide v0, p2, Lb/a/ct;->b:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/ct;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    iput v0, p2, Lb/a/ct;->a:I

    invoke-virtual {p2}, Lb/a/ct;->b()V

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v0

    iput-wide v0, p2, Lb/a/ct;->b:J

    invoke-virtual {p2}, Lb/a/ct;->d()V

    return-void
.end method
