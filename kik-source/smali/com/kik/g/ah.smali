.class final Lcom/kik/g/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lcom/kik/g/af;


# direct methods
.method constructor <init>(Lcom/kik/g/af;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 762
    iput-object p1, p0, Lcom/kik/g/ah;->b:Lcom/kik/g/af;

    iput-object p2, p0, Lcom/kik/g/ah;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 765
    iget-object v0, p0, Lcom/kik/g/ah;->b:Lcom/kik/g/af;

    iget-object v0, v0, Lcom/kik/g/af;->b:Lcom/kik/g/p;

    iget-object v1, p0, Lcom/kik/g/ah;->a:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 766
    return-void
.end method
