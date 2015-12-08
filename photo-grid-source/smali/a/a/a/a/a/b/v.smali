.class final La/a/a/a/a/b/v;
.super La/a/a/a/a/b/k;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:La/a/a/a/a/b/u;


# direct methods
.method constructor <init>(La/a/a/a/a/b/u;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, La/a/a/a/a/b/v;->b:La/a/a/a/a/b/u;

    iput-object p2, p0, La/a/a/a/a/b/v;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, La/a/a/a/a/b/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, La/a/a/a/a/b/v;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 76
    return-void
.end method
