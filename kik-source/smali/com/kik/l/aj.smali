.class final Lcom/kik/l/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/y$a;


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lcom/kik/l/ae;


# direct methods
.method constructor <init>(Lcom/kik/l/ae;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 418
    iput-object p1, p0, Lcom/kik/l/aj;->b:Lcom/kik/l/ae;

    iput-object p2, p0, Lcom/kik/l/aj;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 418
    check-cast p1, Lcom/kik/l/o;

    iget-object v0, p0, Lcom/kik/l/aj;->a:Lkik/a/d/a/a;

    invoke-virtual {p1, v0}, Lcom/kik/l/o;->b(Lkik/a/d/a/a;)Lkik/a/d/a/a;

    return-void
.end method
