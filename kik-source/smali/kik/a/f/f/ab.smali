.class final Lkik/a/f/f/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/f/f/z;


# direct methods
.method constructor <init>(Lkik/a/f/f/z;)V
    .locals 0

    .prologue
    .line 205
    iput-object p1, p0, Lkik/a/f/f/ab;->a:Lkik/a/f/f/z;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 205
    iget-object v0, p0, Lkik/a/f/f/ab;->a:Lkik/a/f/f/z;

    iget-object v0, v0, Lkik/a/f/f/z;->h:Lkik/a/f/j;

    iget-object v1, p0, Lkik/a/f/f/ab;->a:Lkik/a/f/f/z;

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Lkik/a/f/j;->a(Lkik/a/f/f/z;I)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 215
    iget-object v0, p0, Lkik/a/f/f/ab;->a:Lkik/a/f/f/z;

    iget-object v0, v0, Lkik/a/f/f/z;->h:Lkik/a/f/j;

    iget-object v1, p0, Lkik/a/f/f/ab;->a:Lkik/a/f/f/z;

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lkik/a/f/j;->a(Lkik/a/f/f/z;I)V

    .line 216
    return-void
.end method
