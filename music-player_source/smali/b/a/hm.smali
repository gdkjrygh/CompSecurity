.class final Lb/a/hm;
.super Lcom/b/a/s;


# instance fields
.field final synthetic a:Lb/a/hs;

.field final synthetic b:Lb/a/hl;


# direct methods
.method constructor <init>(Lb/a/hl;Lb/a/hs;)V
    .locals 0

    iput-object p1, p0, Lb/a/hm;->b:Lb/a/hl;

    iput-object p2, p0, Lb/a/hm;->a:Lb/a/hs;

    invoke-direct {p0}, Lcom/b/a/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lb/a/hm;->b:Lb/a/hl;

    invoke-static {v0}, Lb/a/hl;->a(Lb/a/hl;)Lb/a/hr;

    move-result-object v0

    iget-object v1, p0, Lb/a/hm;->a:Lb/a/hs;

    invoke-interface {v0, v1}, Lb/a/hr;->a(Lb/a/hs;)V

    return-void
.end method
