.class final Lkik/a/j/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/j/u;


# direct methods
.method constructor <init>(Lkik/a/j/u;)V
    .locals 0

    .prologue
    .line 367
    iput-object p1, p0, Lkik/a/j/w;->a:Lkik/a/j/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 370
    iget-object v0, p0, Lkik/a/j/w;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->c(Lkik/a/j/u;)V

    .line 371
    iget-object v0, p0, Lkik/a/j/w;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->d(Lkik/a/j/u;)V

    .line 372
    return-void
.end method
