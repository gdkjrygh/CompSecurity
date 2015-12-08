.class final Lb/a/do;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/do;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/dl;

    check-cast p1, Lb/a/gt;

    iget-object v0, p2, Lb/a/dl;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gt;->a(Ljava/lang/String;)V

    iget-wide v0, p2, Lb/a/dl;->b:J

    invoke-virtual {p1, v0, v1}, Lb/a/gt;->a(J)V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 2

    check-cast p2, Lb/a/dl;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lb/a/dl;->a:Ljava/lang/String;

    invoke-static {}, Lb/a/dl;->a()V

    invoke-virtual {p1}, Lb/a/gt;->n()J

    move-result-wide v0

    iput-wide v0, p2, Lb/a/dl;->b:J

    invoke-virtual {p2}, Lb/a/dl;->c()V

    return-void
.end method
