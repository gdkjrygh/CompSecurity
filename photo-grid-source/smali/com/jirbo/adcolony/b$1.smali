.class Lcom/jirbo/adcolony/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/b;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/b;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/jirbo/adcolony/b$1;->a:Lcom/jirbo/adcolony/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 35
    iget-object v0, p0, Lcom/jirbo/adcolony/b$1;->a:Lcom/jirbo/adcolony/b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/b;->e:Z

    .line 36
    iget-object v0, p0, Lcom/jirbo/adcolony/b$1;->a:Lcom/jirbo/adcolony/b;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/b;->f:Z

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/jirbo/adcolony/b$1;->a:Lcom/jirbo/adcolony/b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/b;->e()V

    .line 40
    :cond_0
    return-void
.end method
