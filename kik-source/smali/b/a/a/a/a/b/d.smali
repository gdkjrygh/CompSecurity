.class final Lb/a/a/a/a/b/d;
.super Lb/a/a/a/a/b/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lb/a/a/a/a/b/b;

.field final synthetic b:Lb/a/a/a/a/b/c;


# direct methods
.method constructor <init>(Lb/a/a/a/a/b/c;Lb/a/a/a/a/b/b;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lb/a/a/a/a/b/d;->b:Lb/a/a/a/a/b/c;

    iput-object p2, p0, Lb/a/a/a/a/b/d;->a:Lb/a/a/a/a/b/b;

    invoke-direct {p0}, Lb/a/a/a/a/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lb/a/a/a/a/b/d;->b:Lb/a/a/a/a/b/c;

    invoke-static {v0}, Lb/a/a/a/a/b/c;->a(Lb/a/a/a/a/b/c;)Lb/a/a/a/a/b/b;

    move-result-object v0

    .line 71
    iget-object v1, p0, Lb/a/a/a/a/b/d;->a:Lb/a/a/a/a/b/b;

    invoke-virtual {v1, v0}, Lb/a/a/a/a/b/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 72
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 74
    iget-object v1, p0, Lb/a/a/a/a/b/d;->b:Lb/a/a/a/a/b/c;

    invoke-static {v1, v0}, Lb/a/a/a/a/b/c;->a(Lb/a/a/a/a/b/c;Lb/a/a/a/a/b/b;)V

    .line 76
    :cond_0
    return-void
.end method
