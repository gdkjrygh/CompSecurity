.class final Lb/a/hn;
.super Lcom/b/a/s;


# instance fields
.field final synthetic a:Lb/a/hl;


# direct methods
.method constructor <init>(Lb/a/hl;)V
    .locals 0

    iput-object p1, p0, Lb/a/hn;->a:Lb/a/hl;

    invoke-direct {p0}, Lcom/b/a/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lb/a/hn;->a:Lb/a/hl;

    invoke-static {v0}, Lb/a/hl;->a(Lb/a/hl;)Lb/a/hr;

    move-result-object v0

    invoke-interface {v0}, Lb/a/hr;->b()V

    return-void
.end method
