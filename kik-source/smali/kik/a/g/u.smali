.class final Lkik/a/g/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 491
    iput-object p1, p0, Lkik/a/g/u;->b:Lkik/a/g/b;

    iput-object p2, p0, Lkik/a/g/u;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 491
    iget-object v0, p0, Lkik/a/g/u;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/f/n;

    invoke-virtual {v0}, Lkik/a/f/f/n;->g()Lkik/a/d/n;

    move-result-object v0

    return-object v0
.end method
