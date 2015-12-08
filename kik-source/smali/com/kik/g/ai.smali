.class final Lcom/kik/g/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/g/af;


# direct methods
.method constructor <init>(Lcom/kik/g/af;)V
    .locals 0

    .prologue
    .line 773
    iput-object p1, p0, Lcom/kik/g/ai;->a:Lcom/kik/g/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 776
    iget-object v0, p0, Lcom/kik/g/ai;->a:Lcom/kik/g/af;

    iget-object v0, v0, Lcom/kik/g/af;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 777
    return-void
.end method
