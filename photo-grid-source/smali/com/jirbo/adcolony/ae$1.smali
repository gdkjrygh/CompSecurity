.class Lcom/jirbo/adcolony/ae$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/ae;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ae;)V
    .locals 0

    .prologue
    .line 568
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$1;->a:Lcom/jirbo/adcolony/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 571
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$1;->a:Lcom/jirbo/adcolony/ae;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/ae;->C:Z

    .line 572
    return-void
.end method
