.class final Lcom/b/a/c/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/b/a/c/aa;


# direct methods
.method constructor <init>(Lcom/b/a/c/aa;)V
    .locals 0

    .prologue
    .line 786
    iput-object p1, p0, Lcom/b/a/c/ae;->a:Lcom/b/a/c/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 789
    iget-object v0, p0, Lcom/b/a/c/ae;->a:Lcom/b/a/c/aa;

    iget-object v1, p0, Lcom/b/a/c/ae;->a:Lcom/b/a/c/aa;

    sget-object v2, Lcom/b/a/c/d;->a:Ljava/io/FilenameFilter;

    invoke-static {v1, v2}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/aa;Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/b/a/c/aa;->a([Ljava/io/File;)V

    .line 791
    return-void
.end method
