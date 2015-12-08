.class final Lb/a/a/a/a/b/r;
.super Lb/a/a/a/a/b/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lb/a/a/a/a/b/q;


# direct methods
.method constructor <init>(Lb/a/a/a/a/b/q;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lb/a/a/a/a/b/r;->b:Lb/a/a/a/a/b/q;

    iput-object p2, p0, Lb/a/a/a/a/b/r;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Lb/a/a/a/a/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lb/a/a/a/a/b/r;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 76
    return-void
.end method
