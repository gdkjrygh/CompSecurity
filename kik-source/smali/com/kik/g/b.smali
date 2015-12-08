.class final Lcom/kik/g/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/kik/g/a;


# direct methods
.method constructor <init>(Lcom/kik/g/a;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/kik/g/b;->b:Lcom/kik/g/a;

    iput-object p2, p0, Lcom/kik/g/b;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 31
    iget-object v0, p0, Lcom/kik/g/b;->b:Lcom/kik/g/a;

    iget-object v1, p0, Lcom/kik/g/b;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/kik/g/a;->a(Lcom/kik/g/a;Ljava/lang/Object;)V

    .line 32
    return-void
.end method
