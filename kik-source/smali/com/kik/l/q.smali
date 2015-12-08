.class final Lcom/kik/l/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lcom/kik/l/p;


# direct methods
.method constructor <init>(Lcom/kik/l/p;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/kik/l/q;->b:Lcom/kik/l/p;

    iput-object p2, p0, Lcom/kik/l/q;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Lcom/kik/l/q;->b:Lcom/kik/l/p;

    invoke-static {v0}, Lcom/kik/l/p;->a(Lcom/kik/l/p;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 100
    iget-object v0, p0, Lcom/kik/l/q;->a:Lcom/kik/g/p;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 101
    return-void
.end method
