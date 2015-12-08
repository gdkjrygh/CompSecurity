.class final Lb/a/eq;
.super Lb/a/gx;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/gx;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lb/a/eq;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lb/a/gn;Lb/a/fm;)V
    .locals 1

    check-cast p2, Lb/a/en;

    check-cast p1, Lb/a/gt;

    iget v0, p2, Lb/a/en;->a:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    iget v0, p2, Lb/a/en;->b:I

    invoke-virtual {p1, v0}, Lb/a/gt;->a(I)V

    return-void
.end method

.method public final synthetic b(Lb/a/gn;Lb/a/fm;)V
    .locals 1

    check-cast p2, Lb/a/en;

    check-cast p1, Lb/a/gt;

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    iput v0, p2, Lb/a/en;->a:I

    invoke-virtual {p2}, Lb/a/en;->b()V

    invoke-virtual {p1}, Lb/a/gt;->m()I

    move-result v0

    iput v0, p2, Lb/a/en;->b:I

    invoke-virtual {p2}, Lb/a/en;->d()V

    return-void
.end method
