.class Lcom/facebook/orca/chatheads/bp;
.super Lcom/facebook/n/b;
.source "ChatHeadWindowManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;

.field final synthetic b:Lcom/facebook/orca/chatheads/bo;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/bo;Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 1948
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bp;->b:Lcom/facebook/orca/chatheads/bo;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/bp;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/n/c;)V
    .locals 1

    .prologue
    .line 1951
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bp;->b:Lcom/facebook/orca/chatheads/bo;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/bo;->a(Lcom/facebook/orca/chatheads/bo;)V

    .line 1952
    return-void
.end method
