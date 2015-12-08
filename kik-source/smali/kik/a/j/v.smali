.class final Lkik/a/j/v;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/j/u;


# direct methods
.method constructor <init>(Lkik/a/j/u;)V
    .locals 0

    .prologue
    .line 300
    iput-object p1, p0, Lkik/a/j/v;->a:Lkik/a/j/u;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 300
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/j/v;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->c(Lkik/a/j/u;)V

    :cond_0
    return-void
.end method
