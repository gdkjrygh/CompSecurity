.class final Lkik/a/j/ad;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/f/q;

.field final synthetic b:Lkik/a/j/ac;


# direct methods
.method constructor <init>(Lkik/a/j/ac;Lkik/a/f/q;)V
    .locals 0

    .prologue
    .line 714
    iput-object p1, p0, Lkik/a/j/ad;->b:Lkik/a/j/ac;

    iput-object p2, p0, Lkik/a/j/ad;->a:Lkik/a/f/q;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 718
    iget-object v0, p0, Lkik/a/j/ad;->b:Lkik/a/j/ac;

    iget-object v0, v0, Lkik/a/j/ac;->a:Lkik/a/j/ab;

    iget-object v0, v0, Lkik/a/j/ab;->c:Lcom/kik/g/p;

    iget-object v1, p0, Lkik/a/j/ad;->a:Lkik/a/f/q;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 719
    return-void
.end method
