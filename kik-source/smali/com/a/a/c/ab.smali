.class final Lcom/a/a/c/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/a/a/c/x;


# direct methods
.method constructor <init>(Lcom/a/a/c/x;)V
    .locals 0

    .prologue
    .line 720
    iput-object p1, p0, Lcom/a/a/c/ab;->a:Lcom/a/a/c/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 723
    iget-object v0, p0, Lcom/a/a/c/ab;->a:Lcom/a/a/c/x;

    iget-object v1, p0, Lcom/a/a/c/ab;->a:Lcom/a/a/c/x;

    sget-object v2, Lcom/a/a/c/d;->a:Ljava/io/FilenameFilter;

    invoke-static {v1, v2}, Lcom/a/a/c/x;->a(Lcom/a/a/c/x;Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/a/a/c/x;->a([Ljava/io/File;)V

    .line 725
    return-void
.end method
