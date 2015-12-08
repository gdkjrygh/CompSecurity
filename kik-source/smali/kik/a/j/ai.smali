.class final Lkik/a/j/ai;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/j/u$c;


# direct methods
.method constructor <init>(Lkik/a/j/u$c;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lkik/a/j/ai;->a:Lkik/a/j/u$c;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 281
    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lkik/a/j/ai;->a:Lkik/a/j/u$c;

    iget-object v0, v0, Lkik/a/j/u$c;->a:Lkik/a/j/u;

    iget-object v1, p0, Lkik/a/j/ai;->a:Lkik/a/j/u$c;

    invoke-static {v1}, Lkik/a/j/u$c;->a(Lkik/a/j/u$c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lkik/a/j/u;->a(Lkik/a/j/u;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
