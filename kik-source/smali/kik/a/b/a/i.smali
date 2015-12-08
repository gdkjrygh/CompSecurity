.class final Lkik/a/b/a/i;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;)V
    .locals 0

    .prologue
    .line 2249
    iput-object p1, p0, Lkik/a/b/a/i;->a:Lkik/a/b/a/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 2249
    check-cast p2, Lkik/a/d/f;

    iget-object v0, p0, Lkik/a/b/a/i;->a:Lkik/a/b/a/a;

    invoke-static {v0, p2}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;Lkik/a/d/f;)V

    return-void
.end method
